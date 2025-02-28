package org.xtext.example.mapping.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mapping.services.MappingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMappingParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'source'", "'target'", "'assign'", "'add'", "'MappingModel'", "'SourceMetamodels'", "'{'", "'}'", "'TargetMetamodels'", "','", "'MainSourceMetamodel'", "'MappingRules'", "';'", "'MappingRule'", "'identifier'", "'::'", "'operator'", "'condition'", "'comment'", "'HelperStatement'", "'statement'", "'.'", "'var'"
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

    	public void setGrammarAccess(MappingGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMappingModel"
    // InternalMapping.g:53:1: entryRuleMappingModel : ruleMappingModel EOF ;
    public final void entryRuleMappingModel() throws RecognitionException {
        try {
            // InternalMapping.g:54:1: ( ruleMappingModel EOF )
            // InternalMapping.g:55:1: ruleMappingModel EOF
            {
             before(grammarAccess.getMappingModelRule()); 
            pushFollow(FOLLOW_1);
            ruleMappingModel();

            state._fsp--;

             after(grammarAccess.getMappingModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMappingModel"


    // $ANTLR start "ruleMappingModel"
    // InternalMapping.g:62:1: ruleMappingModel : ( ( rule__MappingModel__Group__0 ) ) ;
    public final void ruleMappingModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:66:2: ( ( ( rule__MappingModel__Group__0 ) ) )
            // InternalMapping.g:67:2: ( ( rule__MappingModel__Group__0 ) )
            {
            // InternalMapping.g:67:2: ( ( rule__MappingModel__Group__0 ) )
            // InternalMapping.g:68:3: ( rule__MappingModel__Group__0 )
            {
             before(grammarAccess.getMappingModelAccess().getGroup()); 
            // InternalMapping.g:69:3: ( rule__MappingModel__Group__0 )
            // InternalMapping.g:69:4: rule__MappingModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMappingModel"


    // $ANTLR start "entryRuleSourceMetamodel"
    // InternalMapping.g:78:1: entryRuleSourceMetamodel : ruleSourceMetamodel EOF ;
    public final void entryRuleSourceMetamodel() throws RecognitionException {
        try {
            // InternalMapping.g:79:1: ( ruleSourceMetamodel EOF )
            // InternalMapping.g:80:1: ruleSourceMetamodel EOF
            {
             before(grammarAccess.getSourceMetamodelRule()); 
            pushFollow(FOLLOW_1);
            ruleSourceMetamodel();

            state._fsp--;

             after(grammarAccess.getSourceMetamodelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSourceMetamodel"


    // $ANTLR start "ruleSourceMetamodel"
    // InternalMapping.g:87:1: ruleSourceMetamodel : ( ( rule__SourceMetamodel__Group__0 ) ) ;
    public final void ruleSourceMetamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:91:2: ( ( ( rule__SourceMetamodel__Group__0 ) ) )
            // InternalMapping.g:92:2: ( ( rule__SourceMetamodel__Group__0 ) )
            {
            // InternalMapping.g:92:2: ( ( rule__SourceMetamodel__Group__0 ) )
            // InternalMapping.g:93:3: ( rule__SourceMetamodel__Group__0 )
            {
             before(grammarAccess.getSourceMetamodelAccess().getGroup()); 
            // InternalMapping.g:94:3: ( rule__SourceMetamodel__Group__0 )
            // InternalMapping.g:94:4: rule__SourceMetamodel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SourceMetamodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSourceMetamodelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSourceMetamodel"


    // $ANTLR start "entryRuleTargetMetamodel"
    // InternalMapping.g:103:1: entryRuleTargetMetamodel : ruleTargetMetamodel EOF ;
    public final void entryRuleTargetMetamodel() throws RecognitionException {
        try {
            // InternalMapping.g:104:1: ( ruleTargetMetamodel EOF )
            // InternalMapping.g:105:1: ruleTargetMetamodel EOF
            {
             before(grammarAccess.getTargetMetamodelRule()); 
            pushFollow(FOLLOW_1);
            ruleTargetMetamodel();

            state._fsp--;

             after(grammarAccess.getTargetMetamodelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTargetMetamodel"


    // $ANTLR start "ruleTargetMetamodel"
    // InternalMapping.g:112:1: ruleTargetMetamodel : ( ( rule__TargetMetamodel__Group__0 ) ) ;
    public final void ruleTargetMetamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:116:2: ( ( ( rule__TargetMetamodel__Group__0 ) ) )
            // InternalMapping.g:117:2: ( ( rule__TargetMetamodel__Group__0 ) )
            {
            // InternalMapping.g:117:2: ( ( rule__TargetMetamodel__Group__0 ) )
            // InternalMapping.g:118:3: ( rule__TargetMetamodel__Group__0 )
            {
             before(grammarAccess.getTargetMetamodelAccess().getGroup()); 
            // InternalMapping.g:119:3: ( rule__TargetMetamodel__Group__0 )
            // InternalMapping.g:119:4: rule__TargetMetamodel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TargetMetamodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetMetamodelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTargetMetamodel"


    // $ANTLR start "entryRuleMappingRule"
    // InternalMapping.g:128:1: entryRuleMappingRule : ruleMappingRule EOF ;
    public final void entryRuleMappingRule() throws RecognitionException {
        try {
            // InternalMapping.g:129:1: ( ruleMappingRule EOF )
            // InternalMapping.g:130:1: ruleMappingRule EOF
            {
             before(grammarAccess.getMappingRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleMappingRule();

            state._fsp--;

             after(grammarAccess.getMappingRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMappingRule"


    // $ANTLR start "ruleMappingRule"
    // InternalMapping.g:137:1: ruleMappingRule : ( ( rule__MappingRule__Group__0 ) ) ;
    public final void ruleMappingRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:141:2: ( ( ( rule__MappingRule__Group__0 ) ) )
            // InternalMapping.g:142:2: ( ( rule__MappingRule__Group__0 ) )
            {
            // InternalMapping.g:142:2: ( ( rule__MappingRule__Group__0 ) )
            // InternalMapping.g:143:3: ( rule__MappingRule__Group__0 )
            {
             before(grammarAccess.getMappingRuleAccess().getGroup()); 
            // InternalMapping.g:144:3: ( rule__MappingRule__Group__0 )
            // InternalMapping.g:144:4: rule__MappingRule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMappingRule"


    // $ANTLR start "entryRuleHelperStatement"
    // InternalMapping.g:153:1: entryRuleHelperStatement : ruleHelperStatement EOF ;
    public final void entryRuleHelperStatement() throws RecognitionException {
        try {
            // InternalMapping.g:154:1: ( ruleHelperStatement EOF )
            // InternalMapping.g:155:1: ruleHelperStatement EOF
            {
             before(grammarAccess.getHelperStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleHelperStatement();

            state._fsp--;

             after(grammarAccess.getHelperStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHelperStatement"


    // $ANTLR start "ruleHelperStatement"
    // InternalMapping.g:162:1: ruleHelperStatement : ( ( rule__HelperStatement__Group__0 ) ) ;
    public final void ruleHelperStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:166:2: ( ( ( rule__HelperStatement__Group__0 ) ) )
            // InternalMapping.g:167:2: ( ( rule__HelperStatement__Group__0 ) )
            {
            // InternalMapping.g:167:2: ( ( rule__HelperStatement__Group__0 ) )
            // InternalMapping.g:168:3: ( rule__HelperStatement__Group__0 )
            {
             before(grammarAccess.getHelperStatementAccess().getGroup()); 
            // InternalMapping.g:169:3: ( rule__HelperStatement__Group__0 )
            // InternalMapping.g:169:4: rule__HelperStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHelperStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHelperStatement"


    // $ANTLR start "entryRuleEString"
    // InternalMapping.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMapping.g:179:1: ( ruleEString EOF )
            // InternalMapping.g:180:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMapping.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMapping.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMapping.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalMapping.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMapping.g:194:3: ( rule__EString__Alternatives )
            // InternalMapping.g:194:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMapping.g:203:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMapping.g:204:1: ( ruleQualifiedName EOF )
            // InternalMapping.g:205:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMapping.g:212:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:216:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMapping.g:217:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMapping.g:217:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMapping.g:218:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalMapping.g:219:3: ( rule__QualifiedName__Group__0 )
            // InternalMapping.g:219:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleValidID"
    // InternalMapping.g:228:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalMapping.g:229:1: ( ruleValidID EOF )
            // InternalMapping.g:230:1: ruleValidID EOF
            {
             before(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_1);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getValidIDRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalMapping.g:237:1: ruleValidID : ( ( rule__ValidID__Alternatives ) ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:241:2: ( ( ( rule__ValidID__Alternatives ) ) )
            // InternalMapping.g:242:2: ( ( rule__ValidID__Alternatives ) )
            {
            // InternalMapping.g:242:2: ( ( rule__ValidID__Alternatives ) )
            // InternalMapping.g:243:3: ( rule__ValidID__Alternatives )
            {
             before(grammarAccess.getValidIDAccess().getAlternatives()); 
            // InternalMapping.g:244:3: ( rule__ValidID__Alternatives )
            // InternalMapping.g:244:4: rule__ValidID__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValidID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValidIDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalMapping.g:253:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalMapping.g:254:1: ( ruleKEYWORD EOF )
            // InternalMapping.g:255:1: ruleKEYWORD EOF
            {
             before(grammarAccess.getKEYWORDRule()); 
            pushFollow(FOLLOW_1);
            ruleKEYWORD();

            state._fsp--;

             after(grammarAccess.getKEYWORDRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalMapping.g:262:1: ruleKEYWORD : ( ( rule__KEYWORD__Alternatives ) ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:266:2: ( ( ( rule__KEYWORD__Alternatives ) ) )
            // InternalMapping.g:267:2: ( ( rule__KEYWORD__Alternatives ) )
            {
            // InternalMapping.g:267:2: ( ( rule__KEYWORD__Alternatives ) )
            // InternalMapping.g:268:3: ( rule__KEYWORD__Alternatives )
            {
             before(grammarAccess.getKEYWORDAccess().getAlternatives()); 
            // InternalMapping.g:269:3: ( rule__KEYWORD__Alternatives )
            // InternalMapping.g:269:4: rule__KEYWORD__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__KEYWORD__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKEYWORDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKEYWORD"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalMapping.g:278:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalMapping.g:279:1: ( ruleVariableDeclaration EOF )
            // InternalMapping.g:280:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMapping.g:287:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:291:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalMapping.g:292:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalMapping.g:292:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalMapping.g:293:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalMapping.g:294:3: ( rule__VariableDeclaration__Group__0 )
            // InternalMapping.g:294:4: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "ruleOperator"
    // InternalMapping.g:303:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:307:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalMapping.g:308:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalMapping.g:308:2: ( ( rule__Operator__Alternatives ) )
            // InternalMapping.g:309:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalMapping.g:310:3: ( rule__Operator__Alternatives )
            // InternalMapping.g:310:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "rule__MappingRule__Alternatives_5_0"
    // InternalMapping.g:318:1: rule__MappingRule__Alternatives_5_0 : ( ( ( rule__MappingRule__Group_5_0_0__0 ) ) | ( ( rule__MappingRule__VariableAssignment_5_0_1 ) ) );
    public final void rule__MappingRule__Alternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:322:1: ( ( ( rule__MappingRule__Group_5_0_0__0 ) ) | ( ( rule__MappingRule__VariableAssignment_5_0_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMapping.g:323:2: ( ( rule__MappingRule__Group_5_0_0__0 ) )
                    {
                    // InternalMapping.g:323:2: ( ( rule__MappingRule__Group_5_0_0__0 ) )
                    // InternalMapping.g:324:3: ( rule__MappingRule__Group_5_0_0__0 )
                    {
                     before(grammarAccess.getMappingRuleAccess().getGroup_5_0_0()); 
                    // InternalMapping.g:325:3: ( rule__MappingRule__Group_5_0_0__0 )
                    // InternalMapping.g:325:4: rule__MappingRule__Group_5_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__Group_5_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMappingRuleAccess().getGroup_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMapping.g:329:2: ( ( rule__MappingRule__VariableAssignment_5_0_1 ) )
                    {
                    // InternalMapping.g:329:2: ( ( rule__MappingRule__VariableAssignment_5_0_1 ) )
                    // InternalMapping.g:330:3: ( rule__MappingRule__VariableAssignment_5_0_1 )
                    {
                     before(grammarAccess.getMappingRuleAccess().getVariableAssignment_5_0_1()); 
                    // InternalMapping.g:331:3: ( rule__MappingRule__VariableAssignment_5_0_1 )
                    // InternalMapping.g:331:4: rule__MappingRule__VariableAssignment_5_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__VariableAssignment_5_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMappingRuleAccess().getVariableAssignment_5_0_1()); 

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
    // $ANTLR end "rule__MappingRule__Alternatives_5_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMapping.g:339:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:343:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMapping.g:344:2: ( RULE_STRING )
                    {
                    // InternalMapping.g:344:2: ( RULE_STRING )
                    // InternalMapping.g:345:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMapping.g:350:2: ( RULE_ID )
                    {
                    // InternalMapping.g:350:2: ( RULE_ID )
                    // InternalMapping.g:351:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__ValidID__Alternatives"
    // InternalMapping.g:360:1: rule__ValidID__Alternatives : ( ( ruleEString ) | ( ruleKEYWORD ) );
    public final void rule__ValidID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:364:1: ( ( ruleEString ) | ( ruleKEYWORD ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=11 && LA3_0<=12)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMapping.g:365:2: ( ruleEString )
                    {
                    // InternalMapping.g:365:2: ( ruleEString )
                    // InternalMapping.g:366:3: ruleEString
                    {
                     before(grammarAccess.getValidIDAccess().getEStringParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     after(grammarAccess.getValidIDAccess().getEStringParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMapping.g:371:2: ( ruleKEYWORD )
                    {
                    // InternalMapping.g:371:2: ( ruleKEYWORD )
                    // InternalMapping.g:372:3: ruleKEYWORD
                    {
                     before(grammarAccess.getValidIDAccess().getKEYWORDParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleKEYWORD();

                    state._fsp--;

                     after(grammarAccess.getValidIDAccess().getKEYWORDParserRuleCall_1()); 

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
    // $ANTLR end "rule__ValidID__Alternatives"


    // $ANTLR start "rule__KEYWORD__Alternatives"
    // InternalMapping.g:381:1: rule__KEYWORD__Alternatives : ( ( 'source' ) | ( 'target' ) );
    public final void rule__KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:385:1: ( ( 'source' ) | ( 'target' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMapping.g:386:2: ( 'source' )
                    {
                    // InternalMapping.g:386:2: ( 'source' )
                    // InternalMapping.g:387:3: 'source'
                    {
                     before(grammarAccess.getKEYWORDAccess().getSourceKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getSourceKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMapping.g:392:2: ( 'target' )
                    {
                    // InternalMapping.g:392:2: ( 'target' )
                    // InternalMapping.g:393:3: 'target'
                    {
                     before(grammarAccess.getKEYWORDAccess().getTargetKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTargetKeyword_1()); 

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
    // $ANTLR end "rule__KEYWORD__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalMapping.g:402:1: rule__Operator__Alternatives : ( ( ( 'assign' ) ) | ( ( 'add' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:406:1: ( ( ( 'assign' ) ) | ( ( 'add' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMapping.g:407:2: ( ( 'assign' ) )
                    {
                    // InternalMapping.g:407:2: ( ( 'assign' ) )
                    // InternalMapping.g:408:3: ( 'assign' )
                    {
                     before(grammarAccess.getOperatorAccess().getAssignEnumLiteralDeclaration_0()); 
                    // InternalMapping.g:409:3: ( 'assign' )
                    // InternalMapping.g:409:4: 'assign'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getAssignEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMapping.g:413:2: ( ( 'add' ) )
                    {
                    // InternalMapping.g:413:2: ( ( 'add' ) )
                    // InternalMapping.g:414:3: ( 'add' )
                    {
                     before(grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_1()); 
                    // InternalMapping.g:415:3: ( 'add' )
                    // InternalMapping.g:415:4: 'add'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getAddEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__MappingModel__Group__0"
    // InternalMapping.g:423:1: rule__MappingModel__Group__0 : rule__MappingModel__Group__0__Impl rule__MappingModel__Group__1 ;
    public final void rule__MappingModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:427:1: ( rule__MappingModel__Group__0__Impl rule__MappingModel__Group__1 )
            // InternalMapping.g:428:2: rule__MappingModel__Group__0__Impl rule__MappingModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MappingModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__0"


    // $ANTLR start "rule__MappingModel__Group__0__Impl"
    // InternalMapping.g:435:1: rule__MappingModel__Group__0__Impl : ( 'MappingModel' ) ;
    public final void rule__MappingModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:439:1: ( ( 'MappingModel' ) )
            // InternalMapping.g:440:1: ( 'MappingModel' )
            {
            // InternalMapping.g:440:1: ( 'MappingModel' )
            // InternalMapping.g:441:2: 'MappingModel'
            {
             before(grammarAccess.getMappingModelAccess().getMappingModelKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getMappingModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__0__Impl"


    // $ANTLR start "rule__MappingModel__Group__1"
    // InternalMapping.g:450:1: rule__MappingModel__Group__1 : rule__MappingModel__Group__1__Impl rule__MappingModel__Group__2 ;
    public final void rule__MappingModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:454:1: ( rule__MappingModel__Group__1__Impl rule__MappingModel__Group__2 )
            // InternalMapping.g:455:2: rule__MappingModel__Group__1__Impl rule__MappingModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MappingModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__1"


    // $ANTLR start "rule__MappingModel__Group__1__Impl"
    // InternalMapping.g:462:1: rule__MappingModel__Group__1__Impl : ( ( rule__MappingModel__NameAssignment_1 ) ) ;
    public final void rule__MappingModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:466:1: ( ( ( rule__MappingModel__NameAssignment_1 ) ) )
            // InternalMapping.g:467:1: ( ( rule__MappingModel__NameAssignment_1 ) )
            {
            // InternalMapping.g:467:1: ( ( rule__MappingModel__NameAssignment_1 ) )
            // InternalMapping.g:468:2: ( rule__MappingModel__NameAssignment_1 )
            {
             before(grammarAccess.getMappingModelAccess().getNameAssignment_1()); 
            // InternalMapping.g:469:2: ( rule__MappingModel__NameAssignment_1 )
            // InternalMapping.g:469:3: rule__MappingModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__1__Impl"


    // $ANTLR start "rule__MappingModel__Group__2"
    // InternalMapping.g:477:1: rule__MappingModel__Group__2 : rule__MappingModel__Group__2__Impl rule__MappingModel__Group__3 ;
    public final void rule__MappingModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:481:1: ( rule__MappingModel__Group__2__Impl rule__MappingModel__Group__3 )
            // InternalMapping.g:482:2: rule__MappingModel__Group__2__Impl rule__MappingModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MappingModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__2"


    // $ANTLR start "rule__MappingModel__Group__2__Impl"
    // InternalMapping.g:489:1: rule__MappingModel__Group__2__Impl : ( 'SourceMetamodels' ) ;
    public final void rule__MappingModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:493:1: ( ( 'SourceMetamodels' ) )
            // InternalMapping.g:494:1: ( 'SourceMetamodels' )
            {
            // InternalMapping.g:494:1: ( 'SourceMetamodels' )
            // InternalMapping.g:495:2: 'SourceMetamodels'
            {
             before(grammarAccess.getMappingModelAccess().getSourceMetamodelsKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getSourceMetamodelsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__2__Impl"


    // $ANTLR start "rule__MappingModel__Group__3"
    // InternalMapping.g:504:1: rule__MappingModel__Group__3 : rule__MappingModel__Group__3__Impl rule__MappingModel__Group__4 ;
    public final void rule__MappingModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:508:1: ( rule__MappingModel__Group__3__Impl rule__MappingModel__Group__4 )
            // InternalMapping.g:509:2: rule__MappingModel__Group__3__Impl rule__MappingModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__MappingModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__3"


    // $ANTLR start "rule__MappingModel__Group__3__Impl"
    // InternalMapping.g:516:1: rule__MappingModel__Group__3__Impl : ( '{' ) ;
    public final void rule__MappingModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:520:1: ( ( '{' ) )
            // InternalMapping.g:521:1: ( '{' )
            {
            // InternalMapping.g:521:1: ( '{' )
            // InternalMapping.g:522:2: '{'
            {
             before(grammarAccess.getMappingModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__3__Impl"


    // $ANTLR start "rule__MappingModel__Group__4"
    // InternalMapping.g:531:1: rule__MappingModel__Group__4 : rule__MappingModel__Group__4__Impl rule__MappingModel__Group__5 ;
    public final void rule__MappingModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:535:1: ( rule__MappingModel__Group__4__Impl rule__MappingModel__Group__5 )
            // InternalMapping.g:536:2: rule__MappingModel__Group__4__Impl rule__MappingModel__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__MappingModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__4"


    // $ANTLR start "rule__MappingModel__Group__4__Impl"
    // InternalMapping.g:543:1: rule__MappingModel__Group__4__Impl : ( ( rule__MappingModel__SourceMetamodelsAssignment_4 ) ) ;
    public final void rule__MappingModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:547:1: ( ( ( rule__MappingModel__SourceMetamodelsAssignment_4 ) ) )
            // InternalMapping.g:548:1: ( ( rule__MappingModel__SourceMetamodelsAssignment_4 ) )
            {
            // InternalMapping.g:548:1: ( ( rule__MappingModel__SourceMetamodelsAssignment_4 ) )
            // InternalMapping.g:549:2: ( rule__MappingModel__SourceMetamodelsAssignment_4 )
            {
             before(grammarAccess.getMappingModelAccess().getSourceMetamodelsAssignment_4()); 
            // InternalMapping.g:550:2: ( rule__MappingModel__SourceMetamodelsAssignment_4 )
            // InternalMapping.g:550:3: rule__MappingModel__SourceMetamodelsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__SourceMetamodelsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMappingModelAccess().getSourceMetamodelsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__4__Impl"


    // $ANTLR start "rule__MappingModel__Group__5"
    // InternalMapping.g:558:1: rule__MappingModel__Group__5 : rule__MappingModel__Group__5__Impl rule__MappingModel__Group__6 ;
    public final void rule__MappingModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:562:1: ( rule__MappingModel__Group__5__Impl rule__MappingModel__Group__6 )
            // InternalMapping.g:563:2: rule__MappingModel__Group__5__Impl rule__MappingModel__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__MappingModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__5"


    // $ANTLR start "rule__MappingModel__Group__5__Impl"
    // InternalMapping.g:570:1: rule__MappingModel__Group__5__Impl : ( ( rule__MappingModel__Group_5__0 )* ) ;
    public final void rule__MappingModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:574:1: ( ( ( rule__MappingModel__Group_5__0 )* ) )
            // InternalMapping.g:575:1: ( ( rule__MappingModel__Group_5__0 )* )
            {
            // InternalMapping.g:575:1: ( ( rule__MappingModel__Group_5__0 )* )
            // InternalMapping.g:576:2: ( rule__MappingModel__Group_5__0 )*
            {
             before(grammarAccess.getMappingModelAccess().getGroup_5()); 
            // InternalMapping.g:577:2: ( rule__MappingModel__Group_5__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMapping.g:577:3: rule__MappingModel__Group_5__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MappingModel__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMappingModelAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__5__Impl"


    // $ANTLR start "rule__MappingModel__Group__6"
    // InternalMapping.g:585:1: rule__MappingModel__Group__6 : rule__MappingModel__Group__6__Impl rule__MappingModel__Group__7 ;
    public final void rule__MappingModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:589:1: ( rule__MappingModel__Group__6__Impl rule__MappingModel__Group__7 )
            // InternalMapping.g:590:2: rule__MappingModel__Group__6__Impl rule__MappingModel__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__MappingModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__6"


    // $ANTLR start "rule__MappingModel__Group__6__Impl"
    // InternalMapping.g:597:1: rule__MappingModel__Group__6__Impl : ( '}' ) ;
    public final void rule__MappingModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:601:1: ( ( '}' ) )
            // InternalMapping.g:602:1: ( '}' )
            {
            // InternalMapping.g:602:1: ( '}' )
            // InternalMapping.g:603:2: '}'
            {
             before(grammarAccess.getMappingModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__6__Impl"


    // $ANTLR start "rule__MappingModel__Group__7"
    // InternalMapping.g:612:1: rule__MappingModel__Group__7 : rule__MappingModel__Group__7__Impl rule__MappingModel__Group__8 ;
    public final void rule__MappingModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:616:1: ( rule__MappingModel__Group__7__Impl rule__MappingModel__Group__8 )
            // InternalMapping.g:617:2: rule__MappingModel__Group__7__Impl rule__MappingModel__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__MappingModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__7"


    // $ANTLR start "rule__MappingModel__Group__7__Impl"
    // InternalMapping.g:624:1: rule__MappingModel__Group__7__Impl : ( ( rule__MappingModel__Group_7__0 )? ) ;
    public final void rule__MappingModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:628:1: ( ( ( rule__MappingModel__Group_7__0 )? ) )
            // InternalMapping.g:629:1: ( ( rule__MappingModel__Group_7__0 )? )
            {
            // InternalMapping.g:629:1: ( ( rule__MappingModel__Group_7__0 )? )
            // InternalMapping.g:630:2: ( rule__MappingModel__Group_7__0 )?
            {
             before(grammarAccess.getMappingModelAccess().getGroup_7()); 
            // InternalMapping.g:631:2: ( rule__MappingModel__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMapping.g:631:3: rule__MappingModel__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingModel__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingModelAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__7__Impl"


    // $ANTLR start "rule__MappingModel__Group__8"
    // InternalMapping.g:639:1: rule__MappingModel__Group__8 : rule__MappingModel__Group__8__Impl rule__MappingModel__Group__9 ;
    public final void rule__MappingModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:643:1: ( rule__MappingModel__Group__8__Impl rule__MappingModel__Group__9 )
            // InternalMapping.g:644:2: rule__MappingModel__Group__8__Impl rule__MappingModel__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__MappingModel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__8"


    // $ANTLR start "rule__MappingModel__Group__8__Impl"
    // InternalMapping.g:651:1: rule__MappingModel__Group__8__Impl : ( 'TargetMetamodels' ) ;
    public final void rule__MappingModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:655:1: ( ( 'TargetMetamodels' ) )
            // InternalMapping.g:656:1: ( 'TargetMetamodels' )
            {
            // InternalMapping.g:656:1: ( 'TargetMetamodels' )
            // InternalMapping.g:657:2: 'TargetMetamodels'
            {
             before(grammarAccess.getMappingModelAccess().getTargetMetamodelsKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getTargetMetamodelsKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__8__Impl"


    // $ANTLR start "rule__MappingModel__Group__9"
    // InternalMapping.g:666:1: rule__MappingModel__Group__9 : rule__MappingModel__Group__9__Impl rule__MappingModel__Group__10 ;
    public final void rule__MappingModel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:670:1: ( rule__MappingModel__Group__9__Impl rule__MappingModel__Group__10 )
            // InternalMapping.g:671:2: rule__MappingModel__Group__9__Impl rule__MappingModel__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__MappingModel__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__9"


    // $ANTLR start "rule__MappingModel__Group__9__Impl"
    // InternalMapping.g:678:1: rule__MappingModel__Group__9__Impl : ( '{' ) ;
    public final void rule__MappingModel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:682:1: ( ( '{' ) )
            // InternalMapping.g:683:1: ( '{' )
            {
            // InternalMapping.g:683:1: ( '{' )
            // InternalMapping.g:684:2: '{'
            {
             before(grammarAccess.getMappingModelAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__9__Impl"


    // $ANTLR start "rule__MappingModel__Group__10"
    // InternalMapping.g:693:1: rule__MappingModel__Group__10 : rule__MappingModel__Group__10__Impl rule__MappingModel__Group__11 ;
    public final void rule__MappingModel__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:697:1: ( rule__MappingModel__Group__10__Impl rule__MappingModel__Group__11 )
            // InternalMapping.g:698:2: rule__MappingModel__Group__10__Impl rule__MappingModel__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__MappingModel__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__10"


    // $ANTLR start "rule__MappingModel__Group__10__Impl"
    // InternalMapping.g:705:1: rule__MappingModel__Group__10__Impl : ( ( rule__MappingModel__TargetMetamodelsAssignment_10 ) ) ;
    public final void rule__MappingModel__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:709:1: ( ( ( rule__MappingModel__TargetMetamodelsAssignment_10 ) ) )
            // InternalMapping.g:710:1: ( ( rule__MappingModel__TargetMetamodelsAssignment_10 ) )
            {
            // InternalMapping.g:710:1: ( ( rule__MappingModel__TargetMetamodelsAssignment_10 ) )
            // InternalMapping.g:711:2: ( rule__MappingModel__TargetMetamodelsAssignment_10 )
            {
             before(grammarAccess.getMappingModelAccess().getTargetMetamodelsAssignment_10()); 
            // InternalMapping.g:712:2: ( rule__MappingModel__TargetMetamodelsAssignment_10 )
            // InternalMapping.g:712:3: rule__MappingModel__TargetMetamodelsAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__TargetMetamodelsAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getMappingModelAccess().getTargetMetamodelsAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__10__Impl"


    // $ANTLR start "rule__MappingModel__Group__11"
    // InternalMapping.g:720:1: rule__MappingModel__Group__11 : rule__MappingModel__Group__11__Impl rule__MappingModel__Group__12 ;
    public final void rule__MappingModel__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:724:1: ( rule__MappingModel__Group__11__Impl rule__MappingModel__Group__12 )
            // InternalMapping.g:725:2: rule__MappingModel__Group__11__Impl rule__MappingModel__Group__12
            {
            pushFollow(FOLLOW_7);
            rule__MappingModel__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__11"


    // $ANTLR start "rule__MappingModel__Group__11__Impl"
    // InternalMapping.g:732:1: rule__MappingModel__Group__11__Impl : ( ( rule__MappingModel__Group_11__0 )* ) ;
    public final void rule__MappingModel__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:736:1: ( ( ( rule__MappingModel__Group_11__0 )* ) )
            // InternalMapping.g:737:1: ( ( rule__MappingModel__Group_11__0 )* )
            {
            // InternalMapping.g:737:1: ( ( rule__MappingModel__Group_11__0 )* )
            // InternalMapping.g:738:2: ( rule__MappingModel__Group_11__0 )*
            {
             before(grammarAccess.getMappingModelAccess().getGroup_11()); 
            // InternalMapping.g:739:2: ( rule__MappingModel__Group_11__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMapping.g:739:3: rule__MappingModel__Group_11__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MappingModel__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMappingModelAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__11__Impl"


    // $ANTLR start "rule__MappingModel__Group__12"
    // InternalMapping.g:747:1: rule__MappingModel__Group__12 : rule__MappingModel__Group__12__Impl rule__MappingModel__Group__13 ;
    public final void rule__MappingModel__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:751:1: ( rule__MappingModel__Group__12__Impl rule__MappingModel__Group__13 )
            // InternalMapping.g:752:2: rule__MappingModel__Group__12__Impl rule__MappingModel__Group__13
            {
            pushFollow(FOLLOW_10);
            rule__MappingModel__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__12"


    // $ANTLR start "rule__MappingModel__Group__12__Impl"
    // InternalMapping.g:759:1: rule__MappingModel__Group__12__Impl : ( '}' ) ;
    public final void rule__MappingModel__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:763:1: ( ( '}' ) )
            // InternalMapping.g:764:1: ( '}' )
            {
            // InternalMapping.g:764:1: ( '}' )
            // InternalMapping.g:765:2: '}'
            {
             before(grammarAccess.getMappingModelAccess().getRightCurlyBracketKeyword_12()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__12__Impl"


    // $ANTLR start "rule__MappingModel__Group__13"
    // InternalMapping.g:774:1: rule__MappingModel__Group__13 : rule__MappingModel__Group__13__Impl ;
    public final void rule__MappingModel__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:778:1: ( rule__MappingModel__Group__13__Impl )
            // InternalMapping.g:779:2: rule__MappingModel__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__13"


    // $ANTLR start "rule__MappingModel__Group__13__Impl"
    // InternalMapping.g:785:1: rule__MappingModel__Group__13__Impl : ( ( rule__MappingModel__Group_13__0 )? ) ;
    public final void rule__MappingModel__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:789:1: ( ( ( rule__MappingModel__Group_13__0 )? ) )
            // InternalMapping.g:790:1: ( ( rule__MappingModel__Group_13__0 )? )
            {
            // InternalMapping.g:790:1: ( ( rule__MappingModel__Group_13__0 )? )
            // InternalMapping.g:791:2: ( rule__MappingModel__Group_13__0 )?
            {
             before(grammarAccess.getMappingModelAccess().getGroup_13()); 
            // InternalMapping.g:792:2: ( rule__MappingModel__Group_13__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMapping.g:792:3: rule__MappingModel__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingModel__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingModelAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group__13__Impl"


    // $ANTLR start "rule__MappingModel__Group_5__0"
    // InternalMapping.g:801:1: rule__MappingModel__Group_5__0 : rule__MappingModel__Group_5__0__Impl rule__MappingModel__Group_5__1 ;
    public final void rule__MappingModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:805:1: ( rule__MappingModel__Group_5__0__Impl rule__MappingModel__Group_5__1 )
            // InternalMapping.g:806:2: rule__MappingModel__Group_5__0__Impl rule__MappingModel__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__MappingModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_5__0"


    // $ANTLR start "rule__MappingModel__Group_5__0__Impl"
    // InternalMapping.g:813:1: rule__MappingModel__Group_5__0__Impl : ( ',' ) ;
    public final void rule__MappingModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:817:1: ( ( ',' ) )
            // InternalMapping.g:818:1: ( ',' )
            {
            // InternalMapping.g:818:1: ( ',' )
            // InternalMapping.g:819:2: ','
            {
             before(grammarAccess.getMappingModelAccess().getCommaKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_5__0__Impl"


    // $ANTLR start "rule__MappingModel__Group_5__1"
    // InternalMapping.g:828:1: rule__MappingModel__Group_5__1 : rule__MappingModel__Group_5__1__Impl ;
    public final void rule__MappingModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:832:1: ( rule__MappingModel__Group_5__1__Impl )
            // InternalMapping.g:833:2: rule__MappingModel__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_5__1"


    // $ANTLR start "rule__MappingModel__Group_5__1__Impl"
    // InternalMapping.g:839:1: rule__MappingModel__Group_5__1__Impl : ( ( rule__MappingModel__SourceMetamodelsAssignment_5_1 ) ) ;
    public final void rule__MappingModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:843:1: ( ( ( rule__MappingModel__SourceMetamodelsAssignment_5_1 ) ) )
            // InternalMapping.g:844:1: ( ( rule__MappingModel__SourceMetamodelsAssignment_5_1 ) )
            {
            // InternalMapping.g:844:1: ( ( rule__MappingModel__SourceMetamodelsAssignment_5_1 ) )
            // InternalMapping.g:845:2: ( rule__MappingModel__SourceMetamodelsAssignment_5_1 )
            {
             before(grammarAccess.getMappingModelAccess().getSourceMetamodelsAssignment_5_1()); 
            // InternalMapping.g:846:2: ( rule__MappingModel__SourceMetamodelsAssignment_5_1 )
            // InternalMapping.g:846:3: rule__MappingModel__SourceMetamodelsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__SourceMetamodelsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingModelAccess().getSourceMetamodelsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_5__1__Impl"


    // $ANTLR start "rule__MappingModel__Group_7__0"
    // InternalMapping.g:855:1: rule__MappingModel__Group_7__0 : rule__MappingModel__Group_7__0__Impl rule__MappingModel__Group_7__1 ;
    public final void rule__MappingModel__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:859:1: ( rule__MappingModel__Group_7__0__Impl rule__MappingModel__Group_7__1 )
            // InternalMapping.g:860:2: rule__MappingModel__Group_7__0__Impl rule__MappingModel__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__MappingModel__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_7__0"


    // $ANTLR start "rule__MappingModel__Group_7__0__Impl"
    // InternalMapping.g:867:1: rule__MappingModel__Group_7__0__Impl : ( 'MainSourceMetamodel' ) ;
    public final void rule__MappingModel__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:871:1: ( ( 'MainSourceMetamodel' ) )
            // InternalMapping.g:872:1: ( 'MainSourceMetamodel' )
            {
            // InternalMapping.g:872:1: ( 'MainSourceMetamodel' )
            // InternalMapping.g:873:2: 'MainSourceMetamodel'
            {
             before(grammarAccess.getMappingModelAccess().getMainSourceMetamodelKeyword_7_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getMainSourceMetamodelKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_7__0__Impl"


    // $ANTLR start "rule__MappingModel__Group_7__1"
    // InternalMapping.g:882:1: rule__MappingModel__Group_7__1 : rule__MappingModel__Group_7__1__Impl ;
    public final void rule__MappingModel__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:886:1: ( rule__MappingModel__Group_7__1__Impl )
            // InternalMapping.g:887:2: rule__MappingModel__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_7__1"


    // $ANTLR start "rule__MappingModel__Group_7__1__Impl"
    // InternalMapping.g:893:1: rule__MappingModel__Group_7__1__Impl : ( ( rule__MappingModel__MainSourceMetamodelAssignment_7_1 ) ) ;
    public final void rule__MappingModel__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:897:1: ( ( ( rule__MappingModel__MainSourceMetamodelAssignment_7_1 ) ) )
            // InternalMapping.g:898:1: ( ( rule__MappingModel__MainSourceMetamodelAssignment_7_1 ) )
            {
            // InternalMapping.g:898:1: ( ( rule__MappingModel__MainSourceMetamodelAssignment_7_1 ) )
            // InternalMapping.g:899:2: ( rule__MappingModel__MainSourceMetamodelAssignment_7_1 )
            {
             before(grammarAccess.getMappingModelAccess().getMainSourceMetamodelAssignment_7_1()); 
            // InternalMapping.g:900:2: ( rule__MappingModel__MainSourceMetamodelAssignment_7_1 )
            // InternalMapping.g:900:3: rule__MappingModel__MainSourceMetamodelAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__MainSourceMetamodelAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingModelAccess().getMainSourceMetamodelAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_7__1__Impl"


    // $ANTLR start "rule__MappingModel__Group_11__0"
    // InternalMapping.g:909:1: rule__MappingModel__Group_11__0 : rule__MappingModel__Group_11__0__Impl rule__MappingModel__Group_11__1 ;
    public final void rule__MappingModel__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:913:1: ( rule__MappingModel__Group_11__0__Impl rule__MappingModel__Group_11__1 )
            // InternalMapping.g:914:2: rule__MappingModel__Group_11__0__Impl rule__MappingModel__Group_11__1
            {
            pushFollow(FOLLOW_6);
            rule__MappingModel__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_11__0"


    // $ANTLR start "rule__MappingModel__Group_11__0__Impl"
    // InternalMapping.g:921:1: rule__MappingModel__Group_11__0__Impl : ( ',' ) ;
    public final void rule__MappingModel__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:925:1: ( ( ',' ) )
            // InternalMapping.g:926:1: ( ',' )
            {
            // InternalMapping.g:926:1: ( ',' )
            // InternalMapping.g:927:2: ','
            {
             before(grammarAccess.getMappingModelAccess().getCommaKeyword_11_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getCommaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_11__0__Impl"


    // $ANTLR start "rule__MappingModel__Group_11__1"
    // InternalMapping.g:936:1: rule__MappingModel__Group_11__1 : rule__MappingModel__Group_11__1__Impl ;
    public final void rule__MappingModel__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:940:1: ( rule__MappingModel__Group_11__1__Impl )
            // InternalMapping.g:941:2: rule__MappingModel__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_11__1"


    // $ANTLR start "rule__MappingModel__Group_11__1__Impl"
    // InternalMapping.g:947:1: rule__MappingModel__Group_11__1__Impl : ( ( rule__MappingModel__TargetMetamodelsAssignment_11_1 ) ) ;
    public final void rule__MappingModel__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:951:1: ( ( ( rule__MappingModel__TargetMetamodelsAssignment_11_1 ) ) )
            // InternalMapping.g:952:1: ( ( rule__MappingModel__TargetMetamodelsAssignment_11_1 ) )
            {
            // InternalMapping.g:952:1: ( ( rule__MappingModel__TargetMetamodelsAssignment_11_1 ) )
            // InternalMapping.g:953:2: ( rule__MappingModel__TargetMetamodelsAssignment_11_1 )
            {
             before(grammarAccess.getMappingModelAccess().getTargetMetamodelsAssignment_11_1()); 
            // InternalMapping.g:954:2: ( rule__MappingModel__TargetMetamodelsAssignment_11_1 )
            // InternalMapping.g:954:3: rule__MappingModel__TargetMetamodelsAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__TargetMetamodelsAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingModelAccess().getTargetMetamodelsAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_11__1__Impl"


    // $ANTLR start "rule__MappingModel__Group_13__0"
    // InternalMapping.g:963:1: rule__MappingModel__Group_13__0 : rule__MappingModel__Group_13__0__Impl rule__MappingModel__Group_13__1 ;
    public final void rule__MappingModel__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:967:1: ( rule__MappingModel__Group_13__0__Impl rule__MappingModel__Group_13__1 )
            // InternalMapping.g:968:2: rule__MappingModel__Group_13__0__Impl rule__MappingModel__Group_13__1
            {
            pushFollow(FOLLOW_5);
            rule__MappingModel__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13__0"


    // $ANTLR start "rule__MappingModel__Group_13__0__Impl"
    // InternalMapping.g:975:1: rule__MappingModel__Group_13__0__Impl : ( 'MappingRules' ) ;
    public final void rule__MappingModel__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:979:1: ( ( 'MappingRules' ) )
            // InternalMapping.g:980:1: ( 'MappingRules' )
            {
            // InternalMapping.g:980:1: ( 'MappingRules' )
            // InternalMapping.g:981:2: 'MappingRules'
            {
             before(grammarAccess.getMappingModelAccess().getMappingRulesKeyword_13_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getMappingRulesKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13__0__Impl"


    // $ANTLR start "rule__MappingModel__Group_13__1"
    // InternalMapping.g:990:1: rule__MappingModel__Group_13__1 : rule__MappingModel__Group_13__1__Impl rule__MappingModel__Group_13__2 ;
    public final void rule__MappingModel__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:994:1: ( rule__MappingModel__Group_13__1__Impl rule__MappingModel__Group_13__2 )
            // InternalMapping.g:995:2: rule__MappingModel__Group_13__1__Impl rule__MappingModel__Group_13__2
            {
            pushFollow(FOLLOW_12);
            rule__MappingModel__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13__1"


    // $ANTLR start "rule__MappingModel__Group_13__1__Impl"
    // InternalMapping.g:1002:1: rule__MappingModel__Group_13__1__Impl : ( '{' ) ;
    public final void rule__MappingModel__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1006:1: ( ( '{' ) )
            // InternalMapping.g:1007:1: ( '{' )
            {
            // InternalMapping.g:1007:1: ( '{' )
            // InternalMapping.g:1008:2: '{'
            {
             before(grammarAccess.getMappingModelAccess().getLeftCurlyBracketKeyword_13_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getLeftCurlyBracketKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13__1__Impl"


    // $ANTLR start "rule__MappingModel__Group_13__2"
    // InternalMapping.g:1017:1: rule__MappingModel__Group_13__2 : rule__MappingModel__Group_13__2__Impl rule__MappingModel__Group_13__3 ;
    public final void rule__MappingModel__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1021:1: ( rule__MappingModel__Group_13__2__Impl rule__MappingModel__Group_13__3 )
            // InternalMapping.g:1022:2: rule__MappingModel__Group_13__2__Impl rule__MappingModel__Group_13__3
            {
            pushFollow(FOLLOW_13);
            rule__MappingModel__Group_13__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_13__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13__2"


    // $ANTLR start "rule__MappingModel__Group_13__2__Impl"
    // InternalMapping.g:1029:1: rule__MappingModel__Group_13__2__Impl : ( ( rule__MappingModel__RulesAssignment_13_2 ) ) ;
    public final void rule__MappingModel__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1033:1: ( ( ( rule__MappingModel__RulesAssignment_13_2 ) ) )
            // InternalMapping.g:1034:1: ( ( rule__MappingModel__RulesAssignment_13_2 ) )
            {
            // InternalMapping.g:1034:1: ( ( rule__MappingModel__RulesAssignment_13_2 ) )
            // InternalMapping.g:1035:2: ( rule__MappingModel__RulesAssignment_13_2 )
            {
             before(grammarAccess.getMappingModelAccess().getRulesAssignment_13_2()); 
            // InternalMapping.g:1036:2: ( rule__MappingModel__RulesAssignment_13_2 )
            // InternalMapping.g:1036:3: rule__MappingModel__RulesAssignment_13_2
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__RulesAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getMappingModelAccess().getRulesAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13__2__Impl"


    // $ANTLR start "rule__MappingModel__Group_13__3"
    // InternalMapping.g:1044:1: rule__MappingModel__Group_13__3 : rule__MappingModel__Group_13__3__Impl rule__MappingModel__Group_13__4 ;
    public final void rule__MappingModel__Group_13__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1048:1: ( rule__MappingModel__Group_13__3__Impl rule__MappingModel__Group_13__4 )
            // InternalMapping.g:1049:2: rule__MappingModel__Group_13__3__Impl rule__MappingModel__Group_13__4
            {
            pushFollow(FOLLOW_13);
            rule__MappingModel__Group_13__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_13__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13__3"


    // $ANTLR start "rule__MappingModel__Group_13__3__Impl"
    // InternalMapping.g:1056:1: rule__MappingModel__Group_13__3__Impl : ( ( rule__MappingModel__Group_13_3__0 )* ) ;
    public final void rule__MappingModel__Group_13__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1060:1: ( ( ( rule__MappingModel__Group_13_3__0 )* ) )
            // InternalMapping.g:1061:1: ( ( rule__MappingModel__Group_13_3__0 )* )
            {
            // InternalMapping.g:1061:1: ( ( rule__MappingModel__Group_13_3__0 )* )
            // InternalMapping.g:1062:2: ( rule__MappingModel__Group_13_3__0 )*
            {
             before(grammarAccess.getMappingModelAccess().getGroup_13_3()); 
            // InternalMapping.g:1063:2: ( rule__MappingModel__Group_13_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMapping.g:1063:3: rule__MappingModel__Group_13_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__MappingModel__Group_13_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMappingModelAccess().getGroup_13_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13__3__Impl"


    // $ANTLR start "rule__MappingModel__Group_13__4"
    // InternalMapping.g:1071:1: rule__MappingModel__Group_13__4 : rule__MappingModel__Group_13__4__Impl ;
    public final void rule__MappingModel__Group_13__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1075:1: ( rule__MappingModel__Group_13__4__Impl )
            // InternalMapping.g:1076:2: rule__MappingModel__Group_13__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_13__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13__4"


    // $ANTLR start "rule__MappingModel__Group_13__4__Impl"
    // InternalMapping.g:1082:1: rule__MappingModel__Group_13__4__Impl : ( '}' ) ;
    public final void rule__MappingModel__Group_13__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1086:1: ( ( '}' ) )
            // InternalMapping.g:1087:1: ( '}' )
            {
            // InternalMapping.g:1087:1: ( '}' )
            // InternalMapping.g:1088:2: '}'
            {
             before(grammarAccess.getMappingModelAccess().getRightCurlyBracketKeyword_13_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getRightCurlyBracketKeyword_13_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13__4__Impl"


    // $ANTLR start "rule__MappingModel__Group_13_3__0"
    // InternalMapping.g:1098:1: rule__MappingModel__Group_13_3__0 : rule__MappingModel__Group_13_3__0__Impl rule__MappingModel__Group_13_3__1 ;
    public final void rule__MappingModel__Group_13_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1102:1: ( rule__MappingModel__Group_13_3__0__Impl rule__MappingModel__Group_13_3__1 )
            // InternalMapping.g:1103:2: rule__MappingModel__Group_13_3__0__Impl rule__MappingModel__Group_13_3__1
            {
            pushFollow(FOLLOW_12);
            rule__MappingModel__Group_13_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_13_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13_3__0"


    // $ANTLR start "rule__MappingModel__Group_13_3__0__Impl"
    // InternalMapping.g:1110:1: rule__MappingModel__Group_13_3__0__Impl : ( ';' ) ;
    public final void rule__MappingModel__Group_13_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1114:1: ( ( ';' ) )
            // InternalMapping.g:1115:1: ( ';' )
            {
            // InternalMapping.g:1115:1: ( ';' )
            // InternalMapping.g:1116:2: ';'
            {
             before(grammarAccess.getMappingModelAccess().getSemicolonKeyword_13_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getSemicolonKeyword_13_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13_3__0__Impl"


    // $ANTLR start "rule__MappingModel__Group_13_3__1"
    // InternalMapping.g:1125:1: rule__MappingModel__Group_13_3__1 : rule__MappingModel__Group_13_3__1__Impl ;
    public final void rule__MappingModel__Group_13_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1129:1: ( rule__MappingModel__Group_13_3__1__Impl )
            // InternalMapping.g:1130:2: rule__MappingModel__Group_13_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__Group_13_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13_3__1"


    // $ANTLR start "rule__MappingModel__Group_13_3__1__Impl"
    // InternalMapping.g:1136:1: rule__MappingModel__Group_13_3__1__Impl : ( ( rule__MappingModel__RulesAssignment_13_3_1 ) ) ;
    public final void rule__MappingModel__Group_13_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1140:1: ( ( ( rule__MappingModel__RulesAssignment_13_3_1 ) ) )
            // InternalMapping.g:1141:1: ( ( rule__MappingModel__RulesAssignment_13_3_1 ) )
            {
            // InternalMapping.g:1141:1: ( ( rule__MappingModel__RulesAssignment_13_3_1 ) )
            // InternalMapping.g:1142:2: ( rule__MappingModel__RulesAssignment_13_3_1 )
            {
             before(grammarAccess.getMappingModelAccess().getRulesAssignment_13_3_1()); 
            // InternalMapping.g:1143:2: ( rule__MappingModel__RulesAssignment_13_3_1 )
            // InternalMapping.g:1143:3: rule__MappingModel__RulesAssignment_13_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingModel__RulesAssignment_13_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingModelAccess().getRulesAssignment_13_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__Group_13_3__1__Impl"


    // $ANTLR start "rule__SourceMetamodel__Group__0"
    // InternalMapping.g:1152:1: rule__SourceMetamodel__Group__0 : rule__SourceMetamodel__Group__0__Impl rule__SourceMetamodel__Group__1 ;
    public final void rule__SourceMetamodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1156:1: ( rule__SourceMetamodel__Group__0__Impl rule__SourceMetamodel__Group__1 )
            // InternalMapping.g:1157:2: rule__SourceMetamodel__Group__0__Impl rule__SourceMetamodel__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SourceMetamodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceMetamodel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMetamodel__Group__0"


    // $ANTLR start "rule__SourceMetamodel__Group__0__Impl"
    // InternalMapping.g:1164:1: rule__SourceMetamodel__Group__0__Impl : ( () ) ;
    public final void rule__SourceMetamodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1168:1: ( ( () ) )
            // InternalMapping.g:1169:1: ( () )
            {
            // InternalMapping.g:1169:1: ( () )
            // InternalMapping.g:1170:2: ()
            {
             before(grammarAccess.getSourceMetamodelAccess().getSourceMetamodelAction_0()); 
            // InternalMapping.g:1171:2: ()
            // InternalMapping.g:1171:3: 
            {
            }

             after(grammarAccess.getSourceMetamodelAccess().getSourceMetamodelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMetamodel__Group__0__Impl"


    // $ANTLR start "rule__SourceMetamodel__Group__1"
    // InternalMapping.g:1179:1: rule__SourceMetamodel__Group__1 : rule__SourceMetamodel__Group__1__Impl rule__SourceMetamodel__Group__2 ;
    public final void rule__SourceMetamodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1183:1: ( rule__SourceMetamodel__Group__1__Impl rule__SourceMetamodel__Group__2 )
            // InternalMapping.g:1184:2: rule__SourceMetamodel__Group__1__Impl rule__SourceMetamodel__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__SourceMetamodel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SourceMetamodel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMetamodel__Group__1"


    // $ANTLR start "rule__SourceMetamodel__Group__1__Impl"
    // InternalMapping.g:1191:1: rule__SourceMetamodel__Group__1__Impl : ( ( rule__SourceMetamodel__NameAssignment_1 )? ) ;
    public final void rule__SourceMetamodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1195:1: ( ( ( rule__SourceMetamodel__NameAssignment_1 )? ) )
            // InternalMapping.g:1196:1: ( ( rule__SourceMetamodel__NameAssignment_1 )? )
            {
            // InternalMapping.g:1196:1: ( ( rule__SourceMetamodel__NameAssignment_1 )? )
            // InternalMapping.g:1197:2: ( rule__SourceMetamodel__NameAssignment_1 )?
            {
             before(grammarAccess.getSourceMetamodelAccess().getNameAssignment_1()); 
            // InternalMapping.g:1198:2: ( rule__SourceMetamodel__NameAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                int LA11_1 = input.LA(2);

                if ( ((LA11_1>=RULE_STRING && LA11_1<=RULE_ID)) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalMapping.g:1198:3: rule__SourceMetamodel__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SourceMetamodel__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSourceMetamodelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMetamodel__Group__1__Impl"


    // $ANTLR start "rule__SourceMetamodel__Group__2"
    // InternalMapping.g:1206:1: rule__SourceMetamodel__Group__2 : rule__SourceMetamodel__Group__2__Impl ;
    public final void rule__SourceMetamodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1210:1: ( rule__SourceMetamodel__Group__2__Impl )
            // InternalMapping.g:1211:2: rule__SourceMetamodel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SourceMetamodel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMetamodel__Group__2"


    // $ANTLR start "rule__SourceMetamodel__Group__2__Impl"
    // InternalMapping.g:1217:1: rule__SourceMetamodel__Group__2__Impl : ( ( rule__SourceMetamodel__ModelAssignment_2 ) ) ;
    public final void rule__SourceMetamodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1221:1: ( ( ( rule__SourceMetamodel__ModelAssignment_2 ) ) )
            // InternalMapping.g:1222:1: ( ( rule__SourceMetamodel__ModelAssignment_2 ) )
            {
            // InternalMapping.g:1222:1: ( ( rule__SourceMetamodel__ModelAssignment_2 ) )
            // InternalMapping.g:1223:2: ( rule__SourceMetamodel__ModelAssignment_2 )
            {
             before(grammarAccess.getSourceMetamodelAccess().getModelAssignment_2()); 
            // InternalMapping.g:1224:2: ( rule__SourceMetamodel__ModelAssignment_2 )
            // InternalMapping.g:1224:3: rule__SourceMetamodel__ModelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SourceMetamodel__ModelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSourceMetamodelAccess().getModelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMetamodel__Group__2__Impl"


    // $ANTLR start "rule__TargetMetamodel__Group__0"
    // InternalMapping.g:1233:1: rule__TargetMetamodel__Group__0 : rule__TargetMetamodel__Group__0__Impl rule__TargetMetamodel__Group__1 ;
    public final void rule__TargetMetamodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1237:1: ( rule__TargetMetamodel__Group__0__Impl rule__TargetMetamodel__Group__1 )
            // InternalMapping.g:1238:2: rule__TargetMetamodel__Group__0__Impl rule__TargetMetamodel__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__TargetMetamodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetMetamodel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMetamodel__Group__0"


    // $ANTLR start "rule__TargetMetamodel__Group__0__Impl"
    // InternalMapping.g:1245:1: rule__TargetMetamodel__Group__0__Impl : ( () ) ;
    public final void rule__TargetMetamodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1249:1: ( ( () ) )
            // InternalMapping.g:1250:1: ( () )
            {
            // InternalMapping.g:1250:1: ( () )
            // InternalMapping.g:1251:2: ()
            {
             before(grammarAccess.getTargetMetamodelAccess().getTargetMetamodelAction_0()); 
            // InternalMapping.g:1252:2: ()
            // InternalMapping.g:1252:3: 
            {
            }

             after(grammarAccess.getTargetMetamodelAccess().getTargetMetamodelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMetamodel__Group__0__Impl"


    // $ANTLR start "rule__TargetMetamodel__Group__1"
    // InternalMapping.g:1260:1: rule__TargetMetamodel__Group__1 : rule__TargetMetamodel__Group__1__Impl rule__TargetMetamodel__Group__2 ;
    public final void rule__TargetMetamodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1264:1: ( rule__TargetMetamodel__Group__1__Impl rule__TargetMetamodel__Group__2 )
            // InternalMapping.g:1265:2: rule__TargetMetamodel__Group__1__Impl rule__TargetMetamodel__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__TargetMetamodel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetMetamodel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMetamodel__Group__1"


    // $ANTLR start "rule__TargetMetamodel__Group__1__Impl"
    // InternalMapping.g:1272:1: rule__TargetMetamodel__Group__1__Impl : ( ( rule__TargetMetamodel__NameAssignment_1 )? ) ;
    public final void rule__TargetMetamodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1276:1: ( ( ( rule__TargetMetamodel__NameAssignment_1 )? ) )
            // InternalMapping.g:1277:1: ( ( rule__TargetMetamodel__NameAssignment_1 )? )
            {
            // InternalMapping.g:1277:1: ( ( rule__TargetMetamodel__NameAssignment_1 )? )
            // InternalMapping.g:1278:2: ( rule__TargetMetamodel__NameAssignment_1 )?
            {
             before(grammarAccess.getTargetMetamodelAccess().getNameAssignment_1()); 
            // InternalMapping.g:1279:2: ( rule__TargetMetamodel__NameAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>=RULE_STRING && LA12_1<=RULE_ID)) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalMapping.g:1279:3: rule__TargetMetamodel__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TargetMetamodel__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTargetMetamodelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMetamodel__Group__1__Impl"


    // $ANTLR start "rule__TargetMetamodel__Group__2"
    // InternalMapping.g:1287:1: rule__TargetMetamodel__Group__2 : rule__TargetMetamodel__Group__2__Impl ;
    public final void rule__TargetMetamodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1291:1: ( rule__TargetMetamodel__Group__2__Impl )
            // InternalMapping.g:1292:2: rule__TargetMetamodel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetMetamodel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMetamodel__Group__2"


    // $ANTLR start "rule__TargetMetamodel__Group__2__Impl"
    // InternalMapping.g:1298:1: rule__TargetMetamodel__Group__2__Impl : ( ( rule__TargetMetamodel__ModelAssignment_2 ) ) ;
    public final void rule__TargetMetamodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1302:1: ( ( ( rule__TargetMetamodel__ModelAssignment_2 ) ) )
            // InternalMapping.g:1303:1: ( ( rule__TargetMetamodel__ModelAssignment_2 ) )
            {
            // InternalMapping.g:1303:1: ( ( rule__TargetMetamodel__ModelAssignment_2 ) )
            // InternalMapping.g:1304:2: ( rule__TargetMetamodel__ModelAssignment_2 )
            {
             before(grammarAccess.getTargetMetamodelAccess().getModelAssignment_2()); 
            // InternalMapping.g:1305:2: ( rule__TargetMetamodel__ModelAssignment_2 )
            // InternalMapping.g:1305:3: rule__TargetMetamodel__ModelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TargetMetamodel__ModelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTargetMetamodelAccess().getModelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMetamodel__Group__2__Impl"


    // $ANTLR start "rule__MappingRule__Group__0"
    // InternalMapping.g:1314:1: rule__MappingRule__Group__0 : rule__MappingRule__Group__0__Impl rule__MappingRule__Group__1 ;
    public final void rule__MappingRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1318:1: ( rule__MappingRule__Group__0__Impl rule__MappingRule__Group__1 )
            // InternalMapping.g:1319:2: rule__MappingRule__Group__0__Impl rule__MappingRule__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__0"


    // $ANTLR start "rule__MappingRule__Group__0__Impl"
    // InternalMapping.g:1326:1: rule__MappingRule__Group__0__Impl : ( () ) ;
    public final void rule__MappingRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1330:1: ( ( () ) )
            // InternalMapping.g:1331:1: ( () )
            {
            // InternalMapping.g:1331:1: ( () )
            // InternalMapping.g:1332:2: ()
            {
             before(grammarAccess.getMappingRuleAccess().getMappingRuleAction_0()); 
            // InternalMapping.g:1333:2: ()
            // InternalMapping.g:1333:3: 
            {
            }

             after(grammarAccess.getMappingRuleAccess().getMappingRuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__0__Impl"


    // $ANTLR start "rule__MappingRule__Group__1"
    // InternalMapping.g:1341:1: rule__MappingRule__Group__1 : rule__MappingRule__Group__1__Impl rule__MappingRule__Group__2 ;
    public final void rule__MappingRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1345:1: ( rule__MappingRule__Group__1__Impl rule__MappingRule__Group__2 )
            // InternalMapping.g:1346:2: rule__MappingRule__Group__1__Impl rule__MappingRule__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__1"


    // $ANTLR start "rule__MappingRule__Group__1__Impl"
    // InternalMapping.g:1353:1: rule__MappingRule__Group__1__Impl : ( ( 'MappingRule' )? ) ;
    public final void rule__MappingRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1357:1: ( ( ( 'MappingRule' )? ) )
            // InternalMapping.g:1358:1: ( ( 'MappingRule' )? )
            {
            // InternalMapping.g:1358:1: ( ( 'MappingRule' )? )
            // InternalMapping.g:1359:2: ( 'MappingRule' )?
            {
             before(grammarAccess.getMappingRuleAccess().getMappingRuleKeyword_1()); 
            // InternalMapping.g:1360:2: ( 'MappingRule' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMapping.g:1360:3: 'MappingRule'
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getMappingRuleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__1__Impl"


    // $ANTLR start "rule__MappingRule__Group__2"
    // InternalMapping.g:1368:1: rule__MappingRule__Group__2 : rule__MappingRule__Group__2__Impl rule__MappingRule__Group__3 ;
    public final void rule__MappingRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1372:1: ( rule__MappingRule__Group__2__Impl rule__MappingRule__Group__3 )
            // InternalMapping.g:1373:2: rule__MappingRule__Group__2__Impl rule__MappingRule__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__2"


    // $ANTLR start "rule__MappingRule__Group__2__Impl"
    // InternalMapping.g:1380:1: rule__MappingRule__Group__2__Impl : ( ( rule__MappingRule__NameAssignment_2 )? ) ;
    public final void rule__MappingRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1384:1: ( ( ( rule__MappingRule__NameAssignment_2 )? ) )
            // InternalMapping.g:1385:1: ( ( rule__MappingRule__NameAssignment_2 )? )
            {
            // InternalMapping.g:1385:1: ( ( rule__MappingRule__NameAssignment_2 )? )
            // InternalMapping.g:1386:2: ( rule__MappingRule__NameAssignment_2 )?
            {
             before(grammarAccess.getMappingRuleAccess().getNameAssignment_2()); 
            // InternalMapping.g:1387:2: ( rule__MappingRule__NameAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMapping.g:1387:3: rule__MappingRule__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__NameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__2__Impl"


    // $ANTLR start "rule__MappingRule__Group__3"
    // InternalMapping.g:1395:1: rule__MappingRule__Group__3 : rule__MappingRule__Group__3__Impl rule__MappingRule__Group__4 ;
    public final void rule__MappingRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1399:1: ( rule__MappingRule__Group__3__Impl rule__MappingRule__Group__4 )
            // InternalMapping.g:1400:2: rule__MappingRule__Group__3__Impl rule__MappingRule__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__3"


    // $ANTLR start "rule__MappingRule__Group__3__Impl"
    // InternalMapping.g:1407:1: rule__MappingRule__Group__3__Impl : ( ( rule__MappingRule__VarAssignment_3 )? ) ;
    public final void rule__MappingRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1411:1: ( ( ( rule__MappingRule__VarAssignment_3 )? ) )
            // InternalMapping.g:1412:1: ( ( rule__MappingRule__VarAssignment_3 )? )
            {
            // InternalMapping.g:1412:1: ( ( rule__MappingRule__VarAssignment_3 )? )
            // InternalMapping.g:1413:2: ( rule__MappingRule__VarAssignment_3 )?
            {
             before(grammarAccess.getMappingRuleAccess().getVarAssignment_3()); 
            // InternalMapping.g:1414:2: ( rule__MappingRule__VarAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMapping.g:1414:3: rule__MappingRule__VarAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__VarAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getVarAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__3__Impl"


    // $ANTLR start "rule__MappingRule__Group__4"
    // InternalMapping.g:1422:1: rule__MappingRule__Group__4 : rule__MappingRule__Group__4__Impl rule__MappingRule__Group__5 ;
    public final void rule__MappingRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1426:1: ( rule__MappingRule__Group__4__Impl rule__MappingRule__Group__5 )
            // InternalMapping.g:1427:2: rule__MappingRule__Group__4__Impl rule__MappingRule__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__4"


    // $ANTLR start "rule__MappingRule__Group__4__Impl"
    // InternalMapping.g:1434:1: rule__MappingRule__Group__4__Impl : ( ( rule__MappingRule__Group_4__0 )? ) ;
    public final void rule__MappingRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1438:1: ( ( ( rule__MappingRule__Group_4__0 )? ) )
            // InternalMapping.g:1439:1: ( ( rule__MappingRule__Group_4__0 )? )
            {
            // InternalMapping.g:1439:1: ( ( rule__MappingRule__Group_4__0 )? )
            // InternalMapping.g:1440:2: ( rule__MappingRule__Group_4__0 )?
            {
             before(grammarAccess.getMappingRuleAccess().getGroup_4()); 
            // InternalMapping.g:1441:2: ( rule__MappingRule__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMapping.g:1441:3: rule__MappingRule__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__4__Impl"


    // $ANTLR start "rule__MappingRule__Group__5"
    // InternalMapping.g:1449:1: rule__MappingRule__Group__5 : rule__MappingRule__Group__5__Impl rule__MappingRule__Group__6 ;
    public final void rule__MappingRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1453:1: ( rule__MappingRule__Group__5__Impl rule__MappingRule__Group__6 )
            // InternalMapping.g:1454:2: rule__MappingRule__Group__5__Impl rule__MappingRule__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__5"


    // $ANTLR start "rule__MappingRule__Group__5__Impl"
    // InternalMapping.g:1461:1: rule__MappingRule__Group__5__Impl : ( ( rule__MappingRule__Group_5__0 )? ) ;
    public final void rule__MappingRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1465:1: ( ( ( rule__MappingRule__Group_5__0 )? ) )
            // InternalMapping.g:1466:1: ( ( rule__MappingRule__Group_5__0 )? )
            {
            // InternalMapping.g:1466:1: ( ( rule__MappingRule__Group_5__0 )? )
            // InternalMapping.g:1467:2: ( rule__MappingRule__Group_5__0 )?
            {
             before(grammarAccess.getMappingRuleAccess().getGroup_5()); 
            // InternalMapping.g:1468:2: ( rule__MappingRule__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||LA17_0==11) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMapping.g:1468:3: rule__MappingRule__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__5__Impl"


    // $ANTLR start "rule__MappingRule__Group__6"
    // InternalMapping.g:1476:1: rule__MappingRule__Group__6 : rule__MappingRule__Group__6__Impl rule__MappingRule__Group__7 ;
    public final void rule__MappingRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1480:1: ( rule__MappingRule__Group__6__Impl rule__MappingRule__Group__7 )
            // InternalMapping.g:1481:2: rule__MappingRule__Group__6__Impl rule__MappingRule__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__6"


    // $ANTLR start "rule__MappingRule__Group__6__Impl"
    // InternalMapping.g:1488:1: rule__MappingRule__Group__6__Impl : ( ( rule__MappingRule__Group_6__0 )? ) ;
    public final void rule__MappingRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1492:1: ( ( ( rule__MappingRule__Group_6__0 )? ) )
            // InternalMapping.g:1493:1: ( ( rule__MappingRule__Group_6__0 )? )
            {
            // InternalMapping.g:1493:1: ( ( rule__MappingRule__Group_6__0 )? )
            // InternalMapping.g:1494:2: ( rule__MappingRule__Group_6__0 )?
            {
             before(grammarAccess.getMappingRuleAccess().getGroup_6()); 
            // InternalMapping.g:1495:2: ( rule__MappingRule__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==12) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMapping.g:1495:3: rule__MappingRule__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__6__Impl"


    // $ANTLR start "rule__MappingRule__Group__7"
    // InternalMapping.g:1503:1: rule__MappingRule__Group__7 : rule__MappingRule__Group__7__Impl rule__MappingRule__Group__8 ;
    public final void rule__MappingRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1507:1: ( rule__MappingRule__Group__7__Impl rule__MappingRule__Group__8 )
            // InternalMapping.g:1508:2: rule__MappingRule__Group__7__Impl rule__MappingRule__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__7"


    // $ANTLR start "rule__MappingRule__Group__7__Impl"
    // InternalMapping.g:1515:1: rule__MappingRule__Group__7__Impl : ( ( rule__MappingRule__Group_7__0 )? ) ;
    public final void rule__MappingRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1519:1: ( ( ( rule__MappingRule__Group_7__0 )? ) )
            // InternalMapping.g:1520:1: ( ( rule__MappingRule__Group_7__0 )? )
            {
            // InternalMapping.g:1520:1: ( ( rule__MappingRule__Group_7__0 )? )
            // InternalMapping.g:1521:2: ( rule__MappingRule__Group_7__0 )?
            {
             before(grammarAccess.getMappingRuleAccess().getGroup_7()); 
            // InternalMapping.g:1522:2: ( rule__MappingRule__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMapping.g:1522:3: rule__MappingRule__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__7__Impl"


    // $ANTLR start "rule__MappingRule__Group__8"
    // InternalMapping.g:1530:1: rule__MappingRule__Group__8 : rule__MappingRule__Group__8__Impl rule__MappingRule__Group__9 ;
    public final void rule__MappingRule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1534:1: ( rule__MappingRule__Group__8__Impl rule__MappingRule__Group__9 )
            // InternalMapping.g:1535:2: rule__MappingRule__Group__8__Impl rule__MappingRule__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__8"


    // $ANTLR start "rule__MappingRule__Group__8__Impl"
    // InternalMapping.g:1542:1: rule__MappingRule__Group__8__Impl : ( ( rule__MappingRule__Group_8__0 )? ) ;
    public final void rule__MappingRule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1546:1: ( ( ( rule__MappingRule__Group_8__0 )? ) )
            // InternalMapping.g:1547:1: ( ( rule__MappingRule__Group_8__0 )? )
            {
            // InternalMapping.g:1547:1: ( ( rule__MappingRule__Group_8__0 )? )
            // InternalMapping.g:1548:2: ( rule__MappingRule__Group_8__0 )?
            {
             before(grammarAccess.getMappingRuleAccess().getGroup_8()); 
            // InternalMapping.g:1549:2: ( rule__MappingRule__Group_8__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMapping.g:1549:3: rule__MappingRule__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__8__Impl"


    // $ANTLR start "rule__MappingRule__Group__9"
    // InternalMapping.g:1557:1: rule__MappingRule__Group__9 : rule__MappingRule__Group__9__Impl rule__MappingRule__Group__10 ;
    public final void rule__MappingRule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1561:1: ( rule__MappingRule__Group__9__Impl rule__MappingRule__Group__10 )
            // InternalMapping.g:1562:2: rule__MappingRule__Group__9__Impl rule__MappingRule__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__9"


    // $ANTLR start "rule__MappingRule__Group__9__Impl"
    // InternalMapping.g:1569:1: rule__MappingRule__Group__9__Impl : ( ( rule__MappingRule__Group_9__0 )? ) ;
    public final void rule__MappingRule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1573:1: ( ( ( rule__MappingRule__Group_9__0 )? ) )
            // InternalMapping.g:1574:1: ( ( rule__MappingRule__Group_9__0 )? )
            {
            // InternalMapping.g:1574:1: ( ( rule__MappingRule__Group_9__0 )? )
            // InternalMapping.g:1575:2: ( rule__MappingRule__Group_9__0 )?
            {
             before(grammarAccess.getMappingRuleAccess().getGroup_9()); 
            // InternalMapping.g:1576:2: ( rule__MappingRule__Group_9__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMapping.g:1576:3: rule__MappingRule__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__9__Impl"


    // $ANTLR start "rule__MappingRule__Group__10"
    // InternalMapping.g:1584:1: rule__MappingRule__Group__10 : rule__MappingRule__Group__10__Impl rule__MappingRule__Group__11 ;
    public final void rule__MappingRule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1588:1: ( rule__MappingRule__Group__10__Impl rule__MappingRule__Group__11 )
            // InternalMapping.g:1589:2: rule__MappingRule__Group__10__Impl rule__MappingRule__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__10"


    // $ANTLR start "rule__MappingRule__Group__10__Impl"
    // InternalMapping.g:1596:1: rule__MappingRule__Group__10__Impl : ( ( rule__MappingRule__Group_10__0 )? ) ;
    public final void rule__MappingRule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1600:1: ( ( ( rule__MappingRule__Group_10__0 )? ) )
            // InternalMapping.g:1601:1: ( ( rule__MappingRule__Group_10__0 )? )
            {
            // InternalMapping.g:1601:1: ( ( rule__MappingRule__Group_10__0 )? )
            // InternalMapping.g:1602:2: ( rule__MappingRule__Group_10__0 )?
            {
             before(grammarAccess.getMappingRuleAccess().getGroup_10()); 
            // InternalMapping.g:1603:2: ( rule__MappingRule__Group_10__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                int LA22_1 = input.LA(2);

                if ( ((LA22_1>=RULE_STRING && LA22_1<=RULE_ID)||(LA22_1>=11 && LA22_1<=12)||(LA22_1>=17 && LA22_1<=18)||(LA22_1>=23 && LA22_1<=25)||(LA22_1>=27 && LA22_1<=29)||LA22_1==33) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // InternalMapping.g:1603:3: rule__MappingRule__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__10__Impl"


    // $ANTLR start "rule__MappingRule__Group__11"
    // InternalMapping.g:1611:1: rule__MappingRule__Group__11 : rule__MappingRule__Group__11__Impl ;
    public final void rule__MappingRule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1615:1: ( rule__MappingRule__Group__11__Impl )
            // InternalMapping.g:1616:2: rule__MappingRule__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__11"


    // $ANTLR start "rule__MappingRule__Group__11__Impl"
    // InternalMapping.g:1622:1: rule__MappingRule__Group__11__Impl : ( ( rule__MappingRule__Group_11__0 )? ) ;
    public final void rule__MappingRule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1626:1: ( ( ( rule__MappingRule__Group_11__0 )? ) )
            // InternalMapping.g:1627:1: ( ( rule__MappingRule__Group_11__0 )? )
            {
            // InternalMapping.g:1627:1: ( ( rule__MappingRule__Group_11__0 )? )
            // InternalMapping.g:1628:2: ( rule__MappingRule__Group_11__0 )?
            {
             before(grammarAccess.getMappingRuleAccess().getGroup_11()); 
            // InternalMapping.g:1629:2: ( rule__MappingRule__Group_11__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMapping.g:1629:3: rule__MappingRule__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group__11__Impl"


    // $ANTLR start "rule__MappingRule__Group_4__0"
    // InternalMapping.g:1638:1: rule__MappingRule__Group_4__0 : rule__MappingRule__Group_4__0__Impl rule__MappingRule__Group_4__1 ;
    public final void rule__MappingRule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1642:1: ( rule__MappingRule__Group_4__0__Impl rule__MappingRule__Group_4__1 )
            // InternalMapping.g:1643:2: rule__MappingRule__Group_4__0__Impl rule__MappingRule__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__MappingRule__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_4__0"


    // $ANTLR start "rule__MappingRule__Group_4__0__Impl"
    // InternalMapping.g:1650:1: rule__MappingRule__Group_4__0__Impl : ( 'identifier' ) ;
    public final void rule__MappingRule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1654:1: ( ( 'identifier' ) )
            // InternalMapping.g:1655:1: ( 'identifier' )
            {
            // InternalMapping.g:1655:1: ( 'identifier' )
            // InternalMapping.g:1656:2: 'identifier'
            {
             before(grammarAccess.getMappingRuleAccess().getIdentifierKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getIdentifierKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_4__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_4__1"
    // InternalMapping.g:1665:1: rule__MappingRule__Group_4__1 : rule__MappingRule__Group_4__1__Impl ;
    public final void rule__MappingRule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1669:1: ( rule__MappingRule__Group_4__1__Impl )
            // InternalMapping.g:1670:2: rule__MappingRule__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_4__1"


    // $ANTLR start "rule__MappingRule__Group_4__1__Impl"
    // InternalMapping.g:1676:1: rule__MappingRule__Group_4__1__Impl : ( ( rule__MappingRule__IdentifierAssignment_4_1 ) ) ;
    public final void rule__MappingRule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1680:1: ( ( ( rule__MappingRule__IdentifierAssignment_4_1 ) ) )
            // InternalMapping.g:1681:1: ( ( rule__MappingRule__IdentifierAssignment_4_1 ) )
            {
            // InternalMapping.g:1681:1: ( ( rule__MappingRule__IdentifierAssignment_4_1 ) )
            // InternalMapping.g:1682:2: ( rule__MappingRule__IdentifierAssignment_4_1 )
            {
             before(grammarAccess.getMappingRuleAccess().getIdentifierAssignment_4_1()); 
            // InternalMapping.g:1683:2: ( rule__MappingRule__IdentifierAssignment_4_1 )
            // InternalMapping.g:1683:3: rule__MappingRule__IdentifierAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__IdentifierAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getIdentifierAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_4__1__Impl"


    // $ANTLR start "rule__MappingRule__Group_5__0"
    // InternalMapping.g:1692:1: rule__MappingRule__Group_5__0 : rule__MappingRule__Group_5__0__Impl rule__MappingRule__Group_5__1 ;
    public final void rule__MappingRule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1696:1: ( rule__MappingRule__Group_5__0__Impl rule__MappingRule__Group_5__1 )
            // InternalMapping.g:1697:2: rule__MappingRule__Group_5__0__Impl rule__MappingRule__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__MappingRule__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_5__0"


    // $ANTLR start "rule__MappingRule__Group_5__0__Impl"
    // InternalMapping.g:1704:1: rule__MappingRule__Group_5__0__Impl : ( ( rule__MappingRule__Alternatives_5_0 ) ) ;
    public final void rule__MappingRule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1708:1: ( ( ( rule__MappingRule__Alternatives_5_0 ) ) )
            // InternalMapping.g:1709:1: ( ( rule__MappingRule__Alternatives_5_0 ) )
            {
            // InternalMapping.g:1709:1: ( ( rule__MappingRule__Alternatives_5_0 ) )
            // InternalMapping.g:1710:2: ( rule__MappingRule__Alternatives_5_0 )
            {
             before(grammarAccess.getMappingRuleAccess().getAlternatives_5_0()); 
            // InternalMapping.g:1711:2: ( rule__MappingRule__Alternatives_5_0 )
            // InternalMapping.g:1711:3: rule__MappingRule__Alternatives_5_0
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Alternatives_5_0();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getAlternatives_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_5__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_5__1"
    // InternalMapping.g:1719:1: rule__MappingRule__Group_5__1 : rule__MappingRule__Group_5__1__Impl ;
    public final void rule__MappingRule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1723:1: ( rule__MappingRule__Group_5__1__Impl )
            // InternalMapping.g:1724:2: rule__MappingRule__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_5__1"


    // $ANTLR start "rule__MappingRule__Group_5__1__Impl"
    // InternalMapping.g:1730:1: rule__MappingRule__Group_5__1__Impl : ( ( rule__MappingRule__Group_5_1__0 )? ) ;
    public final void rule__MappingRule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1734:1: ( ( ( rule__MappingRule__Group_5_1__0 )? ) )
            // InternalMapping.g:1735:1: ( ( rule__MappingRule__Group_5_1__0 )? )
            {
            // InternalMapping.g:1735:1: ( ( rule__MappingRule__Group_5_1__0 )? )
            // InternalMapping.g:1736:2: ( rule__MappingRule__Group_5_1__0 )?
            {
             before(grammarAccess.getMappingRuleAccess().getGroup_5_1()); 
            // InternalMapping.g:1737:2: ( rule__MappingRule__Group_5_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMapping.g:1737:3: rule__MappingRule__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MappingRule__Group_5_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRuleAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_5__1__Impl"


    // $ANTLR start "rule__MappingRule__Group_5_0_0__0"
    // InternalMapping.g:1746:1: rule__MappingRule__Group_5_0_0__0 : rule__MappingRule__Group_5_0_0__0__Impl rule__MappingRule__Group_5_0_0__1 ;
    public final void rule__MappingRule__Group_5_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1750:1: ( rule__MappingRule__Group_5_0_0__0__Impl rule__MappingRule__Group_5_0_0__1 )
            // InternalMapping.g:1751:2: rule__MappingRule__Group_5_0_0__0__Impl rule__MappingRule__Group_5_0_0__1
            {
            pushFollow(FOLLOW_11);
            rule__MappingRule__Group_5_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_5_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_5_0_0__0"


    // $ANTLR start "rule__MappingRule__Group_5_0_0__0__Impl"
    // InternalMapping.g:1758:1: rule__MappingRule__Group_5_0_0__0__Impl : ( 'source' ) ;
    public final void rule__MappingRule__Group_5_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1762:1: ( ( 'source' ) )
            // InternalMapping.g:1763:1: ( 'source' )
            {
            // InternalMapping.g:1763:1: ( 'source' )
            // InternalMapping.g:1764:2: 'source'
            {
             before(grammarAccess.getMappingRuleAccess().getSourceKeyword_5_0_0_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getSourceKeyword_5_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_5_0_0__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_5_0_0__1"
    // InternalMapping.g:1773:1: rule__MappingRule__Group_5_0_0__1 : rule__MappingRule__Group_5_0_0__1__Impl ;
    public final void rule__MappingRule__Group_5_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1777:1: ( rule__MappingRule__Group_5_0_0__1__Impl )
            // InternalMapping.g:1778:2: rule__MappingRule__Group_5_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_5_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_5_0_0__1"


    // $ANTLR start "rule__MappingRule__Group_5_0_0__1__Impl"
    // InternalMapping.g:1784:1: rule__MappingRule__Group_5_0_0__1__Impl : ( ( rule__MappingRule__SourceAssignment_5_0_0_1 ) ) ;
    public final void rule__MappingRule__Group_5_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1788:1: ( ( ( rule__MappingRule__SourceAssignment_5_0_0_1 ) ) )
            // InternalMapping.g:1789:1: ( ( rule__MappingRule__SourceAssignment_5_0_0_1 ) )
            {
            // InternalMapping.g:1789:1: ( ( rule__MappingRule__SourceAssignment_5_0_0_1 ) )
            // InternalMapping.g:1790:2: ( rule__MappingRule__SourceAssignment_5_0_0_1 )
            {
             before(grammarAccess.getMappingRuleAccess().getSourceAssignment_5_0_0_1()); 
            // InternalMapping.g:1791:2: ( rule__MappingRule__SourceAssignment_5_0_0_1 )
            // InternalMapping.g:1791:3: rule__MappingRule__SourceAssignment_5_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__SourceAssignment_5_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getSourceAssignment_5_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_5_0_0__1__Impl"


    // $ANTLR start "rule__MappingRule__Group_5_1__0"
    // InternalMapping.g:1800:1: rule__MappingRule__Group_5_1__0 : rule__MappingRule__Group_5_1__0__Impl rule__MappingRule__Group_5_1__1 ;
    public final void rule__MappingRule__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1804:1: ( rule__MappingRule__Group_5_1__0__Impl rule__MappingRule__Group_5_1__1 )
            // InternalMapping.g:1805:2: rule__MappingRule__Group_5_1__0__Impl rule__MappingRule__Group_5_1__1
            {
            pushFollow(FOLLOW_16);
            rule__MappingRule__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_5_1__0"


    // $ANTLR start "rule__MappingRule__Group_5_1__0__Impl"
    // InternalMapping.g:1812:1: rule__MappingRule__Group_5_1__0__Impl : ( '::' ) ;
    public final void rule__MappingRule__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1816:1: ( ( '::' ) )
            // InternalMapping.g:1817:1: ( '::' )
            {
            // InternalMapping.g:1817:1: ( '::' )
            // InternalMapping.g:1818:2: '::'
            {
             before(grammarAccess.getMappingRuleAccess().getColonColonKeyword_5_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getColonColonKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_5_1__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_5_1__1"
    // InternalMapping.g:1827:1: rule__MappingRule__Group_5_1__1 : rule__MappingRule__Group_5_1__1__Impl ;
    public final void rule__MappingRule__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1831:1: ( rule__MappingRule__Group_5_1__1__Impl )
            // InternalMapping.g:1832:2: rule__MappingRule__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_5_1__1"


    // $ANTLR start "rule__MappingRule__Group_5_1__1__Impl"
    // InternalMapping.g:1838:1: rule__MappingRule__Group_5_1__1__Impl : ( ( rule__MappingRule__EEnumLiteralAssignment_5_1_1 ) ) ;
    public final void rule__MappingRule__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1842:1: ( ( ( rule__MappingRule__EEnumLiteralAssignment_5_1_1 ) ) )
            // InternalMapping.g:1843:1: ( ( rule__MappingRule__EEnumLiteralAssignment_5_1_1 ) )
            {
            // InternalMapping.g:1843:1: ( ( rule__MappingRule__EEnumLiteralAssignment_5_1_1 ) )
            // InternalMapping.g:1844:2: ( rule__MappingRule__EEnumLiteralAssignment_5_1_1 )
            {
             before(grammarAccess.getMappingRuleAccess().getEEnumLiteralAssignment_5_1_1()); 
            // InternalMapping.g:1845:2: ( rule__MappingRule__EEnumLiteralAssignment_5_1_1 )
            // InternalMapping.g:1845:3: rule__MappingRule__EEnumLiteralAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__EEnumLiteralAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getEEnumLiteralAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_5_1__1__Impl"


    // $ANTLR start "rule__MappingRule__Group_6__0"
    // InternalMapping.g:1854:1: rule__MappingRule__Group_6__0 : rule__MappingRule__Group_6__0__Impl rule__MappingRule__Group_6__1 ;
    public final void rule__MappingRule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1858:1: ( rule__MappingRule__Group_6__0__Impl rule__MappingRule__Group_6__1 )
            // InternalMapping.g:1859:2: rule__MappingRule__Group_6__0__Impl rule__MappingRule__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__MappingRule__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_6__0"


    // $ANTLR start "rule__MappingRule__Group_6__0__Impl"
    // InternalMapping.g:1866:1: rule__MappingRule__Group_6__0__Impl : ( 'target' ) ;
    public final void rule__MappingRule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1870:1: ( ( 'target' ) )
            // InternalMapping.g:1871:1: ( 'target' )
            {
            // InternalMapping.g:1871:1: ( 'target' )
            // InternalMapping.g:1872:2: 'target'
            {
             before(grammarAccess.getMappingRuleAccess().getTargetKeyword_6_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getTargetKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_6__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_6__1"
    // InternalMapping.g:1881:1: rule__MappingRule__Group_6__1 : rule__MappingRule__Group_6__1__Impl ;
    public final void rule__MappingRule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1885:1: ( rule__MappingRule__Group_6__1__Impl )
            // InternalMapping.g:1886:2: rule__MappingRule__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_6__1"


    // $ANTLR start "rule__MappingRule__Group_6__1__Impl"
    // InternalMapping.g:1892:1: rule__MappingRule__Group_6__1__Impl : ( ( rule__MappingRule__TargetAssignment_6_1 ) ) ;
    public final void rule__MappingRule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1896:1: ( ( ( rule__MappingRule__TargetAssignment_6_1 ) ) )
            // InternalMapping.g:1897:1: ( ( rule__MappingRule__TargetAssignment_6_1 ) )
            {
            // InternalMapping.g:1897:1: ( ( rule__MappingRule__TargetAssignment_6_1 ) )
            // InternalMapping.g:1898:2: ( rule__MappingRule__TargetAssignment_6_1 )
            {
             before(grammarAccess.getMappingRuleAccess().getTargetAssignment_6_1()); 
            // InternalMapping.g:1899:2: ( rule__MappingRule__TargetAssignment_6_1 )
            // InternalMapping.g:1899:3: rule__MappingRule__TargetAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__TargetAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getTargetAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_6__1__Impl"


    // $ANTLR start "rule__MappingRule__Group_7__0"
    // InternalMapping.g:1908:1: rule__MappingRule__Group_7__0 : rule__MappingRule__Group_7__0__Impl rule__MappingRule__Group_7__1 ;
    public final void rule__MappingRule__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1912:1: ( rule__MappingRule__Group_7__0__Impl rule__MappingRule__Group_7__1 )
            // InternalMapping.g:1913:2: rule__MappingRule__Group_7__0__Impl rule__MappingRule__Group_7__1
            {
            pushFollow(FOLLOW_17);
            rule__MappingRule__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_7__0"


    // $ANTLR start "rule__MappingRule__Group_7__0__Impl"
    // InternalMapping.g:1920:1: rule__MappingRule__Group_7__0__Impl : ( 'operator' ) ;
    public final void rule__MappingRule__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1924:1: ( ( 'operator' ) )
            // InternalMapping.g:1925:1: ( 'operator' )
            {
            // InternalMapping.g:1925:1: ( 'operator' )
            // InternalMapping.g:1926:2: 'operator'
            {
             before(grammarAccess.getMappingRuleAccess().getOperatorKeyword_7_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getOperatorKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_7__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_7__1"
    // InternalMapping.g:1935:1: rule__MappingRule__Group_7__1 : rule__MappingRule__Group_7__1__Impl ;
    public final void rule__MappingRule__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1939:1: ( rule__MappingRule__Group_7__1__Impl )
            // InternalMapping.g:1940:2: rule__MappingRule__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_7__1"


    // $ANTLR start "rule__MappingRule__Group_7__1__Impl"
    // InternalMapping.g:1946:1: rule__MappingRule__Group_7__1__Impl : ( ( rule__MappingRule__OperatorAssignment_7_1 ) ) ;
    public final void rule__MappingRule__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1950:1: ( ( ( rule__MappingRule__OperatorAssignment_7_1 ) ) )
            // InternalMapping.g:1951:1: ( ( rule__MappingRule__OperatorAssignment_7_1 ) )
            {
            // InternalMapping.g:1951:1: ( ( rule__MappingRule__OperatorAssignment_7_1 ) )
            // InternalMapping.g:1952:2: ( rule__MappingRule__OperatorAssignment_7_1 )
            {
             before(grammarAccess.getMappingRuleAccess().getOperatorAssignment_7_1()); 
            // InternalMapping.g:1953:2: ( rule__MappingRule__OperatorAssignment_7_1 )
            // InternalMapping.g:1953:3: rule__MappingRule__OperatorAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__OperatorAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getOperatorAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_7__1__Impl"


    // $ANTLR start "rule__MappingRule__Group_8__0"
    // InternalMapping.g:1962:1: rule__MappingRule__Group_8__0 : rule__MappingRule__Group_8__0__Impl rule__MappingRule__Group_8__1 ;
    public final void rule__MappingRule__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1966:1: ( rule__MappingRule__Group_8__0__Impl rule__MappingRule__Group_8__1 )
            // InternalMapping.g:1967:2: rule__MappingRule__Group_8__0__Impl rule__MappingRule__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__MappingRule__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_8__0"


    // $ANTLR start "rule__MappingRule__Group_8__0__Impl"
    // InternalMapping.g:1974:1: rule__MappingRule__Group_8__0__Impl : ( 'condition' ) ;
    public final void rule__MappingRule__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1978:1: ( ( 'condition' ) )
            // InternalMapping.g:1979:1: ( 'condition' )
            {
            // InternalMapping.g:1979:1: ( 'condition' )
            // InternalMapping.g:1980:2: 'condition'
            {
             before(grammarAccess.getMappingRuleAccess().getConditionKeyword_8_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getConditionKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_8__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_8__1"
    // InternalMapping.g:1989:1: rule__MappingRule__Group_8__1 : rule__MappingRule__Group_8__1__Impl ;
    public final void rule__MappingRule__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:1993:1: ( rule__MappingRule__Group_8__1__Impl )
            // InternalMapping.g:1994:2: rule__MappingRule__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_8__1"


    // $ANTLR start "rule__MappingRule__Group_8__1__Impl"
    // InternalMapping.g:2000:1: rule__MappingRule__Group_8__1__Impl : ( ( rule__MappingRule__ConditionAssignment_8_1 ) ) ;
    public final void rule__MappingRule__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2004:1: ( ( ( rule__MappingRule__ConditionAssignment_8_1 ) ) )
            // InternalMapping.g:2005:1: ( ( rule__MappingRule__ConditionAssignment_8_1 ) )
            {
            // InternalMapping.g:2005:1: ( ( rule__MappingRule__ConditionAssignment_8_1 ) )
            // InternalMapping.g:2006:2: ( rule__MappingRule__ConditionAssignment_8_1 )
            {
             before(grammarAccess.getMappingRuleAccess().getConditionAssignment_8_1()); 
            // InternalMapping.g:2007:2: ( rule__MappingRule__ConditionAssignment_8_1 )
            // InternalMapping.g:2007:3: rule__MappingRule__ConditionAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__ConditionAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getConditionAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_8__1__Impl"


    // $ANTLR start "rule__MappingRule__Group_9__0"
    // InternalMapping.g:2016:1: rule__MappingRule__Group_9__0 : rule__MappingRule__Group_9__0__Impl rule__MappingRule__Group_9__1 ;
    public final void rule__MappingRule__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2020:1: ( rule__MappingRule__Group_9__0__Impl rule__MappingRule__Group_9__1 )
            // InternalMapping.g:2021:2: rule__MappingRule__Group_9__0__Impl rule__MappingRule__Group_9__1
            {
            pushFollow(FOLLOW_6);
            rule__MappingRule__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_9__0"


    // $ANTLR start "rule__MappingRule__Group_9__0__Impl"
    // InternalMapping.g:2028:1: rule__MappingRule__Group_9__0__Impl : ( 'comment' ) ;
    public final void rule__MappingRule__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2032:1: ( ( 'comment' ) )
            // InternalMapping.g:2033:1: ( 'comment' )
            {
            // InternalMapping.g:2033:1: ( 'comment' )
            // InternalMapping.g:2034:2: 'comment'
            {
             before(grammarAccess.getMappingRuleAccess().getCommentKeyword_9_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getCommentKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_9__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_9__1"
    // InternalMapping.g:2043:1: rule__MappingRule__Group_9__1 : rule__MappingRule__Group_9__1__Impl ;
    public final void rule__MappingRule__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2047:1: ( rule__MappingRule__Group_9__1__Impl )
            // InternalMapping.g:2048:2: rule__MappingRule__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_9__1"


    // $ANTLR start "rule__MappingRule__Group_9__1__Impl"
    // InternalMapping.g:2054:1: rule__MappingRule__Group_9__1__Impl : ( ( rule__MappingRule__CommentAssignment_9_1 ) ) ;
    public final void rule__MappingRule__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2058:1: ( ( ( rule__MappingRule__CommentAssignment_9_1 ) ) )
            // InternalMapping.g:2059:1: ( ( rule__MappingRule__CommentAssignment_9_1 ) )
            {
            // InternalMapping.g:2059:1: ( ( rule__MappingRule__CommentAssignment_9_1 ) )
            // InternalMapping.g:2060:2: ( rule__MappingRule__CommentAssignment_9_1 )
            {
             before(grammarAccess.getMappingRuleAccess().getCommentAssignment_9_1()); 
            // InternalMapping.g:2061:2: ( rule__MappingRule__CommentAssignment_9_1 )
            // InternalMapping.g:2061:3: rule__MappingRule__CommentAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__CommentAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getCommentAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_9__1__Impl"


    // $ANTLR start "rule__MappingRule__Group_10__0"
    // InternalMapping.g:2070:1: rule__MappingRule__Group_10__0 : rule__MappingRule__Group_10__0__Impl rule__MappingRule__Group_10__1 ;
    public final void rule__MappingRule__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2074:1: ( rule__MappingRule__Group_10__0__Impl rule__MappingRule__Group_10__1 )
            // InternalMapping.g:2075:2: rule__MappingRule__Group_10__0__Impl rule__MappingRule__Group_10__1
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_10__0"


    // $ANTLR start "rule__MappingRule__Group_10__0__Impl"
    // InternalMapping.g:2082:1: rule__MappingRule__Group_10__0__Impl : ( '{' ) ;
    public final void rule__MappingRule__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2086:1: ( ( '{' ) )
            // InternalMapping.g:2087:1: ( '{' )
            {
            // InternalMapping.g:2087:1: ( '{' )
            // InternalMapping.g:2088:2: '{'
            {
             before(grammarAccess.getMappingRuleAccess().getLeftCurlyBracketKeyword_10_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getLeftCurlyBracketKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_10__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_10__1"
    // InternalMapping.g:2097:1: rule__MappingRule__Group_10__1 : rule__MappingRule__Group_10__1__Impl rule__MappingRule__Group_10__2 ;
    public final void rule__MappingRule__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2101:1: ( rule__MappingRule__Group_10__1__Impl rule__MappingRule__Group_10__2 )
            // InternalMapping.g:2102:2: rule__MappingRule__Group_10__1__Impl rule__MappingRule__Group_10__2
            {
            pushFollow(FOLLOW_13);
            rule__MappingRule__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_10__1"


    // $ANTLR start "rule__MappingRule__Group_10__1__Impl"
    // InternalMapping.g:2109:1: rule__MappingRule__Group_10__1__Impl : ( ( rule__MappingRule__ChildRulesAssignment_10_1 ) ) ;
    public final void rule__MappingRule__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2113:1: ( ( ( rule__MappingRule__ChildRulesAssignment_10_1 ) ) )
            // InternalMapping.g:2114:1: ( ( rule__MappingRule__ChildRulesAssignment_10_1 ) )
            {
            // InternalMapping.g:2114:1: ( ( rule__MappingRule__ChildRulesAssignment_10_1 ) )
            // InternalMapping.g:2115:2: ( rule__MappingRule__ChildRulesAssignment_10_1 )
            {
             before(grammarAccess.getMappingRuleAccess().getChildRulesAssignment_10_1()); 
            // InternalMapping.g:2116:2: ( rule__MappingRule__ChildRulesAssignment_10_1 )
            // InternalMapping.g:2116:3: rule__MappingRule__ChildRulesAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__ChildRulesAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getChildRulesAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_10__1__Impl"


    // $ANTLR start "rule__MappingRule__Group_10__2"
    // InternalMapping.g:2124:1: rule__MappingRule__Group_10__2 : rule__MappingRule__Group_10__2__Impl rule__MappingRule__Group_10__3 ;
    public final void rule__MappingRule__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2128:1: ( rule__MappingRule__Group_10__2__Impl rule__MappingRule__Group_10__3 )
            // InternalMapping.g:2129:2: rule__MappingRule__Group_10__2__Impl rule__MappingRule__Group_10__3
            {
            pushFollow(FOLLOW_13);
            rule__MappingRule__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_10__2"


    // $ANTLR start "rule__MappingRule__Group_10__2__Impl"
    // InternalMapping.g:2136:1: rule__MappingRule__Group_10__2__Impl : ( ( rule__MappingRule__Group_10_2__0 )* ) ;
    public final void rule__MappingRule__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2140:1: ( ( ( rule__MappingRule__Group_10_2__0 )* ) )
            // InternalMapping.g:2141:1: ( ( rule__MappingRule__Group_10_2__0 )* )
            {
            // InternalMapping.g:2141:1: ( ( rule__MappingRule__Group_10_2__0 )* )
            // InternalMapping.g:2142:2: ( rule__MappingRule__Group_10_2__0 )*
            {
             before(grammarAccess.getMappingRuleAccess().getGroup_10_2()); 
            // InternalMapping.g:2143:2: ( rule__MappingRule__Group_10_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==23) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMapping.g:2143:3: rule__MappingRule__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__MappingRule__Group_10_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getMappingRuleAccess().getGroup_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_10__2__Impl"


    // $ANTLR start "rule__MappingRule__Group_10__3"
    // InternalMapping.g:2151:1: rule__MappingRule__Group_10__3 : rule__MappingRule__Group_10__3__Impl ;
    public final void rule__MappingRule__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2155:1: ( rule__MappingRule__Group_10__3__Impl )
            // InternalMapping.g:2156:2: rule__MappingRule__Group_10__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_10__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_10__3"


    // $ANTLR start "rule__MappingRule__Group_10__3__Impl"
    // InternalMapping.g:2162:1: rule__MappingRule__Group_10__3__Impl : ( '}' ) ;
    public final void rule__MappingRule__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2166:1: ( ( '}' ) )
            // InternalMapping.g:2167:1: ( '}' )
            {
            // InternalMapping.g:2167:1: ( '}' )
            // InternalMapping.g:2168:2: '}'
            {
             before(grammarAccess.getMappingRuleAccess().getRightCurlyBracketKeyword_10_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getRightCurlyBracketKeyword_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_10__3__Impl"


    // $ANTLR start "rule__MappingRule__Group_10_2__0"
    // InternalMapping.g:2178:1: rule__MappingRule__Group_10_2__0 : rule__MappingRule__Group_10_2__0__Impl rule__MappingRule__Group_10_2__1 ;
    public final void rule__MappingRule__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2182:1: ( rule__MappingRule__Group_10_2__0__Impl rule__MappingRule__Group_10_2__1 )
            // InternalMapping.g:2183:2: rule__MappingRule__Group_10_2__0__Impl rule__MappingRule__Group_10_2__1
            {
            pushFollow(FOLLOW_12);
            rule__MappingRule__Group_10_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_10_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_10_2__0"


    // $ANTLR start "rule__MappingRule__Group_10_2__0__Impl"
    // InternalMapping.g:2190:1: rule__MappingRule__Group_10_2__0__Impl : ( ';' ) ;
    public final void rule__MappingRule__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2194:1: ( ( ';' ) )
            // InternalMapping.g:2195:1: ( ';' )
            {
            // InternalMapping.g:2195:1: ( ';' )
            // InternalMapping.g:2196:2: ';'
            {
             before(grammarAccess.getMappingRuleAccess().getSemicolonKeyword_10_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getSemicolonKeyword_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_10_2__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_10_2__1"
    // InternalMapping.g:2205:1: rule__MappingRule__Group_10_2__1 : rule__MappingRule__Group_10_2__1__Impl ;
    public final void rule__MappingRule__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2209:1: ( rule__MappingRule__Group_10_2__1__Impl )
            // InternalMapping.g:2210:2: rule__MappingRule__Group_10_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_10_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_10_2__1"


    // $ANTLR start "rule__MappingRule__Group_10_2__1__Impl"
    // InternalMapping.g:2216:1: rule__MappingRule__Group_10_2__1__Impl : ( ( rule__MappingRule__ChildRulesAssignment_10_2_1 ) ) ;
    public final void rule__MappingRule__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2220:1: ( ( ( rule__MappingRule__ChildRulesAssignment_10_2_1 ) ) )
            // InternalMapping.g:2221:1: ( ( rule__MappingRule__ChildRulesAssignment_10_2_1 ) )
            {
            // InternalMapping.g:2221:1: ( ( rule__MappingRule__ChildRulesAssignment_10_2_1 ) )
            // InternalMapping.g:2222:2: ( rule__MappingRule__ChildRulesAssignment_10_2_1 )
            {
             before(grammarAccess.getMappingRuleAccess().getChildRulesAssignment_10_2_1()); 
            // InternalMapping.g:2223:2: ( rule__MappingRule__ChildRulesAssignment_10_2_1 )
            // InternalMapping.g:2223:3: rule__MappingRule__ChildRulesAssignment_10_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__ChildRulesAssignment_10_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getChildRulesAssignment_10_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_10_2__1__Impl"


    // $ANTLR start "rule__MappingRule__Group_11__0"
    // InternalMapping.g:2232:1: rule__MappingRule__Group_11__0 : rule__MappingRule__Group_11__0__Impl rule__MappingRule__Group_11__1 ;
    public final void rule__MappingRule__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2236:1: ( rule__MappingRule__Group_11__0__Impl rule__MappingRule__Group_11__1 )
            // InternalMapping.g:2237:2: rule__MappingRule__Group_11__0__Impl rule__MappingRule__Group_11__1
            {
            pushFollow(FOLLOW_18);
            rule__MappingRule__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_11__0"


    // $ANTLR start "rule__MappingRule__Group_11__0__Impl"
    // InternalMapping.g:2244:1: rule__MappingRule__Group_11__0__Impl : ( '{' ) ;
    public final void rule__MappingRule__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2248:1: ( ( '{' ) )
            // InternalMapping.g:2249:1: ( '{' )
            {
            // InternalMapping.g:2249:1: ( '{' )
            // InternalMapping.g:2250:2: '{'
            {
             before(grammarAccess.getMappingRuleAccess().getLeftCurlyBracketKeyword_11_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getLeftCurlyBracketKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_11__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_11__1"
    // InternalMapping.g:2259:1: rule__MappingRule__Group_11__1 : rule__MappingRule__Group_11__1__Impl rule__MappingRule__Group_11__2 ;
    public final void rule__MappingRule__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2263:1: ( rule__MappingRule__Group_11__1__Impl rule__MappingRule__Group_11__2 )
            // InternalMapping.g:2264:2: rule__MappingRule__Group_11__1__Impl rule__MappingRule__Group_11__2
            {
            pushFollow(FOLLOW_13);
            rule__MappingRule__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_11__1"


    // $ANTLR start "rule__MappingRule__Group_11__1__Impl"
    // InternalMapping.g:2271:1: rule__MappingRule__Group_11__1__Impl : ( ( rule__MappingRule__ChildHelpersAssignment_11_1 ) ) ;
    public final void rule__MappingRule__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2275:1: ( ( ( rule__MappingRule__ChildHelpersAssignment_11_1 ) ) )
            // InternalMapping.g:2276:1: ( ( rule__MappingRule__ChildHelpersAssignment_11_1 ) )
            {
            // InternalMapping.g:2276:1: ( ( rule__MappingRule__ChildHelpersAssignment_11_1 ) )
            // InternalMapping.g:2277:2: ( rule__MappingRule__ChildHelpersAssignment_11_1 )
            {
             before(grammarAccess.getMappingRuleAccess().getChildHelpersAssignment_11_1()); 
            // InternalMapping.g:2278:2: ( rule__MappingRule__ChildHelpersAssignment_11_1 )
            // InternalMapping.g:2278:3: rule__MappingRule__ChildHelpersAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__ChildHelpersAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getChildHelpersAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_11__1__Impl"


    // $ANTLR start "rule__MappingRule__Group_11__2"
    // InternalMapping.g:2286:1: rule__MappingRule__Group_11__2 : rule__MappingRule__Group_11__2__Impl rule__MappingRule__Group_11__3 ;
    public final void rule__MappingRule__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2290:1: ( rule__MappingRule__Group_11__2__Impl rule__MappingRule__Group_11__3 )
            // InternalMapping.g:2291:2: rule__MappingRule__Group_11__2__Impl rule__MappingRule__Group_11__3
            {
            pushFollow(FOLLOW_13);
            rule__MappingRule__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_11__2"


    // $ANTLR start "rule__MappingRule__Group_11__2__Impl"
    // InternalMapping.g:2298:1: rule__MappingRule__Group_11__2__Impl : ( ( rule__MappingRule__Group_11_2__0 )* ) ;
    public final void rule__MappingRule__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2302:1: ( ( ( rule__MappingRule__Group_11_2__0 )* ) )
            // InternalMapping.g:2303:1: ( ( rule__MappingRule__Group_11_2__0 )* )
            {
            // InternalMapping.g:2303:1: ( ( rule__MappingRule__Group_11_2__0 )* )
            // InternalMapping.g:2304:2: ( rule__MappingRule__Group_11_2__0 )*
            {
             before(grammarAccess.getMappingRuleAccess().getGroup_11_2()); 
            // InternalMapping.g:2305:2: ( rule__MappingRule__Group_11_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==23) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMapping.g:2305:3: rule__MappingRule__Group_11_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__MappingRule__Group_11_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getMappingRuleAccess().getGroup_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_11__2__Impl"


    // $ANTLR start "rule__MappingRule__Group_11__3"
    // InternalMapping.g:2313:1: rule__MappingRule__Group_11__3 : rule__MappingRule__Group_11__3__Impl ;
    public final void rule__MappingRule__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2317:1: ( rule__MappingRule__Group_11__3__Impl )
            // InternalMapping.g:2318:2: rule__MappingRule__Group_11__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_11__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_11__3"


    // $ANTLR start "rule__MappingRule__Group_11__3__Impl"
    // InternalMapping.g:2324:1: rule__MappingRule__Group_11__3__Impl : ( '}' ) ;
    public final void rule__MappingRule__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2328:1: ( ( '}' ) )
            // InternalMapping.g:2329:1: ( '}' )
            {
            // InternalMapping.g:2329:1: ( '}' )
            // InternalMapping.g:2330:2: '}'
            {
             before(grammarAccess.getMappingRuleAccess().getRightCurlyBracketKeyword_11_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getRightCurlyBracketKeyword_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_11__3__Impl"


    // $ANTLR start "rule__MappingRule__Group_11_2__0"
    // InternalMapping.g:2340:1: rule__MappingRule__Group_11_2__0 : rule__MappingRule__Group_11_2__0__Impl rule__MappingRule__Group_11_2__1 ;
    public final void rule__MappingRule__Group_11_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2344:1: ( rule__MappingRule__Group_11_2__0__Impl rule__MappingRule__Group_11_2__1 )
            // InternalMapping.g:2345:2: rule__MappingRule__Group_11_2__0__Impl rule__MappingRule__Group_11_2__1
            {
            pushFollow(FOLLOW_18);
            rule__MappingRule__Group_11_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_11_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_11_2__0"


    // $ANTLR start "rule__MappingRule__Group_11_2__0__Impl"
    // InternalMapping.g:2352:1: rule__MappingRule__Group_11_2__0__Impl : ( ';' ) ;
    public final void rule__MappingRule__Group_11_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2356:1: ( ( ';' ) )
            // InternalMapping.g:2357:1: ( ';' )
            {
            // InternalMapping.g:2357:1: ( ';' )
            // InternalMapping.g:2358:2: ';'
            {
             before(grammarAccess.getMappingRuleAccess().getSemicolonKeyword_11_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getSemicolonKeyword_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_11_2__0__Impl"


    // $ANTLR start "rule__MappingRule__Group_11_2__1"
    // InternalMapping.g:2367:1: rule__MappingRule__Group_11_2__1 : rule__MappingRule__Group_11_2__1__Impl ;
    public final void rule__MappingRule__Group_11_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2371:1: ( rule__MappingRule__Group_11_2__1__Impl )
            // InternalMapping.g:2372:2: rule__MappingRule__Group_11_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__Group_11_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_11_2__1"


    // $ANTLR start "rule__MappingRule__Group_11_2__1__Impl"
    // InternalMapping.g:2378:1: rule__MappingRule__Group_11_2__1__Impl : ( ( rule__MappingRule__ChildHelpersAssignment_11_2_1 ) ) ;
    public final void rule__MappingRule__Group_11_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2382:1: ( ( ( rule__MappingRule__ChildHelpersAssignment_11_2_1 ) ) )
            // InternalMapping.g:2383:1: ( ( rule__MappingRule__ChildHelpersAssignment_11_2_1 ) )
            {
            // InternalMapping.g:2383:1: ( ( rule__MappingRule__ChildHelpersAssignment_11_2_1 ) )
            // InternalMapping.g:2384:2: ( rule__MappingRule__ChildHelpersAssignment_11_2_1 )
            {
             before(grammarAccess.getMappingRuleAccess().getChildHelpersAssignment_11_2_1()); 
            // InternalMapping.g:2385:2: ( rule__MappingRule__ChildHelpersAssignment_11_2_1 )
            // InternalMapping.g:2385:3: rule__MappingRule__ChildHelpersAssignment_11_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MappingRule__ChildHelpersAssignment_11_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRuleAccess().getChildHelpersAssignment_11_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__Group_11_2__1__Impl"


    // $ANTLR start "rule__HelperStatement__Group__0"
    // InternalMapping.g:2394:1: rule__HelperStatement__Group__0 : rule__HelperStatement__Group__0__Impl rule__HelperStatement__Group__1 ;
    public final void rule__HelperStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2398:1: ( rule__HelperStatement__Group__0__Impl rule__HelperStatement__Group__1 )
            // InternalMapping.g:2399:2: rule__HelperStatement__Group__0__Impl rule__HelperStatement__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__HelperStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group__0"


    // $ANTLR start "rule__HelperStatement__Group__0__Impl"
    // InternalMapping.g:2406:1: rule__HelperStatement__Group__0__Impl : ( () ) ;
    public final void rule__HelperStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2410:1: ( ( () ) )
            // InternalMapping.g:2411:1: ( () )
            {
            // InternalMapping.g:2411:1: ( () )
            // InternalMapping.g:2412:2: ()
            {
             before(grammarAccess.getHelperStatementAccess().getHelperStatementAction_0()); 
            // InternalMapping.g:2413:2: ()
            // InternalMapping.g:2413:3: 
            {
            }

             after(grammarAccess.getHelperStatementAccess().getHelperStatementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group__0__Impl"


    // $ANTLR start "rule__HelperStatement__Group__1"
    // InternalMapping.g:2421:1: rule__HelperStatement__Group__1 : rule__HelperStatement__Group__1__Impl rule__HelperStatement__Group__2 ;
    public final void rule__HelperStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2425:1: ( rule__HelperStatement__Group__1__Impl rule__HelperStatement__Group__2 )
            // InternalMapping.g:2426:2: rule__HelperStatement__Group__1__Impl rule__HelperStatement__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__HelperStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group__1"


    // $ANTLR start "rule__HelperStatement__Group__1__Impl"
    // InternalMapping.g:2433:1: rule__HelperStatement__Group__1__Impl : ( ( 'HelperStatement' )? ) ;
    public final void rule__HelperStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2437:1: ( ( ( 'HelperStatement' )? ) )
            // InternalMapping.g:2438:1: ( ( 'HelperStatement' )? )
            {
            // InternalMapping.g:2438:1: ( ( 'HelperStatement' )? )
            // InternalMapping.g:2439:2: ( 'HelperStatement' )?
            {
             before(grammarAccess.getHelperStatementAccess().getHelperStatementKeyword_1()); 
            // InternalMapping.g:2440:2: ( 'HelperStatement' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMapping.g:2440:3: 'HelperStatement'
                    {
                    match(input,30,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHelperStatementAccess().getHelperStatementKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group__1__Impl"


    // $ANTLR start "rule__HelperStatement__Group__2"
    // InternalMapping.g:2448:1: rule__HelperStatement__Group__2 : rule__HelperStatement__Group__2__Impl rule__HelperStatement__Group__3 ;
    public final void rule__HelperStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2452:1: ( rule__HelperStatement__Group__2__Impl rule__HelperStatement__Group__3 )
            // InternalMapping.g:2453:2: rule__HelperStatement__Group__2__Impl rule__HelperStatement__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__HelperStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group__2"


    // $ANTLR start "rule__HelperStatement__Group__2__Impl"
    // InternalMapping.g:2460:1: rule__HelperStatement__Group__2__Impl : ( ( rule__HelperStatement__Group_2__0 ) ) ;
    public final void rule__HelperStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2464:1: ( ( ( rule__HelperStatement__Group_2__0 ) ) )
            // InternalMapping.g:2465:1: ( ( rule__HelperStatement__Group_2__0 ) )
            {
            // InternalMapping.g:2465:1: ( ( rule__HelperStatement__Group_2__0 ) )
            // InternalMapping.g:2466:2: ( rule__HelperStatement__Group_2__0 )
            {
             before(grammarAccess.getHelperStatementAccess().getGroup_2()); 
            // InternalMapping.g:2467:2: ( rule__HelperStatement__Group_2__0 )
            // InternalMapping.g:2467:3: rule__HelperStatement__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getHelperStatementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group__2__Impl"


    // $ANTLR start "rule__HelperStatement__Group__3"
    // InternalMapping.g:2475:1: rule__HelperStatement__Group__3 : rule__HelperStatement__Group__3__Impl rule__HelperStatement__Group__4 ;
    public final void rule__HelperStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2479:1: ( rule__HelperStatement__Group__3__Impl rule__HelperStatement__Group__4 )
            // InternalMapping.g:2480:2: rule__HelperStatement__Group__3__Impl rule__HelperStatement__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__HelperStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group__3"


    // $ANTLR start "rule__HelperStatement__Group__3__Impl"
    // InternalMapping.g:2487:1: rule__HelperStatement__Group__3__Impl : ( ( rule__HelperStatement__Group_3__0 )? ) ;
    public final void rule__HelperStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2491:1: ( ( ( rule__HelperStatement__Group_3__0 )? ) )
            // InternalMapping.g:2492:1: ( ( rule__HelperStatement__Group_3__0 )? )
            {
            // InternalMapping.g:2492:1: ( ( rule__HelperStatement__Group_3__0 )? )
            // InternalMapping.g:2493:2: ( rule__HelperStatement__Group_3__0 )?
            {
             before(grammarAccess.getHelperStatementAccess().getGroup_3()); 
            // InternalMapping.g:2494:2: ( rule__HelperStatement__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==17) ) {
                int LA28_1 = input.LA(2);

                if ( ((LA28_1>=RULE_STRING && LA28_1<=RULE_ID)||(LA28_1>=11 && LA28_1<=12)||(LA28_1>=17 && LA28_1<=18)||LA28_1==20||(LA28_1>=24 && LA28_1<=25)||(LA28_1>=27 && LA28_1<=29)||LA28_1==33) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalMapping.g:2494:3: rule__HelperStatement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HelperStatement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHelperStatementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group__3__Impl"


    // $ANTLR start "rule__HelperStatement__Group__4"
    // InternalMapping.g:2502:1: rule__HelperStatement__Group__4 : rule__HelperStatement__Group__4__Impl ;
    public final void rule__HelperStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2506:1: ( rule__HelperStatement__Group__4__Impl )
            // InternalMapping.g:2507:2: rule__HelperStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group__4"


    // $ANTLR start "rule__HelperStatement__Group__4__Impl"
    // InternalMapping.g:2513:1: rule__HelperStatement__Group__4__Impl : ( ( rule__HelperStatement__Group_4__0 )? ) ;
    public final void rule__HelperStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2517:1: ( ( ( rule__HelperStatement__Group_4__0 )? ) )
            // InternalMapping.g:2518:1: ( ( rule__HelperStatement__Group_4__0 )? )
            {
            // InternalMapping.g:2518:1: ( ( rule__HelperStatement__Group_4__0 )? )
            // InternalMapping.g:2519:2: ( rule__HelperStatement__Group_4__0 )?
            {
             before(grammarAccess.getHelperStatementAccess().getGroup_4()); 
            // InternalMapping.g:2520:2: ( rule__HelperStatement__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==17) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMapping.g:2520:3: rule__HelperStatement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__HelperStatement__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHelperStatementAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group__4__Impl"


    // $ANTLR start "rule__HelperStatement__Group_2__0"
    // InternalMapping.g:2529:1: rule__HelperStatement__Group_2__0 : rule__HelperStatement__Group_2__0__Impl rule__HelperStatement__Group_2__1 ;
    public final void rule__HelperStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2533:1: ( rule__HelperStatement__Group_2__0__Impl rule__HelperStatement__Group_2__1 )
            // InternalMapping.g:2534:2: rule__HelperStatement__Group_2__0__Impl rule__HelperStatement__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__HelperStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_2__0"


    // $ANTLR start "rule__HelperStatement__Group_2__0__Impl"
    // InternalMapping.g:2541:1: rule__HelperStatement__Group_2__0__Impl : ( 'statement' ) ;
    public final void rule__HelperStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2545:1: ( ( 'statement' ) )
            // InternalMapping.g:2546:1: ( 'statement' )
            {
            // InternalMapping.g:2546:1: ( 'statement' )
            // InternalMapping.g:2547:2: 'statement'
            {
             before(grammarAccess.getHelperStatementAccess().getStatementKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getHelperStatementAccess().getStatementKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_2__0__Impl"


    // $ANTLR start "rule__HelperStatement__Group_2__1"
    // InternalMapping.g:2556:1: rule__HelperStatement__Group_2__1 : rule__HelperStatement__Group_2__1__Impl ;
    public final void rule__HelperStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2560:1: ( rule__HelperStatement__Group_2__1__Impl )
            // InternalMapping.g:2561:2: rule__HelperStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_2__1"


    // $ANTLR start "rule__HelperStatement__Group_2__1__Impl"
    // InternalMapping.g:2567:1: rule__HelperStatement__Group_2__1__Impl : ( ( rule__HelperStatement__StatementAssignment_2_1 ) ) ;
    public final void rule__HelperStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2571:1: ( ( ( rule__HelperStatement__StatementAssignment_2_1 ) ) )
            // InternalMapping.g:2572:1: ( ( rule__HelperStatement__StatementAssignment_2_1 ) )
            {
            // InternalMapping.g:2572:1: ( ( rule__HelperStatement__StatementAssignment_2_1 ) )
            // InternalMapping.g:2573:2: ( rule__HelperStatement__StatementAssignment_2_1 )
            {
             before(grammarAccess.getHelperStatementAccess().getStatementAssignment_2_1()); 
            // InternalMapping.g:2574:2: ( rule__HelperStatement__StatementAssignment_2_1 )
            // InternalMapping.g:2574:3: rule__HelperStatement__StatementAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__StatementAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHelperStatementAccess().getStatementAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_2__1__Impl"


    // $ANTLR start "rule__HelperStatement__Group_3__0"
    // InternalMapping.g:2583:1: rule__HelperStatement__Group_3__0 : rule__HelperStatement__Group_3__0__Impl rule__HelperStatement__Group_3__1 ;
    public final void rule__HelperStatement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2587:1: ( rule__HelperStatement__Group_3__0__Impl rule__HelperStatement__Group_3__1 )
            // InternalMapping.g:2588:2: rule__HelperStatement__Group_3__0__Impl rule__HelperStatement__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__HelperStatement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3__0"


    // $ANTLR start "rule__HelperStatement__Group_3__0__Impl"
    // InternalMapping.g:2595:1: rule__HelperStatement__Group_3__0__Impl : ( '{' ) ;
    public final void rule__HelperStatement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2599:1: ( ( '{' ) )
            // InternalMapping.g:2600:1: ( '{' )
            {
            // InternalMapping.g:2600:1: ( '{' )
            // InternalMapping.g:2601:2: '{'
            {
             before(grammarAccess.getHelperStatementAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getHelperStatementAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3__0__Impl"


    // $ANTLR start "rule__HelperStatement__Group_3__1"
    // InternalMapping.g:2610:1: rule__HelperStatement__Group_3__1 : rule__HelperStatement__Group_3__1__Impl rule__HelperStatement__Group_3__2 ;
    public final void rule__HelperStatement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2614:1: ( rule__HelperStatement__Group_3__1__Impl rule__HelperStatement__Group_3__2 )
            // InternalMapping.g:2615:2: rule__HelperStatement__Group_3__1__Impl rule__HelperStatement__Group_3__2
            {
            pushFollow(FOLLOW_7);
            rule__HelperStatement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3__1"


    // $ANTLR start "rule__HelperStatement__Group_3__1__Impl"
    // InternalMapping.g:2622:1: rule__HelperStatement__Group_3__1__Impl : ( ( rule__HelperStatement__ChildRulesAssignment_3_1 ) ) ;
    public final void rule__HelperStatement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2626:1: ( ( ( rule__HelperStatement__ChildRulesAssignment_3_1 ) ) )
            // InternalMapping.g:2627:1: ( ( rule__HelperStatement__ChildRulesAssignment_3_1 ) )
            {
            // InternalMapping.g:2627:1: ( ( rule__HelperStatement__ChildRulesAssignment_3_1 ) )
            // InternalMapping.g:2628:2: ( rule__HelperStatement__ChildRulesAssignment_3_1 )
            {
             before(grammarAccess.getHelperStatementAccess().getChildRulesAssignment_3_1()); 
            // InternalMapping.g:2629:2: ( rule__HelperStatement__ChildRulesAssignment_3_1 )
            // InternalMapping.g:2629:3: rule__HelperStatement__ChildRulesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__ChildRulesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHelperStatementAccess().getChildRulesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3__1__Impl"


    // $ANTLR start "rule__HelperStatement__Group_3__2"
    // InternalMapping.g:2637:1: rule__HelperStatement__Group_3__2 : rule__HelperStatement__Group_3__2__Impl rule__HelperStatement__Group_3__3 ;
    public final void rule__HelperStatement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2641:1: ( rule__HelperStatement__Group_3__2__Impl rule__HelperStatement__Group_3__3 )
            // InternalMapping.g:2642:2: rule__HelperStatement__Group_3__2__Impl rule__HelperStatement__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__HelperStatement__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3__2"


    // $ANTLR start "rule__HelperStatement__Group_3__2__Impl"
    // InternalMapping.g:2649:1: rule__HelperStatement__Group_3__2__Impl : ( ( rule__HelperStatement__Group_3_2__0 )* ) ;
    public final void rule__HelperStatement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2653:1: ( ( ( rule__HelperStatement__Group_3_2__0 )* ) )
            // InternalMapping.g:2654:1: ( ( rule__HelperStatement__Group_3_2__0 )* )
            {
            // InternalMapping.g:2654:1: ( ( rule__HelperStatement__Group_3_2__0 )* )
            // InternalMapping.g:2655:2: ( rule__HelperStatement__Group_3_2__0 )*
            {
             before(grammarAccess.getHelperStatementAccess().getGroup_3_2()); 
            // InternalMapping.g:2656:2: ( rule__HelperStatement__Group_3_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==20) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMapping.g:2656:3: rule__HelperStatement__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__HelperStatement__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getHelperStatementAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3__2__Impl"


    // $ANTLR start "rule__HelperStatement__Group_3__3"
    // InternalMapping.g:2664:1: rule__HelperStatement__Group_3__3 : rule__HelperStatement__Group_3__3__Impl ;
    public final void rule__HelperStatement__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2668:1: ( rule__HelperStatement__Group_3__3__Impl )
            // InternalMapping.g:2669:2: rule__HelperStatement__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3__3"


    // $ANTLR start "rule__HelperStatement__Group_3__3__Impl"
    // InternalMapping.g:2675:1: rule__HelperStatement__Group_3__3__Impl : ( '}' ) ;
    public final void rule__HelperStatement__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2679:1: ( ( '}' ) )
            // InternalMapping.g:2680:1: ( '}' )
            {
            // InternalMapping.g:2680:1: ( '}' )
            // InternalMapping.g:2681:2: '}'
            {
             before(grammarAccess.getHelperStatementAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getHelperStatementAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3__3__Impl"


    // $ANTLR start "rule__HelperStatement__Group_3_2__0"
    // InternalMapping.g:2691:1: rule__HelperStatement__Group_3_2__0 : rule__HelperStatement__Group_3_2__0__Impl rule__HelperStatement__Group_3_2__1 ;
    public final void rule__HelperStatement__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2695:1: ( rule__HelperStatement__Group_3_2__0__Impl rule__HelperStatement__Group_3_2__1 )
            // InternalMapping.g:2696:2: rule__HelperStatement__Group_3_2__0__Impl rule__HelperStatement__Group_3_2__1
            {
            pushFollow(FOLLOW_12);
            rule__HelperStatement__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3_2__0"


    // $ANTLR start "rule__HelperStatement__Group_3_2__0__Impl"
    // InternalMapping.g:2703:1: rule__HelperStatement__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__HelperStatement__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2707:1: ( ( ',' ) )
            // InternalMapping.g:2708:1: ( ',' )
            {
            // InternalMapping.g:2708:1: ( ',' )
            // InternalMapping.g:2709:2: ','
            {
             before(grammarAccess.getHelperStatementAccess().getCommaKeyword_3_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getHelperStatementAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3_2__0__Impl"


    // $ANTLR start "rule__HelperStatement__Group_3_2__1"
    // InternalMapping.g:2718:1: rule__HelperStatement__Group_3_2__1 : rule__HelperStatement__Group_3_2__1__Impl ;
    public final void rule__HelperStatement__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2722:1: ( rule__HelperStatement__Group_3_2__1__Impl )
            // InternalMapping.g:2723:2: rule__HelperStatement__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3_2__1"


    // $ANTLR start "rule__HelperStatement__Group_3_2__1__Impl"
    // InternalMapping.g:2729:1: rule__HelperStatement__Group_3_2__1__Impl : ( ( rule__HelperStatement__ChildRulesAssignment_3_2_1 ) ) ;
    public final void rule__HelperStatement__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2733:1: ( ( ( rule__HelperStatement__ChildRulesAssignment_3_2_1 ) ) )
            // InternalMapping.g:2734:1: ( ( rule__HelperStatement__ChildRulesAssignment_3_2_1 ) )
            {
            // InternalMapping.g:2734:1: ( ( rule__HelperStatement__ChildRulesAssignment_3_2_1 ) )
            // InternalMapping.g:2735:2: ( rule__HelperStatement__ChildRulesAssignment_3_2_1 )
            {
             before(grammarAccess.getHelperStatementAccess().getChildRulesAssignment_3_2_1()); 
            // InternalMapping.g:2736:2: ( rule__HelperStatement__ChildRulesAssignment_3_2_1 )
            // InternalMapping.g:2736:3: rule__HelperStatement__ChildRulesAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__ChildRulesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHelperStatementAccess().getChildRulesAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_3_2__1__Impl"


    // $ANTLR start "rule__HelperStatement__Group_4__0"
    // InternalMapping.g:2745:1: rule__HelperStatement__Group_4__0 : rule__HelperStatement__Group_4__0__Impl rule__HelperStatement__Group_4__1 ;
    public final void rule__HelperStatement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2749:1: ( rule__HelperStatement__Group_4__0__Impl rule__HelperStatement__Group_4__1 )
            // InternalMapping.g:2750:2: rule__HelperStatement__Group_4__0__Impl rule__HelperStatement__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__HelperStatement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4__0"


    // $ANTLR start "rule__HelperStatement__Group_4__0__Impl"
    // InternalMapping.g:2757:1: rule__HelperStatement__Group_4__0__Impl : ( '{' ) ;
    public final void rule__HelperStatement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2761:1: ( ( '{' ) )
            // InternalMapping.g:2762:1: ( '{' )
            {
            // InternalMapping.g:2762:1: ( '{' )
            // InternalMapping.g:2763:2: '{'
            {
             before(grammarAccess.getHelperStatementAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getHelperStatementAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4__0__Impl"


    // $ANTLR start "rule__HelperStatement__Group_4__1"
    // InternalMapping.g:2772:1: rule__HelperStatement__Group_4__1 : rule__HelperStatement__Group_4__1__Impl rule__HelperStatement__Group_4__2 ;
    public final void rule__HelperStatement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2776:1: ( rule__HelperStatement__Group_4__1__Impl rule__HelperStatement__Group_4__2 )
            // InternalMapping.g:2777:2: rule__HelperStatement__Group_4__1__Impl rule__HelperStatement__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__HelperStatement__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4__1"


    // $ANTLR start "rule__HelperStatement__Group_4__1__Impl"
    // InternalMapping.g:2784:1: rule__HelperStatement__Group_4__1__Impl : ( ( rule__HelperStatement__ChildHelpersAssignment_4_1 ) ) ;
    public final void rule__HelperStatement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2788:1: ( ( ( rule__HelperStatement__ChildHelpersAssignment_4_1 ) ) )
            // InternalMapping.g:2789:1: ( ( rule__HelperStatement__ChildHelpersAssignment_4_1 ) )
            {
            // InternalMapping.g:2789:1: ( ( rule__HelperStatement__ChildHelpersAssignment_4_1 ) )
            // InternalMapping.g:2790:2: ( rule__HelperStatement__ChildHelpersAssignment_4_1 )
            {
             before(grammarAccess.getHelperStatementAccess().getChildHelpersAssignment_4_1()); 
            // InternalMapping.g:2791:2: ( rule__HelperStatement__ChildHelpersAssignment_4_1 )
            // InternalMapping.g:2791:3: rule__HelperStatement__ChildHelpersAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__ChildHelpersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getHelperStatementAccess().getChildHelpersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4__1__Impl"


    // $ANTLR start "rule__HelperStatement__Group_4__2"
    // InternalMapping.g:2799:1: rule__HelperStatement__Group_4__2 : rule__HelperStatement__Group_4__2__Impl rule__HelperStatement__Group_4__3 ;
    public final void rule__HelperStatement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2803:1: ( rule__HelperStatement__Group_4__2__Impl rule__HelperStatement__Group_4__3 )
            // InternalMapping.g:2804:2: rule__HelperStatement__Group_4__2__Impl rule__HelperStatement__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__HelperStatement__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4__2"


    // $ANTLR start "rule__HelperStatement__Group_4__2__Impl"
    // InternalMapping.g:2811:1: rule__HelperStatement__Group_4__2__Impl : ( ( rule__HelperStatement__Group_4_2__0 )* ) ;
    public final void rule__HelperStatement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2815:1: ( ( ( rule__HelperStatement__Group_4_2__0 )* ) )
            // InternalMapping.g:2816:1: ( ( rule__HelperStatement__Group_4_2__0 )* )
            {
            // InternalMapping.g:2816:1: ( ( rule__HelperStatement__Group_4_2__0 )* )
            // InternalMapping.g:2817:2: ( rule__HelperStatement__Group_4_2__0 )*
            {
             before(grammarAccess.getHelperStatementAccess().getGroup_4_2()); 
            // InternalMapping.g:2818:2: ( rule__HelperStatement__Group_4_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==20) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMapping.g:2818:3: rule__HelperStatement__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__HelperStatement__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getHelperStatementAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4__2__Impl"


    // $ANTLR start "rule__HelperStatement__Group_4__3"
    // InternalMapping.g:2826:1: rule__HelperStatement__Group_4__3 : rule__HelperStatement__Group_4__3__Impl ;
    public final void rule__HelperStatement__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2830:1: ( rule__HelperStatement__Group_4__3__Impl )
            // InternalMapping.g:2831:2: rule__HelperStatement__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4__3"


    // $ANTLR start "rule__HelperStatement__Group_4__3__Impl"
    // InternalMapping.g:2837:1: rule__HelperStatement__Group_4__3__Impl : ( '}' ) ;
    public final void rule__HelperStatement__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2841:1: ( ( '}' ) )
            // InternalMapping.g:2842:1: ( '}' )
            {
            // InternalMapping.g:2842:1: ( '}' )
            // InternalMapping.g:2843:2: '}'
            {
             before(grammarAccess.getHelperStatementAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getHelperStatementAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4__3__Impl"


    // $ANTLR start "rule__HelperStatement__Group_4_2__0"
    // InternalMapping.g:2853:1: rule__HelperStatement__Group_4_2__0 : rule__HelperStatement__Group_4_2__0__Impl rule__HelperStatement__Group_4_2__1 ;
    public final void rule__HelperStatement__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2857:1: ( rule__HelperStatement__Group_4_2__0__Impl rule__HelperStatement__Group_4_2__1 )
            // InternalMapping.g:2858:2: rule__HelperStatement__Group_4_2__0__Impl rule__HelperStatement__Group_4_2__1
            {
            pushFollow(FOLLOW_18);
            rule__HelperStatement__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4_2__0"


    // $ANTLR start "rule__HelperStatement__Group_4_2__0__Impl"
    // InternalMapping.g:2865:1: rule__HelperStatement__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__HelperStatement__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2869:1: ( ( ',' ) )
            // InternalMapping.g:2870:1: ( ',' )
            {
            // InternalMapping.g:2870:1: ( ',' )
            // InternalMapping.g:2871:2: ','
            {
             before(grammarAccess.getHelperStatementAccess().getCommaKeyword_4_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getHelperStatementAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4_2__0__Impl"


    // $ANTLR start "rule__HelperStatement__Group_4_2__1"
    // InternalMapping.g:2880:1: rule__HelperStatement__Group_4_2__1 : rule__HelperStatement__Group_4_2__1__Impl ;
    public final void rule__HelperStatement__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2884:1: ( rule__HelperStatement__Group_4_2__1__Impl )
            // InternalMapping.g:2885:2: rule__HelperStatement__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4_2__1"


    // $ANTLR start "rule__HelperStatement__Group_4_2__1__Impl"
    // InternalMapping.g:2891:1: rule__HelperStatement__Group_4_2__1__Impl : ( ( rule__HelperStatement__ChildHelpersAssignment_4_2_1 ) ) ;
    public final void rule__HelperStatement__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2895:1: ( ( ( rule__HelperStatement__ChildHelpersAssignment_4_2_1 ) ) )
            // InternalMapping.g:2896:1: ( ( rule__HelperStatement__ChildHelpersAssignment_4_2_1 ) )
            {
            // InternalMapping.g:2896:1: ( ( rule__HelperStatement__ChildHelpersAssignment_4_2_1 ) )
            // InternalMapping.g:2897:2: ( rule__HelperStatement__ChildHelpersAssignment_4_2_1 )
            {
             before(grammarAccess.getHelperStatementAccess().getChildHelpersAssignment_4_2_1()); 
            // InternalMapping.g:2898:2: ( rule__HelperStatement__ChildHelpersAssignment_4_2_1 )
            // InternalMapping.g:2898:3: rule__HelperStatement__ChildHelpersAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__HelperStatement__ChildHelpersAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getHelperStatementAccess().getChildHelpersAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__Group_4_2__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalMapping.g:2907:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2911:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMapping.g:2912:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalMapping.g:2919:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2923:1: ( ( ruleValidID ) )
            // InternalMapping.g:2924:1: ( ruleValidID )
            {
            // InternalMapping.g:2924:1: ( ruleValidID )
            // InternalMapping.g:2925:2: ruleValidID
            {
             before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalMapping.g:2934:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2938:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMapping.g:2939:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalMapping.g:2945:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2949:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMapping.g:2950:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMapping.g:2950:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMapping.g:2951:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalMapping.g:2952:2: ( rule__QualifiedName__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==32) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMapping.g:2952:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalMapping.g:2961:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2965:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMapping.g:2966:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalMapping.g:2973:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2977:1: ( ( '.' ) )
            // InternalMapping.g:2978:1: ( '.' )
            {
            // InternalMapping.g:2978:1: ( '.' )
            // InternalMapping.g:2979:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalMapping.g:2988:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:2992:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMapping.g:2993:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalMapping.g:2999:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3003:1: ( ( ruleValidID ) )
            // InternalMapping.g:3004:1: ( ruleValidID )
            {
            // InternalMapping.g:3004:1: ( ruleValidID )
            // InternalMapping.g:3005:2: ruleValidID
            {
             before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalMapping.g:3015:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3019:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalMapping.g:3020:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMapping.g:3027:1: rule__VariableDeclaration__Group__0__Impl : ( () ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3031:1: ( ( () ) )
            // InternalMapping.g:3032:1: ( () )
            {
            // InternalMapping.g:3032:1: ( () )
            // InternalMapping.g:3033:2: ()
            {
             before(grammarAccess.getVariableDeclarationAccess().getVariableDeclarationAction_0()); 
            // InternalMapping.g:3034:2: ()
            // InternalMapping.g:3034:3: 
            {
            }

             after(grammarAccess.getVariableDeclarationAccess().getVariableDeclarationAction_0()); 

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
    // InternalMapping.g:3042:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3046:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalMapping.g:3047:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMapping.g:3054:1: rule__VariableDeclaration__Group__1__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3058:1: ( ( 'var' ) )
            // InternalMapping.g:3059:1: ( 'var' )
            {
            // InternalMapping.g:3059:1: ( 'var' )
            // InternalMapping.g:3060:2: 'var'
            {
             before(grammarAccess.getVariableDeclarationAccess().getVarKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getVarKeyword_1()); 

            }


            }

        }
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
    // InternalMapping.g:3069:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3073:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalMapping.g:3074:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMapping.g:3081:1: rule__VariableDeclaration__Group__2__Impl : ( ( rule__VariableDeclaration__NameAssignment_2 ) ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3085:1: ( ( ( rule__VariableDeclaration__NameAssignment_2 ) ) )
            // InternalMapping.g:3086:1: ( ( rule__VariableDeclaration__NameAssignment_2 ) )
            {
            // InternalMapping.g:3086:1: ( ( rule__VariableDeclaration__NameAssignment_2 ) )
            // InternalMapping.g:3087:2: ( rule__VariableDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_2()); 
            // InternalMapping.g:3088:2: ( rule__VariableDeclaration__NameAssignment_2 )
            // InternalMapping.g:3088:3: rule__VariableDeclaration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalMapping.g:3096:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3100:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalMapping.g:3101:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMapping.g:3107:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3111:1: ( ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) )
            // InternalMapping.g:3112:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            {
            // InternalMapping.g:3112:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            // InternalMapping.g:3113:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 
            // InternalMapping.g:3114:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            // InternalMapping.g:3114:3: rule__VariableDeclaration__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__MappingModel__NameAssignment_1"
    // InternalMapping.g:3123:1: rule__MappingModel__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MappingModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3127:1: ( ( RULE_STRING ) )
            // InternalMapping.g:3128:2: ( RULE_STRING )
            {
            // InternalMapping.g:3128:2: ( RULE_STRING )
            // InternalMapping.g:3129:3: RULE_STRING
            {
             before(grammarAccess.getMappingModelAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMappingModelAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__NameAssignment_1"


    // $ANTLR start "rule__MappingModel__SourceMetamodelsAssignment_4"
    // InternalMapping.g:3138:1: rule__MappingModel__SourceMetamodelsAssignment_4 : ( ruleSourceMetamodel ) ;
    public final void rule__MappingModel__SourceMetamodelsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3142:1: ( ( ruleSourceMetamodel ) )
            // InternalMapping.g:3143:2: ( ruleSourceMetamodel )
            {
            // InternalMapping.g:3143:2: ( ruleSourceMetamodel )
            // InternalMapping.g:3144:3: ruleSourceMetamodel
            {
             before(grammarAccess.getMappingModelAccess().getSourceMetamodelsSourceMetamodelParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceMetamodel();

            state._fsp--;

             after(grammarAccess.getMappingModelAccess().getSourceMetamodelsSourceMetamodelParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__SourceMetamodelsAssignment_4"


    // $ANTLR start "rule__MappingModel__SourceMetamodelsAssignment_5_1"
    // InternalMapping.g:3153:1: rule__MappingModel__SourceMetamodelsAssignment_5_1 : ( ruleSourceMetamodel ) ;
    public final void rule__MappingModel__SourceMetamodelsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3157:1: ( ( ruleSourceMetamodel ) )
            // InternalMapping.g:3158:2: ( ruleSourceMetamodel )
            {
            // InternalMapping.g:3158:2: ( ruleSourceMetamodel )
            // InternalMapping.g:3159:3: ruleSourceMetamodel
            {
             before(grammarAccess.getMappingModelAccess().getSourceMetamodelsSourceMetamodelParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSourceMetamodel();

            state._fsp--;

             after(grammarAccess.getMappingModelAccess().getSourceMetamodelsSourceMetamodelParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__SourceMetamodelsAssignment_5_1"


    // $ANTLR start "rule__MappingModel__MainSourceMetamodelAssignment_7_1"
    // InternalMapping.g:3168:1: rule__MappingModel__MainSourceMetamodelAssignment_7_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MappingModel__MainSourceMetamodelAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3172:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMapping.g:3173:2: ( ( ruleQualifiedName ) )
            {
            // InternalMapping.g:3173:2: ( ( ruleQualifiedName ) )
            // InternalMapping.g:3174:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingModelAccess().getMainSourceMetamodelSourceMetamodelCrossReference_7_1_0()); 
            // InternalMapping.g:3175:3: ( ruleQualifiedName )
            // InternalMapping.g:3176:4: ruleQualifiedName
            {
             before(grammarAccess.getMappingModelAccess().getMainSourceMetamodelSourceMetamodelQualifiedNameParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMappingModelAccess().getMainSourceMetamodelSourceMetamodelQualifiedNameParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getMappingModelAccess().getMainSourceMetamodelSourceMetamodelCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__MainSourceMetamodelAssignment_7_1"


    // $ANTLR start "rule__MappingModel__TargetMetamodelsAssignment_10"
    // InternalMapping.g:3187:1: rule__MappingModel__TargetMetamodelsAssignment_10 : ( ruleTargetMetamodel ) ;
    public final void rule__MappingModel__TargetMetamodelsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3191:1: ( ( ruleTargetMetamodel ) )
            // InternalMapping.g:3192:2: ( ruleTargetMetamodel )
            {
            // InternalMapping.g:3192:2: ( ruleTargetMetamodel )
            // InternalMapping.g:3193:3: ruleTargetMetamodel
            {
             before(grammarAccess.getMappingModelAccess().getTargetMetamodelsTargetMetamodelParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleTargetMetamodel();

            state._fsp--;

             after(grammarAccess.getMappingModelAccess().getTargetMetamodelsTargetMetamodelParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__TargetMetamodelsAssignment_10"


    // $ANTLR start "rule__MappingModel__TargetMetamodelsAssignment_11_1"
    // InternalMapping.g:3202:1: rule__MappingModel__TargetMetamodelsAssignment_11_1 : ( ruleTargetMetamodel ) ;
    public final void rule__MappingModel__TargetMetamodelsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3206:1: ( ( ruleTargetMetamodel ) )
            // InternalMapping.g:3207:2: ( ruleTargetMetamodel )
            {
            // InternalMapping.g:3207:2: ( ruleTargetMetamodel )
            // InternalMapping.g:3208:3: ruleTargetMetamodel
            {
             before(grammarAccess.getMappingModelAccess().getTargetMetamodelsTargetMetamodelParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTargetMetamodel();

            state._fsp--;

             after(grammarAccess.getMappingModelAccess().getTargetMetamodelsTargetMetamodelParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__TargetMetamodelsAssignment_11_1"


    // $ANTLR start "rule__MappingModel__RulesAssignment_13_2"
    // InternalMapping.g:3217:1: rule__MappingModel__RulesAssignment_13_2 : ( ruleMappingRule ) ;
    public final void rule__MappingModel__RulesAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3221:1: ( ( ruleMappingRule ) )
            // InternalMapping.g:3222:2: ( ruleMappingRule )
            {
            // InternalMapping.g:3222:2: ( ruleMappingRule )
            // InternalMapping.g:3223:3: ruleMappingRule
            {
             before(grammarAccess.getMappingModelAccess().getRulesMappingRuleParserRuleCall_13_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMappingRule();

            state._fsp--;

             after(grammarAccess.getMappingModelAccess().getRulesMappingRuleParserRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__RulesAssignment_13_2"


    // $ANTLR start "rule__MappingModel__RulesAssignment_13_3_1"
    // InternalMapping.g:3232:1: rule__MappingModel__RulesAssignment_13_3_1 : ( ruleMappingRule ) ;
    public final void rule__MappingModel__RulesAssignment_13_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3236:1: ( ( ruleMappingRule ) )
            // InternalMapping.g:3237:2: ( ruleMappingRule )
            {
            // InternalMapping.g:3237:2: ( ruleMappingRule )
            // InternalMapping.g:3238:3: ruleMappingRule
            {
             before(grammarAccess.getMappingModelAccess().getRulesMappingRuleParserRuleCall_13_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMappingRule();

            state._fsp--;

             after(grammarAccess.getMappingModelAccess().getRulesMappingRuleParserRuleCall_13_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingModel__RulesAssignment_13_3_1"


    // $ANTLR start "rule__SourceMetamodel__NameAssignment_1"
    // InternalMapping.g:3247:1: rule__SourceMetamodel__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__SourceMetamodel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3251:1: ( ( RULE_STRING ) )
            // InternalMapping.g:3252:2: ( RULE_STRING )
            {
            // InternalMapping.g:3252:2: ( RULE_STRING )
            // InternalMapping.g:3253:3: RULE_STRING
            {
             before(grammarAccess.getSourceMetamodelAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSourceMetamodelAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMetamodel__NameAssignment_1"


    // $ANTLR start "rule__SourceMetamodel__ModelAssignment_2"
    // InternalMapping.g:3262:1: rule__SourceMetamodel__ModelAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__SourceMetamodel__ModelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3266:1: ( ( ( ruleEString ) ) )
            // InternalMapping.g:3267:2: ( ( ruleEString ) )
            {
            // InternalMapping.g:3267:2: ( ( ruleEString ) )
            // InternalMapping.g:3268:3: ( ruleEString )
            {
             before(grammarAccess.getSourceMetamodelAccess().getModelEPackageCrossReference_2_0()); 
            // InternalMapping.g:3269:3: ( ruleEString )
            // InternalMapping.g:3270:4: ruleEString
            {
             before(grammarAccess.getSourceMetamodelAccess().getModelEPackageEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSourceMetamodelAccess().getModelEPackageEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSourceMetamodelAccess().getModelEPackageCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SourceMetamodel__ModelAssignment_2"


    // $ANTLR start "rule__TargetMetamodel__NameAssignment_1"
    // InternalMapping.g:3281:1: rule__TargetMetamodel__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TargetMetamodel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3285:1: ( ( RULE_STRING ) )
            // InternalMapping.g:3286:2: ( RULE_STRING )
            {
            // InternalMapping.g:3286:2: ( RULE_STRING )
            // InternalMapping.g:3287:3: RULE_STRING
            {
             before(grammarAccess.getTargetMetamodelAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTargetMetamodelAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMetamodel__NameAssignment_1"


    // $ANTLR start "rule__TargetMetamodel__ModelAssignment_2"
    // InternalMapping.g:3296:1: rule__TargetMetamodel__ModelAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__TargetMetamodel__ModelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3300:1: ( ( ( ruleEString ) ) )
            // InternalMapping.g:3301:2: ( ( ruleEString ) )
            {
            // InternalMapping.g:3301:2: ( ( ruleEString ) )
            // InternalMapping.g:3302:3: ( ruleEString )
            {
             before(grammarAccess.getTargetMetamodelAccess().getModelEPackageCrossReference_2_0()); 
            // InternalMapping.g:3303:3: ( ruleEString )
            // InternalMapping.g:3304:4: ruleEString
            {
             before(grammarAccess.getTargetMetamodelAccess().getModelEPackageEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTargetMetamodelAccess().getModelEPackageEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTargetMetamodelAccess().getModelEPackageCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMetamodel__ModelAssignment_2"


    // $ANTLR start "rule__MappingRule__NameAssignment_2"
    // InternalMapping.g:3315:1: rule__MappingRule__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MappingRule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3319:1: ( ( RULE_STRING ) )
            // InternalMapping.g:3320:2: ( RULE_STRING )
            {
            // InternalMapping.g:3320:2: ( RULE_STRING )
            // InternalMapping.g:3321:3: RULE_STRING
            {
             before(grammarAccess.getMappingRuleAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__NameAssignment_2"


    // $ANTLR start "rule__MappingRule__VarAssignment_3"
    // InternalMapping.g:3330:1: rule__MappingRule__VarAssignment_3 : ( ruleVariableDeclaration ) ;
    public final void rule__MappingRule__VarAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3334:1: ( ( ruleVariableDeclaration ) )
            // InternalMapping.g:3335:2: ( ruleVariableDeclaration )
            {
            // InternalMapping.g:3335:2: ( ruleVariableDeclaration )
            // InternalMapping.g:3336:3: ruleVariableDeclaration
            {
             before(grammarAccess.getMappingRuleAccess().getVarVariableDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getMappingRuleAccess().getVarVariableDeclarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__VarAssignment_3"


    // $ANTLR start "rule__MappingRule__IdentifierAssignment_4_1"
    // InternalMapping.g:3345:1: rule__MappingRule__IdentifierAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__MappingRule__IdentifierAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3349:1: ( ( RULE_STRING ) )
            // InternalMapping.g:3350:2: ( RULE_STRING )
            {
            // InternalMapping.g:3350:2: ( RULE_STRING )
            // InternalMapping.g:3351:3: RULE_STRING
            {
             before(grammarAccess.getMappingRuleAccess().getIdentifierSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getIdentifierSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__IdentifierAssignment_4_1"


    // $ANTLR start "rule__MappingRule__SourceAssignment_5_0_0_1"
    // InternalMapping.g:3360:1: rule__MappingRule__SourceAssignment_5_0_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MappingRule__SourceAssignment_5_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3364:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMapping.g:3365:2: ( ( ruleQualifiedName ) )
            {
            // InternalMapping.g:3365:2: ( ( ruleQualifiedName ) )
            // InternalMapping.g:3366:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingRuleAccess().getSourceEObjectCrossReference_5_0_0_1_0()); 
            // InternalMapping.g:3367:3: ( ruleQualifiedName )
            // InternalMapping.g:3368:4: ruleQualifiedName
            {
             before(grammarAccess.getMappingRuleAccess().getSourceEObjectQualifiedNameParserRuleCall_5_0_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMappingRuleAccess().getSourceEObjectQualifiedNameParserRuleCall_5_0_0_1_0_1()); 

            }

             after(grammarAccess.getMappingRuleAccess().getSourceEObjectCrossReference_5_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__SourceAssignment_5_0_0_1"


    // $ANTLR start "rule__MappingRule__VariableAssignment_5_0_1"
    // InternalMapping.g:3379:1: rule__MappingRule__VariableAssignment_5_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__MappingRule__VariableAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3383:1: ( ( ( RULE_ID ) ) )
            // InternalMapping.g:3384:2: ( ( RULE_ID ) )
            {
            // InternalMapping.g:3384:2: ( ( RULE_ID ) )
            // InternalMapping.g:3385:3: ( RULE_ID )
            {
             before(grammarAccess.getMappingRuleAccess().getVariableVariableDeclarationCrossReference_5_0_1_0()); 
            // InternalMapping.g:3386:3: ( RULE_ID )
            // InternalMapping.g:3387:4: RULE_ID
            {
             before(grammarAccess.getMappingRuleAccess().getVariableVariableDeclarationIDTerminalRuleCall_5_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getVariableVariableDeclarationIDTerminalRuleCall_5_0_1_0_1()); 

            }

             after(grammarAccess.getMappingRuleAccess().getVariableVariableDeclarationCrossReference_5_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__VariableAssignment_5_0_1"


    // $ANTLR start "rule__MappingRule__EEnumLiteralAssignment_5_1_1"
    // InternalMapping.g:3398:1: rule__MappingRule__EEnumLiteralAssignment_5_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__MappingRule__EEnumLiteralAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3402:1: ( ( ( RULE_ID ) ) )
            // InternalMapping.g:3403:2: ( ( RULE_ID ) )
            {
            // InternalMapping.g:3403:2: ( ( RULE_ID ) )
            // InternalMapping.g:3404:3: ( RULE_ID )
            {
             before(grammarAccess.getMappingRuleAccess().getEEnumLiteralEEnumLiteralCrossReference_5_1_1_0()); 
            // InternalMapping.g:3405:3: ( RULE_ID )
            // InternalMapping.g:3406:4: RULE_ID
            {
             before(grammarAccess.getMappingRuleAccess().getEEnumLiteralEEnumLiteralIDTerminalRuleCall_5_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getEEnumLiteralEEnumLiteralIDTerminalRuleCall_5_1_1_0_1()); 

            }

             after(grammarAccess.getMappingRuleAccess().getEEnumLiteralEEnumLiteralCrossReference_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__EEnumLiteralAssignment_5_1_1"


    // $ANTLR start "rule__MappingRule__TargetAssignment_6_1"
    // InternalMapping.g:3417:1: rule__MappingRule__TargetAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__MappingRule__TargetAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3421:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMapping.g:3422:2: ( ( ruleQualifiedName ) )
            {
            // InternalMapping.g:3422:2: ( ( ruleQualifiedName ) )
            // InternalMapping.g:3423:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingRuleAccess().getTargetEObjectCrossReference_6_1_0()); 
            // InternalMapping.g:3424:3: ( ruleQualifiedName )
            // InternalMapping.g:3425:4: ruleQualifiedName
            {
             before(grammarAccess.getMappingRuleAccess().getTargetEObjectQualifiedNameParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMappingRuleAccess().getTargetEObjectQualifiedNameParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getMappingRuleAccess().getTargetEObjectCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__TargetAssignment_6_1"


    // $ANTLR start "rule__MappingRule__OperatorAssignment_7_1"
    // InternalMapping.g:3436:1: rule__MappingRule__OperatorAssignment_7_1 : ( ruleOperator ) ;
    public final void rule__MappingRule__OperatorAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3440:1: ( ( ruleOperator ) )
            // InternalMapping.g:3441:2: ( ruleOperator )
            {
            // InternalMapping.g:3441:2: ( ruleOperator )
            // InternalMapping.g:3442:3: ruleOperator
            {
             before(grammarAccess.getMappingRuleAccess().getOperatorOperatorEnumRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getMappingRuleAccess().getOperatorOperatorEnumRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__OperatorAssignment_7_1"


    // $ANTLR start "rule__MappingRule__ConditionAssignment_8_1"
    // InternalMapping.g:3451:1: rule__MappingRule__ConditionAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__MappingRule__ConditionAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3455:1: ( ( RULE_STRING ) )
            // InternalMapping.g:3456:2: ( RULE_STRING )
            {
            // InternalMapping.g:3456:2: ( RULE_STRING )
            // InternalMapping.g:3457:3: RULE_STRING
            {
             before(grammarAccess.getMappingRuleAccess().getConditionSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMappingRuleAccess().getConditionSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__ConditionAssignment_8_1"


    // $ANTLR start "rule__MappingRule__CommentAssignment_9_1"
    // InternalMapping.g:3466:1: rule__MappingRule__CommentAssignment_9_1 : ( ruleEString ) ;
    public final void rule__MappingRule__CommentAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3470:1: ( ( ruleEString ) )
            // InternalMapping.g:3471:2: ( ruleEString )
            {
            // InternalMapping.g:3471:2: ( ruleEString )
            // InternalMapping.g:3472:3: ruleEString
            {
             before(grammarAccess.getMappingRuleAccess().getCommentEStringParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMappingRuleAccess().getCommentEStringParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__CommentAssignment_9_1"


    // $ANTLR start "rule__MappingRule__ChildRulesAssignment_10_1"
    // InternalMapping.g:3481:1: rule__MappingRule__ChildRulesAssignment_10_1 : ( ruleMappingRule ) ;
    public final void rule__MappingRule__ChildRulesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3485:1: ( ( ruleMappingRule ) )
            // InternalMapping.g:3486:2: ( ruleMappingRule )
            {
            // InternalMapping.g:3486:2: ( ruleMappingRule )
            // InternalMapping.g:3487:3: ruleMappingRule
            {
             before(grammarAccess.getMappingRuleAccess().getChildRulesMappingRuleParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMappingRule();

            state._fsp--;

             after(grammarAccess.getMappingRuleAccess().getChildRulesMappingRuleParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__ChildRulesAssignment_10_1"


    // $ANTLR start "rule__MappingRule__ChildRulesAssignment_10_2_1"
    // InternalMapping.g:3496:1: rule__MappingRule__ChildRulesAssignment_10_2_1 : ( ruleMappingRule ) ;
    public final void rule__MappingRule__ChildRulesAssignment_10_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3500:1: ( ( ruleMappingRule ) )
            // InternalMapping.g:3501:2: ( ruleMappingRule )
            {
            // InternalMapping.g:3501:2: ( ruleMappingRule )
            // InternalMapping.g:3502:3: ruleMappingRule
            {
             before(grammarAccess.getMappingRuleAccess().getChildRulesMappingRuleParserRuleCall_10_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMappingRule();

            state._fsp--;

             after(grammarAccess.getMappingRuleAccess().getChildRulesMappingRuleParserRuleCall_10_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__ChildRulesAssignment_10_2_1"


    // $ANTLR start "rule__MappingRule__ChildHelpersAssignment_11_1"
    // InternalMapping.g:3511:1: rule__MappingRule__ChildHelpersAssignment_11_1 : ( ruleHelperStatement ) ;
    public final void rule__MappingRule__ChildHelpersAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3515:1: ( ( ruleHelperStatement ) )
            // InternalMapping.g:3516:2: ( ruleHelperStatement )
            {
            // InternalMapping.g:3516:2: ( ruleHelperStatement )
            // InternalMapping.g:3517:3: ruleHelperStatement
            {
             before(grammarAccess.getMappingRuleAccess().getChildHelpersHelperStatementParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHelperStatement();

            state._fsp--;

             after(grammarAccess.getMappingRuleAccess().getChildHelpersHelperStatementParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__ChildHelpersAssignment_11_1"


    // $ANTLR start "rule__MappingRule__ChildHelpersAssignment_11_2_1"
    // InternalMapping.g:3526:1: rule__MappingRule__ChildHelpersAssignment_11_2_1 : ( ruleHelperStatement ) ;
    public final void rule__MappingRule__ChildHelpersAssignment_11_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3530:1: ( ( ruleHelperStatement ) )
            // InternalMapping.g:3531:2: ( ruleHelperStatement )
            {
            // InternalMapping.g:3531:2: ( ruleHelperStatement )
            // InternalMapping.g:3532:3: ruleHelperStatement
            {
             before(grammarAccess.getMappingRuleAccess().getChildHelpersHelperStatementParserRuleCall_11_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHelperStatement();

            state._fsp--;

             after(grammarAccess.getMappingRuleAccess().getChildHelpersHelperStatementParserRuleCall_11_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRule__ChildHelpersAssignment_11_2_1"


    // $ANTLR start "rule__HelperStatement__StatementAssignment_2_1"
    // InternalMapping.g:3541:1: rule__HelperStatement__StatementAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__HelperStatement__StatementAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3545:1: ( ( RULE_STRING ) )
            // InternalMapping.g:3546:2: ( RULE_STRING )
            {
            // InternalMapping.g:3546:2: ( RULE_STRING )
            // InternalMapping.g:3547:3: RULE_STRING
            {
             before(grammarAccess.getHelperStatementAccess().getStatementSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getHelperStatementAccess().getStatementSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__StatementAssignment_2_1"


    // $ANTLR start "rule__HelperStatement__ChildRulesAssignment_3_1"
    // InternalMapping.g:3556:1: rule__HelperStatement__ChildRulesAssignment_3_1 : ( ruleMappingRule ) ;
    public final void rule__HelperStatement__ChildRulesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3560:1: ( ( ruleMappingRule ) )
            // InternalMapping.g:3561:2: ( ruleMappingRule )
            {
            // InternalMapping.g:3561:2: ( ruleMappingRule )
            // InternalMapping.g:3562:3: ruleMappingRule
            {
             before(grammarAccess.getHelperStatementAccess().getChildRulesMappingRuleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMappingRule();

            state._fsp--;

             after(grammarAccess.getHelperStatementAccess().getChildRulesMappingRuleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__ChildRulesAssignment_3_1"


    // $ANTLR start "rule__HelperStatement__ChildRulesAssignment_3_2_1"
    // InternalMapping.g:3571:1: rule__HelperStatement__ChildRulesAssignment_3_2_1 : ( ruleMappingRule ) ;
    public final void rule__HelperStatement__ChildRulesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3575:1: ( ( ruleMappingRule ) )
            // InternalMapping.g:3576:2: ( ruleMappingRule )
            {
            // InternalMapping.g:3576:2: ( ruleMappingRule )
            // InternalMapping.g:3577:3: ruleMappingRule
            {
             before(grammarAccess.getHelperStatementAccess().getChildRulesMappingRuleParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMappingRule();

            state._fsp--;

             after(grammarAccess.getHelperStatementAccess().getChildRulesMappingRuleParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__ChildRulesAssignment_3_2_1"


    // $ANTLR start "rule__HelperStatement__ChildHelpersAssignment_4_1"
    // InternalMapping.g:3586:1: rule__HelperStatement__ChildHelpersAssignment_4_1 : ( ruleHelperStatement ) ;
    public final void rule__HelperStatement__ChildHelpersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3590:1: ( ( ruleHelperStatement ) )
            // InternalMapping.g:3591:2: ( ruleHelperStatement )
            {
            // InternalMapping.g:3591:2: ( ruleHelperStatement )
            // InternalMapping.g:3592:3: ruleHelperStatement
            {
             before(grammarAccess.getHelperStatementAccess().getChildHelpersHelperStatementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHelperStatement();

            state._fsp--;

             after(grammarAccess.getHelperStatementAccess().getChildHelpersHelperStatementParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__ChildHelpersAssignment_4_1"


    // $ANTLR start "rule__HelperStatement__ChildHelpersAssignment_4_2_1"
    // InternalMapping.g:3601:1: rule__HelperStatement__ChildHelpersAssignment_4_2_1 : ( ruleHelperStatement ) ;
    public final void rule__HelperStatement__ChildHelpersAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3605:1: ( ( ruleHelperStatement ) )
            // InternalMapping.g:3606:2: ( ruleHelperStatement )
            {
            // InternalMapping.g:3606:2: ( ruleHelperStatement )
            // InternalMapping.g:3607:3: ruleHelperStatement
            {
             before(grammarAccess.getHelperStatementAccess().getChildHelpersHelperStatementParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHelperStatement();

            state._fsp--;

             after(grammarAccess.getHelperStatementAccess().getChildHelpersHelperStatementParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HelperStatement__ChildHelpersAssignment_4_2_1"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_2"
    // InternalMapping.g:3616:1: rule__VariableDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3620:1: ( ( RULE_ID ) )
            // InternalMapping.g:3621:2: ( RULE_ID )
            {
            // InternalMapping.g:3621:2: ( RULE_ID )
            // InternalMapping.g:3622:3: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__VariableDeclaration__ValueAssignment_3"
    // InternalMapping.g:3631:1: rule__VariableDeclaration__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMapping.g:3635:1: ( ( RULE_STRING ) )
            // InternalMapping.g:3636:2: ( RULE_STRING )
            {
            // InternalMapping.g:3636:2: ( RULE_STRING )
            // InternalMapping.g:3637:3: RULE_STRING
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getValueSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__ValueAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001830L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000023B021830L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});

}