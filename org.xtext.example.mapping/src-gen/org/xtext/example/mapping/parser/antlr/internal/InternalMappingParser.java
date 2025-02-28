package org.xtext.example.mapping.parser.antlr.internal;

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
import org.xtext.example.mapping.services.MappingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMappingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MappingModel'", "'SourceMetamodels'", "'{'", "','", "'}'", "'MainSourceMetamodel'", "'TargetMetamodels'", "'MappingRules'", "';'", "'MappingRule'", "'identifier'", "'source'", "'::'", "'target'", "'operator'", "'condition'", "'comment'", "'HelperStatement'", "'statement'", "'.'", "'var'", "'assign'", "'add'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

    // delegates
    // delegators


        public InternalMappingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMappingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMappingParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMapping.g"; }



     	private MappingGrammarAccess grammarAccess;

        public InternalMappingParser(TokenStream input, MappingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MappingModel";
       	}

       	@Override
       	protected MappingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMappingModel"
    // InternalMapping.g:65:1: entryRuleMappingModel returns [EObject current=null] : iv_ruleMappingModel= ruleMappingModel EOF ;
    public final EObject entryRuleMappingModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingModel = null;


        try {
            // InternalMapping.g:65:53: (iv_ruleMappingModel= ruleMappingModel EOF )
            // InternalMapping.g:66:2: iv_ruleMappingModel= ruleMappingModel EOF
            {
             newCompositeNode(grammarAccess.getMappingModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappingModel=ruleMappingModel();

            state._fsp--;

             current =iv_ruleMappingModel; 
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
    // $ANTLR end "entryRuleMappingModel"


    // $ANTLR start "ruleMappingModel"
    // InternalMapping.g:72:1: ruleMappingModel returns [EObject current=null] : (otherlv_0= 'MappingModel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'SourceMetamodels' otherlv_3= '{' ( (lv_SourceMetamodels_4_0= ruleSourceMetamodel ) ) (otherlv_5= ',' ( (lv_SourceMetamodels_6_0= ruleSourceMetamodel ) ) )* otherlv_7= '}' (otherlv_8= 'MainSourceMetamodel' ( ( ruleQualifiedName ) ) )? otherlv_10= 'TargetMetamodels' otherlv_11= '{' ( (lv_TargetMetamodels_12_0= ruleTargetMetamodel ) ) (otherlv_13= ',' ( (lv_TargetMetamodels_14_0= ruleTargetMetamodel ) ) )* otherlv_15= '}' (otherlv_16= 'MappingRules' otherlv_17= '{' ( (lv_Rules_18_0= ruleMappingRule ) ) (otherlv_19= ';' ( (lv_Rules_20_0= ruleMappingRule ) ) )* otherlv_21= '}' )? ) ;
    public final EObject ruleMappingModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_SourceMetamodels_4_0 = null;

        EObject lv_SourceMetamodels_6_0 = null;

        EObject lv_TargetMetamodels_12_0 = null;

        EObject lv_TargetMetamodels_14_0 = null;

        EObject lv_Rules_18_0 = null;

        EObject lv_Rules_20_0 = null;



        	enterRule();

        try {
            // InternalMapping.g:78:2: ( (otherlv_0= 'MappingModel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'SourceMetamodels' otherlv_3= '{' ( (lv_SourceMetamodels_4_0= ruleSourceMetamodel ) ) (otherlv_5= ',' ( (lv_SourceMetamodels_6_0= ruleSourceMetamodel ) ) )* otherlv_7= '}' (otherlv_8= 'MainSourceMetamodel' ( ( ruleQualifiedName ) ) )? otherlv_10= 'TargetMetamodels' otherlv_11= '{' ( (lv_TargetMetamodels_12_0= ruleTargetMetamodel ) ) (otherlv_13= ',' ( (lv_TargetMetamodels_14_0= ruleTargetMetamodel ) ) )* otherlv_15= '}' (otherlv_16= 'MappingRules' otherlv_17= '{' ( (lv_Rules_18_0= ruleMappingRule ) ) (otherlv_19= ';' ( (lv_Rules_20_0= ruleMappingRule ) ) )* otherlv_21= '}' )? ) )
            // InternalMapping.g:79:2: (otherlv_0= 'MappingModel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'SourceMetamodels' otherlv_3= '{' ( (lv_SourceMetamodels_4_0= ruleSourceMetamodel ) ) (otherlv_5= ',' ( (lv_SourceMetamodels_6_0= ruleSourceMetamodel ) ) )* otherlv_7= '}' (otherlv_8= 'MainSourceMetamodel' ( ( ruleQualifiedName ) ) )? otherlv_10= 'TargetMetamodels' otherlv_11= '{' ( (lv_TargetMetamodels_12_0= ruleTargetMetamodel ) ) (otherlv_13= ',' ( (lv_TargetMetamodels_14_0= ruleTargetMetamodel ) ) )* otherlv_15= '}' (otherlv_16= 'MappingRules' otherlv_17= '{' ( (lv_Rules_18_0= ruleMappingRule ) ) (otherlv_19= ';' ( (lv_Rules_20_0= ruleMappingRule ) ) )* otherlv_21= '}' )? )
            {
            // InternalMapping.g:79:2: (otherlv_0= 'MappingModel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'SourceMetamodels' otherlv_3= '{' ( (lv_SourceMetamodels_4_0= ruleSourceMetamodel ) ) (otherlv_5= ',' ( (lv_SourceMetamodels_6_0= ruleSourceMetamodel ) ) )* otherlv_7= '}' (otherlv_8= 'MainSourceMetamodel' ( ( ruleQualifiedName ) ) )? otherlv_10= 'TargetMetamodels' otherlv_11= '{' ( (lv_TargetMetamodels_12_0= ruleTargetMetamodel ) ) (otherlv_13= ',' ( (lv_TargetMetamodels_14_0= ruleTargetMetamodel ) ) )* otherlv_15= '}' (otherlv_16= 'MappingRules' otherlv_17= '{' ( (lv_Rules_18_0= ruleMappingRule ) ) (otherlv_19= ';' ( (lv_Rules_20_0= ruleMappingRule ) ) )* otherlv_21= '}' )? )
            // InternalMapping.g:80:3: otherlv_0= 'MappingModel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'SourceMetamodels' otherlv_3= '{' ( (lv_SourceMetamodels_4_0= ruleSourceMetamodel ) ) (otherlv_5= ',' ( (lv_SourceMetamodels_6_0= ruleSourceMetamodel ) ) )* otherlv_7= '}' (otherlv_8= 'MainSourceMetamodel' ( ( ruleQualifiedName ) ) )? otherlv_10= 'TargetMetamodels' otherlv_11= '{' ( (lv_TargetMetamodels_12_0= ruleTargetMetamodel ) ) (otherlv_13= ',' ( (lv_TargetMetamodels_14_0= ruleTargetMetamodel ) ) )* otherlv_15= '}' (otherlv_16= 'MappingRules' otherlv_17= '{' ( (lv_Rules_18_0= ruleMappingRule ) ) (otherlv_19= ';' ( (lv_Rules_20_0= ruleMappingRule ) ) )* otherlv_21= '}' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingModelAccess().getMappingModelKeyword_0());
            		
            // InternalMapping.g:84:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMapping.g:85:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMapping.g:85:4: (lv_name_1_0= RULE_STRING )
            // InternalMapping.g:86:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMappingModelAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mapping.Mapping.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMappingModelAccess().getSourceMetamodelsKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getMappingModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMapping.g:110:3: ( (lv_SourceMetamodels_4_0= ruleSourceMetamodel ) )
            // InternalMapping.g:111:4: (lv_SourceMetamodels_4_0= ruleSourceMetamodel )
            {
            // InternalMapping.g:111:4: (lv_SourceMetamodels_4_0= ruleSourceMetamodel )
            // InternalMapping.g:112:5: lv_SourceMetamodels_4_0= ruleSourceMetamodel
            {

            					newCompositeNode(grammarAccess.getMappingModelAccess().getSourceMetamodelsSourceMetamodelParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_SourceMetamodels_4_0=ruleSourceMetamodel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappingModelRule());
            					}
            					add(
            						current,
            						"SourceMetamodels",
            						lv_SourceMetamodels_4_0,
            						"org.xtext.example.mapping.Mapping.SourceMetamodel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMapping.g:129:3: (otherlv_5= ',' ( (lv_SourceMetamodels_6_0= ruleSourceMetamodel ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMapping.g:130:4: otherlv_5= ',' ( (lv_SourceMetamodels_6_0= ruleSourceMetamodel ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_5, grammarAccess.getMappingModelAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMapping.g:134:4: ( (lv_SourceMetamodels_6_0= ruleSourceMetamodel ) )
            	    // InternalMapping.g:135:5: (lv_SourceMetamodels_6_0= ruleSourceMetamodel )
            	    {
            	    // InternalMapping.g:135:5: (lv_SourceMetamodels_6_0= ruleSourceMetamodel )
            	    // InternalMapping.g:136:6: lv_SourceMetamodels_6_0= ruleSourceMetamodel
            	    {

            	    						newCompositeNode(grammarAccess.getMappingModelAccess().getSourceMetamodelsSourceMetamodelParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_SourceMetamodels_6_0=ruleSourceMetamodel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMappingModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"SourceMetamodels",
            	    							lv_SourceMetamodels_6_0,
            	    							"org.xtext.example.mapping.Mapping.SourceMetamodel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getMappingModelAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalMapping.g:158:3: (otherlv_8= 'MainSourceMetamodel' ( ( ruleQualifiedName ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMapping.g:159:4: otherlv_8= 'MainSourceMetamodel' ( ( ruleQualifiedName ) )
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getMappingModelAccess().getMainSourceMetamodelKeyword_7_0());
                    			
                    // InternalMapping.g:163:4: ( ( ruleQualifiedName ) )
                    // InternalMapping.g:164:5: ( ruleQualifiedName )
                    {
                    // InternalMapping.g:164:5: ( ruleQualifiedName )
                    // InternalMapping.g:165:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMappingModelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMappingModelAccess().getMainSourceMetamodelSourceMetamodelCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getMappingModelAccess().getTargetMetamodelsKeyword_8());
            		
            otherlv_11=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getMappingModelAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalMapping.g:188:3: ( (lv_TargetMetamodels_12_0= ruleTargetMetamodel ) )
            // InternalMapping.g:189:4: (lv_TargetMetamodels_12_0= ruleTargetMetamodel )
            {
            // InternalMapping.g:189:4: (lv_TargetMetamodels_12_0= ruleTargetMetamodel )
            // InternalMapping.g:190:5: lv_TargetMetamodels_12_0= ruleTargetMetamodel
            {

            					newCompositeNode(grammarAccess.getMappingModelAccess().getTargetMetamodelsTargetMetamodelParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_7);
            lv_TargetMetamodels_12_0=ruleTargetMetamodel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappingModelRule());
            					}
            					add(
            						current,
            						"TargetMetamodels",
            						lv_TargetMetamodels_12_0,
            						"org.xtext.example.mapping.Mapping.TargetMetamodel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMapping.g:207:3: (otherlv_13= ',' ( (lv_TargetMetamodels_14_0= ruleTargetMetamodel ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMapping.g:208:4: otherlv_13= ',' ( (lv_TargetMetamodels_14_0= ruleTargetMetamodel ) )
            	    {
            	    otherlv_13=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_13, grammarAccess.getMappingModelAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalMapping.g:212:4: ( (lv_TargetMetamodels_14_0= ruleTargetMetamodel ) )
            	    // InternalMapping.g:213:5: (lv_TargetMetamodels_14_0= ruleTargetMetamodel )
            	    {
            	    // InternalMapping.g:213:5: (lv_TargetMetamodels_14_0= ruleTargetMetamodel )
            	    // InternalMapping.g:214:6: lv_TargetMetamodels_14_0= ruleTargetMetamodel
            	    {

            	    						newCompositeNode(grammarAccess.getMappingModelAccess().getTargetMetamodelsTargetMetamodelParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_TargetMetamodels_14_0=ruleTargetMetamodel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMappingModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"TargetMetamodels",
            	    							lv_TargetMetamodels_14_0,
            	    							"org.xtext.example.mapping.Mapping.TargetMetamodel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_15=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getMappingModelAccess().getRightCurlyBracketKeyword_12());
            		
            // InternalMapping.g:236:3: (otherlv_16= 'MappingRules' otherlv_17= '{' ( (lv_Rules_18_0= ruleMappingRule ) ) (otherlv_19= ';' ( (lv_Rules_20_0= ruleMappingRule ) ) )* otherlv_21= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMapping.g:237:4: otherlv_16= 'MappingRules' otherlv_17= '{' ( (lv_Rules_18_0= ruleMappingRule ) ) (otherlv_19= ';' ( (lv_Rules_20_0= ruleMappingRule ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_16, grammarAccess.getMappingModelAccess().getMappingRulesKeyword_13_0());
                    			
                    otherlv_17=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_17, grammarAccess.getMappingModelAccess().getLeftCurlyBracketKeyword_13_1());
                    			
                    // InternalMapping.g:245:4: ( (lv_Rules_18_0= ruleMappingRule ) )
                    // InternalMapping.g:246:5: (lv_Rules_18_0= ruleMappingRule )
                    {
                    // InternalMapping.g:246:5: (lv_Rules_18_0= ruleMappingRule )
                    // InternalMapping.g:247:6: lv_Rules_18_0= ruleMappingRule
                    {

                    						newCompositeNode(grammarAccess.getMappingModelAccess().getRulesMappingRuleParserRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_Rules_18_0=ruleMappingRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingModelRule());
                    						}
                    						add(
                    							current,
                    							"Rules",
                    							lv_Rules_18_0,
                    							"org.xtext.example.mapping.Mapping.MappingRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMapping.g:264:4: (otherlv_19= ';' ( (lv_Rules_20_0= ruleMappingRule ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==19) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMapping.g:265:5: otherlv_19= ';' ( (lv_Rules_20_0= ruleMappingRule ) )
                    	    {
                    	    otherlv_19=(Token)match(input,19,FOLLOW_12); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getMappingModelAccess().getSemicolonKeyword_13_3_0());
                    	    				
                    	    // InternalMapping.g:269:5: ( (lv_Rules_20_0= ruleMappingRule ) )
                    	    // InternalMapping.g:270:6: (lv_Rules_20_0= ruleMappingRule )
                    	    {
                    	    // InternalMapping.g:270:6: (lv_Rules_20_0= ruleMappingRule )
                    	    // InternalMapping.g:271:7: lv_Rules_20_0= ruleMappingRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getMappingModelAccess().getRulesMappingRuleParserRuleCall_13_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_Rules_20_0=ruleMappingRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMappingModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"Rules",
                    	    								lv_Rules_20_0,
                    	    								"org.xtext.example.mapping.Mapping.MappingRule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_21, grammarAccess.getMappingModelAccess().getRightCurlyBracketKeyword_13_4());
                    			

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
    // $ANTLR end "ruleMappingModel"


    // $ANTLR start "entryRuleSourceMetamodel"
    // InternalMapping.g:298:1: entryRuleSourceMetamodel returns [EObject current=null] : iv_ruleSourceMetamodel= ruleSourceMetamodel EOF ;
    public final EObject entryRuleSourceMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceMetamodel = null;


        try {
            // InternalMapping.g:298:56: (iv_ruleSourceMetamodel= ruleSourceMetamodel EOF )
            // InternalMapping.g:299:2: iv_ruleSourceMetamodel= ruleSourceMetamodel EOF
            {
             newCompositeNode(grammarAccess.getSourceMetamodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSourceMetamodel=ruleSourceMetamodel();

            state._fsp--;

             current =iv_ruleSourceMetamodel; 
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
    // $ANTLR end "entryRuleSourceMetamodel"


    // $ANTLR start "ruleSourceMetamodel"
    // InternalMapping.g:305:1: ruleSourceMetamodel returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) )? ( ( ruleEString ) ) ) ;
    public final EObject ruleSourceMetamodel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMapping.g:311:2: ( ( () ( (lv_name_1_0= RULE_STRING ) )? ( ( ruleEString ) ) ) )
            // InternalMapping.g:312:2: ( () ( (lv_name_1_0= RULE_STRING ) )? ( ( ruleEString ) ) )
            {
            // InternalMapping.g:312:2: ( () ( (lv_name_1_0= RULE_STRING ) )? ( ( ruleEString ) ) )
            // InternalMapping.g:313:3: () ( (lv_name_1_0= RULE_STRING ) )? ( ( ruleEString ) )
            {
            // InternalMapping.g:313:3: ()
            // InternalMapping.g:314:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSourceMetamodelAccess().getSourceMetamodelAction_0(),
            					current);
            			

            }

            // InternalMapping.g:320:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=RULE_STRING && LA6_1<=RULE_ID)) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalMapping.g:321:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalMapping.g:321:4: (lv_name_1_0= RULE_STRING )
                    // InternalMapping.g:322:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getSourceMetamodelAccess().getNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSourceMetamodelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.xtext.example.mapping.Mapping.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalMapping.g:338:3: ( ( ruleEString ) )
            // InternalMapping.g:339:4: ( ruleEString )
            {
            // InternalMapping.g:339:4: ( ruleEString )
            // InternalMapping.g:340:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSourceMetamodelRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSourceMetamodelAccess().getModelEPackageCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleSourceMetamodel"


    // $ANTLR start "entryRuleTargetMetamodel"
    // InternalMapping.g:358:1: entryRuleTargetMetamodel returns [EObject current=null] : iv_ruleTargetMetamodel= ruleTargetMetamodel EOF ;
    public final EObject entryRuleTargetMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTargetMetamodel = null;


        try {
            // InternalMapping.g:358:56: (iv_ruleTargetMetamodel= ruleTargetMetamodel EOF )
            // InternalMapping.g:359:2: iv_ruleTargetMetamodel= ruleTargetMetamodel EOF
            {
             newCompositeNode(grammarAccess.getTargetMetamodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargetMetamodel=ruleTargetMetamodel();

            state._fsp--;

             current =iv_ruleTargetMetamodel; 
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
    // $ANTLR end "entryRuleTargetMetamodel"


    // $ANTLR start "ruleTargetMetamodel"
    // InternalMapping.g:365:1: ruleTargetMetamodel returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_STRING ) )? ( ( ruleEString ) ) ) ;
    public final EObject ruleTargetMetamodel() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMapping.g:371:2: ( ( () ( (lv_name_1_0= RULE_STRING ) )? ( ( ruleEString ) ) ) )
            // InternalMapping.g:372:2: ( () ( (lv_name_1_0= RULE_STRING ) )? ( ( ruleEString ) ) )
            {
            // InternalMapping.g:372:2: ( () ( (lv_name_1_0= RULE_STRING ) )? ( ( ruleEString ) ) )
            // InternalMapping.g:373:3: () ( (lv_name_1_0= RULE_STRING ) )? ( ( ruleEString ) )
            {
            // InternalMapping.g:373:3: ()
            // InternalMapping.g:374:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTargetMetamodelAccess().getTargetMetamodelAction_0(),
            					current);
            			

            }

            // InternalMapping.g:380:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                int LA7_1 = input.LA(2);

                if ( ((LA7_1>=RULE_STRING && LA7_1<=RULE_ID)) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalMapping.g:381:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalMapping.g:381:4: (lv_name_1_0= RULE_STRING )
                    // InternalMapping.g:382:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getTargetMetamodelAccess().getNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTargetMetamodelRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.xtext.example.mapping.Mapping.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalMapping.g:398:3: ( ( ruleEString ) )
            // InternalMapping.g:399:4: ( ruleEString )
            {
            // InternalMapping.g:399:4: ( ruleEString )
            // InternalMapping.g:400:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTargetMetamodelRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTargetMetamodelAccess().getModelEPackageCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleTargetMetamodel"


    // $ANTLR start "entryRuleMappingRule"
    // InternalMapping.g:418:1: entryRuleMappingRule returns [EObject current=null] : iv_ruleMappingRule= ruleMappingRule EOF ;
    public final EObject entryRuleMappingRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingRule = null;


        try {
            // InternalMapping.g:418:52: (iv_ruleMappingRule= ruleMappingRule EOF )
            // InternalMapping.g:419:2: iv_ruleMappingRule= ruleMappingRule EOF
            {
             newCompositeNode(grammarAccess.getMappingRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappingRule=ruleMappingRule();

            state._fsp--;

             current =iv_ruleMappingRule; 
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
    // $ANTLR end "entryRuleMappingRule"


    // $ANTLR start "ruleMappingRule"
    // InternalMapping.g:425:1: ruleMappingRule returns [EObject current=null] : ( () (otherlv_1= 'MappingRule' )? ( (lv_name_2_0= RULE_STRING ) )? ( (lv_var_3_0= ruleVariableDeclaration ) )? (otherlv_4= 'identifier' ( (lv_identifier_5_0= RULE_STRING ) ) )? ( ( (otherlv_6= 'source' ( ( ruleQualifiedName ) ) ) | ( (otherlv_8= RULE_ID ) ) ) (otherlv_9= '::' ( (otherlv_10= RULE_ID ) ) )? )? (otherlv_11= 'target' ( ( ruleQualifiedName ) ) )? (otherlv_13= 'operator' ( (lv_operator_14_0= ruleOperator ) ) )? (otherlv_15= 'condition' ( (lv_condition_16_0= RULE_STRING ) ) )? (otherlv_17= 'comment' ( (lv_comment_18_0= ruleEString ) ) )? (otherlv_19= '{' ( (lv_ChildRules_20_0= ruleMappingRule ) ) (otherlv_21= ';' ( (lv_ChildRules_22_0= ruleMappingRule ) ) )* otherlv_23= '}' )? (otherlv_24= '{' ( (lv_ChildHelpers_25_0= ruleHelperStatement ) ) (otherlv_26= ';' ( (lv_ChildHelpers_27_0= ruleHelperStatement ) ) )* otherlv_28= '}' )? ) ;
    public final EObject ruleMappingRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token lv_identifier_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token lv_condition_16_0=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        EObject lv_var_3_0 = null;

        Enumerator lv_operator_14_0 = null;

        AntlrDatatypeRuleToken lv_comment_18_0 = null;

        EObject lv_ChildRules_20_0 = null;

        EObject lv_ChildRules_22_0 = null;

        EObject lv_ChildHelpers_25_0 = null;

        EObject lv_ChildHelpers_27_0 = null;



        	enterRule();

        try {
            // InternalMapping.g:431:2: ( ( () (otherlv_1= 'MappingRule' )? ( (lv_name_2_0= RULE_STRING ) )? ( (lv_var_3_0= ruleVariableDeclaration ) )? (otherlv_4= 'identifier' ( (lv_identifier_5_0= RULE_STRING ) ) )? ( ( (otherlv_6= 'source' ( ( ruleQualifiedName ) ) ) | ( (otherlv_8= RULE_ID ) ) ) (otherlv_9= '::' ( (otherlv_10= RULE_ID ) ) )? )? (otherlv_11= 'target' ( ( ruleQualifiedName ) ) )? (otherlv_13= 'operator' ( (lv_operator_14_0= ruleOperator ) ) )? (otherlv_15= 'condition' ( (lv_condition_16_0= RULE_STRING ) ) )? (otherlv_17= 'comment' ( (lv_comment_18_0= ruleEString ) ) )? (otherlv_19= '{' ( (lv_ChildRules_20_0= ruleMappingRule ) ) (otherlv_21= ';' ( (lv_ChildRules_22_0= ruleMappingRule ) ) )* otherlv_23= '}' )? (otherlv_24= '{' ( (lv_ChildHelpers_25_0= ruleHelperStatement ) ) (otherlv_26= ';' ( (lv_ChildHelpers_27_0= ruleHelperStatement ) ) )* otherlv_28= '}' )? ) )
            // InternalMapping.g:432:2: ( () (otherlv_1= 'MappingRule' )? ( (lv_name_2_0= RULE_STRING ) )? ( (lv_var_3_0= ruleVariableDeclaration ) )? (otherlv_4= 'identifier' ( (lv_identifier_5_0= RULE_STRING ) ) )? ( ( (otherlv_6= 'source' ( ( ruleQualifiedName ) ) ) | ( (otherlv_8= RULE_ID ) ) ) (otherlv_9= '::' ( (otherlv_10= RULE_ID ) ) )? )? (otherlv_11= 'target' ( ( ruleQualifiedName ) ) )? (otherlv_13= 'operator' ( (lv_operator_14_0= ruleOperator ) ) )? (otherlv_15= 'condition' ( (lv_condition_16_0= RULE_STRING ) ) )? (otherlv_17= 'comment' ( (lv_comment_18_0= ruleEString ) ) )? (otherlv_19= '{' ( (lv_ChildRules_20_0= ruleMappingRule ) ) (otherlv_21= ';' ( (lv_ChildRules_22_0= ruleMappingRule ) ) )* otherlv_23= '}' )? (otherlv_24= '{' ( (lv_ChildHelpers_25_0= ruleHelperStatement ) ) (otherlv_26= ';' ( (lv_ChildHelpers_27_0= ruleHelperStatement ) ) )* otherlv_28= '}' )? )
            {
            // InternalMapping.g:432:2: ( () (otherlv_1= 'MappingRule' )? ( (lv_name_2_0= RULE_STRING ) )? ( (lv_var_3_0= ruleVariableDeclaration ) )? (otherlv_4= 'identifier' ( (lv_identifier_5_0= RULE_STRING ) ) )? ( ( (otherlv_6= 'source' ( ( ruleQualifiedName ) ) ) | ( (otherlv_8= RULE_ID ) ) ) (otherlv_9= '::' ( (otherlv_10= RULE_ID ) ) )? )? (otherlv_11= 'target' ( ( ruleQualifiedName ) ) )? (otherlv_13= 'operator' ( (lv_operator_14_0= ruleOperator ) ) )? (otherlv_15= 'condition' ( (lv_condition_16_0= RULE_STRING ) ) )? (otherlv_17= 'comment' ( (lv_comment_18_0= ruleEString ) ) )? (otherlv_19= '{' ( (lv_ChildRules_20_0= ruleMappingRule ) ) (otherlv_21= ';' ( (lv_ChildRules_22_0= ruleMappingRule ) ) )* otherlv_23= '}' )? (otherlv_24= '{' ( (lv_ChildHelpers_25_0= ruleHelperStatement ) ) (otherlv_26= ';' ( (lv_ChildHelpers_27_0= ruleHelperStatement ) ) )* otherlv_28= '}' )? )
            // InternalMapping.g:433:3: () (otherlv_1= 'MappingRule' )? ( (lv_name_2_0= RULE_STRING ) )? ( (lv_var_3_0= ruleVariableDeclaration ) )? (otherlv_4= 'identifier' ( (lv_identifier_5_0= RULE_STRING ) ) )? ( ( (otherlv_6= 'source' ( ( ruleQualifiedName ) ) ) | ( (otherlv_8= RULE_ID ) ) ) (otherlv_9= '::' ( (otherlv_10= RULE_ID ) ) )? )? (otherlv_11= 'target' ( ( ruleQualifiedName ) ) )? (otherlv_13= 'operator' ( (lv_operator_14_0= ruleOperator ) ) )? (otherlv_15= 'condition' ( (lv_condition_16_0= RULE_STRING ) ) )? (otherlv_17= 'comment' ( (lv_comment_18_0= ruleEString ) ) )? (otherlv_19= '{' ( (lv_ChildRules_20_0= ruleMappingRule ) ) (otherlv_21= ';' ( (lv_ChildRules_22_0= ruleMappingRule ) ) )* otherlv_23= '}' )? (otherlv_24= '{' ( (lv_ChildHelpers_25_0= ruleHelperStatement ) ) (otherlv_26= ';' ( (lv_ChildHelpers_27_0= ruleHelperStatement ) ) )* otherlv_28= '}' )?
            {
            // InternalMapping.g:433:3: ()
            // InternalMapping.g:434:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMappingRuleAccess().getMappingRuleAction_0(),
            					current);
            			

            }

            // InternalMapping.g:440:3: (otherlv_1= 'MappingRule' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMapping.g:441:4: otherlv_1= 'MappingRule'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getMappingRuleAccess().getMappingRuleKeyword_1());
                    			

                    }
                    break;

            }

            // InternalMapping.g:446:3: ( (lv_name_2_0= RULE_STRING ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMapping.g:447:4: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalMapping.g:447:4: (lv_name_2_0= RULE_STRING )
                    // InternalMapping.g:448:5: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getMappingRuleAccess().getNameSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMappingRuleRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.xtext.example.mapping.Mapping.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalMapping.g:464:3: ( (lv_var_3_0= ruleVariableDeclaration ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMapping.g:465:4: (lv_var_3_0= ruleVariableDeclaration )
                    {
                    // InternalMapping.g:465:4: (lv_var_3_0= ruleVariableDeclaration )
                    // InternalMapping.g:466:5: lv_var_3_0= ruleVariableDeclaration
                    {

                    					newCompositeNode(grammarAccess.getMappingRuleAccess().getVarVariableDeclarationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_var_3_0=ruleVariableDeclaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMappingRuleRule());
                    					}
                    					set(
                    						current,
                    						"var",
                    						lv_var_3_0,
                    						"org.xtext.example.mapping.Mapping.VariableDeclaration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMapping.g:483:3: (otherlv_4= 'identifier' ( (lv_identifier_5_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMapping.g:484:4: otherlv_4= 'identifier' ( (lv_identifier_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMappingRuleAccess().getIdentifierKeyword_4_0());
                    			
                    // InternalMapping.g:488:4: ( (lv_identifier_5_0= RULE_STRING ) )
                    // InternalMapping.g:489:5: (lv_identifier_5_0= RULE_STRING )
                    {
                    // InternalMapping.g:489:5: (lv_identifier_5_0= RULE_STRING )
                    // InternalMapping.g:490:6: lv_identifier_5_0= RULE_STRING
                    {
                    lv_identifier_5_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_identifier_5_0, grammarAccess.getMappingRuleAccess().getIdentifierSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMappingRuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"identifier",
                    							lv_identifier_5_0,
                    							"org.xtext.example.mapping.Mapping.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMapping.g:507:3: ( ( (otherlv_6= 'source' ( ( ruleQualifiedName ) ) ) | ( (otherlv_8= RULE_ID ) ) ) (otherlv_9= '::' ( (otherlv_10= RULE_ID ) ) )? )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMapping.g:508:4: ( (otherlv_6= 'source' ( ( ruleQualifiedName ) ) ) | ( (otherlv_8= RULE_ID ) ) ) (otherlv_9= '::' ( (otherlv_10= RULE_ID ) ) )?
                    {
                    // InternalMapping.g:508:4: ( (otherlv_6= 'source' ( ( ruleQualifiedName ) ) ) | ( (otherlv_8= RULE_ID ) ) )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==22) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==RULE_ID) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMapping.g:509:5: (otherlv_6= 'source' ( ( ruleQualifiedName ) ) )
                            {
                            // InternalMapping.g:509:5: (otherlv_6= 'source' ( ( ruleQualifiedName ) ) )
                            // InternalMapping.g:510:6: otherlv_6= 'source' ( ( ruleQualifiedName ) )
                            {
                            otherlv_6=(Token)match(input,22,FOLLOW_9); 

                            						newLeafNode(otherlv_6, grammarAccess.getMappingRuleAccess().getSourceKeyword_5_0_0_0());
                            					
                            // InternalMapping.g:514:6: ( ( ruleQualifiedName ) )
                            // InternalMapping.g:515:7: ( ruleQualifiedName )
                            {
                            // InternalMapping.g:515:7: ( ruleQualifiedName )
                            // InternalMapping.g:516:8: ruleQualifiedName
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getMappingRuleRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getMappingRuleAccess().getSourceEObjectCrossReference_5_0_0_1_0());
                            							
                            pushFollow(FOLLOW_18);
                            ruleQualifiedName();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMapping.g:532:5: ( (otherlv_8= RULE_ID ) )
                            {
                            // InternalMapping.g:532:5: ( (otherlv_8= RULE_ID ) )
                            // InternalMapping.g:533:6: (otherlv_8= RULE_ID )
                            {
                            // InternalMapping.g:533:6: (otherlv_8= RULE_ID )
                            // InternalMapping.g:534:7: otherlv_8= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMappingRuleRule());
                            							}
                            						
                            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_18); 

                            							newLeafNode(otherlv_8, grammarAccess.getMappingRuleAccess().getVariableVariableDeclarationCrossReference_5_0_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalMapping.g:546:4: (otherlv_9= '::' ( (otherlv_10= RULE_ID ) ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==23) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMapping.g:547:5: otherlv_9= '::' ( (otherlv_10= RULE_ID ) )
                            {
                            otherlv_9=(Token)match(input,23,FOLLOW_19); 

                            					newLeafNode(otherlv_9, grammarAccess.getMappingRuleAccess().getColonColonKeyword_5_1_0());
                            				
                            // InternalMapping.g:551:5: ( (otherlv_10= RULE_ID ) )
                            // InternalMapping.g:552:6: (otherlv_10= RULE_ID )
                            {
                            // InternalMapping.g:552:6: (otherlv_10= RULE_ID )
                            // InternalMapping.g:553:7: otherlv_10= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getMappingRuleRule());
                            							}
                            						
                            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_20); 

                            							newLeafNode(otherlv_10, grammarAccess.getMappingRuleAccess().getEEnumLiteralEEnumLiteralCrossReference_5_1_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalMapping.g:566:3: (otherlv_11= 'target' ( ( ruleQualifiedName ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMapping.g:567:4: otherlv_11= 'target' ( ( ruleQualifiedName ) )
                    {
                    otherlv_11=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getMappingRuleAccess().getTargetKeyword_6_0());
                    			
                    // InternalMapping.g:571:4: ( ( ruleQualifiedName ) )
                    // InternalMapping.g:572:5: ( ruleQualifiedName )
                    {
                    // InternalMapping.g:572:5: ( ruleQualifiedName )
                    // InternalMapping.g:573:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMappingRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMappingRuleAccess().getTargetEObjectCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMapping.g:588:3: (otherlv_13= 'operator' ( (lv_operator_14_0= ruleOperator ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMapping.g:589:4: otherlv_13= 'operator' ( (lv_operator_14_0= ruleOperator ) )
                    {
                    otherlv_13=(Token)match(input,25,FOLLOW_22); 

                    				newLeafNode(otherlv_13, grammarAccess.getMappingRuleAccess().getOperatorKeyword_7_0());
                    			
                    // InternalMapping.g:593:4: ( (lv_operator_14_0= ruleOperator ) )
                    // InternalMapping.g:594:5: (lv_operator_14_0= ruleOperator )
                    {
                    // InternalMapping.g:594:5: (lv_operator_14_0= ruleOperator )
                    // InternalMapping.g:595:6: lv_operator_14_0= ruleOperator
                    {

                    						newCompositeNode(grammarAccess.getMappingRuleAccess().getOperatorOperatorEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_operator_14_0=ruleOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingRuleRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_14_0,
                    							"org.xtext.example.mapping.Mapping.Operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMapping.g:613:3: (otherlv_15= 'condition' ( (lv_condition_16_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMapping.g:614:4: otherlv_15= 'condition' ( (lv_condition_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getMappingRuleAccess().getConditionKeyword_8_0());
                    			
                    // InternalMapping.g:618:4: ( (lv_condition_16_0= RULE_STRING ) )
                    // InternalMapping.g:619:5: (lv_condition_16_0= RULE_STRING )
                    {
                    // InternalMapping.g:619:5: (lv_condition_16_0= RULE_STRING )
                    // InternalMapping.g:620:6: lv_condition_16_0= RULE_STRING
                    {
                    lv_condition_16_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    						newLeafNode(lv_condition_16_0, grammarAccess.getMappingRuleAccess().getConditionSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMappingRuleRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"condition",
                    							lv_condition_16_0,
                    							"org.xtext.example.mapping.Mapping.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMapping.g:637:3: (otherlv_17= 'comment' ( (lv_comment_18_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMapping.g:638:4: otherlv_17= 'comment' ( (lv_comment_18_0= ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_17, grammarAccess.getMappingRuleAccess().getCommentKeyword_9_0());
                    			
                    // InternalMapping.g:642:4: ( (lv_comment_18_0= ruleEString ) )
                    // InternalMapping.g:643:5: (lv_comment_18_0= ruleEString )
                    {
                    // InternalMapping.g:643:5: (lv_comment_18_0= ruleEString )
                    // InternalMapping.g:644:6: lv_comment_18_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMappingRuleAccess().getCommentEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_comment_18_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingRuleRule());
                    						}
                    						set(
                    							current,
                    							"comment",
                    							lv_comment_18_0,
                    							"org.xtext.example.mapping.Mapping.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMapping.g:662:3: (otherlv_19= '{' ( (lv_ChildRules_20_0= ruleMappingRule ) ) (otherlv_21= ';' ( (lv_ChildRules_22_0= ruleMappingRule ) ) )* otherlv_23= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==13) ) {
                int LA20_1 = input.LA(2);

                if ( ((LA20_1>=RULE_STRING && LA20_1<=RULE_ID)||LA20_1==13||LA20_1==15||(LA20_1>=19 && LA20_1<=22)||(LA20_1>=24 && LA20_1<=27)||LA20_1==31) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalMapping.g:663:4: otherlv_19= '{' ( (lv_ChildRules_20_0= ruleMappingRule ) ) (otherlv_21= ';' ( (lv_ChildRules_22_0= ruleMappingRule ) ) )* otherlv_23= '}'
                    {
                    otherlv_19=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_19, grammarAccess.getMappingRuleAccess().getLeftCurlyBracketKeyword_10_0());
                    			
                    // InternalMapping.g:667:4: ( (lv_ChildRules_20_0= ruleMappingRule ) )
                    // InternalMapping.g:668:5: (lv_ChildRules_20_0= ruleMappingRule )
                    {
                    // InternalMapping.g:668:5: (lv_ChildRules_20_0= ruleMappingRule )
                    // InternalMapping.g:669:6: lv_ChildRules_20_0= ruleMappingRule
                    {

                    						newCompositeNode(grammarAccess.getMappingRuleAccess().getChildRulesMappingRuleParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_ChildRules_20_0=ruleMappingRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingRuleRule());
                    						}
                    						add(
                    							current,
                    							"ChildRules",
                    							lv_ChildRules_20_0,
                    							"org.xtext.example.mapping.Mapping.MappingRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMapping.g:686:4: (otherlv_21= ';' ( (lv_ChildRules_22_0= ruleMappingRule ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==19) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalMapping.g:687:5: otherlv_21= ';' ( (lv_ChildRules_22_0= ruleMappingRule ) )
                    	    {
                    	    otherlv_21=(Token)match(input,19,FOLLOW_12); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getMappingRuleAccess().getSemicolonKeyword_10_2_0());
                    	    				
                    	    // InternalMapping.g:691:5: ( (lv_ChildRules_22_0= ruleMappingRule ) )
                    	    // InternalMapping.g:692:6: (lv_ChildRules_22_0= ruleMappingRule )
                    	    {
                    	    // InternalMapping.g:692:6: (lv_ChildRules_22_0= ruleMappingRule )
                    	    // InternalMapping.g:693:7: lv_ChildRules_22_0= ruleMappingRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getMappingRuleAccess().getChildRulesMappingRuleParserRuleCall_10_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_ChildRules_22_0=ruleMappingRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMappingRuleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ChildRules",
                    	    								lv_ChildRules_22_0,
                    	    								"org.xtext.example.mapping.Mapping.MappingRule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,15,FOLLOW_25); 

                    				newLeafNode(otherlv_23, grammarAccess.getMappingRuleAccess().getRightCurlyBracketKeyword_10_3());
                    			

                    }
                    break;

            }

            // InternalMapping.g:716:3: (otherlv_24= '{' ( (lv_ChildHelpers_25_0= ruleHelperStatement ) ) (otherlv_26= ';' ( (lv_ChildHelpers_27_0= ruleHelperStatement ) ) )* otherlv_28= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==13) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMapping.g:717:4: otherlv_24= '{' ( (lv_ChildHelpers_25_0= ruleHelperStatement ) ) (otherlv_26= ';' ( (lv_ChildHelpers_27_0= ruleHelperStatement ) ) )* otherlv_28= '}'
                    {
                    otherlv_24=(Token)match(input,13,FOLLOW_26); 

                    				newLeafNode(otherlv_24, grammarAccess.getMappingRuleAccess().getLeftCurlyBracketKeyword_11_0());
                    			
                    // InternalMapping.g:721:4: ( (lv_ChildHelpers_25_0= ruleHelperStatement ) )
                    // InternalMapping.g:722:5: (lv_ChildHelpers_25_0= ruleHelperStatement )
                    {
                    // InternalMapping.g:722:5: (lv_ChildHelpers_25_0= ruleHelperStatement )
                    // InternalMapping.g:723:6: lv_ChildHelpers_25_0= ruleHelperStatement
                    {

                    						newCompositeNode(grammarAccess.getMappingRuleAccess().getChildHelpersHelperStatementParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_ChildHelpers_25_0=ruleHelperStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappingRuleRule());
                    						}
                    						add(
                    							current,
                    							"ChildHelpers",
                    							lv_ChildHelpers_25_0,
                    							"org.xtext.example.mapping.Mapping.HelperStatement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMapping.g:740:4: (otherlv_26= ';' ( (lv_ChildHelpers_27_0= ruleHelperStatement ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==19) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalMapping.g:741:5: otherlv_26= ';' ( (lv_ChildHelpers_27_0= ruleHelperStatement ) )
                    	    {
                    	    otherlv_26=(Token)match(input,19,FOLLOW_26); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getMappingRuleAccess().getSemicolonKeyword_11_2_0());
                    	    				
                    	    // InternalMapping.g:745:5: ( (lv_ChildHelpers_27_0= ruleHelperStatement ) )
                    	    // InternalMapping.g:746:6: (lv_ChildHelpers_27_0= ruleHelperStatement )
                    	    {
                    	    // InternalMapping.g:746:6: (lv_ChildHelpers_27_0= ruleHelperStatement )
                    	    // InternalMapping.g:747:7: lv_ChildHelpers_27_0= ruleHelperStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getMappingRuleAccess().getChildHelpersHelperStatementParserRuleCall_11_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_ChildHelpers_27_0=ruleHelperStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMappingRuleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ChildHelpers",
                    	    								lv_ChildHelpers_27_0,
                    	    								"org.xtext.example.mapping.Mapping.HelperStatement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_28, grammarAccess.getMappingRuleAccess().getRightCurlyBracketKeyword_11_3());
                    			

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
    // $ANTLR end "ruleMappingRule"


    // $ANTLR start "entryRuleHelperStatement"
    // InternalMapping.g:774:1: entryRuleHelperStatement returns [EObject current=null] : iv_ruleHelperStatement= ruleHelperStatement EOF ;
    public final EObject entryRuleHelperStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHelperStatement = null;


        try {
            // InternalMapping.g:774:56: (iv_ruleHelperStatement= ruleHelperStatement EOF )
            // InternalMapping.g:775:2: iv_ruleHelperStatement= ruleHelperStatement EOF
            {
             newCompositeNode(grammarAccess.getHelperStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHelperStatement=ruleHelperStatement();

            state._fsp--;

             current =iv_ruleHelperStatement; 
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
    // $ANTLR end "entryRuleHelperStatement"


    // $ANTLR start "ruleHelperStatement"
    // InternalMapping.g:781:1: ruleHelperStatement returns [EObject current=null] : ( () (otherlv_1= 'HelperStatement' )? (otherlv_2= 'statement' ( (lv_statement_3_0= RULE_STRING ) ) ) (otherlv_4= '{' ( (lv_ChildRules_5_0= ruleMappingRule ) ) (otherlv_6= ',' ( (lv_ChildRules_7_0= ruleMappingRule ) ) )* otherlv_8= '}' )? (otherlv_9= '{' ( (lv_ChildHelpers_10_0= ruleHelperStatement ) ) (otherlv_11= ',' ( (lv_ChildHelpers_12_0= ruleHelperStatement ) ) )* otherlv_13= '}' )? ) ;
    public final EObject ruleHelperStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_statement_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_ChildRules_5_0 = null;

        EObject lv_ChildRules_7_0 = null;

        EObject lv_ChildHelpers_10_0 = null;

        EObject lv_ChildHelpers_12_0 = null;



        	enterRule();

        try {
            // InternalMapping.g:787:2: ( ( () (otherlv_1= 'HelperStatement' )? (otherlv_2= 'statement' ( (lv_statement_3_0= RULE_STRING ) ) ) (otherlv_4= '{' ( (lv_ChildRules_5_0= ruleMappingRule ) ) (otherlv_6= ',' ( (lv_ChildRules_7_0= ruleMappingRule ) ) )* otherlv_8= '}' )? (otherlv_9= '{' ( (lv_ChildHelpers_10_0= ruleHelperStatement ) ) (otherlv_11= ',' ( (lv_ChildHelpers_12_0= ruleHelperStatement ) ) )* otherlv_13= '}' )? ) )
            // InternalMapping.g:788:2: ( () (otherlv_1= 'HelperStatement' )? (otherlv_2= 'statement' ( (lv_statement_3_0= RULE_STRING ) ) ) (otherlv_4= '{' ( (lv_ChildRules_5_0= ruleMappingRule ) ) (otherlv_6= ',' ( (lv_ChildRules_7_0= ruleMappingRule ) ) )* otherlv_8= '}' )? (otherlv_9= '{' ( (lv_ChildHelpers_10_0= ruleHelperStatement ) ) (otherlv_11= ',' ( (lv_ChildHelpers_12_0= ruleHelperStatement ) ) )* otherlv_13= '}' )? )
            {
            // InternalMapping.g:788:2: ( () (otherlv_1= 'HelperStatement' )? (otherlv_2= 'statement' ( (lv_statement_3_0= RULE_STRING ) ) ) (otherlv_4= '{' ( (lv_ChildRules_5_0= ruleMappingRule ) ) (otherlv_6= ',' ( (lv_ChildRules_7_0= ruleMappingRule ) ) )* otherlv_8= '}' )? (otherlv_9= '{' ( (lv_ChildHelpers_10_0= ruleHelperStatement ) ) (otherlv_11= ',' ( (lv_ChildHelpers_12_0= ruleHelperStatement ) ) )* otherlv_13= '}' )? )
            // InternalMapping.g:789:3: () (otherlv_1= 'HelperStatement' )? (otherlv_2= 'statement' ( (lv_statement_3_0= RULE_STRING ) ) ) (otherlv_4= '{' ( (lv_ChildRules_5_0= ruleMappingRule ) ) (otherlv_6= ',' ( (lv_ChildRules_7_0= ruleMappingRule ) ) )* otherlv_8= '}' )? (otherlv_9= '{' ( (lv_ChildHelpers_10_0= ruleHelperStatement ) ) (otherlv_11= ',' ( (lv_ChildHelpers_12_0= ruleHelperStatement ) ) )* otherlv_13= '}' )?
            {
            // InternalMapping.g:789:3: ()
            // InternalMapping.g:790:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHelperStatementAccess().getHelperStatementAction_0(),
            					current);
            			

            }

            // InternalMapping.g:796:3: (otherlv_1= 'HelperStatement' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMapping.g:797:4: otherlv_1= 'HelperStatement'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_27); 

                    				newLeafNode(otherlv_1, grammarAccess.getHelperStatementAccess().getHelperStatementKeyword_1());
                    			

                    }
                    break;

            }

            // InternalMapping.g:802:3: (otherlv_2= 'statement' ( (lv_statement_3_0= RULE_STRING ) ) )
            // InternalMapping.g:803:4: otherlv_2= 'statement' ( (lv_statement_3_0= RULE_STRING ) )
            {
            otherlv_2=(Token)match(input,29,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getHelperStatementAccess().getStatementKeyword_2_0());
            			
            // InternalMapping.g:807:4: ( (lv_statement_3_0= RULE_STRING ) )
            // InternalMapping.g:808:5: (lv_statement_3_0= RULE_STRING )
            {
            // InternalMapping.g:808:5: (lv_statement_3_0= RULE_STRING )
            // InternalMapping.g:809:6: lv_statement_3_0= RULE_STRING
            {
            lv_statement_3_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            						newLeafNode(lv_statement_3_0, grammarAccess.getHelperStatementAccess().getStatementSTRINGTerminalRuleCall_2_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getHelperStatementRule());
            						}
            						setWithLastConsumed(
            							current,
            							"statement",
            							lv_statement_3_0,
            							"org.xtext.example.mapping.Mapping.STRING");
            					

            }


            }


            }

            // InternalMapping.g:826:3: (otherlv_4= '{' ( (lv_ChildRules_5_0= ruleMappingRule ) ) (otherlv_6= ',' ( (lv_ChildRules_7_0= ruleMappingRule ) ) )* otherlv_8= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==13) ) {
                int LA25_1 = input.LA(2);

                if ( ((LA25_1>=RULE_STRING && LA25_1<=RULE_ID)||(LA25_1>=13 && LA25_1<=15)||(LA25_1>=20 && LA25_1<=22)||(LA25_1>=24 && LA25_1<=27)||LA25_1==31) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalMapping.g:827:4: otherlv_4= '{' ( (lv_ChildRules_5_0= ruleMappingRule ) ) (otherlv_6= ',' ( (lv_ChildRules_7_0= ruleMappingRule ) ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getHelperStatementAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalMapping.g:831:4: ( (lv_ChildRules_5_0= ruleMappingRule ) )
                    // InternalMapping.g:832:5: (lv_ChildRules_5_0= ruleMappingRule )
                    {
                    // InternalMapping.g:832:5: (lv_ChildRules_5_0= ruleMappingRule )
                    // InternalMapping.g:833:6: lv_ChildRules_5_0= ruleMappingRule
                    {

                    						newCompositeNode(grammarAccess.getHelperStatementAccess().getChildRulesMappingRuleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_ChildRules_5_0=ruleMappingRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHelperStatementRule());
                    						}
                    						add(
                    							current,
                    							"ChildRules",
                    							lv_ChildRules_5_0,
                    							"org.xtext.example.mapping.Mapping.MappingRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMapping.g:850:4: (otherlv_6= ',' ( (lv_ChildRules_7_0= ruleMappingRule ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==14) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalMapping.g:851:5: otherlv_6= ',' ( (lv_ChildRules_7_0= ruleMappingRule ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_28); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getHelperStatementAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMapping.g:855:5: ( (lv_ChildRules_7_0= ruleMappingRule ) )
                    	    // InternalMapping.g:856:6: (lv_ChildRules_7_0= ruleMappingRule )
                    	    {
                    	    // InternalMapping.g:856:6: (lv_ChildRules_7_0= ruleMappingRule )
                    	    // InternalMapping.g:857:7: lv_ChildRules_7_0= ruleMappingRule
                    	    {

                    	    							newCompositeNode(grammarAccess.getHelperStatementAccess().getChildRulesMappingRuleParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_ChildRules_7_0=ruleMappingRule();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHelperStatementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ChildRules",
                    	    								lv_ChildRules_7_0,
                    	    								"org.xtext.example.mapping.Mapping.MappingRule");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_25); 

                    				newLeafNode(otherlv_8, grammarAccess.getHelperStatementAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalMapping.g:880:3: (otherlv_9= '{' ( (lv_ChildHelpers_10_0= ruleHelperStatement ) ) (otherlv_11= ',' ( (lv_ChildHelpers_12_0= ruleHelperStatement ) ) )* otherlv_13= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==13) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMapping.g:881:4: otherlv_9= '{' ( (lv_ChildHelpers_10_0= ruleHelperStatement ) ) (otherlv_11= ',' ( (lv_ChildHelpers_12_0= ruleHelperStatement ) ) )* otherlv_13= '}'
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_26); 

                    				newLeafNode(otherlv_9, grammarAccess.getHelperStatementAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalMapping.g:885:4: ( (lv_ChildHelpers_10_0= ruleHelperStatement ) )
                    // InternalMapping.g:886:5: (lv_ChildHelpers_10_0= ruleHelperStatement )
                    {
                    // InternalMapping.g:886:5: (lv_ChildHelpers_10_0= ruleHelperStatement )
                    // InternalMapping.g:887:6: lv_ChildHelpers_10_0= ruleHelperStatement
                    {

                    						newCompositeNode(grammarAccess.getHelperStatementAccess().getChildHelpersHelperStatementParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_ChildHelpers_10_0=ruleHelperStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHelperStatementRule());
                    						}
                    						add(
                    							current,
                    							"ChildHelpers",
                    							lv_ChildHelpers_10_0,
                    							"org.xtext.example.mapping.Mapping.HelperStatement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMapping.g:904:4: (otherlv_11= ',' ( (lv_ChildHelpers_12_0= ruleHelperStatement ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==14) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalMapping.g:905:5: otherlv_11= ',' ( (lv_ChildHelpers_12_0= ruleHelperStatement ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FOLLOW_26); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getHelperStatementAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMapping.g:909:5: ( (lv_ChildHelpers_12_0= ruleHelperStatement ) )
                    	    // InternalMapping.g:910:6: (lv_ChildHelpers_12_0= ruleHelperStatement )
                    	    {
                    	    // InternalMapping.g:910:6: (lv_ChildHelpers_12_0= ruleHelperStatement )
                    	    // InternalMapping.g:911:7: lv_ChildHelpers_12_0= ruleHelperStatement
                    	    {

                    	    							newCompositeNode(grammarAccess.getHelperStatementAccess().getChildHelpersHelperStatementParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_ChildHelpers_12_0=ruleHelperStatement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHelperStatementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ChildHelpers",
                    	    								lv_ChildHelpers_12_0,
                    	    								"org.xtext.example.mapping.Mapping.HelperStatement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getHelperStatementAccess().getRightCurlyBracketKeyword_4_3());
                    			

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
    // $ANTLR end "ruleHelperStatement"


    // $ANTLR start "entryRuleEString"
    // InternalMapping.g:938:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMapping.g:938:47: (iv_ruleEString= ruleEString EOF )
            // InternalMapping.g:939:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMapping.g:945:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMapping.g:951:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMapping.g:952:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMapping.g:952:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalMapping.g:953:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMapping.g:961:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMapping.g:972:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMapping.g:972:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMapping.g:973:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMapping.g:979:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;



        	enterRule();

        try {
            // InternalMapping.g:985:2: ( (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* ) )
            // InternalMapping.g:986:2: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            {
            // InternalMapping.g:986:2: (this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )* )
            // InternalMapping.g:987:3: this_ValidID_0= ruleValidID (kw= '.' this_ValidID_2= ruleValidID )*
            {

            			newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_ValidID_0=ruleValidID();

            state._fsp--;


            			current.merge(this_ValidID_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMapping.g:997:3: (kw= '.' this_ValidID_2= ruleValidID )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==30) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMapping.g:998:4: kw= '.' this_ValidID_2= ruleValidID
            	    {
            	    kw=(Token)match(input,30,FOLLOW_9); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_29);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;


            	    				current.merge(this_ValidID_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleValidID"
    // InternalMapping.g:1018:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalMapping.g:1018:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalMapping.g:1019:2: iv_ruleValidID= ruleValidID EOF
            {
             newCompositeNode(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;

             current =iv_ruleValidID.getText(); 
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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalMapping.g:1025:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString | this_KEYWORD_1= ruleKEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EString_0 = null;

        AntlrDatatypeRuleToken this_KEYWORD_1 = null;



        	enterRule();

        try {
            // InternalMapping.g:1031:2: ( (this_EString_0= ruleEString | this_KEYWORD_1= ruleKEYWORD ) )
            // InternalMapping.g:1032:2: (this_EString_0= ruleEString | this_KEYWORD_1= ruleKEYWORD )
            {
            // InternalMapping.g:1032:2: (this_EString_0= ruleEString | this_KEYWORD_1= ruleKEYWORD )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_ID)) ) {
                alt30=1;
            }
            else if ( (LA30_0==22||LA30_0==24) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalMapping.g:1033:3: this_EString_0= ruleEString
                    {

                    			newCompositeNode(grammarAccess.getValidIDAccess().getEStringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EString_0=ruleEString();

                    state._fsp--;


                    			current.merge(this_EString_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMapping.g:1044:3: this_KEYWORD_1= ruleKEYWORD
                    {

                    			newCompositeNode(grammarAccess.getValidIDAccess().getKEYWORDParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_KEYWORD_1=ruleKEYWORD();

                    state._fsp--;


                    			current.merge(this_KEYWORD_1);
                    		

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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalMapping.g:1058:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalMapping.g:1058:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalMapping.g:1059:2: iv_ruleKEYWORD= ruleKEYWORD EOF
            {
             newCompositeNode(grammarAccess.getKEYWORDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKEYWORD=ruleKEYWORD();

            state._fsp--;

             current =iv_ruleKEYWORD.getText(); 
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
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalMapping.g:1065:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'source' | kw= 'target' ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMapping.g:1071:2: ( (kw= 'source' | kw= 'target' ) )
            // InternalMapping.g:1072:2: (kw= 'source' | kw= 'target' )
            {
            // InternalMapping.g:1072:2: (kw= 'source' | kw= 'target' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==22) ) {
                alt31=1;
            }
            else if ( (LA31_0==24) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalMapping.g:1073:3: kw= 'source'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getSourceKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMapping.g:1079:3: kw= 'target'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTargetKeyword_1());
                    		

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
    // $ANTLR end "ruleKEYWORD"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalMapping.g:1088:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalMapping.g:1088:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalMapping.g:1089:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalMapping.g:1095:1: ruleVariableDeclaration returns [EObject current=null] : ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalMapping.g:1101:2: ( ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_STRING ) ) ) )
            // InternalMapping.g:1102:2: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_STRING ) ) )
            {
            // InternalMapping.g:1102:2: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_STRING ) ) )
            // InternalMapping.g:1103:3: () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) ( (lv_value_3_0= RULE_STRING ) )
            {
            // InternalMapping.g:1103:3: ()
            // InternalMapping.g:1104:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableDeclarationAccess().getVariableDeclarationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getVarKeyword_1());
            		
            // InternalMapping.g:1114:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMapping.g:1115:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMapping.g:1115:4: (lv_name_2_0= RULE_ID )
            // InternalMapping.g:1116:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_2_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMapping.g:1132:3: ( (lv_value_3_0= RULE_STRING ) )
            // InternalMapping.g:1133:4: (lv_value_3_0= RULE_STRING )
            {
            // InternalMapping.g:1133:4: (lv_value_3_0= RULE_STRING )
            // InternalMapping.g:1134:5: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getVariableDeclarationAccess().getValueSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.mapping.Mapping.STRING");
            				

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "ruleOperator"
    // InternalMapping.g:1154:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'assign' ) | (enumLiteral_1= 'add' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMapping.g:1160:2: ( ( (enumLiteral_0= 'assign' ) | (enumLiteral_1= 'add' ) ) )
            // InternalMapping.g:1161:2: ( (enumLiteral_0= 'assign' ) | (enumLiteral_1= 'add' ) )
            {
            // InternalMapping.g:1161:2: ( (enumLiteral_0= 'assign' ) | (enumLiteral_1= 'add' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==32) ) {
                alt32=1;
            }
            else if ( (LA32_0==33) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalMapping.g:1162:3: (enumLiteral_0= 'assign' )
                    {
                    // InternalMapping.g:1162:3: (enumLiteral_0= 'assign' )
                    // InternalMapping.g:1163:4: enumLiteral_0= 'assign'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getAssignEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getAssignEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMapping.g:1170:3: (enumLiteral_1= 'add' )
                    {
                    // InternalMapping.g:1170:3: (enumLiteral_1= 'add' )
                    // InternalMapping.g:1171:4: enumLiteral_1= 'add'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001400030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000008F78A030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000008F602032L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000008F602022L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000F602022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000F402022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000F802002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000F002002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000E002002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000C002002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008002002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000008F70E030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000002L});

}