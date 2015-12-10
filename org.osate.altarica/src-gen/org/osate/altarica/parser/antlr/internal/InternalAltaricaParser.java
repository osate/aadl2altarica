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

@SuppressWarnings("all")
public class InternalAltaricaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SL_COMMENT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'const'", "';'", "'='", "':'", "'domain'", "'['", "','", "']'", "'{'", "'}'", "'node'", "'edon'", "'init'", "'extern'", "'flow'", "'event'", "'!'", "'priority'", "'state'", "'sub'", "'assert'", "'sync'", "'<'", "'>'", "'?'", "'>='", "'trans'", "'|-'", "'->'", "':='", "'case {'", "'else'", "'if'", "'then'", "'+'", "'-'", "'*'", "'/'", "'and'", "'&'", "'or'", "'|'", "'!='", "'<='", "'=>'", "'~'", "'not'", "'('", "')'", "'.'", "'true'", "'false'", "'integer'", "'bool'", "'in'", "'out'", "'inout'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=5;
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
    public String getGrammarFileName() { return "../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g"; }



     	private AltaricaGrammarAccess grammarAccess;
     	
        public InternalAltaricaParser(TokenStream input, AltaricaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "System";	
       	}
       	
       	@Override
       	protected AltaricaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSystem"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:68:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:69:2: (iv_ruleSystem= ruleSystem EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:70:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem75);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem85); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:77:1: ruleSystem returns [EObject current=null] : ( (lv_ownedDeclarations_0_0= ruleAbstractDeclaration ) )* ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedDeclarations_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:80:28: ( ( (lv_ownedDeclarations_0_0= ruleAbstractDeclaration ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:81:1: ( (lv_ownedDeclarations_0_0= ruleAbstractDeclaration ) )*
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:81:1: ( (lv_ownedDeclarations_0_0= ruleAbstractDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15||LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:82:1: (lv_ownedDeclarations_0_0= ruleAbstractDeclaration )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:82:1: (lv_ownedDeclarations_0_0= ruleAbstractDeclaration )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:83:3: lv_ownedDeclarations_0_0= ruleAbstractDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSystemAccess().getOwnedDeclarationsAbstractDeclarationParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractDeclaration_in_ruleSystem130);
            	    lv_ownedDeclarations_0_0=ruleAbstractDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownedDeclarations",
            	            		lv_ownedDeclarations_0_0, 
            	            		"AbstractDeclaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleAbstractDeclaration"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:107:1: entryRuleAbstractDeclaration returns [EObject current=null] : iv_ruleAbstractDeclaration= ruleAbstractDeclaration EOF ;
    public final EObject entryRuleAbstractDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDeclaration = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:108:2: (iv_ruleAbstractDeclaration= ruleAbstractDeclaration EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:109:2: iv_ruleAbstractDeclaration= ruleAbstractDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAbstractDeclarationRule()); 
            pushFollow(FOLLOW_ruleAbstractDeclaration_in_entryRuleAbstractDeclaration166);
            iv_ruleAbstractDeclaration=ruleAbstractDeclaration();

            state._fsp--;

             current =iv_ruleAbstractDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDeclaration176); 

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:116:1: ruleAbstractDeclaration returns [EObject current=null] : (this_Domain_0= ruleDomain | this_ConstantDefinition_1= ruleConstantDefinition | this_Node_2= ruleNode ) ;
    public final EObject ruleAbstractDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Domain_0 = null;

        EObject this_ConstantDefinition_1 = null;

        EObject this_Node_2 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:119:28: ( (this_Domain_0= ruleDomain | this_ConstantDefinition_1= ruleConstantDefinition | this_Node_2= ruleNode ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:120:1: (this_Domain_0= ruleDomain | this_ConstantDefinition_1= ruleConstantDefinition | this_Node_2= ruleNode )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:120:1: (this_Domain_0= ruleDomain | this_ConstantDefinition_1= ruleConstantDefinition | this_Node_2= ruleNode )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 11:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:121:5: this_Domain_0= ruleDomain
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDeclarationAccess().getDomainParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDomain_in_ruleAbstractDeclaration223);
                    this_Domain_0=ruleDomain();

                    state._fsp--;

                     
                            current = this_Domain_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:131:5: this_ConstantDefinition_1= ruleConstantDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDeclarationAccess().getConstantDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleConstantDefinition_in_ruleAbstractDeclaration250);
                    this_ConstantDefinition_1=ruleConstantDefinition();

                    state._fsp--;

                     
                            current = this_ConstantDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:141:5: this_Node_2= ruleNode
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDeclarationAccess().getNodeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNode_in_ruleAbstractDeclaration277);
                    this_Node_2=ruleNode();

                    state._fsp--;

                     
                            current = this_Node_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleConstantDefinition"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:157:1: entryRuleConstantDefinition returns [EObject current=null] : iv_ruleConstantDefinition= ruleConstantDefinition EOF ;
    public final EObject entryRuleConstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinition = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:158:2: (iv_ruleConstantDefinition= ruleConstantDefinition EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:159:2: iv_ruleConstantDefinition= ruleConstantDefinition EOF
            {
             newCompositeNode(grammarAccess.getConstantDefinitionRule()); 
            pushFollow(FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition312);
            iv_ruleConstantDefinition=ruleConstantDefinition();

            state._fsp--;

             current =iv_ruleConstantDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDefinition322); 

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
    // $ANTLR end "entryRuleConstantDefinition"


    // $ANTLR start "ruleConstantDefinition"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:166:1: ruleConstantDefinition returns [EObject current=null] : ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_expression_3_0= ruleAbstractDefinitionConstant ) ) otherlv_4= ';' ) ;
    public final EObject ruleConstantDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:169:28: ( ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_expression_3_0= ruleAbstractDefinitionConstant ) ) otherlv_4= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:170:1: ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_expression_3_0= ruleAbstractDefinitionConstant ) ) otherlv_4= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:170:1: ( () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_expression_3_0= ruleAbstractDefinitionConstant ) ) otherlv_4= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:170:2: () otherlv_1= 'const' ( (lv_name_2_0= RULE_ID ) ) ( (lv_expression_3_0= ruleAbstractDefinitionConstant ) ) otherlv_4= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:170:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:171:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getConstantDefinitionAccess().getConstantDefinitionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleConstantDefinition368); 

                	newLeafNode(otherlv_1, grammarAccess.getConstantDefinitionAccess().getConstKeyword_1());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:180:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:181:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:181:1: (lv_name_2_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:182:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantDefinition385); 

            			newLeafNode(lv_name_2_0, grammarAccess.getConstantDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:198:2: ( (lv_expression_3_0= ruleAbstractDefinitionConstant ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:199:1: (lv_expression_3_0= ruleAbstractDefinitionConstant )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:199:1: (lv_expression_3_0= ruleAbstractDefinitionConstant )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:200:3: lv_expression_3_0= ruleAbstractDefinitionConstant
            {
             
            	        newCompositeNode(grammarAccess.getConstantDefinitionAccess().getExpressionAbstractDefinitionConstantParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractDefinitionConstant_in_ruleConstantDefinition411);
            lv_expression_3_0=ruleAbstractDefinitionConstant();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_3_0, 
                    		"AbstractDefinitionConstant");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleConstantDefinition423); 

                	newLeafNode(otherlv_4, grammarAccess.getConstantDefinitionAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantDefinition"


    // $ANTLR start "entryRuleAbstractDefinitionConstant"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:228:1: entryRuleAbstractDefinitionConstant returns [EObject current=null] : iv_ruleAbstractDefinitionConstant= ruleAbstractDefinitionConstant EOF ;
    public final EObject entryRuleAbstractDefinitionConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDefinitionConstant = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:229:2: (iv_ruleAbstractDefinitionConstant= ruleAbstractDefinitionConstant EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:230:2: iv_ruleAbstractDefinitionConstant= ruleAbstractDefinitionConstant EOF
            {
             newCompositeNode(grammarAccess.getAbstractDefinitionConstantRule()); 
            pushFollow(FOLLOW_ruleAbstractDefinitionConstant_in_entryRuleAbstractDefinitionConstant459);
            iv_ruleAbstractDefinitionConstant=ruleAbstractDefinitionConstant();

            state._fsp--;

             current =iv_ruleAbstractDefinitionConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDefinitionConstant469); 

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:237:1: ruleAbstractDefinitionConstant returns [EObject current=null] : (this_ExpressionConstant_0= ruleExpressionConstant | this_DomainConstant_1= ruleDomainConstant ) ;
    public final EObject ruleAbstractDefinitionConstant() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionConstant_0 = null;

        EObject this_DomainConstant_1 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:240:28: ( (this_ExpressionConstant_0= ruleExpressionConstant | this_DomainConstant_1= ruleDomainConstant ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:241:1: (this_ExpressionConstant_0= ruleExpressionConstant | this_DomainConstant_1= ruleDomainConstant )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:241:1: (this_ExpressionConstant_0= ruleExpressionConstant | this_DomainConstant_1= ruleDomainConstant )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:242:5: this_ExpressionConstant_0= ruleExpressionConstant
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDefinitionConstantAccess().getExpressionConstantParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleExpressionConstant_in_ruleAbstractDefinitionConstant516);
                    this_ExpressionConstant_0=ruleExpressionConstant();

                    state._fsp--;

                     
                            current = this_ExpressionConstant_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:252:5: this_DomainConstant_1= ruleDomainConstant
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDefinitionConstantAccess().getDomainConstantParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDomainConstant_in_ruleAbstractDefinitionConstant543);
                    this_DomainConstant_1=ruleDomainConstant();

                    state._fsp--;

                     
                            current = this_DomainConstant_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:268:1: entryRuleExpressionConstant returns [EObject current=null] : iv_ruleExpressionConstant= ruleExpressionConstant EOF ;
    public final EObject entryRuleExpressionConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstant = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:269:2: (iv_ruleExpressionConstant= ruleExpressionConstant EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:270:2: iv_ruleExpressionConstant= ruleExpressionConstant EOF
            {
             newCompositeNode(grammarAccess.getExpressionConstantRule()); 
            pushFollow(FOLLOW_ruleExpressionConstant_in_entryRuleExpressionConstant578);
            iv_ruleExpressionConstant=ruleExpressionConstant();

            state._fsp--;

             current =iv_ruleExpressionConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionConstant588); 

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:277:1: ruleExpressionConstant returns [EObject current=null] : (otherlv_0= '=' ( (lv_ownedExpression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleExpressionConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ownedExpression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:280:28: ( (otherlv_0= '=' ( (lv_ownedExpression_1_0= ruleExpression ) ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:281:1: (otherlv_0= '=' ( (lv_ownedExpression_1_0= ruleExpression ) ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:281:1: (otherlv_0= '=' ( (lv_ownedExpression_1_0= ruleExpression ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:281:3: otherlv_0= '=' ( (lv_ownedExpression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleExpressionConstant625); 

                	newLeafNode(otherlv_0, grammarAccess.getExpressionConstantAccess().getEqualsSignKeyword_0());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:285:1: ( (lv_ownedExpression_1_0= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:286:1: (lv_ownedExpression_1_0= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:286:1: (lv_ownedExpression_1_0= ruleExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:287:3: lv_ownedExpression_1_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getExpressionConstantAccess().getOwnedExpressionExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionConstant646);
            lv_ownedExpression_1_0=ruleExpression();

            state._fsp--;


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

             leaveRule(); 
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:311:1: entryRuleDomainConstant returns [EObject current=null] : iv_ruleDomainConstant= ruleDomainConstant EOF ;
    public final EObject entryRuleDomainConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainConstant = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:312:2: (iv_ruleDomainConstant= ruleDomainConstant EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:313:2: iv_ruleDomainConstant= ruleDomainConstant EOF
            {
             newCompositeNode(grammarAccess.getDomainConstantRule()); 
            pushFollow(FOLLOW_ruleDomainConstant_in_entryRuleDomainConstant682);
            iv_ruleDomainConstant=ruleDomainConstant();

            state._fsp--;

             current =iv_ruleDomainConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainConstant692); 

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:320:1: ruleDomainConstant returns [EObject current=null] : (otherlv_0= ':' ( (lv_domain_1_0= ruleAbstractDomain ) ) (otherlv_2= '=' ( (lv_ownedExpression_3_0= ruleExpression ) ) )? ) ;
    public final EObject ruleDomainConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_domain_1_0 = null;

        EObject lv_ownedExpression_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:323:28: ( (otherlv_0= ':' ( (lv_domain_1_0= ruleAbstractDomain ) ) (otherlv_2= '=' ( (lv_ownedExpression_3_0= ruleExpression ) ) )? ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:324:1: (otherlv_0= ':' ( (lv_domain_1_0= ruleAbstractDomain ) ) (otherlv_2= '=' ( (lv_ownedExpression_3_0= ruleExpression ) ) )? )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:324:1: (otherlv_0= ':' ( (lv_domain_1_0= ruleAbstractDomain ) ) (otherlv_2= '=' ( (lv_ownedExpression_3_0= ruleExpression ) ) )? )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:324:3: otherlv_0= ':' ( (lv_domain_1_0= ruleAbstractDomain ) ) (otherlv_2= '=' ( (lv_ownedExpression_3_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleDomainConstant729); 

                	newLeafNode(otherlv_0, grammarAccess.getDomainConstantAccess().getColonKeyword_0());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:328:1: ( (lv_domain_1_0= ruleAbstractDomain ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:329:1: (lv_domain_1_0= ruleAbstractDomain )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:329:1: (lv_domain_1_0= ruleAbstractDomain )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:330:3: lv_domain_1_0= ruleAbstractDomain
            {
             
            	        newCompositeNode(grammarAccess.getDomainConstantAccess().getDomainAbstractDomainParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractDomain_in_ruleDomainConstant750);
            lv_domain_1_0=ruleAbstractDomain();

            state._fsp--;


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

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:346:2: (otherlv_2= '=' ( (lv_ownedExpression_3_0= ruleExpression ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:346:4: otherlv_2= '=' ( (lv_ownedExpression_3_0= ruleExpression ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDomainConstant763); 

                        	newLeafNode(otherlv_2, grammarAccess.getDomainConstantAccess().getEqualsSignKeyword_2_0());
                        
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:350:1: ( (lv_ownedExpression_3_0= ruleExpression ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:351:1: (lv_ownedExpression_3_0= ruleExpression )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:351:1: (lv_ownedExpression_3_0= ruleExpression )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:352:3: lv_ownedExpression_3_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getDomainConstantAccess().getOwnedExpressionExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleDomainConstant784);
                    lv_ownedExpression_3_0=ruleExpression();

                    state._fsp--;


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
                    break;

            }


            }


            }

             leaveRule(); 
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:376:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:377:2: (iv_ruleDomain= ruleDomain EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:378:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain822);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain832); 

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:385:1: ruleDomain returns [EObject current=null] : ( () otherlv_1= 'domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_domain_4_0= ruleAbstractDomain ) ) otherlv_5= ';' ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_domain_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:388:28: ( ( () otherlv_1= 'domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_domain_4_0= ruleAbstractDomain ) ) otherlv_5= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:389:1: ( () otherlv_1= 'domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_domain_4_0= ruleAbstractDomain ) ) otherlv_5= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:389:1: ( () otherlv_1= 'domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_domain_4_0= ruleAbstractDomain ) ) otherlv_5= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:389:2: () otherlv_1= 'domain' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_domain_4_0= ruleAbstractDomain ) ) otherlv_5= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:389:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:390:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDomainAccess().getDomainAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleDomain878); 

                	newLeafNode(otherlv_1, grammarAccess.getDomainAccess().getDomainKeyword_1());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:399:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:400:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:400:1: (lv_name_2_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:401:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomain895); 

            			newLeafNode(lv_name_2_0, grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_2_0()); 
            		

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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleDomain912); 

                	newLeafNode(otherlv_3, grammarAccess.getDomainAccess().getEqualsSignKeyword_3());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:421:1: ( (lv_domain_4_0= ruleAbstractDomain ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:422:1: (lv_domain_4_0= ruleAbstractDomain )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:422:1: (lv_domain_4_0= ruleAbstractDomain )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:423:3: lv_domain_4_0= ruleAbstractDomain
            {
             
            	        newCompositeNode(grammarAccess.getDomainAccess().getDomainAbstractDomainParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractDomain_in_ruleDomain933);
            lv_domain_4_0=ruleAbstractDomain();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDomainRule());
            	        }
                   		set(
                   			current, 
                   			"domain",
                    		lv_domain_4_0, 
                    		"AbstractDomain");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleDomain945); 

                	newLeafNode(otherlv_5, grammarAccess.getDomainAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:451:1: entryRuleAbstractDomain returns [EObject current=null] : iv_ruleAbstractDomain= ruleAbstractDomain EOF ;
    public final EObject entryRuleAbstractDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDomain = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:452:2: (iv_ruleAbstractDomain= ruleAbstractDomain EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:453:2: iv_ruleAbstractDomain= ruleAbstractDomain EOF
            {
             newCompositeNode(grammarAccess.getAbstractDomainRule()); 
            pushFollow(FOLLOW_ruleAbstractDomain_in_entryRuleAbstractDomain981);
            iv_ruleAbstractDomain=ruleAbstractDomain();

            state._fsp--;

             current =iv_ruleAbstractDomain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDomain991); 

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:460:1: ruleAbstractDomain returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_Range_1= ruleRange | this_Enumeration_2= ruleEnumeration ) ;
    public final EObject ruleAbstractDomain() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_Range_1 = null;

        EObject this_Enumeration_2 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:463:28: ( (this_PrimitiveType_0= rulePrimitiveType | this_Range_1= ruleRange | this_Enumeration_2= ruleEnumeration ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:464:1: (this_PrimitiveType_0= rulePrimitiveType | this_Range_1= ruleRange | this_Enumeration_2= ruleEnumeration )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:464:1: (this_PrimitiveType_0= rulePrimitiveType | this_Range_1= ruleRange | this_Enumeration_2= ruleEnumeration )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 63:
            case 64:
                {
                alt5=1;
                }
                break;
            case 16:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:465:5: this_PrimitiveType_0= rulePrimitiveType
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDomainAccess().getPrimitiveTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleAbstractDomain1038);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;

                     
                            current = this_PrimitiveType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:475:5: this_Range_1= ruleRange
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDomainAccess().getRangeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRange_in_ruleAbstractDomain1065);
                    this_Range_1=ruleRange();

                    state._fsp--;

                     
                            current = this_Range_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:485:5: this_Enumeration_2= ruleEnumeration
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractDomainAccess().getEnumerationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEnumeration_in_ruleAbstractDomain1092);
                    this_Enumeration_2=ruleEnumeration();

                    state._fsp--;

                     
                            current = this_Enumeration_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:501:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:502:2: (iv_ruleRange= ruleRange EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:503:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange1127);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange1137); 

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:510:1: ruleRange returns [EObject current=null] : (otherlv_0= '[' ( (lv_lower_1_0= ruleAtom ) ) otherlv_2= ',' ( (lv_upper_3_0= ruleAtom ) ) otherlv_4= ']' ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_lower_1_0 = null;

        EObject lv_upper_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:513:28: ( (otherlv_0= '[' ( (lv_lower_1_0= ruleAtom ) ) otherlv_2= ',' ( (lv_upper_3_0= ruleAtom ) ) otherlv_4= ']' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:514:1: (otherlv_0= '[' ( (lv_lower_1_0= ruleAtom ) ) otherlv_2= ',' ( (lv_upper_3_0= ruleAtom ) ) otherlv_4= ']' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:514:1: (otherlv_0= '[' ( (lv_lower_1_0= ruleAtom ) ) otherlv_2= ',' ( (lv_upper_3_0= ruleAtom ) ) otherlv_4= ']' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:514:3: otherlv_0= '[' ( (lv_lower_1_0= ruleAtom ) ) otherlv_2= ',' ( (lv_upper_3_0= ruleAtom ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleRange1174); 

                	newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:518:1: ( (lv_lower_1_0= ruleAtom ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:519:1: (lv_lower_1_0= ruleAtom )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:519:1: (lv_lower_1_0= ruleAtom )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:520:3: lv_lower_1_0= ruleAtom
            {
             
            	        newCompositeNode(grammarAccess.getRangeAccess().getLowerAtomParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAtom_in_ruleRange1195);
            lv_lower_1_0=ruleAtom();

            state._fsp--;


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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleRange1207); 

                	newLeafNode(otherlv_2, grammarAccess.getRangeAccess().getCommaKeyword_2());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:540:1: ( (lv_upper_3_0= ruleAtom ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:541:1: (lv_upper_3_0= ruleAtom )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:541:1: (lv_upper_3_0= ruleAtom )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:542:3: lv_upper_3_0= ruleAtom
            {
             
            	        newCompositeNode(grammarAccess.getRangeAccess().getUpperAtomParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAtom_in_ruleRange1228);
            lv_upper_3_0=ruleAtom();

            state._fsp--;


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

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleRange1240); 

                	newLeafNode(otherlv_4, grammarAccess.getRangeAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:570:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:571:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:572:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration1276);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration1286); 

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:579:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= '{' ( (lv_ownedLiterals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_ownedLiterals_3_0= ruleLiteral ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedLiterals_1_0 = null;

        EObject lv_ownedLiterals_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:582:28: ( (otherlv_0= '{' ( (lv_ownedLiterals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_ownedLiterals_3_0= ruleLiteral ) ) )* otherlv_4= '}' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:583:1: (otherlv_0= '{' ( (lv_ownedLiterals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_ownedLiterals_3_0= ruleLiteral ) ) )* otherlv_4= '}' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:583:1: (otherlv_0= '{' ( (lv_ownedLiterals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_ownedLiterals_3_0= ruleLiteral ) ) )* otherlv_4= '}' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:583:3: otherlv_0= '{' ( (lv_ownedLiterals_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_ownedLiterals_3_0= ruleLiteral ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleEnumeration1323); 

                	newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:587:1: ( (lv_ownedLiterals_1_0= ruleLiteral ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:588:1: (lv_ownedLiterals_1_0= ruleLiteral )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:588:1: (lv_ownedLiterals_1_0= ruleLiteral )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:589:3: lv_ownedLiterals_1_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getEnumerationAccess().getOwnedLiteralsLiteralParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteral_in_ruleEnumeration1344);
            lv_ownedLiterals_1_0=ruleLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	        }
                   		add(
                   			current, 
                   			"ownedLiterals",
                    		lv_ownedLiterals_1_0, 
                    		"Literal");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:605:2: (otherlv_2= ',' ( (lv_ownedLiterals_3_0= ruleLiteral ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:605:4: otherlv_2= ',' ( (lv_ownedLiterals_3_0= ruleLiteral ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleEnumeration1357); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:609:1: ( (lv_ownedLiterals_3_0= ruleLiteral ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:610:1: (lv_ownedLiterals_3_0= ruleLiteral )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:610:1: (lv_ownedLiterals_3_0= ruleLiteral )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:611:3: lv_ownedLiterals_3_0= ruleLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEnumerationAccess().getOwnedLiteralsLiteralParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLiteral_in_ruleEnumeration1378);
            	    lv_ownedLiterals_3_0=ruleLiteral();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownedLiterals",
            	            		lv_ownedLiterals_3_0, 
            	            		"Literal");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleEnumeration1392); 

                	newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRulePrimitiveType"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:639:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:640:2: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:641:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1428);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType1438); 

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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:648:1: rulePrimitiveType returns [EObject current=null] : ( (lv_name_0_0= rulePrimitiveTypeKind ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:651:28: ( ( (lv_name_0_0= rulePrimitiveTypeKind ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:652:1: ( (lv_name_0_0= rulePrimitiveTypeKind ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:652:1: ( (lv_name_0_0= rulePrimitiveTypeKind ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:653:1: (lv_name_0_0= rulePrimitiveTypeKind )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:653:1: (lv_name_0_0= rulePrimitiveTypeKind )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:654:3: lv_name_0_0= rulePrimitiveTypeKind
            {
             
            	        newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getNamePrimitiveTypeKindEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulePrimitiveTypeKind_in_rulePrimitiveType1483);
            lv_name_0_0=rulePrimitiveTypeKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"PrimitiveTypeKind");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleLiteral"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:678:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:679:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:680:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1518);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1528); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:687:1: ruleLiteral returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:690:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:691:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:691:1: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:691:2: () ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:691:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:692:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLiteralAccess().getEnumerationLiteralAction_0(),
                        current);
                

            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:697:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:698:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:698:1: (lv_name_1_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:699:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLiteral1579); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLiteralAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLiteralRule());
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

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleNode"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:723:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:724:2: (iv_ruleNode= ruleNode EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:725:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode1620);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode1630); 

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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:732:1: ruleNode returns [EObject current=null] : ( () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) ( (lv_ownedSpecifications_3_0= ruleAbstractSpecification ) )* otherlv_4= 'edon' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_ownedSpecifications_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:735:28: ( ( () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) ( (lv_ownedSpecifications_3_0= ruleAbstractSpecification ) )* otherlv_4= 'edon' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:736:1: ( () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) ( (lv_ownedSpecifications_3_0= ruleAbstractSpecification ) )* otherlv_4= 'edon' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:736:1: ( () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) ( (lv_ownedSpecifications_3_0= ruleAbstractSpecification ) )* otherlv_4= 'edon' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:736:2: () otherlv_1= 'node' ( (lv_name_2_0= RULE_ID ) ) ( (lv_ownedSpecifications_3_0= ruleAbstractSpecification ) )* otherlv_4= 'edon'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:736:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:737:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNodeAccess().getNodeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleNode1676); 

                	newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getNodeKeyword_1());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:746:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:747:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:747:1: (lv_name_2_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:748:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNode1693); 

            			newLeafNode(lv_name_2_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:764:2: ( (lv_ownedSpecifications_3_0= ruleAbstractSpecification ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=23 && LA7_0<=26)||(LA7_0>=29 && LA7_0<=32)||LA7_0==37) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:765:1: (lv_ownedSpecifications_3_0= ruleAbstractSpecification )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:765:1: (lv_ownedSpecifications_3_0= ruleAbstractSpecification )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:766:3: lv_ownedSpecifications_3_0= ruleAbstractSpecification
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeAccess().getOwnedSpecificationsAbstractSpecificationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractSpecification_in_ruleNode1719);
            	    lv_ownedSpecifications_3_0=ruleAbstractSpecification();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownedSpecifications",
            	            		lv_ownedSpecifications_3_0, 
            	            		"AbstractSpecification");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleNode1732); 

                	newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getEdonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleAbstractSpecification"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:794:1: entryRuleAbstractSpecification returns [EObject current=null] : iv_ruleAbstractSpecification= ruleAbstractSpecification EOF ;
    public final EObject entryRuleAbstractSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSpecification = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:795:2: (iv_ruleAbstractSpecification= ruleAbstractSpecification EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:796:2: iv_ruleAbstractSpecification= ruleAbstractSpecification EOF
            {
             newCompositeNode(grammarAccess.getAbstractSpecificationRule()); 
            pushFollow(FOLLOW_ruleAbstractSpecification_in_entryRuleAbstractSpecification1768);
            iv_ruleAbstractSpecification=ruleAbstractSpecification();

            state._fsp--;

             current =iv_ruleAbstractSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractSpecification1778); 

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
    // $ANTLR end "entryRuleAbstractSpecification"


    // $ANTLR start "ruleAbstractSpecification"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:803:1: ruleAbstractSpecification returns [EObject current=null] : (this_FlowSpecification_0= ruleFlowSpecification | this_StateSpecification_1= ruleStateSpecification | this_EventSpecification_2= ruleEventSpecification | this_NodeInstanceSpecification_3= ruleNodeInstanceSpecification | this_AssertSpecification_4= ruleAssertSpecification | this_VectorSpecification_5= ruleVectorSpecification | this_TransitionSpecification_6= ruleTransitionSpecification | this_InitSpecification_7= ruleInitSpecification | this_ExternalSpecification_8= ruleExternalSpecification ) ;
    public final EObject ruleAbstractSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_FlowSpecification_0 = null;

        EObject this_StateSpecification_1 = null;

        EObject this_EventSpecification_2 = null;

        EObject this_NodeInstanceSpecification_3 = null;

        EObject this_AssertSpecification_4 = null;

        EObject this_VectorSpecification_5 = null;

        EObject this_TransitionSpecification_6 = null;

        EObject this_InitSpecification_7 = null;

        EObject this_ExternalSpecification_8 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:806:28: ( (this_FlowSpecification_0= ruleFlowSpecification | this_StateSpecification_1= ruleStateSpecification | this_EventSpecification_2= ruleEventSpecification | this_NodeInstanceSpecification_3= ruleNodeInstanceSpecification | this_AssertSpecification_4= ruleAssertSpecification | this_VectorSpecification_5= ruleVectorSpecification | this_TransitionSpecification_6= ruleTransitionSpecification | this_InitSpecification_7= ruleInitSpecification | this_ExternalSpecification_8= ruleExternalSpecification ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:807:1: (this_FlowSpecification_0= ruleFlowSpecification | this_StateSpecification_1= ruleStateSpecification | this_EventSpecification_2= ruleEventSpecification | this_NodeInstanceSpecification_3= ruleNodeInstanceSpecification | this_AssertSpecification_4= ruleAssertSpecification | this_VectorSpecification_5= ruleVectorSpecification | this_TransitionSpecification_6= ruleTransitionSpecification | this_InitSpecification_7= ruleInitSpecification | this_ExternalSpecification_8= ruleExternalSpecification )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:807:1: (this_FlowSpecification_0= ruleFlowSpecification | this_StateSpecification_1= ruleStateSpecification | this_EventSpecification_2= ruleEventSpecification | this_NodeInstanceSpecification_3= ruleNodeInstanceSpecification | this_AssertSpecification_4= ruleAssertSpecification | this_VectorSpecification_5= ruleVectorSpecification | this_TransitionSpecification_6= ruleTransitionSpecification | this_InitSpecification_7= ruleInitSpecification | this_ExternalSpecification_8= ruleExternalSpecification )
            int alt8=9;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt8=1;
                }
                break;
            case 29:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            case 30:
                {
                alt8=4;
                }
                break;
            case 31:
                {
                alt8=5;
                }
                break;
            case 32:
                {
                alt8=6;
                }
                break;
            case 37:
                {
                alt8=7;
                }
                break;
            case 23:
                {
                alt8=8;
                }
                break;
            case 24:
                {
                alt8=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:808:5: this_FlowSpecification_0= ruleFlowSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSpecificationAccess().getFlowSpecificationParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFlowSpecification_in_ruleAbstractSpecification1825);
                    this_FlowSpecification_0=ruleFlowSpecification();

                    state._fsp--;

                     
                            current = this_FlowSpecification_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:818:5: this_StateSpecification_1= ruleStateSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSpecificationAccess().getStateSpecificationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStateSpecification_in_ruleAbstractSpecification1852);
                    this_StateSpecification_1=ruleStateSpecification();

                    state._fsp--;

                     
                            current = this_StateSpecification_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:828:5: this_EventSpecification_2= ruleEventSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSpecificationAccess().getEventSpecificationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleEventSpecification_in_ruleAbstractSpecification1879);
                    this_EventSpecification_2=ruleEventSpecification();

                    state._fsp--;

                     
                            current = this_EventSpecification_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:838:5: this_NodeInstanceSpecification_3= ruleNodeInstanceSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSpecificationAccess().getNodeInstanceSpecificationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleNodeInstanceSpecification_in_ruleAbstractSpecification1906);
                    this_NodeInstanceSpecification_3=ruleNodeInstanceSpecification();

                    state._fsp--;

                     
                            current = this_NodeInstanceSpecification_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:848:5: this_AssertSpecification_4= ruleAssertSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSpecificationAccess().getAssertSpecificationParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleAssertSpecification_in_ruleAbstractSpecification1933);
                    this_AssertSpecification_4=ruleAssertSpecification();

                    state._fsp--;

                     
                            current = this_AssertSpecification_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:858:5: this_VectorSpecification_5= ruleVectorSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSpecificationAccess().getVectorSpecificationParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleVectorSpecification_in_ruleAbstractSpecification1960);
                    this_VectorSpecification_5=ruleVectorSpecification();

                    state._fsp--;

                     
                            current = this_VectorSpecification_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:868:5: this_TransitionSpecification_6= ruleTransitionSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSpecificationAccess().getTransitionSpecificationParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleTransitionSpecification_in_ruleAbstractSpecification1987);
                    this_TransitionSpecification_6=ruleTransitionSpecification();

                    state._fsp--;

                     
                            current = this_TransitionSpecification_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:878:5: this_InitSpecification_7= ruleInitSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSpecificationAccess().getInitSpecificationParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleInitSpecification_in_ruleAbstractSpecification2014);
                    this_InitSpecification_7=ruleInitSpecification();

                    state._fsp--;

                     
                            current = this_InitSpecification_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:888:5: this_ExternalSpecification_8= ruleExternalSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractSpecificationAccess().getExternalSpecificationParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleExternalSpecification_in_ruleAbstractSpecification2041);
                    this_ExternalSpecification_8=ruleExternalSpecification();

                    state._fsp--;

                     
                            current = this_ExternalSpecification_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractSpecification"


    // $ANTLR start "entryRuleVariableAttribute"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:904:1: entryRuleVariableAttribute returns [EObject current=null] : iv_ruleVariableAttribute= ruleVariableAttribute EOF ;
    public final EObject entryRuleVariableAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAttribute = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:905:2: (iv_ruleVariableAttribute= ruleVariableAttribute EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:906:2: iv_ruleVariableAttribute= ruleVariableAttribute EOF
            {
             newCompositeNode(grammarAccess.getVariableAttributeRule()); 
            pushFollow(FOLLOW_ruleVariableAttribute_in_entryRuleVariableAttribute2076);
            iv_ruleVariableAttribute=ruleVariableAttribute();

            state._fsp--;

             current =iv_ruleVariableAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAttribute2086); 

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
    // $ANTLR end "entryRuleVariableAttribute"


    // $ANTLR start "ruleVariableAttribute"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:913:1: ruleVariableAttribute returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariableAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:916:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:917:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:917:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:918:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:918:1: (lv_name_0_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:919:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableAttribute2127); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVariableAttributeAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableAttribute"


    // $ANTLR start "entryRuleInitSpecification"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:943:1: entryRuleInitSpecification returns [EObject current=null] : iv_ruleInitSpecification= ruleInitSpecification EOF ;
    public final EObject entryRuleInitSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitSpecification = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:944:2: (iv_ruleInitSpecification= ruleInitSpecification EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:945:2: iv_ruleInitSpecification= ruleInitSpecification EOF
            {
             newCompositeNode(grammarAccess.getInitSpecificationRule()); 
            pushFollow(FOLLOW_ruleInitSpecification_in_entryRuleInitSpecification2167);
            iv_ruleInitSpecification=ruleInitSpecification();

            state._fsp--;

             current =iv_ruleInitSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitSpecification2177); 

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
    // $ANTLR end "entryRuleInitSpecification"


    // $ANTLR start "ruleInitSpecification"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:952:1: ruleInitSpecification returns [EObject current=null] : (otherlv_0= 'init' ( (lv_ownedInitStatements_1_0= ruleInitStatement ) )* ) ;
    public final EObject ruleInitSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ownedInitStatements_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:955:28: ( (otherlv_0= 'init' ( (lv_ownedInitStatements_1_0= ruleInitStatement ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:956:1: (otherlv_0= 'init' ( (lv_ownedInitStatements_1_0= ruleInitStatement ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:956:1: (otherlv_0= 'init' ( (lv_ownedInitStatements_1_0= ruleInitStatement ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:956:3: otherlv_0= 'init' ( (lv_ownedInitStatements_1_0= ruleInitStatement ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleInitSpecification2214); 

                	newLeafNode(otherlv_0, grammarAccess.getInitSpecificationAccess().getInitKeyword_0());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:960:1: ( (lv_ownedInitStatements_1_0= ruleInitStatement ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:961:1: (lv_ownedInitStatements_1_0= ruleInitStatement )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:961:1: (lv_ownedInitStatements_1_0= ruleInitStatement )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:962:3: lv_ownedInitStatements_1_0= ruleInitStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInitSpecificationAccess().getOwnedInitStatementsInitStatementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInitStatement_in_ruleInitSpecification2235);
            	    lv_ownedInitStatements_1_0=ruleInitStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInitSpecificationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownedInitStatements",
            	            		lv_ownedInitStatements_1_0, 
            	            		"InitStatement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitSpecification"


    // $ANTLR start "entryRuleInitStatement"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:986:1: entryRuleInitStatement returns [EObject current=null] : iv_ruleInitStatement= ruleInitStatement EOF ;
    public final EObject entryRuleInitStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitStatement = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:987:2: (iv_ruleInitStatement= ruleInitStatement EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:988:2: iv_ruleInitStatement= ruleInitStatement EOF
            {
             newCompositeNode(grammarAccess.getInitStatementRule()); 
            pushFollow(FOLLOW_ruleInitStatement_in_entryRuleInitStatement2272);
            iv_ruleInitStatement=ruleInitStatement();

            state._fsp--;

             current =iv_ruleInitStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitStatement2282); 

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
    // $ANTLR end "entryRuleInitStatement"


    // $ANTLR start "ruleInitStatement"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:995:1: ruleInitStatement returns [EObject current=null] : ( ( (lv_affectation_0_0= ruleAssignment ) ) otherlv_1= ';' ) ;
    public final EObject ruleInitStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_affectation_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:998:28: ( ( ( (lv_affectation_0_0= ruleAssignment ) ) otherlv_1= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:999:1: ( ( (lv_affectation_0_0= ruleAssignment ) ) otherlv_1= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:999:1: ( ( (lv_affectation_0_0= ruleAssignment ) ) otherlv_1= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:999:2: ( (lv_affectation_0_0= ruleAssignment ) ) otherlv_1= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:999:2: ( (lv_affectation_0_0= ruleAssignment ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1000:1: (lv_affectation_0_0= ruleAssignment )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1000:1: (lv_affectation_0_0= ruleAssignment )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1001:3: lv_affectation_0_0= ruleAssignment
            {
             
            	        newCompositeNode(grammarAccess.getInitStatementAccess().getAffectationAssignmentParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAssignment_in_ruleInitStatement2328);
            lv_affectation_0_0=ruleAssignment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInitStatementRule());
            	        }
                   		set(
                   			current, 
                   			"affectation",
                    		lv_affectation_0_0, 
                    		"Assignment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleInitStatement2340); 

                	newLeafNode(otherlv_1, grammarAccess.getInitStatementAccess().getSemicolonKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitStatement"


    // $ANTLR start "entryRuleExternalSpecification"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1029:1: entryRuleExternalSpecification returns [EObject current=null] : iv_ruleExternalSpecification= ruleExternalSpecification EOF ;
    public final EObject entryRuleExternalSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalSpecification = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1030:2: (iv_ruleExternalSpecification= ruleExternalSpecification EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1031:2: iv_ruleExternalSpecification= ruleExternalSpecification EOF
            {
             newCompositeNode(grammarAccess.getExternalSpecificationRule()); 
            pushFollow(FOLLOW_ruleExternalSpecification_in_entryRuleExternalSpecification2376);
            iv_ruleExternalSpecification=ruleExternalSpecification();

            state._fsp--;

             current =iv_ruleExternalSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalSpecification2386); 

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
    // $ANTLR end "entryRuleExternalSpecification"


    // $ANTLR start "ruleExternalSpecification"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1038:1: ruleExternalSpecification returns [EObject current=null] : (otherlv_0= 'extern' ( (lv_ownedDirectives_1_0= ruleExternalDirective ) )* ) ;
    public final EObject ruleExternalSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ownedDirectives_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1041:28: ( (otherlv_0= 'extern' ( (lv_ownedDirectives_1_0= ruleExternalDirective ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1042:1: (otherlv_0= 'extern' ( (lv_ownedDirectives_1_0= ruleExternalDirective ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1042:1: (otherlv_0= 'extern' ( (lv_ownedDirectives_1_0= ruleExternalDirective ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1042:3: otherlv_0= 'extern' ( (lv_ownedDirectives_1_0= ruleExternalDirective ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleExternalSpecification2423); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalSpecificationAccess().getExternKeyword_0());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1046:1: ( (lv_ownedDirectives_1_0= ruleExternalDirective ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_SL_COMMENT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1047:1: (lv_ownedDirectives_1_0= ruleExternalDirective )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1047:1: (lv_ownedDirectives_1_0= ruleExternalDirective )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1048:3: lv_ownedDirectives_1_0= ruleExternalDirective
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExternalSpecificationAccess().getOwnedDirectivesExternalDirectiveParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExternalDirective_in_ruleExternalSpecification2444);
            	    lv_ownedDirectives_1_0=ruleExternalDirective();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExternalSpecificationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownedDirectives",
            	            		lv_ownedDirectives_1_0, 
            	            		"ExternalDirective");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalSpecification"


    // $ANTLR start "entryRuleExternalDirective"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1072:1: entryRuleExternalDirective returns [EObject current=null] : iv_ruleExternalDirective= ruleExternalDirective EOF ;
    public final EObject entryRuleExternalDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDirective = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1073:2: (iv_ruleExternalDirective= ruleExternalDirective EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1074:2: iv_ruleExternalDirective= ruleExternalDirective EOF
            {
             newCompositeNode(grammarAccess.getExternalDirectiveRule()); 
            pushFollow(FOLLOW_ruleExternalDirective_in_entryRuleExternalDirective2481);
            iv_ruleExternalDirective=ruleExternalDirective();

            state._fsp--;

             current =iv_ruleExternalDirective; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalDirective2491); 

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
    // $ANTLR end "entryRuleExternalDirective"


    // $ANTLR start "ruleExternalDirective"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1081:1: ruleExternalDirective returns [EObject current=null] : ( (lv_directive_0_0= RULE_SL_COMMENT ) ) ;
    public final EObject ruleExternalDirective() throws RecognitionException {
        EObject current = null;

        Token lv_directive_0_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1084:28: ( ( (lv_directive_0_0= RULE_SL_COMMENT ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1085:1: ( (lv_directive_0_0= RULE_SL_COMMENT ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1085:1: ( (lv_directive_0_0= RULE_SL_COMMENT ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1086:1: (lv_directive_0_0= RULE_SL_COMMENT )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1086:1: (lv_directive_0_0= RULE_SL_COMMENT )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1087:3: lv_directive_0_0= RULE_SL_COMMENT
            {
            lv_directive_0_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleExternalDirective2532); 

            			newLeafNode(lv_directive_0_0, grammarAccess.getExternalDirectiveAccess().getDirectiveSL_COMMENTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExternalDirectiveRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"directive",
                    		lv_directive_0_0, 
                    		"SL_COMMENT");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalDirective"


    // $ANTLR start "entryRuleFlowSpecification"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1111:1: entryRuleFlowSpecification returns [EObject current=null] : iv_ruleFlowSpecification= ruleFlowSpecification EOF ;
    public final EObject entryRuleFlowSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSpecification = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1112:2: (iv_ruleFlowSpecification= ruleFlowSpecification EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1113:2: iv_ruleFlowSpecification= ruleFlowSpecification EOF
            {
             newCompositeNode(grammarAccess.getFlowSpecificationRule()); 
            pushFollow(FOLLOW_ruleFlowSpecification_in_entryRuleFlowSpecification2572);
            iv_ruleFlowSpecification=ruleFlowSpecification();

            state._fsp--;

             current =iv_ruleFlowSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlowSpecification2582); 

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
    // $ANTLR end "entryRuleFlowSpecification"


    // $ANTLR start "ruleFlowSpecification"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1120:1: ruleFlowSpecification returns [EObject current=null] : (otherlv_0= 'flow' ( (lv_ownedFlows_1_0= ruleFlow ) )* ) ;
    public final EObject ruleFlowSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ownedFlows_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1123:28: ( (otherlv_0= 'flow' ( (lv_ownedFlows_1_0= ruleFlow ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1124:1: (otherlv_0= 'flow' ( (lv_ownedFlows_1_0= ruleFlow ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1124:1: (otherlv_0= 'flow' ( (lv_ownedFlows_1_0= ruleFlow ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1124:3: otherlv_0= 'flow' ( (lv_ownedFlows_1_0= ruleFlow ) )*
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleFlowSpecification2619); 

                	newLeafNode(otherlv_0, grammarAccess.getFlowSpecificationAccess().getFlowKeyword_0());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1128:1: ( (lv_ownedFlows_1_0= ruleFlow ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1129:1: (lv_ownedFlows_1_0= ruleFlow )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1129:1: (lv_ownedFlows_1_0= ruleFlow )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1130:3: lv_ownedFlows_1_0= ruleFlow
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFlowSpecificationAccess().getOwnedFlowsFlowParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFlow_in_ruleFlowSpecification2640);
            	    lv_ownedFlows_1_0=ruleFlow();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFlowSpecificationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownedFlows",
            	            		lv_ownedFlows_1_0, 
            	            		"Flow");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlowSpecification"


    // $ANTLR start "entryRuleFlow"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1154:1: entryRuleFlow returns [EObject current=null] : iv_ruleFlow= ruleFlow EOF ;
    public final EObject entryRuleFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlow = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1155:2: (iv_ruleFlow= ruleFlow EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1156:2: iv_ruleFlow= ruleFlow EOF
            {
             newCompositeNode(grammarAccess.getFlowRule()); 
            pushFollow(FOLLOW_ruleFlow_in_entryRuleFlow2677);
            iv_ruleFlow=ruleFlow();

            state._fsp--;

             current =iv_ruleFlow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlow2687); 

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
    // $ANTLR end "entryRuleFlow"


    // $ANTLR start "ruleFlow"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1163:1: ruleFlow returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domain_3_0= ruleAbstractTypeRef ) ) (otherlv_4= ':' ( (lv_kind_5_0= ruleFlowKind ) ) )? (otherlv_6= ':' ( (lv_attribute_7_0= ruleVariableAttribute ) ) )? otherlv_8= ';' ) ;
    public final EObject ruleFlow() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_domain_3_0 = null;

        Enumerator lv_kind_5_0 = null;

        EObject lv_attribute_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1166:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domain_3_0= ruleAbstractTypeRef ) ) (otherlv_4= ':' ( (lv_kind_5_0= ruleFlowKind ) ) )? (otherlv_6= ':' ( (lv_attribute_7_0= ruleVariableAttribute ) ) )? otherlv_8= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1167:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domain_3_0= ruleAbstractTypeRef ) ) (otherlv_4= ':' ( (lv_kind_5_0= ruleFlowKind ) ) )? (otherlv_6= ':' ( (lv_attribute_7_0= ruleVariableAttribute ) ) )? otherlv_8= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1167:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domain_3_0= ruleAbstractTypeRef ) ) (otherlv_4= ':' ( (lv_kind_5_0= ruleFlowKind ) ) )? (otherlv_6= ':' ( (lv_attribute_7_0= ruleVariableAttribute ) ) )? otherlv_8= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1167:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domain_3_0= ruleAbstractTypeRef ) ) (otherlv_4= ':' ( (lv_kind_5_0= ruleFlowKind ) ) )? (otherlv_6= ':' ( (lv_attribute_7_0= ruleVariableAttribute ) ) )? otherlv_8= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1167:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1168:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFlowAccess().getFlowAction_0(),
                        current);
                

            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1173:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1174:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1174:1: (lv_name_1_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1175:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFlow2738); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFlowAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFlowRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleFlow2755); 

                	newLeafNode(otherlv_2, grammarAccess.getFlowAccess().getColonKeyword_2());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1195:1: ( (lv_domain_3_0= ruleAbstractTypeRef ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1196:1: (lv_domain_3_0= ruleAbstractTypeRef )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1196:1: (lv_domain_3_0= ruleAbstractTypeRef )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1197:3: lv_domain_3_0= ruleAbstractTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getFlowAccess().getDomainAbstractTypeRefParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractTypeRef_in_ruleFlow2776);
            lv_domain_3_0=ruleAbstractTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFlowRule());
            	        }
                   		set(
                   			current, 
                   			"domain",
                    		lv_domain_3_0, 
                    		"AbstractTypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1213:2: (otherlv_4= ':' ( (lv_kind_5_0= ruleFlowKind ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>=65 && LA12_1<=67)) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1213:4: otherlv_4= ':' ( (lv_kind_5_0= ruleFlowKind ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleFlow2789); 

                        	newLeafNode(otherlv_4, grammarAccess.getFlowAccess().getColonKeyword_4_0());
                        
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1217:1: ( (lv_kind_5_0= ruleFlowKind ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1218:1: (lv_kind_5_0= ruleFlowKind )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1218:1: (lv_kind_5_0= ruleFlowKind )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1219:3: lv_kind_5_0= ruleFlowKind
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlowAccess().getKindFlowKindEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFlowKind_in_ruleFlow2810);
                    lv_kind_5_0=ruleFlowKind();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlowRule());
                    	        }
                           		set(
                           			current, 
                           			"kind",
                            		lv_kind_5_0, 
                            		"FlowKind");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1235:4: (otherlv_6= ':' ( (lv_attribute_7_0= ruleVariableAttribute ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1235:6: otherlv_6= ':' ( (lv_attribute_7_0= ruleVariableAttribute ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleFlow2825); 

                        	newLeafNode(otherlv_6, grammarAccess.getFlowAccess().getColonKeyword_5_0());
                        
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1239:1: ( (lv_attribute_7_0= ruleVariableAttribute ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1240:1: (lv_attribute_7_0= ruleVariableAttribute )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1240:1: (lv_attribute_7_0= ruleVariableAttribute )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1241:3: lv_attribute_7_0= ruleVariableAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlowAccess().getAttributeVariableAttributeParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableAttribute_in_ruleFlow2846);
                    lv_attribute_7_0=ruleVariableAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlowRule());
                    	        }
                           		set(
                           			current, 
                           			"attribute",
                            		lv_attribute_7_0, 
                            		"VariableAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleFlow2860); 

                	newLeafNode(otherlv_8, grammarAccess.getFlowAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlow"


    // $ANTLR start "entryRuleEventSpecification"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1269:1: entryRuleEventSpecification returns [EObject current=null] : iv_ruleEventSpecification= ruleEventSpecification EOF ;
    public final EObject entryRuleEventSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSpecification = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1270:2: (iv_ruleEventSpecification= ruleEventSpecification EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1271:2: iv_ruleEventSpecification= ruleEventSpecification EOF
            {
             newCompositeNode(grammarAccess.getEventSpecificationRule()); 
            pushFollow(FOLLOW_ruleEventSpecification_in_entryRuleEventSpecification2896);
            iv_ruleEventSpecification=ruleEventSpecification();

            state._fsp--;

             current =iv_ruleEventSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventSpecification2906); 

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
    // $ANTLR end "entryRuleEventSpecification"


    // $ANTLR start "ruleEventSpecification"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1278:1: ruleEventSpecification returns [EObject current=null] : (otherlv_0= 'event' ( (lv_ownedEvents_1_0= ruleEvent ) )* ) ;
    public final EObject ruleEventSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ownedEvents_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1281:28: ( (otherlv_0= 'event' ( (lv_ownedEvents_1_0= ruleEvent ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1282:1: (otherlv_0= 'event' ( (lv_ownedEvents_1_0= ruleEvent ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1282:1: (otherlv_0= 'event' ( (lv_ownedEvents_1_0= ruleEvent ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1282:3: otherlv_0= 'event' ( (lv_ownedEvents_1_0= ruleEvent ) )*
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleEventSpecification2943); 

                	newLeafNode(otherlv_0, grammarAccess.getEventSpecificationAccess().getEventKeyword_0());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1286:1: ( (lv_ownedEvents_1_0= ruleEvent ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1287:1: (lv_ownedEvents_1_0= ruleEvent )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1287:1: (lv_ownedEvents_1_0= ruleEvent )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1288:3: lv_ownedEvents_1_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEventSpecificationAccess().getOwnedEventsEventParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleEventSpecification2964);
            	    lv_ownedEvents_1_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEventSpecificationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownedEvents",
            	            		lv_ownedEvents_1_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventSpecification"


    // $ANTLR start "entryRuleEvent"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1312:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1313:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1314:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent3001);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent3011); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1321:1: ruleEvent returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_ownedPriority_3_0= rulePriority ) ) otherlv_4= ']' )? (otherlv_5= ':' ( (lv_attribute_6_0= ruleVariableAttribute ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownedPriority_3_0 = null;

        EObject lv_attribute_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1324:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_ownedPriority_3_0= rulePriority ) ) otherlv_4= ']' )? (otherlv_5= ':' ( (lv_attribute_6_0= ruleVariableAttribute ) ) )? otherlv_7= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1325:1: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_ownedPriority_3_0= rulePriority ) ) otherlv_4= ']' )? (otherlv_5= ':' ( (lv_attribute_6_0= ruleVariableAttribute ) ) )? otherlv_7= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1325:1: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_ownedPriority_3_0= rulePriority ) ) otherlv_4= ']' )? (otherlv_5= ':' ( (lv_attribute_6_0= ruleVariableAttribute ) ) )? otherlv_7= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1325:2: () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_ownedPriority_3_0= rulePriority ) ) otherlv_4= ']' )? (otherlv_5= ':' ( (lv_attribute_6_0= ruleVariableAttribute ) ) )? otherlv_7= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1325:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1326:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getEventAccess().getEventAction_0(),
                        current);
                

            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1331:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1332:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1332:1: (lv_name_1_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1333:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent3062); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1349:2: (otherlv_2= '[' ( (lv_ownedPriority_3_0= rulePriority ) ) otherlv_4= ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1349:4: otherlv_2= '[' ( (lv_ownedPriority_3_0= rulePriority ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleEvent3080); 

                        	newLeafNode(otherlv_2, grammarAccess.getEventAccess().getLeftSquareBracketKeyword_2_0());
                        
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1353:1: ( (lv_ownedPriority_3_0= rulePriority ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1354:1: (lv_ownedPriority_3_0= rulePriority )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1354:1: (lv_ownedPriority_3_0= rulePriority )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1355:3: lv_ownedPriority_3_0= rulePriority
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getOwnedPriorityPriorityParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePriority_in_ruleEvent3101);
                    lv_ownedPriority_3_0=rulePriority();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"ownedPriority",
                            		lv_ownedPriority_3_0, 
                            		"Priority");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleEvent3113); 

                        	newLeafNode(otherlv_4, grammarAccess.getEventAccess().getRightSquareBracketKeyword_2_2());
                        

                    }
                    break;

            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1375:3: (otherlv_5= ':' ( (lv_attribute_6_0= ruleVariableAttribute ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1375:5: otherlv_5= ':' ( (lv_attribute_6_0= ruleVariableAttribute ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEvent3128); 

                        	newLeafNode(otherlv_5, grammarAccess.getEventAccess().getColonKeyword_3_0());
                        
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1379:1: ( (lv_attribute_6_0= ruleVariableAttribute ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1380:1: (lv_attribute_6_0= ruleVariableAttribute )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1380:1: (lv_attribute_6_0= ruleVariableAttribute )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1381:3: lv_attribute_6_0= ruleVariableAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getAttributeVariableAttributeParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableAttribute_in_ruleEvent3149);
                    lv_attribute_6_0=ruleVariableAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"attribute",
                            		lv_attribute_6_0, 
                            		"VariableAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleEvent3163); 

                	newLeafNode(otherlv_7, grammarAccess.getEventAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRulePriority"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1409:1: entryRulePriority returns [EObject current=null] : iv_rulePriority= rulePriority EOF ;
    public final EObject entryRulePriority() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePriority = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1410:2: (iv_rulePriority= rulePriority EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1411:2: iv_rulePriority= rulePriority EOF
            {
             newCompositeNode(grammarAccess.getPriorityRule()); 
            pushFollow(FOLLOW_rulePriority_in_entryRulePriority3199);
            iv_rulePriority=rulePriority();

            state._fsp--;

             current =iv_rulePriority; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePriority3209); 

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
    // $ANTLR end "entryRulePriority"


    // $ANTLR start "rulePriority"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1418:1: rulePriority returns [EObject current=null] : ( (otherlv_0= '!' | otherlv_1= 'priority' ) ( (lv_ownedExpression_2_0= ruleAbstractExpression ) ) ) ;
    public final EObject rulePriority() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_ownedExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1421:28: ( ( (otherlv_0= '!' | otherlv_1= 'priority' ) ( (lv_ownedExpression_2_0= ruleAbstractExpression ) ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1422:1: ( (otherlv_0= '!' | otherlv_1= 'priority' ) ( (lv_ownedExpression_2_0= ruleAbstractExpression ) ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1422:1: ( (otherlv_0= '!' | otherlv_1= 'priority' ) ( (lv_ownedExpression_2_0= ruleAbstractExpression ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1422:2: (otherlv_0= '!' | otherlv_1= 'priority' ) ( (lv_ownedExpression_2_0= ruleAbstractExpression ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1422:2: (otherlv_0= '!' | otherlv_1= 'priority' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            else if ( (LA17_0==28) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1422:4: otherlv_0= '!'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_27_in_rulePriority3247); 

                        	newLeafNode(otherlv_0, grammarAccess.getPriorityAccess().getExclamationMarkKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1427:7: otherlv_1= 'priority'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_rulePriority3265); 

                        	newLeafNode(otherlv_1, grammarAccess.getPriorityAccess().getPriorityKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1431:2: ( (lv_ownedExpression_2_0= ruleAbstractExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1432:1: (lv_ownedExpression_2_0= ruleAbstractExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1432:1: (lv_ownedExpression_2_0= ruleAbstractExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1433:3: lv_ownedExpression_2_0= ruleAbstractExpression
            {
             
            	        newCompositeNode(grammarAccess.getPriorityAccess().getOwnedExpressionAbstractExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractExpression_in_rulePriority3287);
            lv_ownedExpression_2_0=ruleAbstractExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPriorityRule());
            	        }
                   		set(
                   			current, 
                   			"ownedExpression",
                    		lv_ownedExpression_2_0, 
                    		"AbstractExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePriority"


    // $ANTLR start "entryRuleStateSpecification"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1457:1: entryRuleStateSpecification returns [EObject current=null] : iv_ruleStateSpecification= ruleStateSpecification EOF ;
    public final EObject entryRuleStateSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateSpecification = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1458:2: (iv_ruleStateSpecification= ruleStateSpecification EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1459:2: iv_ruleStateSpecification= ruleStateSpecification EOF
            {
             newCompositeNode(grammarAccess.getStateSpecificationRule()); 
            pushFollow(FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3323);
            iv_ruleStateSpecification=ruleStateSpecification();

            state._fsp--;

             current =iv_ruleStateSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateSpecification3333); 

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
    // $ANTLR end "entryRuleStateSpecification"


    // $ANTLR start "ruleStateSpecification"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1466:1: ruleStateSpecification returns [EObject current=null] : (otherlv_0= 'state' ( (lv_ownedStates_1_0= ruleState ) )* ) ;
    public final EObject ruleStateSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ownedStates_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1469:28: ( (otherlv_0= 'state' ( (lv_ownedStates_1_0= ruleState ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1470:1: (otherlv_0= 'state' ( (lv_ownedStates_1_0= ruleState ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1470:1: (otherlv_0= 'state' ( (lv_ownedStates_1_0= ruleState ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1470:3: otherlv_0= 'state' ( (lv_ownedStates_1_0= ruleState ) )*
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleStateSpecification3370); 

                	newLeafNode(otherlv_0, grammarAccess.getStateSpecificationAccess().getStateKeyword_0());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1474:1: ( (lv_ownedStates_1_0= ruleState ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1475:1: (lv_ownedStates_1_0= ruleState )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1475:1: (lv_ownedStates_1_0= ruleState )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1476:3: lv_ownedStates_1_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateSpecificationAccess().getOwnedStatesStateParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleStateSpecification3391);
            	    lv_ownedStates_1_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateSpecificationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownedStates",
            	            		lv_ownedStates_1_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateSpecification"


    // $ANTLR start "entryRuleState"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1500:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1501:2: (iv_ruleState= ruleState EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1502:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState3428);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState3438); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1509:1: ruleState returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domain_3_0= ruleAbstractTypeRef ) ) (otherlv_4= ':' ( (lv_attribute_5_0= ruleVariableAttribute ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_domain_3_0 = null;

        EObject lv_attribute_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1512:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domain_3_0= ruleAbstractTypeRef ) ) (otherlv_4= ':' ( (lv_attribute_5_0= ruleVariableAttribute ) ) )? otherlv_6= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1513:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domain_3_0= ruleAbstractTypeRef ) ) (otherlv_4= ':' ( (lv_attribute_5_0= ruleVariableAttribute ) ) )? otherlv_6= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1513:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domain_3_0= ruleAbstractTypeRef ) ) (otherlv_4= ':' ( (lv_attribute_5_0= ruleVariableAttribute ) ) )? otherlv_6= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1513:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_domain_3_0= ruleAbstractTypeRef ) ) (otherlv_4= ':' ( (lv_attribute_5_0= ruleVariableAttribute ) ) )? otherlv_6= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1513:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1514:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateAccess().getStateAction_0(),
                        current);
                

            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1519:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1520:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1520:1: (lv_name_1_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1521:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState3489); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleState3506); 

                	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getColonKeyword_2());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1541:1: ( (lv_domain_3_0= ruleAbstractTypeRef ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1542:1: (lv_domain_3_0= ruleAbstractTypeRef )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1542:1: (lv_domain_3_0= ruleAbstractTypeRef )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1543:3: lv_domain_3_0= ruleAbstractTypeRef
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getDomainAbstractTypeRefParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractTypeRef_in_ruleState3527);
            lv_domain_3_0=ruleAbstractTypeRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateRule());
            	        }
                   		set(
                   			current, 
                   			"domain",
                    		lv_domain_3_0, 
                    		"AbstractTypeRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1559:2: (otherlv_4= ':' ( (lv_attribute_5_0= ruleVariableAttribute ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==14) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1559:4: otherlv_4= ':' ( (lv_attribute_5_0= ruleVariableAttribute ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleState3540); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getColonKeyword_4_0());
                        
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1563:1: ( (lv_attribute_5_0= ruleVariableAttribute ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1564:1: (lv_attribute_5_0= ruleVariableAttribute )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1564:1: (lv_attribute_5_0= ruleVariableAttribute )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1565:3: lv_attribute_5_0= ruleVariableAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getAttributeVariableAttributeParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVariableAttribute_in_ruleState3561);
                    lv_attribute_5_0=ruleVariableAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	        }
                           		set(
                           			current, 
                           			"attribute",
                            		lv_attribute_5_0, 
                            		"VariableAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleState3575); 

                	newLeafNode(otherlv_6, grammarAccess.getStateAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleAbstractTypeRef"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1593:1: entryRuleAbstractTypeRef returns [EObject current=null] : iv_ruleAbstractTypeRef= ruleAbstractTypeRef EOF ;
    public final EObject entryRuleAbstractTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractTypeRef = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1594:2: (iv_ruleAbstractTypeRef= ruleAbstractTypeRef EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1595:2: iv_ruleAbstractTypeRef= ruleAbstractTypeRef EOF
            {
             newCompositeNode(grammarAccess.getAbstractTypeRefRule()); 
            pushFollow(FOLLOW_ruleAbstractTypeRef_in_entryRuleAbstractTypeRef3611);
            iv_ruleAbstractTypeRef=ruleAbstractTypeRef();

            state._fsp--;

             current =iv_ruleAbstractTypeRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractTypeRef3621); 

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
    // $ANTLR end "entryRuleAbstractTypeRef"


    // $ANTLR start "ruleAbstractTypeRef"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1602:1: ruleAbstractTypeRef returns [EObject current=null] : (this_DomainRef_0= ruleDomainRef | this_AbstractDomain_1= ruleAbstractDomain ) ;
    public final EObject ruleAbstractTypeRef() throws RecognitionException {
        EObject current = null;

        EObject this_DomainRef_0 = null;

        EObject this_AbstractDomain_1 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1605:28: ( (this_DomainRef_0= ruleDomainRef | this_AbstractDomain_1= ruleAbstractDomain ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1606:1: (this_DomainRef_0= ruleDomainRef | this_AbstractDomain_1= ruleAbstractDomain )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1606:1: (this_DomainRef_0= ruleDomainRef | this_AbstractDomain_1= ruleAbstractDomain )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==16||LA20_0==19||(LA20_0>=63 && LA20_0<=64)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1607:5: this_DomainRef_0= ruleDomainRef
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTypeRefAccess().getDomainRefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDomainRef_in_ruleAbstractTypeRef3668);
                    this_DomainRef_0=ruleDomainRef();

                    state._fsp--;

                     
                            current = this_DomainRef_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1617:5: this_AbstractDomain_1= ruleAbstractDomain
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractTypeRefAccess().getAbstractDomainParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAbstractDomain_in_ruleAbstractTypeRef3695);
                    this_AbstractDomain_1=ruleAbstractDomain();

                    state._fsp--;

                     
                            current = this_AbstractDomain_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractTypeRef"


    // $ANTLR start "entryRuleDomainRef"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1633:1: entryRuleDomainRef returns [EObject current=null] : iv_ruleDomainRef= ruleDomainRef EOF ;
    public final EObject entryRuleDomainRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainRef = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1634:2: (iv_ruleDomainRef= ruleDomainRef EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1635:2: iv_ruleDomainRef= ruleDomainRef EOF
            {
             newCompositeNode(grammarAccess.getDomainRefRule()); 
            pushFollow(FOLLOW_ruleDomainRef_in_entryRuleDomainRef3730);
            iv_ruleDomainRef=ruleDomainRef();

            state._fsp--;

             current =iv_ruleDomainRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainRef3740); 

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1642:1: ruleDomainRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleDomainRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1645:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1646:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1646:1: ( (otherlv_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1647:1: (otherlv_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1647:1: (otherlv_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1648:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDomainRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDomainRef3784); 

            		newLeafNode(otherlv_0, grammarAccess.getDomainRefAccess().getReferenceDomainCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleNodeInstanceSpecification"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1667:1: entryRuleNodeInstanceSpecification returns [EObject current=null] : iv_ruleNodeInstanceSpecification= ruleNodeInstanceSpecification EOF ;
    public final EObject entryRuleNodeInstanceSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeInstanceSpecification = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1668:2: (iv_ruleNodeInstanceSpecification= ruleNodeInstanceSpecification EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1669:2: iv_ruleNodeInstanceSpecification= ruleNodeInstanceSpecification EOF
            {
             newCompositeNode(grammarAccess.getNodeInstanceSpecificationRule()); 
            pushFollow(FOLLOW_ruleNodeInstanceSpecification_in_entryRuleNodeInstanceSpecification3819);
            iv_ruleNodeInstanceSpecification=ruleNodeInstanceSpecification();

            state._fsp--;

             current =iv_ruleNodeInstanceSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeInstanceSpecification3829); 

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
    // $ANTLR end "entryRuleNodeInstanceSpecification"


    // $ANTLR start "ruleNodeInstanceSpecification"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1676:1: ruleNodeInstanceSpecification returns [EObject current=null] : (otherlv_0= 'sub' ( (lv_ownedNodeInstances_1_0= ruleNodeInstance ) )* ) ;
    public final EObject ruleNodeInstanceSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ownedNodeInstances_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1679:28: ( (otherlv_0= 'sub' ( (lv_ownedNodeInstances_1_0= ruleNodeInstance ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1680:1: (otherlv_0= 'sub' ( (lv_ownedNodeInstances_1_0= ruleNodeInstance ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1680:1: (otherlv_0= 'sub' ( (lv_ownedNodeInstances_1_0= ruleNodeInstance ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1680:3: otherlv_0= 'sub' ( (lv_ownedNodeInstances_1_0= ruleNodeInstance ) )*
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleNodeInstanceSpecification3866); 

                	newLeafNode(otherlv_0, grammarAccess.getNodeInstanceSpecificationAccess().getSubKeyword_0());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1684:1: ( (lv_ownedNodeInstances_1_0= ruleNodeInstance ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1685:1: (lv_ownedNodeInstances_1_0= ruleNodeInstance )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1685:1: (lv_ownedNodeInstances_1_0= ruleNodeInstance )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1686:3: lv_ownedNodeInstances_1_0= ruleNodeInstance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNodeInstanceSpecificationAccess().getOwnedNodeInstancesNodeInstanceParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNodeInstance_in_ruleNodeInstanceSpecification3887);
            	    lv_ownedNodeInstances_1_0=ruleNodeInstance();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNodeInstanceSpecificationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownedNodeInstances",
            	            		lv_ownedNodeInstances_1_0, 
            	            		"NodeInstance");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeInstanceSpecification"


    // $ANTLR start "entryRuleNodeInstance"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1710:1: entryRuleNodeInstance returns [EObject current=null] : iv_ruleNodeInstance= ruleNodeInstance EOF ;
    public final EObject entryRuleNodeInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeInstance = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1711:2: (iv_ruleNodeInstance= ruleNodeInstance EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1712:2: iv_ruleNodeInstance= ruleNodeInstance EOF
            {
             newCompositeNode(grammarAccess.getNodeInstanceRule()); 
            pushFollow(FOLLOW_ruleNodeInstance_in_entryRuleNodeInstance3924);
            iv_ruleNodeInstance=ruleNodeInstance();

            state._fsp--;

             current =iv_ruleNodeInstance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeInstance3934); 

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
    // $ANTLR end "entryRuleNodeInstance"


    // $ANTLR start "ruleNodeInstance"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1719:1: ruleNodeInstance returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleNodeInstance() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1722:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1723:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1723:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1723:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1723:2: ()
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1724:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getNodeInstanceAccess().getNodeInstanceAction_0(),
                        current);
                

            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1729:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1730:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1730:1: (lv_name_1_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1731:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeInstance3985); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNodeInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeInstanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleNodeInstance4002); 

                	newLeafNode(otherlv_2, grammarAccess.getNodeInstanceAccess().getColonKeyword_2());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1751:1: ( (otherlv_3= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1752:1: (otherlv_3= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1752:1: (otherlv_3= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1753:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNodeInstanceRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNodeInstance4022); 

            		newLeafNode(otherlv_3, grammarAccess.getNodeInstanceAccess().getNodeTypeNodeCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleNodeInstance4034); 

                	newLeafNode(otherlv_4, grammarAccess.getNodeInstanceAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeInstance"


    // $ANTLR start "entryRuleAssertSpecification"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1776:1: entryRuleAssertSpecification returns [EObject current=null] : iv_ruleAssertSpecification= ruleAssertSpecification EOF ;
    public final EObject entryRuleAssertSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssertSpecification = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1777:2: (iv_ruleAssertSpecification= ruleAssertSpecification EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1778:2: iv_ruleAssertSpecification= ruleAssertSpecification EOF
            {
             newCompositeNode(grammarAccess.getAssertSpecificationRule()); 
            pushFollow(FOLLOW_ruleAssertSpecification_in_entryRuleAssertSpecification4070);
            iv_ruleAssertSpecification=ruleAssertSpecification();

            state._fsp--;

             current =iv_ruleAssertSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertSpecification4080); 

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
    // $ANTLR end "entryRuleAssertSpecification"


    // $ANTLR start "ruleAssertSpecification"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1785:1: ruleAssertSpecification returns [EObject current=null] : (otherlv_0= 'assert' ( (lv_ownedAsserts_1_0= ruleAssert ) )* ) ;
    public final EObject ruleAssertSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ownedAsserts_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1788:28: ( (otherlv_0= 'assert' ( (lv_ownedAsserts_1_0= ruleAssert ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1789:1: (otherlv_0= 'assert' ( (lv_ownedAsserts_1_0= ruleAssert ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1789:1: (otherlv_0= 'assert' ( (lv_ownedAsserts_1_0= ruleAssert ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1789:3: otherlv_0= 'assert' ( (lv_ownedAsserts_1_0= ruleAssert ) )*
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleAssertSpecification4117); 

                	newLeafNode(otherlv_0, grammarAccess.getAssertSpecificationAccess().getAssertKeyword_0());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1793:1: ( (lv_ownedAsserts_1_0= ruleAssert ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||(LA22_0>=RULE_STRING && LA22_0<=RULE_INT)||LA22_0==41||LA22_0==43||(LA22_0>=56 && LA22_0<=58)||(LA22_0>=61 && LA22_0<=62)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1794:1: (lv_ownedAsserts_1_0= ruleAssert )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1794:1: (lv_ownedAsserts_1_0= ruleAssert )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1795:3: lv_ownedAsserts_1_0= ruleAssert
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssertSpecificationAccess().getOwnedAssertsAssertParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssert_in_ruleAssertSpecification4138);
            	    lv_ownedAsserts_1_0=ruleAssert();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssertSpecificationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownedAsserts",
            	            		lv_ownedAsserts_1_0, 
            	            		"Assert");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssertSpecification"


    // $ANTLR start "entryRuleAssert"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1819:1: entryRuleAssert returns [EObject current=null] : iv_ruleAssert= ruleAssert EOF ;
    public final EObject entryRuleAssert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssert = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1820:2: (iv_ruleAssert= ruleAssert EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1821:2: iv_ruleAssert= ruleAssert EOF
            {
             newCompositeNode(grammarAccess.getAssertRule()); 
            pushFollow(FOLLOW_ruleAssert_in_entryRuleAssert4175);
            iv_ruleAssert=ruleAssert();

            state._fsp--;

             current =iv_ruleAssert; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssert4185); 

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
    // $ANTLR end "entryRuleAssert"


    // $ANTLR start "ruleAssert"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1828:1: ruleAssert returns [EObject current=null] : ( ( (lv_ownedExpressions_0_0= ruleAbstractBooleanExpression ) ) otherlv_1= ';' ) ;
    public final EObject ruleAssert() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_ownedExpressions_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1831:28: ( ( ( (lv_ownedExpressions_0_0= ruleAbstractBooleanExpression ) ) otherlv_1= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1832:1: ( ( (lv_ownedExpressions_0_0= ruleAbstractBooleanExpression ) ) otherlv_1= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1832:1: ( ( (lv_ownedExpressions_0_0= ruleAbstractBooleanExpression ) ) otherlv_1= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1832:2: ( (lv_ownedExpressions_0_0= ruleAbstractBooleanExpression ) ) otherlv_1= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1832:2: ( (lv_ownedExpressions_0_0= ruleAbstractBooleanExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1833:1: (lv_ownedExpressions_0_0= ruleAbstractBooleanExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1833:1: (lv_ownedExpressions_0_0= ruleAbstractBooleanExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1834:3: lv_ownedExpressions_0_0= ruleAbstractBooleanExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssertAccess().getOwnedExpressionsAbstractBooleanExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractBooleanExpression_in_ruleAssert4231);
            lv_ownedExpressions_0_0=ruleAbstractBooleanExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssertRule());
            	        }
                   		add(
                   			current, 
                   			"ownedExpressions",
                    		lv_ownedExpressions_0_0, 
                    		"AbstractBooleanExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleAssert4243); 

                	newLeafNode(otherlv_1, grammarAccess.getAssertAccess().getSemicolonKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssert"


    // $ANTLR start "entryRuleVectorSpecification"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1862:1: entryRuleVectorSpecification returns [EObject current=null] : iv_ruleVectorSpecification= ruleVectorSpecification EOF ;
    public final EObject entryRuleVectorSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorSpecification = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1863:2: (iv_ruleVectorSpecification= ruleVectorSpecification EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1864:2: iv_ruleVectorSpecification= ruleVectorSpecification EOF
            {
             newCompositeNode(grammarAccess.getVectorSpecificationRule()); 
            pushFollow(FOLLOW_ruleVectorSpecification_in_entryRuleVectorSpecification4279);
            iv_ruleVectorSpecification=ruleVectorSpecification();

            state._fsp--;

             current =iv_ruleVectorSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVectorSpecification4289); 

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
    // $ANTLR end "entryRuleVectorSpecification"


    // $ANTLR start "ruleVectorSpecification"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1871:1: ruleVectorSpecification returns [EObject current=null] : (otherlv_0= 'sync' ( (lv_ownedVectors_1_0= ruleVector ) )* ) ;
    public final EObject ruleVectorSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ownedVectors_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1874:28: ( (otherlv_0= 'sync' ( (lv_ownedVectors_1_0= ruleVector ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1875:1: (otherlv_0= 'sync' ( (lv_ownedVectors_1_0= ruleVector ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1875:1: (otherlv_0= 'sync' ( (lv_ownedVectors_1_0= ruleVector ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1875:3: otherlv_0= 'sync' ( (lv_ownedVectors_1_0= ruleVector ) )*
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleVectorSpecification4326); 

                	newLeafNode(otherlv_0, grammarAccess.getVectorSpecificationAccess().getSyncKeyword_0());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1879:1: ( (lv_ownedVectors_1_0= ruleVector ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==33) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1880:1: (lv_ownedVectors_1_0= ruleVector )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1880:1: (lv_ownedVectors_1_0= ruleVector )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1881:3: lv_ownedVectors_1_0= ruleVector
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVectorSpecificationAccess().getOwnedVectorsVectorParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVector_in_ruleVectorSpecification4347);
            	    lv_ownedVectors_1_0=ruleVector();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVectorSpecificationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownedVectors",
            	            		lv_ownedVectors_1_0, 
            	            		"Vector");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVectorSpecification"


    // $ANTLR start "entryRuleVector"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1905:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1906:2: (iv_ruleVector= ruleVector EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1907:2: iv_ruleVector= ruleVector EOF
            {
             newCompositeNode(grammarAccess.getVectorRule()); 
            pushFollow(FOLLOW_ruleVector_in_entryRuleVector4384);
            iv_ruleVector=ruleVector();

            state._fsp--;

             current =iv_ruleVector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVector4394); 

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
    // $ANTLR end "entryRuleVector"


    // $ANTLR start "ruleVector"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1914:1: ruleVector returns [EObject current=null] : (otherlv_0= '<' ( (lv_ownedParameters_1_0= ruleVectorParameter ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleVectorParameter ) ) )* otherlv_4= '>' (otherlv_5= '[' ( (lv_cardinality_6_0= ruleCardinality ) ) otherlv_7= ']' )? otherlv_8= ';' ) ;
    public final EObject ruleVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_ownedParameters_1_0 = null;

        EObject lv_ownedParameters_3_0 = null;

        EObject lv_cardinality_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1917:28: ( (otherlv_0= '<' ( (lv_ownedParameters_1_0= ruleVectorParameter ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleVectorParameter ) ) )* otherlv_4= '>' (otherlv_5= '[' ( (lv_cardinality_6_0= ruleCardinality ) ) otherlv_7= ']' )? otherlv_8= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1918:1: (otherlv_0= '<' ( (lv_ownedParameters_1_0= ruleVectorParameter ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleVectorParameter ) ) )* otherlv_4= '>' (otherlv_5= '[' ( (lv_cardinality_6_0= ruleCardinality ) ) otherlv_7= ']' )? otherlv_8= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1918:1: (otherlv_0= '<' ( (lv_ownedParameters_1_0= ruleVectorParameter ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleVectorParameter ) ) )* otherlv_4= '>' (otherlv_5= '[' ( (lv_cardinality_6_0= ruleCardinality ) ) otherlv_7= ']' )? otherlv_8= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1918:3: otherlv_0= '<' ( (lv_ownedParameters_1_0= ruleVectorParameter ) ) (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleVectorParameter ) ) )* otherlv_4= '>' (otherlv_5= '[' ( (lv_cardinality_6_0= ruleCardinality ) ) otherlv_7= ']' )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleVector4431); 

                	newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getLessThanSignKeyword_0());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1922:1: ( (lv_ownedParameters_1_0= ruleVectorParameter ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1923:1: (lv_ownedParameters_1_0= ruleVectorParameter )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1923:1: (lv_ownedParameters_1_0= ruleVectorParameter )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1924:3: lv_ownedParameters_1_0= ruleVectorParameter
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getOwnedParametersVectorParameterParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleVectorParameter_in_ruleVector4452);
            lv_ownedParameters_1_0=ruleVectorParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVectorRule());
            	        }
                   		add(
                   			current, 
                   			"ownedParameters",
                    		lv_ownedParameters_1_0, 
                    		"VectorParameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1940:2: (otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleVectorParameter ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==17) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1940:4: otherlv_2= ',' ( (lv_ownedParameters_3_0= ruleVectorParameter ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleVector4465); 

            	        	newLeafNode(otherlv_2, grammarAccess.getVectorAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1944:1: ( (lv_ownedParameters_3_0= ruleVectorParameter ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1945:1: (lv_ownedParameters_3_0= ruleVectorParameter )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1945:1: (lv_ownedParameters_3_0= ruleVectorParameter )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1946:3: lv_ownedParameters_3_0= ruleVectorParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVectorAccess().getOwnedParametersVectorParameterParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVectorParameter_in_ruleVector4486);
            	    lv_ownedParameters_3_0=ruleVectorParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVectorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownedParameters",
            	            		lv_ownedParameters_3_0, 
            	            		"VectorParameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleVector4500); 

                	newLeafNode(otherlv_4, grammarAccess.getVectorAccess().getGreaterThanSignKeyword_3());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1966:1: (otherlv_5= '[' ( (lv_cardinality_6_0= ruleCardinality ) ) otherlv_7= ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==16) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1966:3: otherlv_5= '[' ( (lv_cardinality_6_0= ruleCardinality ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleVector4513); 

                        	newLeafNode(otherlv_5, grammarAccess.getVectorAccess().getLeftSquareBracketKeyword_4_0());
                        
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1970:1: ( (lv_cardinality_6_0= ruleCardinality ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1971:1: (lv_cardinality_6_0= ruleCardinality )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1971:1: (lv_cardinality_6_0= ruleCardinality )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:1972:3: lv_cardinality_6_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getVectorAccess().getCardinalityCardinalityParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleVector4534);
                    lv_cardinality_6_0=ruleCardinality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVectorRule());
                    	        }
                           		set(
                           			current, 
                           			"cardinality",
                            		lv_cardinality_6_0, 
                            		"Cardinality");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleVector4546); 

                        	newLeafNode(otherlv_7, grammarAccess.getVectorAccess().getRightSquareBracketKeyword_4_2());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleVector4560); 

                	newLeafNode(otherlv_8, grammarAccess.getVectorAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVector"


    // $ANTLR start "entryRuleVectorParameter"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2004:1: entryRuleVectorParameter returns [EObject current=null] : iv_ruleVectorParameter= ruleVectorParameter EOF ;
    public final EObject entryRuleVectorParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorParameter = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2005:2: (iv_ruleVectorParameter= ruleVectorParameter EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2006:2: iv_ruleVectorParameter= ruleVectorParameter EOF
            {
             newCompositeNode(grammarAccess.getVectorParameterRule()); 
            pushFollow(FOLLOW_ruleVectorParameter_in_entryRuleVectorParameter4596);
            iv_ruleVectorParameter=ruleVectorParameter();

            state._fsp--;

             current =iv_ruleVectorParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVectorParameter4606); 

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
    // $ANTLR end "entryRuleVectorParameter"


    // $ANTLR start "ruleVectorParameter"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2013:1: ruleVectorParameter returns [EObject current=null] : ( ( (lv_eventParameter_0_0= ruleEventRef ) ) ( (lv_isRequired_1_0= '?' ) )? ) ;
    public final EObject ruleVectorParameter() throws RecognitionException {
        EObject current = null;

        Token lv_isRequired_1_0=null;
        EObject lv_eventParameter_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2016:28: ( ( ( (lv_eventParameter_0_0= ruleEventRef ) ) ( (lv_isRequired_1_0= '?' ) )? ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2017:1: ( ( (lv_eventParameter_0_0= ruleEventRef ) ) ( (lv_isRequired_1_0= '?' ) )? )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2017:1: ( ( (lv_eventParameter_0_0= ruleEventRef ) ) ( (lv_isRequired_1_0= '?' ) )? )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2017:2: ( (lv_eventParameter_0_0= ruleEventRef ) ) ( (lv_isRequired_1_0= '?' ) )?
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2017:2: ( (lv_eventParameter_0_0= ruleEventRef ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2018:1: (lv_eventParameter_0_0= ruleEventRef )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2018:1: (lv_eventParameter_0_0= ruleEventRef )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2019:3: lv_eventParameter_0_0= ruleEventRef
            {
             
            	        newCompositeNode(grammarAccess.getVectorParameterAccess().getEventParameterEventRefParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEventRef_in_ruleVectorParameter4652);
            lv_eventParameter_0_0=ruleEventRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVectorParameterRule());
            	        }
                   		set(
                   			current, 
                   			"eventParameter",
                    		lv_eventParameter_0_0, 
                    		"EventRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2035:2: ( (lv_isRequired_1_0= '?' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2036:1: (lv_isRequired_1_0= '?' )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2036:1: (lv_isRequired_1_0= '?' )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2037:3: lv_isRequired_1_0= '?'
                    {
                    lv_isRequired_1_0=(Token)match(input,35,FOLLOW_35_in_ruleVectorParameter4670); 

                            newLeafNode(lv_isRequired_1_0, grammarAccess.getVectorParameterAccess().getIsRequiredQuestionMarkKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVectorParameterRule());
                    	        }
                           		setWithLastConsumed(current, "isRequired", true, "?");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVectorParameter"


    // $ANTLR start "entryRuleCardinality"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2058:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2059:2: (iv_ruleCardinality= ruleCardinality EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2060:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality4720);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality4730); 

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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2067:1: ruleCardinality returns [EObject current=null] : ( (otherlv_0= '>' ( (lv_expression_1_0= ruleAbstractExpression ) ) ) | (otherlv_2= '>=' ( (lv_expression_3_0= ruleAbstractExpression ) ) ) | (otherlv_4= '=' ( (lv_expression_5_0= ruleAbstractExpression ) ) ) ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_expression_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2070:28: ( ( (otherlv_0= '>' ( (lv_expression_1_0= ruleAbstractExpression ) ) ) | (otherlv_2= '>=' ( (lv_expression_3_0= ruleAbstractExpression ) ) ) | (otherlv_4= '=' ( (lv_expression_5_0= ruleAbstractExpression ) ) ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2071:1: ( (otherlv_0= '>' ( (lv_expression_1_0= ruleAbstractExpression ) ) ) | (otherlv_2= '>=' ( (lv_expression_3_0= ruleAbstractExpression ) ) ) | (otherlv_4= '=' ( (lv_expression_5_0= ruleAbstractExpression ) ) ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2071:1: ( (otherlv_0= '>' ( (lv_expression_1_0= ruleAbstractExpression ) ) ) | (otherlv_2= '>=' ( (lv_expression_3_0= ruleAbstractExpression ) ) ) | (otherlv_4= '=' ( (lv_expression_5_0= ruleAbstractExpression ) ) ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt27=1;
                }
                break;
            case 36:
                {
                alt27=2;
                }
                break;
            case 13:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2071:2: (otherlv_0= '>' ( (lv_expression_1_0= ruleAbstractExpression ) ) )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2071:2: (otherlv_0= '>' ( (lv_expression_1_0= ruleAbstractExpression ) ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2071:4: otherlv_0= '>' ( (lv_expression_1_0= ruleAbstractExpression ) )
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleCardinality4768); 

                        	newLeafNode(otherlv_0, grammarAccess.getCardinalityAccess().getGreaterThanSignKeyword_0_0());
                        
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2075:1: ( (lv_expression_1_0= ruleAbstractExpression ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2076:1: (lv_expression_1_0= ruleAbstractExpression )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2076:1: (lv_expression_1_0= ruleAbstractExpression )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2077:3: lv_expression_1_0= ruleAbstractExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardinalityAccess().getExpressionAbstractExpressionParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractExpression_in_ruleCardinality4789);
                    lv_expression_1_0=ruleAbstractExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCardinalityRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_1_0, 
                            		"AbstractExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2094:6: (otherlv_2= '>=' ( (lv_expression_3_0= ruleAbstractExpression ) ) )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2094:6: (otherlv_2= '>=' ( (lv_expression_3_0= ruleAbstractExpression ) ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2094:8: otherlv_2= '>=' ( (lv_expression_3_0= ruleAbstractExpression ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleCardinality4809); 

                        	newLeafNode(otherlv_2, grammarAccess.getCardinalityAccess().getGreaterThanSignEqualsSignKeyword_1_0());
                        
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2098:1: ( (lv_expression_3_0= ruleAbstractExpression ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2099:1: (lv_expression_3_0= ruleAbstractExpression )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2099:1: (lv_expression_3_0= ruleAbstractExpression )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2100:3: lv_expression_3_0= ruleAbstractExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardinalityAccess().getExpressionAbstractExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractExpression_in_ruleCardinality4830);
                    lv_expression_3_0=ruleAbstractExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCardinalityRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_3_0, 
                            		"AbstractExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2117:6: (otherlv_4= '=' ( (lv_expression_5_0= ruleAbstractExpression ) ) )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2117:6: (otherlv_4= '=' ( (lv_expression_5_0= ruleAbstractExpression ) ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2117:8: otherlv_4= '=' ( (lv_expression_5_0= ruleAbstractExpression ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleCardinality4850); 

                        	newLeafNode(otherlv_4, grammarAccess.getCardinalityAccess().getEqualsSignKeyword_2_0());
                        
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2121:1: ( (lv_expression_5_0= ruleAbstractExpression ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2122:1: (lv_expression_5_0= ruleAbstractExpression )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2122:1: (lv_expression_5_0= ruleAbstractExpression )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2123:3: lv_expression_5_0= ruleAbstractExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getCardinalityAccess().getExpressionAbstractExpressionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractExpression_in_ruleCardinality4871);
                    lv_expression_5_0=ruleAbstractExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCardinalityRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_5_0, 
                            		"AbstractExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleTransitionSpecification"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2147:1: entryRuleTransitionSpecification returns [EObject current=null] : iv_ruleTransitionSpecification= ruleTransitionSpecification EOF ;
    public final EObject entryRuleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSpecification = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2148:2: (iv_ruleTransitionSpecification= ruleTransitionSpecification EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2149:2: iv_ruleTransitionSpecification= ruleTransitionSpecification EOF
            {
             newCompositeNode(grammarAccess.getTransitionSpecificationRule()); 
            pushFollow(FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification4908);
            iv_ruleTransitionSpecification=ruleTransitionSpecification();

            state._fsp--;

             current =iv_ruleTransitionSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionSpecification4918); 

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
    // $ANTLR end "entryRuleTransitionSpecification"


    // $ANTLR start "ruleTransitionSpecification"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2156:1: ruleTransitionSpecification returns [EObject current=null] : (otherlv_0= 'trans' ( (lv_ownedTransitionTransitions_1_0= ruleTransition ) )* ) ;
    public final EObject ruleTransitionSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_ownedTransitionTransitions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2159:28: ( (otherlv_0= 'trans' ( (lv_ownedTransitionTransitions_1_0= ruleTransition ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2160:1: (otherlv_0= 'trans' ( (lv_ownedTransitionTransitions_1_0= ruleTransition ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2160:1: (otherlv_0= 'trans' ( (lv_ownedTransitionTransitions_1_0= ruleTransition ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2160:3: otherlv_0= 'trans' ( (lv_ownedTransitionTransitions_1_0= ruleTransition ) )*
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleTransitionSpecification4955); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionSpecificationAccess().getTransKeyword_0());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2164:1: ( (lv_ownedTransitionTransitions_1_0= ruleTransition ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||(LA28_0>=RULE_STRING && LA28_0<=RULE_INT)||LA28_0==41||LA28_0==43||(LA28_0>=56 && LA28_0<=58)||(LA28_0>=61 && LA28_0<=62)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2165:1: (lv_ownedTransitionTransitions_1_0= ruleTransition )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2165:1: (lv_ownedTransitionTransitions_1_0= ruleTransition )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2166:3: lv_ownedTransitionTransitions_1_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTransitionSpecificationAccess().getOwnedTransitionTransitionsTransitionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleTransitionSpecification4976);
            	    lv_ownedTransitionTransitions_1_0=ruleTransition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTransitionSpecificationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownedTransitionTransitions",
            	            		lv_ownedTransitionTransitions_1_0, 
            	            		"Transition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitionSpecification"


    // $ANTLR start "entryRuleTransition"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2190:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2191:2: (iv_ruleTransition= ruleTransition EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2192:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition5013);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition5023); 

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2199:1: ruleTransition returns [EObject current=null] : ( ( (lv_ownedExpression_0_0= ruleAbstractExpression ) ) otherlv_1= '|-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( ( (lv_ownedAffectations_4_0= ruleAssignment ) ) (otherlv_5= ',' ( (lv_ownedAffectations_6_0= ruleAssignment ) ) )* )* otherlv_7= ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ownedExpression_0_0 = null;

        EObject lv_ownedAffectations_4_0 = null;

        EObject lv_ownedAffectations_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2202:28: ( ( ( (lv_ownedExpression_0_0= ruleAbstractExpression ) ) otherlv_1= '|-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( ( (lv_ownedAffectations_4_0= ruleAssignment ) ) (otherlv_5= ',' ( (lv_ownedAffectations_6_0= ruleAssignment ) ) )* )* otherlv_7= ';' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2203:1: ( ( (lv_ownedExpression_0_0= ruleAbstractExpression ) ) otherlv_1= '|-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( ( (lv_ownedAffectations_4_0= ruleAssignment ) ) (otherlv_5= ',' ( (lv_ownedAffectations_6_0= ruleAssignment ) ) )* )* otherlv_7= ';' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2203:1: ( ( (lv_ownedExpression_0_0= ruleAbstractExpression ) ) otherlv_1= '|-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( ( (lv_ownedAffectations_4_0= ruleAssignment ) ) (otherlv_5= ',' ( (lv_ownedAffectations_6_0= ruleAssignment ) ) )* )* otherlv_7= ';' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2203:2: ( (lv_ownedExpression_0_0= ruleAbstractExpression ) ) otherlv_1= '|-' ( (otherlv_2= RULE_ID ) ) otherlv_3= '->' ( ( (lv_ownedAffectations_4_0= ruleAssignment ) ) (otherlv_5= ',' ( (lv_ownedAffectations_6_0= ruleAssignment ) ) )* )* otherlv_7= ';'
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2203:2: ( (lv_ownedExpression_0_0= ruleAbstractExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2204:1: (lv_ownedExpression_0_0= ruleAbstractExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2204:1: (lv_ownedExpression_0_0= ruleAbstractExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2205:3: lv_ownedExpression_0_0= ruleAbstractExpression
            {
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getOwnedExpressionAbstractExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractExpression_in_ruleTransition5069);
            lv_ownedExpression_0_0=ruleAbstractExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransitionRule());
            	        }
                   		set(
                   			current, 
                   			"ownedExpression",
                    		lv_ownedExpression_0_0, 
                    		"AbstractExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleTransition5081); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getVerticalLineHyphenMinusKeyword_1());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2225:1: ( (otherlv_2= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2226:1: (otherlv_2= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2226:1: (otherlv_2= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2227:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition5101); 

            		newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getEventEventCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleTransition5113); 

                	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2242:1: ( ( (lv_ownedAffectations_4_0= ruleAssignment ) ) (otherlv_5= ',' ( (lv_ownedAffectations_6_0= ruleAssignment ) ) )* )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2242:2: ( (lv_ownedAffectations_4_0= ruleAssignment ) ) (otherlv_5= ',' ( (lv_ownedAffectations_6_0= ruleAssignment ) ) )*
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2242:2: ( (lv_ownedAffectations_4_0= ruleAssignment ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2243:1: (lv_ownedAffectations_4_0= ruleAssignment )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2243:1: (lv_ownedAffectations_4_0= ruleAssignment )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2244:3: lv_ownedAffectations_4_0= ruleAssignment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTransitionAccess().getOwnedAffectationsAssignmentParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleTransition5135);
            	    lv_ownedAffectations_4_0=ruleAssignment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownedAffectations",
            	            		lv_ownedAffectations_4_0, 
            	            		"Assignment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2260:2: (otherlv_5= ',' ( (lv_ownedAffectations_6_0= ruleAssignment ) ) )*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==17) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2260:4: otherlv_5= ',' ( (lv_ownedAffectations_6_0= ruleAssignment ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleTransition5148); 

            	    	        	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getCommaKeyword_4_1_0());
            	    	        
            	    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2264:1: ( (lv_ownedAffectations_6_0= ruleAssignment ) )
            	    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2265:1: (lv_ownedAffectations_6_0= ruleAssignment )
            	    	    {
            	    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2265:1: (lv_ownedAffectations_6_0= ruleAssignment )
            	    	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2266:3: lv_ownedAffectations_6_0= ruleAssignment
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTransitionAccess().getOwnedAffectationsAssignmentParserRuleCall_4_1_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleAssignment_in_ruleTransition5169);
            	    	    lv_ownedAffectations_6_0=ruleAssignment();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"ownedAffectations",
            	    	            		lv_ownedAffectations_6_0, 
            	    	            		"Assignment");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop29;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_7=(Token)match(input,12,FOLLOW_12_in_ruleTransition5185); 

                	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleAssignment"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2294:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2295:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2296:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment5221);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment5231); 

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2303:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_ownedExpression_2_0= ruleAbstractExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_ownedExpression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2306:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_ownedExpression_2_0= ruleAbstractExpression ) ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2307:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_ownedExpression_2_0= ruleAbstractExpression ) ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2307:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_ownedExpression_2_0= ruleAbstractExpression ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2307:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_ownedExpression_2_0= ruleAbstractExpression ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2307:2: ( (otherlv_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2308:1: (otherlv_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2308:1: (otherlv_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2309:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignmentRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment5276); 

            		newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getStateStateCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleAssignment5288); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2324:1: ( (lv_ownedExpression_2_0= ruleAbstractExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2325:1: (lv_ownedExpression_2_0= ruleAbstractExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2325:1: (lv_ownedExpression_2_0= ruleAbstractExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2326:3: lv_ownedExpression_2_0= ruleAbstractExpression
            {
             
            	        newCompositeNode(grammarAccess.getAssignmentAccess().getOwnedExpressionAbstractExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAbstractExpression_in_ruleAssignment5309);
            lv_ownedExpression_2_0=ruleAbstractExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
            	        }
                   		set(
                   			current, 
                   			"ownedExpression",
                    		lv_ownedExpression_2_0, 
                    		"AbstractExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleAbstractExpression"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2350:1: entryRuleAbstractExpression returns [EObject current=null] : iv_ruleAbstractExpression= ruleAbstractExpression EOF ;
    public final EObject entryRuleAbstractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractExpression = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2351:2: (iv_ruleAbstractExpression= ruleAbstractExpression EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2352:2: iv_ruleAbstractExpression= ruleAbstractExpression EOF
            {
             newCompositeNode(grammarAccess.getAbstractExpressionRule()); 
            pushFollow(FOLLOW_ruleAbstractExpression_in_entryRuleAbstractExpression5345);
            iv_ruleAbstractExpression=ruleAbstractExpression();

            state._fsp--;

             current =iv_ruleAbstractExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractExpression5355); 

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
    // $ANTLR end "entryRuleAbstractExpression"


    // $ANTLR start "ruleAbstractExpression"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2359:1: ruleAbstractExpression returns [EObject current=null] : (this_IfThenElse_0= ruleIfThenElse | this_Switch_1= ruleSwitch | this_Expression_2= ruleExpression ) ;
    public final EObject ruleAbstractExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IfThenElse_0 = null;

        EObject this_Switch_1 = null;

        EObject this_Expression_2 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2362:28: ( (this_IfThenElse_0= ruleIfThenElse | this_Switch_1= ruleSwitch | this_Expression_2= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2363:1: (this_IfThenElse_0= ruleIfThenElse | this_Switch_1= ruleSwitch | this_Expression_2= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2363:1: (this_IfThenElse_0= ruleIfThenElse | this_Switch_1= ruleSwitch | this_Expression_2= ruleExpression )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt31=1;
                }
                break;
            case 41:
                {
                alt31=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 56:
            case 57:
            case 58:
            case 61:
            case 62:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2364:5: this_IfThenElse_0= ruleIfThenElse
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractExpressionAccess().getIfThenElseParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIfThenElse_in_ruleAbstractExpression5402);
                    this_IfThenElse_0=ruleIfThenElse();

                    state._fsp--;

                     
                            current = this_IfThenElse_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2374:5: this_Switch_1= ruleSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractExpressionAccess().getSwitchParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSwitch_in_ruleAbstractExpression5429);
                    this_Switch_1=ruleSwitch();

                    state._fsp--;

                     
                            current = this_Switch_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2384:5: this_Expression_2= ruleExpression
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractExpressionAccess().getExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleAbstractExpression5456);
                    this_Expression_2=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractExpression"


    // $ANTLR start "entryRuleAbstractBooleanExpression"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2400:1: entryRuleAbstractBooleanExpression returns [EObject current=null] : iv_ruleAbstractBooleanExpression= ruleAbstractBooleanExpression EOF ;
    public final EObject entryRuleAbstractBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractBooleanExpression = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2401:2: (iv_ruleAbstractBooleanExpression= ruleAbstractBooleanExpression EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2402:2: iv_ruleAbstractBooleanExpression= ruleAbstractBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getAbstractBooleanExpressionRule()); 
            pushFollow(FOLLOW_ruleAbstractBooleanExpression_in_entryRuleAbstractBooleanExpression5491);
            iv_ruleAbstractBooleanExpression=ruleAbstractBooleanExpression();

            state._fsp--;

             current =iv_ruleAbstractBooleanExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractBooleanExpression5501); 

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
    // $ANTLR end "entryRuleAbstractBooleanExpression"


    // $ANTLR start "ruleAbstractBooleanExpression"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2409:1: ruleAbstractBooleanExpression returns [EObject current=null] : (this_IfThenElse_0= ruleIfThenElse | this_Switch_1= ruleSwitch | this_BooleanExpression_2= ruleBooleanExpression ) ;
    public final EObject ruleAbstractBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IfThenElse_0 = null;

        EObject this_Switch_1 = null;

        EObject this_BooleanExpression_2 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2412:28: ( (this_IfThenElse_0= ruleIfThenElse | this_Switch_1= ruleSwitch | this_BooleanExpression_2= ruleBooleanExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2413:1: (this_IfThenElse_0= ruleIfThenElse | this_Switch_1= ruleSwitch | this_BooleanExpression_2= ruleBooleanExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2413:1: (this_IfThenElse_0= ruleIfThenElse | this_Switch_1= ruleSwitch | this_BooleanExpression_2= ruleBooleanExpression )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt32=1;
                }
                break;
            case 41:
                {
                alt32=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 56:
            case 57:
            case 58:
            case 61:
            case 62:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2414:5: this_IfThenElse_0= ruleIfThenElse
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractBooleanExpressionAccess().getIfThenElseParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIfThenElse_in_ruleAbstractBooleanExpression5548);
                    this_IfThenElse_0=ruleIfThenElse();

                    state._fsp--;

                     
                            current = this_IfThenElse_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2424:5: this_Switch_1= ruleSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractBooleanExpressionAccess().getSwitchParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSwitch_in_ruleAbstractBooleanExpression5575);
                    this_Switch_1=ruleSwitch();

                    state._fsp--;

                     
                            current = this_Switch_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2434:5: this_BooleanExpression_2= ruleBooleanExpression
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractBooleanExpressionAccess().getBooleanExpressionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleAbstractBooleanExpression5602);
                    this_BooleanExpression_2=ruleBooleanExpression();

                    state._fsp--;

                     
                            current = this_BooleanExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractBooleanExpression"


    // $ANTLR start "entryRuleSwitch"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2450:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2451:2: (iv_ruleSwitch= ruleSwitch EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2452:2: iv_ruleSwitch= ruleSwitch EOF
            {
             newCompositeNode(grammarAccess.getSwitchRule()); 
            pushFollow(FOLLOW_ruleSwitch_in_entryRuleSwitch5637);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;

             current =iv_ruleSwitch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch5647); 

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2459:1: ruleSwitch returns [EObject current=null] : (otherlv_0= 'case {' ( (lv_ownedCases_1_0= ruleCaseExpression ) )* otherlv_2= 'else' ( (lv_default_3_0= ruleExpression ) ) otherlv_4= '}' ) ;
    public final EObject ruleSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ownedCases_1_0 = null;

        EObject lv_default_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2462:28: ( (otherlv_0= 'case {' ( (lv_ownedCases_1_0= ruleCaseExpression ) )* otherlv_2= 'else' ( (lv_default_3_0= ruleExpression ) ) otherlv_4= '}' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2463:1: (otherlv_0= 'case {' ( (lv_ownedCases_1_0= ruleCaseExpression ) )* otherlv_2= 'else' ( (lv_default_3_0= ruleExpression ) ) otherlv_4= '}' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2463:1: (otherlv_0= 'case {' ( (lv_ownedCases_1_0= ruleCaseExpression ) )* otherlv_2= 'else' ( (lv_default_3_0= ruleExpression ) ) otherlv_4= '}' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2463:3: otherlv_0= 'case {' ( (lv_ownedCases_1_0= ruleCaseExpression ) )* otherlv_2= 'else' ( (lv_default_3_0= ruleExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleSwitch5684); 

                	newLeafNode(otherlv_0, grammarAccess.getSwitchAccess().getCaseKeyword_0());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2467:1: ( (lv_ownedCases_1_0= ruleCaseExpression ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||(LA33_0>=RULE_STRING && LA33_0<=RULE_INT)||(LA33_0>=56 && LA33_0<=58)||(LA33_0>=61 && LA33_0<=62)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2468:1: (lv_ownedCases_1_0= ruleCaseExpression )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2468:1: (lv_ownedCases_1_0= ruleCaseExpression )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2469:3: lv_ownedCases_1_0= ruleCaseExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSwitchAccess().getOwnedCasesCaseExpressionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCaseExpression_in_ruleSwitch5705);
            	    lv_ownedCases_1_0=ruleCaseExpression();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleSwitch5718); 

                	newLeafNode(otherlv_2, grammarAccess.getSwitchAccess().getElseKeyword_2());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2489:1: ( (lv_default_3_0= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2490:1: (lv_default_3_0= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2490:1: (lv_default_3_0= ruleExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2491:3: lv_default_3_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getSwitchAccess().getDefaultExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleSwitch5739);
            lv_default_3_0=ruleExpression();

            state._fsp--;


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

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleSwitch5751); 

                	newLeafNode(otherlv_4, grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2519:1: entryRuleCaseExpression returns [EObject current=null] : iv_ruleCaseExpression= ruleCaseExpression EOF ;
    public final EObject entryRuleCaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseExpression = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2520:2: (iv_ruleCaseExpression= ruleCaseExpression EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2521:2: iv_ruleCaseExpression= ruleCaseExpression EOF
            {
             newCompositeNode(grammarAccess.getCaseExpressionRule()); 
            pushFollow(FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression5787);
            iv_ruleCaseExpression=ruleCaseExpression();

            state._fsp--;

             current =iv_ruleCaseExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCaseExpression5797); 

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2528:1: ruleCaseExpression returns [EObject current=null] : ( ( (lv_condition_0_0= ruleBooleanExpression ) ) otherlv_1= ':' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= ',' ) ;
    public final EObject ruleCaseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_condition_0_0 = null;

        EObject lv_body_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2531:28: ( ( ( (lv_condition_0_0= ruleBooleanExpression ) ) otherlv_1= ':' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= ',' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2532:1: ( ( (lv_condition_0_0= ruleBooleanExpression ) ) otherlv_1= ':' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= ',' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2532:1: ( ( (lv_condition_0_0= ruleBooleanExpression ) ) otherlv_1= ':' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= ',' )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2532:2: ( (lv_condition_0_0= ruleBooleanExpression ) ) otherlv_1= ':' ( (lv_body_2_0= ruleExpression ) ) otherlv_3= ','
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2532:2: ( (lv_condition_0_0= ruleBooleanExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2533:1: (lv_condition_0_0= ruleBooleanExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2533:1: (lv_condition_0_0= ruleBooleanExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2534:3: lv_condition_0_0= ruleBooleanExpression
            {
             
            	        newCompositeNode(grammarAccess.getCaseExpressionAccess().getConditionBooleanExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBooleanExpression_in_ruleCaseExpression5843);
            lv_condition_0_0=ruleBooleanExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCaseExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_0_0, 
                    		"BooleanExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleCaseExpression5855); 

                	newLeafNode(otherlv_1, grammarAccess.getCaseExpressionAccess().getColonKeyword_1());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2554:1: ( (lv_body_2_0= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2555:1: (lv_body_2_0= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2555:1: (lv_body_2_0= ruleExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2556:3: lv_body_2_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getCaseExpressionAccess().getBodyExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleCaseExpression5876);
            lv_body_2_0=ruleExpression();

            state._fsp--;


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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleCaseExpression5888); 

                	newLeafNode(otherlv_3, grammarAccess.getCaseExpressionAccess().getCommaKeyword_3());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleIfThenElse"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2584:1: entryRuleIfThenElse returns [EObject current=null] : iv_ruleIfThenElse= ruleIfThenElse EOF ;
    public final EObject entryRuleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2585:2: (iv_ruleIfThenElse= ruleIfThenElse EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2586:2: iv_ruleIfThenElse= ruleIfThenElse EOF
            {
             newCompositeNode(grammarAccess.getIfThenElseRule()); 
            pushFollow(FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse5924);
            iv_ruleIfThenElse=ruleIfThenElse();

            state._fsp--;

             current =iv_ruleIfThenElse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfThenElse5934); 

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2593:1: ruleIfThenElse returns [EObject current=null] : (otherlv_0= 'if' ( (lv_condition_1_0= ruleBooleanExpression ) ) otherlv_2= 'then' ( ( (lv_then_3_1= ruleSwitch | lv_then_3_2= ruleExpression ) ) ) otherlv_4= 'else' ( ( (lv_else_5_1= ruleSwitch | lv_else_5_2= ruleExpression ) ) ) ) ;
    public final EObject ruleIfThenElse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_then_3_1 = null;

        EObject lv_then_3_2 = null;

        EObject lv_else_5_1 = null;

        EObject lv_else_5_2 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2596:28: ( (otherlv_0= 'if' ( (lv_condition_1_0= ruleBooleanExpression ) ) otherlv_2= 'then' ( ( (lv_then_3_1= ruleSwitch | lv_then_3_2= ruleExpression ) ) ) otherlv_4= 'else' ( ( (lv_else_5_1= ruleSwitch | lv_else_5_2= ruleExpression ) ) ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2597:1: (otherlv_0= 'if' ( (lv_condition_1_0= ruleBooleanExpression ) ) otherlv_2= 'then' ( ( (lv_then_3_1= ruleSwitch | lv_then_3_2= ruleExpression ) ) ) otherlv_4= 'else' ( ( (lv_else_5_1= ruleSwitch | lv_else_5_2= ruleExpression ) ) ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2597:1: (otherlv_0= 'if' ( (lv_condition_1_0= ruleBooleanExpression ) ) otherlv_2= 'then' ( ( (lv_then_3_1= ruleSwitch | lv_then_3_2= ruleExpression ) ) ) otherlv_4= 'else' ( ( (lv_else_5_1= ruleSwitch | lv_else_5_2= ruleExpression ) ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2597:3: otherlv_0= 'if' ( (lv_condition_1_0= ruleBooleanExpression ) ) otherlv_2= 'then' ( ( (lv_then_3_1= ruleSwitch | lv_then_3_2= ruleExpression ) ) ) otherlv_4= 'else' ( ( (lv_else_5_1= ruleSwitch | lv_else_5_2= ruleExpression ) ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleIfThenElse5971); 

                	newLeafNode(otherlv_0, grammarAccess.getIfThenElseAccess().getIfKeyword_0());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2601:1: ( (lv_condition_1_0= ruleBooleanExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2602:1: (lv_condition_1_0= ruleBooleanExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2602:1: (lv_condition_1_0= ruleBooleanExpression )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2603:3: lv_condition_1_0= ruleBooleanExpression
            {
             
            	        newCompositeNode(grammarAccess.getIfThenElseAccess().getConditionBooleanExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBooleanExpression_in_ruleIfThenElse5992);
            lv_condition_1_0=ruleBooleanExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_1_0, 
                    		"BooleanExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleIfThenElse6004); 

                	newLeafNode(otherlv_2, grammarAccess.getIfThenElseAccess().getThenKeyword_2());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2623:1: ( ( (lv_then_3_1= ruleSwitch | lv_then_3_2= ruleExpression ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2624:1: ( (lv_then_3_1= ruleSwitch | lv_then_3_2= ruleExpression ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2624:1: ( (lv_then_3_1= ruleSwitch | lv_then_3_2= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2625:1: (lv_then_3_1= ruleSwitch | lv_then_3_2= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2625:1: (lv_then_3_1= ruleSwitch | lv_then_3_2= ruleExpression )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==41) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_ID||(LA34_0>=RULE_STRING && LA34_0<=RULE_INT)||(LA34_0>=56 && LA34_0<=58)||(LA34_0>=61 && LA34_0<=62)) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2626:3: lv_then_3_1= ruleSwitch
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfThenElseAccess().getThenSwitchParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSwitch_in_ruleIfThenElse6027);
                    lv_then_3_1=ruleSwitch();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    	        }
                           		set(
                           			current, 
                           			"then",
                            		lv_then_3_1, 
                            		"Switch");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2641:8: lv_then_3_2= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfThenElseAccess().getThenExpressionParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleIfThenElse6046);
                    lv_then_3_2=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    	        }
                           		set(
                           			current, 
                           			"then",
                            		lv_then_3_2, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleIfThenElse6061); 

                	newLeafNode(otherlv_4, grammarAccess.getIfThenElseAccess().getElseKeyword_4());
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2663:1: ( ( (lv_else_5_1= ruleSwitch | lv_else_5_2= ruleExpression ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2664:1: ( (lv_else_5_1= ruleSwitch | lv_else_5_2= ruleExpression ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2664:1: ( (lv_else_5_1= ruleSwitch | lv_else_5_2= ruleExpression ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2665:1: (lv_else_5_1= ruleSwitch | lv_else_5_2= ruleExpression )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2665:1: (lv_else_5_1= ruleSwitch | lv_else_5_2= ruleExpression )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==41) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_ID||(LA35_0>=RULE_STRING && LA35_0<=RULE_INT)||(LA35_0>=56 && LA35_0<=58)||(LA35_0>=61 && LA35_0<=62)) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2666:3: lv_else_5_1= ruleSwitch
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfThenElseAccess().getElseSwitchParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSwitch_in_ruleIfThenElse6084);
                    lv_else_5_1=ruleSwitch();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    	        }
                           		set(
                           			current, 
                           			"else",
                            		lv_else_5_1, 
                            		"Switch");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2681:8: lv_else_5_2= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfThenElseAccess().getElseExpressionParserRuleCall_5_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleIfThenElse6103);
                    lv_else_5_2=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                    	        }
                           		set(
                           			current, 
                           			"else",
                            		lv_else_5_2, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2707:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2708:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2709:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6142);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6152); 

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2716:1: ruleExpression returns [EObject current=null] : (this_Minus_0= ruleMinus ( () otherlv_2= '+' ( (lv_rightOperand_3_0= ruleMinus ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Minus_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2719:28: ( (this_Minus_0= ruleMinus ( () otherlv_2= '+' ( (lv_rightOperand_3_0= ruleMinus ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2720:1: (this_Minus_0= ruleMinus ( () otherlv_2= '+' ( (lv_rightOperand_3_0= ruleMinus ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2720:1: (this_Minus_0= ruleMinus ( () otherlv_2= '+' ( (lv_rightOperand_3_0= ruleMinus ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2721:5: this_Minus_0= ruleMinus ( () otherlv_2= '+' ( (lv_rightOperand_3_0= ruleMinus ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getExpressionAccess().getMinusParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMinus_in_ruleExpression6199);
            this_Minus_0=ruleMinus();

            state._fsp--;

             
                    current = this_Minus_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2729:1: ( () otherlv_2= '+' ( (lv_rightOperand_3_0= ruleMinus ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==45) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2729:2: () otherlv_2= '+' ( (lv_rightOperand_3_0= ruleMinus ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2729:2: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2730:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getExpressionAccess().getAdditionLeftOperandAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleExpression6220); 

            	        	newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getPlusSignKeyword_1_1());
            	        
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2739:1: ( (lv_rightOperand_3_0= ruleMinus ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2740:1: (lv_rightOperand_3_0= ruleMinus )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2740:1: (lv_rightOperand_3_0= ruleMinus )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2741:3: lv_rightOperand_3_0= ruleMinus
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionAccess().getRightOperandMinusParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMinus_in_ruleExpression6241);
            	    lv_rightOperand_3_0=ruleMinus();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOperand",
            	            		lv_rightOperand_3_0, 
            	            		"Minus");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleMinus"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2765:1: entryRuleMinus returns [EObject current=null] : iv_ruleMinus= ruleMinus EOF ;
    public final EObject entryRuleMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinus = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2766:2: (iv_ruleMinus= ruleMinus EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2767:2: iv_ruleMinus= ruleMinus EOF
            {
             newCompositeNode(grammarAccess.getMinusRule()); 
            pushFollow(FOLLOW_ruleMinus_in_entryRuleMinus6279);
            iv_ruleMinus=ruleMinus();

            state._fsp--;

             current =iv_ruleMinus; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinus6289); 

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
    // $ANTLR end "entryRuleMinus"


    // $ANTLR start "ruleMinus"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2774:1: ruleMinus returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '-' ( (lv_rightOperand_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2777:28: ( (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '-' ( (lv_rightOperand_3_0= ruleMultiplication ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2778:1: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '-' ( (lv_rightOperand_3_0= ruleMultiplication ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2778:1: (this_Multiplication_0= ruleMultiplication ( () otherlv_2= '-' ( (lv_rightOperand_3_0= ruleMultiplication ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2779:5: this_Multiplication_0= ruleMultiplication ( () otherlv_2= '-' ( (lv_rightOperand_3_0= ruleMultiplication ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMinusAccess().getMultiplicationParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleMinus6336);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;

             
                    current = this_Multiplication_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2787:1: ( () otherlv_2= '-' ( (lv_rightOperand_3_0= ruleMultiplication ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==46) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2787:2: () otherlv_2= '-' ( (lv_rightOperand_3_0= ruleMultiplication ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2787:2: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2788:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getMinusAccess().getMinusLeftOperandAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleMinus6357); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMinusAccess().getHyphenMinusKeyword_1_1());
            	        
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2797:1: ( (lv_rightOperand_3_0= ruleMultiplication ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2798:1: (lv_rightOperand_3_0= ruleMultiplication )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2798:1: (lv_rightOperand_3_0= ruleMultiplication )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2799:3: lv_rightOperand_3_0= ruleMultiplication
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMinusAccess().getRightOperandMultiplicationParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleMinus6378);
            	    lv_rightOperand_3_0=ruleMultiplication();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMinusRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOperand",
            	            		lv_rightOperand_3_0, 
            	            		"Multiplication");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinus"


    // $ANTLR start "entryRuleMultiplication"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2823:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2824:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2825:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication6416);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication6426); 

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2832:1: ruleMultiplication returns [EObject current=null] : (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_rightOperand_3_0= ruleDivision ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Division_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2835:28: ( (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_rightOperand_3_0= ruleDivision ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2836:1: (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_rightOperand_3_0= ruleDivision ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2836:1: (this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_rightOperand_3_0= ruleDivision ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2837:5: this_Division_0= ruleDivision ( () otherlv_2= '*' ( (lv_rightOperand_3_0= ruleDivision ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicationAccess().getDivisionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleDivision_in_ruleMultiplication6473);
            this_Division_0=ruleDivision();

            state._fsp--;

             
                    current = this_Division_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2845:1: ( () otherlv_2= '*' ( (lv_rightOperand_3_0= ruleDivision ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==47) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2845:2: () otherlv_2= '*' ( (lv_rightOperand_3_0= ruleDivision ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2845:2: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2846:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getMultiplicationAccess().getMultiplicationLeftOperandAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleMultiplication6494); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_1());
            	        
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2855:1: ( (lv_rightOperand_3_0= ruleDivision ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2856:1: (lv_rightOperand_3_0= ruleDivision )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2856:1: (lv_rightOperand_3_0= ruleDivision )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2857:3: lv_rightOperand_3_0= ruleDivision
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightOperandDivisionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDivision_in_ruleMultiplication6515);
            	    lv_rightOperand_3_0=ruleDivision();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOperand",
            	            		lv_rightOperand_3_0, 
            	            		"Division");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleDivision"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2881:1: entryRuleDivision returns [EObject current=null] : iv_ruleDivision= ruleDivision EOF ;
    public final EObject entryRuleDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivision = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2882:2: (iv_ruleDivision= ruleDivision EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2883:2: iv_ruleDivision= ruleDivision EOF
            {
             newCompositeNode(grammarAccess.getDivisionRule()); 
            pushFollow(FOLLOW_ruleDivision_in_entryRuleDivision6553);
            iv_ruleDivision=ruleDivision();

            state._fsp--;

             current =iv_ruleDivision; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivision6563); 

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
    // $ANTLR end "entryRuleDivision"


    // $ANTLR start "ruleDivision"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2890:1: ruleDivision returns [EObject current=null] : (this_BooleanExpression_0= ruleBooleanExpression ( () otherlv_2= '/' ( (lv_rightOperand_3_0= ruleBooleanExpression ) ) )* ) ;
    public final EObject ruleDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BooleanExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2893:28: ( (this_BooleanExpression_0= ruleBooleanExpression ( () otherlv_2= '/' ( (lv_rightOperand_3_0= ruleBooleanExpression ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2894:1: (this_BooleanExpression_0= ruleBooleanExpression ( () otherlv_2= '/' ( (lv_rightOperand_3_0= ruleBooleanExpression ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2894:1: (this_BooleanExpression_0= ruleBooleanExpression ( () otherlv_2= '/' ( (lv_rightOperand_3_0= ruleBooleanExpression ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2895:5: this_BooleanExpression_0= ruleBooleanExpression ( () otherlv_2= '/' ( (lv_rightOperand_3_0= ruleBooleanExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getDivisionAccess().getBooleanExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleBooleanExpression_in_ruleDivision6610);
            this_BooleanExpression_0=ruleBooleanExpression();

            state._fsp--;

             
                    current = this_BooleanExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2903:1: ( () otherlv_2= '/' ( (lv_rightOperand_3_0= ruleBooleanExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==48) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2903:2: () otherlv_2= '/' ( (lv_rightOperand_3_0= ruleBooleanExpression ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2903:2: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2904:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDivisionAccess().getDivisionLeftOperandAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleDivision6631); 

            	        	newLeafNode(otherlv_2, grammarAccess.getDivisionAccess().getSolidusKeyword_1_1());
            	        
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2913:1: ( (lv_rightOperand_3_0= ruleBooleanExpression ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2914:1: (lv_rightOperand_3_0= ruleBooleanExpression )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2914:1: (lv_rightOperand_3_0= ruleBooleanExpression )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2915:3: lv_rightOperand_3_0= ruleBooleanExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDivisionAccess().getRightOperandBooleanExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBooleanExpression_in_ruleDivision6652);
            	    lv_rightOperand_3_0=ruleBooleanExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDivisionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOperand",
            	            		lv_rightOperand_3_0, 
            	            		"BooleanExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivision"


    // $ANTLR start "entryRuleBooleanExpression"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2939:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2940:2: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2941:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression6690);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpression6700); 

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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2948:1: ruleBooleanExpression returns [EObject current=null] : this_And_0= ruleAnd ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_And_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2951:28: (this_And_0= ruleAnd )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2953:5: this_And_0= ruleAnd
            {
             
                    newCompositeNode(grammarAccess.getBooleanExpressionAccess().getAndParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleAnd_in_ruleBooleanExpression6746);
            this_And_0=ruleAnd();

            state._fsp--;

             
                    current = this_And_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleAnd"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2969:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2970:2: (iv_ruleAnd= ruleAnd EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2971:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd6780);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd6790); 

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2978:1: ruleAnd returns [EObject current=null] : (this_Or_0= ruleOr ( () (otherlv_2= 'and' | otherlv_3= '&' ) ( (lv_rightOperand_4_0= ruleOr ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Or_0 = null;

        EObject lv_rightOperand_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2981:28: ( (this_Or_0= ruleOr ( () (otherlv_2= 'and' | otherlv_3= '&' ) ( (lv_rightOperand_4_0= ruleOr ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2982:1: (this_Or_0= ruleOr ( () (otherlv_2= 'and' | otherlv_3= '&' ) ( (lv_rightOperand_4_0= ruleOr ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2982:1: (this_Or_0= ruleOr ( () (otherlv_2= 'and' | otherlv_3= '&' ) ( (lv_rightOperand_4_0= ruleOr ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2983:5: this_Or_0= ruleOr ( () (otherlv_2= 'and' | otherlv_3= '&' ) ( (lv_rightOperand_4_0= ruleOr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAndAccess().getOrParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleOr_in_ruleAnd6837);
            this_Or_0=ruleOr();

            state._fsp--;

             
                    current = this_Or_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2991:1: ( () (otherlv_2= 'and' | otherlv_3= '&' ) ( (lv_rightOperand_4_0= ruleOr ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=49 && LA41_0<=50)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2991:2: () (otherlv_2= 'and' | otherlv_3= '&' ) ( (lv_rightOperand_4_0= ruleOr ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2991:2: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2992:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAndAccess().getAndLeftOperandAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2997:2: (otherlv_2= 'and' | otherlv_3= '&' )
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==49) ) {
            	        alt40=1;
            	    }
            	    else if ( (LA40_0==50) ) {
            	        alt40=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:2997:4: otherlv_2= 'and'
            	            {
            	            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleAnd6859); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3002:7: otherlv_3= '&'
            	            {
            	            otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleAnd6877); 

            	                	newLeafNode(otherlv_3, grammarAccess.getAndAccess().getAmpersandKeyword_1_1_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3006:2: ( (lv_rightOperand_4_0= ruleOr ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3007:1: (lv_rightOperand_4_0= ruleOr )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3007:1: (lv_rightOperand_4_0= ruleOr )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3008:3: lv_rightOperand_4_0= ruleOr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndAccess().getRightOperandOrParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOr_in_ruleAnd6899);
            	    lv_rightOperand_4_0=ruleOr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOperand",
            	            		lv_rightOperand_4_0, 
            	            		"Or");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3032:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3033:2: (iv_ruleOr= ruleOr EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3034:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr6937);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr6947); 

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3041:1: ruleOr returns [EObject current=null] : (this_Equal_0= ruleEqual ( () (otherlv_2= 'or' | otherlv_3= '|' ) ( (lv_rightOperand_4_0= ruleEqual ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Equal_0 = null;

        EObject lv_rightOperand_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3044:28: ( (this_Equal_0= ruleEqual ( () (otherlv_2= 'or' | otherlv_3= '|' ) ( (lv_rightOperand_4_0= ruleEqual ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3045:1: (this_Equal_0= ruleEqual ( () (otherlv_2= 'or' | otherlv_3= '|' ) ( (lv_rightOperand_4_0= ruleEqual ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3045:1: (this_Equal_0= ruleEqual ( () (otherlv_2= 'or' | otherlv_3= '|' ) ( (lv_rightOperand_4_0= ruleEqual ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3046:5: this_Equal_0= ruleEqual ( () (otherlv_2= 'or' | otherlv_3= '|' ) ( (lv_rightOperand_4_0= ruleEqual ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOrAccess().getEqualParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleEqual_in_ruleOr6994);
            this_Equal_0=ruleEqual();

            state._fsp--;

             
                    current = this_Equal_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3054:1: ( () (otherlv_2= 'or' | otherlv_3= '|' ) ( (lv_rightOperand_4_0= ruleEqual ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=51 && LA43_0<=52)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3054:2: () (otherlv_2= 'or' | otherlv_3= '|' ) ( (lv_rightOperand_4_0= ruleEqual ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3054:2: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3055:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOrAccess().getOrLeftOperandAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3060:2: (otherlv_2= 'or' | otherlv_3= '|' )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==51) ) {
            	        alt42=1;
            	    }
            	    else if ( (LA42_0==52) ) {
            	        alt42=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3060:4: otherlv_2= 'or'
            	            {
            	            otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleOr7016); 

            	                	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3065:7: otherlv_3= '|'
            	            {
            	            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleOr7034); 

            	                	newLeafNode(otherlv_3, grammarAccess.getOrAccess().getVerticalLineKeyword_1_1_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3069:2: ( (lv_rightOperand_4_0= ruleEqual ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3070:1: (lv_rightOperand_4_0= ruleEqual )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3070:1: (lv_rightOperand_4_0= ruleEqual )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3071:3: lv_rightOperand_4_0= ruleEqual
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrAccess().getRightOperandEqualParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqual_in_ruleOr7056);
            	    lv_rightOperand_4_0=ruleEqual();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOperand",
            	            		lv_rightOperand_4_0, 
            	            		"Equal");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleEqual"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3095:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3096:2: (iv_ruleEqual= ruleEqual EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3097:2: iv_ruleEqual= ruleEqual EOF
            {
             newCompositeNode(grammarAccess.getEqualRule()); 
            pushFollow(FOLLOW_ruleEqual_in_entryRuleEqual7094);
            iv_ruleEqual=ruleEqual();

            state._fsp--;

             current =iv_ruleEqual; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqual7104); 

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
    // $ANTLR end "entryRuleEqual"


    // $ANTLR start "ruleEqual"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3104:1: ruleEqual returns [EObject current=null] : (this_NotEqual_0= ruleNotEqual ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleNotEqual ) ) )* ) ;
    public final EObject ruleEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NotEqual_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3107:28: ( (this_NotEqual_0= ruleNotEqual ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleNotEqual ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3108:1: (this_NotEqual_0= ruleNotEqual ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleNotEqual ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3108:1: (this_NotEqual_0= ruleNotEqual ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleNotEqual ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3109:5: this_NotEqual_0= ruleNotEqual ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleNotEqual ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getEqualAccess().getNotEqualParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleNotEqual_in_ruleEqual7151);
            this_NotEqual_0=ruleNotEqual();

            state._fsp--;

             
                    current = this_NotEqual_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3117:1: ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleNotEqual ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==13) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3117:2: () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleNotEqual ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3117:2: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3118:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEqualAccess().getEqualLeftOperandAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleEqual7172); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEqualAccess().getEqualsSignKeyword_1_1());
            	        
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3127:1: ( (lv_rightOperand_3_0= ruleNotEqual ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3128:1: (lv_rightOperand_3_0= ruleNotEqual )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3128:1: (lv_rightOperand_3_0= ruleNotEqual )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3129:3: lv_rightOperand_3_0= ruleNotEqual
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualAccess().getRightOperandNotEqualParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNotEqual_in_ruleEqual7193);
            	    lv_rightOperand_3_0=ruleNotEqual();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqualRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOperand",
            	            		lv_rightOperand_3_0, 
            	            		"NotEqual");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqual"


    // $ANTLR start "entryRuleNotEqual"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3153:1: entryRuleNotEqual returns [EObject current=null] : iv_ruleNotEqual= ruleNotEqual EOF ;
    public final EObject entryRuleNotEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEqual = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3154:2: (iv_ruleNotEqual= ruleNotEqual EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3155:2: iv_ruleNotEqual= ruleNotEqual EOF
            {
             newCompositeNode(grammarAccess.getNotEqualRule()); 
            pushFollow(FOLLOW_ruleNotEqual_in_entryRuleNotEqual7231);
            iv_ruleNotEqual=ruleNotEqual();

            state._fsp--;

             current =iv_ruleNotEqual; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqual7241); 

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
    // $ANTLR end "entryRuleNotEqual"


    // $ANTLR start "ruleNotEqual"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3162:1: ruleNotEqual returns [EObject current=null] : (this_StrictLower_0= ruleStrictLower ( () otherlv_2= '!=' ( (lv_rightOperand_3_0= ruleStrictLower ) ) )* ) ;
    public final EObject ruleNotEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_StrictLower_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3165:28: ( (this_StrictLower_0= ruleStrictLower ( () otherlv_2= '!=' ( (lv_rightOperand_3_0= ruleStrictLower ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3166:1: (this_StrictLower_0= ruleStrictLower ( () otherlv_2= '!=' ( (lv_rightOperand_3_0= ruleStrictLower ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3166:1: (this_StrictLower_0= ruleStrictLower ( () otherlv_2= '!=' ( (lv_rightOperand_3_0= ruleStrictLower ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3167:5: this_StrictLower_0= ruleStrictLower ( () otherlv_2= '!=' ( (lv_rightOperand_3_0= ruleStrictLower ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getNotEqualAccess().getStrictLowerParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleStrictLower_in_ruleNotEqual7288);
            this_StrictLower_0=ruleStrictLower();

            state._fsp--;

             
                    current = this_StrictLower_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3175:1: ( () otherlv_2= '!=' ( (lv_rightOperand_3_0= ruleStrictLower ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==53) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3175:2: () otherlv_2= '!=' ( (lv_rightOperand_3_0= ruleStrictLower ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3175:2: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3176:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getNotEqualAccess().getNotEqualLeftOperandAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleNotEqual7309); 

            	        	newLeafNode(otherlv_2, grammarAccess.getNotEqualAccess().getExclamationMarkEqualsSignKeyword_1_1());
            	        
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3185:1: ( (lv_rightOperand_3_0= ruleStrictLower ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3186:1: (lv_rightOperand_3_0= ruleStrictLower )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3186:1: (lv_rightOperand_3_0= ruleStrictLower )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3187:3: lv_rightOperand_3_0= ruleStrictLower
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNotEqualAccess().getRightOperandStrictLowerParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStrictLower_in_ruleNotEqual7330);
            	    lv_rightOperand_3_0=ruleStrictLower();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNotEqualRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOperand",
            	            		lv_rightOperand_3_0, 
            	            		"StrictLower");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotEqual"


    // $ANTLR start "entryRuleStrictLower"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3211:1: entryRuleStrictLower returns [EObject current=null] : iv_ruleStrictLower= ruleStrictLower EOF ;
    public final EObject entryRuleStrictLower() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrictLower = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3212:2: (iv_ruleStrictLower= ruleStrictLower EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3213:2: iv_ruleStrictLower= ruleStrictLower EOF
            {
             newCompositeNode(grammarAccess.getStrictLowerRule()); 
            pushFollow(FOLLOW_ruleStrictLower_in_entryRuleStrictLower7368);
            iv_ruleStrictLower=ruleStrictLower();

            state._fsp--;

             current =iv_ruleStrictLower; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrictLower7378); 

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
    // $ANTLR end "entryRuleStrictLower"


    // $ANTLR start "ruleStrictLower"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3220:1: ruleStrictLower returns [EObject current=null] : (this_Lower_0= ruleLower ( () otherlv_2= '<' ( (lv_rightOperand_3_0= ruleLower ) ) )* ) ;
    public final EObject ruleStrictLower() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Lower_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3223:28: ( (this_Lower_0= ruleLower ( () otherlv_2= '<' ( (lv_rightOperand_3_0= ruleLower ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3224:1: (this_Lower_0= ruleLower ( () otherlv_2= '<' ( (lv_rightOperand_3_0= ruleLower ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3224:1: (this_Lower_0= ruleLower ( () otherlv_2= '<' ( (lv_rightOperand_3_0= ruleLower ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3225:5: this_Lower_0= ruleLower ( () otherlv_2= '<' ( (lv_rightOperand_3_0= ruleLower ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getStrictLowerAccess().getLowerParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleLower_in_ruleStrictLower7425);
            this_Lower_0=ruleLower();

            state._fsp--;

             
                    current = this_Lower_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3233:1: ( () otherlv_2= '<' ( (lv_rightOperand_3_0= ruleLower ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==33) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3233:2: () otherlv_2= '<' ( (lv_rightOperand_3_0= ruleLower ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3233:2: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3234:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getStrictLowerAccess().getStrictLowerLeftOperandAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleStrictLower7446); 

            	        	newLeafNode(otherlv_2, grammarAccess.getStrictLowerAccess().getLessThanSignKeyword_1_1());
            	        
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3243:1: ( (lv_rightOperand_3_0= ruleLower ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3244:1: (lv_rightOperand_3_0= ruleLower )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3244:1: (lv_rightOperand_3_0= ruleLower )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3245:3: lv_rightOperand_3_0= ruleLower
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStrictLowerAccess().getRightOperandLowerParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLower_in_ruleStrictLower7467);
            	    lv_rightOperand_3_0=ruleLower();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStrictLowerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOperand",
            	            		lv_rightOperand_3_0, 
            	            		"Lower");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStrictLower"


    // $ANTLR start "entryRuleLower"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3269:1: entryRuleLower returns [EObject current=null] : iv_ruleLower= ruleLower EOF ;
    public final EObject entryRuleLower() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLower = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3270:2: (iv_ruleLower= ruleLower EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3271:2: iv_ruleLower= ruleLower EOF
            {
             newCompositeNode(grammarAccess.getLowerRule()); 
            pushFollow(FOLLOW_ruleLower_in_entryRuleLower7505);
            iv_ruleLower=ruleLower();

            state._fsp--;

             current =iv_ruleLower; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLower7515); 

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
    // $ANTLR end "entryRuleLower"


    // $ANTLR start "ruleLower"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3278:1: ruleLower returns [EObject current=null] : (this_StrictUpper_0= ruleStrictUpper ( () otherlv_2= '<=' ( (lv_rightOperand_3_0= ruleStrictUpper ) ) )* ) ;
    public final EObject ruleLower() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_StrictUpper_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3281:28: ( (this_StrictUpper_0= ruleStrictUpper ( () otherlv_2= '<=' ( (lv_rightOperand_3_0= ruleStrictUpper ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3282:1: (this_StrictUpper_0= ruleStrictUpper ( () otherlv_2= '<=' ( (lv_rightOperand_3_0= ruleStrictUpper ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3282:1: (this_StrictUpper_0= ruleStrictUpper ( () otherlv_2= '<=' ( (lv_rightOperand_3_0= ruleStrictUpper ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3283:5: this_StrictUpper_0= ruleStrictUpper ( () otherlv_2= '<=' ( (lv_rightOperand_3_0= ruleStrictUpper ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getLowerAccess().getStrictUpperParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleStrictUpper_in_ruleLower7562);
            this_StrictUpper_0=ruleStrictUpper();

            state._fsp--;

             
                    current = this_StrictUpper_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3291:1: ( () otherlv_2= '<=' ( (lv_rightOperand_3_0= ruleStrictUpper ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==54) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3291:2: () otherlv_2= '<=' ( (lv_rightOperand_3_0= ruleStrictUpper ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3291:2: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3292:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getLowerAccess().getLowerLeftOperandAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleLower7583); 

            	        	newLeafNode(otherlv_2, grammarAccess.getLowerAccess().getLessThanSignEqualsSignKeyword_1_1());
            	        
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3301:1: ( (lv_rightOperand_3_0= ruleStrictUpper ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3302:1: (lv_rightOperand_3_0= ruleStrictUpper )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3302:1: (lv_rightOperand_3_0= ruleStrictUpper )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3303:3: lv_rightOperand_3_0= ruleStrictUpper
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLowerAccess().getRightOperandStrictUpperParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStrictUpper_in_ruleLower7604);
            	    lv_rightOperand_3_0=ruleStrictUpper();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLowerRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOperand",
            	            		lv_rightOperand_3_0, 
            	            		"StrictUpper");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLower"


    // $ANTLR start "entryRuleStrictUpper"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3327:1: entryRuleStrictUpper returns [EObject current=null] : iv_ruleStrictUpper= ruleStrictUpper EOF ;
    public final EObject entryRuleStrictUpper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrictUpper = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3328:2: (iv_ruleStrictUpper= ruleStrictUpper EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3329:2: iv_ruleStrictUpper= ruleStrictUpper EOF
            {
             newCompositeNode(grammarAccess.getStrictUpperRule()); 
            pushFollow(FOLLOW_ruleStrictUpper_in_entryRuleStrictUpper7642);
            iv_ruleStrictUpper=ruleStrictUpper();

            state._fsp--;

             current =iv_ruleStrictUpper; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrictUpper7652); 

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
    // $ANTLR end "entryRuleStrictUpper"


    // $ANTLR start "ruleStrictUpper"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3336:1: ruleStrictUpper returns [EObject current=null] : (this_Upper_0= ruleUpper ( () otherlv_2= '>' ( (lv_rightOperand_3_0= ruleUpper ) ) )* ) ;
    public final EObject ruleStrictUpper() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Upper_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3339:28: ( (this_Upper_0= ruleUpper ( () otherlv_2= '>' ( (lv_rightOperand_3_0= ruleUpper ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3340:1: (this_Upper_0= ruleUpper ( () otherlv_2= '>' ( (lv_rightOperand_3_0= ruleUpper ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3340:1: (this_Upper_0= ruleUpper ( () otherlv_2= '>' ( (lv_rightOperand_3_0= ruleUpper ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3341:5: this_Upper_0= ruleUpper ( () otherlv_2= '>' ( (lv_rightOperand_3_0= ruleUpper ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getStrictUpperAccess().getUpperParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUpper_in_ruleStrictUpper7699);
            this_Upper_0=ruleUpper();

            state._fsp--;

             
                    current = this_Upper_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3349:1: ( () otherlv_2= '>' ( (lv_rightOperand_3_0= ruleUpper ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==34) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3349:2: () otherlv_2= '>' ( (lv_rightOperand_3_0= ruleUpper ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3349:2: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3350:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getStrictUpperAccess().getStrictUpperLeftOperandAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleStrictUpper7720); 

            	        	newLeafNode(otherlv_2, grammarAccess.getStrictUpperAccess().getGreaterThanSignKeyword_1_1());
            	        
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3359:1: ( (lv_rightOperand_3_0= ruleUpper ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3360:1: (lv_rightOperand_3_0= ruleUpper )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3360:1: (lv_rightOperand_3_0= ruleUpper )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3361:3: lv_rightOperand_3_0= ruleUpper
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStrictUpperAccess().getRightOperandUpperParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUpper_in_ruleStrictUpper7741);
            	    lv_rightOperand_3_0=ruleUpper();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStrictUpperRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOperand",
            	            		lv_rightOperand_3_0, 
            	            		"Upper");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStrictUpper"


    // $ANTLR start "entryRuleUpper"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3385:1: entryRuleUpper returns [EObject current=null] : iv_ruleUpper= ruleUpper EOF ;
    public final EObject entryRuleUpper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpper = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3386:2: (iv_ruleUpper= ruleUpper EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3387:2: iv_ruleUpper= ruleUpper EOF
            {
             newCompositeNode(grammarAccess.getUpperRule()); 
            pushFollow(FOLLOW_ruleUpper_in_entryRuleUpper7779);
            iv_ruleUpper=ruleUpper();

            state._fsp--;

             current =iv_ruleUpper; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUpper7789); 

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
    // $ANTLR end "entryRuleUpper"


    // $ANTLR start "ruleUpper"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3394:1: ruleUpper returns [EObject current=null] : (this_Imply_0= ruleImply ( () otherlv_2= '>=' ( (lv_rightOperand_3_0= ruleImply ) ) )* ) ;
    public final EObject ruleUpper() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Imply_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3397:28: ( (this_Imply_0= ruleImply ( () otherlv_2= '>=' ( (lv_rightOperand_3_0= ruleImply ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3398:1: (this_Imply_0= ruleImply ( () otherlv_2= '>=' ( (lv_rightOperand_3_0= ruleImply ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3398:1: (this_Imply_0= ruleImply ( () otherlv_2= '>=' ( (lv_rightOperand_3_0= ruleImply ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3399:5: this_Imply_0= ruleImply ( () otherlv_2= '>=' ( (lv_rightOperand_3_0= ruleImply ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUpperAccess().getImplyParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleImply_in_ruleUpper7836);
            this_Imply_0=ruleImply();

            state._fsp--;

             
                    current = this_Imply_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3407:1: ( () otherlv_2= '>=' ( (lv_rightOperand_3_0= ruleImply ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==36) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3407:2: () otherlv_2= '>=' ( (lv_rightOperand_3_0= ruleImply ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3407:2: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3408:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getUpperAccess().getUpperLeftOperandAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleUpper7857); 

            	        	newLeafNode(otherlv_2, grammarAccess.getUpperAccess().getGreaterThanSignEqualsSignKeyword_1_1());
            	        
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3417:1: ( (lv_rightOperand_3_0= ruleImply ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3418:1: (lv_rightOperand_3_0= ruleImply )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3418:1: (lv_rightOperand_3_0= ruleImply )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3419:3: lv_rightOperand_3_0= ruleImply
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUpperAccess().getRightOperandImplyParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImply_in_ruleUpper7878);
            	    lv_rightOperand_3_0=ruleImply();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUpperRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOperand",
            	            		lv_rightOperand_3_0, 
            	            		"Imply");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUpper"


    // $ANTLR start "entryRuleImply"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3443:1: entryRuleImply returns [EObject current=null] : iv_ruleImply= ruleImply EOF ;
    public final EObject entryRuleImply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImply = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3444:2: (iv_ruleImply= ruleImply EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3445:2: iv_ruleImply= ruleImply EOF
            {
             newCompositeNode(grammarAccess.getImplyRule()); 
            pushFollow(FOLLOW_ruleImply_in_entryRuleImply7916);
            iv_ruleImply=ruleImply();

            state._fsp--;

             current =iv_ruleImply; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImply7926); 

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
    // $ANTLR end "entryRuleImply"


    // $ANTLR start "ruleImply"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3452:1: ruleImply returns [EObject current=null] : (this_Not_0= ruleNot ( () otherlv_2= '=>' ( (lv_rightOperand_3_0= ruleNot ) ) )* ) ;
    public final EObject ruleImply() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Not_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3455:28: ( (this_Not_0= ruleNot ( () otherlv_2= '=>' ( (lv_rightOperand_3_0= ruleNot ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3456:1: (this_Not_0= ruleNot ( () otherlv_2= '=>' ( (lv_rightOperand_3_0= ruleNot ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3456:1: (this_Not_0= ruleNot ( () otherlv_2= '=>' ( (lv_rightOperand_3_0= ruleNot ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3457:5: this_Not_0= ruleNot ( () otherlv_2= '=>' ( (lv_rightOperand_3_0= ruleNot ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getImplyAccess().getNotParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleNot_in_ruleImply7973);
            this_Not_0=ruleNot();

            state._fsp--;

             
                    current = this_Not_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3465:1: ( () otherlv_2= '=>' ( (lv_rightOperand_3_0= ruleNot ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==55) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3465:2: () otherlv_2= '=>' ( (lv_rightOperand_3_0= ruleNot ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3465:2: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3466:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getImplyAccess().getImplyLeftOperandAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleImply7994); 

            	        	newLeafNode(otherlv_2, grammarAccess.getImplyAccess().getEqualsSignGreaterThanSignKeyword_1_1());
            	        
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3475:1: ( (lv_rightOperand_3_0= ruleNot ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3476:1: (lv_rightOperand_3_0= ruleNot )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3476:1: (lv_rightOperand_3_0= ruleNot )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3477:3: lv_rightOperand_3_0= ruleNot
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImplyAccess().getRightOperandNotParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNot_in_ruleImply8015);
            	    lv_rightOperand_3_0=ruleNot();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImplyRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rightOperand",
            	            		lv_rightOperand_3_0, 
            	            		"Not");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImply"


    // $ANTLR start "entryRuleNot"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3501:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3502:2: (iv_ruleNot= ruleNot EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3503:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_ruleNot_in_entryRuleNot8053);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNot8063); 

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
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3510:1: ruleNot returns [EObject current=null] : ( ( (otherlv_0= '~' | otherlv_1= 'not' ) ( (lv_operand_2_0= ruleAtom ) ) ) | this_Atom_3= ruleAtom ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;

        EObject this_Atom_3 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3513:28: ( ( ( (otherlv_0= '~' | otherlv_1= 'not' ) ( (lv_operand_2_0= ruleAtom ) ) ) | this_Atom_3= ruleAtom ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3514:1: ( ( (otherlv_0= '~' | otherlv_1= 'not' ) ( (lv_operand_2_0= ruleAtom ) ) ) | this_Atom_3= ruleAtom )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3514:1: ( ( (otherlv_0= '~' | otherlv_1= 'not' ) ( (lv_operand_2_0= ruleAtom ) ) ) | this_Atom_3= ruleAtom )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=56 && LA52_0<=57)) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_ID||(LA52_0>=RULE_STRING && LA52_0<=RULE_INT)||LA52_0==58||(LA52_0>=61 && LA52_0<=62)) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3514:2: ( (otherlv_0= '~' | otherlv_1= 'not' ) ( (lv_operand_2_0= ruleAtom ) ) )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3514:2: ( (otherlv_0= '~' | otherlv_1= 'not' ) ( (lv_operand_2_0= ruleAtom ) ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3514:3: (otherlv_0= '~' | otherlv_1= 'not' ) ( (lv_operand_2_0= ruleAtom ) )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3514:3: (otherlv_0= '~' | otherlv_1= 'not' )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==56) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==57) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3514:5: otherlv_0= '~'
                            {
                            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleNot8102); 

                                	newLeafNode(otherlv_0, grammarAccess.getNotAccess().getTildeKeyword_0_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3519:7: otherlv_1= 'not'
                            {
                            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleNot8120); 

                                	newLeafNode(otherlv_1, grammarAccess.getNotAccess().getNotKeyword_0_0_1());
                                

                            }
                            break;

                    }

                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3523:2: ( (lv_operand_2_0= ruleAtom ) )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3524:1: (lv_operand_2_0= ruleAtom )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3524:1: (lv_operand_2_0= ruleAtom )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3525:3: lv_operand_2_0= ruleAtom
                    {
                     
                    	        newCompositeNode(grammarAccess.getNotAccess().getOperandAtomParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtom_in_ruleNot8142);
                    lv_operand_2_0=ruleAtom();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNotRule());
                    	        }
                           		set(
                           			current, 
                           			"operand",
                            		lv_operand_2_0, 
                            		"Atom");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3543:5: this_Atom_3= ruleAtom
                    {
                     
                            newCompositeNode(grammarAccess.getNotAccess().getAtomParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAtom_in_ruleNot8171);
                    this_Atom_3=ruleAtom();

                    state._fsp--;

                     
                            current = this_Atom_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleAtom"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3559:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3560:2: (iv_ruleAtom= ruleAtom EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3561:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom8206);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom8216); 

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3568:1: ruleAtom returns [EObject current=null] : (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral | this_VariableRef_3= ruleVariableRef | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_BooleanLiteral_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_IntegerLiteral_2 = null;

        EObject this_VariableRef_3 = null;

        EObject this_Expression_5 = null;


         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3571:28: ( (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral | this_VariableRef_3= ruleVariableRef | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3572:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral | this_VariableRef_3= ruleVariableRef | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3572:1: (this_BooleanLiteral_0= ruleBooleanLiteral | this_StringLiteral_1= ruleStringLiteral | this_IntegerLiteral_2= ruleIntegerLiteral | this_VariableRef_3= ruleVariableRef | (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' ) )
            int alt53=5;
            switch ( input.LA(1) ) {
            case 61:
            case 62:
                {
                alt53=1;
                }
                break;
            case RULE_STRING:
                {
                alt53=2;
                }
                break;
            case RULE_INT:
                {
                alt53=3;
                }
                break;
            case RULE_ID:
                {
                alt53=4;
                }
                break;
            case 58:
                {
                alt53=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3573:5: this_BooleanLiteral_0= ruleBooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getAtomAccess().getBooleanLiteralParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleAtom8263);
                    this_BooleanLiteral_0=ruleBooleanLiteral();

                    state._fsp--;

                     
                            current = this_BooleanLiteral_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3583:5: this_StringLiteral_1= ruleStringLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getAtomAccess().getStringLiteralParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleAtom8290);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;

                     
                            current = this_StringLiteral_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3593:5: this_IntegerLiteral_2= ruleIntegerLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getAtomAccess().getIntegerLiteralParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIntegerLiteral_in_ruleAtom8317);
                    this_IntegerLiteral_2=ruleIntegerLiteral();

                    state._fsp--;

                     
                            current = this_IntegerLiteral_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3603:5: this_VariableRef_3= ruleVariableRef
                    {
                     
                            newCompositeNode(grammarAccess.getAtomAccess().getVariableRefParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleVariableRef_in_ruleAtom8344);
                    this_VariableRef_3=ruleVariableRef();

                    state._fsp--;

                     
                            current = this_VariableRef_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3612:6: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3612:6: (otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')' )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3612:8: otherlv_4= '(' this_Expression_5= ruleExpression otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,58,FOLLOW_58_in_ruleAtom8362); 

                        	newLeafNode(otherlv_4, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_4_0());
                        
                     
                            newCompositeNode(grammarAccess.getAtomAccess().getExpressionParserRuleCall_4_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleAtom8384);
                    this_Expression_5=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_5; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_6=(Token)match(input,59,FOLLOW_59_in_ruleAtom8395); 

                        	newLeafNode(otherlv_6, grammarAccess.getAtomAccess().getRightParenthesisKeyword_4_2());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleEventRef"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3637:1: entryRuleEventRef returns [EObject current=null] : iv_ruleEventRef= ruleEventRef EOF ;
    public final EObject entryRuleEventRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventRef = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3638:2: (iv_ruleEventRef= ruleEventRef EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3639:2: iv_ruleEventRef= ruleEventRef EOF
            {
             newCompositeNode(grammarAccess.getEventRefRule()); 
            pushFollow(FOLLOW_ruleEventRef_in_entryRuleEventRef8432);
            iv_ruleEventRef=ruleEventRef();

            state._fsp--;

             current =iv_ruleEventRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventRef8442); 

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
    // $ANTLR end "entryRuleEventRef"


    // $ANTLR start "ruleEventRef"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3646:1: ruleEventRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleEventRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3649:28: ( ( ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3650:1: ( ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3650:1: ( ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3650:2: ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3650:2: ( (otherlv_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3651:1: (otherlv_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3651:1: (otherlv_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3652:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventRef8487); 

            		newLeafNode(otherlv_0, grammarAccess.getEventRefAccess().getVariableNamedElementCrossReference_0_0()); 
            	

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3663:2: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==60) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3663:3: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3663:3: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3664:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getEventRefAccess().getNestedQualifiedEventRefTargetAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleEventRef8509); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEventRefAccess().getFullStopKeyword_1_1());
            	        
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3673:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3674:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3674:1: (otherlv_3= RULE_ID )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3675:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEventRefRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventRef8529); 

            	    		newLeafNode(otherlv_3, grammarAccess.getEventRefAccess().getNestedVariableNamedElementCrossReference_1_2_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventRef"


    // $ANTLR start "entryRuleVariableRef"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3694:1: entryRuleVariableRef returns [EObject current=null] : iv_ruleVariableRef= ruleVariableRef EOF ;
    public final EObject entryRuleVariableRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableRef = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3695:2: (iv_ruleVariableRef= ruleVariableRef EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3696:2: iv_ruleVariableRef= ruleVariableRef EOF
            {
             newCompositeNode(grammarAccess.getVariableRefRule()); 
            pushFollow(FOLLOW_ruleVariableRef_in_entryRuleVariableRef8567);
            iv_ruleVariableRef=ruleVariableRef();

            state._fsp--;

             current =iv_ruleVariableRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableRef8577); 

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
    // $ANTLR end "entryRuleVariableRef"


    // $ANTLR start "ruleVariableRef"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3703:1: ruleVariableRef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleVariableRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3706:28: ( ( ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3707:1: ( ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3707:1: ( ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3707:2: ( (otherlv_0= RULE_ID ) ) ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3707:2: ( (otherlv_0= RULE_ID ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3708:1: (otherlv_0= RULE_ID )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3708:1: (otherlv_0= RULE_ID )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3709:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVariableRefRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableRef8622); 

            		newLeafNode(otherlv_0, grammarAccess.getVariableRefAccess().getVariableNamedElementCrossReference_0_0()); 
            	

            }


            }

            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3720:2: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==60) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3720:3: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3720:3: ()
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3721:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getVariableRefAccess().getNestedQualifiedVariableRefTargetAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleVariableRef8644); 

            	        	newLeafNode(otherlv_2, grammarAccess.getVariableRefAccess().getFullStopKeyword_1_1());
            	        
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3730:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3731:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3731:1: (otherlv_3= RULE_ID )
            	    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3732:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getVariableRefRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableRef8664); 

            	    		newLeafNode(otherlv_3, grammarAccess.getVariableRefAccess().getNestedVariableNamedElementCrossReference_1_2_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableRef"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3751:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3752:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3753:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral8702);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral8712); 

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3760:1: ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3763:28: ( ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3764:1: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3764:1: ( ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3765:1: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3765:1: ( (lv_value_0_1= 'true' | lv_value_0_2= 'false' ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3766:1: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3766:1: (lv_value_0_1= 'true' | lv_value_0_2= 'false' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==61) ) {
                alt56=1;
            }
            else if ( (LA56_0==62) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3767:3: lv_value_0_1= 'true'
                    {
                    lv_value_0_1=(Token)match(input,61,FOLLOW_61_in_ruleBooleanLiteral8756); 

                            newLeafNode(lv_value_0_1, grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3779:8: lv_value_0_2= 'false'
                    {
                    lv_value_0_2=(Token)match(input,62,FOLLOW_62_in_ruleBooleanLiteral8785); 

                            newLeafNode(lv_value_0_2, grammarAccess.getBooleanLiteralAccess().getValueFalseKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "value", lv_value_0_2, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3802:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3803:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3804:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral8836);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral8846); 

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3811:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3814:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3815:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3815:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3816:1: (lv_value_0_0= RULE_STRING )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3816:1: (lv_value_0_0= RULE_STRING )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3817:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral8887); 

            			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

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

             leaveRule(); 
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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3841:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3842:2: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3843:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral8927);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteral8937); 

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
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3850:1: ruleIntegerLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3853:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3854:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3854:1: ( (lv_value_0_0= RULE_INT ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3855:1: (lv_value_0_0= RULE_INT )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3855:1: (lv_value_0_0= RULE_INT )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3856:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntegerLiteral8978); 

            			newLeafNode(lv_value_0_0, grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 
            		

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

             leaveRule(); 
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


    // $ANTLR start "rulePrimitiveTypeKind"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3880:1: rulePrimitiveTypeKind returns [Enumerator current=null] : ( (enumLiteral_0= 'integer' ) | (enumLiteral_1= 'bool' ) ) ;
    public final Enumerator rulePrimitiveTypeKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3882:28: ( ( (enumLiteral_0= 'integer' ) | (enumLiteral_1= 'bool' ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3883:1: ( (enumLiteral_0= 'integer' ) | (enumLiteral_1= 'bool' ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3883:1: ( (enumLiteral_0= 'integer' ) | (enumLiteral_1= 'bool' ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==63) ) {
                alt57=1;
            }
            else if ( (LA57_0==64) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3883:2: (enumLiteral_0= 'integer' )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3883:2: (enumLiteral_0= 'integer' )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3883:4: enumLiteral_0= 'integer'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_63_in_rulePrimitiveTypeKind9032); 

                            current = grammarAccess.getPrimitiveTypeKindAccess().getINTEGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveTypeKindAccess().getINTEGEREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3889:6: (enumLiteral_1= 'bool' )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3889:6: (enumLiteral_1= 'bool' )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3889:8: enumLiteral_1= 'bool'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_64_in_rulePrimitiveTypeKind9049); 

                            current = grammarAccess.getPrimitiveTypeKindAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveTypeKindAccess().getBOOLEANEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveTypeKind"


    // $ANTLR start "ruleFlowKind"
    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3899:1: ruleFlowKind returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) ;
    public final Enumerator ruleFlowKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3901:28: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) ) )
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3902:1: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            {
            // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3902:1: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) | (enumLiteral_2= 'inout' ) )
            int alt58=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt58=1;
                }
                break;
            case 66:
                {
                alt58=2;
                }
                break;
            case 67:
                {
                alt58=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3902:2: (enumLiteral_0= 'in' )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3902:2: (enumLiteral_0= 'in' )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3902:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_65_in_ruleFlowKind9094); 

                            current = grammarAccess.getFlowKindAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFlowKindAccess().getINEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3908:6: (enumLiteral_1= 'out' )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3908:6: (enumLiteral_1= 'out' )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3908:8: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_66_in_ruleFlowKind9111); 

                            current = grammarAccess.getFlowKindAccess().getOUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFlowKindAccess().getOUTEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3914:6: (enumLiteral_2= 'inout' )
                    {
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3914:6: (enumLiteral_2= 'inout' )
                    // ../org.osate.altarica/src-gen/org/osate/altarica/parser/antlr/internal/InternalAltarica.g:3914:8: enumLiteral_2= 'inout'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_67_in_ruleFlowKind9128); 

                            current = grammarAccess.getFlowKindAccess().getINOUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFlowKindAccess().getINOUTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlowKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclaration_in_ruleSystem130 = new BitSet(new long[]{0x0000000000208802L});
    public static final BitSet FOLLOW_ruleAbstractDeclaration_in_entryRuleAbstractDeclaration166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDeclaration176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_ruleAbstractDeclaration223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_ruleAbstractDeclaration250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_ruleAbstractDeclaration277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinition322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleConstantDefinition368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinition385 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleAbstractDefinitionConstant_in_ruleConstantDefinition411 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConstantDefinition423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDefinitionConstant_in_entryRuleAbstractDefinitionConstant459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDefinitionConstant469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionConstant_in_ruleAbstractDefinitionConstant516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainConstant_in_ruleAbstractDefinitionConstant543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionConstant_in_entryRuleExpressionConstant578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionConstant588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleExpressionConstant625 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionConstant646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainConstant_in_entryRuleDomainConstant682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainConstant692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleDomainConstant729 = new BitSet(new long[]{0x8000000000090000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleAbstractDomain_in_ruleDomainConstant750 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleDomainConstant763 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDomainConstant784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDomain878 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomain895 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDomain912 = new BitSet(new long[]{0x8000000000090000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleAbstractDomain_in_ruleDomain933 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDomain945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDomain_in_entryRuleAbstractDomain981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDomain991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleAbstractDomain1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_ruleAbstractDomain1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleAbstractDomain1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange1127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleRange1174 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleRange1195 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRange1207 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleRange1228 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRange1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEnumeration1323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleEnumeration1344 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_17_in_ruleEnumeration1357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleEnumeration1378 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_20_in_ruleEnumeration1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveTypeKind_in_rulePrimitiveType1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode1620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleNode1676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNode1693 = new BitSet(new long[]{0x00000021E7C00000L});
    public static final BitSet FOLLOW_ruleAbstractSpecification_in_ruleNode1719 = new BitSet(new long[]{0x00000021E7C00000L});
    public static final BitSet FOLLOW_22_in_ruleNode1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractSpecification_in_entryRuleAbstractSpecification1768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractSpecification1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlowSpecification_in_ruleAbstractSpecification1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_ruleAbstractSpecification1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpecification_in_ruleAbstractSpecification1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeInstanceSpecification_in_ruleAbstractSpecification1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertSpecification_in_ruleAbstractSpecification1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorSpecification_in_ruleAbstractSpecification1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_ruleAbstractSpecification1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitSpecification_in_ruleAbstractSpecification2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalSpecification_in_ruleAbstractSpecification2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_entryRuleVariableAttribute2076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAttribute2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableAttribute2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitSpecification_in_entryRuleInitSpecification2167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitSpecification2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleInitSpecification2214 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInitStatement_in_ruleInitSpecification2235 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleInitStatement_in_entryRuleInitStatement2272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitStatement2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleInitStatement2328 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleInitStatement2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalSpecification_in_entryRuleExternalSpecification2376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalSpecification2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleExternalSpecification2423 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleExternalDirective_in_ruleExternalSpecification2444 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleExternalDirective_in_entryRuleExternalDirective2481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalDirective2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleExternalDirective2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlowSpecification_in_entryRuleFlowSpecification2572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlowSpecification2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFlowSpecification2619 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleFlow_in_ruleFlowSpecification2640 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleFlow_in_entryRuleFlow2677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlow2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFlow2738 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFlow2755 = new BitSet(new long[]{0x8000000000090010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleAbstractTypeRef_in_ruleFlow2776 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_ruleFlow2789 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000EL});
    public static final BitSet FOLLOW_ruleFlowKind_in_ruleFlow2810 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_ruleFlow2825 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_ruleFlow2846 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFlow2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSpecification_in_entryRuleEventSpecification2896 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventSpecification2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleEventSpecification2943 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleEventSpecification2964 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent3001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent3062 = new BitSet(new long[]{0x0000000000015000L});
    public static final BitSet FOLLOW_16_in_ruleEvent3080 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rulePriority_in_ruleEvent3101 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvent3113 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_ruleEvent3128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_ruleEvent3149 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEvent3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePriority_in_entryRulePriority3199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePriority3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulePriority3247 = new BitSet(new long[]{0x67000A00000000D0L});
    public static final BitSet FOLLOW_28_in_rulePriority3265 = new BitSet(new long[]{0x67000A00000000D0L});
    public static final BitSet FOLLOW_ruleAbstractExpression_in_rulePriority3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateSpecification_in_entryRuleStateSpecification3323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateSpecification3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleStateSpecification3370 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleState_in_ruleStateSpecification3391 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState3428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState3489 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState3506 = new BitSet(new long[]{0x8000000000090010L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleAbstractTypeRef_in_ruleState3527 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_14_in_ruleState3540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVariableAttribute_in_ruleState3561 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractTypeRef_in_entryRuleAbstractTypeRef3611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractTypeRef3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainRef_in_ruleAbstractTypeRef3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDomain_in_ruleAbstractTypeRef3695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainRef_in_entryRuleDomainRef3730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainRef3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDomainRef3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeInstanceSpecification_in_entryRuleNodeInstanceSpecification3819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeInstanceSpecification3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleNodeInstanceSpecification3866 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNodeInstance_in_ruleNodeInstanceSpecification3887 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNodeInstance_in_entryRuleNodeInstance3924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeInstance3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeInstance3985 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleNodeInstance4002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNodeInstance4022 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNodeInstance4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertSpecification_in_entryRuleAssertSpecification4070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertSpecification4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleAssertSpecification4117 = new BitSet(new long[]{0x67000A00000000D2L});
    public static final BitSet FOLLOW_ruleAssert_in_ruleAssertSpecification4138 = new BitSet(new long[]{0x67000A00000000D2L});
    public static final BitSet FOLLOW_ruleAssert_in_entryRuleAssert4175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssert4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractBooleanExpression_in_ruleAssert4231 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAssert4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorSpecification_in_entryRuleVectorSpecification4279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVectorSpecification4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleVectorSpecification4326 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleVector_in_ruleVectorSpecification4347 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleVector_in_entryRuleVector4384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVector4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleVector4431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVectorParameter_in_ruleVector4452 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_17_in_ruleVector4465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVectorParameter_in_ruleVector4486 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_34_in_ruleVector4500 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_16_in_ruleVector4513 = new BitSet(new long[]{0x0000001400002000L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleVector4534 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVector4546 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleVector4560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVectorParameter_in_entryRuleVectorParameter4596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVectorParameter4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRef_in_ruleVectorParameter4652 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleVectorParameter4670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality4720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCardinality4768 = new BitSet(new long[]{0x67000A00000000D0L});
    public static final BitSet FOLLOW_ruleAbstractExpression_in_ruleCardinality4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCardinality4809 = new BitSet(new long[]{0x67000A00000000D0L});
    public static final BitSet FOLLOW_ruleAbstractExpression_in_ruleCardinality4830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleCardinality4850 = new BitSet(new long[]{0x67000A00000000D0L});
    public static final BitSet FOLLOW_ruleAbstractExpression_in_ruleCardinality4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionSpecification_in_entryRuleTransitionSpecification4908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSpecification4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTransitionSpecification4955 = new BitSet(new long[]{0x67000A00000000D2L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleTransitionSpecification4976 = new BitSet(new long[]{0x67000A00000000D2L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition5013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractExpression_in_ruleTransition5069 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleTransition5081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition5101 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleTransition5113 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleTransition5135 = new BitSet(new long[]{0x0000000000021010L});
    public static final BitSet FOLLOW_17_in_ruleTransition5148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleTransition5169 = new BitSet(new long[]{0x0000000000021010L});
    public static final BitSet FOLLOW_12_in_ruleTransition5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment5221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment5231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment5276 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleAssignment5288 = new BitSet(new long[]{0x67000A00000000D0L});
    public static final BitSet FOLLOW_ruleAbstractExpression_in_ruleAssignment5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractExpression_in_entryRuleAbstractExpression5345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractExpression5355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElse_in_ruleAbstractExpression5402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_ruleAbstractExpression5429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAbstractExpression5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractBooleanExpression_in_entryRuleAbstractBooleanExpression5491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractBooleanExpression5501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElse_in_ruleAbstractBooleanExpression5548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_ruleAbstractBooleanExpression5575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleAbstractBooleanExpression5602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_entryRuleSwitch5637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch5647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleSwitch5684 = new BitSet(new long[]{0x67000400000000D0L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_ruleSwitch5705 = new BitSet(new long[]{0x67000400000000D0L});
    public static final BitSet FOLLOW_42_in_ruleSwitch5718 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSwitch5739 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSwitch5751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCaseExpression_in_entryRuleCaseExpression5787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCaseExpression5797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleCaseExpression5843 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCaseExpression5855 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCaseExpression5876 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCaseExpression5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElse_in_entryRuleIfThenElse5924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfThenElse5934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleIfThenElse5971 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleIfThenElse5992 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleIfThenElse6004 = new BitSet(new long[]{0x67000200000000D0L});
    public static final BitSet FOLLOW_ruleSwitch_in_ruleIfThenElse6027 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfThenElse6046 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleIfThenElse6061 = new BitSet(new long[]{0x67000200000000D0L});
    public static final BitSet FOLLOW_ruleSwitch_in_ruleIfThenElse6084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfThenElse6103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinus_in_ruleExpression6199 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleExpression6220 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleMinus_in_ruleExpression6241 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ruleMinus_in_entryRuleMinus6279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinus6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleMinus6336 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleMinus6357 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleMinus6378 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication6416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication6426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivision_in_ruleMultiplication6473 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleMultiplication6494 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleDivision_in_ruleMultiplication6515 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ruleDivision_in_entryRuleDivision6553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivision6563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleDivision6610 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleDivision6631 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_ruleDivision6652 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpression_in_entryRuleBooleanExpression6690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpression6700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleBooleanExpression6746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd6780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd6790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleAnd6837 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_49_in_ruleAnd6859 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_50_in_ruleAnd6877 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleOr_in_ruleAnd6899 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr6937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr6947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqual_in_ruleOr6994 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_51_in_ruleOr7016 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_52_in_ruleOr7034 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleEqual_in_ruleOr7056 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_ruleEqual_in_entryRuleEqual7094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqual7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqual_in_ruleEqual7151 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleEqual7172 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleNotEqual_in_ruleEqual7193 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleNotEqual_in_entryRuleNotEqual7231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqual7241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrictLower_in_ruleNotEqual7288 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleNotEqual7309 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleStrictLower_in_ruleNotEqual7330 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleStrictLower_in_entryRuleStrictLower7368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrictLower7378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLower_in_ruleStrictLower7425 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleStrictLower7446 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleLower_in_ruleStrictLower7467 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleLower_in_entryRuleLower7505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLower7515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrictUpper_in_ruleLower7562 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleLower7583 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleStrictUpper_in_ruleLower7604 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleStrictUpper_in_entryRuleStrictUpper7642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrictUpper7652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUpper_in_ruleStrictUpper7699 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleStrictUpper7720 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleUpper_in_ruleStrictUpper7741 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleUpper_in_entryRuleUpper7779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUpper7789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImply_in_ruleUpper7836 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleUpper7857 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleImply_in_ruleUpper7878 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleImply_in_entryRuleImply7916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImply7926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_ruleImply7973 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleImply7994 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleNot_in_ruleImply8015 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_entryRuleNot8053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNot8063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleNot8102 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_57_in_ruleNot8120 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleNot8142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleNot8171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom8206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom8216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleAtom8263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleAtom8290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_ruleAtom8317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableRef_in_ruleAtom8344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleAtom8362 = new BitSet(new long[]{0x67000000000000D0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAtom8384 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleAtom8395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventRef_in_entryRuleEventRef8432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventRef8442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventRef8487 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleEventRef8509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventRef8529 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleVariableRef_in_entryRuleVariableRef8567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableRef8577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableRef8622 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleVariableRef8644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableRef8664 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral8702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral8712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleBooleanLiteral8756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleBooleanLiteral8785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral8836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral8846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral8887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteral_in_entryRuleIntegerLiteral8927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteral8937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntegerLiteral8978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePrimitiveTypeKind9032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rulePrimitiveTypeKind9049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleFlowKind9094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleFlowKind9111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleFlowKind9128 = new BitSet(new long[]{0x0000000000000002L});

}