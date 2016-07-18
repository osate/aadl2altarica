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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ALPHA", "RULE_DIGIT", "RULE_REGULAR_ID", "RULE_STRING_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'{'", "','", "'}'", "'class'", "'transition'", "'assertion'", "'end'", "'('", "')'", "';'", "'='", "'event'", "'parameter'", "'observer'", "':'", "'&'", "'|'", "'->'", "'skip'", "':='", "'if'", "'then'", "'else'", "'switch'", "'or'", "'and'", "'=='", "'!='", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'not'", "'true'", "'false'", "'.'", "'Integer'", "'Boolean'"
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

                if ( (LA1_0==15||LA1_0==19) ) {
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

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==19) ) {
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


    // $ANTLR start "entryRuleDomain"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:147:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:148:2: (iv_ruleDomain= ruleDomain EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:149:2: iv_ruleDomain= ruleDomain EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainRule()); 
            }
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain285);
            iv_ruleDomain=ruleDomain();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomain; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain295); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:156:1: ruleDomain returns [EObject current=null] : ( () otherlv_1= 'domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_constants_4_0= ruleSymbolicConstant ) ) (otherlv_5= ',' ( (lv_constants_6_0= ruleSymbolicConstant ) ) )* )? otherlv_7= '}' ) ;
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
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:159:28: ( ( () otherlv_1= 'domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_constants_4_0= ruleSymbolicConstant ) ) (otherlv_5= ',' ( (lv_constants_6_0= ruleSymbolicConstant ) ) )* )? otherlv_7= '}' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:160:1: ( () otherlv_1= 'domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_constants_4_0= ruleSymbolicConstant ) ) (otherlv_5= ',' ( (lv_constants_6_0= ruleSymbolicConstant ) ) )* )? otherlv_7= '}' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:160:1: ( () otherlv_1= 'domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_constants_4_0= ruleSymbolicConstant ) ) (otherlv_5= ',' ( (lv_constants_6_0= ruleSymbolicConstant ) ) )* )? otherlv_7= '}' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:160:2: () otherlv_1= 'domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_constants_4_0= ruleSymbolicConstant ) ) (otherlv_5= ',' ( (lv_constants_6_0= ruleSymbolicConstant ) ) )* )? otherlv_7= '}'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:160:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:161:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDomainAccess().getDomainAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleDomain341); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getDomainKeyword_1());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:170:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:171:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:171:1: (lv_name_2_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:172:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomain358); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleDomain375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDomainAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:192:1: ( ( (lv_constants_4_0= ruleSymbolicConstant ) ) (otherlv_5= ',' ( (lv_constants_6_0= ruleSymbolicConstant ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:192:2: ( (lv_constants_4_0= ruleSymbolicConstant ) ) (otherlv_5= ',' ( (lv_constants_6_0= ruleSymbolicConstant ) ) )*
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:192:2: ( (lv_constants_4_0= ruleSymbolicConstant ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:193:1: (lv_constants_4_0= ruleSymbolicConstant )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:193:1: (lv_constants_4_0= ruleSymbolicConstant )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:194:3: lv_constants_4_0= ruleSymbolicConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDomainAccess().getConstantsSymbolicConstantParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSymbolicConstant_in_ruleDomain397);
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
                              		"SymbolicConstant");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:210:2: (otherlv_5= ',' ( (lv_constants_6_0= ruleSymbolicConstant ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:210:4: otherlv_5= ',' ( (lv_constants_6_0= ruleSymbolicConstant ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleDomain410); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getDomainAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:214:1: ( (lv_constants_6_0= ruleSymbolicConstant ) )
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:215:1: (lv_constants_6_0= ruleSymbolicConstant )
                    	    {
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:215:1: (lv_constants_6_0= ruleSymbolicConstant )
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:216:3: lv_constants_6_0= ruleSymbolicConstant
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDomainAccess().getConstantsSymbolicConstantParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSymbolicConstant_in_ruleDomain431);
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
                    	              		"SymbolicConstant");
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

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleDomain447); if (state.failed) return current;
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:244:1: entryRuleSymbolicConstant returns [EObject current=null] : iv_ruleSymbolicConstant= ruleSymbolicConstant EOF ;
    public final EObject entryRuleSymbolicConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolicConstant = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:245:2: (iv_ruleSymbolicConstant= ruleSymbolicConstant EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:246:2: iv_ruleSymbolicConstant= ruleSymbolicConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSymbolicConstantRule()); 
            }
            pushFollow(FOLLOW_ruleSymbolicConstant_in_entryRuleSymbolicConstant483);
            iv_ruleSymbolicConstant=ruleSymbolicConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSymbolicConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSymbolicConstant493); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:253:1: ruleSymbolicConstant returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSymbolicConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:256:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:257:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:257:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:257:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:257:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:258:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSymbolicConstantAccess().getSymbolicConstantAction_0(),
                          current);
                  
            }

            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:263:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:264:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:264:1: (lv_name_1_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:265:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSymbolicConstant544); if (state.failed) return current;
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:289:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:290:2: (iv_ruleType= ruleType EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:291:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType585);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType595); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:298:1: ruleType returns [EObject current=null] : ( ( ( ruleBaseType )=>this_BaseType_0= ruleBaseType ) | this_NamedType_1= ruleNamedType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_BaseType_0 = null;

        EObject this_NamedType_1 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:301:28: ( ( ( ( ruleBaseType )=>this_BaseType_0= ruleBaseType ) | this_NamedType_1= ruleNamedType ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:302:1: ( ( ( ruleBaseType )=>this_BaseType_0= ruleBaseType ) | this_NamedType_1= ruleNamedType )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:302:1: ( ( ( ruleBaseType )=>this_BaseType_0= ruleBaseType ) | this_NamedType_1= ruleNamedType )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==56) && (synpred1_InternalAltarica())) {
                alt5=1;
            }
            else if ( (LA5_0==57) && (synpred1_InternalAltarica())) {
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
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:302:2: ( ( ruleBaseType )=>this_BaseType_0= ruleBaseType )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:302:2: ( ( ruleBaseType )=>this_BaseType_0= ruleBaseType )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:302:3: ( ruleBaseType )=>this_BaseType_0= ruleBaseType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getBaseTypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBaseType_in_ruleType648);
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
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:313:5: this_NamedType_1= ruleNamedType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getNamedTypeParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNamedType_in_ruleType676);
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:329:1: entryRuleBaseType returns [EObject current=null] : iv_ruleBaseType= ruleBaseType EOF ;
    public final EObject entryRuleBaseType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseType = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:330:2: (iv_ruleBaseType= ruleBaseType EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:331:2: iv_ruleBaseType= ruleBaseType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBaseTypeRule()); 
            }
            pushFollow(FOLLOW_ruleBaseType_in_entryRuleBaseType711);
            iv_ruleBaseType=ruleBaseType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBaseType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseType721); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:338:1: ruleBaseType returns [EObject current=null] : ( (lv_name_0_0= ruleBaseTypeEnum ) ) ;
    public final EObject ruleBaseType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:341:28: ( ( (lv_name_0_0= ruleBaseTypeEnum ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:342:1: ( (lv_name_0_0= ruleBaseTypeEnum ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:342:1: ( (lv_name_0_0= ruleBaseTypeEnum ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:343:1: (lv_name_0_0= ruleBaseTypeEnum )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:343:1: (lv_name_0_0= ruleBaseTypeEnum )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:344:3: lv_name_0_0= ruleBaseTypeEnum
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBaseTypeAccess().getNameBaseTypeEnumEnumRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBaseTypeEnum_in_ruleBaseType766);
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:368:1: entryRuleNamedType returns [EObject current=null] : iv_ruleNamedType= ruleNamedType EOF ;
    public final EObject entryRuleNamedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedType = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:369:2: (iv_ruleNamedType= ruleNamedType EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:370:2: iv_ruleNamedType= ruleNamedType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamedTypeRule()); 
            }
            pushFollow(FOLLOW_ruleNamedType_in_entryRuleNamedType801);
            iv_ruleNamedType=ruleNamedType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamedType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedType811); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:377:1: ruleNamedType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleNamedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:380:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:381:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:381:1: ( (otherlv_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:382:1: (otherlv_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:382:1: (otherlv_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:383:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNamedTypeRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedType855); if (state.failed) return current;
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:402:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:403:2: (iv_ruleClass= ruleClass EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:404:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass890);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass900); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:411:1: ruleClass returns [EObject current=null] : ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* (otherlv_4= 'transition' ( (lv_transitions_5_0= ruleLabeledTransition ) )+ )? (otherlv_6= 'assertion' ( (lv_assertions_7_0= ruleInstruction ) )+ )? otherlv_8= 'end' ) ;
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
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:414:28: ( ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* (otherlv_4= 'transition' ( (lv_transitions_5_0= ruleLabeledTransition ) )+ )? (otherlv_6= 'assertion' ( (lv_assertions_7_0= ruleInstruction ) )+ )? otherlv_8= 'end' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:415:1: ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* (otherlv_4= 'transition' ( (lv_transitions_5_0= ruleLabeledTransition ) )+ )? (otherlv_6= 'assertion' ( (lv_assertions_7_0= ruleInstruction ) )+ )? otherlv_8= 'end' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:415:1: ( () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* (otherlv_4= 'transition' ( (lv_transitions_5_0= ruleLabeledTransition ) )+ )? (otherlv_6= 'assertion' ( (lv_assertions_7_0= ruleInstruction ) )+ )? otherlv_8= 'end' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:415:2: () otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) ( (lv_declarations_3_0= ruleDeclaration ) )* (otherlv_4= 'transition' ( (lv_transitions_5_0= ruleLabeledTransition ) )+ )? (otherlv_6= 'assertion' ( (lv_assertions_7_0= ruleInstruction ) )+ )? otherlv_8= 'end'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:415:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:416:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getClassAccess().getNodeAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleClass946); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:425:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:426:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:426:1: (lv_name_2_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:427:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass963); if (state.failed) return current;
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

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:443:2: ( (lv_declarations_3_0= ruleDeclaration ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=27 && LA6_0<=29)||(LA6_0>=56 && LA6_0<=57)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:444:1: (lv_declarations_3_0= ruleDeclaration )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:444:1: (lv_declarations_3_0= ruleDeclaration )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:445:3: lv_declarations_3_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassAccess().getDeclarationsDeclarationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleClass989);
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
            	    break loop6;
                }
            } while (true);

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:461:3: (otherlv_4= 'transition' ( (lv_transitions_5_0= ruleLabeledTransition ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:461:5: otherlv_4= 'transition' ( (lv_transitions_5_0= ruleLabeledTransition ) )+
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleClass1003); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getTransitionKeyword_4_0());
                          
                    }
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:465:1: ( (lv_transitions_5_0= ruleLabeledTransition ) )+
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
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:466:1: (lv_transitions_5_0= ruleLabeledTransition )
                    	    {
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:466:1: (lv_transitions_5_0= ruleLabeledTransition )
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:467:3: lv_transitions_5_0= ruleLabeledTransition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassAccess().getTransitionsLabeledTransitionParserRuleCall_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleLabeledTransition_in_ruleClass1024);
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

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:483:5: (otherlv_6= 'assertion' ( (lv_assertions_7_0= ruleInstruction ) )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:483:7: otherlv_6= 'assertion' ( (lv_assertions_7_0= ruleInstruction ) )+
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleClass1040); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getAssertionKeyword_5_0());
                          
                    }
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:487:1: ( (lv_assertions_7_0= ruleInstruction ) )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID||LA9_0==16||LA9_0==34||LA9_0==36||LA9_0==39) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:488:1: (lv_assertions_7_0= ruleInstruction )
                    	    {
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:488:1: (lv_assertions_7_0= ruleInstruction )
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:489:3: lv_assertions_7_0= ruleInstruction
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassAccess().getAssertionsInstructionParserRuleCall_5_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleInstruction_in_ruleClass1061);
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

            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleClass1076); if (state.failed) return current;
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:517:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:518:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:519:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration1112);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration1122); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:526:1: ruleDeclaration returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_EventDeclaration_1= ruleEventDeclaration | this_ParameterDeclaration_2= ruleParameterDeclaration | this_ObserverDeclaration_3= ruleObserverDeclaration ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject this_EventDeclaration_1 = null;

        EObject this_ParameterDeclaration_2 = null;

        EObject this_ObserverDeclaration_3 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:529:28: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_EventDeclaration_1= ruleEventDeclaration | this_ParameterDeclaration_2= ruleParameterDeclaration | this_ObserverDeclaration_3= ruleObserverDeclaration ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:530:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_EventDeclaration_1= ruleEventDeclaration | this_ParameterDeclaration_2= ruleParameterDeclaration | this_ObserverDeclaration_3= ruleObserverDeclaration )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:530:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_EventDeclaration_1= ruleEventDeclaration | this_ParameterDeclaration_2= ruleParameterDeclaration | this_ObserverDeclaration_3= ruleObserverDeclaration )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 56:
            case 57:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case 28:
                {
                alt11=3;
                }
                break;
            case 29:
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
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:531:5: this_VariableDeclaration_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleDeclaration1169);
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
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:541:5: this_EventDeclaration_1= ruleEventDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getEventDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEventDeclaration_in_ruleDeclaration1196);
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
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:551:5: this_ParameterDeclaration_2= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getParameterDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleDeclaration1223);
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
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:561:5: this_ObserverDeclaration_3= ruleObserverDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDeclarationAccess().getObserverDeclarationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObserverDeclaration_in_ruleDeclaration1250);
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:577:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:578:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:579:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1285);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration1295); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:586:1: ruleVariableDeclaration returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' ) ;
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
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:589:28: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:590:1: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:590:1: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:590:2: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:590:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:591:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVariableDeclarationAccess().getVariableAction_0(),
                          current);
                  
            }

            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:596:2: ( (lv_type_1_0= ruleType ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:597:1: (lv_type_1_0= ruleType )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:597:1: (lv_type_1_0= ruleType )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:598:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVariableDeclaration1350);
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

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:614:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:615:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:615:1: (lv_name_2_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:616:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration1367); if (state.failed) return current;
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

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:632:2: (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:632:4: otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleVariableDeclaration1385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:636:1: ( (lv_attributes_4_0= ruleAttribute ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:637:1: (lv_attributes_4_0= ruleAttribute )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:637:1: (lv_attributes_4_0= ruleAttribute )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:638:3: lv_attributes_4_0= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_ruleVariableDeclaration1406);
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

                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:654:2: (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==17) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:654:4: otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleVariableDeclaration1419); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getVariableDeclarationAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:658:1: ( (lv_attributes_6_0= ruleAttribute ) )
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:659:1: (lv_attributes_6_0= ruleAttribute )
                    	    {
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:659:1: (lv_attributes_6_0= ruleAttribute )
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:660:3: lv_attributes_6_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getAttributesAttributeParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleVariableDeclaration1440);
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
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleVariableDeclaration1454); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getVariableDeclarationAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleVariableDeclaration1468); if (state.failed) return current;
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:692:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:693:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:694:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1504);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1514); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:701:1: ruleAttribute returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:704:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:705:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:705:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:705:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpression ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:705:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:706:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAttributeAccess().getAttributeAction_0(),
                          current);
                  
            }

            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:711:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:712:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:712:1: (lv_name_1_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:713:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1565); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleAttribute1582); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getEqualsSignKeyword_2());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:733:1: ( (lv_value_3_0= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:734:1: (lv_value_3_0= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:734:1: (lv_value_3_0= ruleExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:735:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAttribute1603);
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:759:1: entryRuleEventDeclaration returns [EObject current=null] : iv_ruleEventDeclaration= ruleEventDeclaration EOF ;
    public final EObject entryRuleEventDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDeclaration = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:760:2: (iv_ruleEventDeclaration= ruleEventDeclaration EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:761:2: iv_ruleEventDeclaration= ruleEventDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleEventDeclaration_in_entryRuleEventDeclaration1639);
            iv_ruleEventDeclaration=ruleEventDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDeclaration1649); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:768:1: ruleEventDeclaration returns [EObject current=null] : ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' ) ;
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
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:771:28: ( ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:772:1: ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:772:1: ( () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:772:2: () otherlv_1= 'event' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )? otherlv_8= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:772:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:773:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventDeclarationAccess().getEventAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleEventDeclaration1695); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEventDeclarationAccess().getEventKeyword_1());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:782:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:783:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:783:1: (lv_name_2_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:784:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventDeclaration1712); if (state.failed) return current;
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

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:800:2: (otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:800:4: otherlv_3= '(' ( (lv_attributes_4_0= ruleAttribute ) ) (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleEventDeclaration1730); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEventDeclarationAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:804:1: ( (lv_attributes_4_0= ruleAttribute ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:805:1: (lv_attributes_4_0= ruleAttribute )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:805:1: (lv_attributes_4_0= ruleAttribute )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:806:3: lv_attributes_4_0= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventDeclarationAccess().getAttributesAttributeParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_ruleEventDeclaration1751);
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

                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:822:2: (otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==17) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:822:4: otherlv_5= ',' ( (lv_attributes_6_0= ruleAttribute ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleEventDeclaration1764); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getEventDeclarationAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:826:1: ( (lv_attributes_6_0= ruleAttribute ) )
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:827:1: (lv_attributes_6_0= ruleAttribute )
                    	    {
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:827:1: (lv_attributes_6_0= ruleAttribute )
                    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:828:3: lv_attributes_6_0= ruleAttribute
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getEventDeclarationAccess().getAttributesAttributeParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAttribute_in_ruleEventDeclaration1785);
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
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleEventDeclaration1799); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEventDeclarationAccess().getRightParenthesisKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleEventDeclaration1813); if (state.failed) return current;
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:860:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:861:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:862:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1849);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration1859); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:869:1: ruleParameterDeclaration returns [EObject current=null] : ( () otherlv_1= 'parameter' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' ) ;
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
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:872:28: ( ( () otherlv_1= 'parameter' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:873:1: ( () otherlv_1= 'parameter' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:873:1: ( () otherlv_1= 'parameter' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:873:2: () otherlv_1= 'parameter' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:873:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:874:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParameterDeclarationAccess().getParameterAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleParameterDeclaration1905); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterDeclarationAccess().getParameterKeyword_1());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:883:1: ( (lv_type_2_0= ruleType ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:884:1: (lv_type_2_0= ruleType )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:884:1: (lv_type_2_0= ruleType )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:885:3: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleParameterDeclaration1926);
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

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:901:2: ( (lv_name_3_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:902:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:902:1: (lv_name_3_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:903:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterDeclaration1943); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleParameterDeclaration1960); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getParameterDeclarationAccess().getEqualsSignKeyword_4());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:923:1: ( (lv_value_5_0= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:924:1: (lv_value_5_0= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:924:1: (lv_value_5_0= ruleExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:925:3: lv_value_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterDeclarationAccess().getValueExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParameterDeclaration1981);
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

            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleParameterDeclaration1993); if (state.failed) return current;
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:953:1: entryRuleObserverDeclaration returns [EObject current=null] : iv_ruleObserverDeclaration= ruleObserverDeclaration EOF ;
    public final EObject entryRuleObserverDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObserverDeclaration = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:954:2: (iv_ruleObserverDeclaration= ruleObserverDeclaration EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:955:2: iv_ruleObserverDeclaration= ruleObserverDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObserverDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleObserverDeclaration_in_entryRuleObserverDeclaration2029);
            iv_ruleObserverDeclaration=ruleObserverDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObserverDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObserverDeclaration2039); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:962:1: ruleObserverDeclaration returns [EObject current=null] : ( () otherlv_1= 'observer' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' ) ;
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
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:965:28: ( ( () otherlv_1= 'observer' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:966:1: ( () otherlv_1= 'observer' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:966:1: ( () otherlv_1= 'observer' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:966:2: () otherlv_1= 'observer' ( (lv_type_2_0= ruleType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleExpression ) ) otherlv_6= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:966:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:967:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getObserverDeclarationAccess().getObserverAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleObserverDeclaration2085); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getObserverDeclarationAccess().getObserverKeyword_1());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:976:1: ( (lv_type_2_0= ruleType ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:977:1: (lv_type_2_0= ruleType )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:977:1: (lv_type_2_0= ruleType )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:978:3: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObserverDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleObserverDeclaration2106);
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

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:994:2: ( (lv_name_3_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:995:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:995:1: (lv_name_3_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:996:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObserverDeclaration2123); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleObserverDeclaration2140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getObserverDeclarationAccess().getEqualsSignKeyword_4());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1016:1: ( (lv_value_5_0= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1017:1: (lv_value_5_0= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1017:1: (lv_value_5_0= ruleExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1018:3: lv_value_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObserverDeclarationAccess().getValueExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleObserverDeclaration2161);
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

            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleObserverDeclaration2173); if (state.failed) return current;
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1046:1: entryRuleLabeledTransition returns [EObject current=null] : iv_ruleLabeledTransition= ruleLabeledTransition EOF ;
    public final EObject entryRuleLabeledTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabeledTransition = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1047:2: (iv_ruleLabeledTransition= ruleLabeledTransition EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1048:2: iv_ruleLabeledTransition= ruleLabeledTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLabeledTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleLabeledTransition_in_entryRuleLabeledTransition2209);
            iv_ruleLabeledTransition=ruleLabeledTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLabeledTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabeledTransition2219); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1055:1: ruleLabeledTransition returns [EObject current=null] : ( ( (lv_event_0_0= ruleNameRef ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleTransitionAnd ) ) ) ;
    public final EObject ruleLabeledTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_event_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1058:28: ( ( ( (lv_event_0_0= ruleNameRef ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleTransitionAnd ) ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1059:1: ( ( (lv_event_0_0= ruleNameRef ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleTransitionAnd ) ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1059:1: ( ( (lv_event_0_0= ruleNameRef ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleTransitionAnd ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1059:2: ( (lv_event_0_0= ruleNameRef ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleTransitionAnd ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1059:2: ( (lv_event_0_0= ruleNameRef ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1060:1: (lv_event_0_0= ruleNameRef )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1060:1: (lv_event_0_0= ruleNameRef )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1061:3: lv_event_0_0= ruleNameRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLabeledTransitionAccess().getEventNameRefParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNameRef_in_ruleLabeledTransition2265);
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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleLabeledTransition2277); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLabeledTransitionAccess().getColonKeyword_1());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1081:1: ( (lv_expression_2_0= ruleTransitionAnd ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1082:1: (lv_expression_2_0= ruleTransitionAnd )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1082:1: (lv_expression_2_0= ruleTransitionAnd )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1083:3: lv_expression_2_0= ruleTransitionAnd
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLabeledTransitionAccess().getExpressionTransitionAndParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTransitionAnd_in_ruleLabeledTransition2298);
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1107:1: entryRuleTransitionAnd returns [EObject current=null] : iv_ruleTransitionAnd= ruleTransitionAnd EOF ;
    public final EObject entryRuleTransitionAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionAnd = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1108:2: (iv_ruleTransitionAnd= ruleTransitionAnd EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1109:2: iv_ruleTransitionAnd= ruleTransitionAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionAndRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionAnd_in_entryRuleTransitionAnd2334);
            iv_ruleTransitionAnd=ruleTransitionAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionAnd2344); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1116:1: ruleTransitionAnd returns [EObject current=null] : (this_TransitionOr_0= ruleTransitionOr ( () otherlv_2= '&' ( (lv_right_3_0= ruleTransitionOr ) ) )* ) ;
    public final EObject ruleTransitionAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_TransitionOr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1119:28: ( (this_TransitionOr_0= ruleTransitionOr ( () otherlv_2= '&' ( (lv_right_3_0= ruleTransitionOr ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1120:1: (this_TransitionOr_0= ruleTransitionOr ( () otherlv_2= '&' ( (lv_right_3_0= ruleTransitionOr ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1120:1: (this_TransitionOr_0= ruleTransitionOr ( () otherlv_2= '&' ( (lv_right_3_0= ruleTransitionOr ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1121:5: this_TransitionOr_0= ruleTransitionOr ( () otherlv_2= '&' ( (lv_right_3_0= ruleTransitionOr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTransitionAndAccess().getTransitionOrParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTransitionOr_in_ruleTransitionAnd2391);
            this_TransitionOr_0=ruleTransitionOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_TransitionOr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1129:1: ( () otherlv_2= '&' ( (lv_right_3_0= ruleTransitionOr ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1129:2: () otherlv_2= '&' ( (lv_right_3_0= ruleTransitionOr ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1129:2: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1130:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getTransitionAndAccess().getTransitionAndLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleTransitionAnd2412); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTransitionAndAccess().getAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1139:1: ( (lv_right_3_0= ruleTransitionOr ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1140:1: (lv_right_3_0= ruleTransitionOr )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1140:1: (lv_right_3_0= ruleTransitionOr )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1141:3: lv_right_3_0= ruleTransitionOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTransitionAndAccess().getRightTransitionOrParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransitionOr_in_ruleTransitionAnd2433);
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1165:1: entryRuleTransitionOr returns [EObject current=null] : iv_ruleTransitionOr= ruleTransitionOr EOF ;
    public final EObject entryRuleTransitionOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionOr = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1166:2: (iv_ruleTransitionOr= ruleTransitionOr EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1167:2: iv_ruleTransitionOr= ruleTransitionOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionOrRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionOr_in_entryRuleTransitionOr2471);
            iv_ruleTransitionOr=ruleTransitionOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionOr2481); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1174:1: ruleTransitionOr returns [EObject current=null] : (this_Transition_0= ruleTransition ( () otherlv_2= '|' ( (lv_right_3_0= ruleTransition ) ) )* ) ;
    public final EObject ruleTransitionOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Transition_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1177:28: ( (this_Transition_0= ruleTransition ( () otherlv_2= '|' ( (lv_right_3_0= ruleTransition ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1178:1: (this_Transition_0= ruleTransition ( () otherlv_2= '|' ( (lv_right_3_0= ruleTransition ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1178:1: (this_Transition_0= ruleTransition ( () otherlv_2= '|' ( (lv_right_3_0= ruleTransition ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1179:5: this_Transition_0= ruleTransition ( () otherlv_2= '|' ( (lv_right_3_0= ruleTransition ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getTransitionOrAccess().getTransitionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleTransition_in_ruleTransitionOr2528);
            this_Transition_0=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Transition_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1187:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleTransition ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1187:2: () otherlv_2= '|' ( (lv_right_3_0= ruleTransition ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1187:2: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1188:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getTransitionOrAccess().getTransitionOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleTransitionOr2549); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTransitionOrAccess().getVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1197:1: ( (lv_right_3_0= ruleTransition ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1198:1: (lv_right_3_0= ruleTransition )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1198:1: (lv_right_3_0= ruleTransition )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1199:3: lv_right_3_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTransitionOrAccess().getRightTransitionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleTransitionOr2570);
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
            	              		"Transition");
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1223:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1224:2: (iv_ruleTransition= ruleTransition EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1225:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition2608);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition2618); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1232:1: ruleTransition returns [EObject current=null] : ( () ( (lv_guard_1_0= ruleExpression ) ) otherlv_2= '->' ( (lv_action_3_0= ruleInstruction ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_guard_1_0 = null;

        EObject lv_action_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1235:28: ( ( () ( (lv_guard_1_0= ruleExpression ) ) otherlv_2= '->' ( (lv_action_3_0= ruleInstruction ) ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1236:1: ( () ( (lv_guard_1_0= ruleExpression ) ) otherlv_2= '->' ( (lv_action_3_0= ruleInstruction ) ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1236:1: ( () ( (lv_guard_1_0= ruleExpression ) ) otherlv_2= '->' ( (lv_action_3_0= ruleInstruction ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1236:2: () ( (lv_guard_1_0= ruleExpression ) ) otherlv_2= '->' ( (lv_action_3_0= ruleInstruction ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1236:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1237:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTransitionAccess().getTransitionAction_0(),
                          current);
                  
            }

            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1242:2: ( (lv_guard_1_0= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1243:1: (lv_guard_1_0= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1243:1: (lv_guard_1_0= ruleExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1244:3: lv_guard_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleTransition2673);
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
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleTransition2685); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1264:1: ( (lv_action_3_0= ruleInstruction ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1265:1: (lv_action_3_0= ruleInstruction )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1265:1: (lv_action_3_0= ruleInstruction )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1266:3: lv_action_3_0= ruleInstruction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionAccess().getActionInstructionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInstruction_in_ruleTransition2706);
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
                      		"Instruction");
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1290:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1291:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1292:2: iv_ruleInstruction= ruleInstruction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstructionRule()); 
            }
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction2742);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstruction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction2752); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1299:1: ruleInstruction returns [EObject current=null] : (this_Skip_0= ruleSkip | this_Assignment_1= ruleAssignment | this_Block_2= ruleBlock | this_Conditional_3= ruleConditional | this_Switch_4= ruleSwitch ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Skip_0 = null;

        EObject this_Assignment_1 = null;

        EObject this_Block_2 = null;

        EObject this_Conditional_3 = null;

        EObject this_Switch_4 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1302:28: ( (this_Skip_0= ruleSkip | this_Assignment_1= ruleAssignment | this_Block_2= ruleBlock | this_Conditional_3= ruleConditional | this_Switch_4= ruleSwitch ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1303:1: (this_Skip_0= ruleSkip | this_Assignment_1= ruleAssignment | this_Block_2= ruleBlock | this_Conditional_3= ruleConditional | this_Switch_4= ruleSwitch )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1303:1: (this_Skip_0= ruleSkip | this_Assignment_1= ruleAssignment | this_Block_2= ruleBlock | this_Conditional_3= ruleConditional | this_Switch_4= ruleSwitch )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt18=1;
                }
                break;
            case RULE_ID:
                {
                alt18=2;
                }
                break;
            case 16:
                {
                alt18=3;
                }
                break;
            case 36:
                {
                alt18=4;
                }
                break;
            case 39:
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
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1304:5: this_Skip_0= ruleSkip
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getSkipParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSkip_in_ruleInstruction2799);
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
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1314:5: this_Assignment_1= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getAssignmentParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleInstruction2826);
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
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1324:5: this_Block_2= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getBlockParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleInstruction2853);
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
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1334:5: this_Conditional_3= ruleConditional
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getConditionalParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConditional_in_ruleInstruction2880);
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
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1344:5: this_Switch_4= ruleSwitch
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInstructionAccess().getSwitchParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSwitch_in_ruleInstruction2907);
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1360:1: entryRuleSkip returns [EObject current=null] : iv_ruleSkip= ruleSkip EOF ;
    public final EObject entryRuleSkip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkip = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1361:2: (iv_ruleSkip= ruleSkip EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1362:2: iv_ruleSkip= ruleSkip EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSkipRule()); 
            }
            pushFollow(FOLLOW_ruleSkip_in_entryRuleSkip2942);
            iv_ruleSkip=ruleSkip();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSkip; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSkip2952); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1369:1: ruleSkip returns [EObject current=null] : ( () otherlv_1= 'skip' otherlv_2= ';' ) ;
    public final EObject ruleSkip() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1372:28: ( ( () otherlv_1= 'skip' otherlv_2= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1373:1: ( () otherlv_1= 'skip' otherlv_2= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1373:1: ( () otherlv_1= 'skip' otherlv_2= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1373:2: () otherlv_1= 'skip' otherlv_2= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1373:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1374:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSkipAccess().getSkipAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleSkip2998); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSkipAccess().getSkipKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleSkip3010); if (state.failed) return current;
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1395:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1396:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1397:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment3046);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment3056); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1404:1: ruleAssignment returns [EObject current=null] : ( () ( (lv_variable_1_0= ruleNameRef ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_variable_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1407:28: ( ( () ( (lv_variable_1_0= ruleNameRef ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1408:1: ( () ( (lv_variable_1_0= ruleNameRef ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1408:1: ( () ( (lv_variable_1_0= ruleNameRef ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1408:2: () ( (lv_variable_1_0= ruleNameRef ) ) otherlv_2= ':=' ( (lv_value_3_0= ruleExpression ) ) otherlv_4= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1408:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1409:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAssignmentAccess().getAssignmentAction_0(),
                          current);
                  
            }

            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1414:2: ( (lv_variable_1_0= ruleNameRef ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1415:1: (lv_variable_1_0= ruleNameRef )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1415:1: (lv_variable_1_0= ruleNameRef )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1416:3: lv_variable_1_0= ruleNameRef
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getVariableNameRefParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNameRef_in_ruleAssignment3111);
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

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleAssignment3123); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_2());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1436:1: ( (lv_value_3_0= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1437:1: (lv_value_3_0= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1437:1: (lv_value_3_0= ruleExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1438:3: lv_value_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment3144);
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleAssignment3156); if (state.failed) return current;
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1466:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1467:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1468:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock3192);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock3202); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1475:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )+ otherlv_3= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_instructions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1478:28: ( ( () otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )+ otherlv_3= '}' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1479:1: ( () otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )+ otherlv_3= '}' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1479:1: ( () otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )+ otherlv_3= '}' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1479:2: () otherlv_1= '{' ( (lv_instructions_2_0= ruleInstruction ) )+ otherlv_3= '}'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1479:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1480:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBlockAccess().getBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleBlock3248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1489:1: ( (lv_instructions_2_0= ruleInstruction ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID||LA19_0==16||LA19_0==34||LA19_0==36||LA19_0==39) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1490:1: (lv_instructions_2_0= ruleInstruction )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1490:1: (lv_instructions_2_0= ruleInstruction )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1491:3: lv_instructions_2_0= ruleInstruction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockAccess().getInstructionsInstructionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleBlock3269);
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
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleBlock3282); if (state.failed) return current;
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1519:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1520:2: (iv_ruleConditional= ruleConditional EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1521:2: iv_ruleConditional= ruleConditional EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionalRule()); 
            }
            pushFollow(FOLLOW_ruleConditional_in_entryRuleConditional3318);
            iv_ruleConditional=ruleConditional();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditional; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditional3328); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1528:1: ruleConditional returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleInstruction ) ) )? otherlv_7= ';' ) ;
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
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1531:28: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleInstruction ) ) )? otherlv_7= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1532:1: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleInstruction ) ) )? otherlv_7= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1532:1: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleInstruction ) ) )? otherlv_7= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1532:2: () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleInstruction ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleInstruction ) ) )? otherlv_7= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1532:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1533:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getConditionalAccess().getConditionalAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleConditional3374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getConditionalAccess().getIfKeyword_1());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1542:1: ( (lv_condition_2_0= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1543:1: (lv_condition_2_0= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1543:1: (lv_condition_2_0= ruleExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1544:3: lv_condition_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalAccess().getConditionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleConditional3395);
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
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_37_in_ruleConditional3407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getConditionalAccess().getThenKeyword_3());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1564:1: ( (lv_then_4_0= ruleInstruction ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1565:1: (lv_then_4_0= ruleInstruction )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1565:1: (lv_then_4_0= ruleInstruction )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1566:3: lv_then_4_0= ruleInstruction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionalAccess().getThenInstructionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInstruction_in_ruleConditional3428);
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
                      		"Instruction");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1582:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleInstruction ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) && (synpred2_InternalAltarica())) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1582:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleInstruction ) )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1582:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1582:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_38_in_ruleConditional3449); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getConditionalAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1587:2: ( (lv_else_6_0= ruleInstruction ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1588:1: (lv_else_6_0= ruleInstruction )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1588:1: (lv_else_6_0= ruleInstruction )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1589:3: lv_else_6_0= ruleInstruction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionalAccess().getElseInstructionParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInstruction_in_ruleConditional3471);
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
                              		"Instruction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleConditional3485); if (state.failed) return current;
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1617:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1618:2: (iv_ruleSwitch= ruleSwitch EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1619:2: iv_ruleSwitch= ruleSwitch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchRule()); 
            }
            pushFollow(FOLLOW_ruleSwitch_in_entryRuleSwitch3521);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitch; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch3531); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1626:1: ruleSwitch returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCaseExpression ) )* otherlv_3= 'else' otherlv_4= ':' ( (lv_else_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
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
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1629:28: ( (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCaseExpression ) )* otherlv_3= 'else' otherlv_4= ':' ( (lv_else_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1630:1: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCaseExpression ) )* otherlv_3= 'else' otherlv_4= ':' ( (lv_else_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1630:1: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCaseExpression ) )* otherlv_3= 'else' otherlv_4= ':' ( (lv_else_5_0= ruleExpression ) ) otherlv_6= '}' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1630:3: otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCaseExpression ) )* otherlv_3= 'else' otherlv_4= ':' ( (lv_else_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleSwitch3568); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchAccess().getSwitchKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleSwitch3580); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1638:1: ( (lv_cases_2_0= ruleCaseExpression ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_INT)||LA21_0==23||LA21_0==39||LA21_0==49||(LA21_0>=52 && LA21_0<=54)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1639:1: (lv_cases_2_0= ruleCaseExpression )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1639:1: (lv_cases_2_0= ruleCaseExpression )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1640:3: lv_cases_2_0= ruleCaseExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchAccess().getCasesCaseExpressionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCaseExpression_in_ruleSwitch3601);
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
            	              		"CaseExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleSwitch3614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitchAccess().getElseKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleSwitch3626); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSwitchAccess().getColonKeyword_4());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1664:1: ( (lv_else_5_0= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1665:1: (lv_else_5_0= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1665:1: (lv_else_5_0= ruleExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1666:3: lv_else_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchAccess().getElseExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleSwitch3647);
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
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleSwitch3659); if (state.failed) return current;
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1694:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1695:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1696:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression3695);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression3705); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1703:1: ruleExpression returns [EObject current=null] : this_LogicalOr_0= ruleLogicalOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOr_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1706:28: (this_LogicalOr_0= ruleLogicalOr )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1708:5: this_LogicalOr_0= ruleLogicalOr
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getLogicalOrParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOr_in_ruleExpression3751);
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1724:1: entryRuleLogicalOr returns [EObject current=null] : iv_ruleLogicalOr= ruleLogicalOr EOF ;
    public final EObject entryRuleLogicalOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOr = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1725:2: (iv_ruleLogicalOr= ruleLogicalOr EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1726:2: iv_ruleLogicalOr= ruleLogicalOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOr_in_entryRuleLogicalOr3785);
            iv_ruleLogicalOr=ruleLogicalOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOr3795); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1733:1: ruleLogicalOr returns [EObject current=null] : (this_LogicalAnd_0= ruleLogicalAnd ( ( ( () ( ( 'or' ) ) ( ( ruleLogicalAnd ) ) ) )=> ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) ) )* ) ;
    public final EObject ruleLogicalOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_LogicalAnd_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1736:28: ( (this_LogicalAnd_0= ruleLogicalAnd ( ( ( () ( ( 'or' ) ) ( ( ruleLogicalAnd ) ) ) )=> ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1737:1: (this_LogicalAnd_0= ruleLogicalAnd ( ( ( () ( ( 'or' ) ) ( ( ruleLogicalAnd ) ) ) )=> ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1737:1: (this_LogicalAnd_0= ruleLogicalAnd ( ( ( () ( ( 'or' ) ) ( ( ruleLogicalAnd ) ) ) )=> ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1738:5: this_LogicalAnd_0= ruleLogicalAnd ( ( ( () ( ( 'or' ) ) ( ( ruleLogicalAnd ) ) ) )=> ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalOrAccess().getLogicalAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalAnd_in_ruleLogicalOr3842);
            this_LogicalAnd_0=ruleLogicalAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalAnd_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1746:1: ( ( ( () ( ( 'or' ) ) ( ( ruleLogicalAnd ) ) ) )=> ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==40) && (synpred3_InternalAltarica())) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1746:2: ( ( () ( ( 'or' ) ) ( ( ruleLogicalAnd ) ) ) )=> ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1757:6: ( () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleLogicalAnd ) ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1757:7: () ( (lv_op_2_0= 'or' ) ) ( (lv_right_3_0= ruleLogicalAnd ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1757:7: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1758:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalOrAccess().getLogicalOrLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1763:2: ( (lv_op_2_0= 'or' ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1764:1: (lv_op_2_0= 'or' )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1764:1: (lv_op_2_0= 'or' )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1765:3: lv_op_2_0= 'or'
            	    {
            	    lv_op_2_0=(Token)match(input,40,FOLLOW_40_in_ruleLogicalOr3901); if (state.failed) return current;
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

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1778:2: ( (lv_right_3_0= ruleLogicalAnd ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1779:1: (lv_right_3_0= ruleLogicalAnd )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1779:1: (lv_right_3_0= ruleLogicalAnd )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1780:3: lv_right_3_0= ruleLogicalAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalOrAccess().getRightLogicalAndParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLogicalAnd_in_ruleLogicalOr3935);
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
            	              		"LogicalAnd");
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1804:1: entryRuleLogicalAnd returns [EObject current=null] : iv_ruleLogicalAnd= ruleLogicalAnd EOF ;
    public final EObject entryRuleLogicalAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAnd = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1805:2: (iv_ruleLogicalAnd= ruleLogicalAnd EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1806:2: iv_ruleLogicalAnd= ruleLogicalAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalAnd_in_entryRuleLogicalAnd3974);
            iv_ruleLogicalAnd=ruleLogicalAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalAnd3984); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1813:1: ruleLogicalAnd returns [EObject current=null] : (this_Relation_0= ruleRelation ( ( ( () ( ( 'and' ) ) ( ( ruleRelation ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelation ) ) ) )* ) ;
    public final EObject ruleLogicalAnd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Relation_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1816:28: ( (this_Relation_0= ruleRelation ( ( ( () ( ( 'and' ) ) ( ( ruleRelation ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelation ) ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1817:1: (this_Relation_0= ruleRelation ( ( ( () ( ( 'and' ) ) ( ( ruleRelation ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelation ) ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1817:1: (this_Relation_0= ruleRelation ( ( ( () ( ( 'and' ) ) ( ( ruleRelation ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelation ) ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1818:5: this_Relation_0= ruleRelation ( ( ( () ( ( 'and' ) ) ( ( ruleRelation ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelation ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicalAndAccess().getRelationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRelation_in_ruleLogicalAnd4031);
            this_Relation_0=ruleRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Relation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1826:1: ( ( ( () ( ( 'and' ) ) ( ( ruleRelation ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelation ) ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==41) && (synpred4_InternalAltarica())) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1826:2: ( ( () ( ( 'and' ) ) ( ( ruleRelation ) ) ) )=> ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelation ) ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1837:6: ( () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelation ) ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1837:7: () ( (lv_op_2_0= 'and' ) ) ( (lv_right_3_0= ruleRelation ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1837:7: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1838:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicalAndAccess().getLogicalAndLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1843:2: ( (lv_op_2_0= 'and' ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1844:1: (lv_op_2_0= 'and' )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1844:1: (lv_op_2_0= 'and' )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1845:3: lv_op_2_0= 'and'
            	    {
            	    lv_op_2_0=(Token)match(input,41,FOLLOW_41_in_ruleLogicalAnd4090); if (state.failed) return current;
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

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1858:2: ( (lv_right_3_0= ruleRelation ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1859:1: (lv_right_3_0= ruleRelation )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1859:1: (lv_right_3_0= ruleRelation )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1860:3: lv_right_3_0= ruleRelation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalAndAccess().getRightRelationParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelation_in_ruleLogicalAnd4124);
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
            	              		"Relation");
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1884:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1885:2: (iv_ruleRelation= ruleRelation EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1886:2: iv_ruleRelation= ruleRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationRule()); 
            }
            pushFollow(FOLLOW_ruleRelation_in_entryRuleRelation4163);
            iv_ruleRelation=ruleRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelation4173); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1893:1: ruleRelation returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( ( () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )=> ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) ) )* ) ;
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
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1896:28: ( (this_Addition_0= ruleAddition ( ( ( () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )=> ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1897:1: (this_Addition_0= ruleAddition ( ( ( () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )=> ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1897:1: (this_Addition_0= ruleAddition ( ( ( () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )=> ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1898:5: this_Addition_0= ruleAddition ( ( ( () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )=> ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationAccess().getAdditionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAddition_in_ruleRelation4220);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Addition_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1906:1: ( ( ( () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )=> ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==42) && (synpred5_InternalAltarica())) {
                    alt25=1;
                }
                else if ( (LA25_0==43) && (synpred5_InternalAltarica())) {
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


                switch (alt25) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1906:2: ( ( () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )=> ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1935:6: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1935:7: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) ) ( (lv_right_3_0= ruleAddition ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1935:7: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1936:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getRelationAccess().getEqualLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1941:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1942:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1942:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1943:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1943:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' | lv_op_2_3= '<' | lv_op_2_4= '<=' | lv_op_2_5= '>=' | lv_op_2_6= '>' )
            	    int alt24=6;
            	    switch ( input.LA(1) ) {
            	    case 42:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt24=4;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt24=5;
            	        }
            	        break;
            	    case 47:
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
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1944:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,42,FOLLOW_42_in_ruleRelation4356); if (state.failed) return current;
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
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1956:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,43,FOLLOW_43_in_ruleRelation4385); if (state.failed) return current;
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
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1968:8: lv_op_2_3= '<'
            	            {
            	            lv_op_2_3=(Token)match(input,44,FOLLOW_44_in_ruleRelation4414); if (state.failed) return current;
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
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1980:8: lv_op_2_4= '<='
            	            {
            	            lv_op_2_4=(Token)match(input,45,FOLLOW_45_in_ruleRelation4443); if (state.failed) return current;
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
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1992:8: lv_op_2_5= '>='
            	            {
            	            lv_op_2_5=(Token)match(input,46,FOLLOW_46_in_ruleRelation4472); if (state.failed) return current;
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
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2004:8: lv_op_2_6= '>'
            	            {
            	            lv_op_2_6=(Token)match(input,47,FOLLOW_47_in_ruleRelation4501); if (state.failed) return current;
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

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2019:2: ( (lv_right_3_0= ruleAddition ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2020:1: (lv_right_3_0= ruleAddition )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2020:1: (lv_right_3_0= ruleAddition )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2021:3: lv_right_3_0= ruleAddition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAddition_in_ruleRelation4538);
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2045:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2046:2: (iv_ruleAddition= ruleAddition EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2047:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition4577);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition4587); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2054:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2057:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2058:1: (this_Multiplication_0= ruleMultiplication ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2058:1: (this_Multiplication_0= ruleMultiplication ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2059:5: this_Multiplication_0= ruleMultiplication ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition4634);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Multiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2067:1: ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )*
            loop27:
            do {
                int alt27=2;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2067:2: ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2084:6: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2084:7: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2084:7: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2085:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2090:2: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2091:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2091:1: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2092:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2092:1: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==48) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==49) ) {
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
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2093:3: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,48,FOLLOW_48_in_ruleAddition4714); if (state.failed) return current;
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
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2105:8: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,49,FOLLOW_49_in_ruleAddition4743); if (state.failed) return current;
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

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2120:2: ( (lv_right_3_0= ruleMultiplication ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2121:1: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2121:1: (lv_right_3_0= ruleMultiplication )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2122:3: lv_right_3_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition4780);
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2146:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2147:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2148:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication4819);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication4829); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2155:1: ruleMultiplication returns [EObject current=null] : (this_Neg_0= ruleNeg ( ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Neg_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2158:28: ( (this_Neg_0= ruleNeg ( ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2159:1: (this_Neg_0= ruleNeg ( ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2159:1: (this_Neg_0= ruleNeg ( ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2160:5: this_Neg_0= ruleNeg ( ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationAccess().getNegParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNeg_in_ruleMultiplication4876);
            this_Neg_0=ruleNeg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Neg_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2168:1: ( ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==50) && (synpred7_InternalAltarica())) {
                    alt29=1;
                }
                else if ( (LA29_0==51) && (synpred7_InternalAltarica())) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2168:2: ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )=> ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2185:6: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2185:7: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleNeg ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2185:7: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2186:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2191:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2192:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2192:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2193:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2193:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==50) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==51) ) {
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
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2194:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,50,FOLLOW_50_in_ruleMultiplication4956); if (state.failed) return current;
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
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2206:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,51,FOLLOW_51_in_ruleMultiplication4985); if (state.failed) return current;
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

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2221:2: ( (lv_right_3_0= ruleNeg ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2222:1: (lv_right_3_0= ruleNeg )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2222:1: (lv_right_3_0= ruleNeg )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2223:3: lv_right_3_0= ruleNeg
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightNegParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNeg_in_ruleMultiplication5022);
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2247:1: entryRuleNeg returns [EObject current=null] : iv_ruleNeg= ruleNeg EOF ;
    public final EObject entryRuleNeg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeg = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2248:2: (iv_ruleNeg= ruleNeg EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2249:2: iv_ruleNeg= ruleNeg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegRule()); 
            }
            pushFollow(FOLLOW_ruleNeg_in_entryRuleNeg5061);
            iv_ruleNeg=ruleNeg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNeg; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNeg5071); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2256:1: ruleNeg returns [EObject current=null] : ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_expression_2_0= ruleAtom ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtom ) ) ) | this_Atom_6= ruleAtom ) ;
    public final EObject ruleNeg() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_5_0 = null;

        EObject this_Atom_6 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2259:28: ( ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_expression_2_0= ruleAtom ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtom ) ) ) | this_Atom_6= ruleAtom ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2260:1: ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_expression_2_0= ruleAtom ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtom ) ) ) | this_Atom_6= ruleAtom )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2260:1: ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_expression_2_0= ruleAtom ) ) ) | ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtom ) ) ) | this_Atom_6= ruleAtom )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt30=1;
                }
                break;
            case 49:
                {
                alt30=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 23:
            case 39:
            case 53:
            case 54:
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
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2260:2: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_expression_2_0= ruleAtom ) ) )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2260:2: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_expression_2_0= ruleAtom ) ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2260:3: () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_expression_2_0= ruleAtom ) )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2260:3: ()
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2261:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNegAccess().getNotAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2266:2: ( ( 'not' )=>otherlv_1= 'not' )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2266:3: ( 'not' )=>otherlv_1= 'not'
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleNeg5126); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNegAccess().getNotKeyword_0_1());
                          
                    }

                    }

                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2271:2: ( (lv_expression_2_0= ruleAtom ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2272:1: (lv_expression_2_0= ruleAtom )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2272:1: (lv_expression_2_0= ruleAtom )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2273:3: lv_expression_2_0= ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegAccess().getExpressionAtomParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAtom_in_ruleNeg5148);
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
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2290:6: ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtom ) ) )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2290:6: ( () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtom ) ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2290:7: () ( ( '-' )=>otherlv_4= '-' ) ( (lv_expression_5_0= ruleAtom ) )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2290:7: ()
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2291:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getNegAccess().getMinusAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2296:2: ( ( '-' )=>otherlv_4= '-' )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2296:3: ( '-' )=>otherlv_4= '-'
                    {
                    otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleNeg5185); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getNegAccess().getHyphenMinusKeyword_1_1());
                          
                    }

                    }

                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2301:2: ( (lv_expression_5_0= ruleAtom ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2302:1: (lv_expression_5_0= ruleAtom )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2302:1: (lv_expression_5_0= ruleAtom )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2303:3: lv_expression_5_0= ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNegAccess().getExpressionAtomParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAtom_in_ruleNeg5207);
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
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2321:5: this_Atom_6= ruleAtom
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegAccess().getAtomParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtom_in_ruleNeg5236);
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2337:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2338:2: (iv_ruleAtom= ruleAtom EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2339:2: iv_ruleAtom= ruleAtom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom5271);
            iv_ruleAtom=ruleAtom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtom; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom5281); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2346:1: ruleAtom returns [EObject current=null] : (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral | this_NameRef_3= ruleNameRef | this_SwitchExpression_4= ruleSwitchExpression | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_BooleanLiteral_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_IntegerLiteral_2 = null;

        EObject this_NameRef_3 = null;

        EObject this_SwitchExpression_4 = null;

        EObject this_Expression_6 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2349:28: ( (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral | this_NameRef_3= ruleNameRef | this_SwitchExpression_4= ruleSwitchExpression | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2350:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral | this_NameRef_3= ruleNameRef | this_SwitchExpression_4= ruleSwitchExpression | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2350:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral | this_NameRef_3= ruleNameRef | this_SwitchExpression_4= ruleSwitchExpression | (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' ) )
            int alt31=6;
            switch ( input.LA(1) ) {
            case 53:
            case 54:
                {
                alt31=1;
                }
                break;
            case RULE_STRING:
                {
                alt31=2;
                }
                break;
            case RULE_INT:
                {
                alt31=3;
                }
                break;
            case RULE_ID:
                {
                alt31=4;
                }
                break;
            case 39:
                {
                alt31=5;
                }
                break;
            case 23:
                {
                alt31=6;
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
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2351:5: this_BooleanLiteral_0= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getBooleanLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleAtom5328);
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
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2361:5: this_StringLiteral_1= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getStringLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleAtom5355);
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
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2371:5: this_IntegerLiteral_2= ruleIntegerLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getIntegerLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleAtom5382);
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
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2381:5: this_NameRef_3= ruleNameRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getNameRefParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNameRef_in_ruleAtom5409);
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
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2391:5: this_SwitchExpression_4= ruleSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getSwitchExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSwitchExpression_in_ruleAtom5436);
                    this_SwitchExpression_4=ruleSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SwitchExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2400:6: (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2400:6: (otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')' )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2400:8: otherlv_5= '(' this_Expression_6= ruleExpression otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleAtom5454); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_5_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomAccess().getExpressionParserRuleCall_5_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAtom5476);
                    this_Expression_6=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleAtom5487); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getAtomAccess().getRightParenthesisKeyword_5_2());
                          
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2425:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2426:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2427:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral5524);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral5534); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2434:1: ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2437:28: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2438:1: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2438:1: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2439:1: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2439:1: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2440:1: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2440:1: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==53) ) {
                alt32=1;
            }
            else if ( (LA32_0==54) ) {
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
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2441:3: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,53,FOLLOW_53_in_ruleBooleanLiteral5578); if (state.failed) return current;
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
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2453:8: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,54,FOLLOW_54_in_ruleBooleanLiteral5607); if (state.failed) return current;
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2476:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2477:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2478:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral5658);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral5668); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2485:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2488:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2489:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2489:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2490:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2490:1: (lv_value_0_0= RULE_STRING )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2491:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral5709); if (state.failed) return current;
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2515:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2516:2: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2517:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral5749);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral5759); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2524:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2527:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2528:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2528:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2529:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2529:1: (lv_value_0_0= RULE_INT )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2530:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral5800); if (state.failed) return current;
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2554:1: entryRuleNameRef returns [EObject current=null] : iv_ruleNameRef= ruleNameRef EOF ;
    public final EObject entryRuleNameRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameRef = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2555:2: (iv_ruleNameRef= ruleNameRef EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2556:2: iv_ruleNameRef= ruleNameRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameRefRule()); 
            }
            pushFollow(FOLLOW_ruleNameRef_in_entryRuleNameRef5840);
            iv_ruleNameRef=ruleNameRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameRef5850); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2563:1: ruleNameRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) ;
    public final EObject ruleNameRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2566:28: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2567:1: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2567:1: ( ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2567:2: ( (otherlv_0= RULE_ID ) ) ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2567:2: ( (otherlv_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2568:1: (otherlv_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2568:1: (otherlv_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2569:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getNameRefRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameRef5895); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getNameRefAccess().getVariableNamedElementCrossReference_0_0()); 
              	
            }

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2580:2: ( ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==55) && (synpred10_InternalAltarica())) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2580:3: ( ( () '.' ( ( RULE_ID ) ) ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2587:6: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2587:7: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2587:7: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2588:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNameRefAccess().getNameRefNestedAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleNameRef5941); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getNameRefAccess().getFullStopKeyword_1_0_1());
            	          
            	    }
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2597:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2598:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2598:1: (otherlv_3= RULE_ID )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2599:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getNameRefRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNameRef5961); if (state.failed) return current;
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2618:1: entryRuleSwitchExpression returns [EObject current=null] : iv_ruleSwitchExpression= ruleSwitchExpression EOF ;
    public final EObject entryRuleSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchExpression = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2619:2: (iv_ruleSwitchExpression= ruleSwitchExpression EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2620:2: iv_ruleSwitchExpression= ruleSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSwitchExpression_in_entryRuleSwitchExpression6000);
            iv_ruleSwitchExpression=ruleSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchExpression6010); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2627:1: ruleSwitchExpression returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCaseExpression ) )* otherlv_3= 'else' otherlv_4= ':' ( (lv_default_5_0= ruleExpression ) ) otherlv_6= '}' ) ;
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
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2630:28: ( (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCaseExpression ) )* otherlv_3= 'else' otherlv_4= ':' ( (lv_default_5_0= ruleExpression ) ) otherlv_6= '}' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2631:1: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCaseExpression ) )* otherlv_3= 'else' otherlv_4= ':' ( (lv_default_5_0= ruleExpression ) ) otherlv_6= '}' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2631:1: (otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCaseExpression ) )* otherlv_3= 'else' otherlv_4= ':' ( (lv_default_5_0= ruleExpression ) ) otherlv_6= '}' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2631:3: otherlv_0= 'switch' otherlv_1= '{' ( (lv_cases_2_0= ruleCaseExpression ) )* otherlv_3= 'else' otherlv_4= ':' ( (lv_default_5_0= ruleExpression ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleSwitchExpression6047); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchExpressionAccess().getSwitchKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleSwitchExpression6059); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2639:1: ( (lv_cases_2_0= ruleCaseExpression ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_INT)||LA34_0==23||LA34_0==39||LA34_0==49||(LA34_0>=52 && LA34_0<=54)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2640:1: (lv_cases_2_0= ruleCaseExpression )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2640:1: (lv_cases_2_0= ruleCaseExpression )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2641:3: lv_cases_2_0= ruleCaseExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchExpressionAccess().getCasesCaseExpressionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCaseExpression_in_ruleSwitchExpression6080);
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
            	              		"CaseExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleSwitchExpression6093); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitchExpressionAccess().getElseKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleSwitchExpression6105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSwitchExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2665:1: ( (lv_default_5_0= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2666:1: (lv_default_5_0= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2666:1: (lv_default_5_0= ruleExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2667:3: lv_default_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchExpressionAccess().getDefaultExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleSwitchExpression6126);
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
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleSwitchExpression6138); if (state.failed) return current;
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2695:1: entryRuleCaseExpression returns [EObject current=null] : iv_ruleCaseExpression= ruleCaseExpression EOF ;
    public final EObject entryRuleCaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseExpression = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2696:2: (iv_ruleCaseExpression= ruleCaseExpression EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2697:2: iv_ruleCaseExpression= ruleCaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression6174);
            iv_ruleCaseExpression=ruleCaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCaseExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCaseExpression6184); if (state.failed) return current;

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2704:1: ruleCaseExpression returns [EObject current=null] : ( ( (lv_condition_0_0= ruleLogicalOr ) ) otherlv_1= ':' ( (lv_case_2_0= ruleExpression ) ) ) ;
    public final EObject ruleCaseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_condition_0_0 = null;

        EObject lv_case_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2707:28: ( ( ( (lv_condition_0_0= ruleLogicalOr ) ) otherlv_1= ':' ( (lv_case_2_0= ruleExpression ) ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2708:1: ( ( (lv_condition_0_0= ruleLogicalOr ) ) otherlv_1= ':' ( (lv_case_2_0= ruleExpression ) ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2708:1: ( ( (lv_condition_0_0= ruleLogicalOr ) ) otherlv_1= ':' ( (lv_case_2_0= ruleExpression ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2708:2: ( (lv_condition_0_0= ruleLogicalOr ) ) otherlv_1= ':' ( (lv_case_2_0= ruleExpression ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2708:2: ( (lv_condition_0_0= ruleLogicalOr ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2709:1: (lv_condition_0_0= ruleLogicalOr )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2709:1: (lv_condition_0_0= ruleLogicalOr )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2710:3: lv_condition_0_0= ruleLogicalOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseExpressionAccess().getConditionLogicalOrParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLogicalOr_in_ruleCaseExpression6230);
            lv_condition_0_0=ruleLogicalOr();

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
                      		"LogicalOr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleCaseExpression6242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCaseExpressionAccess().getColonKeyword_1());
                  
            }
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2730:1: ( (lv_case_2_0= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2731:1: (lv_case_2_0= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2731:1: (lv_case_2_0= ruleExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2732:3: lv_case_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseExpressionAccess().getCaseExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCaseExpression6263);
            lv_case_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCaseExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"case",
                      		lv_case_2_0, 
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
    // $ANTLR end "ruleCaseExpression"


    // $ANTLR start "ruleBaseTypeEnum"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2756:1: ruleBaseTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Boolean' ) ) ;
    public final Enumerator ruleBaseTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2758:28: ( ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Boolean' ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2759:1: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Boolean' ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2759:1: ( (enumLiteral_0= 'Integer' ) | (enumLiteral_1= 'Boolean' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==56) ) {
                alt35=1;
            }
            else if ( (LA35_0==57) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2759:2: (enumLiteral_0= 'Integer' )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2759:2: (enumLiteral_0= 'Integer' )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2759:4: enumLiteral_0= 'Integer'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleBaseTypeEnum6313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getBaseTypeEnumAccess().getINTEGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getBaseTypeEnumAccess().getINTEGEREnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2765:6: (enumLiteral_1= 'Boolean' )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2765:6: (enumLiteral_1= 'Boolean' )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2765:8: enumLiteral_1= 'Boolean'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_57_in_ruleBaseTypeEnum6330); if (state.failed) return current;
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
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:302:3: ( ruleBaseType )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:302:5: ruleBaseType
        {
        pushFollow(FOLLOW_ruleBaseType_in_synpred1_InternalAltarica632);
        ruleBaseType();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalAltarica

    // $ANTLR start synpred2_InternalAltarica
    public final void synpred2_InternalAltarica_fragment() throws RecognitionException {   
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1582:4: ( 'else' )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1582:6: 'else'
        {
        match(input,38,FOLLOW_38_in_synpred2_InternalAltarica3441); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalAltarica

    // $ANTLR start synpred3_InternalAltarica
    public final void synpred3_InternalAltarica_fragment() throws RecognitionException {   
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1746:2: ( ( () ( ( 'or' ) ) ( ( ruleLogicalAnd ) ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1746:3: ( () ( ( 'or' ) ) ( ( ruleLogicalAnd ) ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1746:3: ( () ( ( 'or' ) ) ( ( ruleLogicalAnd ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1746:4: () ( ( 'or' ) ) ( ( ruleLogicalAnd ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1746:4: ()
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1747:1: 
        {
        }

        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1747:2: ( ( 'or' ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1748:1: ( 'or' )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1748:1: ( 'or' )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1749:2: 'or'
        {
        match(input,40,FOLLOW_40_in_synpred3_InternalAltarica3861); if (state.failed) return ;

        }


        }

        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1753:2: ( ( ruleLogicalAnd ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1754:1: ( ruleLogicalAnd )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1754:1: ( ruleLogicalAnd )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1755:1: ruleLogicalAnd
        {
        pushFollow(FOLLOW_ruleLogicalAnd_in_synpred3_InternalAltarica3874);
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
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1826:2: ( ( () ( ( 'and' ) ) ( ( ruleRelation ) ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1826:3: ( () ( ( 'and' ) ) ( ( ruleRelation ) ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1826:3: ( () ( ( 'and' ) ) ( ( ruleRelation ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1826:4: () ( ( 'and' ) ) ( ( ruleRelation ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1826:4: ()
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1827:1: 
        {
        }

        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1827:2: ( ( 'and' ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1828:1: ( 'and' )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1828:1: ( 'and' )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1829:2: 'and'
        {
        match(input,41,FOLLOW_41_in_synpred4_InternalAltarica4050); if (state.failed) return ;

        }


        }

        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1833:2: ( ( ruleRelation ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1834:1: ( ruleRelation )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1834:1: ( ruleRelation )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1835:1: ruleRelation
        {
        pushFollow(FOLLOW_ruleRelation_in_synpred4_InternalAltarica4063);
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
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1906:2: ( ( () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1906:3: ( () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1906:3: ( () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1906:4: () ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) ) ( ( ruleAddition ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1906:4: ()
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1907:1: 
        {
        }

        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1907:2: ( ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1908:1: ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1908:1: ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1909:1: ( '==' | '!=' | '<' | '<=' | '>=' | '>' )
        {
        if ( (input.LA(1)>=42 && input.LA(1)<=47) ) {
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

        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1931:2: ( ( ruleAddition ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1932:1: ( ruleAddition )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1932:1: ( ruleAddition )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1933:1: ruleAddition
        {
        pushFollow(FOLLOW_ruleAddition_in_synpred5_InternalAltarica4327);
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
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2067:2: ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2067:3: ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2067:3: ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2067:4: () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2067:4: ()
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2068:1: 
        {
        }

        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2068:2: ( ( ( '+' | '-' ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2069:1: ( ( '+' | '-' ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2069:1: ( ( '+' | '-' ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2070:1: ( '+' | '-' )
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

        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2080:2: ( ( ruleMultiplication ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2081:1: ( ruleMultiplication )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2081:1: ( ruleMultiplication )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2082:1: ruleMultiplication
        {
        pushFollow(FOLLOW_ruleMultiplication_in_synpred6_InternalAltarica4685);
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
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2168:2: ( ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2168:3: ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2168:3: ( () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2168:4: () ( ( ( '*' | '/' ) ) ) ( ( ruleNeg ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2168:4: ()
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2169:1: 
        {
        }

        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2169:2: ( ( ( '*' | '/' ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2170:1: ( ( '*' | '/' ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2170:1: ( ( '*' | '/' ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2171:1: ( '*' | '/' )
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

        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2181:2: ( ( ruleNeg ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2182:1: ( ruleNeg )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2182:1: ( ruleNeg )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2183:1: ruleNeg
        {
        pushFollow(FOLLOW_ruleNeg_in_synpred7_InternalAltarica4927);
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
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2580:3: ( ( () '.' ( ( RULE_ID ) ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2580:4: ( () '.' ( ( RULE_ID ) ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2580:4: ( () '.' ( ( RULE_ID ) ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2580:5: () '.' ( ( RULE_ID ) )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2580:5: ()
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2581:1: 
        {
        }

        match(input,55,FOLLOW_55_in_synpred10_InternalAltarica5911); if (state.failed) return ;
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2582:1: ( ( RULE_ID ) )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2583:1: ( RULE_ID )
        {
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2583:1: ( RULE_ID )
        // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2584:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred10_InternalAltarica5919); if (state.failed) return ;

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


    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA27_eotS =
        "\34\uffff";
    static final String DFA27_eofS =
        "\1\1\33\uffff";
    static final String DFA27_minS =
        "\1\4\21\uffff\1\0\11\uffff";
    static final String DFA27_maxS =
        "\1\66\21\uffff\1\0\11\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\2\31\uffff\1\1";
    static final String DFA27_specialS =
        "\1\0\21\uffff\1\1\11\uffff}>";
    static final String[] DFA27_transitionS = {
            "\3\1\12\uffff\2\1\4\uffff\3\1\4\uffff\1\1\2\uffff\1\1\3\uffff\13\1\1\33\1\22\2\uffff\3\1",
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

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "()* loopback of 2067:1: ( ( ( () ( ( ( '+' | '-' ) ) ) ( ( ruleMultiplication ) ) ) )=> ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_0 = input.LA(1);

                         
                        int index27_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_0==EOF||(LA27_0>=RULE_ID && LA27_0<=RULE_INT)||(LA27_0>=17 && LA27_0<=18)||(LA27_0>=23 && LA27_0<=25)||LA27_0==30||LA27_0==33||(LA27_0>=37 && LA27_0<=47)||(LA27_0>=52 && LA27_0<=54)) ) {s = 1;}

                        else if ( (LA27_0==49) ) {s = 18;}

                        else if ( (LA27_0==48) && (synpred6_InternalAltarica())) {s = 27;}

                         
                        input.seek(index27_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_18 = input.LA(1);

                         
                        int index27_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalAltarica()) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index27_18);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclaration_in_ruleModel130 = new BitSet(new long[]{0x0000000000088002L});
    public static final BitSet FOLLOW_ruleAbstractDeclaration_in_entryRuleAbstractDeclaration166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDeclaration176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_ruleAbstractDeclaration223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_ruleAbstractDeclaration250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDomain341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomain358 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDomain375 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleSymbolicConstant_in_ruleDomain397 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleDomain410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSymbolicConstant_in_ruleDomain431 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleDomain447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSymbolicConstant_in_entryRuleSymbolicConstant483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSymbolicConstant493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSymbolicConstant544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_ruleType648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedType_in_ruleType676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_entryRuleBaseType711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseType721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseTypeEnum_in_ruleBaseType766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedType_in_entryRuleNamedType801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedType811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedType855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleClass946 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass963 = new BitSet(new long[]{0x0300000038700010L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleClass989 = new BitSet(new long[]{0x0300000038700010L});
    public static final BitSet FOLLOW_20_in_ruleClass1003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLabeledTransition_in_ruleClass1024 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_21_in_ruleClass1040 = new BitSet(new long[]{0x0000009400010010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleClass1061 = new BitSet(new long[]{0x0000009400410010L});
    public static final BitSet FOLLOW_22_in_ruleClass1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration1112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleDeclaration1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDeclaration_in_ruleDeclaration1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleDeclaration1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObserverDeclaration_in_ruleDeclaration1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariableDeclaration1350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration1367 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_23_in_ruleVariableDeclaration1385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleVariableDeclaration1406 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_17_in_ruleVariableDeclaration1419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleVariableDeclaration1440 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_24_in_ruleVariableDeclaration1454 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleVariableDeclaration1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1565 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAttribute1582 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAttribute1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDeclaration_in_entryRuleEventDeclaration1639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDeclaration1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEventDeclaration1695 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventDeclaration1712 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_23_in_ruleEventDeclaration1730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEventDeclaration1751 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_17_in_ruleEventDeclaration1764 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEventDeclaration1785 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_24_in_ruleEventDeclaration1799 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEventDeclaration1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleParameterDeclaration1905 = new BitSet(new long[]{0x0300000000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameterDeclaration1926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterDeclaration1943 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleParameterDeclaration1960 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParameterDeclaration1981 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleParameterDeclaration1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObserverDeclaration_in_entryRuleObserverDeclaration2029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObserverDeclaration2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleObserverDeclaration2085 = new BitSet(new long[]{0x0300000000000010L});
    public static final BitSet FOLLOW_ruleType_in_ruleObserverDeclaration2106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObserverDeclaration2123 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleObserverDeclaration2140 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleObserverDeclaration2161 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleObserverDeclaration2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabeledTransition_in_entryRuleLabeledTransition2209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabeledTransition2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_ruleLabeledTransition2265 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleLabeledTransition2277 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleTransitionAnd_in_ruleLabeledTransition2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionAnd_in_entryRuleTransitionAnd2334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionAnd2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionOr_in_ruleTransitionAnd2391 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleTransitionAnd2412 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleTransitionOr_in_ruleTransitionAnd2433 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleTransitionOr_in_entryRuleTransitionOr2471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionOr2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleTransitionOr2528 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleTransitionOr2549 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleTransitionOr2570 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition2608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition2618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTransition2673 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleTransition2685 = new BitSet(new long[]{0x0000009400010010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleTransition2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction2742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_ruleInstruction2799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleInstruction2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleInstruction2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_ruleInstruction2880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_ruleInstruction2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSkip_in_entryRuleSkip2942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSkip2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSkip2998 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSkip3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment3046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_ruleAssignment3111 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleAssignment3123 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment3144 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAssignment3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock3192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBlock3248 = new BitSet(new long[]{0x0000009400010010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleBlock3269 = new BitSet(new long[]{0x0000009400050010L});
    public static final BitSet FOLLOW_18_in_ruleBlock3282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditional_in_entryRuleConditional3318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditional3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleConditional3374 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConditional3395 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleConditional3407 = new BitSet(new long[]{0x0000009400010010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleConditional3428 = new BitSet(new long[]{0x0000004002000000L});
    public static final BitSet FOLLOW_38_in_ruleConditional3449 = new BitSet(new long[]{0x0000009400010010L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleConditional3471 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleConditional3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_entryRuleSwitch3521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleSwitch3568 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSwitch3580 = new BitSet(new long[]{0x007200C000800070L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_ruleSwitch3601 = new BitSet(new long[]{0x007200C000800070L});
    public static final BitSet FOLLOW_38_in_ruleSwitch3614 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSwitch3626 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitch3647 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSwitch3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression3695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOr_in_ruleExpression3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOr_in_entryRuleLogicalOr3785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOr3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalAnd_in_ruleLogicalOr3842 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleLogicalOr3901 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleLogicalAnd_in_ruleLogicalOr3935 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ruleLogicalAnd_in_entryRuleLogicalAnd3974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAnd3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_ruleLogicalAnd4031 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleLogicalAnd4090 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleRelation_in_ruleLogicalAnd4124 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation4163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelation4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelation4220 = new BitSet(new long[]{0x0000FC0000000002L});
    public static final BitSet FOLLOW_42_in_ruleRelation4356 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_43_in_ruleRelation4385 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_44_in_ruleRelation4414 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_45_in_ruleRelation4443 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_46_in_ruleRelation4472 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_47_in_ruleRelation4501 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelation4538 = new BitSet(new long[]{0x0000FC0000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition4577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition4634 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_48_in_ruleAddition4714 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_49_in_ruleAddition4743 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition4780 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication4819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeg_in_ruleMultiplication4876 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_50_in_ruleMultiplication4956 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_51_in_ruleMultiplication4985 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleNeg_in_ruleMultiplication5022 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_ruleNeg_in_entryRuleNeg5061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNeg5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleNeg5126 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleNeg5148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleNeg5185 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleNeg5207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleNeg5236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom5271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom5281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleAtom5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleAtom5355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleAtom5382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_ruleAtom5409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchExpression_in_ruleAtom5436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAtom5454 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAtom5476 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAtom5487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral5524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBooleanLiteral5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleBooleanLiteral5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral5658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral5668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral5709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral5749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral5759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral5800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameRef_in_entryRuleNameRef5840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameRef5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameRef5895 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleNameRef5941 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNameRef5961 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleSwitchExpression_in_entryRuleSwitchExpression6000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchExpression6010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleSwitchExpression6047 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSwitchExpression6059 = new BitSet(new long[]{0x007200C000800070L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_ruleSwitchExpression6080 = new BitSet(new long[]{0x007200C000800070L});
    public static final BitSet FOLLOW_38_in_ruleSwitchExpression6093 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSwitchExpression6105 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitchExpression6126 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSwitchExpression6138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression6174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCaseExpression6184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOr_in_ruleCaseExpression6230 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCaseExpression6242 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCaseExpression6263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBaseTypeEnum6313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBaseTypeEnum6330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseType_in_synpred1_InternalAltarica632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred2_InternalAltarica3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred3_InternalAltarica3861 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleLogicalAnd_in_synpred3_InternalAltarica3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_synpred4_InternalAltarica4050 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleRelation_in_synpred4_InternalAltarica4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred5_InternalAltarica4238 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleAddition_in_synpred5_InternalAltarica4327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred6_InternalAltarica4652 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleMultiplication_in_synpred6_InternalAltarica4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred7_InternalAltarica4894 = new BitSet(new long[]{0x0072008000800070L});
    public static final BitSet FOLLOW_ruleNeg_in_synpred7_InternalAltarica4927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_synpred10_InternalAltarica5911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred10_InternalAltarica5919 = new BitSet(new long[]{0x0000000000000002L});

}