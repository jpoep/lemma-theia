package de.fhdo.lemma.data.ide.contentassist.antlr.internal;

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
import de.fhdo.lemma.data.services.DataDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_BIG_DECIMAL", "RULE_BOOLEAN", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'collection'", "'list'", "'aggregate'", "'applicationService'", "'domainEvent'", "'domainService'", "'entity'", "'factory'", "'infrastructureService'", "'repository'", "'service'", "'specification'", "'valueObject'", "'identifier'", "'neverEmpty'", "'part'", "'closure'", "'sideEffectFree'", "'validator'", "'import'", "'datatypes'", "'from'", "'as'", "'version'", "'{'", "'}'", "'context'", "'structure'", "'<'", "'>'", "','", "'extends'", "'='", "'enum'", "'('", "')'", "'function'", "'::'", "'boolean'", "'byte'", "'char'", "'date'", "'double'", "'float'", "'int'", "'long'", "'short'", "'string'", "'unspecified'", "'.'", "'hide'", "'immutable'", "'procedure'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
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
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_BIG_DECIMAL=6;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
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


        public InternalDataDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDataDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDataDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDataDsl.g"; }


    	private DataDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(DataDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDataModel"
    // InternalDataDsl.g:53:1: entryRuleDataModel : ruleDataModel EOF ;
    public final void entryRuleDataModel() throws RecognitionException {
        try {
            // InternalDataDsl.g:54:1: ( ruleDataModel EOF )
            // InternalDataDsl.g:55:1: ruleDataModel EOF
            {
             before(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_1);
            ruleDataModel();

            state._fsp--;

             after(grammarAccess.getDataModelRule()); 
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
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // InternalDataDsl.g:62:1: ruleDataModel : ( ( rule__DataModel__Group__0 ) ) ;
    public final void ruleDataModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:66:2: ( ( ( rule__DataModel__Group__0 ) ) )
            // InternalDataDsl.g:67:2: ( ( rule__DataModel__Group__0 ) )
            {
            // InternalDataDsl.g:67:2: ( ( rule__DataModel__Group__0 ) )
            // InternalDataDsl.g:68:3: ( rule__DataModel__Group__0 )
            {
             before(grammarAccess.getDataModelAccess().getGroup()); 
            // InternalDataDsl.g:69:3: ( rule__DataModel__Group__0 )
            // InternalDataDsl.g:69:4: rule__DataModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleComplexTypeImport"
    // InternalDataDsl.g:78:1: entryRuleComplexTypeImport : ruleComplexTypeImport EOF ;
    public final void entryRuleComplexTypeImport() throws RecognitionException {
        try {
            // InternalDataDsl.g:79:1: ( ruleComplexTypeImport EOF )
            // InternalDataDsl.g:80:1: ruleComplexTypeImport EOF
            {
             before(grammarAccess.getComplexTypeImportRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexTypeImport();

            state._fsp--;

             after(grammarAccess.getComplexTypeImportRule()); 
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
    // $ANTLR end "entryRuleComplexTypeImport"


    // $ANTLR start "ruleComplexTypeImport"
    // InternalDataDsl.g:87:1: ruleComplexTypeImport : ( ( rule__ComplexTypeImport__Group__0 ) ) ;
    public final void ruleComplexTypeImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:91:2: ( ( ( rule__ComplexTypeImport__Group__0 ) ) )
            // InternalDataDsl.g:92:2: ( ( rule__ComplexTypeImport__Group__0 ) )
            {
            // InternalDataDsl.g:92:2: ( ( rule__ComplexTypeImport__Group__0 ) )
            // InternalDataDsl.g:93:3: ( rule__ComplexTypeImport__Group__0 )
            {
             before(grammarAccess.getComplexTypeImportAccess().getGroup()); 
            // InternalDataDsl.g:94:3: ( rule__ComplexTypeImport__Group__0 )
            // InternalDataDsl.g:94:4: rule__ComplexTypeImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTypeImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexTypeImport"


    // $ANTLR start "entryRuleVersion"
    // InternalDataDsl.g:103:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // InternalDataDsl.g:104:1: ( ruleVersion EOF )
            // InternalDataDsl.g:105:1: ruleVersion EOF
            {
             before(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getVersionRule()); 
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
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalDataDsl.g:112:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:116:2: ( ( ( rule__Version__Group__0 ) ) )
            // InternalDataDsl.g:117:2: ( ( rule__Version__Group__0 ) )
            {
            // InternalDataDsl.g:117:2: ( ( rule__Version__Group__0 ) )
            // InternalDataDsl.g:118:3: ( rule__Version__Group__0 )
            {
             before(grammarAccess.getVersionAccess().getGroup()); 
            // InternalDataDsl.g:119:3: ( rule__Version__Group__0 )
            // InternalDataDsl.g:119:4: rule__Version__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleContext"
    // InternalDataDsl.g:128:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // InternalDataDsl.g:129:1: ( ruleContext EOF )
            // InternalDataDsl.g:130:1: ruleContext EOF
            {
             before(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getContextRule()); 
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
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalDataDsl.g:137:1: ruleContext : ( ( rule__Context__Group__0 ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:141:2: ( ( ( rule__Context__Group__0 ) ) )
            // InternalDataDsl.g:142:2: ( ( rule__Context__Group__0 ) )
            {
            // InternalDataDsl.g:142:2: ( ( rule__Context__Group__0 ) )
            // InternalDataDsl.g:143:3: ( rule__Context__Group__0 )
            {
             before(grammarAccess.getContextAccess().getGroup()); 
            // InternalDataDsl.g:144:3: ( rule__Context__Group__0 )
            // InternalDataDsl.g:144:4: rule__Context__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Context__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleComplexType"
    // InternalDataDsl.g:153:1: entryRuleComplexType : ruleComplexType EOF ;
    public final void entryRuleComplexType() throws RecognitionException {
        try {
            // InternalDataDsl.g:154:1: ( ruleComplexType EOF )
            // InternalDataDsl.g:155:1: ruleComplexType EOF
            {
             before(grammarAccess.getComplexTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexType();

            state._fsp--;

             after(grammarAccess.getComplexTypeRule()); 
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
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // InternalDataDsl.g:162:1: ruleComplexType : ( ( rule__ComplexType__Alternatives ) ) ;
    public final void ruleComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:166:2: ( ( ( rule__ComplexType__Alternatives ) ) )
            // InternalDataDsl.g:167:2: ( ( rule__ComplexType__Alternatives ) )
            {
            // InternalDataDsl.g:167:2: ( ( rule__ComplexType__Alternatives ) )
            // InternalDataDsl.g:168:3: ( rule__ComplexType__Alternatives )
            {
             before(grammarAccess.getComplexTypeAccess().getAlternatives()); 
            // InternalDataDsl.g:169:3: ( rule__ComplexType__Alternatives )
            // InternalDataDsl.g:169:4: rule__ComplexType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComplexType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleDataStructure"
    // InternalDataDsl.g:178:1: entryRuleDataStructure : ruleDataStructure EOF ;
    public final void entryRuleDataStructure() throws RecognitionException {
        try {
            // InternalDataDsl.g:179:1: ( ruleDataStructure EOF )
            // InternalDataDsl.g:180:1: ruleDataStructure EOF
            {
             before(grammarAccess.getDataStructureRule()); 
            pushFollow(FOLLOW_1);
            ruleDataStructure();

            state._fsp--;

             after(grammarAccess.getDataStructureRule()); 
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
    // $ANTLR end "entryRuleDataStructure"


    // $ANTLR start "ruleDataStructure"
    // InternalDataDsl.g:187:1: ruleDataStructure : ( ( rule__DataStructure__Group__0 ) ) ;
    public final void ruleDataStructure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:191:2: ( ( ( rule__DataStructure__Group__0 ) ) )
            // InternalDataDsl.g:192:2: ( ( rule__DataStructure__Group__0 ) )
            {
            // InternalDataDsl.g:192:2: ( ( rule__DataStructure__Group__0 ) )
            // InternalDataDsl.g:193:3: ( rule__DataStructure__Group__0 )
            {
             before(grammarAccess.getDataStructureAccess().getGroup()); 
            // InternalDataDsl.g:194:3: ( rule__DataStructure__Group__0 )
            // InternalDataDsl.g:194:4: rule__DataStructure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataStructure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataStructureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataStructure"


    // $ANTLR start "entryRuleListType"
    // InternalDataDsl.g:203:1: entryRuleListType : ruleListType EOF ;
    public final void entryRuleListType() throws RecognitionException {
        try {
            // InternalDataDsl.g:204:1: ( ruleListType EOF )
            // InternalDataDsl.g:205:1: ruleListType EOF
            {
             before(grammarAccess.getListTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleListType();

            state._fsp--;

             after(grammarAccess.getListTypeRule()); 
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
    // $ANTLR end "entryRuleListType"


    // $ANTLR start "ruleListType"
    // InternalDataDsl.g:212:1: ruleListType : ( ( rule__ListType__Alternatives ) ) ;
    public final void ruleListType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:216:2: ( ( ( rule__ListType__Alternatives ) ) )
            // InternalDataDsl.g:217:2: ( ( rule__ListType__Alternatives ) )
            {
            // InternalDataDsl.g:217:2: ( ( rule__ListType__Alternatives ) )
            // InternalDataDsl.g:218:3: ( rule__ListType__Alternatives )
            {
             before(grammarAccess.getListTypeAccess().getAlternatives()); 
            // InternalDataDsl.g:219:3: ( rule__ListType__Alternatives )
            // InternalDataDsl.g:219:4: rule__ListType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ListType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListType"


    // $ANTLR start "entryRuleDataField"
    // InternalDataDsl.g:228:1: entryRuleDataField : ruleDataField EOF ;
    public final void entryRuleDataField() throws RecognitionException {
        try {
            // InternalDataDsl.g:229:1: ( ruleDataField EOF )
            // InternalDataDsl.g:230:1: ruleDataField EOF
            {
             before(grammarAccess.getDataFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleDataField();

            state._fsp--;

             after(grammarAccess.getDataFieldRule()); 
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
    // $ANTLR end "entryRuleDataField"


    // $ANTLR start "ruleDataField"
    // InternalDataDsl.g:237:1: ruleDataField : ( ( rule__DataField__Group__0 ) ) ;
    public final void ruleDataField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:241:2: ( ( ( rule__DataField__Group__0 ) ) )
            // InternalDataDsl.g:242:2: ( ( rule__DataField__Group__0 ) )
            {
            // InternalDataDsl.g:242:2: ( ( rule__DataField__Group__0 ) )
            // InternalDataDsl.g:243:3: ( rule__DataField__Group__0 )
            {
             before(grammarAccess.getDataFieldAccess().getGroup()); 
            // InternalDataDsl.g:244:3: ( rule__DataField__Group__0 )
            // InternalDataDsl.g:244:4: rule__DataField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataField"


    // $ANTLR start "entryRuleEnumeration"
    // InternalDataDsl.g:253:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalDataDsl.g:254:1: ( ruleEnumeration EOF )
            // InternalDataDsl.g:255:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalDataDsl.g:262:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:266:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalDataDsl.g:267:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalDataDsl.g:267:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalDataDsl.g:268:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalDataDsl.g:269:3: ( rule__Enumeration__Group__0 )
            // InternalDataDsl.g:269:4: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEnumerationField"
    // InternalDataDsl.g:278:1: entryRuleEnumerationField : ruleEnumerationField EOF ;
    public final void entryRuleEnumerationField() throws RecognitionException {
        try {
            // InternalDataDsl.g:279:1: ( ruleEnumerationField EOF )
            // InternalDataDsl.g:280:1: ruleEnumerationField EOF
            {
             before(grammarAccess.getEnumerationFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumerationField();

            state._fsp--;

             after(grammarAccess.getEnumerationFieldRule()); 
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
    // $ANTLR end "entryRuleEnumerationField"


    // $ANTLR start "ruleEnumerationField"
    // InternalDataDsl.g:287:1: ruleEnumerationField : ( ( rule__EnumerationField__Group__0 ) ) ;
    public final void ruleEnumerationField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:291:2: ( ( ( rule__EnumerationField__Group__0 ) ) )
            // InternalDataDsl.g:292:2: ( ( rule__EnumerationField__Group__0 ) )
            {
            // InternalDataDsl.g:292:2: ( ( rule__EnumerationField__Group__0 ) )
            // InternalDataDsl.g:293:3: ( rule__EnumerationField__Group__0 )
            {
             before(grammarAccess.getEnumerationFieldAccess().getGroup()); 
            // InternalDataDsl.g:294:3: ( rule__EnumerationField__Group__0 )
            // InternalDataDsl.g:294:4: rule__EnumerationField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationField"


    // $ANTLR start "entryRuleDataOperation"
    // InternalDataDsl.g:303:1: entryRuleDataOperation : ruleDataOperation EOF ;
    public final void entryRuleDataOperation() throws RecognitionException {
        try {
            // InternalDataDsl.g:304:1: ( ruleDataOperation EOF )
            // InternalDataDsl.g:305:1: ruleDataOperation EOF
            {
             before(grammarAccess.getDataOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleDataOperation();

            state._fsp--;

             after(grammarAccess.getDataOperationRule()); 
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
    // $ANTLR end "entryRuleDataOperation"


    // $ANTLR start "ruleDataOperation"
    // InternalDataDsl.g:312:1: ruleDataOperation : ( ( rule__DataOperation__Group__0 ) ) ;
    public final void ruleDataOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:316:2: ( ( ( rule__DataOperation__Group__0 ) ) )
            // InternalDataDsl.g:317:2: ( ( rule__DataOperation__Group__0 ) )
            {
            // InternalDataDsl.g:317:2: ( ( rule__DataOperation__Group__0 ) )
            // InternalDataDsl.g:318:3: ( rule__DataOperation__Group__0 )
            {
             before(grammarAccess.getDataOperationAccess().getGroup()); 
            // InternalDataDsl.g:319:3: ( rule__DataOperation__Group__0 )
            // InternalDataDsl.g:319:4: rule__DataOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataOperation"


    // $ANTLR start "entryRuleDataOperationParameter"
    // InternalDataDsl.g:328:1: entryRuleDataOperationParameter : ruleDataOperationParameter EOF ;
    public final void entryRuleDataOperationParameter() throws RecognitionException {
        try {
            // InternalDataDsl.g:329:1: ( ruleDataOperationParameter EOF )
            // InternalDataDsl.g:330:1: ruleDataOperationParameter EOF
            {
             before(grammarAccess.getDataOperationParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleDataOperationParameter();

            state._fsp--;

             after(grammarAccess.getDataOperationParameterRule()); 
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
    // $ANTLR end "entryRuleDataOperationParameter"


    // $ANTLR start "ruleDataOperationParameter"
    // InternalDataDsl.g:337:1: ruleDataOperationParameter : ( ( rule__DataOperationParameter__Group__0 ) ) ;
    public final void ruleDataOperationParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:341:2: ( ( ( rule__DataOperationParameter__Group__0 ) ) )
            // InternalDataDsl.g:342:2: ( ( rule__DataOperationParameter__Group__0 ) )
            {
            // InternalDataDsl.g:342:2: ( ( rule__DataOperationParameter__Group__0 ) )
            // InternalDataDsl.g:343:3: ( rule__DataOperationParameter__Group__0 )
            {
             before(grammarAccess.getDataOperationParameterAccess().getGroup()); 
            // InternalDataDsl.g:344:3: ( rule__DataOperationParameter__Group__0 )
            // InternalDataDsl.g:344:4: rule__DataOperationParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataOperationParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataOperationParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataOperationParameter"


    // $ANTLR start "entryRulePrimitiveValue"
    // InternalDataDsl.g:353:1: entryRulePrimitiveValue : rulePrimitiveValue EOF ;
    public final void entryRulePrimitiveValue() throws RecognitionException {
        try {
            // InternalDataDsl.g:354:1: ( rulePrimitiveValue EOF )
            // InternalDataDsl.g:355:1: rulePrimitiveValue EOF
            {
             before(grammarAccess.getPrimitiveValueRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveValue();

            state._fsp--;

             after(grammarAccess.getPrimitiveValueRule()); 
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
    // $ANTLR end "entryRulePrimitiveValue"


    // $ANTLR start "rulePrimitiveValue"
    // InternalDataDsl.g:362:1: rulePrimitiveValue : ( ( rule__PrimitiveValue__Alternatives ) ) ;
    public final void rulePrimitiveValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:366:2: ( ( ( rule__PrimitiveValue__Alternatives ) ) )
            // InternalDataDsl.g:367:2: ( ( rule__PrimitiveValue__Alternatives ) )
            {
            // InternalDataDsl.g:367:2: ( ( rule__PrimitiveValue__Alternatives ) )
            // InternalDataDsl.g:368:3: ( rule__PrimitiveValue__Alternatives )
            {
             before(grammarAccess.getPrimitiveValueAccess().getAlternatives()); 
            // InternalDataDsl.g:369:3: ( rule__PrimitiveValue__Alternatives )
            // InternalDataDsl.g:369:4: rule__PrimitiveValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveValue"


    // $ANTLR start "entryRuleImportedComplexType"
    // InternalDataDsl.g:378:1: entryRuleImportedComplexType : ruleImportedComplexType EOF ;
    public final void entryRuleImportedComplexType() throws RecognitionException {
        try {
            // InternalDataDsl.g:379:1: ( ruleImportedComplexType EOF )
            // InternalDataDsl.g:380:1: ruleImportedComplexType EOF
            {
             before(grammarAccess.getImportedComplexTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleImportedComplexType();

            state._fsp--;

             after(grammarAccess.getImportedComplexTypeRule()); 
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
    // $ANTLR end "entryRuleImportedComplexType"


    // $ANTLR start "ruleImportedComplexType"
    // InternalDataDsl.g:387:1: ruleImportedComplexType : ( ( rule__ImportedComplexType__Group__0 ) ) ;
    public final void ruleImportedComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:391:2: ( ( ( rule__ImportedComplexType__Group__0 ) ) )
            // InternalDataDsl.g:392:2: ( ( rule__ImportedComplexType__Group__0 ) )
            {
            // InternalDataDsl.g:392:2: ( ( rule__ImportedComplexType__Group__0 ) )
            // InternalDataDsl.g:393:3: ( rule__ImportedComplexType__Group__0 )
            {
             before(grammarAccess.getImportedComplexTypeAccess().getGroup()); 
            // InternalDataDsl.g:394:3: ( rule__ImportedComplexType__Group__0 )
            // InternalDataDsl.g:394:4: rule__ImportedComplexType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportedComplexType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportedComplexTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportedComplexType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalDataDsl.g:403:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalDataDsl.g:404:1: ( rulePrimitiveType EOF )
            // InternalDataDsl.g:405:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalDataDsl.g:412:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:416:2: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // InternalDataDsl.g:417:2: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // InternalDataDsl.g:417:2: ( ( rule__PrimitiveType__Alternatives ) )
            // InternalDataDsl.g:418:3: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // InternalDataDsl.g:419:3: ( rule__PrimitiveType__Alternatives )
            // InternalDataDsl.g:419:4: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDataDsl.g:428:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalDataDsl.g:429:1: ( ruleQualifiedName EOF )
            // InternalDataDsl.g:430:1: ruleQualifiedName EOF
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
    // InternalDataDsl.g:437:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:441:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalDataDsl.g:442:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalDataDsl.g:442:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalDataDsl.g:443:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalDataDsl.g:444:3: ( rule__QualifiedName__Group__0 )
            // InternalDataDsl.g:444:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "ruleComplexTypeFeature"
    // InternalDataDsl.g:453:1: ruleComplexTypeFeature : ( ( rule__ComplexTypeFeature__Alternatives ) ) ;
    public final void ruleComplexTypeFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:457:1: ( ( ( rule__ComplexTypeFeature__Alternatives ) ) )
            // InternalDataDsl.g:458:2: ( ( rule__ComplexTypeFeature__Alternatives ) )
            {
            // InternalDataDsl.g:458:2: ( ( rule__ComplexTypeFeature__Alternatives ) )
            // InternalDataDsl.g:459:3: ( rule__ComplexTypeFeature__Alternatives )
            {
             before(grammarAccess.getComplexTypeFeatureAccess().getAlternatives()); 
            // InternalDataDsl.g:460:3: ( rule__ComplexTypeFeature__Alternatives )
            // InternalDataDsl.g:460:4: rule__ComplexTypeFeature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTypeFeature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexTypeFeature"


    // $ANTLR start "ruleDataFieldFeature"
    // InternalDataDsl.g:469:1: ruleDataFieldFeature : ( ( rule__DataFieldFeature__Alternatives ) ) ;
    public final void ruleDataFieldFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:473:1: ( ( ( rule__DataFieldFeature__Alternatives ) ) )
            // InternalDataDsl.g:474:2: ( ( rule__DataFieldFeature__Alternatives ) )
            {
            // InternalDataDsl.g:474:2: ( ( rule__DataFieldFeature__Alternatives ) )
            // InternalDataDsl.g:475:3: ( rule__DataFieldFeature__Alternatives )
            {
             before(grammarAccess.getDataFieldFeatureAccess().getAlternatives()); 
            // InternalDataDsl.g:476:3: ( rule__DataFieldFeature__Alternatives )
            // InternalDataDsl.g:476:4: rule__DataFieldFeature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataFieldFeature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataFieldFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataFieldFeature"


    // $ANTLR start "ruleDataOperationFeature"
    // InternalDataDsl.g:485:1: ruleDataOperationFeature : ( ( rule__DataOperationFeature__Alternatives ) ) ;
    public final void ruleDataOperationFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:489:1: ( ( ( rule__DataOperationFeature__Alternatives ) ) )
            // InternalDataDsl.g:490:2: ( ( rule__DataOperationFeature__Alternatives ) )
            {
            // InternalDataDsl.g:490:2: ( ( rule__DataOperationFeature__Alternatives ) )
            // InternalDataDsl.g:491:3: ( rule__DataOperationFeature__Alternatives )
            {
             before(grammarAccess.getDataOperationFeatureAccess().getAlternatives()); 
            // InternalDataDsl.g:492:3: ( rule__DataOperationFeature__Alternatives )
            // InternalDataDsl.g:492:4: rule__DataOperationFeature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataOperationFeature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataOperationFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataOperationFeature"


    // $ANTLR start "rule__DataModel__Alternatives_1"
    // InternalDataDsl.g:500:1: rule__DataModel__Alternatives_1 : ( ( ( ( rule__DataModel__VersionsAssignment_1_0 ) ) ( ( rule__DataModel__VersionsAssignment_1_0 )* ) ) | ( ( ( rule__DataModel__ContextsAssignment_1_1 ) ) ( ( rule__DataModel__ContextsAssignment_1_1 )* ) ) | ( ( ( rule__DataModel__ComplexTypesAssignment_1_2 ) ) ( ( rule__DataModel__ComplexTypesAssignment_1_2 )* ) ) );
    public final void rule__DataModel__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:504:1: ( ( ( ( rule__DataModel__VersionsAssignment_1_0 ) ) ( ( rule__DataModel__VersionsAssignment_1_0 )* ) ) | ( ( ( rule__DataModel__ContextsAssignment_1_1 ) ) ( ( rule__DataModel__ContextsAssignment_1_1 )* ) ) | ( ( ( rule__DataModel__ComplexTypesAssignment_1_2 ) ) ( ( rule__DataModel__ComplexTypesAssignment_1_2 )* ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt4=1;
                }
                break;
            case 39:
                {
                alt4=2;
                }
                break;
            case 13:
            case 14:
            case 40:
            case 46:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDataDsl.g:505:2: ( ( ( rule__DataModel__VersionsAssignment_1_0 ) ) ( ( rule__DataModel__VersionsAssignment_1_0 )* ) )
                    {
                    // InternalDataDsl.g:505:2: ( ( ( rule__DataModel__VersionsAssignment_1_0 ) ) ( ( rule__DataModel__VersionsAssignment_1_0 )* ) )
                    // InternalDataDsl.g:506:3: ( ( rule__DataModel__VersionsAssignment_1_0 ) ) ( ( rule__DataModel__VersionsAssignment_1_0 )* )
                    {
                    // InternalDataDsl.g:506:3: ( ( rule__DataModel__VersionsAssignment_1_0 ) )
                    // InternalDataDsl.g:507:4: ( rule__DataModel__VersionsAssignment_1_0 )
                    {
                     before(grammarAccess.getDataModelAccess().getVersionsAssignment_1_0()); 
                    // InternalDataDsl.g:508:4: ( rule__DataModel__VersionsAssignment_1_0 )
                    // InternalDataDsl.g:508:5: rule__DataModel__VersionsAssignment_1_0
                    {
                    pushFollow(FOLLOW_3);
                    rule__DataModel__VersionsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataModelAccess().getVersionsAssignment_1_0()); 

                    }

                    // InternalDataDsl.g:511:3: ( ( rule__DataModel__VersionsAssignment_1_0 )* )
                    // InternalDataDsl.g:512:4: ( rule__DataModel__VersionsAssignment_1_0 )*
                    {
                     before(grammarAccess.getDataModelAccess().getVersionsAssignment_1_0()); 
                    // InternalDataDsl.g:513:4: ( rule__DataModel__VersionsAssignment_1_0 )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==36) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDataDsl.g:513:5: rule__DataModel__VersionsAssignment_1_0
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__DataModel__VersionsAssignment_1_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                     after(grammarAccess.getDataModelAccess().getVersionsAssignment_1_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:518:2: ( ( ( rule__DataModel__ContextsAssignment_1_1 ) ) ( ( rule__DataModel__ContextsAssignment_1_1 )* ) )
                    {
                    // InternalDataDsl.g:518:2: ( ( ( rule__DataModel__ContextsAssignment_1_1 ) ) ( ( rule__DataModel__ContextsAssignment_1_1 )* ) )
                    // InternalDataDsl.g:519:3: ( ( rule__DataModel__ContextsAssignment_1_1 ) ) ( ( rule__DataModel__ContextsAssignment_1_1 )* )
                    {
                    // InternalDataDsl.g:519:3: ( ( rule__DataModel__ContextsAssignment_1_1 ) )
                    // InternalDataDsl.g:520:4: ( rule__DataModel__ContextsAssignment_1_1 )
                    {
                     before(grammarAccess.getDataModelAccess().getContextsAssignment_1_1()); 
                    // InternalDataDsl.g:521:4: ( rule__DataModel__ContextsAssignment_1_1 )
                    // InternalDataDsl.g:521:5: rule__DataModel__ContextsAssignment_1_1
                    {
                    pushFollow(FOLLOW_4);
                    rule__DataModel__ContextsAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataModelAccess().getContextsAssignment_1_1()); 

                    }

                    // InternalDataDsl.g:524:3: ( ( rule__DataModel__ContextsAssignment_1_1 )* )
                    // InternalDataDsl.g:525:4: ( rule__DataModel__ContextsAssignment_1_1 )*
                    {
                     before(grammarAccess.getDataModelAccess().getContextsAssignment_1_1()); 
                    // InternalDataDsl.g:526:4: ( rule__DataModel__ContextsAssignment_1_1 )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==39) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalDataDsl.g:526:5: rule__DataModel__ContextsAssignment_1_1
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__DataModel__ContextsAssignment_1_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                     after(grammarAccess.getDataModelAccess().getContextsAssignment_1_1()); 

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:531:2: ( ( ( rule__DataModel__ComplexTypesAssignment_1_2 ) ) ( ( rule__DataModel__ComplexTypesAssignment_1_2 )* ) )
                    {
                    // InternalDataDsl.g:531:2: ( ( ( rule__DataModel__ComplexTypesAssignment_1_2 ) ) ( ( rule__DataModel__ComplexTypesAssignment_1_2 )* ) )
                    // InternalDataDsl.g:532:3: ( ( rule__DataModel__ComplexTypesAssignment_1_2 ) ) ( ( rule__DataModel__ComplexTypesAssignment_1_2 )* )
                    {
                    // InternalDataDsl.g:532:3: ( ( rule__DataModel__ComplexTypesAssignment_1_2 ) )
                    // InternalDataDsl.g:533:4: ( rule__DataModel__ComplexTypesAssignment_1_2 )
                    {
                     before(grammarAccess.getDataModelAccess().getComplexTypesAssignment_1_2()); 
                    // InternalDataDsl.g:534:4: ( rule__DataModel__ComplexTypesAssignment_1_2 )
                    // InternalDataDsl.g:534:5: rule__DataModel__ComplexTypesAssignment_1_2
                    {
                    pushFollow(FOLLOW_5);
                    rule__DataModel__ComplexTypesAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataModelAccess().getComplexTypesAssignment_1_2()); 

                    }

                    // InternalDataDsl.g:537:3: ( ( rule__DataModel__ComplexTypesAssignment_1_2 )* )
                    // InternalDataDsl.g:538:4: ( rule__DataModel__ComplexTypesAssignment_1_2 )*
                    {
                     before(grammarAccess.getDataModelAccess().getComplexTypesAssignment_1_2()); 
                    // InternalDataDsl.g:539:4: ( rule__DataModel__ComplexTypesAssignment_1_2 )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=13 && LA3_0<=14)||LA3_0==40||LA3_0==46) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDataDsl.g:539:5: rule__DataModel__ComplexTypesAssignment_1_2
                    	    {
                    	    pushFollow(FOLLOW_5);
                    	    rule__DataModel__ComplexTypesAssignment_1_2();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                     after(grammarAccess.getDataModelAccess().getComplexTypesAssignment_1_2()); 

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
    // $ANTLR end "rule__DataModel__Alternatives_1"


    // $ANTLR start "rule__Version__Alternatives_3"
    // InternalDataDsl.g:548:1: rule__Version__Alternatives_3 : ( ( ( ( rule__Version__ComplexTypesAssignment_3_0 ) ) ( ( rule__Version__ComplexTypesAssignment_3_0 )* ) ) | ( ( ( rule__Version__ContextsAssignment_3_1 ) ) ( ( rule__Version__ContextsAssignment_3_1 )* ) ) );
    public final void rule__Version__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:552:1: ( ( ( ( rule__Version__ComplexTypesAssignment_3_0 ) ) ( ( rule__Version__ComplexTypesAssignment_3_0 )* ) ) | ( ( ( rule__Version__ContextsAssignment_3_1 ) ) ( ( rule__Version__ContextsAssignment_3_1 )* ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=13 && LA7_0<=14)||LA7_0==40||LA7_0==46) ) {
                alt7=1;
            }
            else if ( (LA7_0==39) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDataDsl.g:553:2: ( ( ( rule__Version__ComplexTypesAssignment_3_0 ) ) ( ( rule__Version__ComplexTypesAssignment_3_0 )* ) )
                    {
                    // InternalDataDsl.g:553:2: ( ( ( rule__Version__ComplexTypesAssignment_3_0 ) ) ( ( rule__Version__ComplexTypesAssignment_3_0 )* ) )
                    // InternalDataDsl.g:554:3: ( ( rule__Version__ComplexTypesAssignment_3_0 ) ) ( ( rule__Version__ComplexTypesAssignment_3_0 )* )
                    {
                    // InternalDataDsl.g:554:3: ( ( rule__Version__ComplexTypesAssignment_3_0 ) )
                    // InternalDataDsl.g:555:4: ( rule__Version__ComplexTypesAssignment_3_0 )
                    {
                     before(grammarAccess.getVersionAccess().getComplexTypesAssignment_3_0()); 
                    // InternalDataDsl.g:556:4: ( rule__Version__ComplexTypesAssignment_3_0 )
                    // InternalDataDsl.g:556:5: rule__Version__ComplexTypesAssignment_3_0
                    {
                    pushFollow(FOLLOW_5);
                    rule__Version__ComplexTypesAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVersionAccess().getComplexTypesAssignment_3_0()); 

                    }

                    // InternalDataDsl.g:559:3: ( ( rule__Version__ComplexTypesAssignment_3_0 )* )
                    // InternalDataDsl.g:560:4: ( rule__Version__ComplexTypesAssignment_3_0 )*
                    {
                     before(grammarAccess.getVersionAccess().getComplexTypesAssignment_3_0()); 
                    // InternalDataDsl.g:561:4: ( rule__Version__ComplexTypesAssignment_3_0 )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=13 && LA5_0<=14)||LA5_0==40||LA5_0==46) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDataDsl.g:561:5: rule__Version__ComplexTypesAssignment_3_0
                    	    {
                    	    pushFollow(FOLLOW_5);
                    	    rule__Version__ComplexTypesAssignment_3_0();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                     after(grammarAccess.getVersionAccess().getComplexTypesAssignment_3_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:566:2: ( ( ( rule__Version__ContextsAssignment_3_1 ) ) ( ( rule__Version__ContextsAssignment_3_1 )* ) )
                    {
                    // InternalDataDsl.g:566:2: ( ( ( rule__Version__ContextsAssignment_3_1 ) ) ( ( rule__Version__ContextsAssignment_3_1 )* ) )
                    // InternalDataDsl.g:567:3: ( ( rule__Version__ContextsAssignment_3_1 ) ) ( ( rule__Version__ContextsAssignment_3_1 )* )
                    {
                    // InternalDataDsl.g:567:3: ( ( rule__Version__ContextsAssignment_3_1 ) )
                    // InternalDataDsl.g:568:4: ( rule__Version__ContextsAssignment_3_1 )
                    {
                     before(grammarAccess.getVersionAccess().getContextsAssignment_3_1()); 
                    // InternalDataDsl.g:569:4: ( rule__Version__ContextsAssignment_3_1 )
                    // InternalDataDsl.g:569:5: rule__Version__ContextsAssignment_3_1
                    {
                    pushFollow(FOLLOW_4);
                    rule__Version__ContextsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVersionAccess().getContextsAssignment_3_1()); 

                    }

                    // InternalDataDsl.g:572:3: ( ( rule__Version__ContextsAssignment_3_1 )* )
                    // InternalDataDsl.g:573:4: ( rule__Version__ContextsAssignment_3_1 )*
                    {
                     before(grammarAccess.getVersionAccess().getContextsAssignment_3_1()); 
                    // InternalDataDsl.g:574:4: ( rule__Version__ContextsAssignment_3_1 )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==39) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDataDsl.g:574:5: rule__Version__ContextsAssignment_3_1
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__Version__ContextsAssignment_3_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                     after(grammarAccess.getVersionAccess().getContextsAssignment_3_1()); 

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
    // $ANTLR end "rule__Version__Alternatives_3"


    // $ANTLR start "rule__ComplexType__Alternatives"
    // InternalDataDsl.g:583:1: rule__ComplexType__Alternatives : ( ( ruleDataStructure ) | ( ruleListType ) | ( ruleEnumeration ) );
    public final void rule__ComplexType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:587:1: ( ( ruleDataStructure ) | ( ruleListType ) | ( ruleEnumeration ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt8=1;
                }
                break;
            case 13:
            case 14:
                {
                alt8=2;
                }
                break;
            case 46:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDataDsl.g:588:2: ( ruleDataStructure )
                    {
                    // InternalDataDsl.g:588:2: ( ruleDataStructure )
                    // InternalDataDsl.g:589:3: ruleDataStructure
                    {
                     before(grammarAccess.getComplexTypeAccess().getDataStructureParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataStructure();

                    state._fsp--;

                     after(grammarAccess.getComplexTypeAccess().getDataStructureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:594:2: ( ruleListType )
                    {
                    // InternalDataDsl.g:594:2: ( ruleListType )
                    // InternalDataDsl.g:595:3: ruleListType
                    {
                     before(grammarAccess.getComplexTypeAccess().getListTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleListType();

                    state._fsp--;

                     after(grammarAccess.getComplexTypeAccess().getListTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:600:2: ( ruleEnumeration )
                    {
                    // InternalDataDsl.g:600:2: ( ruleEnumeration )
                    // InternalDataDsl.g:601:3: ruleEnumeration
                    {
                     before(grammarAccess.getComplexTypeAccess().getEnumerationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getComplexTypeAccess().getEnumerationParserRuleCall_2()); 

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
    // $ANTLR end "rule__ComplexType__Alternatives"


    // $ANTLR start "rule__DataStructure__Alternatives_5_0"
    // InternalDataDsl.g:610:1: rule__DataStructure__Alternatives_5_0 : ( ( ( rule__DataStructure__DataFieldsAssignment_5_0_0 ) ) | ( ( rule__DataStructure__OperationsAssignment_5_0_1 ) ) );
    public final void rule__DataStructure__Alternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:614:1: ( ( ( rule__DataStructure__DataFieldsAssignment_5_0_0 ) ) | ( ( rule__DataStructure__OperationsAssignment_5_0_1 ) ) )
            int alt9=2;
            switch ( input.LA(1) ) {
            case 63:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_ID||(LA9_1>=51 && LA9_1<=61)||LA9_1==64) ) {
                    alt9=1;
                }
                else if ( (LA9_1==49||LA9_1==65) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 64:
                {
                alt9=1;
                }
                break;
            case 49:
            case 65:
                {
                alt9=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDataDsl.g:615:2: ( ( rule__DataStructure__DataFieldsAssignment_5_0_0 ) )
                    {
                    // InternalDataDsl.g:615:2: ( ( rule__DataStructure__DataFieldsAssignment_5_0_0 ) )
                    // InternalDataDsl.g:616:3: ( rule__DataStructure__DataFieldsAssignment_5_0_0 )
                    {
                     before(grammarAccess.getDataStructureAccess().getDataFieldsAssignment_5_0_0()); 
                    // InternalDataDsl.g:617:3: ( rule__DataStructure__DataFieldsAssignment_5_0_0 )
                    // InternalDataDsl.g:617:4: rule__DataStructure__DataFieldsAssignment_5_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataStructure__DataFieldsAssignment_5_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataStructureAccess().getDataFieldsAssignment_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:621:2: ( ( rule__DataStructure__OperationsAssignment_5_0_1 ) )
                    {
                    // InternalDataDsl.g:621:2: ( ( rule__DataStructure__OperationsAssignment_5_0_1 ) )
                    // InternalDataDsl.g:622:3: ( rule__DataStructure__OperationsAssignment_5_0_1 )
                    {
                     before(grammarAccess.getDataStructureAccess().getOperationsAssignment_5_0_1()); 
                    // InternalDataDsl.g:623:3: ( rule__DataStructure__OperationsAssignment_5_0_1 )
                    // InternalDataDsl.g:623:4: rule__DataStructure__OperationsAssignment_5_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataStructure__OperationsAssignment_5_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataStructureAccess().getOperationsAssignment_5_0_1()); 

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
    // $ANTLR end "rule__DataStructure__Alternatives_5_0"


    // $ANTLR start "rule__DataStructure__Alternatives_5_1_1"
    // InternalDataDsl.g:631:1: rule__DataStructure__Alternatives_5_1_1 : ( ( ( rule__DataStructure__DataFieldsAssignment_5_1_1_0 ) ) | ( ( rule__DataStructure__OperationsAssignment_5_1_1_1 ) ) );
    public final void rule__DataStructure__Alternatives_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:635:1: ( ( ( rule__DataStructure__DataFieldsAssignment_5_1_1_0 ) ) | ( ( rule__DataStructure__OperationsAssignment_5_1_1_1 ) ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case 63:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==49||LA10_1==65) ) {
                    alt10=2;
                }
                else if ( (LA10_1==RULE_ID||(LA10_1>=51 && LA10_1<=61)||LA10_1==64) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 64:
                {
                alt10=1;
                }
                break;
            case 49:
            case 65:
                {
                alt10=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDataDsl.g:636:2: ( ( rule__DataStructure__DataFieldsAssignment_5_1_1_0 ) )
                    {
                    // InternalDataDsl.g:636:2: ( ( rule__DataStructure__DataFieldsAssignment_5_1_1_0 ) )
                    // InternalDataDsl.g:637:3: ( rule__DataStructure__DataFieldsAssignment_5_1_1_0 )
                    {
                     before(grammarAccess.getDataStructureAccess().getDataFieldsAssignment_5_1_1_0()); 
                    // InternalDataDsl.g:638:3: ( rule__DataStructure__DataFieldsAssignment_5_1_1_0 )
                    // InternalDataDsl.g:638:4: rule__DataStructure__DataFieldsAssignment_5_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataStructure__DataFieldsAssignment_5_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataStructureAccess().getDataFieldsAssignment_5_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:642:2: ( ( rule__DataStructure__OperationsAssignment_5_1_1_1 ) )
                    {
                    // InternalDataDsl.g:642:2: ( ( rule__DataStructure__OperationsAssignment_5_1_1_1 ) )
                    // InternalDataDsl.g:643:3: ( rule__DataStructure__OperationsAssignment_5_1_1_1 )
                    {
                     before(grammarAccess.getDataStructureAccess().getOperationsAssignment_5_1_1_1()); 
                    // InternalDataDsl.g:644:3: ( rule__DataStructure__OperationsAssignment_5_1_1_1 )
                    // InternalDataDsl.g:644:4: rule__DataStructure__OperationsAssignment_5_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataStructure__OperationsAssignment_5_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataStructureAccess().getOperationsAssignment_5_1_1_1()); 

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
    // $ANTLR end "rule__DataStructure__Alternatives_5_1_1"


    // $ANTLR start "rule__ListType__Alternatives"
    // InternalDataDsl.g:652:1: rule__ListType__Alternatives : ( ( ( rule__ListType__Group_0__0 ) ) | ( ( rule__ListType__Group_1__0 ) ) );
    public final void rule__ListType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:656:1: ( ( ( rule__ListType__Group_0__0 ) ) | ( ( rule__ListType__Group_1__0 ) ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalDataDsl.g:657:2: ( ( rule__ListType__Group_0__0 ) )
                    {
                    // InternalDataDsl.g:657:2: ( ( rule__ListType__Group_0__0 ) )
                    // InternalDataDsl.g:658:3: ( rule__ListType__Group_0__0 )
                    {
                     before(grammarAccess.getListTypeAccess().getGroup_0()); 
                    // InternalDataDsl.g:659:3: ( rule__ListType__Group_0__0 )
                    // InternalDataDsl.g:659:4: rule__ListType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getListTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:663:2: ( ( rule__ListType__Group_1__0 ) )
                    {
                    // InternalDataDsl.g:663:2: ( ( rule__ListType__Group_1__0 ) )
                    // InternalDataDsl.g:664:3: ( rule__ListType__Group_1__0 )
                    {
                     before(grammarAccess.getListTypeAccess().getGroup_1()); 
                    // InternalDataDsl.g:665:3: ( rule__ListType__Group_1__0 )
                    // InternalDataDsl.g:665:4: rule__ListType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ListType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getListTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ListType__Alternatives"


    // $ANTLR start "rule__ListType__Alternatives_0_0"
    // InternalDataDsl.g:673:1: rule__ListType__Alternatives_0_0 : ( ( 'collection' ) | ( 'list' ) );
    public final void rule__ListType__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:677:1: ( ( 'collection' ) | ( 'list' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            else if ( (LA12_0==14) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDataDsl.g:678:2: ( 'collection' )
                    {
                    // InternalDataDsl.g:678:2: ( 'collection' )
                    // InternalDataDsl.g:679:3: 'collection'
                    {
                     before(grammarAccess.getListTypeAccess().getCollectionKeyword_0_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getListTypeAccess().getCollectionKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:684:2: ( 'list' )
                    {
                    // InternalDataDsl.g:684:2: ( 'list' )
                    // InternalDataDsl.g:685:3: 'list'
                    {
                     before(grammarAccess.getListTypeAccess().getListKeyword_0_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getListTypeAccess().getListKeyword_0_0_1()); 

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
    // $ANTLR end "rule__ListType__Alternatives_0_0"


    // $ANTLR start "rule__ListType__Alternatives_1_0"
    // InternalDataDsl.g:694:1: rule__ListType__Alternatives_1_0 : ( ( 'collection' ) | ( 'list' ) );
    public final void rule__ListType__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:698:1: ( ( 'collection' ) | ( 'list' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            else if ( (LA13_0==14) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDataDsl.g:699:2: ( 'collection' )
                    {
                    // InternalDataDsl.g:699:2: ( 'collection' )
                    // InternalDataDsl.g:700:3: 'collection'
                    {
                     before(grammarAccess.getListTypeAccess().getCollectionKeyword_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getListTypeAccess().getCollectionKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:705:2: ( 'list' )
                    {
                    // InternalDataDsl.g:705:2: ( 'list' )
                    // InternalDataDsl.g:706:3: 'list'
                    {
                     before(grammarAccess.getListTypeAccess().getListKeyword_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getListTypeAccess().getListKeyword_1_0_1()); 

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
    // $ANTLR end "rule__ListType__Alternatives_1_0"


    // $ANTLR start "rule__DataField__Alternatives_2"
    // InternalDataDsl.g:715:1: rule__DataField__Alternatives_2 : ( ( ( rule__DataField__PrimitiveTypeAssignment_2_0 ) ) | ( ( rule__DataField__ComplexTypeAssignment_2_1 ) ) | ( ( rule__DataField__ImportedComplexTypeAssignment_2_2 ) ) );
    public final void rule__DataField__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:719:1: ( ( ( rule__DataField__PrimitiveTypeAssignment_2_0 ) ) | ( ( rule__DataField__ComplexTypeAssignment_2_1 ) ) | ( ( rule__DataField__ImportedComplexTypeAssignment_2_2 ) ) )
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=51 && LA14_0<=61)) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==50) ) {
                    alt14=3;
                }
                else if ( (LA14_2==RULE_ID||LA14_2==62) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalDataDsl.g:720:2: ( ( rule__DataField__PrimitiveTypeAssignment_2_0 ) )
                    {
                    // InternalDataDsl.g:720:2: ( ( rule__DataField__PrimitiveTypeAssignment_2_0 ) )
                    // InternalDataDsl.g:721:3: ( rule__DataField__PrimitiveTypeAssignment_2_0 )
                    {
                     before(grammarAccess.getDataFieldAccess().getPrimitiveTypeAssignment_2_0()); 
                    // InternalDataDsl.g:722:3: ( rule__DataField__PrimitiveTypeAssignment_2_0 )
                    // InternalDataDsl.g:722:4: rule__DataField__PrimitiveTypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataField__PrimitiveTypeAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataFieldAccess().getPrimitiveTypeAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:726:2: ( ( rule__DataField__ComplexTypeAssignment_2_1 ) )
                    {
                    // InternalDataDsl.g:726:2: ( ( rule__DataField__ComplexTypeAssignment_2_1 ) )
                    // InternalDataDsl.g:727:3: ( rule__DataField__ComplexTypeAssignment_2_1 )
                    {
                     before(grammarAccess.getDataFieldAccess().getComplexTypeAssignment_2_1()); 
                    // InternalDataDsl.g:728:3: ( rule__DataField__ComplexTypeAssignment_2_1 )
                    // InternalDataDsl.g:728:4: rule__DataField__ComplexTypeAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataField__ComplexTypeAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataFieldAccess().getComplexTypeAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:732:2: ( ( rule__DataField__ImportedComplexTypeAssignment_2_2 ) )
                    {
                    // InternalDataDsl.g:732:2: ( ( rule__DataField__ImportedComplexTypeAssignment_2_2 ) )
                    // InternalDataDsl.g:733:3: ( rule__DataField__ImportedComplexTypeAssignment_2_2 )
                    {
                     before(grammarAccess.getDataFieldAccess().getImportedComplexTypeAssignment_2_2()); 
                    // InternalDataDsl.g:734:3: ( rule__DataField__ImportedComplexTypeAssignment_2_2 )
                    // InternalDataDsl.g:734:4: rule__DataField__ImportedComplexTypeAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataField__ImportedComplexTypeAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataFieldAccess().getImportedComplexTypeAssignment_2_2()); 

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
    // $ANTLR end "rule__DataField__Alternatives_2"


    // $ANTLR start "rule__DataOperation__Alternatives_1"
    // InternalDataDsl.g:742:1: rule__DataOperation__Alternatives_1 : ( ( ( rule__DataOperation__HasNoReturnTypeAssignment_1_0 ) ) | ( ( rule__DataOperation__Group_1_1__0 ) ) );
    public final void rule__DataOperation__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:746:1: ( ( ( rule__DataOperation__HasNoReturnTypeAssignment_1_0 ) ) | ( ( rule__DataOperation__Group_1_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==65) ) {
                alt15=1;
            }
            else if ( (LA15_0==49) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalDataDsl.g:747:2: ( ( rule__DataOperation__HasNoReturnTypeAssignment_1_0 ) )
                    {
                    // InternalDataDsl.g:747:2: ( ( rule__DataOperation__HasNoReturnTypeAssignment_1_0 ) )
                    // InternalDataDsl.g:748:3: ( rule__DataOperation__HasNoReturnTypeAssignment_1_0 )
                    {
                     before(grammarAccess.getDataOperationAccess().getHasNoReturnTypeAssignment_1_0()); 
                    // InternalDataDsl.g:749:3: ( rule__DataOperation__HasNoReturnTypeAssignment_1_0 )
                    // InternalDataDsl.g:749:4: rule__DataOperation__HasNoReturnTypeAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataOperation__HasNoReturnTypeAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataOperationAccess().getHasNoReturnTypeAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:753:2: ( ( rule__DataOperation__Group_1_1__0 ) )
                    {
                    // InternalDataDsl.g:753:2: ( ( rule__DataOperation__Group_1_1__0 ) )
                    // InternalDataDsl.g:754:3: ( rule__DataOperation__Group_1_1__0 )
                    {
                     before(grammarAccess.getDataOperationAccess().getGroup_1_1()); 
                    // InternalDataDsl.g:755:3: ( rule__DataOperation__Group_1_1__0 )
                    // InternalDataDsl.g:755:4: rule__DataOperation__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataOperation__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataOperationAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__DataOperation__Alternatives_1"


    // $ANTLR start "rule__DataOperation__Alternatives_1_1_1"
    // InternalDataDsl.g:763:1: rule__DataOperation__Alternatives_1_1_1 : ( ( ( rule__DataOperation__PrimitiveReturnTypeAssignment_1_1_1_0 ) ) | ( ( rule__DataOperation__ComplexReturnTypeAssignment_1_1_1_1 ) ) | ( ( rule__DataOperation__ImportedComplexReturnTypeAssignment_1_1_1_2 ) ) );
    public final void rule__DataOperation__Alternatives_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:767:1: ( ( ( rule__DataOperation__PrimitiveReturnTypeAssignment_1_1_1_0 ) ) | ( ( rule__DataOperation__ComplexReturnTypeAssignment_1_1_1_1 ) ) | ( ( rule__DataOperation__ImportedComplexReturnTypeAssignment_1_1_1_2 ) ) )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=51 && LA16_0<=61)) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==RULE_ID||LA16_2==62) ) {
                    alt16=2;
                }
                else if ( (LA16_2==50) ) {
                    alt16=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDataDsl.g:768:2: ( ( rule__DataOperation__PrimitiveReturnTypeAssignment_1_1_1_0 ) )
                    {
                    // InternalDataDsl.g:768:2: ( ( rule__DataOperation__PrimitiveReturnTypeAssignment_1_1_1_0 ) )
                    // InternalDataDsl.g:769:3: ( rule__DataOperation__PrimitiveReturnTypeAssignment_1_1_1_0 )
                    {
                     before(grammarAccess.getDataOperationAccess().getPrimitiveReturnTypeAssignment_1_1_1_0()); 
                    // InternalDataDsl.g:770:3: ( rule__DataOperation__PrimitiveReturnTypeAssignment_1_1_1_0 )
                    // InternalDataDsl.g:770:4: rule__DataOperation__PrimitiveReturnTypeAssignment_1_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataOperation__PrimitiveReturnTypeAssignment_1_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataOperationAccess().getPrimitiveReturnTypeAssignment_1_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:774:2: ( ( rule__DataOperation__ComplexReturnTypeAssignment_1_1_1_1 ) )
                    {
                    // InternalDataDsl.g:774:2: ( ( rule__DataOperation__ComplexReturnTypeAssignment_1_1_1_1 ) )
                    // InternalDataDsl.g:775:3: ( rule__DataOperation__ComplexReturnTypeAssignment_1_1_1_1 )
                    {
                     before(grammarAccess.getDataOperationAccess().getComplexReturnTypeAssignment_1_1_1_1()); 
                    // InternalDataDsl.g:776:3: ( rule__DataOperation__ComplexReturnTypeAssignment_1_1_1_1 )
                    // InternalDataDsl.g:776:4: rule__DataOperation__ComplexReturnTypeAssignment_1_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataOperation__ComplexReturnTypeAssignment_1_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataOperationAccess().getComplexReturnTypeAssignment_1_1_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:780:2: ( ( rule__DataOperation__ImportedComplexReturnTypeAssignment_1_1_1_2 ) )
                    {
                    // InternalDataDsl.g:780:2: ( ( rule__DataOperation__ImportedComplexReturnTypeAssignment_1_1_1_2 ) )
                    // InternalDataDsl.g:781:3: ( rule__DataOperation__ImportedComplexReturnTypeAssignment_1_1_1_2 )
                    {
                     before(grammarAccess.getDataOperationAccess().getImportedComplexReturnTypeAssignment_1_1_1_2()); 
                    // InternalDataDsl.g:782:3: ( rule__DataOperation__ImportedComplexReturnTypeAssignment_1_1_1_2 )
                    // InternalDataDsl.g:782:4: rule__DataOperation__ImportedComplexReturnTypeAssignment_1_1_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataOperation__ImportedComplexReturnTypeAssignment_1_1_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataOperationAccess().getImportedComplexReturnTypeAssignment_1_1_1_2()); 

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
    // $ANTLR end "rule__DataOperation__Alternatives_1_1_1"


    // $ANTLR start "rule__DataOperationParameter__Alternatives_0"
    // InternalDataDsl.g:790:1: rule__DataOperationParameter__Alternatives_0 : ( ( ( rule__DataOperationParameter__PrimitiveTypeAssignment_0_0 ) ) | ( ( rule__DataOperationParameter__ComplexTypeAssignment_0_1 ) ) | ( ( rule__DataOperationParameter__ImportedComplexTypeAssignment_0_2 ) ) );
    public final void rule__DataOperationParameter__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:794:1: ( ( ( rule__DataOperationParameter__PrimitiveTypeAssignment_0_0 ) ) | ( ( rule__DataOperationParameter__ComplexTypeAssignment_0_1 ) ) | ( ( rule__DataOperationParameter__ImportedComplexTypeAssignment_0_2 ) ) )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=51 && LA17_0<=61)) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==50) ) {
                    alt17=3;
                }
                else if ( (LA17_2==RULE_ID||LA17_2==62) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDataDsl.g:795:2: ( ( rule__DataOperationParameter__PrimitiveTypeAssignment_0_0 ) )
                    {
                    // InternalDataDsl.g:795:2: ( ( rule__DataOperationParameter__PrimitiveTypeAssignment_0_0 ) )
                    // InternalDataDsl.g:796:3: ( rule__DataOperationParameter__PrimitiveTypeAssignment_0_0 )
                    {
                     before(grammarAccess.getDataOperationParameterAccess().getPrimitiveTypeAssignment_0_0()); 
                    // InternalDataDsl.g:797:3: ( rule__DataOperationParameter__PrimitiveTypeAssignment_0_0 )
                    // InternalDataDsl.g:797:4: rule__DataOperationParameter__PrimitiveTypeAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataOperationParameter__PrimitiveTypeAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataOperationParameterAccess().getPrimitiveTypeAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:801:2: ( ( rule__DataOperationParameter__ComplexTypeAssignment_0_1 ) )
                    {
                    // InternalDataDsl.g:801:2: ( ( rule__DataOperationParameter__ComplexTypeAssignment_0_1 ) )
                    // InternalDataDsl.g:802:3: ( rule__DataOperationParameter__ComplexTypeAssignment_0_1 )
                    {
                     before(grammarAccess.getDataOperationParameterAccess().getComplexTypeAssignment_0_1()); 
                    // InternalDataDsl.g:803:3: ( rule__DataOperationParameter__ComplexTypeAssignment_0_1 )
                    // InternalDataDsl.g:803:4: rule__DataOperationParameter__ComplexTypeAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataOperationParameter__ComplexTypeAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataOperationParameterAccess().getComplexTypeAssignment_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:807:2: ( ( rule__DataOperationParameter__ImportedComplexTypeAssignment_0_2 ) )
                    {
                    // InternalDataDsl.g:807:2: ( ( rule__DataOperationParameter__ImportedComplexTypeAssignment_0_2 ) )
                    // InternalDataDsl.g:808:3: ( rule__DataOperationParameter__ImportedComplexTypeAssignment_0_2 )
                    {
                     before(grammarAccess.getDataOperationParameterAccess().getImportedComplexTypeAssignment_0_2()); 
                    // InternalDataDsl.g:809:3: ( rule__DataOperationParameter__ImportedComplexTypeAssignment_0_2 )
                    // InternalDataDsl.g:809:4: rule__DataOperationParameter__ImportedComplexTypeAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataOperationParameter__ImportedComplexTypeAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataOperationParameterAccess().getImportedComplexTypeAssignment_0_2()); 

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
    // $ANTLR end "rule__DataOperationParameter__Alternatives_0"


    // $ANTLR start "rule__PrimitiveValue__Alternatives"
    // InternalDataDsl.g:817:1: rule__PrimitiveValue__Alternatives : ( ( ( rule__PrimitiveValue__NumericValueAssignment_0 ) ) | ( ( rule__PrimitiveValue__BooleanValueAssignment_1 ) ) | ( ( rule__PrimitiveValue__StringValueAssignment_2 ) ) );
    public final void rule__PrimitiveValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:821:1: ( ( ( rule__PrimitiveValue__NumericValueAssignment_0 ) ) | ( ( rule__PrimitiveValue__BooleanValueAssignment_1 ) ) | ( ( rule__PrimitiveValue__StringValueAssignment_2 ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_BIG_DECIMAL:
                {
                alt18=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt18=2;
                }
                break;
            case RULE_STRING:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalDataDsl.g:822:2: ( ( rule__PrimitiveValue__NumericValueAssignment_0 ) )
                    {
                    // InternalDataDsl.g:822:2: ( ( rule__PrimitiveValue__NumericValueAssignment_0 ) )
                    // InternalDataDsl.g:823:3: ( rule__PrimitiveValue__NumericValueAssignment_0 )
                    {
                     before(grammarAccess.getPrimitiveValueAccess().getNumericValueAssignment_0()); 
                    // InternalDataDsl.g:824:3: ( rule__PrimitiveValue__NumericValueAssignment_0 )
                    // InternalDataDsl.g:824:4: rule__PrimitiveValue__NumericValueAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveValue__NumericValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveValueAccess().getNumericValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:828:2: ( ( rule__PrimitiveValue__BooleanValueAssignment_1 ) )
                    {
                    // InternalDataDsl.g:828:2: ( ( rule__PrimitiveValue__BooleanValueAssignment_1 ) )
                    // InternalDataDsl.g:829:3: ( rule__PrimitiveValue__BooleanValueAssignment_1 )
                    {
                     before(grammarAccess.getPrimitiveValueAccess().getBooleanValueAssignment_1()); 
                    // InternalDataDsl.g:830:3: ( rule__PrimitiveValue__BooleanValueAssignment_1 )
                    // InternalDataDsl.g:830:4: rule__PrimitiveValue__BooleanValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveValue__BooleanValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveValueAccess().getBooleanValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:834:2: ( ( rule__PrimitiveValue__StringValueAssignment_2 ) )
                    {
                    // InternalDataDsl.g:834:2: ( ( rule__PrimitiveValue__StringValueAssignment_2 ) )
                    // InternalDataDsl.g:835:3: ( rule__PrimitiveValue__StringValueAssignment_2 )
                    {
                     before(grammarAccess.getPrimitiveValueAccess().getStringValueAssignment_2()); 
                    // InternalDataDsl.g:836:3: ( rule__PrimitiveValue__StringValueAssignment_2 )
                    // InternalDataDsl.g:836:4: rule__PrimitiveValue__StringValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveValue__StringValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveValueAccess().getStringValueAssignment_2()); 

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
    // $ANTLR end "rule__PrimitiveValue__Alternatives"


    // $ANTLR start "rule__PrimitiveType__Alternatives"
    // InternalDataDsl.g:844:1: rule__PrimitiveType__Alternatives : ( ( ( rule__PrimitiveType__Group_0__0 ) ) | ( ( rule__PrimitiveType__Group_1__0 ) ) | ( ( rule__PrimitiveType__Group_2__0 ) ) | ( ( rule__PrimitiveType__Group_3__0 ) ) | ( ( rule__PrimitiveType__Group_4__0 ) ) | ( ( rule__PrimitiveType__Group_5__0 ) ) | ( ( rule__PrimitiveType__Group_6__0 ) ) | ( ( rule__PrimitiveType__Group_7__0 ) ) | ( ( rule__PrimitiveType__Group_8__0 ) ) | ( ( rule__PrimitiveType__Group_9__0 ) ) | ( ( rule__PrimitiveType__Group_10__0 ) ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:848:1: ( ( ( rule__PrimitiveType__Group_0__0 ) ) | ( ( rule__PrimitiveType__Group_1__0 ) ) | ( ( rule__PrimitiveType__Group_2__0 ) ) | ( ( rule__PrimitiveType__Group_3__0 ) ) | ( ( rule__PrimitiveType__Group_4__0 ) ) | ( ( rule__PrimitiveType__Group_5__0 ) ) | ( ( rule__PrimitiveType__Group_6__0 ) ) | ( ( rule__PrimitiveType__Group_7__0 ) ) | ( ( rule__PrimitiveType__Group_8__0 ) ) | ( ( rule__PrimitiveType__Group_9__0 ) ) | ( ( rule__PrimitiveType__Group_10__0 ) ) )
            int alt19=11;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt19=1;
                }
                break;
            case 52:
                {
                alt19=2;
                }
                break;
            case 53:
                {
                alt19=3;
                }
                break;
            case 54:
                {
                alt19=4;
                }
                break;
            case 55:
                {
                alt19=5;
                }
                break;
            case 56:
                {
                alt19=6;
                }
                break;
            case 57:
                {
                alt19=7;
                }
                break;
            case 58:
                {
                alt19=8;
                }
                break;
            case 59:
                {
                alt19=9;
                }
                break;
            case 60:
                {
                alt19=10;
                }
                break;
            case 61:
                {
                alt19=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalDataDsl.g:849:2: ( ( rule__PrimitiveType__Group_0__0 ) )
                    {
                    // InternalDataDsl.g:849:2: ( ( rule__PrimitiveType__Group_0__0 ) )
                    // InternalDataDsl.g:850:3: ( rule__PrimitiveType__Group_0__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_0()); 
                    // InternalDataDsl.g:851:3: ( rule__PrimitiveType__Group_0__0 )
                    // InternalDataDsl.g:851:4: rule__PrimitiveType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:855:2: ( ( rule__PrimitiveType__Group_1__0 ) )
                    {
                    // InternalDataDsl.g:855:2: ( ( rule__PrimitiveType__Group_1__0 ) )
                    // InternalDataDsl.g:856:3: ( rule__PrimitiveType__Group_1__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_1()); 
                    // InternalDataDsl.g:857:3: ( rule__PrimitiveType__Group_1__0 )
                    // InternalDataDsl.g:857:4: rule__PrimitiveType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:861:2: ( ( rule__PrimitiveType__Group_2__0 ) )
                    {
                    // InternalDataDsl.g:861:2: ( ( rule__PrimitiveType__Group_2__0 ) )
                    // InternalDataDsl.g:862:3: ( rule__PrimitiveType__Group_2__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_2()); 
                    // InternalDataDsl.g:863:3: ( rule__PrimitiveType__Group_2__0 )
                    // InternalDataDsl.g:863:4: rule__PrimitiveType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:867:2: ( ( rule__PrimitiveType__Group_3__0 ) )
                    {
                    // InternalDataDsl.g:867:2: ( ( rule__PrimitiveType__Group_3__0 ) )
                    // InternalDataDsl.g:868:3: ( rule__PrimitiveType__Group_3__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_3()); 
                    // InternalDataDsl.g:869:3: ( rule__PrimitiveType__Group_3__0 )
                    // InternalDataDsl.g:869:4: rule__PrimitiveType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveType__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:873:2: ( ( rule__PrimitiveType__Group_4__0 ) )
                    {
                    // InternalDataDsl.g:873:2: ( ( rule__PrimitiveType__Group_4__0 ) )
                    // InternalDataDsl.g:874:3: ( rule__PrimitiveType__Group_4__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_4()); 
                    // InternalDataDsl.g:875:3: ( rule__PrimitiveType__Group_4__0 )
                    // InternalDataDsl.g:875:4: rule__PrimitiveType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveType__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDataDsl.g:879:2: ( ( rule__PrimitiveType__Group_5__0 ) )
                    {
                    // InternalDataDsl.g:879:2: ( ( rule__PrimitiveType__Group_5__0 ) )
                    // InternalDataDsl.g:880:3: ( rule__PrimitiveType__Group_5__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_5()); 
                    // InternalDataDsl.g:881:3: ( rule__PrimitiveType__Group_5__0 )
                    // InternalDataDsl.g:881:4: rule__PrimitiveType__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveType__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDataDsl.g:885:2: ( ( rule__PrimitiveType__Group_6__0 ) )
                    {
                    // InternalDataDsl.g:885:2: ( ( rule__PrimitiveType__Group_6__0 ) )
                    // InternalDataDsl.g:886:3: ( rule__PrimitiveType__Group_6__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_6()); 
                    // InternalDataDsl.g:887:3: ( rule__PrimitiveType__Group_6__0 )
                    // InternalDataDsl.g:887:4: rule__PrimitiveType__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveType__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDataDsl.g:891:2: ( ( rule__PrimitiveType__Group_7__0 ) )
                    {
                    // InternalDataDsl.g:891:2: ( ( rule__PrimitiveType__Group_7__0 ) )
                    // InternalDataDsl.g:892:3: ( rule__PrimitiveType__Group_7__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_7()); 
                    // InternalDataDsl.g:893:3: ( rule__PrimitiveType__Group_7__0 )
                    // InternalDataDsl.g:893:4: rule__PrimitiveType__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveType__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDataDsl.g:897:2: ( ( rule__PrimitiveType__Group_8__0 ) )
                    {
                    // InternalDataDsl.g:897:2: ( ( rule__PrimitiveType__Group_8__0 ) )
                    // InternalDataDsl.g:898:3: ( rule__PrimitiveType__Group_8__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_8()); 
                    // InternalDataDsl.g:899:3: ( rule__PrimitiveType__Group_8__0 )
                    // InternalDataDsl.g:899:4: rule__PrimitiveType__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveType__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDataDsl.g:903:2: ( ( rule__PrimitiveType__Group_9__0 ) )
                    {
                    // InternalDataDsl.g:903:2: ( ( rule__PrimitiveType__Group_9__0 ) )
                    // InternalDataDsl.g:904:3: ( rule__PrimitiveType__Group_9__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_9()); 
                    // InternalDataDsl.g:905:3: ( rule__PrimitiveType__Group_9__0 )
                    // InternalDataDsl.g:905:4: rule__PrimitiveType__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveType__Group_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDataDsl.g:909:2: ( ( rule__PrimitiveType__Group_10__0 ) )
                    {
                    // InternalDataDsl.g:909:2: ( ( rule__PrimitiveType__Group_10__0 ) )
                    // InternalDataDsl.g:910:3: ( rule__PrimitiveType__Group_10__0 )
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getGroup_10()); 
                    // InternalDataDsl.g:911:3: ( rule__PrimitiveType__Group_10__0 )
                    // InternalDataDsl.g:911:4: rule__PrimitiveType__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveType__Group_10__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveTypeAccess().getGroup_10()); 

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
    // $ANTLR end "rule__PrimitiveType__Alternatives"


    // $ANTLR start "rule__ComplexTypeFeature__Alternatives"
    // InternalDataDsl.g:919:1: rule__ComplexTypeFeature__Alternatives : ( ( ( 'aggregate' ) ) | ( ( 'applicationService' ) ) | ( ( 'domainEvent' ) ) | ( ( 'domainService' ) ) | ( ( 'entity' ) ) | ( ( 'factory' ) ) | ( ( 'infrastructureService' ) ) | ( ( 'repository' ) ) | ( ( 'service' ) ) | ( ( 'specification' ) ) | ( ( 'valueObject' ) ) );
    public final void rule__ComplexTypeFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:923:1: ( ( ( 'aggregate' ) ) | ( ( 'applicationService' ) ) | ( ( 'domainEvent' ) ) | ( ( 'domainService' ) ) | ( ( 'entity' ) ) | ( ( 'factory' ) ) | ( ( 'infrastructureService' ) ) | ( ( 'repository' ) ) | ( ( 'service' ) ) | ( ( 'specification' ) ) | ( ( 'valueObject' ) ) )
            int alt20=11;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt20=1;
                }
                break;
            case 16:
                {
                alt20=2;
                }
                break;
            case 17:
                {
                alt20=3;
                }
                break;
            case 18:
                {
                alt20=4;
                }
                break;
            case 19:
                {
                alt20=5;
                }
                break;
            case 20:
                {
                alt20=6;
                }
                break;
            case 21:
                {
                alt20=7;
                }
                break;
            case 22:
                {
                alt20=8;
                }
                break;
            case 23:
                {
                alt20=9;
                }
                break;
            case 24:
                {
                alt20=10;
                }
                break;
            case 25:
                {
                alt20=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalDataDsl.g:924:2: ( ( 'aggregate' ) )
                    {
                    // InternalDataDsl.g:924:2: ( ( 'aggregate' ) )
                    // InternalDataDsl.g:925:3: ( 'aggregate' )
                    {
                     before(grammarAccess.getComplexTypeFeatureAccess().getAGGREGATEEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:926:3: ( 'aggregate' )
                    // InternalDataDsl.g:926:4: 'aggregate'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getComplexTypeFeatureAccess().getAGGREGATEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:930:2: ( ( 'applicationService' ) )
                    {
                    // InternalDataDsl.g:930:2: ( ( 'applicationService' ) )
                    // InternalDataDsl.g:931:3: ( 'applicationService' )
                    {
                     before(grammarAccess.getComplexTypeFeatureAccess().getAPPLICATION_SERVICEEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:932:3: ( 'applicationService' )
                    // InternalDataDsl.g:932:4: 'applicationService'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getComplexTypeFeatureAccess().getAPPLICATION_SERVICEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:936:2: ( ( 'domainEvent' ) )
                    {
                    // InternalDataDsl.g:936:2: ( ( 'domainEvent' ) )
                    // InternalDataDsl.g:937:3: ( 'domainEvent' )
                    {
                     before(grammarAccess.getComplexTypeFeatureAccess().getDOMAIN_EVENTEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:938:3: ( 'domainEvent' )
                    // InternalDataDsl.g:938:4: 'domainEvent'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getComplexTypeFeatureAccess().getDOMAIN_EVENTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:942:2: ( ( 'domainService' ) )
                    {
                    // InternalDataDsl.g:942:2: ( ( 'domainService' ) )
                    // InternalDataDsl.g:943:3: ( 'domainService' )
                    {
                     before(grammarAccess.getComplexTypeFeatureAccess().getDOMAIN_SERVICEEnumLiteralDeclaration_3()); 
                    // InternalDataDsl.g:944:3: ( 'domainService' )
                    // InternalDataDsl.g:944:4: 'domainService'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getComplexTypeFeatureAccess().getDOMAIN_SERVICEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:948:2: ( ( 'entity' ) )
                    {
                    // InternalDataDsl.g:948:2: ( ( 'entity' ) )
                    // InternalDataDsl.g:949:3: ( 'entity' )
                    {
                     before(grammarAccess.getComplexTypeFeatureAccess().getENTITYEnumLiteralDeclaration_4()); 
                    // InternalDataDsl.g:950:3: ( 'entity' )
                    // InternalDataDsl.g:950:4: 'entity'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getComplexTypeFeatureAccess().getENTITYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDataDsl.g:954:2: ( ( 'factory' ) )
                    {
                    // InternalDataDsl.g:954:2: ( ( 'factory' ) )
                    // InternalDataDsl.g:955:3: ( 'factory' )
                    {
                     before(grammarAccess.getComplexTypeFeatureAccess().getFACTORYEnumLiteralDeclaration_5()); 
                    // InternalDataDsl.g:956:3: ( 'factory' )
                    // InternalDataDsl.g:956:4: 'factory'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getComplexTypeFeatureAccess().getFACTORYEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDataDsl.g:960:2: ( ( 'infrastructureService' ) )
                    {
                    // InternalDataDsl.g:960:2: ( ( 'infrastructureService' ) )
                    // InternalDataDsl.g:961:3: ( 'infrastructureService' )
                    {
                     before(grammarAccess.getComplexTypeFeatureAccess().getINFRASTRUCTURE_SERVICEEnumLiteralDeclaration_6()); 
                    // InternalDataDsl.g:962:3: ( 'infrastructureService' )
                    // InternalDataDsl.g:962:4: 'infrastructureService'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getComplexTypeFeatureAccess().getINFRASTRUCTURE_SERVICEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDataDsl.g:966:2: ( ( 'repository' ) )
                    {
                    // InternalDataDsl.g:966:2: ( ( 'repository' ) )
                    // InternalDataDsl.g:967:3: ( 'repository' )
                    {
                     before(grammarAccess.getComplexTypeFeatureAccess().getREPOSITORYEnumLiteralDeclaration_7()); 
                    // InternalDataDsl.g:968:3: ( 'repository' )
                    // InternalDataDsl.g:968:4: 'repository'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getComplexTypeFeatureAccess().getREPOSITORYEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDataDsl.g:972:2: ( ( 'service' ) )
                    {
                    // InternalDataDsl.g:972:2: ( ( 'service' ) )
                    // InternalDataDsl.g:973:3: ( 'service' )
                    {
                     before(grammarAccess.getComplexTypeFeatureAccess().getSERVICEEnumLiteralDeclaration_8()); 
                    // InternalDataDsl.g:974:3: ( 'service' )
                    // InternalDataDsl.g:974:4: 'service'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getComplexTypeFeatureAccess().getSERVICEEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDataDsl.g:978:2: ( ( 'specification' ) )
                    {
                    // InternalDataDsl.g:978:2: ( ( 'specification' ) )
                    // InternalDataDsl.g:979:3: ( 'specification' )
                    {
                     before(grammarAccess.getComplexTypeFeatureAccess().getSPECIFICATIONEnumLiteralDeclaration_9()); 
                    // InternalDataDsl.g:980:3: ( 'specification' )
                    // InternalDataDsl.g:980:4: 'specification'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getComplexTypeFeatureAccess().getSPECIFICATIONEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDataDsl.g:984:2: ( ( 'valueObject' ) )
                    {
                    // InternalDataDsl.g:984:2: ( ( 'valueObject' ) )
                    // InternalDataDsl.g:985:3: ( 'valueObject' )
                    {
                     before(grammarAccess.getComplexTypeFeatureAccess().getVALUE_OBJECTEnumLiteralDeclaration_10()); 
                    // InternalDataDsl.g:986:3: ( 'valueObject' )
                    // InternalDataDsl.g:986:4: 'valueObject'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getComplexTypeFeatureAccess().getVALUE_OBJECTEnumLiteralDeclaration_10()); 

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
    // $ANTLR end "rule__ComplexTypeFeature__Alternatives"


    // $ANTLR start "rule__DataFieldFeature__Alternatives"
    // InternalDataDsl.g:994:1: rule__DataFieldFeature__Alternatives : ( ( ( 'identifier' ) ) | ( ( 'neverEmpty' ) ) | ( ( 'part' ) ) );
    public final void rule__DataFieldFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:998:1: ( ( ( 'identifier' ) ) | ( ( 'neverEmpty' ) ) | ( ( 'part' ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt21=1;
                }
                break;
            case 27:
                {
                alt21=2;
                }
                break;
            case 28:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalDataDsl.g:999:2: ( ( 'identifier' ) )
                    {
                    // InternalDataDsl.g:999:2: ( ( 'identifier' ) )
                    // InternalDataDsl.g:1000:3: ( 'identifier' )
                    {
                     before(grammarAccess.getDataFieldFeatureAccess().getIDENTIFIEREnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1001:3: ( 'identifier' )
                    // InternalDataDsl.g:1001:4: 'identifier'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataFieldFeatureAccess().getIDENTIFIEREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1005:2: ( ( 'neverEmpty' ) )
                    {
                    // InternalDataDsl.g:1005:2: ( ( 'neverEmpty' ) )
                    // InternalDataDsl.g:1006:3: ( 'neverEmpty' )
                    {
                     before(grammarAccess.getDataFieldFeatureAccess().getNEVER_EMPTYEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1007:3: ( 'neverEmpty' )
                    // InternalDataDsl.g:1007:4: 'neverEmpty'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataFieldFeatureAccess().getNEVER_EMPTYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1011:2: ( ( 'part' ) )
                    {
                    // InternalDataDsl.g:1011:2: ( ( 'part' ) )
                    // InternalDataDsl.g:1012:3: ( 'part' )
                    {
                     before(grammarAccess.getDataFieldFeatureAccess().getPARTEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:1013:3: ( 'part' )
                    // InternalDataDsl.g:1013:4: 'part'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataFieldFeatureAccess().getPARTEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__DataFieldFeature__Alternatives"


    // $ANTLR start "rule__DataOperationFeature__Alternatives"
    // InternalDataDsl.g:1021:1: rule__DataOperationFeature__Alternatives : ( ( ( 'closure' ) ) | ( ( 'identifier' ) ) | ( ( 'sideEffectFree' ) ) | ( ( 'validator' ) ) );
    public final void rule__DataOperationFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1025:1: ( ( ( 'closure' ) ) | ( ( 'identifier' ) ) | ( ( 'sideEffectFree' ) ) | ( ( 'validator' ) ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt22=1;
                }
                break;
            case 26:
                {
                alt22=2;
                }
                break;
            case 30:
                {
                alt22=3;
                }
                break;
            case 31:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalDataDsl.g:1026:2: ( ( 'closure' ) )
                    {
                    // InternalDataDsl.g:1026:2: ( ( 'closure' ) )
                    // InternalDataDsl.g:1027:3: ( 'closure' )
                    {
                     before(grammarAccess.getDataOperationFeatureAccess().getCLOSUREEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1028:3: ( 'closure' )
                    // InternalDataDsl.g:1028:4: 'closure'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataOperationFeatureAccess().getCLOSUREEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1032:2: ( ( 'identifier' ) )
                    {
                    // InternalDataDsl.g:1032:2: ( ( 'identifier' ) )
                    // InternalDataDsl.g:1033:3: ( 'identifier' )
                    {
                     before(grammarAccess.getDataOperationFeatureAccess().getIDENTIFIEREnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1034:3: ( 'identifier' )
                    // InternalDataDsl.g:1034:4: 'identifier'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataOperationFeatureAccess().getIDENTIFIEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1038:2: ( ( 'sideEffectFree' ) )
                    {
                    // InternalDataDsl.g:1038:2: ( ( 'sideEffectFree' ) )
                    // InternalDataDsl.g:1039:3: ( 'sideEffectFree' )
                    {
                     before(grammarAccess.getDataOperationFeatureAccess().getSIDE_EFFECT_FREEEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:1040:3: ( 'sideEffectFree' )
                    // InternalDataDsl.g:1040:4: 'sideEffectFree'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataOperationFeatureAccess().getSIDE_EFFECT_FREEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:1044:2: ( ( 'validator' ) )
                    {
                    // InternalDataDsl.g:1044:2: ( ( 'validator' ) )
                    // InternalDataDsl.g:1045:3: ( 'validator' )
                    {
                     before(grammarAccess.getDataOperationFeatureAccess().getVALIDATOREnumLiteralDeclaration_3()); 
                    // InternalDataDsl.g:1046:3: ( 'validator' )
                    // InternalDataDsl.g:1046:4: 'validator'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataOperationFeatureAccess().getVALIDATOREnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__DataOperationFeature__Alternatives"


    // $ANTLR start "rule__DataModel__Group__0"
    // InternalDataDsl.g:1054:1: rule__DataModel__Group__0 : rule__DataModel__Group__0__Impl rule__DataModel__Group__1 ;
    public final void rule__DataModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1058:1: ( rule__DataModel__Group__0__Impl rule__DataModel__Group__1 )
            // InternalDataDsl.g:1059:2: rule__DataModel__Group__0__Impl rule__DataModel__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DataModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__1();

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
    // $ANTLR end "rule__DataModel__Group__0"


    // $ANTLR start "rule__DataModel__Group__0__Impl"
    // InternalDataDsl.g:1066:1: rule__DataModel__Group__0__Impl : ( ( rule__DataModel__ComplexTypeImportsAssignment_0 )* ) ;
    public final void rule__DataModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1070:1: ( ( ( rule__DataModel__ComplexTypeImportsAssignment_0 )* ) )
            // InternalDataDsl.g:1071:1: ( ( rule__DataModel__ComplexTypeImportsAssignment_0 )* )
            {
            // InternalDataDsl.g:1071:1: ( ( rule__DataModel__ComplexTypeImportsAssignment_0 )* )
            // InternalDataDsl.g:1072:2: ( rule__DataModel__ComplexTypeImportsAssignment_0 )*
            {
             before(grammarAccess.getDataModelAccess().getComplexTypeImportsAssignment_0()); 
            // InternalDataDsl.g:1073:2: ( rule__DataModel__ComplexTypeImportsAssignment_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==32) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDataDsl.g:1073:3: rule__DataModel__ComplexTypeImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DataModel__ComplexTypeImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getComplexTypeImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__0__Impl"


    // $ANTLR start "rule__DataModel__Group__1"
    // InternalDataDsl.g:1081:1: rule__DataModel__Group__1 : rule__DataModel__Group__1__Impl ;
    public final void rule__DataModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1085:1: ( rule__DataModel__Group__1__Impl )
            // InternalDataDsl.g:1086:2: rule__DataModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group__1__Impl();

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
    // $ANTLR end "rule__DataModel__Group__1"


    // $ANTLR start "rule__DataModel__Group__1__Impl"
    // InternalDataDsl.g:1092:1: rule__DataModel__Group__1__Impl : ( ( rule__DataModel__Alternatives_1 ) ) ;
    public final void rule__DataModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1096:1: ( ( ( rule__DataModel__Alternatives_1 ) ) )
            // InternalDataDsl.g:1097:1: ( ( rule__DataModel__Alternatives_1 ) )
            {
            // InternalDataDsl.g:1097:1: ( ( rule__DataModel__Alternatives_1 ) )
            // InternalDataDsl.g:1098:2: ( rule__DataModel__Alternatives_1 )
            {
             before(grammarAccess.getDataModelAccess().getAlternatives_1()); 
            // InternalDataDsl.g:1099:2: ( rule__DataModel__Alternatives_1 )
            // InternalDataDsl.g:1099:3: rule__DataModel__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__1__Impl"


    // $ANTLR start "rule__ComplexTypeImport__Group__0"
    // InternalDataDsl.g:1108:1: rule__ComplexTypeImport__Group__0 : rule__ComplexTypeImport__Group__0__Impl rule__ComplexTypeImport__Group__1 ;
    public final void rule__ComplexTypeImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1112:1: ( rule__ComplexTypeImport__Group__0__Impl rule__ComplexTypeImport__Group__1 )
            // InternalDataDsl.g:1113:2: rule__ComplexTypeImport__Group__0__Impl rule__ComplexTypeImport__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ComplexTypeImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexTypeImport__Group__1();

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
    // $ANTLR end "rule__ComplexTypeImport__Group__0"


    // $ANTLR start "rule__ComplexTypeImport__Group__0__Impl"
    // InternalDataDsl.g:1120:1: rule__ComplexTypeImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__ComplexTypeImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1124:1: ( ( 'import' ) )
            // InternalDataDsl.g:1125:1: ( 'import' )
            {
            // InternalDataDsl.g:1125:1: ( 'import' )
            // InternalDataDsl.g:1126:2: 'import'
            {
             before(grammarAccess.getComplexTypeImportAccess().getImportKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComplexTypeImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeImport__Group__0__Impl"


    // $ANTLR start "rule__ComplexTypeImport__Group__1"
    // InternalDataDsl.g:1135:1: rule__ComplexTypeImport__Group__1 : rule__ComplexTypeImport__Group__1__Impl rule__ComplexTypeImport__Group__2 ;
    public final void rule__ComplexTypeImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1139:1: ( rule__ComplexTypeImport__Group__1__Impl rule__ComplexTypeImport__Group__2 )
            // InternalDataDsl.g:1140:2: rule__ComplexTypeImport__Group__1__Impl rule__ComplexTypeImport__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ComplexTypeImport__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexTypeImport__Group__2();

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
    // $ANTLR end "rule__ComplexTypeImport__Group__1"


    // $ANTLR start "rule__ComplexTypeImport__Group__1__Impl"
    // InternalDataDsl.g:1147:1: rule__ComplexTypeImport__Group__1__Impl : ( 'datatypes' ) ;
    public final void rule__ComplexTypeImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1151:1: ( ( 'datatypes' ) )
            // InternalDataDsl.g:1152:1: ( 'datatypes' )
            {
            // InternalDataDsl.g:1152:1: ( 'datatypes' )
            // InternalDataDsl.g:1153:2: 'datatypes'
            {
             before(grammarAccess.getComplexTypeImportAccess().getDatatypesKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComplexTypeImportAccess().getDatatypesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeImport__Group__1__Impl"


    // $ANTLR start "rule__ComplexTypeImport__Group__2"
    // InternalDataDsl.g:1162:1: rule__ComplexTypeImport__Group__2 : rule__ComplexTypeImport__Group__2__Impl rule__ComplexTypeImport__Group__3 ;
    public final void rule__ComplexTypeImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1166:1: ( rule__ComplexTypeImport__Group__2__Impl rule__ComplexTypeImport__Group__3 )
            // InternalDataDsl.g:1167:2: rule__ComplexTypeImport__Group__2__Impl rule__ComplexTypeImport__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ComplexTypeImport__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexTypeImport__Group__3();

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
    // $ANTLR end "rule__ComplexTypeImport__Group__2"


    // $ANTLR start "rule__ComplexTypeImport__Group__2__Impl"
    // InternalDataDsl.g:1174:1: rule__ComplexTypeImport__Group__2__Impl : ( 'from' ) ;
    public final void rule__ComplexTypeImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1178:1: ( ( 'from' ) )
            // InternalDataDsl.g:1179:1: ( 'from' )
            {
            // InternalDataDsl.g:1179:1: ( 'from' )
            // InternalDataDsl.g:1180:2: 'from'
            {
             before(grammarAccess.getComplexTypeImportAccess().getFromKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComplexTypeImportAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeImport__Group__2__Impl"


    // $ANTLR start "rule__ComplexTypeImport__Group__3"
    // InternalDataDsl.g:1189:1: rule__ComplexTypeImport__Group__3 : rule__ComplexTypeImport__Group__3__Impl rule__ComplexTypeImport__Group__4 ;
    public final void rule__ComplexTypeImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1193:1: ( rule__ComplexTypeImport__Group__3__Impl rule__ComplexTypeImport__Group__4 )
            // InternalDataDsl.g:1194:2: rule__ComplexTypeImport__Group__3__Impl rule__ComplexTypeImport__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__ComplexTypeImport__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexTypeImport__Group__4();

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
    // $ANTLR end "rule__ComplexTypeImport__Group__3"


    // $ANTLR start "rule__ComplexTypeImport__Group__3__Impl"
    // InternalDataDsl.g:1201:1: rule__ComplexTypeImport__Group__3__Impl : ( ( rule__ComplexTypeImport__ImportURIAssignment_3 ) ) ;
    public final void rule__ComplexTypeImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1205:1: ( ( ( rule__ComplexTypeImport__ImportURIAssignment_3 ) ) )
            // InternalDataDsl.g:1206:1: ( ( rule__ComplexTypeImport__ImportURIAssignment_3 ) )
            {
            // InternalDataDsl.g:1206:1: ( ( rule__ComplexTypeImport__ImportURIAssignment_3 ) )
            // InternalDataDsl.g:1207:2: ( rule__ComplexTypeImport__ImportURIAssignment_3 )
            {
             before(grammarAccess.getComplexTypeImportAccess().getImportURIAssignment_3()); 
            // InternalDataDsl.g:1208:2: ( rule__ComplexTypeImport__ImportURIAssignment_3 )
            // InternalDataDsl.g:1208:3: rule__ComplexTypeImport__ImportURIAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTypeImport__ImportURIAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeImportAccess().getImportURIAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeImport__Group__3__Impl"


    // $ANTLR start "rule__ComplexTypeImport__Group__4"
    // InternalDataDsl.g:1216:1: rule__ComplexTypeImport__Group__4 : rule__ComplexTypeImport__Group__4__Impl rule__ComplexTypeImport__Group__5 ;
    public final void rule__ComplexTypeImport__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1220:1: ( rule__ComplexTypeImport__Group__4__Impl rule__ComplexTypeImport__Group__5 )
            // InternalDataDsl.g:1221:2: rule__ComplexTypeImport__Group__4__Impl rule__ComplexTypeImport__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__ComplexTypeImport__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexTypeImport__Group__5();

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
    // $ANTLR end "rule__ComplexTypeImport__Group__4"


    // $ANTLR start "rule__ComplexTypeImport__Group__4__Impl"
    // InternalDataDsl.g:1228:1: rule__ComplexTypeImport__Group__4__Impl : ( 'as' ) ;
    public final void rule__ComplexTypeImport__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1232:1: ( ( 'as' ) )
            // InternalDataDsl.g:1233:1: ( 'as' )
            {
            // InternalDataDsl.g:1233:1: ( 'as' )
            // InternalDataDsl.g:1234:2: 'as'
            {
             before(grammarAccess.getComplexTypeImportAccess().getAsKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getComplexTypeImportAccess().getAsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeImport__Group__4__Impl"


    // $ANTLR start "rule__ComplexTypeImport__Group__5"
    // InternalDataDsl.g:1243:1: rule__ComplexTypeImport__Group__5 : rule__ComplexTypeImport__Group__5__Impl ;
    public final void rule__ComplexTypeImport__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1247:1: ( rule__ComplexTypeImport__Group__5__Impl )
            // InternalDataDsl.g:1248:2: rule__ComplexTypeImport__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTypeImport__Group__5__Impl();

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
    // $ANTLR end "rule__ComplexTypeImport__Group__5"


    // $ANTLR start "rule__ComplexTypeImport__Group__5__Impl"
    // InternalDataDsl.g:1254:1: rule__ComplexTypeImport__Group__5__Impl : ( ( rule__ComplexTypeImport__NameAssignment_5 ) ) ;
    public final void rule__ComplexTypeImport__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1258:1: ( ( ( rule__ComplexTypeImport__NameAssignment_5 ) ) )
            // InternalDataDsl.g:1259:1: ( ( rule__ComplexTypeImport__NameAssignment_5 ) )
            {
            // InternalDataDsl.g:1259:1: ( ( rule__ComplexTypeImport__NameAssignment_5 ) )
            // InternalDataDsl.g:1260:2: ( rule__ComplexTypeImport__NameAssignment_5 )
            {
             before(grammarAccess.getComplexTypeImportAccess().getNameAssignment_5()); 
            // InternalDataDsl.g:1261:2: ( rule__ComplexTypeImport__NameAssignment_5 )
            // InternalDataDsl.g:1261:3: rule__ComplexTypeImport__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ComplexTypeImport__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getComplexTypeImportAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeImport__Group__5__Impl"


    // $ANTLR start "rule__Version__Group__0"
    // InternalDataDsl.g:1270:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1274:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // InternalDataDsl.g:1275:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Version__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__1();

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
    // $ANTLR end "rule__Version__Group__0"


    // $ANTLR start "rule__Version__Group__0__Impl"
    // InternalDataDsl.g:1282:1: rule__Version__Group__0__Impl : ( 'version' ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1286:1: ( ( 'version' ) )
            // InternalDataDsl.g:1287:1: ( 'version' )
            {
            // InternalDataDsl.g:1287:1: ( 'version' )
            // InternalDataDsl.g:1288:2: 'version'
            {
             before(grammarAccess.getVersionAccess().getVersionKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getVersionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__0__Impl"


    // $ANTLR start "rule__Version__Group__1"
    // InternalDataDsl.g:1297:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1301:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // InternalDataDsl.g:1302:2: rule__Version__Group__1__Impl rule__Version__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Version__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__2();

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
    // $ANTLR end "rule__Version__Group__1"


    // $ANTLR start "rule__Version__Group__1__Impl"
    // InternalDataDsl.g:1309:1: rule__Version__Group__1__Impl : ( ( rule__Version__NameAssignment_1 ) ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1313:1: ( ( ( rule__Version__NameAssignment_1 ) ) )
            // InternalDataDsl.g:1314:1: ( ( rule__Version__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:1314:1: ( ( rule__Version__NameAssignment_1 ) )
            // InternalDataDsl.g:1315:2: ( rule__Version__NameAssignment_1 )
            {
             before(grammarAccess.getVersionAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:1316:2: ( rule__Version__NameAssignment_1 )
            // InternalDataDsl.g:1316:3: rule__Version__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Version__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVersionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__1__Impl"


    // $ANTLR start "rule__Version__Group__2"
    // InternalDataDsl.g:1324:1: rule__Version__Group__2 : rule__Version__Group__2__Impl rule__Version__Group__3 ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1328:1: ( rule__Version__Group__2__Impl rule__Version__Group__3 )
            // InternalDataDsl.g:1329:2: rule__Version__Group__2__Impl rule__Version__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Version__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__3();

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
    // $ANTLR end "rule__Version__Group__2"


    // $ANTLR start "rule__Version__Group__2__Impl"
    // InternalDataDsl.g:1336:1: rule__Version__Group__2__Impl : ( '{' ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1340:1: ( ( '{' ) )
            // InternalDataDsl.g:1341:1: ( '{' )
            {
            // InternalDataDsl.g:1341:1: ( '{' )
            // InternalDataDsl.g:1342:2: '{'
            {
             before(grammarAccess.getVersionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__2__Impl"


    // $ANTLR start "rule__Version__Group__3"
    // InternalDataDsl.g:1351:1: rule__Version__Group__3 : rule__Version__Group__3__Impl rule__Version__Group__4 ;
    public final void rule__Version__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1355:1: ( rule__Version__Group__3__Impl rule__Version__Group__4 )
            // InternalDataDsl.g:1356:2: rule__Version__Group__3__Impl rule__Version__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Version__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Version__Group__4();

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
    // $ANTLR end "rule__Version__Group__3"


    // $ANTLR start "rule__Version__Group__3__Impl"
    // InternalDataDsl.g:1363:1: rule__Version__Group__3__Impl : ( ( rule__Version__Alternatives_3 )? ) ;
    public final void rule__Version__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1367:1: ( ( ( rule__Version__Alternatives_3 )? ) )
            // InternalDataDsl.g:1368:1: ( ( rule__Version__Alternatives_3 )? )
            {
            // InternalDataDsl.g:1368:1: ( ( rule__Version__Alternatives_3 )? )
            // InternalDataDsl.g:1369:2: ( rule__Version__Alternatives_3 )?
            {
             before(grammarAccess.getVersionAccess().getAlternatives_3()); 
            // InternalDataDsl.g:1370:2: ( rule__Version__Alternatives_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=13 && LA24_0<=14)||(LA24_0>=39 && LA24_0<=40)||LA24_0==46) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDataDsl.g:1370:3: rule__Version__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Version__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVersionAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__3__Impl"


    // $ANTLR start "rule__Version__Group__4"
    // InternalDataDsl.g:1378:1: rule__Version__Group__4 : rule__Version__Group__4__Impl ;
    public final void rule__Version__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1382:1: ( rule__Version__Group__4__Impl )
            // InternalDataDsl.g:1383:2: rule__Version__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Version__Group__4__Impl();

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
    // $ANTLR end "rule__Version__Group__4"


    // $ANTLR start "rule__Version__Group__4__Impl"
    // InternalDataDsl.g:1389:1: rule__Version__Group__4__Impl : ( '}' ) ;
    public final void rule__Version__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1393:1: ( ( '}' ) )
            // InternalDataDsl.g:1394:1: ( '}' )
            {
            // InternalDataDsl.g:1394:1: ( '}' )
            // InternalDataDsl.g:1395:2: '}'
            {
             before(grammarAccess.getVersionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__Group__4__Impl"


    // $ANTLR start "rule__Context__Group__0"
    // InternalDataDsl.g:1405:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1409:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // InternalDataDsl.g:1410:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Context__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__1();

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
    // $ANTLR end "rule__Context__Group__0"


    // $ANTLR start "rule__Context__Group__0__Impl"
    // InternalDataDsl.g:1417:1: rule__Context__Group__0__Impl : ( 'context' ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1421:1: ( ( 'context' ) )
            // InternalDataDsl.g:1422:1: ( 'context' )
            {
            // InternalDataDsl.g:1422:1: ( 'context' )
            // InternalDataDsl.g:1423:2: 'context'
            {
             before(grammarAccess.getContextAccess().getContextKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__0__Impl"


    // $ANTLR start "rule__Context__Group__1"
    // InternalDataDsl.g:1432:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1436:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // InternalDataDsl.g:1437:2: rule__Context__Group__1__Impl rule__Context__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Context__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__2();

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
    // $ANTLR end "rule__Context__Group__1"


    // $ANTLR start "rule__Context__Group__1__Impl"
    // InternalDataDsl.g:1444:1: rule__Context__Group__1__Impl : ( ( rule__Context__NameAssignment_1 ) ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1448:1: ( ( ( rule__Context__NameAssignment_1 ) ) )
            // InternalDataDsl.g:1449:1: ( ( rule__Context__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:1449:1: ( ( rule__Context__NameAssignment_1 ) )
            // InternalDataDsl.g:1450:2: ( rule__Context__NameAssignment_1 )
            {
             before(grammarAccess.getContextAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:1451:2: ( rule__Context__NameAssignment_1 )
            // InternalDataDsl.g:1451:3: rule__Context__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Context__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__1__Impl"


    // $ANTLR start "rule__Context__Group__2"
    // InternalDataDsl.g:1459:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1463:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // InternalDataDsl.g:1464:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Context__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__3();

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
    // $ANTLR end "rule__Context__Group__2"


    // $ANTLR start "rule__Context__Group__2__Impl"
    // InternalDataDsl.g:1471:1: rule__Context__Group__2__Impl : ( '{' ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1475:1: ( ( '{' ) )
            // InternalDataDsl.g:1476:1: ( '{' )
            {
            // InternalDataDsl.g:1476:1: ( '{' )
            // InternalDataDsl.g:1477:2: '{'
            {
             before(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__2__Impl"


    // $ANTLR start "rule__Context__Group__3"
    // InternalDataDsl.g:1486:1: rule__Context__Group__3 : rule__Context__Group__3__Impl rule__Context__Group__4 ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1490:1: ( rule__Context__Group__3__Impl rule__Context__Group__4 )
            // InternalDataDsl.g:1491:2: rule__Context__Group__3__Impl rule__Context__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Context__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Context__Group__4();

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
    // $ANTLR end "rule__Context__Group__3"


    // $ANTLR start "rule__Context__Group__3__Impl"
    // InternalDataDsl.g:1498:1: rule__Context__Group__3__Impl : ( ( ( rule__Context__ComplexTypesAssignment_3 ) ) ( ( rule__Context__ComplexTypesAssignment_3 )* ) ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1502:1: ( ( ( ( rule__Context__ComplexTypesAssignment_3 ) ) ( ( rule__Context__ComplexTypesAssignment_3 )* ) ) )
            // InternalDataDsl.g:1503:1: ( ( ( rule__Context__ComplexTypesAssignment_3 ) ) ( ( rule__Context__ComplexTypesAssignment_3 )* ) )
            {
            // InternalDataDsl.g:1503:1: ( ( ( rule__Context__ComplexTypesAssignment_3 ) ) ( ( rule__Context__ComplexTypesAssignment_3 )* ) )
            // InternalDataDsl.g:1504:2: ( ( rule__Context__ComplexTypesAssignment_3 ) ) ( ( rule__Context__ComplexTypesAssignment_3 )* )
            {
            // InternalDataDsl.g:1504:2: ( ( rule__Context__ComplexTypesAssignment_3 ) )
            // InternalDataDsl.g:1505:3: ( rule__Context__ComplexTypesAssignment_3 )
            {
             before(grammarAccess.getContextAccess().getComplexTypesAssignment_3()); 
            // InternalDataDsl.g:1506:3: ( rule__Context__ComplexTypesAssignment_3 )
            // InternalDataDsl.g:1506:4: rule__Context__ComplexTypesAssignment_3
            {
            pushFollow(FOLLOW_5);
            rule__Context__ComplexTypesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getContextAccess().getComplexTypesAssignment_3()); 

            }

            // InternalDataDsl.g:1509:2: ( ( rule__Context__ComplexTypesAssignment_3 )* )
            // InternalDataDsl.g:1510:3: ( rule__Context__ComplexTypesAssignment_3 )*
            {
             before(grammarAccess.getContextAccess().getComplexTypesAssignment_3()); 
            // InternalDataDsl.g:1511:3: ( rule__Context__ComplexTypesAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=13 && LA25_0<=14)||LA25_0==40||LA25_0==46) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDataDsl.g:1511:4: rule__Context__ComplexTypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Context__ComplexTypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getContextAccess().getComplexTypesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__3__Impl"


    // $ANTLR start "rule__Context__Group__4"
    // InternalDataDsl.g:1520:1: rule__Context__Group__4 : rule__Context__Group__4__Impl ;
    public final void rule__Context__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1524:1: ( rule__Context__Group__4__Impl )
            // InternalDataDsl.g:1525:2: rule__Context__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Context__Group__4__Impl();

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
    // $ANTLR end "rule__Context__Group__4"


    // $ANTLR start "rule__Context__Group__4__Impl"
    // InternalDataDsl.g:1531:1: rule__Context__Group__4__Impl : ( '}' ) ;
    public final void rule__Context__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1535:1: ( ( '}' ) )
            // InternalDataDsl.g:1536:1: ( '}' )
            {
            // InternalDataDsl.g:1536:1: ( '}' )
            // InternalDataDsl.g:1537:2: '}'
            {
             before(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__Group__4__Impl"


    // $ANTLR start "rule__DataStructure__Group__0"
    // InternalDataDsl.g:1547:1: rule__DataStructure__Group__0 : rule__DataStructure__Group__0__Impl rule__DataStructure__Group__1 ;
    public final void rule__DataStructure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1551:1: ( rule__DataStructure__Group__0__Impl rule__DataStructure__Group__1 )
            // InternalDataDsl.g:1552:2: rule__DataStructure__Group__0__Impl rule__DataStructure__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__DataStructure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataStructure__Group__1();

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
    // $ANTLR end "rule__DataStructure__Group__0"


    // $ANTLR start "rule__DataStructure__Group__0__Impl"
    // InternalDataDsl.g:1559:1: rule__DataStructure__Group__0__Impl : ( 'structure' ) ;
    public final void rule__DataStructure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1563:1: ( ( 'structure' ) )
            // InternalDataDsl.g:1564:1: ( 'structure' )
            {
            // InternalDataDsl.g:1564:1: ( 'structure' )
            // InternalDataDsl.g:1565:2: 'structure'
            {
             before(grammarAccess.getDataStructureAccess().getStructureKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDataStructureAccess().getStructureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__Group__0__Impl"


    // $ANTLR start "rule__DataStructure__Group__1"
    // InternalDataDsl.g:1574:1: rule__DataStructure__Group__1 : rule__DataStructure__Group__1__Impl rule__DataStructure__Group__2 ;
    public final void rule__DataStructure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1578:1: ( rule__DataStructure__Group__1__Impl rule__DataStructure__Group__2 )
            // InternalDataDsl.g:1579:2: rule__DataStructure__Group__1__Impl rule__DataStructure__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__DataStructure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataStructure__Group__2();

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
    // $ANTLR end "rule__DataStructure__Group__1"


    // $ANTLR start "rule__DataStructure__Group__1__Impl"
    // InternalDataDsl.g:1586:1: rule__DataStructure__Group__1__Impl : ( ( rule__DataStructure__NameAssignment_1 ) ) ;
    public final void rule__DataStructure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1590:1: ( ( ( rule__DataStructure__NameAssignment_1 ) ) )
            // InternalDataDsl.g:1591:1: ( ( rule__DataStructure__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:1591:1: ( ( rule__DataStructure__NameAssignment_1 ) )
            // InternalDataDsl.g:1592:2: ( rule__DataStructure__NameAssignment_1 )
            {
             before(grammarAccess.getDataStructureAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:1593:2: ( rule__DataStructure__NameAssignment_1 )
            // InternalDataDsl.g:1593:3: rule__DataStructure__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataStructure__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataStructureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__Group__1__Impl"


    // $ANTLR start "rule__DataStructure__Group__2"
    // InternalDataDsl.g:1601:1: rule__DataStructure__Group__2 : rule__DataStructure__Group__2__Impl rule__DataStructure__Group__3 ;
    public final void rule__DataStructure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1605:1: ( rule__DataStructure__Group__2__Impl rule__DataStructure__Group__3 )
            // InternalDataDsl.g:1606:2: rule__DataStructure__Group__2__Impl rule__DataStructure__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__DataStructure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataStructure__Group__3();

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
    // $ANTLR end "rule__DataStructure__Group__2"


    // $ANTLR start "rule__DataStructure__Group__2__Impl"
    // InternalDataDsl.g:1613:1: rule__DataStructure__Group__2__Impl : ( ( rule__DataStructure__Group_2__0 )? ) ;
    public final void rule__DataStructure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1617:1: ( ( ( rule__DataStructure__Group_2__0 )? ) )
            // InternalDataDsl.g:1618:1: ( ( rule__DataStructure__Group_2__0 )? )
            {
            // InternalDataDsl.g:1618:1: ( ( rule__DataStructure__Group_2__0 )? )
            // InternalDataDsl.g:1619:2: ( rule__DataStructure__Group_2__0 )?
            {
             before(grammarAccess.getDataStructureAccess().getGroup_2()); 
            // InternalDataDsl.g:1620:2: ( rule__DataStructure__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDataDsl.g:1620:3: rule__DataStructure__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataStructure__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataStructureAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__Group__2__Impl"


    // $ANTLR start "rule__DataStructure__Group__3"
    // InternalDataDsl.g:1628:1: rule__DataStructure__Group__3 : rule__DataStructure__Group__3__Impl rule__DataStructure__Group__4 ;
    public final void rule__DataStructure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1632:1: ( rule__DataStructure__Group__3__Impl rule__DataStructure__Group__4 )
            // InternalDataDsl.g:1633:2: rule__DataStructure__Group__3__Impl rule__DataStructure__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__DataStructure__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataStructure__Group__4();

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
    // $ANTLR end "rule__DataStructure__Group__3"


    // $ANTLR start "rule__DataStructure__Group__3__Impl"
    // InternalDataDsl.g:1640:1: rule__DataStructure__Group__3__Impl : ( ( rule__DataStructure__Group_3__0 )? ) ;
    public final void rule__DataStructure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1644:1: ( ( ( rule__DataStructure__Group_3__0 )? ) )
            // InternalDataDsl.g:1645:1: ( ( rule__DataStructure__Group_3__0 )? )
            {
            // InternalDataDsl.g:1645:1: ( ( rule__DataStructure__Group_3__0 )? )
            // InternalDataDsl.g:1646:2: ( rule__DataStructure__Group_3__0 )?
            {
             before(grammarAccess.getDataStructureAccess().getGroup_3()); 
            // InternalDataDsl.g:1647:2: ( rule__DataStructure__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDataDsl.g:1647:3: rule__DataStructure__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataStructure__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataStructureAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__Group__3__Impl"


    // $ANTLR start "rule__DataStructure__Group__4"
    // InternalDataDsl.g:1655:1: rule__DataStructure__Group__4 : rule__DataStructure__Group__4__Impl rule__DataStructure__Group__5 ;
    public final void rule__DataStructure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1659:1: ( rule__DataStructure__Group__4__Impl rule__DataStructure__Group__5 )
            // InternalDataDsl.g:1660:2: rule__DataStructure__Group__4__Impl rule__DataStructure__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__DataStructure__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataStructure__Group__5();

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
    // $ANTLR end "rule__DataStructure__Group__4"


    // $ANTLR start "rule__DataStructure__Group__4__Impl"
    // InternalDataDsl.g:1667:1: rule__DataStructure__Group__4__Impl : ( '{' ) ;
    public final void rule__DataStructure__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1671:1: ( ( '{' ) )
            // InternalDataDsl.g:1672:1: ( '{' )
            {
            // InternalDataDsl.g:1672:1: ( '{' )
            // InternalDataDsl.g:1673:2: '{'
            {
             before(grammarAccess.getDataStructureAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDataStructureAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__Group__4__Impl"


    // $ANTLR start "rule__DataStructure__Group__5"
    // InternalDataDsl.g:1682:1: rule__DataStructure__Group__5 : rule__DataStructure__Group__5__Impl rule__DataStructure__Group__6 ;
    public final void rule__DataStructure__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1686:1: ( rule__DataStructure__Group__5__Impl rule__DataStructure__Group__6 )
            // InternalDataDsl.g:1687:2: rule__DataStructure__Group__5__Impl rule__DataStructure__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__DataStructure__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataStructure__Group__6();

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
    // $ANTLR end "rule__DataStructure__Group__5"


    // $ANTLR start "rule__DataStructure__Group__5__Impl"
    // InternalDataDsl.g:1694:1: rule__DataStructure__Group__5__Impl : ( ( rule__DataStructure__Group_5__0 )? ) ;
    public final void rule__DataStructure__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1698:1: ( ( ( rule__DataStructure__Group_5__0 )? ) )
            // InternalDataDsl.g:1699:1: ( ( rule__DataStructure__Group_5__0 )? )
            {
            // InternalDataDsl.g:1699:1: ( ( rule__DataStructure__Group_5__0 )? )
            // InternalDataDsl.g:1700:2: ( rule__DataStructure__Group_5__0 )?
            {
             before(grammarAccess.getDataStructureAccess().getGroup_5()); 
            // InternalDataDsl.g:1701:2: ( rule__DataStructure__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID||LA28_0==49||(LA28_0>=51 && LA28_0<=61)||(LA28_0>=63 && LA28_0<=65)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDataDsl.g:1701:3: rule__DataStructure__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataStructure__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataStructureAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__Group__5__Impl"


    // $ANTLR start "rule__DataStructure__Group__6"
    // InternalDataDsl.g:1709:1: rule__DataStructure__Group__6 : rule__DataStructure__Group__6__Impl ;
    public final void rule__DataStructure__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1713:1: ( rule__DataStructure__Group__6__Impl )
            // InternalDataDsl.g:1714:2: rule__DataStructure__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataStructure__Group__6__Impl();

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
    // $ANTLR end "rule__DataStructure__Group__6"


    // $ANTLR start "rule__DataStructure__Group__6__Impl"
    // InternalDataDsl.g:1720:1: rule__DataStructure__Group__6__Impl : ( '}' ) ;
    public final void rule__DataStructure__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1724:1: ( ( '}' ) )
            // InternalDataDsl.g:1725:1: ( '}' )
            {
            // InternalDataDsl.g:1725:1: ( '}' )
            // InternalDataDsl.g:1726:2: '}'
            {
             before(grammarAccess.getDataStructureAccess().getRightCurlyBracketKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDataStructureAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__Group__6__Impl"


    // $ANTLR start "rule__DataStructure__Group_2__0"
    // InternalDataDsl.g:1736:1: rule__DataStructure__Group_2__0 : rule__DataStructure__Group_2__0__Impl rule__DataStructure__Group_2__1 ;
    public final void rule__DataStructure__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1740:1: ( rule__DataStructure__Group_2__0__Impl rule__DataStructure__Group_2__1 )
            // InternalDataDsl.g:1741:2: rule__DataStructure__Group_2__0__Impl rule__DataStructure__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__DataStructure__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataStructure__Group_2__1();

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
    // $ANTLR end "rule__DataStructure__Group_2__0"


    // $ANTLR start "rule__DataStructure__Group_2__0__Impl"
    // InternalDataDsl.g:1748:1: rule__DataStructure__Group_2__0__Impl : ( '<' ) ;
    public final void rule__DataStructure__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1752:1: ( ( '<' ) )
            // InternalDataDsl.g:1753:1: ( '<' )
            {
            // InternalDataDsl.g:1753:1: ( '<' )
            // InternalDataDsl.g:1754:2: '<'
            {
             before(grammarAccess.getDataStructureAccess().getLessThanSignKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDataStructureAccess().getLessThanSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__Group_2__0__Impl"


    // $ANTLR start "rule__DataStructure__Group_2__1"
    // InternalDataDsl.g:1763:1: rule__DataStructure__Group_2__1 : rule__DataStructure__Group_2__1__Impl rule__DataStructure__Group_2__2 ;
    public final void rule__DataStructure__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1767:1: ( rule__DataStructure__Group_2__1__Impl rule__DataStructure__Group_2__2 )
            // InternalDataDsl.g:1768:2: rule__DataStructure__Group_2__1__Impl rule__DataStructure__Group_2__2
            {
            pushFollow(FOLLOW_20);
            rule__DataStructure__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataStructure__Group_2__2();

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
    // $ANTLR end "rule__DataStructure__Group_2__1"


    // $ANTLR start "rule__DataStructure__Group_2__1__Impl"
    // InternalDataDsl.g:1775:1: rule__DataStructure__Group_2__1__Impl : ( ( rule__DataStructure__FeaturesAssignment_2_1 ) ) ;
    public final void rule__DataStructure__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1779:1: ( ( ( rule__DataStructure__FeaturesAssignment_2_1 ) ) )
            // InternalDataDsl.g:1780:1: ( ( rule__DataStructure__FeaturesAssignment_2_1 ) )
            {
            // InternalDataDsl.g:1780:1: ( ( rule__DataStructure__FeaturesAssignment_2_1 ) )
            // InternalDataDsl.g:1781:2: ( rule__DataStructure__FeaturesAssignment_2_1 )
            {
             before(grammarAccess.getDataStructureAccess().getFeaturesAssignment_2_1()); 
            // InternalDataDsl.g:1782:2: ( rule__DataStructure__FeaturesAssignment_2_1 )
            // InternalDataDsl.g:1782:3: rule__DataStructure__FeaturesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataStructure__FeaturesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataStructureAccess().getFeaturesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__Group_2__1__Impl"


    // $ANTLR start "rule__DataStructure__Group_2__2"
    // InternalDataDsl.g:1790:1: rule__DataStructure__Group_2__2 : rule__DataStructure__Group_2__2__Impl rule__DataStructure__Group_2__3 ;
    public final void rule__DataStructure__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1794:1: ( rule__DataStructure__Group_2__2__Impl rule__DataStructure__Group_2__3 )
            // InternalDataDsl.g:1795:2: rule__DataStructure__Group_2__2__Impl rule__DataStructure__Group_2__3
            {
            pushFollow(FOLLOW_20);
            rule__DataStructure__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataStructure__Group_2__3();

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
    // $ANTLR end "rule__DataStructure__Group_2__2"


    // $ANTLR start "rule__DataStructure__Group_2__2__Impl"
    // InternalDataDsl.g:1802:1: rule__DataStructure__Group_2__2__Impl : ( ( rule__DataStructure__Group_2_2__0 )* ) ;
    public final void rule__DataStructure__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1806:1: ( ( ( rule__DataStructure__Group_2_2__0 )* ) )
            // InternalDataDsl.g:1807:1: ( ( rule__DataStructure__Group_2_2__0 )* )
            {
            // InternalDataDsl.g:1807:1: ( ( rule__DataStructure__Group_2_2__0 )* )
            // InternalDataDsl.g:1808:2: ( rule__DataStructure__Group_2_2__0 )*
            {
             before(grammarAccess.getDataStructureAccess().getGroup_2_2()); 
            // InternalDataDsl.g:1809:2: ( rule__DataStructure__Group_2_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==43) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDataDsl.g:1809:3: rule__DataStructure__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__DataStructure__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getDataStructureAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__Group_2__2__Impl"


    // $ANTLR start "rule__DataStructure__Group_2__3"
    // InternalDataDsl.g:1817:1: rule__DataStructure__Group_2__3 : rule__DataStructure__Group_2__3__Impl ;
    public final void rule__DataStructure__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1821:1: ( rule__DataStructure__Group_2__3__Impl )
            // InternalDataDsl.g:1822:2: rule__DataStructure__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataStructure__Group_2__3__Impl();

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
    // $ANTLR end "rule__DataStructure__Group_2__3"


    // $ANTLR start "rule__DataStructure__Group_2__3__Impl"
    // InternalDataDsl.g:1828:1: rule__DataStructure__Group_2__3__Impl : ( '>' ) ;
    public final void rule__DataStructure__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1832:1: ( ( '>' ) )
            // InternalDataDsl.g:1833:1: ( '>' )
            {
            // InternalDataDsl.g:1833:1: ( '>' )
            // InternalDataDsl.g:1834:2: '>'
            {
             before(grammarAccess.getDataStructureAccess().getGreaterThanSignKeyword_2_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDataStructureAccess().getGreaterThanSignKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__Group_2__3__Impl"


    // $ANTLR start "rule__DataStructure__Group_2_2__0"
    // InternalDataDsl.g:1844:1: rule__DataStructure__Group_2_2__0 : rule__DataStructure__Group_2_2__0__Impl rule__DataStructure__Group_2_2__1 ;
    public final void rule__DataStructure__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1848:1: ( rule__DataStructure__Group_2_2__0__Impl rule__DataStructure__Group_2_2__1 )
            // InternalDataDsl.g:1849:2: rule__DataStructure__Group_2_2__0__Impl rule__DataStructure__Group_2_2__1
            {
            pushFollow(FOLLOW_19);
            rule__DataStructure__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataStructure__Group_2_2__1();

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
    // $ANTLR end "rule__DataStructure__Group_2_2__0"


    // $ANTLR start "rule__DataStructure__Group_2_2__0__Impl"
    // InternalDataDsl.g:1856:1: rule__DataStructure__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__DataStructure__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1860:1: ( ( ',' ) )
            // InternalDataDsl.g:1861:1: ( ',' )
            {
            // InternalDataDsl.g:1861:1: ( ',' )
            // InternalDataDsl.g:1862:2: ','
            {
             before(grammarAccess.getDataStructureAccess().getCommaKeyword_2_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDataStructureAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__Group_2_2__0__Impl"


    // $ANTLR start "rule__DataStructure__Group_2_2__1"
    // InternalDataDsl.g:1871:1: rule__DataStructure__Group_2_2__1 : rule__DataStructure__Group_2_2__1__Impl ;
    public final void rule__DataStructure__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1875:1: ( rule__DataStructure__Group_2_2__1__Impl )
            // InternalDataDsl.g:1876:2: rule__DataStructure__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataStructure__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__DataStructure__Group_2_2__1"


    // $ANTLR start "rule__DataStructure__Group_2_2__1__Impl"
    // InternalDataDsl.g:1882:1: rule__DataStructure__Group_2_2__1__Impl : ( ( rule__DataStructure__FeaturesAssignment_2_2_1 ) ) ;
    public final void rule__DataStructure__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1886:1: ( ( ( rule__DataStructure__FeaturesAssignment_2_2_1 ) ) )
            // InternalDataDsl.g:1887:1: ( ( rule__DataStructure__FeaturesAssignment_2_2_1 ) )
            {
            // InternalDataDsl.g:1887:1: ( ( rule__DataStructure__FeaturesAssignment_2_2_1 ) )
            // InternalDataDsl.g:1888:2: ( rule__DataStructure__FeaturesAssignment_2_2_1 )
            {
             before(grammarAccess.getDataStructureAccess().getFeaturesAssignment_2_2_1()); 
            // InternalDataDsl.g:1889:2: ( rule__DataStructure__FeaturesAssignment_2_2_1 )
            // InternalDataDsl.g:1889:3: rule__DataStructure__FeaturesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataStructure__FeaturesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataStructureAccess().getFeaturesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__Group_2_2__1__Impl"


    // $ANTLR start "rule__DataStructure__Group_3__0"
    // InternalDataDsl.g:1898:1: rule__DataStructure__Group_3__0 : rule__DataStructure__Group_3__0__Impl rule__DataStructure__Group_3__1 ;
    public final void rule__DataStructure__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1902:1: ( rule__DataStructure__Group_3__0__Impl rule__DataStructure__Group_3__1 )
            // InternalDataDsl.g:1903:2: rule__DataStructure__Group_3__0__Impl rule__DataStructure__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__DataStructure__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataStructure__Group_3__1();

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
    // $ANTLR end "rule__DataStructure__Group_3__0"


    // $ANTLR start "rule__DataStructure__Group_3__0__Impl"
    // InternalDataDsl.g:1910:1: rule__DataStructure__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__DataStructure__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1914:1: ( ( 'extends' ) )
            // InternalDataDsl.g:1915:1: ( 'extends' )
            {
            // InternalDataDsl.g:1915:1: ( 'extends' )
            // InternalDataDsl.g:1916:2: 'extends'
            {
             before(grammarAccess.getDataStructureAccess().getExtendsKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getDataStructureAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__Group_3__0__Impl"


    // $ANTLR start "rule__DataStructure__Group_3__1"
    // InternalDataDsl.g:1925:1: rule__DataStructure__Group_3__1 : rule__DataStructure__Group_3__1__Impl ;
    public final void rule__DataStructure__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1929:1: ( rule__DataStructure__Group_3__1__Impl )
            // InternalDataDsl.g:1930:2: rule__DataStructure__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataStructure__Group_3__1__Impl();

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
    // $ANTLR end "rule__DataStructure__Group_3__1"


    // $ANTLR start "rule__DataStructure__Group_3__1__Impl"
    // InternalDataDsl.g:1936:1: rule__DataStructure__Group_3__1__Impl : ( ( rule__DataStructure__SuperAssignment_3_1 ) ) ;
    public final void rule__DataStructure__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1940:1: ( ( ( rule__DataStructure__SuperAssignment_3_1 ) ) )
            // InternalDataDsl.g:1941:1: ( ( rule__DataStructure__SuperAssignment_3_1 ) )
            {
            // InternalDataDsl.g:1941:1: ( ( rule__DataStructure__SuperAssignment_3_1 ) )
            // InternalDataDsl.g:1942:2: ( rule__DataStructure__SuperAssignment_3_1 )
            {
             before(grammarAccess.getDataStructureAccess().getSuperAssignment_3_1()); 
            // InternalDataDsl.g:1943:2: ( rule__DataStructure__SuperAssignment_3_1 )
            // InternalDataDsl.g:1943:3: rule__DataStructure__SuperAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DataStructure__SuperAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDataStructureAccess().getSuperAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__Group_3__1__Impl"


    // $ANTLR start "rule__DataStructure__Group_5__0"
    // InternalDataDsl.g:1952:1: rule__DataStructure__Group_5__0 : rule__DataStructure__Group_5__0__Impl rule__DataStructure__Group_5__1 ;
    public final void rule__DataStructure__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1956:1: ( rule__DataStructure__Group_5__0__Impl rule__DataStructure__Group_5__1 )
            // InternalDataDsl.g:1957:2: rule__DataStructure__Group_5__0__Impl rule__DataStructure__Group_5__1
            {
            pushFollow(FOLLOW_22);
            rule__DataStructure__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataStructure__Group_5__1();

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
    // $ANTLR end "rule__DataStructure__Group_5__0"


    // $ANTLR start "rule__DataStructure__Group_5__0__Impl"
    // InternalDataDsl.g:1964:1: rule__DataStructure__Group_5__0__Impl : ( ( rule__DataStructure__Alternatives_5_0 ) ) ;
    public final void rule__DataStructure__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1968:1: ( ( ( rule__DataStructure__Alternatives_5_0 ) ) )
            // InternalDataDsl.g:1969:1: ( ( rule__DataStructure__Alternatives_5_0 ) )
            {
            // InternalDataDsl.g:1969:1: ( ( rule__DataStructure__Alternatives_5_0 ) )
            // InternalDataDsl.g:1970:2: ( rule__DataStructure__Alternatives_5_0 )
            {
             before(grammarAccess.getDataStructureAccess().getAlternatives_5_0()); 
            // InternalDataDsl.g:1971:2: ( rule__DataStructure__Alternatives_5_0 )
            // InternalDataDsl.g:1971:3: rule__DataStructure__Alternatives_5_0
            {
            pushFollow(FOLLOW_2);
            rule__DataStructure__Alternatives_5_0();

            state._fsp--;


            }

             after(grammarAccess.getDataStructureAccess().getAlternatives_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__Group_5__0__Impl"


    // $ANTLR start "rule__DataStructure__Group_5__1"
    // InternalDataDsl.g:1979:1: rule__DataStructure__Group_5__1 : rule__DataStructure__Group_5__1__Impl ;
    public final void rule__DataStructure__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1983:1: ( rule__DataStructure__Group_5__1__Impl )
            // InternalDataDsl.g:1984:2: rule__DataStructure__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataStructure__Group_5__1__Impl();

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
    // $ANTLR end "rule__DataStructure__Group_5__1"


    // $ANTLR start "rule__DataStructure__Group_5__1__Impl"
    // InternalDataDsl.g:1990:1: rule__DataStructure__Group_5__1__Impl : ( ( rule__DataStructure__Group_5_1__0 )* ) ;
    public final void rule__DataStructure__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1994:1: ( ( ( rule__DataStructure__Group_5_1__0 )* ) )
            // InternalDataDsl.g:1995:1: ( ( rule__DataStructure__Group_5_1__0 )* )
            {
            // InternalDataDsl.g:1995:1: ( ( rule__DataStructure__Group_5_1__0 )* )
            // InternalDataDsl.g:1996:2: ( rule__DataStructure__Group_5_1__0 )*
            {
             before(grammarAccess.getDataStructureAccess().getGroup_5_1()); 
            // InternalDataDsl.g:1997:2: ( rule__DataStructure__Group_5_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==43) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalDataDsl.g:1997:3: rule__DataStructure__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__DataStructure__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getDataStructureAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__Group_5__1__Impl"


    // $ANTLR start "rule__DataStructure__Group_5_1__0"
    // InternalDataDsl.g:2006:1: rule__DataStructure__Group_5_1__0 : rule__DataStructure__Group_5_1__0__Impl rule__DataStructure__Group_5_1__1 ;
    public final void rule__DataStructure__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2010:1: ( rule__DataStructure__Group_5_1__0__Impl rule__DataStructure__Group_5_1__1 )
            // InternalDataDsl.g:2011:2: rule__DataStructure__Group_5_1__0__Impl rule__DataStructure__Group_5_1__1
            {
            pushFollow(FOLLOW_23);
            rule__DataStructure__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataStructure__Group_5_1__1();

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
    // $ANTLR end "rule__DataStructure__Group_5_1__0"


    // $ANTLR start "rule__DataStructure__Group_5_1__0__Impl"
    // InternalDataDsl.g:2018:1: rule__DataStructure__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__DataStructure__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2022:1: ( ( ',' ) )
            // InternalDataDsl.g:2023:1: ( ',' )
            {
            // InternalDataDsl.g:2023:1: ( ',' )
            // InternalDataDsl.g:2024:2: ','
            {
             before(grammarAccess.getDataStructureAccess().getCommaKeyword_5_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDataStructureAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__Group_5_1__0__Impl"


    // $ANTLR start "rule__DataStructure__Group_5_1__1"
    // InternalDataDsl.g:2033:1: rule__DataStructure__Group_5_1__1 : rule__DataStructure__Group_5_1__1__Impl ;
    public final void rule__DataStructure__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2037:1: ( rule__DataStructure__Group_5_1__1__Impl )
            // InternalDataDsl.g:2038:2: rule__DataStructure__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataStructure__Group_5_1__1__Impl();

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
    // $ANTLR end "rule__DataStructure__Group_5_1__1"


    // $ANTLR start "rule__DataStructure__Group_5_1__1__Impl"
    // InternalDataDsl.g:2044:1: rule__DataStructure__Group_5_1__1__Impl : ( ( rule__DataStructure__Alternatives_5_1_1 ) ) ;
    public final void rule__DataStructure__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2048:1: ( ( ( rule__DataStructure__Alternatives_5_1_1 ) ) )
            // InternalDataDsl.g:2049:1: ( ( rule__DataStructure__Alternatives_5_1_1 ) )
            {
            // InternalDataDsl.g:2049:1: ( ( rule__DataStructure__Alternatives_5_1_1 ) )
            // InternalDataDsl.g:2050:2: ( rule__DataStructure__Alternatives_5_1_1 )
            {
             before(grammarAccess.getDataStructureAccess().getAlternatives_5_1_1()); 
            // InternalDataDsl.g:2051:2: ( rule__DataStructure__Alternatives_5_1_1 )
            // InternalDataDsl.g:2051:3: rule__DataStructure__Alternatives_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DataStructure__Alternatives_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDataStructureAccess().getAlternatives_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__Group_5_1__1__Impl"


    // $ANTLR start "rule__ListType__Group_0__0"
    // InternalDataDsl.g:2060:1: rule__ListType__Group_0__0 : rule__ListType__Group_0__0__Impl rule__ListType__Group_0__1 ;
    public final void rule__ListType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2064:1: ( rule__ListType__Group_0__0__Impl rule__ListType__Group_0__1 )
            // InternalDataDsl.g:2065:2: rule__ListType__Group_0__0__Impl rule__ListType__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__ListType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group_0__1();

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
    // $ANTLR end "rule__ListType__Group_0__0"


    // $ANTLR start "rule__ListType__Group_0__0__Impl"
    // InternalDataDsl.g:2072:1: rule__ListType__Group_0__0__Impl : ( ( rule__ListType__Alternatives_0_0 ) ) ;
    public final void rule__ListType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2076:1: ( ( ( rule__ListType__Alternatives_0_0 ) ) )
            // InternalDataDsl.g:2077:1: ( ( rule__ListType__Alternatives_0_0 ) )
            {
            // InternalDataDsl.g:2077:1: ( ( rule__ListType__Alternatives_0_0 ) )
            // InternalDataDsl.g:2078:2: ( rule__ListType__Alternatives_0_0 )
            {
             before(grammarAccess.getListTypeAccess().getAlternatives_0_0()); 
            // InternalDataDsl.g:2079:2: ( rule__ListType__Alternatives_0_0 )
            // InternalDataDsl.g:2079:3: rule__ListType__Alternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__ListType__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group_0__0__Impl"


    // $ANTLR start "rule__ListType__Group_0__1"
    // InternalDataDsl.g:2087:1: rule__ListType__Group_0__1 : rule__ListType__Group_0__1__Impl rule__ListType__Group_0__2 ;
    public final void rule__ListType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2091:1: ( rule__ListType__Group_0__1__Impl rule__ListType__Group_0__2 )
            // InternalDataDsl.g:2092:2: rule__ListType__Group_0__1__Impl rule__ListType__Group_0__2
            {
            pushFollow(FOLLOW_13);
            rule__ListType__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group_0__2();

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
    // $ANTLR end "rule__ListType__Group_0__1"


    // $ANTLR start "rule__ListType__Group_0__1__Impl"
    // InternalDataDsl.g:2099:1: rule__ListType__Group_0__1__Impl : ( ( rule__ListType__NameAssignment_0_1 ) ) ;
    public final void rule__ListType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2103:1: ( ( ( rule__ListType__NameAssignment_0_1 ) ) )
            // InternalDataDsl.g:2104:1: ( ( rule__ListType__NameAssignment_0_1 ) )
            {
            // InternalDataDsl.g:2104:1: ( ( rule__ListType__NameAssignment_0_1 ) )
            // InternalDataDsl.g:2105:2: ( rule__ListType__NameAssignment_0_1 )
            {
             before(grammarAccess.getListTypeAccess().getNameAssignment_0_1()); 
            // InternalDataDsl.g:2106:2: ( rule__ListType__NameAssignment_0_1 )
            // InternalDataDsl.g:2106:3: rule__ListType__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ListType__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group_0__1__Impl"


    // $ANTLR start "rule__ListType__Group_0__2"
    // InternalDataDsl.g:2114:1: rule__ListType__Group_0__2 : rule__ListType__Group_0__2__Impl rule__ListType__Group_0__3 ;
    public final void rule__ListType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2118:1: ( rule__ListType__Group_0__2__Impl rule__ListType__Group_0__3 )
            // InternalDataDsl.g:2119:2: rule__ListType__Group_0__2__Impl rule__ListType__Group_0__3
            {
            pushFollow(FOLLOW_24);
            rule__ListType__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group_0__3();

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
    // $ANTLR end "rule__ListType__Group_0__2"


    // $ANTLR start "rule__ListType__Group_0__2__Impl"
    // InternalDataDsl.g:2126:1: rule__ListType__Group_0__2__Impl : ( '{' ) ;
    public final void rule__ListType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2130:1: ( ( '{' ) )
            // InternalDataDsl.g:2131:1: ( '{' )
            {
            // InternalDataDsl.g:2131:1: ( '{' )
            // InternalDataDsl.g:2132:2: '{'
            {
             before(grammarAccess.getListTypeAccess().getLeftCurlyBracketKeyword_0_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getListTypeAccess().getLeftCurlyBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group_0__2__Impl"


    // $ANTLR start "rule__ListType__Group_0__3"
    // InternalDataDsl.g:2141:1: rule__ListType__Group_0__3 : rule__ListType__Group_0__3__Impl rule__ListType__Group_0__4 ;
    public final void rule__ListType__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2145:1: ( rule__ListType__Group_0__3__Impl rule__ListType__Group_0__4 )
            // InternalDataDsl.g:2146:2: rule__ListType__Group_0__3__Impl rule__ListType__Group_0__4
            {
            pushFollow(FOLLOW_25);
            rule__ListType__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group_0__4();

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
    // $ANTLR end "rule__ListType__Group_0__3"


    // $ANTLR start "rule__ListType__Group_0__3__Impl"
    // InternalDataDsl.g:2153:1: rule__ListType__Group_0__3__Impl : ( ( rule__ListType__DataFieldsAssignment_0_3 ) ) ;
    public final void rule__ListType__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2157:1: ( ( ( rule__ListType__DataFieldsAssignment_0_3 ) ) )
            // InternalDataDsl.g:2158:1: ( ( rule__ListType__DataFieldsAssignment_0_3 ) )
            {
            // InternalDataDsl.g:2158:1: ( ( rule__ListType__DataFieldsAssignment_0_3 ) )
            // InternalDataDsl.g:2159:2: ( rule__ListType__DataFieldsAssignment_0_3 )
            {
             before(grammarAccess.getListTypeAccess().getDataFieldsAssignment_0_3()); 
            // InternalDataDsl.g:2160:2: ( rule__ListType__DataFieldsAssignment_0_3 )
            // InternalDataDsl.g:2160:3: rule__ListType__DataFieldsAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__ListType__DataFieldsAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getDataFieldsAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group_0__3__Impl"


    // $ANTLR start "rule__ListType__Group_0__4"
    // InternalDataDsl.g:2168:1: rule__ListType__Group_0__4 : rule__ListType__Group_0__4__Impl rule__ListType__Group_0__5 ;
    public final void rule__ListType__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2172:1: ( rule__ListType__Group_0__4__Impl rule__ListType__Group_0__5 )
            // InternalDataDsl.g:2173:2: rule__ListType__Group_0__4__Impl rule__ListType__Group_0__5
            {
            pushFollow(FOLLOW_25);
            rule__ListType__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group_0__5();

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
    // $ANTLR end "rule__ListType__Group_0__4"


    // $ANTLR start "rule__ListType__Group_0__4__Impl"
    // InternalDataDsl.g:2180:1: rule__ListType__Group_0__4__Impl : ( ( rule__ListType__Group_0_4__0 )* ) ;
    public final void rule__ListType__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2184:1: ( ( ( rule__ListType__Group_0_4__0 )* ) )
            // InternalDataDsl.g:2185:1: ( ( rule__ListType__Group_0_4__0 )* )
            {
            // InternalDataDsl.g:2185:1: ( ( rule__ListType__Group_0_4__0 )* )
            // InternalDataDsl.g:2186:2: ( rule__ListType__Group_0_4__0 )*
            {
             before(grammarAccess.getListTypeAccess().getGroup_0_4()); 
            // InternalDataDsl.g:2187:2: ( rule__ListType__Group_0_4__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==43) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDataDsl.g:2187:3: rule__ListType__Group_0_4__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ListType__Group_0_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getListTypeAccess().getGroup_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group_0__4__Impl"


    // $ANTLR start "rule__ListType__Group_0__5"
    // InternalDataDsl.g:2195:1: rule__ListType__Group_0__5 : rule__ListType__Group_0__5__Impl ;
    public final void rule__ListType__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2199:1: ( rule__ListType__Group_0__5__Impl )
            // InternalDataDsl.g:2200:2: rule__ListType__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListType__Group_0__5__Impl();

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
    // $ANTLR end "rule__ListType__Group_0__5"


    // $ANTLR start "rule__ListType__Group_0__5__Impl"
    // InternalDataDsl.g:2206:1: rule__ListType__Group_0__5__Impl : ( '}' ) ;
    public final void rule__ListType__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2210:1: ( ( '}' ) )
            // InternalDataDsl.g:2211:1: ( '}' )
            {
            // InternalDataDsl.g:2211:1: ( '}' )
            // InternalDataDsl.g:2212:2: '}'
            {
             before(grammarAccess.getListTypeAccess().getRightCurlyBracketKeyword_0_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getListTypeAccess().getRightCurlyBracketKeyword_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group_0__5__Impl"


    // $ANTLR start "rule__ListType__Group_0_4__0"
    // InternalDataDsl.g:2222:1: rule__ListType__Group_0_4__0 : rule__ListType__Group_0_4__0__Impl rule__ListType__Group_0_4__1 ;
    public final void rule__ListType__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2226:1: ( rule__ListType__Group_0_4__0__Impl rule__ListType__Group_0_4__1 )
            // InternalDataDsl.g:2227:2: rule__ListType__Group_0_4__0__Impl rule__ListType__Group_0_4__1
            {
            pushFollow(FOLLOW_24);
            rule__ListType__Group_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group_0_4__1();

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
    // $ANTLR end "rule__ListType__Group_0_4__0"


    // $ANTLR start "rule__ListType__Group_0_4__0__Impl"
    // InternalDataDsl.g:2234:1: rule__ListType__Group_0_4__0__Impl : ( ',' ) ;
    public final void rule__ListType__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2238:1: ( ( ',' ) )
            // InternalDataDsl.g:2239:1: ( ',' )
            {
            // InternalDataDsl.g:2239:1: ( ',' )
            // InternalDataDsl.g:2240:2: ','
            {
             before(grammarAccess.getListTypeAccess().getCommaKeyword_0_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getListTypeAccess().getCommaKeyword_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group_0_4__0__Impl"


    // $ANTLR start "rule__ListType__Group_0_4__1"
    // InternalDataDsl.g:2249:1: rule__ListType__Group_0_4__1 : rule__ListType__Group_0_4__1__Impl ;
    public final void rule__ListType__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2253:1: ( rule__ListType__Group_0_4__1__Impl )
            // InternalDataDsl.g:2254:2: rule__ListType__Group_0_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListType__Group_0_4__1__Impl();

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
    // $ANTLR end "rule__ListType__Group_0_4__1"


    // $ANTLR start "rule__ListType__Group_0_4__1__Impl"
    // InternalDataDsl.g:2260:1: rule__ListType__Group_0_4__1__Impl : ( ( rule__ListType__DataFieldsAssignment_0_4_1 ) ) ;
    public final void rule__ListType__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2264:1: ( ( ( rule__ListType__DataFieldsAssignment_0_4_1 ) ) )
            // InternalDataDsl.g:2265:1: ( ( rule__ListType__DataFieldsAssignment_0_4_1 ) )
            {
            // InternalDataDsl.g:2265:1: ( ( rule__ListType__DataFieldsAssignment_0_4_1 ) )
            // InternalDataDsl.g:2266:2: ( rule__ListType__DataFieldsAssignment_0_4_1 )
            {
             before(grammarAccess.getListTypeAccess().getDataFieldsAssignment_0_4_1()); 
            // InternalDataDsl.g:2267:2: ( rule__ListType__DataFieldsAssignment_0_4_1 )
            // InternalDataDsl.g:2267:3: rule__ListType__DataFieldsAssignment_0_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ListType__DataFieldsAssignment_0_4_1();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getDataFieldsAssignment_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group_0_4__1__Impl"


    // $ANTLR start "rule__ListType__Group_1__0"
    // InternalDataDsl.g:2276:1: rule__ListType__Group_1__0 : rule__ListType__Group_1__0__Impl rule__ListType__Group_1__1 ;
    public final void rule__ListType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2280:1: ( rule__ListType__Group_1__0__Impl rule__ListType__Group_1__1 )
            // InternalDataDsl.g:2281:2: rule__ListType__Group_1__0__Impl rule__ListType__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__ListType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group_1__1();

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
    // $ANTLR end "rule__ListType__Group_1__0"


    // $ANTLR start "rule__ListType__Group_1__0__Impl"
    // InternalDataDsl.g:2288:1: rule__ListType__Group_1__0__Impl : ( ( rule__ListType__Alternatives_1_0 ) ) ;
    public final void rule__ListType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2292:1: ( ( ( rule__ListType__Alternatives_1_0 ) ) )
            // InternalDataDsl.g:2293:1: ( ( rule__ListType__Alternatives_1_0 ) )
            {
            // InternalDataDsl.g:2293:1: ( ( rule__ListType__Alternatives_1_0 ) )
            // InternalDataDsl.g:2294:2: ( rule__ListType__Alternatives_1_0 )
            {
             before(grammarAccess.getListTypeAccess().getAlternatives_1_0()); 
            // InternalDataDsl.g:2295:2: ( rule__ListType__Alternatives_1_0 )
            // InternalDataDsl.g:2295:3: rule__ListType__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ListType__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group_1__0__Impl"


    // $ANTLR start "rule__ListType__Group_1__1"
    // InternalDataDsl.g:2303:1: rule__ListType__Group_1__1 : rule__ListType__Group_1__1__Impl rule__ListType__Group_1__2 ;
    public final void rule__ListType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2307:1: ( rule__ListType__Group_1__1__Impl rule__ListType__Group_1__2 )
            // InternalDataDsl.g:2308:2: rule__ListType__Group_1__1__Impl rule__ListType__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__ListType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group_1__2();

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
    // $ANTLR end "rule__ListType__Group_1__1"


    // $ANTLR start "rule__ListType__Group_1__1__Impl"
    // InternalDataDsl.g:2315:1: rule__ListType__Group_1__1__Impl : ( ( rule__ListType__NameAssignment_1_1 ) ) ;
    public final void rule__ListType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2319:1: ( ( ( rule__ListType__NameAssignment_1_1 ) ) )
            // InternalDataDsl.g:2320:1: ( ( rule__ListType__NameAssignment_1_1 ) )
            {
            // InternalDataDsl.g:2320:1: ( ( rule__ListType__NameAssignment_1_1 ) )
            // InternalDataDsl.g:2321:2: ( rule__ListType__NameAssignment_1_1 )
            {
             before(grammarAccess.getListTypeAccess().getNameAssignment_1_1()); 
            // InternalDataDsl.g:2322:2: ( rule__ListType__NameAssignment_1_1 )
            // InternalDataDsl.g:2322:3: rule__ListType__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ListType__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group_1__1__Impl"


    // $ANTLR start "rule__ListType__Group_1__2"
    // InternalDataDsl.g:2330:1: rule__ListType__Group_1__2 : rule__ListType__Group_1__2__Impl rule__ListType__Group_1__3 ;
    public final void rule__ListType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2334:1: ( rule__ListType__Group_1__2__Impl rule__ListType__Group_1__3 )
            // InternalDataDsl.g:2335:2: rule__ListType__Group_1__2__Impl rule__ListType__Group_1__3
            {
            pushFollow(FOLLOW_26);
            rule__ListType__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group_1__3();

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
    // $ANTLR end "rule__ListType__Group_1__2"


    // $ANTLR start "rule__ListType__Group_1__2__Impl"
    // InternalDataDsl.g:2342:1: rule__ListType__Group_1__2__Impl : ( '{' ) ;
    public final void rule__ListType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2346:1: ( ( '{' ) )
            // InternalDataDsl.g:2347:1: ( '{' )
            {
            // InternalDataDsl.g:2347:1: ( '{' )
            // InternalDataDsl.g:2348:2: '{'
            {
             before(grammarAccess.getListTypeAccess().getLeftCurlyBracketKeyword_1_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getListTypeAccess().getLeftCurlyBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group_1__2__Impl"


    // $ANTLR start "rule__ListType__Group_1__3"
    // InternalDataDsl.g:2357:1: rule__ListType__Group_1__3 : rule__ListType__Group_1__3__Impl rule__ListType__Group_1__4 ;
    public final void rule__ListType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2361:1: ( rule__ListType__Group_1__3__Impl rule__ListType__Group_1__4 )
            // InternalDataDsl.g:2362:2: rule__ListType__Group_1__3__Impl rule__ListType__Group_1__4
            {
            pushFollow(FOLLOW_16);
            rule__ListType__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListType__Group_1__4();

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
    // $ANTLR end "rule__ListType__Group_1__3"


    // $ANTLR start "rule__ListType__Group_1__3__Impl"
    // InternalDataDsl.g:2369:1: rule__ListType__Group_1__3__Impl : ( ( rule__ListType__PrimitiveTypeAssignment_1_3 ) ) ;
    public final void rule__ListType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2373:1: ( ( ( rule__ListType__PrimitiveTypeAssignment_1_3 ) ) )
            // InternalDataDsl.g:2374:1: ( ( rule__ListType__PrimitiveTypeAssignment_1_3 ) )
            {
            // InternalDataDsl.g:2374:1: ( ( rule__ListType__PrimitiveTypeAssignment_1_3 ) )
            // InternalDataDsl.g:2375:2: ( rule__ListType__PrimitiveTypeAssignment_1_3 )
            {
             before(grammarAccess.getListTypeAccess().getPrimitiveTypeAssignment_1_3()); 
            // InternalDataDsl.g:2376:2: ( rule__ListType__PrimitiveTypeAssignment_1_3 )
            // InternalDataDsl.g:2376:3: rule__ListType__PrimitiveTypeAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__ListType__PrimitiveTypeAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getListTypeAccess().getPrimitiveTypeAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group_1__3__Impl"


    // $ANTLR start "rule__ListType__Group_1__4"
    // InternalDataDsl.g:2384:1: rule__ListType__Group_1__4 : rule__ListType__Group_1__4__Impl ;
    public final void rule__ListType__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2388:1: ( rule__ListType__Group_1__4__Impl )
            // InternalDataDsl.g:2389:2: rule__ListType__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListType__Group_1__4__Impl();

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
    // $ANTLR end "rule__ListType__Group_1__4"


    // $ANTLR start "rule__ListType__Group_1__4__Impl"
    // InternalDataDsl.g:2395:1: rule__ListType__Group_1__4__Impl : ( '}' ) ;
    public final void rule__ListType__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2399:1: ( ( '}' ) )
            // InternalDataDsl.g:2400:1: ( '}' )
            {
            // InternalDataDsl.g:2400:1: ( '}' )
            // InternalDataDsl.g:2401:2: '}'
            {
             before(grammarAccess.getListTypeAccess().getRightCurlyBracketKeyword_1_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getListTypeAccess().getRightCurlyBracketKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__Group_1__4__Impl"


    // $ANTLR start "rule__DataField__Group__0"
    // InternalDataDsl.g:2411:1: rule__DataField__Group__0 : rule__DataField__Group__0__Impl rule__DataField__Group__1 ;
    public final void rule__DataField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2415:1: ( rule__DataField__Group__0__Impl rule__DataField__Group__1 )
            // InternalDataDsl.g:2416:2: rule__DataField__Group__0__Impl rule__DataField__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__DataField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataField__Group__1();

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
    // $ANTLR end "rule__DataField__Group__0"


    // $ANTLR start "rule__DataField__Group__0__Impl"
    // InternalDataDsl.g:2423:1: rule__DataField__Group__0__Impl : ( ( rule__DataField__HiddenAssignment_0 )? ) ;
    public final void rule__DataField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2427:1: ( ( ( rule__DataField__HiddenAssignment_0 )? ) )
            // InternalDataDsl.g:2428:1: ( ( rule__DataField__HiddenAssignment_0 )? )
            {
            // InternalDataDsl.g:2428:1: ( ( rule__DataField__HiddenAssignment_0 )? )
            // InternalDataDsl.g:2429:2: ( rule__DataField__HiddenAssignment_0 )?
            {
             before(grammarAccess.getDataFieldAccess().getHiddenAssignment_0()); 
            // InternalDataDsl.g:2430:2: ( rule__DataField__HiddenAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==63) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDataDsl.g:2430:3: rule__DataField__HiddenAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataField__HiddenAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataFieldAccess().getHiddenAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__Group__0__Impl"


    // $ANTLR start "rule__DataField__Group__1"
    // InternalDataDsl.g:2438:1: rule__DataField__Group__1 : rule__DataField__Group__1__Impl rule__DataField__Group__2 ;
    public final void rule__DataField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2442:1: ( rule__DataField__Group__1__Impl rule__DataField__Group__2 )
            // InternalDataDsl.g:2443:2: rule__DataField__Group__1__Impl rule__DataField__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__DataField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataField__Group__2();

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
    // $ANTLR end "rule__DataField__Group__1"


    // $ANTLR start "rule__DataField__Group__1__Impl"
    // InternalDataDsl.g:2450:1: rule__DataField__Group__1__Impl : ( ( rule__DataField__ImmutableAssignment_1 )? ) ;
    public final void rule__DataField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2454:1: ( ( ( rule__DataField__ImmutableAssignment_1 )? ) )
            // InternalDataDsl.g:2455:1: ( ( rule__DataField__ImmutableAssignment_1 )? )
            {
            // InternalDataDsl.g:2455:1: ( ( rule__DataField__ImmutableAssignment_1 )? )
            // InternalDataDsl.g:2456:2: ( rule__DataField__ImmutableAssignment_1 )?
            {
             before(grammarAccess.getDataFieldAccess().getImmutableAssignment_1()); 
            // InternalDataDsl.g:2457:2: ( rule__DataField__ImmutableAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==64) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDataDsl.g:2457:3: rule__DataField__ImmutableAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataField__ImmutableAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataFieldAccess().getImmutableAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__Group__1__Impl"


    // $ANTLR start "rule__DataField__Group__2"
    // InternalDataDsl.g:2465:1: rule__DataField__Group__2 : rule__DataField__Group__2__Impl rule__DataField__Group__3 ;
    public final void rule__DataField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2469:1: ( rule__DataField__Group__2__Impl rule__DataField__Group__3 )
            // InternalDataDsl.g:2470:2: rule__DataField__Group__2__Impl rule__DataField__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__DataField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataField__Group__3();

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
    // $ANTLR end "rule__DataField__Group__2"


    // $ANTLR start "rule__DataField__Group__2__Impl"
    // InternalDataDsl.g:2477:1: rule__DataField__Group__2__Impl : ( ( rule__DataField__Alternatives_2 )? ) ;
    public final void rule__DataField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2481:1: ( ( ( rule__DataField__Alternatives_2 )? ) )
            // InternalDataDsl.g:2482:1: ( ( rule__DataField__Alternatives_2 )? )
            {
            // InternalDataDsl.g:2482:1: ( ( rule__DataField__Alternatives_2 )? )
            // InternalDataDsl.g:2483:2: ( rule__DataField__Alternatives_2 )?
            {
             before(grammarAccess.getDataFieldAccess().getAlternatives_2()); 
            // InternalDataDsl.g:2484:2: ( rule__DataField__Alternatives_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=51 && LA34_0<=61)) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_ID) ) {
                int LA34_2 = input.LA(2);

                if ( (LA34_2==RULE_ID||LA34_2==50||LA34_2==62) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // InternalDataDsl.g:2484:3: rule__DataField__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataField__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataFieldAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__Group__2__Impl"


    // $ANTLR start "rule__DataField__Group__3"
    // InternalDataDsl.g:2492:1: rule__DataField__Group__3 : rule__DataField__Group__3__Impl rule__DataField__Group__4 ;
    public final void rule__DataField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2496:1: ( rule__DataField__Group__3__Impl rule__DataField__Group__4 )
            // InternalDataDsl.g:2497:2: rule__DataField__Group__3__Impl rule__DataField__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__DataField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataField__Group__4();

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
    // $ANTLR end "rule__DataField__Group__3"


    // $ANTLR start "rule__DataField__Group__3__Impl"
    // InternalDataDsl.g:2504:1: rule__DataField__Group__3__Impl : ( ( rule__DataField__NameAssignment_3 ) ) ;
    public final void rule__DataField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2508:1: ( ( ( rule__DataField__NameAssignment_3 ) ) )
            // InternalDataDsl.g:2509:1: ( ( rule__DataField__NameAssignment_3 ) )
            {
            // InternalDataDsl.g:2509:1: ( ( rule__DataField__NameAssignment_3 ) )
            // InternalDataDsl.g:2510:2: ( rule__DataField__NameAssignment_3 )
            {
             before(grammarAccess.getDataFieldAccess().getNameAssignment_3()); 
            // InternalDataDsl.g:2511:2: ( rule__DataField__NameAssignment_3 )
            // InternalDataDsl.g:2511:3: rule__DataField__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DataField__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataFieldAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__Group__3__Impl"


    // $ANTLR start "rule__DataField__Group__4"
    // InternalDataDsl.g:2519:1: rule__DataField__Group__4 : rule__DataField__Group__4__Impl rule__DataField__Group__5 ;
    public final void rule__DataField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2523:1: ( rule__DataField__Group__4__Impl rule__DataField__Group__5 )
            // InternalDataDsl.g:2524:2: rule__DataField__Group__4__Impl rule__DataField__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__DataField__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataField__Group__5();

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
    // $ANTLR end "rule__DataField__Group__4"


    // $ANTLR start "rule__DataField__Group__4__Impl"
    // InternalDataDsl.g:2531:1: rule__DataField__Group__4__Impl : ( ( rule__DataField__Group_4__0 )? ) ;
    public final void rule__DataField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2535:1: ( ( ( rule__DataField__Group_4__0 )? ) )
            // InternalDataDsl.g:2536:1: ( ( rule__DataField__Group_4__0 )? )
            {
            // InternalDataDsl.g:2536:1: ( ( rule__DataField__Group_4__0 )? )
            // InternalDataDsl.g:2537:2: ( rule__DataField__Group_4__0 )?
            {
             before(grammarAccess.getDataFieldAccess().getGroup_4()); 
            // InternalDataDsl.g:2538:2: ( rule__DataField__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDataDsl.g:2538:3: rule__DataField__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataField__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataFieldAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__Group__4__Impl"


    // $ANTLR start "rule__DataField__Group__5"
    // InternalDataDsl.g:2546:1: rule__DataField__Group__5 : rule__DataField__Group__5__Impl ;
    public final void rule__DataField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2550:1: ( rule__DataField__Group__5__Impl )
            // InternalDataDsl.g:2551:2: rule__DataField__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataField__Group__5__Impl();

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
    // $ANTLR end "rule__DataField__Group__5"


    // $ANTLR start "rule__DataField__Group__5__Impl"
    // InternalDataDsl.g:2557:1: rule__DataField__Group__5__Impl : ( ( rule__DataField__Group_5__0 )? ) ;
    public final void rule__DataField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2561:1: ( ( ( rule__DataField__Group_5__0 )? ) )
            // InternalDataDsl.g:2562:1: ( ( rule__DataField__Group_5__0 )? )
            {
            // InternalDataDsl.g:2562:1: ( ( rule__DataField__Group_5__0 )? )
            // InternalDataDsl.g:2563:2: ( rule__DataField__Group_5__0 )?
            {
             before(grammarAccess.getDataFieldAccess().getGroup_5()); 
            // InternalDataDsl.g:2564:2: ( rule__DataField__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==41) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDataDsl.g:2564:3: rule__DataField__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataField__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataFieldAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__Group__5__Impl"


    // $ANTLR start "rule__DataField__Group_4__0"
    // InternalDataDsl.g:2573:1: rule__DataField__Group_4__0 : rule__DataField__Group_4__0__Impl rule__DataField__Group_4__1 ;
    public final void rule__DataField__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2577:1: ( rule__DataField__Group_4__0__Impl rule__DataField__Group_4__1 )
            // InternalDataDsl.g:2578:2: rule__DataField__Group_4__0__Impl rule__DataField__Group_4__1
            {
            pushFollow(FOLLOW_28);
            rule__DataField__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataField__Group_4__1();

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
    // $ANTLR end "rule__DataField__Group_4__0"


    // $ANTLR start "rule__DataField__Group_4__0__Impl"
    // InternalDataDsl.g:2585:1: rule__DataField__Group_4__0__Impl : ( '=' ) ;
    public final void rule__DataField__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2589:1: ( ( '=' ) )
            // InternalDataDsl.g:2590:1: ( '=' )
            {
            // InternalDataDsl.g:2590:1: ( '=' )
            // InternalDataDsl.g:2591:2: '='
            {
             before(grammarAccess.getDataFieldAccess().getEqualsSignKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDataFieldAccess().getEqualsSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__Group_4__0__Impl"


    // $ANTLR start "rule__DataField__Group_4__1"
    // InternalDataDsl.g:2600:1: rule__DataField__Group_4__1 : rule__DataField__Group_4__1__Impl ;
    public final void rule__DataField__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2604:1: ( rule__DataField__Group_4__1__Impl )
            // InternalDataDsl.g:2605:2: rule__DataField__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataField__Group_4__1__Impl();

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
    // $ANTLR end "rule__DataField__Group_4__1"


    // $ANTLR start "rule__DataField__Group_4__1__Impl"
    // InternalDataDsl.g:2611:1: rule__DataField__Group_4__1__Impl : ( ( rule__DataField__InitializationValueAssignment_4_1 ) ) ;
    public final void rule__DataField__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2615:1: ( ( ( rule__DataField__InitializationValueAssignment_4_1 ) ) )
            // InternalDataDsl.g:2616:1: ( ( rule__DataField__InitializationValueAssignment_4_1 ) )
            {
            // InternalDataDsl.g:2616:1: ( ( rule__DataField__InitializationValueAssignment_4_1 ) )
            // InternalDataDsl.g:2617:2: ( rule__DataField__InitializationValueAssignment_4_1 )
            {
             before(grammarAccess.getDataFieldAccess().getInitializationValueAssignment_4_1()); 
            // InternalDataDsl.g:2618:2: ( rule__DataField__InitializationValueAssignment_4_1 )
            // InternalDataDsl.g:2618:3: rule__DataField__InitializationValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DataField__InitializationValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFieldAccess().getInitializationValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__Group_4__1__Impl"


    // $ANTLR start "rule__DataField__Group_5__0"
    // InternalDataDsl.g:2627:1: rule__DataField__Group_5__0 : rule__DataField__Group_5__0__Impl rule__DataField__Group_5__1 ;
    public final void rule__DataField__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2631:1: ( rule__DataField__Group_5__0__Impl rule__DataField__Group_5__1 )
            // InternalDataDsl.g:2632:2: rule__DataField__Group_5__0__Impl rule__DataField__Group_5__1
            {
            pushFollow(FOLLOW_29);
            rule__DataField__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataField__Group_5__1();

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
    // $ANTLR end "rule__DataField__Group_5__0"


    // $ANTLR start "rule__DataField__Group_5__0__Impl"
    // InternalDataDsl.g:2639:1: rule__DataField__Group_5__0__Impl : ( '<' ) ;
    public final void rule__DataField__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2643:1: ( ( '<' ) )
            // InternalDataDsl.g:2644:1: ( '<' )
            {
            // InternalDataDsl.g:2644:1: ( '<' )
            // InternalDataDsl.g:2645:2: '<'
            {
             before(grammarAccess.getDataFieldAccess().getLessThanSignKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDataFieldAccess().getLessThanSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__Group_5__0__Impl"


    // $ANTLR start "rule__DataField__Group_5__1"
    // InternalDataDsl.g:2654:1: rule__DataField__Group_5__1 : rule__DataField__Group_5__1__Impl rule__DataField__Group_5__2 ;
    public final void rule__DataField__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2658:1: ( rule__DataField__Group_5__1__Impl rule__DataField__Group_5__2 )
            // InternalDataDsl.g:2659:2: rule__DataField__Group_5__1__Impl rule__DataField__Group_5__2
            {
            pushFollow(FOLLOW_20);
            rule__DataField__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataField__Group_5__2();

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
    // $ANTLR end "rule__DataField__Group_5__1"


    // $ANTLR start "rule__DataField__Group_5__1__Impl"
    // InternalDataDsl.g:2666:1: rule__DataField__Group_5__1__Impl : ( ( rule__DataField__FeaturesAssignment_5_1 ) ) ;
    public final void rule__DataField__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2670:1: ( ( ( rule__DataField__FeaturesAssignment_5_1 ) ) )
            // InternalDataDsl.g:2671:1: ( ( rule__DataField__FeaturesAssignment_5_1 ) )
            {
            // InternalDataDsl.g:2671:1: ( ( rule__DataField__FeaturesAssignment_5_1 ) )
            // InternalDataDsl.g:2672:2: ( rule__DataField__FeaturesAssignment_5_1 )
            {
             before(grammarAccess.getDataFieldAccess().getFeaturesAssignment_5_1()); 
            // InternalDataDsl.g:2673:2: ( rule__DataField__FeaturesAssignment_5_1 )
            // InternalDataDsl.g:2673:3: rule__DataField__FeaturesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__DataField__FeaturesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFieldAccess().getFeaturesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__Group_5__1__Impl"


    // $ANTLR start "rule__DataField__Group_5__2"
    // InternalDataDsl.g:2681:1: rule__DataField__Group_5__2 : rule__DataField__Group_5__2__Impl rule__DataField__Group_5__3 ;
    public final void rule__DataField__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2685:1: ( rule__DataField__Group_5__2__Impl rule__DataField__Group_5__3 )
            // InternalDataDsl.g:2686:2: rule__DataField__Group_5__2__Impl rule__DataField__Group_5__3
            {
            pushFollow(FOLLOW_20);
            rule__DataField__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataField__Group_5__3();

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
    // $ANTLR end "rule__DataField__Group_5__2"


    // $ANTLR start "rule__DataField__Group_5__2__Impl"
    // InternalDataDsl.g:2693:1: rule__DataField__Group_5__2__Impl : ( ( rule__DataField__Group_5_2__0 )* ) ;
    public final void rule__DataField__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2697:1: ( ( ( rule__DataField__Group_5_2__0 )* ) )
            // InternalDataDsl.g:2698:1: ( ( rule__DataField__Group_5_2__0 )* )
            {
            // InternalDataDsl.g:2698:1: ( ( rule__DataField__Group_5_2__0 )* )
            // InternalDataDsl.g:2699:2: ( rule__DataField__Group_5_2__0 )*
            {
             before(grammarAccess.getDataFieldAccess().getGroup_5_2()); 
            // InternalDataDsl.g:2700:2: ( rule__DataField__Group_5_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==43) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalDataDsl.g:2700:3: rule__DataField__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__DataField__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getDataFieldAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__Group_5__2__Impl"


    // $ANTLR start "rule__DataField__Group_5__3"
    // InternalDataDsl.g:2708:1: rule__DataField__Group_5__3 : rule__DataField__Group_5__3__Impl ;
    public final void rule__DataField__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2712:1: ( rule__DataField__Group_5__3__Impl )
            // InternalDataDsl.g:2713:2: rule__DataField__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataField__Group_5__3__Impl();

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
    // $ANTLR end "rule__DataField__Group_5__3"


    // $ANTLR start "rule__DataField__Group_5__3__Impl"
    // InternalDataDsl.g:2719:1: rule__DataField__Group_5__3__Impl : ( '>' ) ;
    public final void rule__DataField__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2723:1: ( ( '>' ) )
            // InternalDataDsl.g:2724:1: ( '>' )
            {
            // InternalDataDsl.g:2724:1: ( '>' )
            // InternalDataDsl.g:2725:2: '>'
            {
             before(grammarAccess.getDataFieldAccess().getGreaterThanSignKeyword_5_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDataFieldAccess().getGreaterThanSignKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__Group_5__3__Impl"


    // $ANTLR start "rule__DataField__Group_5_2__0"
    // InternalDataDsl.g:2735:1: rule__DataField__Group_5_2__0 : rule__DataField__Group_5_2__0__Impl rule__DataField__Group_5_2__1 ;
    public final void rule__DataField__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2739:1: ( rule__DataField__Group_5_2__0__Impl rule__DataField__Group_5_2__1 )
            // InternalDataDsl.g:2740:2: rule__DataField__Group_5_2__0__Impl rule__DataField__Group_5_2__1
            {
            pushFollow(FOLLOW_29);
            rule__DataField__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataField__Group_5_2__1();

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
    // $ANTLR end "rule__DataField__Group_5_2__0"


    // $ANTLR start "rule__DataField__Group_5_2__0__Impl"
    // InternalDataDsl.g:2747:1: rule__DataField__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__DataField__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2751:1: ( ( ',' ) )
            // InternalDataDsl.g:2752:1: ( ',' )
            {
            // InternalDataDsl.g:2752:1: ( ',' )
            // InternalDataDsl.g:2753:2: ','
            {
             before(grammarAccess.getDataFieldAccess().getCommaKeyword_5_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDataFieldAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__Group_5_2__0__Impl"


    // $ANTLR start "rule__DataField__Group_5_2__1"
    // InternalDataDsl.g:2762:1: rule__DataField__Group_5_2__1 : rule__DataField__Group_5_2__1__Impl ;
    public final void rule__DataField__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2766:1: ( rule__DataField__Group_5_2__1__Impl )
            // InternalDataDsl.g:2767:2: rule__DataField__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataField__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__DataField__Group_5_2__1"


    // $ANTLR start "rule__DataField__Group_5_2__1__Impl"
    // InternalDataDsl.g:2773:1: rule__DataField__Group_5_2__1__Impl : ( ( rule__DataField__FeaturesAssignment_5_2_1 ) ) ;
    public final void rule__DataField__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2777:1: ( ( ( rule__DataField__FeaturesAssignment_5_2_1 ) ) )
            // InternalDataDsl.g:2778:1: ( ( rule__DataField__FeaturesAssignment_5_2_1 ) )
            {
            // InternalDataDsl.g:2778:1: ( ( rule__DataField__FeaturesAssignment_5_2_1 ) )
            // InternalDataDsl.g:2779:2: ( rule__DataField__FeaturesAssignment_5_2_1 )
            {
             before(grammarAccess.getDataFieldAccess().getFeaturesAssignment_5_2_1()); 
            // InternalDataDsl.g:2780:2: ( rule__DataField__FeaturesAssignment_5_2_1 )
            // InternalDataDsl.g:2780:3: rule__DataField__FeaturesAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataField__FeaturesAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFieldAccess().getFeaturesAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__Group_5_2__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalDataDsl.g:2789:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2793:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalDataDsl.g:2794:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__1();

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
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // InternalDataDsl.g:2801:1: rule__Enumeration__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2805:1: ( ( 'enum' ) )
            // InternalDataDsl.g:2806:1: ( 'enum' )
            {
            // InternalDataDsl.g:2806:1: ( 'enum' )
            // InternalDataDsl.g:2807:2: 'enum'
            {
             before(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 

            }


            }

        }
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
    // InternalDataDsl.g:2816:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2820:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalDataDsl.g:2821:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__2();

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
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // InternalDataDsl.g:2828:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2832:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // InternalDataDsl.g:2833:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:2833:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // InternalDataDsl.g:2834:2: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:2835:2: ( rule__Enumeration__NameAssignment_1 )
            // InternalDataDsl.g:2835:3: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalDataDsl.g:2843:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2847:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalDataDsl.g:2848:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__3();

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
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // InternalDataDsl.g:2855:1: rule__Enumeration__Group__2__Impl : ( ( rule__Enumeration__Group_2__0 )? ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2859:1: ( ( ( rule__Enumeration__Group_2__0 )? ) )
            // InternalDataDsl.g:2860:1: ( ( rule__Enumeration__Group_2__0 )? )
            {
            // InternalDataDsl.g:2860:1: ( ( rule__Enumeration__Group_2__0 )? )
            // InternalDataDsl.g:2861:2: ( rule__Enumeration__Group_2__0 )?
            {
             before(grammarAccess.getEnumerationAccess().getGroup_2()); 
            // InternalDataDsl.g:2862:2: ( rule__Enumeration__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==41) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDataDsl.g:2862:3: rule__Enumeration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Enumeration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalDataDsl.g:2870:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2874:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalDataDsl.g:2875:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__4();

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
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // InternalDataDsl.g:2882:1: rule__Enumeration__Group__3__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2886:1: ( ( '{' ) )
            // InternalDataDsl.g:2887:1: ( '{' )
            {
            // InternalDataDsl.g:2887:1: ( '{' )
            // InternalDataDsl.g:2888:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Enumeration__Group__4"
    // InternalDataDsl.g:2897:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2901:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // InternalDataDsl.g:2902:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__5();

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
    // $ANTLR end "rule__Enumeration__Group__4"


    // $ANTLR start "rule__Enumeration__Group__4__Impl"
    // InternalDataDsl.g:2909:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__FieldsAssignment_4 ) ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2913:1: ( ( ( rule__Enumeration__FieldsAssignment_4 ) ) )
            // InternalDataDsl.g:2914:1: ( ( rule__Enumeration__FieldsAssignment_4 ) )
            {
            // InternalDataDsl.g:2914:1: ( ( rule__Enumeration__FieldsAssignment_4 ) )
            // InternalDataDsl.g:2915:2: ( rule__Enumeration__FieldsAssignment_4 )
            {
             before(grammarAccess.getEnumerationAccess().getFieldsAssignment_4()); 
            // InternalDataDsl.g:2916:2: ( rule__Enumeration__FieldsAssignment_4 )
            // InternalDataDsl.g:2916:3: rule__Enumeration__FieldsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__FieldsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getFieldsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4__Impl"


    // $ANTLR start "rule__Enumeration__Group__5"
    // InternalDataDsl.g:2924:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6 ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2928:1: ( rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6 )
            // InternalDataDsl.g:2929:2: rule__Enumeration__Group__5__Impl rule__Enumeration__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__Enumeration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__6();

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
    // $ANTLR end "rule__Enumeration__Group__5"


    // $ANTLR start "rule__Enumeration__Group__5__Impl"
    // InternalDataDsl.g:2936:1: rule__Enumeration__Group__5__Impl : ( ( rule__Enumeration__Group_5__0 )* ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2940:1: ( ( ( rule__Enumeration__Group_5__0 )* ) )
            // InternalDataDsl.g:2941:1: ( ( rule__Enumeration__Group_5__0 )* )
            {
            // InternalDataDsl.g:2941:1: ( ( rule__Enumeration__Group_5__0 )* )
            // InternalDataDsl.g:2942:2: ( rule__Enumeration__Group_5__0 )*
            {
             before(grammarAccess.getEnumerationAccess().getGroup_5()); 
            // InternalDataDsl.g:2943:2: ( rule__Enumeration__Group_5__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==43) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalDataDsl.g:2943:3: rule__Enumeration__Group_5__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Enumeration__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5__Impl"


    // $ANTLR start "rule__Enumeration__Group__6"
    // InternalDataDsl.g:2951:1: rule__Enumeration__Group__6 : rule__Enumeration__Group__6__Impl ;
    public final void rule__Enumeration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2955:1: ( rule__Enumeration__Group__6__Impl )
            // InternalDataDsl.g:2956:2: rule__Enumeration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__6__Impl();

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
    // $ANTLR end "rule__Enumeration__Group__6"


    // $ANTLR start "rule__Enumeration__Group__6__Impl"
    // InternalDataDsl.g:2962:1: rule__Enumeration__Group__6__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2966:1: ( ( '}' ) )
            // InternalDataDsl.g:2967:1: ( '}' )
            {
            // InternalDataDsl.g:2967:1: ( '}' )
            // InternalDataDsl.g:2968:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__6__Impl"


    // $ANTLR start "rule__Enumeration__Group_2__0"
    // InternalDataDsl.g:2978:1: rule__Enumeration__Group_2__0 : rule__Enumeration__Group_2__0__Impl rule__Enumeration__Group_2__1 ;
    public final void rule__Enumeration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2982:1: ( rule__Enumeration__Group_2__0__Impl rule__Enumeration__Group_2__1 )
            // InternalDataDsl.g:2983:2: rule__Enumeration__Group_2__0__Impl rule__Enumeration__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Enumeration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_2__1();

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
    // $ANTLR end "rule__Enumeration__Group_2__0"


    // $ANTLR start "rule__Enumeration__Group_2__0__Impl"
    // InternalDataDsl.g:2990:1: rule__Enumeration__Group_2__0__Impl : ( '<' ) ;
    public final void rule__Enumeration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2994:1: ( ( '<' ) )
            // InternalDataDsl.g:2995:1: ( '<' )
            {
            // InternalDataDsl.g:2995:1: ( '<' )
            // InternalDataDsl.g:2996:2: '<'
            {
             before(grammarAccess.getEnumerationAccess().getLessThanSignKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLessThanSignKeyword_2_0()); 

            }


            }

        }
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
    // InternalDataDsl.g:3005:1: rule__Enumeration__Group_2__1 : rule__Enumeration__Group_2__1__Impl rule__Enumeration__Group_2__2 ;
    public final void rule__Enumeration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3009:1: ( rule__Enumeration__Group_2__1__Impl rule__Enumeration__Group_2__2 )
            // InternalDataDsl.g:3010:2: rule__Enumeration__Group_2__1__Impl rule__Enumeration__Group_2__2
            {
            pushFollow(FOLLOW_20);
            rule__Enumeration__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_2__2();

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
    // $ANTLR end "rule__Enumeration__Group_2__1"


    // $ANTLR start "rule__Enumeration__Group_2__1__Impl"
    // InternalDataDsl.g:3017:1: rule__Enumeration__Group_2__1__Impl : ( ( rule__Enumeration__FeaturesAssignment_2_1 ) ) ;
    public final void rule__Enumeration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3021:1: ( ( ( rule__Enumeration__FeaturesAssignment_2_1 ) ) )
            // InternalDataDsl.g:3022:1: ( ( rule__Enumeration__FeaturesAssignment_2_1 ) )
            {
            // InternalDataDsl.g:3022:1: ( ( rule__Enumeration__FeaturesAssignment_2_1 ) )
            // InternalDataDsl.g:3023:2: ( rule__Enumeration__FeaturesAssignment_2_1 )
            {
             before(grammarAccess.getEnumerationAccess().getFeaturesAssignment_2_1()); 
            // InternalDataDsl.g:3024:2: ( rule__Enumeration__FeaturesAssignment_2_1 )
            // InternalDataDsl.g:3024:3: rule__Enumeration__FeaturesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__FeaturesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getFeaturesAssignment_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Enumeration__Group_2__2"
    // InternalDataDsl.g:3032:1: rule__Enumeration__Group_2__2 : rule__Enumeration__Group_2__2__Impl rule__Enumeration__Group_2__3 ;
    public final void rule__Enumeration__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3036:1: ( rule__Enumeration__Group_2__2__Impl rule__Enumeration__Group_2__3 )
            // InternalDataDsl.g:3037:2: rule__Enumeration__Group_2__2__Impl rule__Enumeration__Group_2__3
            {
            pushFollow(FOLLOW_20);
            rule__Enumeration__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_2__3();

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
    // $ANTLR end "rule__Enumeration__Group_2__2"


    // $ANTLR start "rule__Enumeration__Group_2__2__Impl"
    // InternalDataDsl.g:3044:1: rule__Enumeration__Group_2__2__Impl : ( ( rule__Enumeration__Group_2_2__0 )* ) ;
    public final void rule__Enumeration__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3048:1: ( ( ( rule__Enumeration__Group_2_2__0 )* ) )
            // InternalDataDsl.g:3049:1: ( ( rule__Enumeration__Group_2_2__0 )* )
            {
            // InternalDataDsl.g:3049:1: ( ( rule__Enumeration__Group_2_2__0 )* )
            // InternalDataDsl.g:3050:2: ( rule__Enumeration__Group_2_2__0 )*
            {
             before(grammarAccess.getEnumerationAccess().getGroup_2_2()); 
            // InternalDataDsl.g:3051:2: ( rule__Enumeration__Group_2_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==43) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalDataDsl.g:3051:3: rule__Enumeration__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Enumeration__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_2__2__Impl"


    // $ANTLR start "rule__Enumeration__Group_2__3"
    // InternalDataDsl.g:3059:1: rule__Enumeration__Group_2__3 : rule__Enumeration__Group_2__3__Impl ;
    public final void rule__Enumeration__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3063:1: ( rule__Enumeration__Group_2__3__Impl )
            // InternalDataDsl.g:3064:2: rule__Enumeration__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_2__3__Impl();

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
    // $ANTLR end "rule__Enumeration__Group_2__3"


    // $ANTLR start "rule__Enumeration__Group_2__3__Impl"
    // InternalDataDsl.g:3070:1: rule__Enumeration__Group_2__3__Impl : ( '>' ) ;
    public final void rule__Enumeration__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3074:1: ( ( '>' ) )
            // InternalDataDsl.g:3075:1: ( '>' )
            {
            // InternalDataDsl.g:3075:1: ( '>' )
            // InternalDataDsl.g:3076:2: '>'
            {
             before(grammarAccess.getEnumerationAccess().getGreaterThanSignKeyword_2_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getGreaterThanSignKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_2__3__Impl"


    // $ANTLR start "rule__Enumeration__Group_2_2__0"
    // InternalDataDsl.g:3086:1: rule__Enumeration__Group_2_2__0 : rule__Enumeration__Group_2_2__0__Impl rule__Enumeration__Group_2_2__1 ;
    public final void rule__Enumeration__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3090:1: ( rule__Enumeration__Group_2_2__0__Impl rule__Enumeration__Group_2_2__1 )
            // InternalDataDsl.g:3091:2: rule__Enumeration__Group_2_2__0__Impl rule__Enumeration__Group_2_2__1
            {
            pushFollow(FOLLOW_19);
            rule__Enumeration__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_2_2__1();

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
    // $ANTLR end "rule__Enumeration__Group_2_2__0"


    // $ANTLR start "rule__Enumeration__Group_2_2__0__Impl"
    // InternalDataDsl.g:3098:1: rule__Enumeration__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Enumeration__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3102:1: ( ( ',' ) )
            // InternalDataDsl.g:3103:1: ( ',' )
            {
            // InternalDataDsl.g:3103:1: ( ',' )
            // InternalDataDsl.g:3104:2: ','
            {
             before(grammarAccess.getEnumerationAccess().getCommaKeyword_2_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_2_2__0__Impl"


    // $ANTLR start "rule__Enumeration__Group_2_2__1"
    // InternalDataDsl.g:3113:1: rule__Enumeration__Group_2_2__1 : rule__Enumeration__Group_2_2__1__Impl ;
    public final void rule__Enumeration__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3117:1: ( rule__Enumeration__Group_2_2__1__Impl )
            // InternalDataDsl.g:3118:2: rule__Enumeration__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Enumeration__Group_2_2__1"


    // $ANTLR start "rule__Enumeration__Group_2_2__1__Impl"
    // InternalDataDsl.g:3124:1: rule__Enumeration__Group_2_2__1__Impl : ( ( rule__Enumeration__FeaturesAssignment_2_2_1 ) ) ;
    public final void rule__Enumeration__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3128:1: ( ( ( rule__Enumeration__FeaturesAssignment_2_2_1 ) ) )
            // InternalDataDsl.g:3129:1: ( ( rule__Enumeration__FeaturesAssignment_2_2_1 ) )
            {
            // InternalDataDsl.g:3129:1: ( ( rule__Enumeration__FeaturesAssignment_2_2_1 ) )
            // InternalDataDsl.g:3130:2: ( rule__Enumeration__FeaturesAssignment_2_2_1 )
            {
             before(grammarAccess.getEnumerationAccess().getFeaturesAssignment_2_2_1()); 
            // InternalDataDsl.g:3131:2: ( rule__Enumeration__FeaturesAssignment_2_2_1 )
            // InternalDataDsl.g:3131:3: rule__Enumeration__FeaturesAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__FeaturesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getFeaturesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_2_2__1__Impl"


    // $ANTLR start "rule__Enumeration__Group_5__0"
    // InternalDataDsl.g:3140:1: rule__Enumeration__Group_5__0 : rule__Enumeration__Group_5__0__Impl rule__Enumeration__Group_5__1 ;
    public final void rule__Enumeration__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3144:1: ( rule__Enumeration__Group_5__0__Impl rule__Enumeration__Group_5__1 )
            // InternalDataDsl.g:3145:2: rule__Enumeration__Group_5__0__Impl rule__Enumeration__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__Enumeration__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_5__1();

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
    // $ANTLR end "rule__Enumeration__Group_5__0"


    // $ANTLR start "rule__Enumeration__Group_5__0__Impl"
    // InternalDataDsl.g:3152:1: rule__Enumeration__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Enumeration__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3156:1: ( ( ',' ) )
            // InternalDataDsl.g:3157:1: ( ',' )
            {
            // InternalDataDsl.g:3157:1: ( ',' )
            // InternalDataDsl.g:3158:2: ','
            {
             before(grammarAccess.getEnumerationAccess().getCommaKeyword_5_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_5__0__Impl"


    // $ANTLR start "rule__Enumeration__Group_5__1"
    // InternalDataDsl.g:3167:1: rule__Enumeration__Group_5__1 : rule__Enumeration__Group_5__1__Impl ;
    public final void rule__Enumeration__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3171:1: ( rule__Enumeration__Group_5__1__Impl )
            // InternalDataDsl.g:3172:2: rule__Enumeration__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_5__1__Impl();

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
    // $ANTLR end "rule__Enumeration__Group_5__1"


    // $ANTLR start "rule__Enumeration__Group_5__1__Impl"
    // InternalDataDsl.g:3178:1: rule__Enumeration__Group_5__1__Impl : ( ( rule__Enumeration__FieldsAssignment_5_1 ) ) ;
    public final void rule__Enumeration__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3182:1: ( ( ( rule__Enumeration__FieldsAssignment_5_1 ) ) )
            // InternalDataDsl.g:3183:1: ( ( rule__Enumeration__FieldsAssignment_5_1 ) )
            {
            // InternalDataDsl.g:3183:1: ( ( rule__Enumeration__FieldsAssignment_5_1 ) )
            // InternalDataDsl.g:3184:2: ( rule__Enumeration__FieldsAssignment_5_1 )
            {
             before(grammarAccess.getEnumerationAccess().getFieldsAssignment_5_1()); 
            // InternalDataDsl.g:3185:2: ( rule__Enumeration__FieldsAssignment_5_1 )
            // InternalDataDsl.g:3185:3: rule__Enumeration__FieldsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__FieldsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getFieldsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_5__1__Impl"


    // $ANTLR start "rule__EnumerationField__Group__0"
    // InternalDataDsl.g:3194:1: rule__EnumerationField__Group__0 : rule__EnumerationField__Group__0__Impl rule__EnumerationField__Group__1 ;
    public final void rule__EnumerationField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3198:1: ( rule__EnumerationField__Group__0__Impl rule__EnumerationField__Group__1 )
            // InternalDataDsl.g:3199:2: rule__EnumerationField__Group__0__Impl rule__EnumerationField__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__EnumerationField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationField__Group__1();

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
    // $ANTLR end "rule__EnumerationField__Group__0"


    // $ANTLR start "rule__EnumerationField__Group__0__Impl"
    // InternalDataDsl.g:3206:1: rule__EnumerationField__Group__0__Impl : ( ( rule__EnumerationField__NameAssignment_0 ) ) ;
    public final void rule__EnumerationField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3210:1: ( ( ( rule__EnumerationField__NameAssignment_0 ) ) )
            // InternalDataDsl.g:3211:1: ( ( rule__EnumerationField__NameAssignment_0 ) )
            {
            // InternalDataDsl.g:3211:1: ( ( rule__EnumerationField__NameAssignment_0 ) )
            // InternalDataDsl.g:3212:2: ( rule__EnumerationField__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationFieldAccess().getNameAssignment_0()); 
            // InternalDataDsl.g:3213:2: ( rule__EnumerationField__NameAssignment_0 )
            // InternalDataDsl.g:3213:3: rule__EnumerationField__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationField__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationFieldAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationField__Group__0__Impl"


    // $ANTLR start "rule__EnumerationField__Group__1"
    // InternalDataDsl.g:3221:1: rule__EnumerationField__Group__1 : rule__EnumerationField__Group__1__Impl ;
    public final void rule__EnumerationField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3225:1: ( rule__EnumerationField__Group__1__Impl )
            // InternalDataDsl.g:3226:2: rule__EnumerationField__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationField__Group__1__Impl();

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
    // $ANTLR end "rule__EnumerationField__Group__1"


    // $ANTLR start "rule__EnumerationField__Group__1__Impl"
    // InternalDataDsl.g:3232:1: rule__EnumerationField__Group__1__Impl : ( ( rule__EnumerationField__Group_1__0 )? ) ;
    public final void rule__EnumerationField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3236:1: ( ( ( rule__EnumerationField__Group_1__0 )? ) )
            // InternalDataDsl.g:3237:1: ( ( rule__EnumerationField__Group_1__0 )? )
            {
            // InternalDataDsl.g:3237:1: ( ( rule__EnumerationField__Group_1__0 )? )
            // InternalDataDsl.g:3238:2: ( rule__EnumerationField__Group_1__0 )?
            {
             before(grammarAccess.getEnumerationFieldAccess().getGroup_1()); 
            // InternalDataDsl.g:3239:2: ( rule__EnumerationField__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==47) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalDataDsl.g:3239:3: rule__EnumerationField__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumerationField__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationFieldAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationField__Group__1__Impl"


    // $ANTLR start "rule__EnumerationField__Group_1__0"
    // InternalDataDsl.g:3248:1: rule__EnumerationField__Group_1__0 : rule__EnumerationField__Group_1__0__Impl rule__EnumerationField__Group_1__1 ;
    public final void rule__EnumerationField__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3252:1: ( rule__EnumerationField__Group_1__0__Impl rule__EnumerationField__Group_1__1 )
            // InternalDataDsl.g:3253:2: rule__EnumerationField__Group_1__0__Impl rule__EnumerationField__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__EnumerationField__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationField__Group_1__1();

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
    // $ANTLR end "rule__EnumerationField__Group_1__0"


    // $ANTLR start "rule__EnumerationField__Group_1__0__Impl"
    // InternalDataDsl.g:3260:1: rule__EnumerationField__Group_1__0__Impl : ( '(' ) ;
    public final void rule__EnumerationField__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3264:1: ( ( '(' ) )
            // InternalDataDsl.g:3265:1: ( '(' )
            {
            // InternalDataDsl.g:3265:1: ( '(' )
            // InternalDataDsl.g:3266:2: '('
            {
             before(grammarAccess.getEnumerationFieldAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getEnumerationFieldAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationField__Group_1__0__Impl"


    // $ANTLR start "rule__EnumerationField__Group_1__1"
    // InternalDataDsl.g:3275:1: rule__EnumerationField__Group_1__1 : rule__EnumerationField__Group_1__1__Impl rule__EnumerationField__Group_1__2 ;
    public final void rule__EnumerationField__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3279:1: ( rule__EnumerationField__Group_1__1__Impl rule__EnumerationField__Group_1__2 )
            // InternalDataDsl.g:3280:2: rule__EnumerationField__Group_1__1__Impl rule__EnumerationField__Group_1__2
            {
            pushFollow(FOLLOW_32);
            rule__EnumerationField__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationField__Group_1__2();

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
    // $ANTLR end "rule__EnumerationField__Group_1__1"


    // $ANTLR start "rule__EnumerationField__Group_1__1__Impl"
    // InternalDataDsl.g:3287:1: rule__EnumerationField__Group_1__1__Impl : ( ( rule__EnumerationField__InitializationValueAssignment_1_1 ) ) ;
    public final void rule__EnumerationField__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3291:1: ( ( ( rule__EnumerationField__InitializationValueAssignment_1_1 ) ) )
            // InternalDataDsl.g:3292:1: ( ( rule__EnumerationField__InitializationValueAssignment_1_1 ) )
            {
            // InternalDataDsl.g:3292:1: ( ( rule__EnumerationField__InitializationValueAssignment_1_1 ) )
            // InternalDataDsl.g:3293:2: ( rule__EnumerationField__InitializationValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationFieldAccess().getInitializationValueAssignment_1_1()); 
            // InternalDataDsl.g:3294:2: ( rule__EnumerationField__InitializationValueAssignment_1_1 )
            // InternalDataDsl.g:3294:3: rule__EnumerationField__InitializationValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationField__InitializationValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationFieldAccess().getInitializationValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationField__Group_1__1__Impl"


    // $ANTLR start "rule__EnumerationField__Group_1__2"
    // InternalDataDsl.g:3302:1: rule__EnumerationField__Group_1__2 : rule__EnumerationField__Group_1__2__Impl ;
    public final void rule__EnumerationField__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3306:1: ( rule__EnumerationField__Group_1__2__Impl )
            // InternalDataDsl.g:3307:2: rule__EnumerationField__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationField__Group_1__2__Impl();

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
    // $ANTLR end "rule__EnumerationField__Group_1__2"


    // $ANTLR start "rule__EnumerationField__Group_1__2__Impl"
    // InternalDataDsl.g:3313:1: rule__EnumerationField__Group_1__2__Impl : ( ')' ) ;
    public final void rule__EnumerationField__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3317:1: ( ( ')' ) )
            // InternalDataDsl.g:3318:1: ( ')' )
            {
            // InternalDataDsl.g:3318:1: ( ')' )
            // InternalDataDsl.g:3319:2: ')'
            {
             before(grammarAccess.getEnumerationFieldAccess().getRightParenthesisKeyword_1_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getEnumerationFieldAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationField__Group_1__2__Impl"


    // $ANTLR start "rule__DataOperation__Group__0"
    // InternalDataDsl.g:3329:1: rule__DataOperation__Group__0 : rule__DataOperation__Group__0__Impl rule__DataOperation__Group__1 ;
    public final void rule__DataOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3333:1: ( rule__DataOperation__Group__0__Impl rule__DataOperation__Group__1 )
            // InternalDataDsl.g:3334:2: rule__DataOperation__Group__0__Impl rule__DataOperation__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__DataOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOperation__Group__1();

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
    // $ANTLR end "rule__DataOperation__Group__0"


    // $ANTLR start "rule__DataOperation__Group__0__Impl"
    // InternalDataDsl.g:3341:1: rule__DataOperation__Group__0__Impl : ( ( rule__DataOperation__HiddenAssignment_0 )? ) ;
    public final void rule__DataOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3345:1: ( ( ( rule__DataOperation__HiddenAssignment_0 )? ) )
            // InternalDataDsl.g:3346:1: ( ( rule__DataOperation__HiddenAssignment_0 )? )
            {
            // InternalDataDsl.g:3346:1: ( ( rule__DataOperation__HiddenAssignment_0 )? )
            // InternalDataDsl.g:3347:2: ( rule__DataOperation__HiddenAssignment_0 )?
            {
             before(grammarAccess.getDataOperationAccess().getHiddenAssignment_0()); 
            // InternalDataDsl.g:3348:2: ( rule__DataOperation__HiddenAssignment_0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==63) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDataDsl.g:3348:3: rule__DataOperation__HiddenAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataOperation__HiddenAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataOperationAccess().getHiddenAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__Group__0__Impl"


    // $ANTLR start "rule__DataOperation__Group__1"
    // InternalDataDsl.g:3356:1: rule__DataOperation__Group__1 : rule__DataOperation__Group__1__Impl rule__DataOperation__Group__2 ;
    public final void rule__DataOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3360:1: ( rule__DataOperation__Group__1__Impl rule__DataOperation__Group__2 )
            // InternalDataDsl.g:3361:2: rule__DataOperation__Group__1__Impl rule__DataOperation__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DataOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOperation__Group__2();

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
    // $ANTLR end "rule__DataOperation__Group__1"


    // $ANTLR start "rule__DataOperation__Group__1__Impl"
    // InternalDataDsl.g:3368:1: rule__DataOperation__Group__1__Impl : ( ( rule__DataOperation__Alternatives_1 ) ) ;
    public final void rule__DataOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3372:1: ( ( ( rule__DataOperation__Alternatives_1 ) ) )
            // InternalDataDsl.g:3373:1: ( ( rule__DataOperation__Alternatives_1 ) )
            {
            // InternalDataDsl.g:3373:1: ( ( rule__DataOperation__Alternatives_1 ) )
            // InternalDataDsl.g:3374:2: ( rule__DataOperation__Alternatives_1 )
            {
             before(grammarAccess.getDataOperationAccess().getAlternatives_1()); 
            // InternalDataDsl.g:3375:2: ( rule__DataOperation__Alternatives_1 )
            // InternalDataDsl.g:3375:3: rule__DataOperation__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DataOperation__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDataOperationAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__Group__1__Impl"


    // $ANTLR start "rule__DataOperation__Group__2"
    // InternalDataDsl.g:3383:1: rule__DataOperation__Group__2 : rule__DataOperation__Group__2__Impl rule__DataOperation__Group__3 ;
    public final void rule__DataOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3387:1: ( rule__DataOperation__Group__2__Impl rule__DataOperation__Group__3 )
            // InternalDataDsl.g:3388:2: rule__DataOperation__Group__2__Impl rule__DataOperation__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__DataOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOperation__Group__3();

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
    // $ANTLR end "rule__DataOperation__Group__2"


    // $ANTLR start "rule__DataOperation__Group__2__Impl"
    // InternalDataDsl.g:3395:1: rule__DataOperation__Group__2__Impl : ( ( rule__DataOperation__NameAssignment_2 ) ) ;
    public final void rule__DataOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3399:1: ( ( ( rule__DataOperation__NameAssignment_2 ) ) )
            // InternalDataDsl.g:3400:1: ( ( rule__DataOperation__NameAssignment_2 ) )
            {
            // InternalDataDsl.g:3400:1: ( ( rule__DataOperation__NameAssignment_2 ) )
            // InternalDataDsl.g:3401:2: ( rule__DataOperation__NameAssignment_2 )
            {
             before(grammarAccess.getDataOperationAccess().getNameAssignment_2()); 
            // InternalDataDsl.g:3402:2: ( rule__DataOperation__NameAssignment_2 )
            // InternalDataDsl.g:3402:3: rule__DataOperation__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DataOperation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataOperationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__Group__2__Impl"


    // $ANTLR start "rule__DataOperation__Group__3"
    // InternalDataDsl.g:3410:1: rule__DataOperation__Group__3 : rule__DataOperation__Group__3__Impl rule__DataOperation__Group__4 ;
    public final void rule__DataOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3414:1: ( rule__DataOperation__Group__3__Impl rule__DataOperation__Group__4 )
            // InternalDataDsl.g:3415:2: rule__DataOperation__Group__3__Impl rule__DataOperation__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__DataOperation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOperation__Group__4();

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
    // $ANTLR end "rule__DataOperation__Group__3"


    // $ANTLR start "rule__DataOperation__Group__3__Impl"
    // InternalDataDsl.g:3422:1: rule__DataOperation__Group__3__Impl : ( ( rule__DataOperation__Group_3__0 )? ) ;
    public final void rule__DataOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3426:1: ( ( ( rule__DataOperation__Group_3__0 )? ) )
            // InternalDataDsl.g:3427:1: ( ( rule__DataOperation__Group_3__0 )? )
            {
            // InternalDataDsl.g:3427:1: ( ( rule__DataOperation__Group_3__0 )? )
            // InternalDataDsl.g:3428:2: ( rule__DataOperation__Group_3__0 )?
            {
             before(grammarAccess.getDataOperationAccess().getGroup_3()); 
            // InternalDataDsl.g:3429:2: ( rule__DataOperation__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==47) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDataDsl.g:3429:3: rule__DataOperation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataOperation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataOperationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__Group__3__Impl"


    // $ANTLR start "rule__DataOperation__Group__4"
    // InternalDataDsl.g:3437:1: rule__DataOperation__Group__4 : rule__DataOperation__Group__4__Impl ;
    public final void rule__DataOperation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3441:1: ( rule__DataOperation__Group__4__Impl )
            // InternalDataDsl.g:3442:2: rule__DataOperation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataOperation__Group__4__Impl();

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
    // $ANTLR end "rule__DataOperation__Group__4"


    // $ANTLR start "rule__DataOperation__Group__4__Impl"
    // InternalDataDsl.g:3448:1: rule__DataOperation__Group__4__Impl : ( ( rule__DataOperation__Group_4__0 )? ) ;
    public final void rule__DataOperation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3452:1: ( ( ( rule__DataOperation__Group_4__0 )? ) )
            // InternalDataDsl.g:3453:1: ( ( rule__DataOperation__Group_4__0 )? )
            {
            // InternalDataDsl.g:3453:1: ( ( rule__DataOperation__Group_4__0 )? )
            // InternalDataDsl.g:3454:2: ( rule__DataOperation__Group_4__0 )?
            {
             before(grammarAccess.getDataOperationAccess().getGroup_4()); 
            // InternalDataDsl.g:3455:2: ( rule__DataOperation__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==41) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDataDsl.g:3455:3: rule__DataOperation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataOperation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataOperationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__Group__4__Impl"


    // $ANTLR start "rule__DataOperation__Group_1_1__0"
    // InternalDataDsl.g:3464:1: rule__DataOperation__Group_1_1__0 : rule__DataOperation__Group_1_1__0__Impl rule__DataOperation__Group_1_1__1 ;
    public final void rule__DataOperation__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3468:1: ( rule__DataOperation__Group_1_1__0__Impl rule__DataOperation__Group_1_1__1 )
            // InternalDataDsl.g:3469:2: rule__DataOperation__Group_1_1__0__Impl rule__DataOperation__Group_1_1__1
            {
            pushFollow(FOLLOW_34);
            rule__DataOperation__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOperation__Group_1_1__1();

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
    // $ANTLR end "rule__DataOperation__Group_1_1__0"


    // $ANTLR start "rule__DataOperation__Group_1_1__0__Impl"
    // InternalDataDsl.g:3476:1: rule__DataOperation__Group_1_1__0__Impl : ( 'function' ) ;
    public final void rule__DataOperation__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3480:1: ( ( 'function' ) )
            // InternalDataDsl.g:3481:1: ( 'function' )
            {
            // InternalDataDsl.g:3481:1: ( 'function' )
            // InternalDataDsl.g:3482:2: 'function'
            {
             before(grammarAccess.getDataOperationAccess().getFunctionKeyword_1_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getDataOperationAccess().getFunctionKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__Group_1_1__0__Impl"


    // $ANTLR start "rule__DataOperation__Group_1_1__1"
    // InternalDataDsl.g:3491:1: rule__DataOperation__Group_1_1__1 : rule__DataOperation__Group_1_1__1__Impl ;
    public final void rule__DataOperation__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3495:1: ( rule__DataOperation__Group_1_1__1__Impl )
            // InternalDataDsl.g:3496:2: rule__DataOperation__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataOperation__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__DataOperation__Group_1_1__1"


    // $ANTLR start "rule__DataOperation__Group_1_1__1__Impl"
    // InternalDataDsl.g:3502:1: rule__DataOperation__Group_1_1__1__Impl : ( ( rule__DataOperation__Alternatives_1_1_1 )? ) ;
    public final void rule__DataOperation__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3506:1: ( ( ( rule__DataOperation__Alternatives_1_1_1 )? ) )
            // InternalDataDsl.g:3507:1: ( ( rule__DataOperation__Alternatives_1_1_1 )? )
            {
            // InternalDataDsl.g:3507:1: ( ( rule__DataOperation__Alternatives_1_1_1 )? )
            // InternalDataDsl.g:3508:2: ( rule__DataOperation__Alternatives_1_1_1 )?
            {
             before(grammarAccess.getDataOperationAccess().getAlternatives_1_1_1()); 
            // InternalDataDsl.g:3509:2: ( rule__DataOperation__Alternatives_1_1_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=51 && LA45_0<=61)) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_ID) ) {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==RULE_ID||LA45_2==50||LA45_2==62) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalDataDsl.g:3509:3: rule__DataOperation__Alternatives_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataOperation__Alternatives_1_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataOperationAccess().getAlternatives_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__Group_1_1__1__Impl"


    // $ANTLR start "rule__DataOperation__Group_3__0"
    // InternalDataDsl.g:3518:1: rule__DataOperation__Group_3__0 : rule__DataOperation__Group_3__0__Impl rule__DataOperation__Group_3__1 ;
    public final void rule__DataOperation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3522:1: ( rule__DataOperation__Group_3__0__Impl rule__DataOperation__Group_3__1 )
            // InternalDataDsl.g:3523:2: rule__DataOperation__Group_3__0__Impl rule__DataOperation__Group_3__1
            {
            pushFollow(FOLLOW_35);
            rule__DataOperation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOperation__Group_3__1();

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
    // $ANTLR end "rule__DataOperation__Group_3__0"


    // $ANTLR start "rule__DataOperation__Group_3__0__Impl"
    // InternalDataDsl.g:3530:1: rule__DataOperation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__DataOperation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3534:1: ( ( '(' ) )
            // InternalDataDsl.g:3535:1: ( '(' )
            {
            // InternalDataDsl.g:3535:1: ( '(' )
            // InternalDataDsl.g:3536:2: '('
            {
             before(grammarAccess.getDataOperationAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDataOperationAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__Group_3__0__Impl"


    // $ANTLR start "rule__DataOperation__Group_3__1"
    // InternalDataDsl.g:3545:1: rule__DataOperation__Group_3__1 : rule__DataOperation__Group_3__1__Impl rule__DataOperation__Group_3__2 ;
    public final void rule__DataOperation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3549:1: ( rule__DataOperation__Group_3__1__Impl rule__DataOperation__Group_3__2 )
            // InternalDataDsl.g:3550:2: rule__DataOperation__Group_3__1__Impl rule__DataOperation__Group_3__2
            {
            pushFollow(FOLLOW_35);
            rule__DataOperation__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOperation__Group_3__2();

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
    // $ANTLR end "rule__DataOperation__Group_3__1"


    // $ANTLR start "rule__DataOperation__Group_3__1__Impl"
    // InternalDataDsl.g:3557:1: rule__DataOperation__Group_3__1__Impl : ( ( rule__DataOperation__ParametersAssignment_3_1 )? ) ;
    public final void rule__DataOperation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3561:1: ( ( ( rule__DataOperation__ParametersAssignment_3_1 )? ) )
            // InternalDataDsl.g:3562:1: ( ( rule__DataOperation__ParametersAssignment_3_1 )? )
            {
            // InternalDataDsl.g:3562:1: ( ( rule__DataOperation__ParametersAssignment_3_1 )? )
            // InternalDataDsl.g:3563:2: ( rule__DataOperation__ParametersAssignment_3_1 )?
            {
             before(grammarAccess.getDataOperationAccess().getParametersAssignment_3_1()); 
            // InternalDataDsl.g:3564:2: ( rule__DataOperation__ParametersAssignment_3_1 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||(LA46_0>=51 && LA46_0<=61)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDataDsl.g:3564:3: rule__DataOperation__ParametersAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataOperation__ParametersAssignment_3_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataOperationAccess().getParametersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__Group_3__1__Impl"


    // $ANTLR start "rule__DataOperation__Group_3__2"
    // InternalDataDsl.g:3572:1: rule__DataOperation__Group_3__2 : rule__DataOperation__Group_3__2__Impl rule__DataOperation__Group_3__3 ;
    public final void rule__DataOperation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3576:1: ( rule__DataOperation__Group_3__2__Impl rule__DataOperation__Group_3__3 )
            // InternalDataDsl.g:3577:2: rule__DataOperation__Group_3__2__Impl rule__DataOperation__Group_3__3
            {
            pushFollow(FOLLOW_35);
            rule__DataOperation__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOperation__Group_3__3();

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
    // $ANTLR end "rule__DataOperation__Group_3__2"


    // $ANTLR start "rule__DataOperation__Group_3__2__Impl"
    // InternalDataDsl.g:3584:1: rule__DataOperation__Group_3__2__Impl : ( ( rule__DataOperation__Group_3_2__0 )* ) ;
    public final void rule__DataOperation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3588:1: ( ( ( rule__DataOperation__Group_3_2__0 )* ) )
            // InternalDataDsl.g:3589:1: ( ( rule__DataOperation__Group_3_2__0 )* )
            {
            // InternalDataDsl.g:3589:1: ( ( rule__DataOperation__Group_3_2__0 )* )
            // InternalDataDsl.g:3590:2: ( rule__DataOperation__Group_3_2__0 )*
            {
             before(grammarAccess.getDataOperationAccess().getGroup_3_2()); 
            // InternalDataDsl.g:3591:2: ( rule__DataOperation__Group_3_2__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==43) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalDataDsl.g:3591:3: rule__DataOperation__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__DataOperation__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getDataOperationAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__Group_3__2__Impl"


    // $ANTLR start "rule__DataOperation__Group_3__3"
    // InternalDataDsl.g:3599:1: rule__DataOperation__Group_3__3 : rule__DataOperation__Group_3__3__Impl ;
    public final void rule__DataOperation__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3603:1: ( rule__DataOperation__Group_3__3__Impl )
            // InternalDataDsl.g:3604:2: rule__DataOperation__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataOperation__Group_3__3__Impl();

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
    // $ANTLR end "rule__DataOperation__Group_3__3"


    // $ANTLR start "rule__DataOperation__Group_3__3__Impl"
    // InternalDataDsl.g:3610:1: rule__DataOperation__Group_3__3__Impl : ( ')' ) ;
    public final void rule__DataOperation__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3614:1: ( ( ')' ) )
            // InternalDataDsl.g:3615:1: ( ')' )
            {
            // InternalDataDsl.g:3615:1: ( ')' )
            // InternalDataDsl.g:3616:2: ')'
            {
             before(grammarAccess.getDataOperationAccess().getRightParenthesisKeyword_3_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDataOperationAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__Group_3__3__Impl"


    // $ANTLR start "rule__DataOperation__Group_3_2__0"
    // InternalDataDsl.g:3626:1: rule__DataOperation__Group_3_2__0 : rule__DataOperation__Group_3_2__0__Impl rule__DataOperation__Group_3_2__1 ;
    public final void rule__DataOperation__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3630:1: ( rule__DataOperation__Group_3_2__0__Impl rule__DataOperation__Group_3_2__1 )
            // InternalDataDsl.g:3631:2: rule__DataOperation__Group_3_2__0__Impl rule__DataOperation__Group_3_2__1
            {
            pushFollow(FOLLOW_34);
            rule__DataOperation__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOperation__Group_3_2__1();

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
    // $ANTLR end "rule__DataOperation__Group_3_2__0"


    // $ANTLR start "rule__DataOperation__Group_3_2__0__Impl"
    // InternalDataDsl.g:3638:1: rule__DataOperation__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__DataOperation__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3642:1: ( ( ',' ) )
            // InternalDataDsl.g:3643:1: ( ',' )
            {
            // InternalDataDsl.g:3643:1: ( ',' )
            // InternalDataDsl.g:3644:2: ','
            {
             before(grammarAccess.getDataOperationAccess().getCommaKeyword_3_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDataOperationAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__Group_3_2__0__Impl"


    // $ANTLR start "rule__DataOperation__Group_3_2__1"
    // InternalDataDsl.g:3653:1: rule__DataOperation__Group_3_2__1 : rule__DataOperation__Group_3_2__1__Impl ;
    public final void rule__DataOperation__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3657:1: ( rule__DataOperation__Group_3_2__1__Impl )
            // InternalDataDsl.g:3658:2: rule__DataOperation__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataOperation__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__DataOperation__Group_3_2__1"


    // $ANTLR start "rule__DataOperation__Group_3_2__1__Impl"
    // InternalDataDsl.g:3664:1: rule__DataOperation__Group_3_2__1__Impl : ( ( rule__DataOperation__ParametersAssignment_3_2_1 ) ) ;
    public final void rule__DataOperation__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3668:1: ( ( ( rule__DataOperation__ParametersAssignment_3_2_1 ) ) )
            // InternalDataDsl.g:3669:1: ( ( rule__DataOperation__ParametersAssignment_3_2_1 ) )
            {
            // InternalDataDsl.g:3669:1: ( ( rule__DataOperation__ParametersAssignment_3_2_1 ) )
            // InternalDataDsl.g:3670:2: ( rule__DataOperation__ParametersAssignment_3_2_1 )
            {
             before(grammarAccess.getDataOperationAccess().getParametersAssignment_3_2_1()); 
            // InternalDataDsl.g:3671:2: ( rule__DataOperation__ParametersAssignment_3_2_1 )
            // InternalDataDsl.g:3671:3: rule__DataOperation__ParametersAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataOperation__ParametersAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataOperationAccess().getParametersAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__Group_3_2__1__Impl"


    // $ANTLR start "rule__DataOperation__Group_4__0"
    // InternalDataDsl.g:3680:1: rule__DataOperation__Group_4__0 : rule__DataOperation__Group_4__0__Impl rule__DataOperation__Group_4__1 ;
    public final void rule__DataOperation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3684:1: ( rule__DataOperation__Group_4__0__Impl rule__DataOperation__Group_4__1 )
            // InternalDataDsl.g:3685:2: rule__DataOperation__Group_4__0__Impl rule__DataOperation__Group_4__1
            {
            pushFollow(FOLLOW_36);
            rule__DataOperation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOperation__Group_4__1();

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
    // $ANTLR end "rule__DataOperation__Group_4__0"


    // $ANTLR start "rule__DataOperation__Group_4__0__Impl"
    // InternalDataDsl.g:3692:1: rule__DataOperation__Group_4__0__Impl : ( '<' ) ;
    public final void rule__DataOperation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3696:1: ( ( '<' ) )
            // InternalDataDsl.g:3697:1: ( '<' )
            {
            // InternalDataDsl.g:3697:1: ( '<' )
            // InternalDataDsl.g:3698:2: '<'
            {
             before(grammarAccess.getDataOperationAccess().getLessThanSignKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDataOperationAccess().getLessThanSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__Group_4__0__Impl"


    // $ANTLR start "rule__DataOperation__Group_4__1"
    // InternalDataDsl.g:3707:1: rule__DataOperation__Group_4__1 : rule__DataOperation__Group_4__1__Impl rule__DataOperation__Group_4__2 ;
    public final void rule__DataOperation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3711:1: ( rule__DataOperation__Group_4__1__Impl rule__DataOperation__Group_4__2 )
            // InternalDataDsl.g:3712:2: rule__DataOperation__Group_4__1__Impl rule__DataOperation__Group_4__2
            {
            pushFollow(FOLLOW_20);
            rule__DataOperation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOperation__Group_4__2();

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
    // $ANTLR end "rule__DataOperation__Group_4__1"


    // $ANTLR start "rule__DataOperation__Group_4__1__Impl"
    // InternalDataDsl.g:3719:1: rule__DataOperation__Group_4__1__Impl : ( ( rule__DataOperation__FeaturesAssignment_4_1 ) ) ;
    public final void rule__DataOperation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3723:1: ( ( ( rule__DataOperation__FeaturesAssignment_4_1 ) ) )
            // InternalDataDsl.g:3724:1: ( ( rule__DataOperation__FeaturesAssignment_4_1 ) )
            {
            // InternalDataDsl.g:3724:1: ( ( rule__DataOperation__FeaturesAssignment_4_1 ) )
            // InternalDataDsl.g:3725:2: ( rule__DataOperation__FeaturesAssignment_4_1 )
            {
             before(grammarAccess.getDataOperationAccess().getFeaturesAssignment_4_1()); 
            // InternalDataDsl.g:3726:2: ( rule__DataOperation__FeaturesAssignment_4_1 )
            // InternalDataDsl.g:3726:3: rule__DataOperation__FeaturesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DataOperation__FeaturesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDataOperationAccess().getFeaturesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__Group_4__1__Impl"


    // $ANTLR start "rule__DataOperation__Group_4__2"
    // InternalDataDsl.g:3734:1: rule__DataOperation__Group_4__2 : rule__DataOperation__Group_4__2__Impl rule__DataOperation__Group_4__3 ;
    public final void rule__DataOperation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3738:1: ( rule__DataOperation__Group_4__2__Impl rule__DataOperation__Group_4__3 )
            // InternalDataDsl.g:3739:2: rule__DataOperation__Group_4__2__Impl rule__DataOperation__Group_4__3
            {
            pushFollow(FOLLOW_20);
            rule__DataOperation__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOperation__Group_4__3();

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
    // $ANTLR end "rule__DataOperation__Group_4__2"


    // $ANTLR start "rule__DataOperation__Group_4__2__Impl"
    // InternalDataDsl.g:3746:1: rule__DataOperation__Group_4__2__Impl : ( ( rule__DataOperation__Group_4_2__0 )* ) ;
    public final void rule__DataOperation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3750:1: ( ( ( rule__DataOperation__Group_4_2__0 )* ) )
            // InternalDataDsl.g:3751:1: ( ( rule__DataOperation__Group_4_2__0 )* )
            {
            // InternalDataDsl.g:3751:1: ( ( rule__DataOperation__Group_4_2__0 )* )
            // InternalDataDsl.g:3752:2: ( rule__DataOperation__Group_4_2__0 )*
            {
             before(grammarAccess.getDataOperationAccess().getGroup_4_2()); 
            // InternalDataDsl.g:3753:2: ( rule__DataOperation__Group_4_2__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==43) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalDataDsl.g:3753:3: rule__DataOperation__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__DataOperation__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getDataOperationAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__Group_4__2__Impl"


    // $ANTLR start "rule__DataOperation__Group_4__3"
    // InternalDataDsl.g:3761:1: rule__DataOperation__Group_4__3 : rule__DataOperation__Group_4__3__Impl ;
    public final void rule__DataOperation__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3765:1: ( rule__DataOperation__Group_4__3__Impl )
            // InternalDataDsl.g:3766:2: rule__DataOperation__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataOperation__Group_4__3__Impl();

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
    // $ANTLR end "rule__DataOperation__Group_4__3"


    // $ANTLR start "rule__DataOperation__Group_4__3__Impl"
    // InternalDataDsl.g:3772:1: rule__DataOperation__Group_4__3__Impl : ( '>' ) ;
    public final void rule__DataOperation__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3776:1: ( ( '>' ) )
            // InternalDataDsl.g:3777:1: ( '>' )
            {
            // InternalDataDsl.g:3777:1: ( '>' )
            // InternalDataDsl.g:3778:2: '>'
            {
             before(grammarAccess.getDataOperationAccess().getGreaterThanSignKeyword_4_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDataOperationAccess().getGreaterThanSignKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__Group_4__3__Impl"


    // $ANTLR start "rule__DataOperation__Group_4_2__0"
    // InternalDataDsl.g:3788:1: rule__DataOperation__Group_4_2__0 : rule__DataOperation__Group_4_2__0__Impl rule__DataOperation__Group_4_2__1 ;
    public final void rule__DataOperation__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3792:1: ( rule__DataOperation__Group_4_2__0__Impl rule__DataOperation__Group_4_2__1 )
            // InternalDataDsl.g:3793:2: rule__DataOperation__Group_4_2__0__Impl rule__DataOperation__Group_4_2__1
            {
            pushFollow(FOLLOW_36);
            rule__DataOperation__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOperation__Group_4_2__1();

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
    // $ANTLR end "rule__DataOperation__Group_4_2__0"


    // $ANTLR start "rule__DataOperation__Group_4_2__0__Impl"
    // InternalDataDsl.g:3800:1: rule__DataOperation__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__DataOperation__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3804:1: ( ( ',' ) )
            // InternalDataDsl.g:3805:1: ( ',' )
            {
            // InternalDataDsl.g:3805:1: ( ',' )
            // InternalDataDsl.g:3806:2: ','
            {
             before(grammarAccess.getDataOperationAccess().getCommaKeyword_4_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDataOperationAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__Group_4_2__0__Impl"


    // $ANTLR start "rule__DataOperation__Group_4_2__1"
    // InternalDataDsl.g:3815:1: rule__DataOperation__Group_4_2__1 : rule__DataOperation__Group_4_2__1__Impl ;
    public final void rule__DataOperation__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3819:1: ( rule__DataOperation__Group_4_2__1__Impl )
            // InternalDataDsl.g:3820:2: rule__DataOperation__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataOperation__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__DataOperation__Group_4_2__1"


    // $ANTLR start "rule__DataOperation__Group_4_2__1__Impl"
    // InternalDataDsl.g:3826:1: rule__DataOperation__Group_4_2__1__Impl : ( ( rule__DataOperation__FeaturesAssignment_4_2_1 ) ) ;
    public final void rule__DataOperation__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3830:1: ( ( ( rule__DataOperation__FeaturesAssignment_4_2_1 ) ) )
            // InternalDataDsl.g:3831:1: ( ( rule__DataOperation__FeaturesAssignment_4_2_1 ) )
            {
            // InternalDataDsl.g:3831:1: ( ( rule__DataOperation__FeaturesAssignment_4_2_1 ) )
            // InternalDataDsl.g:3832:2: ( rule__DataOperation__FeaturesAssignment_4_2_1 )
            {
             before(grammarAccess.getDataOperationAccess().getFeaturesAssignment_4_2_1()); 
            // InternalDataDsl.g:3833:2: ( rule__DataOperation__FeaturesAssignment_4_2_1 )
            // InternalDataDsl.g:3833:3: rule__DataOperation__FeaturesAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataOperation__FeaturesAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataOperationAccess().getFeaturesAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__Group_4_2__1__Impl"


    // $ANTLR start "rule__DataOperationParameter__Group__0"
    // InternalDataDsl.g:3842:1: rule__DataOperationParameter__Group__0 : rule__DataOperationParameter__Group__0__Impl rule__DataOperationParameter__Group__1 ;
    public final void rule__DataOperationParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3846:1: ( rule__DataOperationParameter__Group__0__Impl rule__DataOperationParameter__Group__1 )
            // InternalDataDsl.g:3847:2: rule__DataOperationParameter__Group__0__Impl rule__DataOperationParameter__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__DataOperationParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOperationParameter__Group__1();

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
    // $ANTLR end "rule__DataOperationParameter__Group__0"


    // $ANTLR start "rule__DataOperationParameter__Group__0__Impl"
    // InternalDataDsl.g:3854:1: rule__DataOperationParameter__Group__0__Impl : ( ( rule__DataOperationParameter__Alternatives_0 ) ) ;
    public final void rule__DataOperationParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3858:1: ( ( ( rule__DataOperationParameter__Alternatives_0 ) ) )
            // InternalDataDsl.g:3859:1: ( ( rule__DataOperationParameter__Alternatives_0 ) )
            {
            // InternalDataDsl.g:3859:1: ( ( rule__DataOperationParameter__Alternatives_0 ) )
            // InternalDataDsl.g:3860:2: ( rule__DataOperationParameter__Alternatives_0 )
            {
             before(grammarAccess.getDataOperationParameterAccess().getAlternatives_0()); 
            // InternalDataDsl.g:3861:2: ( rule__DataOperationParameter__Alternatives_0 )
            // InternalDataDsl.g:3861:3: rule__DataOperationParameter__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__DataOperationParameter__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDataOperationParameterAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperationParameter__Group__0__Impl"


    // $ANTLR start "rule__DataOperationParameter__Group__1"
    // InternalDataDsl.g:3869:1: rule__DataOperationParameter__Group__1 : rule__DataOperationParameter__Group__1__Impl ;
    public final void rule__DataOperationParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3873:1: ( rule__DataOperationParameter__Group__1__Impl )
            // InternalDataDsl.g:3874:2: rule__DataOperationParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataOperationParameter__Group__1__Impl();

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
    // $ANTLR end "rule__DataOperationParameter__Group__1"


    // $ANTLR start "rule__DataOperationParameter__Group__1__Impl"
    // InternalDataDsl.g:3880:1: rule__DataOperationParameter__Group__1__Impl : ( ( rule__DataOperationParameter__NameAssignment_1 ) ) ;
    public final void rule__DataOperationParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3884:1: ( ( ( rule__DataOperationParameter__NameAssignment_1 ) ) )
            // InternalDataDsl.g:3885:1: ( ( rule__DataOperationParameter__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:3885:1: ( ( rule__DataOperationParameter__NameAssignment_1 ) )
            // InternalDataDsl.g:3886:2: ( rule__DataOperationParameter__NameAssignment_1 )
            {
             before(grammarAccess.getDataOperationParameterAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:3887:2: ( rule__DataOperationParameter__NameAssignment_1 )
            // InternalDataDsl.g:3887:3: rule__DataOperationParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataOperationParameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataOperationParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperationParameter__Group__1__Impl"


    // $ANTLR start "rule__ImportedComplexType__Group__0"
    // InternalDataDsl.g:3896:1: rule__ImportedComplexType__Group__0 : rule__ImportedComplexType__Group__0__Impl rule__ImportedComplexType__Group__1 ;
    public final void rule__ImportedComplexType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3900:1: ( rule__ImportedComplexType__Group__0__Impl rule__ImportedComplexType__Group__1 )
            // InternalDataDsl.g:3901:2: rule__ImportedComplexType__Group__0__Impl rule__ImportedComplexType__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__ImportedComplexType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedComplexType__Group__1();

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
    // $ANTLR end "rule__ImportedComplexType__Group__0"


    // $ANTLR start "rule__ImportedComplexType__Group__0__Impl"
    // InternalDataDsl.g:3908:1: rule__ImportedComplexType__Group__0__Impl : ( ( rule__ImportedComplexType__ImportAssignment_0 ) ) ;
    public final void rule__ImportedComplexType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3912:1: ( ( ( rule__ImportedComplexType__ImportAssignment_0 ) ) )
            // InternalDataDsl.g:3913:1: ( ( rule__ImportedComplexType__ImportAssignment_0 ) )
            {
            // InternalDataDsl.g:3913:1: ( ( rule__ImportedComplexType__ImportAssignment_0 ) )
            // InternalDataDsl.g:3914:2: ( rule__ImportedComplexType__ImportAssignment_0 )
            {
             before(grammarAccess.getImportedComplexTypeAccess().getImportAssignment_0()); 
            // InternalDataDsl.g:3915:2: ( rule__ImportedComplexType__ImportAssignment_0 )
            // InternalDataDsl.g:3915:3: rule__ImportedComplexType__ImportAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ImportedComplexType__ImportAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getImportedComplexTypeAccess().getImportAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedComplexType__Group__0__Impl"


    // $ANTLR start "rule__ImportedComplexType__Group__1"
    // InternalDataDsl.g:3923:1: rule__ImportedComplexType__Group__1 : rule__ImportedComplexType__Group__1__Impl rule__ImportedComplexType__Group__2 ;
    public final void rule__ImportedComplexType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3927:1: ( rule__ImportedComplexType__Group__1__Impl rule__ImportedComplexType__Group__2 )
            // InternalDataDsl.g:3928:2: rule__ImportedComplexType__Group__1__Impl rule__ImportedComplexType__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ImportedComplexType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportedComplexType__Group__2();

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
    // $ANTLR end "rule__ImportedComplexType__Group__1"


    // $ANTLR start "rule__ImportedComplexType__Group__1__Impl"
    // InternalDataDsl.g:3935:1: rule__ImportedComplexType__Group__1__Impl : ( '::' ) ;
    public final void rule__ImportedComplexType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3939:1: ( ( '::' ) )
            // InternalDataDsl.g:3940:1: ( '::' )
            {
            // InternalDataDsl.g:3940:1: ( '::' )
            // InternalDataDsl.g:3941:2: '::'
            {
             before(grammarAccess.getImportedComplexTypeAccess().getColonColonKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getImportedComplexTypeAccess().getColonColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedComplexType__Group__1__Impl"


    // $ANTLR start "rule__ImportedComplexType__Group__2"
    // InternalDataDsl.g:3950:1: rule__ImportedComplexType__Group__2 : rule__ImportedComplexType__Group__2__Impl ;
    public final void rule__ImportedComplexType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3954:1: ( rule__ImportedComplexType__Group__2__Impl )
            // InternalDataDsl.g:3955:2: rule__ImportedComplexType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportedComplexType__Group__2__Impl();

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
    // $ANTLR end "rule__ImportedComplexType__Group__2"


    // $ANTLR start "rule__ImportedComplexType__Group__2__Impl"
    // InternalDataDsl.g:3961:1: rule__ImportedComplexType__Group__2__Impl : ( ( rule__ImportedComplexType__ImportedTypeAssignment_2 ) ) ;
    public final void rule__ImportedComplexType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3965:1: ( ( ( rule__ImportedComplexType__ImportedTypeAssignment_2 ) ) )
            // InternalDataDsl.g:3966:1: ( ( rule__ImportedComplexType__ImportedTypeAssignment_2 ) )
            {
            // InternalDataDsl.g:3966:1: ( ( rule__ImportedComplexType__ImportedTypeAssignment_2 ) )
            // InternalDataDsl.g:3967:2: ( rule__ImportedComplexType__ImportedTypeAssignment_2 )
            {
             before(grammarAccess.getImportedComplexTypeAccess().getImportedTypeAssignment_2()); 
            // InternalDataDsl.g:3968:2: ( rule__ImportedComplexType__ImportedTypeAssignment_2 )
            // InternalDataDsl.g:3968:3: rule__ImportedComplexType__ImportedTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ImportedComplexType__ImportedTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImportedComplexTypeAccess().getImportedTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedComplexType__Group__2__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_0__0"
    // InternalDataDsl.g:3977:1: rule__PrimitiveType__Group_0__0 : rule__PrimitiveType__Group_0__0__Impl rule__PrimitiveType__Group_0__1 ;
    public final void rule__PrimitiveType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3981:1: ( rule__PrimitiveType__Group_0__0__Impl rule__PrimitiveType__Group_0__1 )
            // InternalDataDsl.g:3982:2: rule__PrimitiveType__Group_0__0__Impl rule__PrimitiveType__Group_0__1
            {
            pushFollow(FOLLOW_38);
            rule__PrimitiveType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_0__1();

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
    // $ANTLR end "rule__PrimitiveType__Group_0__0"


    // $ANTLR start "rule__PrimitiveType__Group_0__0__Impl"
    // InternalDataDsl.g:3989:1: rule__PrimitiveType__Group_0__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3993:1: ( ( () ) )
            // InternalDataDsl.g:3994:1: ( () )
            {
            // InternalDataDsl.g:3994:1: ( () )
            // InternalDataDsl.g:3995:2: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getPrimitiveBooleanAction_0_0()); 
            // InternalDataDsl.g:3996:2: ()
            // InternalDataDsl.g:3996:3: 
            {
            }

             after(grammarAccess.getPrimitiveTypeAccess().getPrimitiveBooleanAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_0__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_0__1"
    // InternalDataDsl.g:4004:1: rule__PrimitiveType__Group_0__1 : rule__PrimitiveType__Group_0__1__Impl ;
    public final void rule__PrimitiveType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4008:1: ( rule__PrimitiveType__Group_0__1__Impl )
            // InternalDataDsl.g:4009:2: rule__PrimitiveType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_0__1__Impl();

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
    // $ANTLR end "rule__PrimitiveType__Group_0__1"


    // $ANTLR start "rule__PrimitiveType__Group_0__1__Impl"
    // InternalDataDsl.g:4015:1: rule__PrimitiveType__Group_0__1__Impl : ( 'boolean' ) ;
    public final void rule__PrimitiveType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4019:1: ( ( 'boolean' ) )
            // InternalDataDsl.g:4020:1: ( 'boolean' )
            {
            // InternalDataDsl.g:4020:1: ( 'boolean' )
            // InternalDataDsl.g:4021:2: 'boolean'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getBooleanKeyword_0_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getBooleanKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_0__1__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_1__0"
    // InternalDataDsl.g:4031:1: rule__PrimitiveType__Group_1__0 : rule__PrimitiveType__Group_1__0__Impl rule__PrimitiveType__Group_1__1 ;
    public final void rule__PrimitiveType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4035:1: ( rule__PrimitiveType__Group_1__0__Impl rule__PrimitiveType__Group_1__1 )
            // InternalDataDsl.g:4036:2: rule__PrimitiveType__Group_1__0__Impl rule__PrimitiveType__Group_1__1
            {
            pushFollow(FOLLOW_39);
            rule__PrimitiveType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_1__1();

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
    // $ANTLR end "rule__PrimitiveType__Group_1__0"


    // $ANTLR start "rule__PrimitiveType__Group_1__0__Impl"
    // InternalDataDsl.g:4043:1: rule__PrimitiveType__Group_1__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4047:1: ( ( () ) )
            // InternalDataDsl.g:4048:1: ( () )
            {
            // InternalDataDsl.g:4048:1: ( () )
            // InternalDataDsl.g:4049:2: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getPrimitiveByteAction_1_0()); 
            // InternalDataDsl.g:4050:2: ()
            // InternalDataDsl.g:4050:3: 
            {
            }

             after(grammarAccess.getPrimitiveTypeAccess().getPrimitiveByteAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_1__1"
    // InternalDataDsl.g:4058:1: rule__PrimitiveType__Group_1__1 : rule__PrimitiveType__Group_1__1__Impl ;
    public final void rule__PrimitiveType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4062:1: ( rule__PrimitiveType__Group_1__1__Impl )
            // InternalDataDsl.g:4063:2: rule__PrimitiveType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_1__1__Impl();

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
    // $ANTLR end "rule__PrimitiveType__Group_1__1"


    // $ANTLR start "rule__PrimitiveType__Group_1__1__Impl"
    // InternalDataDsl.g:4069:1: rule__PrimitiveType__Group_1__1__Impl : ( 'byte' ) ;
    public final void rule__PrimitiveType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4073:1: ( ( 'byte' ) )
            // InternalDataDsl.g:4074:1: ( 'byte' )
            {
            // InternalDataDsl.g:4074:1: ( 'byte' )
            // InternalDataDsl.g:4075:2: 'byte'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getByteKeyword_1_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getByteKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_1__1__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_2__0"
    // InternalDataDsl.g:4085:1: rule__PrimitiveType__Group_2__0 : rule__PrimitiveType__Group_2__0__Impl rule__PrimitiveType__Group_2__1 ;
    public final void rule__PrimitiveType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4089:1: ( rule__PrimitiveType__Group_2__0__Impl rule__PrimitiveType__Group_2__1 )
            // InternalDataDsl.g:4090:2: rule__PrimitiveType__Group_2__0__Impl rule__PrimitiveType__Group_2__1
            {
            pushFollow(FOLLOW_40);
            rule__PrimitiveType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_2__1();

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
    // $ANTLR end "rule__PrimitiveType__Group_2__0"


    // $ANTLR start "rule__PrimitiveType__Group_2__0__Impl"
    // InternalDataDsl.g:4097:1: rule__PrimitiveType__Group_2__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4101:1: ( ( () ) )
            // InternalDataDsl.g:4102:1: ( () )
            {
            // InternalDataDsl.g:4102:1: ( () )
            // InternalDataDsl.g:4103:2: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getPrimitiveCharacterAction_2_0()); 
            // InternalDataDsl.g:4104:2: ()
            // InternalDataDsl.g:4104:3: 
            {
            }

             after(grammarAccess.getPrimitiveTypeAccess().getPrimitiveCharacterAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_2__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_2__1"
    // InternalDataDsl.g:4112:1: rule__PrimitiveType__Group_2__1 : rule__PrimitiveType__Group_2__1__Impl ;
    public final void rule__PrimitiveType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4116:1: ( rule__PrimitiveType__Group_2__1__Impl )
            // InternalDataDsl.g:4117:2: rule__PrimitiveType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_2__1__Impl();

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
    // $ANTLR end "rule__PrimitiveType__Group_2__1"


    // $ANTLR start "rule__PrimitiveType__Group_2__1__Impl"
    // InternalDataDsl.g:4123:1: rule__PrimitiveType__Group_2__1__Impl : ( 'char' ) ;
    public final void rule__PrimitiveType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4127:1: ( ( 'char' ) )
            // InternalDataDsl.g:4128:1: ( 'char' )
            {
            // InternalDataDsl.g:4128:1: ( 'char' )
            // InternalDataDsl.g:4129:2: 'char'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getCharKeyword_2_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getCharKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_2__1__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_3__0"
    // InternalDataDsl.g:4139:1: rule__PrimitiveType__Group_3__0 : rule__PrimitiveType__Group_3__0__Impl rule__PrimitiveType__Group_3__1 ;
    public final void rule__PrimitiveType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4143:1: ( rule__PrimitiveType__Group_3__0__Impl rule__PrimitiveType__Group_3__1 )
            // InternalDataDsl.g:4144:2: rule__PrimitiveType__Group_3__0__Impl rule__PrimitiveType__Group_3__1
            {
            pushFollow(FOLLOW_41);
            rule__PrimitiveType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_3__1();

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
    // $ANTLR end "rule__PrimitiveType__Group_3__0"


    // $ANTLR start "rule__PrimitiveType__Group_3__0__Impl"
    // InternalDataDsl.g:4151:1: rule__PrimitiveType__Group_3__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4155:1: ( ( () ) )
            // InternalDataDsl.g:4156:1: ( () )
            {
            // InternalDataDsl.g:4156:1: ( () )
            // InternalDataDsl.g:4157:2: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getPrimitiveDateAction_3_0()); 
            // InternalDataDsl.g:4158:2: ()
            // InternalDataDsl.g:4158:3: 
            {
            }

             after(grammarAccess.getPrimitiveTypeAccess().getPrimitiveDateAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_3__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_3__1"
    // InternalDataDsl.g:4166:1: rule__PrimitiveType__Group_3__1 : rule__PrimitiveType__Group_3__1__Impl ;
    public final void rule__PrimitiveType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4170:1: ( rule__PrimitiveType__Group_3__1__Impl )
            // InternalDataDsl.g:4171:2: rule__PrimitiveType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_3__1__Impl();

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
    // $ANTLR end "rule__PrimitiveType__Group_3__1"


    // $ANTLR start "rule__PrimitiveType__Group_3__1__Impl"
    // InternalDataDsl.g:4177:1: rule__PrimitiveType__Group_3__1__Impl : ( 'date' ) ;
    public final void rule__PrimitiveType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4181:1: ( ( 'date' ) )
            // InternalDataDsl.g:4182:1: ( 'date' )
            {
            // InternalDataDsl.g:4182:1: ( 'date' )
            // InternalDataDsl.g:4183:2: 'date'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getDateKeyword_3_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getDateKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_3__1__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_4__0"
    // InternalDataDsl.g:4193:1: rule__PrimitiveType__Group_4__0 : rule__PrimitiveType__Group_4__0__Impl rule__PrimitiveType__Group_4__1 ;
    public final void rule__PrimitiveType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4197:1: ( rule__PrimitiveType__Group_4__0__Impl rule__PrimitiveType__Group_4__1 )
            // InternalDataDsl.g:4198:2: rule__PrimitiveType__Group_4__0__Impl rule__PrimitiveType__Group_4__1
            {
            pushFollow(FOLLOW_42);
            rule__PrimitiveType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_4__1();

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
    // $ANTLR end "rule__PrimitiveType__Group_4__0"


    // $ANTLR start "rule__PrimitiveType__Group_4__0__Impl"
    // InternalDataDsl.g:4205:1: rule__PrimitiveType__Group_4__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4209:1: ( ( () ) )
            // InternalDataDsl.g:4210:1: ( () )
            {
            // InternalDataDsl.g:4210:1: ( () )
            // InternalDataDsl.g:4211:2: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getPrimitiveDoubleAction_4_0()); 
            // InternalDataDsl.g:4212:2: ()
            // InternalDataDsl.g:4212:3: 
            {
            }

             after(grammarAccess.getPrimitiveTypeAccess().getPrimitiveDoubleAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_4__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_4__1"
    // InternalDataDsl.g:4220:1: rule__PrimitiveType__Group_4__1 : rule__PrimitiveType__Group_4__1__Impl ;
    public final void rule__PrimitiveType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4224:1: ( rule__PrimitiveType__Group_4__1__Impl )
            // InternalDataDsl.g:4225:2: rule__PrimitiveType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_4__1__Impl();

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
    // $ANTLR end "rule__PrimitiveType__Group_4__1"


    // $ANTLR start "rule__PrimitiveType__Group_4__1__Impl"
    // InternalDataDsl.g:4231:1: rule__PrimitiveType__Group_4__1__Impl : ( 'double' ) ;
    public final void rule__PrimitiveType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4235:1: ( ( 'double' ) )
            // InternalDataDsl.g:4236:1: ( 'double' )
            {
            // InternalDataDsl.g:4236:1: ( 'double' )
            // InternalDataDsl.g:4237:2: 'double'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getDoubleKeyword_4_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getDoubleKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_4__1__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_5__0"
    // InternalDataDsl.g:4247:1: rule__PrimitiveType__Group_5__0 : rule__PrimitiveType__Group_5__0__Impl rule__PrimitiveType__Group_5__1 ;
    public final void rule__PrimitiveType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4251:1: ( rule__PrimitiveType__Group_5__0__Impl rule__PrimitiveType__Group_5__1 )
            // InternalDataDsl.g:4252:2: rule__PrimitiveType__Group_5__0__Impl rule__PrimitiveType__Group_5__1
            {
            pushFollow(FOLLOW_43);
            rule__PrimitiveType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_5__1();

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
    // $ANTLR end "rule__PrimitiveType__Group_5__0"


    // $ANTLR start "rule__PrimitiveType__Group_5__0__Impl"
    // InternalDataDsl.g:4259:1: rule__PrimitiveType__Group_5__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4263:1: ( ( () ) )
            // InternalDataDsl.g:4264:1: ( () )
            {
            // InternalDataDsl.g:4264:1: ( () )
            // InternalDataDsl.g:4265:2: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getPrimitiveFloatAction_5_0()); 
            // InternalDataDsl.g:4266:2: ()
            // InternalDataDsl.g:4266:3: 
            {
            }

             after(grammarAccess.getPrimitiveTypeAccess().getPrimitiveFloatAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_5__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_5__1"
    // InternalDataDsl.g:4274:1: rule__PrimitiveType__Group_5__1 : rule__PrimitiveType__Group_5__1__Impl ;
    public final void rule__PrimitiveType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4278:1: ( rule__PrimitiveType__Group_5__1__Impl )
            // InternalDataDsl.g:4279:2: rule__PrimitiveType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_5__1__Impl();

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
    // $ANTLR end "rule__PrimitiveType__Group_5__1"


    // $ANTLR start "rule__PrimitiveType__Group_5__1__Impl"
    // InternalDataDsl.g:4285:1: rule__PrimitiveType__Group_5__1__Impl : ( 'float' ) ;
    public final void rule__PrimitiveType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4289:1: ( ( 'float' ) )
            // InternalDataDsl.g:4290:1: ( 'float' )
            {
            // InternalDataDsl.g:4290:1: ( 'float' )
            // InternalDataDsl.g:4291:2: 'float'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getFloatKeyword_5_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getFloatKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_5__1__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_6__0"
    // InternalDataDsl.g:4301:1: rule__PrimitiveType__Group_6__0 : rule__PrimitiveType__Group_6__0__Impl rule__PrimitiveType__Group_6__1 ;
    public final void rule__PrimitiveType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4305:1: ( rule__PrimitiveType__Group_6__0__Impl rule__PrimitiveType__Group_6__1 )
            // InternalDataDsl.g:4306:2: rule__PrimitiveType__Group_6__0__Impl rule__PrimitiveType__Group_6__1
            {
            pushFollow(FOLLOW_44);
            rule__PrimitiveType__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_6__1();

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
    // $ANTLR end "rule__PrimitiveType__Group_6__0"


    // $ANTLR start "rule__PrimitiveType__Group_6__0__Impl"
    // InternalDataDsl.g:4313:1: rule__PrimitiveType__Group_6__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4317:1: ( ( () ) )
            // InternalDataDsl.g:4318:1: ( () )
            {
            // InternalDataDsl.g:4318:1: ( () )
            // InternalDataDsl.g:4319:2: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getPrimitiveIntegerAction_6_0()); 
            // InternalDataDsl.g:4320:2: ()
            // InternalDataDsl.g:4320:3: 
            {
            }

             after(grammarAccess.getPrimitiveTypeAccess().getPrimitiveIntegerAction_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_6__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_6__1"
    // InternalDataDsl.g:4328:1: rule__PrimitiveType__Group_6__1 : rule__PrimitiveType__Group_6__1__Impl ;
    public final void rule__PrimitiveType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4332:1: ( rule__PrimitiveType__Group_6__1__Impl )
            // InternalDataDsl.g:4333:2: rule__PrimitiveType__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_6__1__Impl();

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
    // $ANTLR end "rule__PrimitiveType__Group_6__1"


    // $ANTLR start "rule__PrimitiveType__Group_6__1__Impl"
    // InternalDataDsl.g:4339:1: rule__PrimitiveType__Group_6__1__Impl : ( 'int' ) ;
    public final void rule__PrimitiveType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4343:1: ( ( 'int' ) )
            // InternalDataDsl.g:4344:1: ( 'int' )
            {
            // InternalDataDsl.g:4344:1: ( 'int' )
            // InternalDataDsl.g:4345:2: 'int'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getIntKeyword_6_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getIntKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_6__1__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_7__0"
    // InternalDataDsl.g:4355:1: rule__PrimitiveType__Group_7__0 : rule__PrimitiveType__Group_7__0__Impl rule__PrimitiveType__Group_7__1 ;
    public final void rule__PrimitiveType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4359:1: ( rule__PrimitiveType__Group_7__0__Impl rule__PrimitiveType__Group_7__1 )
            // InternalDataDsl.g:4360:2: rule__PrimitiveType__Group_7__0__Impl rule__PrimitiveType__Group_7__1
            {
            pushFollow(FOLLOW_45);
            rule__PrimitiveType__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_7__1();

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
    // $ANTLR end "rule__PrimitiveType__Group_7__0"


    // $ANTLR start "rule__PrimitiveType__Group_7__0__Impl"
    // InternalDataDsl.g:4367:1: rule__PrimitiveType__Group_7__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4371:1: ( ( () ) )
            // InternalDataDsl.g:4372:1: ( () )
            {
            // InternalDataDsl.g:4372:1: ( () )
            // InternalDataDsl.g:4373:2: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getPrimitiveLongAction_7_0()); 
            // InternalDataDsl.g:4374:2: ()
            // InternalDataDsl.g:4374:3: 
            {
            }

             after(grammarAccess.getPrimitiveTypeAccess().getPrimitiveLongAction_7_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_7__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_7__1"
    // InternalDataDsl.g:4382:1: rule__PrimitiveType__Group_7__1 : rule__PrimitiveType__Group_7__1__Impl ;
    public final void rule__PrimitiveType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4386:1: ( rule__PrimitiveType__Group_7__1__Impl )
            // InternalDataDsl.g:4387:2: rule__PrimitiveType__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_7__1__Impl();

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
    // $ANTLR end "rule__PrimitiveType__Group_7__1"


    // $ANTLR start "rule__PrimitiveType__Group_7__1__Impl"
    // InternalDataDsl.g:4393:1: rule__PrimitiveType__Group_7__1__Impl : ( 'long' ) ;
    public final void rule__PrimitiveType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4397:1: ( ( 'long' ) )
            // InternalDataDsl.g:4398:1: ( 'long' )
            {
            // InternalDataDsl.g:4398:1: ( 'long' )
            // InternalDataDsl.g:4399:2: 'long'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getLongKeyword_7_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getLongKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_7__1__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_8__0"
    // InternalDataDsl.g:4409:1: rule__PrimitiveType__Group_8__0 : rule__PrimitiveType__Group_8__0__Impl rule__PrimitiveType__Group_8__1 ;
    public final void rule__PrimitiveType__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4413:1: ( rule__PrimitiveType__Group_8__0__Impl rule__PrimitiveType__Group_8__1 )
            // InternalDataDsl.g:4414:2: rule__PrimitiveType__Group_8__0__Impl rule__PrimitiveType__Group_8__1
            {
            pushFollow(FOLLOW_46);
            rule__PrimitiveType__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_8__1();

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
    // $ANTLR end "rule__PrimitiveType__Group_8__0"


    // $ANTLR start "rule__PrimitiveType__Group_8__0__Impl"
    // InternalDataDsl.g:4421:1: rule__PrimitiveType__Group_8__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4425:1: ( ( () ) )
            // InternalDataDsl.g:4426:1: ( () )
            {
            // InternalDataDsl.g:4426:1: ( () )
            // InternalDataDsl.g:4427:2: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getPrimitiveShortAction_8_0()); 
            // InternalDataDsl.g:4428:2: ()
            // InternalDataDsl.g:4428:3: 
            {
            }

             after(grammarAccess.getPrimitiveTypeAccess().getPrimitiveShortAction_8_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_8__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_8__1"
    // InternalDataDsl.g:4436:1: rule__PrimitiveType__Group_8__1 : rule__PrimitiveType__Group_8__1__Impl ;
    public final void rule__PrimitiveType__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4440:1: ( rule__PrimitiveType__Group_8__1__Impl )
            // InternalDataDsl.g:4441:2: rule__PrimitiveType__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_8__1__Impl();

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
    // $ANTLR end "rule__PrimitiveType__Group_8__1"


    // $ANTLR start "rule__PrimitiveType__Group_8__1__Impl"
    // InternalDataDsl.g:4447:1: rule__PrimitiveType__Group_8__1__Impl : ( 'short' ) ;
    public final void rule__PrimitiveType__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4451:1: ( ( 'short' ) )
            // InternalDataDsl.g:4452:1: ( 'short' )
            {
            // InternalDataDsl.g:4452:1: ( 'short' )
            // InternalDataDsl.g:4453:2: 'short'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getShortKeyword_8_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getShortKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_8__1__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_9__0"
    // InternalDataDsl.g:4463:1: rule__PrimitiveType__Group_9__0 : rule__PrimitiveType__Group_9__0__Impl rule__PrimitiveType__Group_9__1 ;
    public final void rule__PrimitiveType__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4467:1: ( rule__PrimitiveType__Group_9__0__Impl rule__PrimitiveType__Group_9__1 )
            // InternalDataDsl.g:4468:2: rule__PrimitiveType__Group_9__0__Impl rule__PrimitiveType__Group_9__1
            {
            pushFollow(FOLLOW_47);
            rule__PrimitiveType__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_9__1();

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
    // $ANTLR end "rule__PrimitiveType__Group_9__0"


    // $ANTLR start "rule__PrimitiveType__Group_9__0__Impl"
    // InternalDataDsl.g:4475:1: rule__PrimitiveType__Group_9__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4479:1: ( ( () ) )
            // InternalDataDsl.g:4480:1: ( () )
            {
            // InternalDataDsl.g:4480:1: ( () )
            // InternalDataDsl.g:4481:2: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getPrimitiveStringAction_9_0()); 
            // InternalDataDsl.g:4482:2: ()
            // InternalDataDsl.g:4482:3: 
            {
            }

             after(grammarAccess.getPrimitiveTypeAccess().getPrimitiveStringAction_9_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_9__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_9__1"
    // InternalDataDsl.g:4490:1: rule__PrimitiveType__Group_9__1 : rule__PrimitiveType__Group_9__1__Impl ;
    public final void rule__PrimitiveType__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4494:1: ( rule__PrimitiveType__Group_9__1__Impl )
            // InternalDataDsl.g:4495:2: rule__PrimitiveType__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_9__1__Impl();

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
    // $ANTLR end "rule__PrimitiveType__Group_9__1"


    // $ANTLR start "rule__PrimitiveType__Group_9__1__Impl"
    // InternalDataDsl.g:4501:1: rule__PrimitiveType__Group_9__1__Impl : ( 'string' ) ;
    public final void rule__PrimitiveType__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4505:1: ( ( 'string' ) )
            // InternalDataDsl.g:4506:1: ( 'string' )
            {
            // InternalDataDsl.g:4506:1: ( 'string' )
            // InternalDataDsl.g:4507:2: 'string'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getStringKeyword_9_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getStringKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_9__1__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_10__0"
    // InternalDataDsl.g:4517:1: rule__PrimitiveType__Group_10__0 : rule__PrimitiveType__Group_10__0__Impl rule__PrimitiveType__Group_10__1 ;
    public final void rule__PrimitiveType__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4521:1: ( rule__PrimitiveType__Group_10__0__Impl rule__PrimitiveType__Group_10__1 )
            // InternalDataDsl.g:4522:2: rule__PrimitiveType__Group_10__0__Impl rule__PrimitiveType__Group_10__1
            {
            pushFollow(FOLLOW_26);
            rule__PrimitiveType__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_10__1();

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
    // $ANTLR end "rule__PrimitiveType__Group_10__0"


    // $ANTLR start "rule__PrimitiveType__Group_10__0__Impl"
    // InternalDataDsl.g:4529:1: rule__PrimitiveType__Group_10__0__Impl : ( () ) ;
    public final void rule__PrimitiveType__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4533:1: ( ( () ) )
            // InternalDataDsl.g:4534:1: ( () )
            {
            // InternalDataDsl.g:4534:1: ( () )
            // InternalDataDsl.g:4535:2: ()
            {
             before(grammarAccess.getPrimitiveTypeAccess().getPrimitiveUnspecifiedAction_10_0()); 
            // InternalDataDsl.g:4536:2: ()
            // InternalDataDsl.g:4536:3: 
            {
            }

             after(grammarAccess.getPrimitiveTypeAccess().getPrimitiveUnspecifiedAction_10_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_10__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group_10__1"
    // InternalDataDsl.g:4544:1: rule__PrimitiveType__Group_10__1 : rule__PrimitiveType__Group_10__1__Impl ;
    public final void rule__PrimitiveType__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4548:1: ( rule__PrimitiveType__Group_10__1__Impl )
            // InternalDataDsl.g:4549:2: rule__PrimitiveType__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group_10__1__Impl();

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
    // $ANTLR end "rule__PrimitiveType__Group_10__1"


    // $ANTLR start "rule__PrimitiveType__Group_10__1__Impl"
    // InternalDataDsl.g:4555:1: rule__PrimitiveType__Group_10__1__Impl : ( 'unspecified' ) ;
    public final void rule__PrimitiveType__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4559:1: ( ( 'unspecified' ) )
            // InternalDataDsl.g:4560:1: ( 'unspecified' )
            {
            // InternalDataDsl.g:4560:1: ( 'unspecified' )
            // InternalDataDsl.g:4561:2: 'unspecified'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getUnspecifiedKeyword_10_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeAccess().getUnspecifiedKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group_10__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalDataDsl.g:4571:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4575:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalDataDsl.g:4576:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalDataDsl.g:4583:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4587:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:4588:1: ( RULE_ID )
            {
            // InternalDataDsl.g:4588:1: ( RULE_ID )
            // InternalDataDsl.g:4589:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalDataDsl.g:4598:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4602:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalDataDsl.g:4603:2: rule__QualifiedName__Group__1__Impl
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
    // InternalDataDsl.g:4609:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4613:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalDataDsl.g:4614:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalDataDsl.g:4614:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalDataDsl.g:4615:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalDataDsl.g:4616:2: ( rule__QualifiedName__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==62) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalDataDsl.g:4616:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalDataDsl.g:4625:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4629:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalDataDsl.g:4630:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalDataDsl.g:4637:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4641:1: ( ( '.' ) )
            // InternalDataDsl.g:4642:1: ( '.' )
            {
            // InternalDataDsl.g:4642:1: ( '.' )
            // InternalDataDsl.g:4643:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalDataDsl.g:4652:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4656:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalDataDsl.g:4657:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalDataDsl.g:4663:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4667:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:4668:1: ( RULE_ID )
            {
            // InternalDataDsl.g:4668:1: ( RULE_ID )
            // InternalDataDsl.g:4669:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataModel__ComplexTypeImportsAssignment_0"
    // InternalDataDsl.g:4679:1: rule__DataModel__ComplexTypeImportsAssignment_0 : ( ruleComplexTypeImport ) ;
    public final void rule__DataModel__ComplexTypeImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4683:1: ( ( ruleComplexTypeImport ) )
            // InternalDataDsl.g:4684:2: ( ruleComplexTypeImport )
            {
            // InternalDataDsl.g:4684:2: ( ruleComplexTypeImport )
            // InternalDataDsl.g:4685:3: ruleComplexTypeImport
            {
             before(grammarAccess.getDataModelAccess().getComplexTypeImportsComplexTypeImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexTypeImport();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getComplexTypeImportsComplexTypeImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__ComplexTypeImportsAssignment_0"


    // $ANTLR start "rule__DataModel__VersionsAssignment_1_0"
    // InternalDataDsl.g:4694:1: rule__DataModel__VersionsAssignment_1_0 : ( ruleVersion ) ;
    public final void rule__DataModel__VersionsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4698:1: ( ( ruleVersion ) )
            // InternalDataDsl.g:4699:2: ( ruleVersion )
            {
            // InternalDataDsl.g:4699:2: ( ruleVersion )
            // InternalDataDsl.g:4700:3: ruleVersion
            {
             before(grammarAccess.getDataModelAccess().getVersionsVersionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVersion();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getVersionsVersionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__VersionsAssignment_1_0"


    // $ANTLR start "rule__DataModel__ContextsAssignment_1_1"
    // InternalDataDsl.g:4709:1: rule__DataModel__ContextsAssignment_1_1 : ( ruleContext ) ;
    public final void rule__DataModel__ContextsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4713:1: ( ( ruleContext ) )
            // InternalDataDsl.g:4714:2: ( ruleContext )
            {
            // InternalDataDsl.g:4714:2: ( ruleContext )
            // InternalDataDsl.g:4715:3: ruleContext
            {
             before(grammarAccess.getDataModelAccess().getContextsContextParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getContextsContextParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__ContextsAssignment_1_1"


    // $ANTLR start "rule__DataModel__ComplexTypesAssignment_1_2"
    // InternalDataDsl.g:4724:1: rule__DataModel__ComplexTypesAssignment_1_2 : ( ruleComplexType ) ;
    public final void rule__DataModel__ComplexTypesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4728:1: ( ( ruleComplexType ) )
            // InternalDataDsl.g:4729:2: ( ruleComplexType )
            {
            // InternalDataDsl.g:4729:2: ( ruleComplexType )
            // InternalDataDsl.g:4730:3: ruleComplexType
            {
             before(grammarAccess.getDataModelAccess().getComplexTypesComplexTypeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexType();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getComplexTypesComplexTypeParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__ComplexTypesAssignment_1_2"


    // $ANTLR start "rule__ComplexTypeImport__ImportURIAssignment_3"
    // InternalDataDsl.g:4739:1: rule__ComplexTypeImport__ImportURIAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ComplexTypeImport__ImportURIAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4743:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:4744:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:4744:2: ( RULE_STRING )
            // InternalDataDsl.g:4745:3: RULE_STRING
            {
             before(grammarAccess.getComplexTypeImportAccess().getImportURISTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComplexTypeImportAccess().getImportURISTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeImport__ImportURIAssignment_3"


    // $ANTLR start "rule__ComplexTypeImport__NameAssignment_5"
    // InternalDataDsl.g:4754:1: rule__ComplexTypeImport__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__ComplexTypeImport__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4758:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:4759:2: ( RULE_ID )
            {
            // InternalDataDsl.g:4759:2: ( RULE_ID )
            // InternalDataDsl.g:4760:3: RULE_ID
            {
             before(grammarAccess.getComplexTypeImportAccess().getNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComplexTypeImportAccess().getNameIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexTypeImport__NameAssignment_5"


    // $ANTLR start "rule__Version__NameAssignment_1"
    // InternalDataDsl.g:4769:1: rule__Version__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Version__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4773:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:4774:2: ( RULE_ID )
            {
            // InternalDataDsl.g:4774:2: ( RULE_ID )
            // InternalDataDsl.g:4775:3: RULE_ID
            {
             before(grammarAccess.getVersionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVersionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__NameAssignment_1"


    // $ANTLR start "rule__Version__ComplexTypesAssignment_3_0"
    // InternalDataDsl.g:4784:1: rule__Version__ComplexTypesAssignment_3_0 : ( ruleComplexType ) ;
    public final void rule__Version__ComplexTypesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4788:1: ( ( ruleComplexType ) )
            // InternalDataDsl.g:4789:2: ( ruleComplexType )
            {
            // InternalDataDsl.g:4789:2: ( ruleComplexType )
            // InternalDataDsl.g:4790:3: ruleComplexType
            {
             before(grammarAccess.getVersionAccess().getComplexTypesComplexTypeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexType();

            state._fsp--;

             after(grammarAccess.getVersionAccess().getComplexTypesComplexTypeParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__ComplexTypesAssignment_3_0"


    // $ANTLR start "rule__Version__ContextsAssignment_3_1"
    // InternalDataDsl.g:4799:1: rule__Version__ContextsAssignment_3_1 : ( ruleContext ) ;
    public final void rule__Version__ContextsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4803:1: ( ( ruleContext ) )
            // InternalDataDsl.g:4804:2: ( ruleContext )
            {
            // InternalDataDsl.g:4804:2: ( ruleContext )
            // InternalDataDsl.g:4805:3: ruleContext
            {
             before(grammarAccess.getVersionAccess().getContextsContextParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContext();

            state._fsp--;

             after(grammarAccess.getVersionAccess().getContextsContextParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Version__ContextsAssignment_3_1"


    // $ANTLR start "rule__Context__NameAssignment_1"
    // InternalDataDsl.g:4814:1: rule__Context__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Context__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4818:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:4819:2: ( RULE_ID )
            {
            // InternalDataDsl.g:4819:2: ( RULE_ID )
            // InternalDataDsl.g:4820:3: RULE_ID
            {
             before(grammarAccess.getContextAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContextAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__NameAssignment_1"


    // $ANTLR start "rule__Context__ComplexTypesAssignment_3"
    // InternalDataDsl.g:4829:1: rule__Context__ComplexTypesAssignment_3 : ( ruleComplexType ) ;
    public final void rule__Context__ComplexTypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4833:1: ( ( ruleComplexType ) )
            // InternalDataDsl.g:4834:2: ( ruleComplexType )
            {
            // InternalDataDsl.g:4834:2: ( ruleComplexType )
            // InternalDataDsl.g:4835:3: ruleComplexType
            {
             before(grammarAccess.getContextAccess().getComplexTypesComplexTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexType();

            state._fsp--;

             after(grammarAccess.getContextAccess().getComplexTypesComplexTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Context__ComplexTypesAssignment_3"


    // $ANTLR start "rule__DataStructure__NameAssignment_1"
    // InternalDataDsl.g:4844:1: rule__DataStructure__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataStructure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4848:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:4849:2: ( RULE_ID )
            {
            // InternalDataDsl.g:4849:2: ( RULE_ID )
            // InternalDataDsl.g:4850:3: RULE_ID
            {
             before(grammarAccess.getDataStructureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataStructureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__NameAssignment_1"


    // $ANTLR start "rule__DataStructure__FeaturesAssignment_2_1"
    // InternalDataDsl.g:4859:1: rule__DataStructure__FeaturesAssignment_2_1 : ( ruleComplexTypeFeature ) ;
    public final void rule__DataStructure__FeaturesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4863:1: ( ( ruleComplexTypeFeature ) )
            // InternalDataDsl.g:4864:2: ( ruleComplexTypeFeature )
            {
            // InternalDataDsl.g:4864:2: ( ruleComplexTypeFeature )
            // InternalDataDsl.g:4865:3: ruleComplexTypeFeature
            {
             before(grammarAccess.getDataStructureAccess().getFeaturesComplexTypeFeatureEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexTypeFeature();

            state._fsp--;

             after(grammarAccess.getDataStructureAccess().getFeaturesComplexTypeFeatureEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__FeaturesAssignment_2_1"


    // $ANTLR start "rule__DataStructure__FeaturesAssignment_2_2_1"
    // InternalDataDsl.g:4874:1: rule__DataStructure__FeaturesAssignment_2_2_1 : ( ruleComplexTypeFeature ) ;
    public final void rule__DataStructure__FeaturesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4878:1: ( ( ruleComplexTypeFeature ) )
            // InternalDataDsl.g:4879:2: ( ruleComplexTypeFeature )
            {
            // InternalDataDsl.g:4879:2: ( ruleComplexTypeFeature )
            // InternalDataDsl.g:4880:3: ruleComplexTypeFeature
            {
             before(grammarAccess.getDataStructureAccess().getFeaturesComplexTypeFeatureEnumRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexTypeFeature();

            state._fsp--;

             after(grammarAccess.getDataStructureAccess().getFeaturesComplexTypeFeatureEnumRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__FeaturesAssignment_2_2_1"


    // $ANTLR start "rule__DataStructure__SuperAssignment_3_1"
    // InternalDataDsl.g:4889:1: rule__DataStructure__SuperAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DataStructure__SuperAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4893:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:4894:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:4894:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:4895:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDataStructureAccess().getSuperDataStructureCrossReference_3_1_0()); 
            // InternalDataDsl.g:4896:3: ( ruleQualifiedName )
            // InternalDataDsl.g:4897:4: ruleQualifiedName
            {
             before(grammarAccess.getDataStructureAccess().getSuperDataStructureQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDataStructureAccess().getSuperDataStructureQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getDataStructureAccess().getSuperDataStructureCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__SuperAssignment_3_1"


    // $ANTLR start "rule__DataStructure__DataFieldsAssignment_5_0_0"
    // InternalDataDsl.g:4908:1: rule__DataStructure__DataFieldsAssignment_5_0_0 : ( ruleDataField ) ;
    public final void rule__DataStructure__DataFieldsAssignment_5_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4912:1: ( ( ruleDataField ) )
            // InternalDataDsl.g:4913:2: ( ruleDataField )
            {
            // InternalDataDsl.g:4913:2: ( ruleDataField )
            // InternalDataDsl.g:4914:3: ruleDataField
            {
             before(grammarAccess.getDataStructureAccess().getDataFieldsDataFieldParserRuleCall_5_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataField();

            state._fsp--;

             after(grammarAccess.getDataStructureAccess().getDataFieldsDataFieldParserRuleCall_5_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__DataFieldsAssignment_5_0_0"


    // $ANTLR start "rule__DataStructure__OperationsAssignment_5_0_1"
    // InternalDataDsl.g:4923:1: rule__DataStructure__OperationsAssignment_5_0_1 : ( ruleDataOperation ) ;
    public final void rule__DataStructure__OperationsAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4927:1: ( ( ruleDataOperation ) )
            // InternalDataDsl.g:4928:2: ( ruleDataOperation )
            {
            // InternalDataDsl.g:4928:2: ( ruleDataOperation )
            // InternalDataDsl.g:4929:3: ruleDataOperation
            {
             before(grammarAccess.getDataStructureAccess().getOperationsDataOperationParserRuleCall_5_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataOperation();

            state._fsp--;

             after(grammarAccess.getDataStructureAccess().getOperationsDataOperationParserRuleCall_5_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__OperationsAssignment_5_0_1"


    // $ANTLR start "rule__DataStructure__DataFieldsAssignment_5_1_1_0"
    // InternalDataDsl.g:4938:1: rule__DataStructure__DataFieldsAssignment_5_1_1_0 : ( ruleDataField ) ;
    public final void rule__DataStructure__DataFieldsAssignment_5_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4942:1: ( ( ruleDataField ) )
            // InternalDataDsl.g:4943:2: ( ruleDataField )
            {
            // InternalDataDsl.g:4943:2: ( ruleDataField )
            // InternalDataDsl.g:4944:3: ruleDataField
            {
             before(grammarAccess.getDataStructureAccess().getDataFieldsDataFieldParserRuleCall_5_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataField();

            state._fsp--;

             after(grammarAccess.getDataStructureAccess().getDataFieldsDataFieldParserRuleCall_5_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__DataFieldsAssignment_5_1_1_0"


    // $ANTLR start "rule__DataStructure__OperationsAssignment_5_1_1_1"
    // InternalDataDsl.g:4953:1: rule__DataStructure__OperationsAssignment_5_1_1_1 : ( ruleDataOperation ) ;
    public final void rule__DataStructure__OperationsAssignment_5_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4957:1: ( ( ruleDataOperation ) )
            // InternalDataDsl.g:4958:2: ( ruleDataOperation )
            {
            // InternalDataDsl.g:4958:2: ( ruleDataOperation )
            // InternalDataDsl.g:4959:3: ruleDataOperation
            {
             before(grammarAccess.getDataStructureAccess().getOperationsDataOperationParserRuleCall_5_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataOperation();

            state._fsp--;

             after(grammarAccess.getDataStructureAccess().getOperationsDataOperationParserRuleCall_5_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataStructure__OperationsAssignment_5_1_1_1"


    // $ANTLR start "rule__ListType__NameAssignment_0_1"
    // InternalDataDsl.g:4968:1: rule__ListType__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__ListType__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4972:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:4973:2: ( RULE_ID )
            {
            // InternalDataDsl.g:4973:2: ( RULE_ID )
            // InternalDataDsl.g:4974:3: RULE_ID
            {
             before(grammarAccess.getListTypeAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListTypeAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__NameAssignment_0_1"


    // $ANTLR start "rule__ListType__DataFieldsAssignment_0_3"
    // InternalDataDsl.g:4983:1: rule__ListType__DataFieldsAssignment_0_3 : ( ruleDataField ) ;
    public final void rule__ListType__DataFieldsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4987:1: ( ( ruleDataField ) )
            // InternalDataDsl.g:4988:2: ( ruleDataField )
            {
            // InternalDataDsl.g:4988:2: ( ruleDataField )
            // InternalDataDsl.g:4989:3: ruleDataField
            {
             before(grammarAccess.getListTypeAccess().getDataFieldsDataFieldParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataField();

            state._fsp--;

             after(grammarAccess.getListTypeAccess().getDataFieldsDataFieldParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__DataFieldsAssignment_0_3"


    // $ANTLR start "rule__ListType__DataFieldsAssignment_0_4_1"
    // InternalDataDsl.g:4998:1: rule__ListType__DataFieldsAssignment_0_4_1 : ( ruleDataField ) ;
    public final void rule__ListType__DataFieldsAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5002:1: ( ( ruleDataField ) )
            // InternalDataDsl.g:5003:2: ( ruleDataField )
            {
            // InternalDataDsl.g:5003:2: ( ruleDataField )
            // InternalDataDsl.g:5004:3: ruleDataField
            {
             before(grammarAccess.getListTypeAccess().getDataFieldsDataFieldParserRuleCall_0_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataField();

            state._fsp--;

             after(grammarAccess.getListTypeAccess().getDataFieldsDataFieldParserRuleCall_0_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__DataFieldsAssignment_0_4_1"


    // $ANTLR start "rule__ListType__NameAssignment_1_1"
    // InternalDataDsl.g:5013:1: rule__ListType__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__ListType__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5017:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:5018:2: ( RULE_ID )
            {
            // InternalDataDsl.g:5018:2: ( RULE_ID )
            // InternalDataDsl.g:5019:3: RULE_ID
            {
             before(grammarAccess.getListTypeAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getListTypeAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__NameAssignment_1_1"


    // $ANTLR start "rule__ListType__PrimitiveTypeAssignment_1_3"
    // InternalDataDsl.g:5028:1: rule__ListType__PrimitiveTypeAssignment_1_3 : ( rulePrimitiveType ) ;
    public final void rule__ListType__PrimitiveTypeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5032:1: ( ( rulePrimitiveType ) )
            // InternalDataDsl.g:5033:2: ( rulePrimitiveType )
            {
            // InternalDataDsl.g:5033:2: ( rulePrimitiveType )
            // InternalDataDsl.g:5034:3: rulePrimitiveType
            {
             before(grammarAccess.getListTypeAccess().getPrimitiveTypePrimitiveTypeParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getListTypeAccess().getPrimitiveTypePrimitiveTypeParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListType__PrimitiveTypeAssignment_1_3"


    // $ANTLR start "rule__DataField__HiddenAssignment_0"
    // InternalDataDsl.g:5043:1: rule__DataField__HiddenAssignment_0 : ( ( 'hide' ) ) ;
    public final void rule__DataField__HiddenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5047:1: ( ( ( 'hide' ) ) )
            // InternalDataDsl.g:5048:2: ( ( 'hide' ) )
            {
            // InternalDataDsl.g:5048:2: ( ( 'hide' ) )
            // InternalDataDsl.g:5049:3: ( 'hide' )
            {
             before(grammarAccess.getDataFieldAccess().getHiddenHideKeyword_0_0()); 
            // InternalDataDsl.g:5050:3: ( 'hide' )
            // InternalDataDsl.g:5051:4: 'hide'
            {
             before(grammarAccess.getDataFieldAccess().getHiddenHideKeyword_0_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getDataFieldAccess().getHiddenHideKeyword_0_0()); 

            }

             after(grammarAccess.getDataFieldAccess().getHiddenHideKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__HiddenAssignment_0"


    // $ANTLR start "rule__DataField__ImmutableAssignment_1"
    // InternalDataDsl.g:5062:1: rule__DataField__ImmutableAssignment_1 : ( ( 'immutable' ) ) ;
    public final void rule__DataField__ImmutableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5066:1: ( ( ( 'immutable' ) ) )
            // InternalDataDsl.g:5067:2: ( ( 'immutable' ) )
            {
            // InternalDataDsl.g:5067:2: ( ( 'immutable' ) )
            // InternalDataDsl.g:5068:3: ( 'immutable' )
            {
             before(grammarAccess.getDataFieldAccess().getImmutableImmutableKeyword_1_0()); 
            // InternalDataDsl.g:5069:3: ( 'immutable' )
            // InternalDataDsl.g:5070:4: 'immutable'
            {
             before(grammarAccess.getDataFieldAccess().getImmutableImmutableKeyword_1_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getDataFieldAccess().getImmutableImmutableKeyword_1_0()); 

            }

             after(grammarAccess.getDataFieldAccess().getImmutableImmutableKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__ImmutableAssignment_1"


    // $ANTLR start "rule__DataField__PrimitiveTypeAssignment_2_0"
    // InternalDataDsl.g:5081:1: rule__DataField__PrimitiveTypeAssignment_2_0 : ( rulePrimitiveType ) ;
    public final void rule__DataField__PrimitiveTypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5085:1: ( ( rulePrimitiveType ) )
            // InternalDataDsl.g:5086:2: ( rulePrimitiveType )
            {
            // InternalDataDsl.g:5086:2: ( rulePrimitiveType )
            // InternalDataDsl.g:5087:3: rulePrimitiveType
            {
             before(grammarAccess.getDataFieldAccess().getPrimitiveTypePrimitiveTypeParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getDataFieldAccess().getPrimitiveTypePrimitiveTypeParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__PrimitiveTypeAssignment_2_0"


    // $ANTLR start "rule__DataField__ComplexTypeAssignment_2_1"
    // InternalDataDsl.g:5096:1: rule__DataField__ComplexTypeAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DataField__ComplexTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5100:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:5101:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:5101:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:5102:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDataFieldAccess().getComplexTypeComplexTypeCrossReference_2_1_0()); 
            // InternalDataDsl.g:5103:3: ( ruleQualifiedName )
            // InternalDataDsl.g:5104:4: ruleQualifiedName
            {
             before(grammarAccess.getDataFieldAccess().getComplexTypeComplexTypeQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDataFieldAccess().getComplexTypeComplexTypeQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getDataFieldAccess().getComplexTypeComplexTypeCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__ComplexTypeAssignment_2_1"


    // $ANTLR start "rule__DataField__ImportedComplexTypeAssignment_2_2"
    // InternalDataDsl.g:5115:1: rule__DataField__ImportedComplexTypeAssignment_2_2 : ( ruleImportedComplexType ) ;
    public final void rule__DataField__ImportedComplexTypeAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5119:1: ( ( ruleImportedComplexType ) )
            // InternalDataDsl.g:5120:2: ( ruleImportedComplexType )
            {
            // InternalDataDsl.g:5120:2: ( ruleImportedComplexType )
            // InternalDataDsl.g:5121:3: ruleImportedComplexType
            {
             before(grammarAccess.getDataFieldAccess().getImportedComplexTypeImportedComplexTypeParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImportedComplexType();

            state._fsp--;

             after(grammarAccess.getDataFieldAccess().getImportedComplexTypeImportedComplexTypeParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__ImportedComplexTypeAssignment_2_2"


    // $ANTLR start "rule__DataField__NameAssignment_3"
    // InternalDataDsl.g:5130:1: rule__DataField__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__DataField__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5134:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:5135:2: ( RULE_ID )
            {
            // InternalDataDsl.g:5135:2: ( RULE_ID )
            // InternalDataDsl.g:5136:3: RULE_ID
            {
             before(grammarAccess.getDataFieldAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataFieldAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__NameAssignment_3"


    // $ANTLR start "rule__DataField__InitializationValueAssignment_4_1"
    // InternalDataDsl.g:5145:1: rule__DataField__InitializationValueAssignment_4_1 : ( rulePrimitiveValue ) ;
    public final void rule__DataField__InitializationValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5149:1: ( ( rulePrimitiveValue ) )
            // InternalDataDsl.g:5150:2: ( rulePrimitiveValue )
            {
            // InternalDataDsl.g:5150:2: ( rulePrimitiveValue )
            // InternalDataDsl.g:5151:3: rulePrimitiveValue
            {
             before(grammarAccess.getDataFieldAccess().getInitializationValuePrimitiveValueParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveValue();

            state._fsp--;

             after(grammarAccess.getDataFieldAccess().getInitializationValuePrimitiveValueParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__InitializationValueAssignment_4_1"


    // $ANTLR start "rule__DataField__FeaturesAssignment_5_1"
    // InternalDataDsl.g:5160:1: rule__DataField__FeaturesAssignment_5_1 : ( ruleDataFieldFeature ) ;
    public final void rule__DataField__FeaturesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5164:1: ( ( ruleDataFieldFeature ) )
            // InternalDataDsl.g:5165:2: ( ruleDataFieldFeature )
            {
            // InternalDataDsl.g:5165:2: ( ruleDataFieldFeature )
            // InternalDataDsl.g:5166:3: ruleDataFieldFeature
            {
             before(grammarAccess.getDataFieldAccess().getFeaturesDataFieldFeatureEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataFieldFeature();

            state._fsp--;

             after(grammarAccess.getDataFieldAccess().getFeaturesDataFieldFeatureEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__FeaturesAssignment_5_1"


    // $ANTLR start "rule__DataField__FeaturesAssignment_5_2_1"
    // InternalDataDsl.g:5175:1: rule__DataField__FeaturesAssignment_5_2_1 : ( ruleDataFieldFeature ) ;
    public final void rule__DataField__FeaturesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5179:1: ( ( ruleDataFieldFeature ) )
            // InternalDataDsl.g:5180:2: ( ruleDataFieldFeature )
            {
            // InternalDataDsl.g:5180:2: ( ruleDataFieldFeature )
            // InternalDataDsl.g:5181:3: ruleDataFieldFeature
            {
             before(grammarAccess.getDataFieldAccess().getFeaturesDataFieldFeatureEnumRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataFieldFeature();

            state._fsp--;

             after(grammarAccess.getDataFieldAccess().getFeaturesDataFieldFeatureEnumRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__FeaturesAssignment_5_2_1"


    // $ANTLR start "rule__Enumeration__NameAssignment_1"
    // InternalDataDsl.g:5190:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5194:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:5195:2: ( RULE_ID )
            {
            // InternalDataDsl.g:5195:2: ( RULE_ID )
            // InternalDataDsl.g:5196:3: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__NameAssignment_1"


    // $ANTLR start "rule__Enumeration__FeaturesAssignment_2_1"
    // InternalDataDsl.g:5205:1: rule__Enumeration__FeaturesAssignment_2_1 : ( ruleComplexTypeFeature ) ;
    public final void rule__Enumeration__FeaturesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5209:1: ( ( ruleComplexTypeFeature ) )
            // InternalDataDsl.g:5210:2: ( ruleComplexTypeFeature )
            {
            // InternalDataDsl.g:5210:2: ( ruleComplexTypeFeature )
            // InternalDataDsl.g:5211:3: ruleComplexTypeFeature
            {
             before(grammarAccess.getEnumerationAccess().getFeaturesComplexTypeFeatureEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexTypeFeature();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getFeaturesComplexTypeFeatureEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__FeaturesAssignment_2_1"


    // $ANTLR start "rule__Enumeration__FeaturesAssignment_2_2_1"
    // InternalDataDsl.g:5220:1: rule__Enumeration__FeaturesAssignment_2_2_1 : ( ruleComplexTypeFeature ) ;
    public final void rule__Enumeration__FeaturesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5224:1: ( ( ruleComplexTypeFeature ) )
            // InternalDataDsl.g:5225:2: ( ruleComplexTypeFeature )
            {
            // InternalDataDsl.g:5225:2: ( ruleComplexTypeFeature )
            // InternalDataDsl.g:5226:3: ruleComplexTypeFeature
            {
             before(grammarAccess.getEnumerationAccess().getFeaturesComplexTypeFeatureEnumRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexTypeFeature();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getFeaturesComplexTypeFeatureEnumRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__FeaturesAssignment_2_2_1"


    // $ANTLR start "rule__Enumeration__FieldsAssignment_4"
    // InternalDataDsl.g:5235:1: rule__Enumeration__FieldsAssignment_4 : ( ruleEnumerationField ) ;
    public final void rule__Enumeration__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5239:1: ( ( ruleEnumerationField ) )
            // InternalDataDsl.g:5240:2: ( ruleEnumerationField )
            {
            // InternalDataDsl.g:5240:2: ( ruleEnumerationField )
            // InternalDataDsl.g:5241:3: ruleEnumerationField
            {
             before(grammarAccess.getEnumerationAccess().getFieldsEnumerationFieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationField();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getFieldsEnumerationFieldParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__FieldsAssignment_4"


    // $ANTLR start "rule__Enumeration__FieldsAssignment_5_1"
    // InternalDataDsl.g:5250:1: rule__Enumeration__FieldsAssignment_5_1 : ( ruleEnumerationField ) ;
    public final void rule__Enumeration__FieldsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5254:1: ( ( ruleEnumerationField ) )
            // InternalDataDsl.g:5255:2: ( ruleEnumerationField )
            {
            // InternalDataDsl.g:5255:2: ( ruleEnumerationField )
            // InternalDataDsl.g:5256:3: ruleEnumerationField
            {
             before(grammarAccess.getEnumerationAccess().getFieldsEnumerationFieldParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationField();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getFieldsEnumerationFieldParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__FieldsAssignment_5_1"


    // $ANTLR start "rule__EnumerationField__NameAssignment_0"
    // InternalDataDsl.g:5265:1: rule__EnumerationField__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationField__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5269:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:5270:2: ( RULE_ID )
            {
            // InternalDataDsl.g:5270:2: ( RULE_ID )
            // InternalDataDsl.g:5271:3: RULE_ID
            {
             before(grammarAccess.getEnumerationFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumerationFieldAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationField__NameAssignment_0"


    // $ANTLR start "rule__EnumerationField__InitializationValueAssignment_1_1"
    // InternalDataDsl.g:5280:1: rule__EnumerationField__InitializationValueAssignment_1_1 : ( rulePrimitiveValue ) ;
    public final void rule__EnumerationField__InitializationValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5284:1: ( ( rulePrimitiveValue ) )
            // InternalDataDsl.g:5285:2: ( rulePrimitiveValue )
            {
            // InternalDataDsl.g:5285:2: ( rulePrimitiveValue )
            // InternalDataDsl.g:5286:3: rulePrimitiveValue
            {
             before(grammarAccess.getEnumerationFieldAccess().getInitializationValuePrimitiveValueParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveValue();

            state._fsp--;

             after(grammarAccess.getEnumerationFieldAccess().getInitializationValuePrimitiveValueParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationField__InitializationValueAssignment_1_1"


    // $ANTLR start "rule__DataOperation__HiddenAssignment_0"
    // InternalDataDsl.g:5295:1: rule__DataOperation__HiddenAssignment_0 : ( ( 'hide' ) ) ;
    public final void rule__DataOperation__HiddenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5299:1: ( ( ( 'hide' ) ) )
            // InternalDataDsl.g:5300:2: ( ( 'hide' ) )
            {
            // InternalDataDsl.g:5300:2: ( ( 'hide' ) )
            // InternalDataDsl.g:5301:3: ( 'hide' )
            {
             before(grammarAccess.getDataOperationAccess().getHiddenHideKeyword_0_0()); 
            // InternalDataDsl.g:5302:3: ( 'hide' )
            // InternalDataDsl.g:5303:4: 'hide'
            {
             before(grammarAccess.getDataOperationAccess().getHiddenHideKeyword_0_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getDataOperationAccess().getHiddenHideKeyword_0_0()); 

            }

             after(grammarAccess.getDataOperationAccess().getHiddenHideKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__HiddenAssignment_0"


    // $ANTLR start "rule__DataOperation__HasNoReturnTypeAssignment_1_0"
    // InternalDataDsl.g:5314:1: rule__DataOperation__HasNoReturnTypeAssignment_1_0 : ( ( 'procedure' ) ) ;
    public final void rule__DataOperation__HasNoReturnTypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5318:1: ( ( ( 'procedure' ) ) )
            // InternalDataDsl.g:5319:2: ( ( 'procedure' ) )
            {
            // InternalDataDsl.g:5319:2: ( ( 'procedure' ) )
            // InternalDataDsl.g:5320:3: ( 'procedure' )
            {
             before(grammarAccess.getDataOperationAccess().getHasNoReturnTypeProcedureKeyword_1_0_0()); 
            // InternalDataDsl.g:5321:3: ( 'procedure' )
            // InternalDataDsl.g:5322:4: 'procedure'
            {
             before(grammarAccess.getDataOperationAccess().getHasNoReturnTypeProcedureKeyword_1_0_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getDataOperationAccess().getHasNoReturnTypeProcedureKeyword_1_0_0()); 

            }

             after(grammarAccess.getDataOperationAccess().getHasNoReturnTypeProcedureKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__HasNoReturnTypeAssignment_1_0"


    // $ANTLR start "rule__DataOperation__PrimitiveReturnTypeAssignment_1_1_1_0"
    // InternalDataDsl.g:5333:1: rule__DataOperation__PrimitiveReturnTypeAssignment_1_1_1_0 : ( rulePrimitiveType ) ;
    public final void rule__DataOperation__PrimitiveReturnTypeAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5337:1: ( ( rulePrimitiveType ) )
            // InternalDataDsl.g:5338:2: ( rulePrimitiveType )
            {
            // InternalDataDsl.g:5338:2: ( rulePrimitiveType )
            // InternalDataDsl.g:5339:3: rulePrimitiveType
            {
             before(grammarAccess.getDataOperationAccess().getPrimitiveReturnTypePrimitiveTypeParserRuleCall_1_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getDataOperationAccess().getPrimitiveReturnTypePrimitiveTypeParserRuleCall_1_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__PrimitiveReturnTypeAssignment_1_1_1_0"


    // $ANTLR start "rule__DataOperation__ComplexReturnTypeAssignment_1_1_1_1"
    // InternalDataDsl.g:5348:1: rule__DataOperation__ComplexReturnTypeAssignment_1_1_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DataOperation__ComplexReturnTypeAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5352:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:5353:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:5353:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:5354:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDataOperationAccess().getComplexReturnTypeComplexTypeCrossReference_1_1_1_1_0()); 
            // InternalDataDsl.g:5355:3: ( ruleQualifiedName )
            // InternalDataDsl.g:5356:4: ruleQualifiedName
            {
             before(grammarAccess.getDataOperationAccess().getComplexReturnTypeComplexTypeQualifiedNameParserRuleCall_1_1_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDataOperationAccess().getComplexReturnTypeComplexTypeQualifiedNameParserRuleCall_1_1_1_1_0_1()); 

            }

             after(grammarAccess.getDataOperationAccess().getComplexReturnTypeComplexTypeCrossReference_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__ComplexReturnTypeAssignment_1_1_1_1"


    // $ANTLR start "rule__DataOperation__ImportedComplexReturnTypeAssignment_1_1_1_2"
    // InternalDataDsl.g:5367:1: rule__DataOperation__ImportedComplexReturnTypeAssignment_1_1_1_2 : ( ruleImportedComplexType ) ;
    public final void rule__DataOperation__ImportedComplexReturnTypeAssignment_1_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5371:1: ( ( ruleImportedComplexType ) )
            // InternalDataDsl.g:5372:2: ( ruleImportedComplexType )
            {
            // InternalDataDsl.g:5372:2: ( ruleImportedComplexType )
            // InternalDataDsl.g:5373:3: ruleImportedComplexType
            {
             before(grammarAccess.getDataOperationAccess().getImportedComplexReturnTypeImportedComplexTypeParserRuleCall_1_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImportedComplexType();

            state._fsp--;

             after(grammarAccess.getDataOperationAccess().getImportedComplexReturnTypeImportedComplexTypeParserRuleCall_1_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__ImportedComplexReturnTypeAssignment_1_1_1_2"


    // $ANTLR start "rule__DataOperation__NameAssignment_2"
    // InternalDataDsl.g:5382:1: rule__DataOperation__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataOperation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5386:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:5387:2: ( RULE_ID )
            {
            // InternalDataDsl.g:5387:2: ( RULE_ID )
            // InternalDataDsl.g:5388:3: RULE_ID
            {
             before(grammarAccess.getDataOperationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataOperationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__NameAssignment_2"


    // $ANTLR start "rule__DataOperation__ParametersAssignment_3_1"
    // InternalDataDsl.g:5397:1: rule__DataOperation__ParametersAssignment_3_1 : ( ruleDataOperationParameter ) ;
    public final void rule__DataOperation__ParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5401:1: ( ( ruleDataOperationParameter ) )
            // InternalDataDsl.g:5402:2: ( ruleDataOperationParameter )
            {
            // InternalDataDsl.g:5402:2: ( ruleDataOperationParameter )
            // InternalDataDsl.g:5403:3: ruleDataOperationParameter
            {
             before(grammarAccess.getDataOperationAccess().getParametersDataOperationParameterParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataOperationParameter();

            state._fsp--;

             after(grammarAccess.getDataOperationAccess().getParametersDataOperationParameterParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__ParametersAssignment_3_1"


    // $ANTLR start "rule__DataOperation__ParametersAssignment_3_2_1"
    // InternalDataDsl.g:5412:1: rule__DataOperation__ParametersAssignment_3_2_1 : ( ruleDataOperationParameter ) ;
    public final void rule__DataOperation__ParametersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5416:1: ( ( ruleDataOperationParameter ) )
            // InternalDataDsl.g:5417:2: ( ruleDataOperationParameter )
            {
            // InternalDataDsl.g:5417:2: ( ruleDataOperationParameter )
            // InternalDataDsl.g:5418:3: ruleDataOperationParameter
            {
             before(grammarAccess.getDataOperationAccess().getParametersDataOperationParameterParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataOperationParameter();

            state._fsp--;

             after(grammarAccess.getDataOperationAccess().getParametersDataOperationParameterParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__ParametersAssignment_3_2_1"


    // $ANTLR start "rule__DataOperation__FeaturesAssignment_4_1"
    // InternalDataDsl.g:5427:1: rule__DataOperation__FeaturesAssignment_4_1 : ( ruleDataOperationFeature ) ;
    public final void rule__DataOperation__FeaturesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5431:1: ( ( ruleDataOperationFeature ) )
            // InternalDataDsl.g:5432:2: ( ruleDataOperationFeature )
            {
            // InternalDataDsl.g:5432:2: ( ruleDataOperationFeature )
            // InternalDataDsl.g:5433:3: ruleDataOperationFeature
            {
             before(grammarAccess.getDataOperationAccess().getFeaturesDataOperationFeatureEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataOperationFeature();

            state._fsp--;

             after(grammarAccess.getDataOperationAccess().getFeaturesDataOperationFeatureEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__FeaturesAssignment_4_1"


    // $ANTLR start "rule__DataOperation__FeaturesAssignment_4_2_1"
    // InternalDataDsl.g:5442:1: rule__DataOperation__FeaturesAssignment_4_2_1 : ( ruleDataOperationFeature ) ;
    public final void rule__DataOperation__FeaturesAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5446:1: ( ( ruleDataOperationFeature ) )
            // InternalDataDsl.g:5447:2: ( ruleDataOperationFeature )
            {
            // InternalDataDsl.g:5447:2: ( ruleDataOperationFeature )
            // InternalDataDsl.g:5448:3: ruleDataOperationFeature
            {
             before(grammarAccess.getDataOperationAccess().getFeaturesDataOperationFeatureEnumRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataOperationFeature();

            state._fsp--;

             after(grammarAccess.getDataOperationAccess().getFeaturesDataOperationFeatureEnumRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperation__FeaturesAssignment_4_2_1"


    // $ANTLR start "rule__DataOperationParameter__PrimitiveTypeAssignment_0_0"
    // InternalDataDsl.g:5457:1: rule__DataOperationParameter__PrimitiveTypeAssignment_0_0 : ( rulePrimitiveType ) ;
    public final void rule__DataOperationParameter__PrimitiveTypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5461:1: ( ( rulePrimitiveType ) )
            // InternalDataDsl.g:5462:2: ( rulePrimitiveType )
            {
            // InternalDataDsl.g:5462:2: ( rulePrimitiveType )
            // InternalDataDsl.g:5463:3: rulePrimitiveType
            {
             before(grammarAccess.getDataOperationParameterAccess().getPrimitiveTypePrimitiveTypeParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getDataOperationParameterAccess().getPrimitiveTypePrimitiveTypeParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperationParameter__PrimitiveTypeAssignment_0_0"


    // $ANTLR start "rule__DataOperationParameter__ComplexTypeAssignment_0_1"
    // InternalDataDsl.g:5472:1: rule__DataOperationParameter__ComplexTypeAssignment_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DataOperationParameter__ComplexTypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5476:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:5477:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:5477:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:5478:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDataOperationParameterAccess().getComplexTypeComplexTypeCrossReference_0_1_0()); 
            // InternalDataDsl.g:5479:3: ( ruleQualifiedName )
            // InternalDataDsl.g:5480:4: ruleQualifiedName
            {
             before(grammarAccess.getDataOperationParameterAccess().getComplexTypeComplexTypeQualifiedNameParserRuleCall_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDataOperationParameterAccess().getComplexTypeComplexTypeQualifiedNameParserRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getDataOperationParameterAccess().getComplexTypeComplexTypeCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperationParameter__ComplexTypeAssignment_0_1"


    // $ANTLR start "rule__DataOperationParameter__ImportedComplexTypeAssignment_0_2"
    // InternalDataDsl.g:5491:1: rule__DataOperationParameter__ImportedComplexTypeAssignment_0_2 : ( ruleImportedComplexType ) ;
    public final void rule__DataOperationParameter__ImportedComplexTypeAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5495:1: ( ( ruleImportedComplexType ) )
            // InternalDataDsl.g:5496:2: ( ruleImportedComplexType )
            {
            // InternalDataDsl.g:5496:2: ( ruleImportedComplexType )
            // InternalDataDsl.g:5497:3: ruleImportedComplexType
            {
             before(grammarAccess.getDataOperationParameterAccess().getImportedComplexTypeImportedComplexTypeParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleImportedComplexType();

            state._fsp--;

             after(grammarAccess.getDataOperationParameterAccess().getImportedComplexTypeImportedComplexTypeParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperationParameter__ImportedComplexTypeAssignment_0_2"


    // $ANTLR start "rule__DataOperationParameter__NameAssignment_1"
    // InternalDataDsl.g:5506:1: rule__DataOperationParameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataOperationParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5510:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:5511:2: ( RULE_ID )
            {
            // InternalDataDsl.g:5511:2: ( RULE_ID )
            // InternalDataDsl.g:5512:3: RULE_ID
            {
             before(grammarAccess.getDataOperationParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataOperationParameterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOperationParameter__NameAssignment_1"


    // $ANTLR start "rule__PrimitiveValue__NumericValueAssignment_0"
    // InternalDataDsl.g:5521:1: rule__PrimitiveValue__NumericValueAssignment_0 : ( RULE_BIG_DECIMAL ) ;
    public final void rule__PrimitiveValue__NumericValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5525:1: ( ( RULE_BIG_DECIMAL ) )
            // InternalDataDsl.g:5526:2: ( RULE_BIG_DECIMAL )
            {
            // InternalDataDsl.g:5526:2: ( RULE_BIG_DECIMAL )
            // InternalDataDsl.g:5527:3: RULE_BIG_DECIMAL
            {
             before(grammarAccess.getPrimitiveValueAccess().getNumericValueBIG_DECIMALTerminalRuleCall_0_0()); 
            match(input,RULE_BIG_DECIMAL,FOLLOW_2); 
             after(grammarAccess.getPrimitiveValueAccess().getNumericValueBIG_DECIMALTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveValue__NumericValueAssignment_0"


    // $ANTLR start "rule__PrimitiveValue__BooleanValueAssignment_1"
    // InternalDataDsl.g:5536:1: rule__PrimitiveValue__BooleanValueAssignment_1 : ( RULE_BOOLEAN ) ;
    public final void rule__PrimitiveValue__BooleanValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5540:1: ( ( RULE_BOOLEAN ) )
            // InternalDataDsl.g:5541:2: ( RULE_BOOLEAN )
            {
            // InternalDataDsl.g:5541:2: ( RULE_BOOLEAN )
            // InternalDataDsl.g:5542:3: RULE_BOOLEAN
            {
             before(grammarAccess.getPrimitiveValueAccess().getBooleanValueBOOLEANTerminalRuleCall_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getPrimitiveValueAccess().getBooleanValueBOOLEANTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveValue__BooleanValueAssignment_1"


    // $ANTLR start "rule__PrimitiveValue__StringValueAssignment_2"
    // InternalDataDsl.g:5551:1: rule__PrimitiveValue__StringValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PrimitiveValue__StringValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5555:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:5556:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:5556:2: ( RULE_STRING )
            // InternalDataDsl.g:5557:3: RULE_STRING
            {
             before(grammarAccess.getPrimitiveValueAccess().getStringValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrimitiveValueAccess().getStringValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveValue__StringValueAssignment_2"


    // $ANTLR start "rule__ImportedComplexType__ImportAssignment_0"
    // InternalDataDsl.g:5566:1: rule__ImportedComplexType__ImportAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ImportedComplexType__ImportAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5570:1: ( ( ( RULE_ID ) ) )
            // InternalDataDsl.g:5571:2: ( ( RULE_ID ) )
            {
            // InternalDataDsl.g:5571:2: ( ( RULE_ID ) )
            // InternalDataDsl.g:5572:3: ( RULE_ID )
            {
             before(grammarAccess.getImportedComplexTypeAccess().getImportComplexTypeImportCrossReference_0_0()); 
            // InternalDataDsl.g:5573:3: ( RULE_ID )
            // InternalDataDsl.g:5574:4: RULE_ID
            {
             before(grammarAccess.getImportedComplexTypeAccess().getImportComplexTypeImportIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getImportedComplexTypeAccess().getImportComplexTypeImportIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getImportedComplexTypeAccess().getImportComplexTypeImportCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedComplexType__ImportAssignment_0"


    // $ANTLR start "rule__ImportedComplexType__ImportedTypeAssignment_2"
    // InternalDataDsl.g:5585:1: rule__ImportedComplexType__ImportedTypeAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ImportedComplexType__ImportedTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5589:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:5590:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:5590:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:5591:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getImportedComplexTypeAccess().getImportedTypeTypeCrossReference_2_0()); 
            // InternalDataDsl.g:5592:3: ( ruleQualifiedName )
            // InternalDataDsl.g:5593:4: ruleQualifiedName
            {
             before(grammarAccess.getImportedComplexTypeAccess().getImportedTypeTypeQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getImportedComplexTypeAccess().getImportedTypeTypeQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getImportedComplexTypeAccess().getImportedTypeTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportedComplexType__ImportedTypeAssignment_2"

    // Delegated rules


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\15\2\4\1\45\14\4\2\uffff";
    static final String dfa_3s = "\1\16\2\4\1\45\1\100\13\46\2\uffff";
    static final String dfa_4s = "\20\uffff\1\1\1\2";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2",
            "\1\3",
            "\1\3",
            "\1\4",
            "\1\20\56\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\uffff\2\20",
            "\1\20\41\uffff\1\21",
            "\1\20\41\uffff\1\21",
            "\1\20\41\uffff\1\21",
            "\1\20\41\uffff\1\21",
            "\1\20\41\uffff\1\21",
            "\1\20\41\uffff\1\21",
            "\1\20\41\uffff\1\21",
            "\1\20\41\uffff\1\21",
            "\1\20\41\uffff\1\21",
            "\1\20\41\uffff\1\21",
            "\1\20\41\uffff\1\21",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "652:1: rule__ListType__Alternatives : ( ( ( rule__ListType__Group_0__0 ) ) | ( ( rule__ListType__Group_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000410000006002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000419000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000041C000006000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000410000006000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000122000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xBFFA004000000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003FF8000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xBFFA000000000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0xBFF8000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x3FF8000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000220000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000022000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x3FF8000000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x3FF9080000000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000000E4000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x4000000000000002L});

}