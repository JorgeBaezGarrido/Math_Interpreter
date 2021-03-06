package mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import mdsd.services.MathInterpeterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathInterpeterParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'result'", "'is'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMathInterpeterParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathInterpeterParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathInterpeterParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMathInterpeter.g"; }



     	private MathInterpeterGrammarAccess grammarAccess;

        public InternalMathInterpeterParser(TokenStream input, MathInterpeterGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathExp";
       	}

       	@Override
       	protected MathInterpeterGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathExp"
    // InternalMathInterpeter.g:64:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMathInterpeter.g:64:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMathInterpeter.g:65:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMathInterpeter.g:71:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMathInterpeter.g:77:2: ( (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) ) )
            // InternalMathInterpeter.g:78:2: (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) )
            {
            // InternalMathInterpeter.g:78:2: (otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) )
            // InternalMathInterpeter.g:79:3: otherlv_0= 'result' otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getResultKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMathExpAccess().getIsKeyword_1());
            		
            // InternalMathInterpeter.g:87:3: ( (lv_exp_2_0= ruleExp ) )
            // InternalMathInterpeter.g:88:4: (lv_exp_2_0= ruleExp )
            {
            // InternalMathInterpeter.g:88:4: (lv_exp_2_0= ruleExp )
            // InternalMathInterpeter.g:89:5: lv_exp_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"mdsd.MathInterpeter.Exp");
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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMathInterpeter.g:110:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMathInterpeter.g:110:44: (iv_ruleExp= ruleExp EOF )
            // InternalMathInterpeter.g:111:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMathInterpeter.g:117:1: ruleExp returns [EObject current=null] : this_PlusMinus_0= rulePlusMinus ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject this_PlusMinus_0 = null;



        	enterRule();

        try {
            // InternalMathInterpeter.g:123:2: (this_PlusMinus_0= rulePlusMinus )
            // InternalMathInterpeter.g:124:2: this_PlusMinus_0= rulePlusMinus
            {

            		newCompositeNode(grammarAccess.getExpAccess().getPlusMinusParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PlusMinus_0=rulePlusMinus();

            state._fsp--;


            		current = this_PlusMinus_0;
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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRulePlusMinus"
    // InternalMathInterpeter.g:135:1: entryRulePlusMinus returns [EObject current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final EObject entryRulePlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinus = null;


        try {
            // InternalMathInterpeter.g:135:50: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalMathInterpeter.g:136:2: iv_rulePlusMinus= rulePlusMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusMinus=rulePlusMinus();

            state._fsp--;

             current =iv_rulePlusMinus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalMathInterpeter.g:142:1: rulePlusMinus returns [EObject current=null] : (this_MultDiv_0= ruleMultDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultDiv ) ) )* ) ;
    public final EObject rulePlusMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MultDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMathInterpeter.g:148:2: ( (this_MultDiv_0= ruleMultDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultDiv ) ) )* ) )
            // InternalMathInterpeter.g:149:2: (this_MultDiv_0= ruleMultDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultDiv ) ) )* )
            {
            // InternalMathInterpeter.g:149:2: (this_MultDiv_0= ruleMultDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultDiv ) ) )* )
            // InternalMathInterpeter.g:150:3: this_MultDiv_0= ruleMultDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusMinusAccess().getMultDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_MultDiv_0=ruleMultDiv();

            state._fsp--;


            			current = this_MultDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathInterpeter.g:158:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultDiv ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=13 && LA2_0<=14)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMathInterpeter.g:159:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultDiv ) )
            	    {
            	    // InternalMathInterpeter.g:159:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==13) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==14) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalMathInterpeter.g:160:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMathInterpeter.g:160:5: ( () otherlv_2= '+' )
            	            // InternalMathInterpeter.g:161:6: () otherlv_2= '+'
            	            {
            	            // InternalMathInterpeter.g:161:6: ()
            	            // InternalMathInterpeter.g:162:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMathInterpeter.g:174:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMathInterpeter.g:174:5: ( () otherlv_4= '-' )
            	            // InternalMathInterpeter.g:175:6: () otherlv_4= '-'
            	            {
            	            // InternalMathInterpeter.g:175:6: ()
            	            // InternalMathInterpeter.g:176:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,14,FOLLOW_4); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMathInterpeter.g:188:4: ( (lv_right_5_0= ruleMultDiv ) )
            	    // InternalMathInterpeter.g:189:5: (lv_right_5_0= ruleMultDiv )
            	    {
            	    // InternalMathInterpeter.g:189:5: (lv_right_5_0= ruleMultDiv )
            	    // InternalMathInterpeter.g:190:6: lv_right_5_0= ruleMultDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusMinusAccess().getRightMultDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_right_5_0=ruleMultDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"mdsd.MathInterpeter.MultDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleMultDiv"
    // InternalMathInterpeter.g:212:1: entryRuleMultDiv returns [EObject current=null] : iv_ruleMultDiv= ruleMultDiv EOF ;
    public final EObject entryRuleMultDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultDiv = null;


        try {
            // InternalMathInterpeter.g:212:48: (iv_ruleMultDiv= ruleMultDiv EOF )
            // InternalMathInterpeter.g:213:2: iv_ruleMultDiv= ruleMultDiv EOF
            {
             newCompositeNode(grammarAccess.getMultDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultDiv=ruleMultDiv();

            state._fsp--;

             current =iv_ruleMultDiv; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultDiv"


    // $ANTLR start "ruleMultDiv"
    // InternalMathInterpeter.g:219:1: ruleMultDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMathInterpeter.g:225:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMathInterpeter.g:226:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMathInterpeter.g:226:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMathInterpeter.g:227:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathInterpeter.g:235:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=15 && LA4_0<=16)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMathInterpeter.g:236:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMathInterpeter.g:236:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==15) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==16) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalMathInterpeter.g:237:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalMathInterpeter.g:237:5: ( () otherlv_2= '*' )
            	            // InternalMathInterpeter.g:238:6: () otherlv_2= '*'
            	            {
            	            // InternalMathInterpeter.g:238:6: ()
            	            // InternalMathInterpeter.g:239:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultDivAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            	            						newLeafNode(otherlv_2, grammarAccess.getMultDivAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMathInterpeter.g:251:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalMathInterpeter.g:251:5: ( () otherlv_4= '/' )
            	            // InternalMathInterpeter.g:252:6: () otherlv_4= '/'
            	            {
            	            // InternalMathInterpeter.g:252:6: ()
            	            // InternalMathInterpeter.g:253:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMultDivAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	            						newLeafNode(otherlv_4, grammarAccess.getMultDivAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMathInterpeter.g:265:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMathInterpeter.g:266:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMathInterpeter.g:266:5: (lv_right_5_0= rulePrimary )
            	    // InternalMathInterpeter.g:267:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultDivAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"mdsd.MathInterpeter.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleMultDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalMathInterpeter.g:289:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMathInterpeter.g:289:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMathInterpeter.g:290:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMathInterpeter.g:296:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parenthesis_1 = null;



        	enterRule();

        try {
            // InternalMathInterpeter.g:302:2: ( (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis ) )
            // InternalMathInterpeter.g:303:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis )
            {
            // InternalMathInterpeter.g:303:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMathInterpeter.g:304:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current = this_Number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMathInterpeter.g:313:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMathInterpeter.g:325:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMathInterpeter.g:325:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMathInterpeter.g:326:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMathInterpeter.g:332:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalMathInterpeter.g:338:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) )
            // InternalMathInterpeter.g:339:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            {
            // InternalMathInterpeter.g:339:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
            // InternalMathInterpeter.g:340:3: otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMathInterpeter.g:344:3: ( (lv_exp_1_0= ruleExp ) )
            // InternalMathInterpeter.g:345:4: (lv_exp_1_0= ruleExp )
            {
            // InternalMathInterpeter.g:345:4: (lv_exp_1_0= ruleExp )
            // InternalMathInterpeter.g:346:5: lv_exp_1_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_exp_1_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"mdsd.MathInterpeter.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalMathInterpeter.g:371:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalMathInterpeter.g:371:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalMathInterpeter.g:372:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMathInterpeter.g:378:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMathInterpeter.g:384:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMathInterpeter.g:385:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMathInterpeter.g:385:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMathInterpeter.g:386:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMathInterpeter.g:386:3: (lv_value_0_0= RULE_INT )
            // InternalMathInterpeter.g:387:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});

}