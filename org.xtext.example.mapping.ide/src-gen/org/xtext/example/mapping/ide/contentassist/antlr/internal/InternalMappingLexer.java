package org.xtext.example.mapping.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMappingLexer extends Lexer {
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

    public InternalMappingLexer() {;} 
    public InternalMappingLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMappingLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMapping.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:11:7: ( 'source' )
            // InternalMapping.g:11:9: 'source'
            {
            match("source"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:12:7: ( 'target' )
            // InternalMapping.g:12:9: 'target'
            {
            match("target"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:13:7: ( 'assign' )
            // InternalMapping.g:13:9: 'assign'
            {
            match("assign"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:14:7: ( 'add' )
            // InternalMapping.g:14:9: 'add'
            {
            match("add"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:15:7: ( 'MappingModel' )
            // InternalMapping.g:15:9: 'MappingModel'
            {
            match("MappingModel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:16:7: ( 'SourceMetamodels' )
            // InternalMapping.g:16:9: 'SourceMetamodels'
            {
            match("SourceMetamodels"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:17:7: ( '{' )
            // InternalMapping.g:17:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:18:7: ( '}' )
            // InternalMapping.g:18:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:19:7: ( 'TargetMetamodels' )
            // InternalMapping.g:19:9: 'TargetMetamodels'
            {
            match("TargetMetamodels"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:20:7: ( ',' )
            // InternalMapping.g:20:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:21:7: ( 'MainSourceMetamodel' )
            // InternalMapping.g:21:9: 'MainSourceMetamodel'
            {
            match("MainSourceMetamodel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:22:7: ( 'MappingRules' )
            // InternalMapping.g:22:9: 'MappingRules'
            {
            match("MappingRules"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:23:7: ( ';' )
            // InternalMapping.g:23:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:24:7: ( 'MappingRule' )
            // InternalMapping.g:24:9: 'MappingRule'
            {
            match("MappingRule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:25:7: ( 'identifier' )
            // InternalMapping.g:25:9: 'identifier'
            {
            match("identifier"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:26:7: ( '::' )
            // InternalMapping.g:26:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:27:7: ( 'operator' )
            // InternalMapping.g:27:9: 'operator'
            {
            match("operator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:28:7: ( 'condition' )
            // InternalMapping.g:28:9: 'condition'
            {
            match("condition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:29:7: ( 'comment' )
            // InternalMapping.g:29:9: 'comment'
            {
            match("comment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:30:7: ( 'HelperStatement' )
            // InternalMapping.g:30:9: 'HelperStatement'
            {
            match("HelperStatement"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:31:7: ( 'statement' )
            // InternalMapping.g:31:9: 'statement'
            {
            match("statement"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:32:7: ( '.' )
            // InternalMapping.g:32:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:33:7: ( 'var' )
            // InternalMapping.g:33:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:3646:13: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalMapping.g:3646:15: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalMapping.g:3646:19: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMapping.g:3646:20: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalMapping.g:3646:27: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:3648:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMapping.g:3648:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMapping.g:3648:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMapping.g:3648:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMapping.g:3648:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMapping.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:3650:10: ( ( '0' .. '9' )+ )
            // InternalMapping.g:3650:12: ( '0' .. '9' )+
            {
            // InternalMapping.g:3650:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMapping.g:3650:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:3652:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMapping.g:3652:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMapping.g:3652:24: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMapping.g:3652:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:3654:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMapping.g:3654:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMapping.g:3654:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMapping.g:3654:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalMapping.g:3654:40: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMapping.g:3654:41: ( '\\r' )? '\\n'
                    {
                    // InternalMapping.g:3654:41: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMapping.g:3654:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:3656:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMapping.g:3656:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMapping.g:3656:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMapping.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMapping.g:3658:16: ( . )
            // InternalMapping.g:3658:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMapping.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt10=30;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // InternalMapping.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalMapping.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalMapping.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalMapping.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalMapping.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalMapping.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalMapping.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalMapping.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalMapping.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalMapping.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalMapping.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalMapping.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalMapping.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalMapping.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalMapping.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalMapping.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalMapping.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalMapping.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalMapping.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalMapping.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalMapping.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalMapping.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalMapping.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalMapping.g:1:148: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // InternalMapping.g:1:160: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 26 :
                // InternalMapping.g:1:168: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 27 :
                // InternalMapping.g:1:177: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 28 :
                // InternalMapping.g:1:193: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // InternalMapping.g:1:209: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // InternalMapping.g:1:217: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\5\33\2\uffff\1\33\2\uffff\1\33\1\30\3\33\1\uffff\1\33\2\30\2\uffff\1\30\2\uffff\2\33\1\uffff\5\33\2\uffff\1\33\2\uffff\1\33\1\uffff\3\33\1\uffff\1\33\5\uffff\4\33\1\105\11\33\1\117\4\33\1\uffff\11\33\1\uffff\15\33\1\152\1\33\1\154\1\155\11\33\1\uffff\1\33\2\uffff\7\33\1\u0080\10\33\1\u0089\1\33\1\uffff\1\33\1\u008c\6\33\1\uffff\1\u0093\1\33\1\uffff\5\33\1\u009a\1\uffff\2\33\1\u009e\3\33\1\uffff\1\33\1\u00a3\1\u00a4\1\uffff\4\33\2\uffff\13\33\1\u00b4\1\33\1\u00b6\1\u00b7\1\uffff\1\33\2\uffff\1\33\1\u00ba\1\uffff";
    static final String DFA10_eofS =
        "\u00bb\uffff";
    static final String DFA10_minS =
        "\1\0\1\157\1\141\1\144\1\141\1\157\2\uffff\1\141\2\uffff\1\144\1\72\1\160\1\157\1\145\1\uffff\1\141\1\0\1\101\2\uffff\1\52\2\uffff\1\165\1\141\1\uffff\1\162\1\163\1\144\1\151\1\165\2\uffff\1\162\2\uffff\1\145\1\uffff\1\145\1\155\1\154\1\uffff\1\162\5\uffff\1\162\1\164\1\147\1\151\1\60\1\160\1\156\1\162\1\147\1\156\1\162\1\144\1\155\1\160\1\60\1\143\2\145\1\147\1\uffff\1\151\1\123\1\143\1\145\1\164\1\141\1\151\2\145\1\uffff\1\145\1\155\1\164\2\156\1\157\1\145\1\164\1\151\2\164\1\156\1\162\1\60\1\145\2\60\1\147\1\165\2\115\1\146\1\157\1\151\1\164\1\123\1\uffff\1\156\2\uffff\1\115\1\162\2\145\1\151\1\162\1\157\1\60\2\164\1\157\1\165\1\143\2\164\1\145\1\60\1\156\1\uffff\1\141\1\60\1\144\1\154\1\145\2\141\1\162\1\uffff\1\60\1\164\1\uffff\2\145\1\115\2\155\1\60\1\uffff\1\145\1\154\1\60\1\145\2\157\1\uffff\1\155\2\60\1\uffff\1\164\2\144\1\145\2\uffff\1\141\2\145\1\156\1\155\2\154\1\164\1\157\2\163\1\60\1\144\2\60\1\uffff\1\145\2\uffff\1\154\1\60\1\uffff";
    static final String DFA10_maxS =
        "\1\uffff\1\164\1\141\1\163\1\141\1\157\2\uffff\1\141\2\uffff\1\144\1\72\1\160\1\157\1\145\1\uffff\1\141\1\uffff\1\172\2\uffff\1\57\2\uffff\1\165\1\141\1\uffff\1\162\1\163\1\144\1\160\1\165\2\uffff\1\162\2\uffff\1\145\1\uffff\1\145\1\156\1\154\1\uffff\1\162\5\uffff\1\162\1\164\1\147\1\151\1\172\1\160\1\156\1\162\1\147\1\156\1\162\1\144\1\155\1\160\1\172\1\143\2\145\1\147\1\uffff\1\151\1\123\1\143\1\145\1\164\1\141\1\151\2\145\1\uffff\1\145\1\155\1\164\2\156\1\157\1\145\1\164\1\151\2\164\1\156\1\162\1\172\1\145\2\172\1\147\1\165\2\115\1\146\1\157\1\151\1\164\1\123\1\uffff\1\156\2\uffff\1\122\1\162\2\145\1\151\1\162\1\157\1\172\2\164\1\157\1\165\1\143\2\164\1\145\1\172\1\156\1\uffff\1\141\1\172\1\144\1\154\1\145\2\141\1\162\1\uffff\1\172\1\164\1\uffff\2\145\1\115\2\155\1\172\1\uffff\1\145\1\154\1\172\1\145\2\157\1\uffff\1\155\2\172\1\uffff\1\164\2\144\1\145\2\uffff\1\141\2\145\1\156\1\155\2\154\1\164\1\157\2\163\1\172\1\144\2\172\1\uffff\1\145\2\uffff\1\154\1\172\1\uffff";
    static final String DFA10_acceptS =
        "\6\uffff\1\7\1\10\1\uffff\1\12\1\15\5\uffff\1\26\3\uffff\1\31\1\32\1\uffff\1\35\1\36\2\uffff\1\31\5\uffff\1\7\1\10\1\uffff\1\12\1\15\1\uffff\1\20\3\uffff\1\26\1\uffff\1\30\1\32\1\33\1\34\1\35\23\uffff\1\4\11\uffff\1\27\32\uffff\1\1\1\uffff\1\2\1\3\22\uffff\1\23\10\uffff\1\21\2\uffff\1\25\6\uffff\1\22\6\uffff\1\17\3\uffff\1\16\4\uffff\1\5\1\14\17\uffff\1\24\1\uffff\1\6\1\11\2\uffff\1\13";
    static final String DFA10_specialS =
        "\1\0\21\uffff\1\1\u00a8\uffff}>";
    static final String[] DFA10_transitionS = {
            "\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\22\11\30\1\11\1\30\1\20\1\26\12\25\1\14\1\12\5\30\7\24\1\17\4\24\1\4\5\24\1\5\1\10\6\24\3\30\1\23\1\24\1\30\1\3\1\24\1\16\5\24\1\13\5\24\1\15\3\24\1\1\1\2\1\24\1\21\4\24\1\6\1\30\1\7\uff82\30",
            "\1\31\4\uffff\1\32",
            "\1\34",
            "\1\36\16\uffff\1\35",
            "\1\37",
            "\1\40",
            "",
            "",
            "\1\43",
            "",
            "",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "",
            "\1\54",
            "\0\55",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "\1\62",
            "\1\63",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\70\6\uffff\1\67",
            "\1\71",
            "",
            "",
            "\1\72",
            "",
            "",
            "\1\73",
            "",
            "\1\74",
            "\1\76\1\75",
            "\1\77",
            "",
            "\1\100",
            "",
            "",
            "",
            "",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\153",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "\1\167",
            "",
            "",
            "\1\170\4\uffff\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u008a",
            "",
            "\1\u008b",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u0094",
            "",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u009b",
            "\1\u009c",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\22\33\1\u009d\7\33",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u00b5",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\u00b8",
            "",
            "",
            "\1\u00b9",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_STRING | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_0 = input.LA(1);

                        s = -1;
                        if ( (LA10_0=='s') ) {s = 1;}

                        else if ( (LA10_0=='t') ) {s = 2;}

                        else if ( (LA10_0=='a') ) {s = 3;}

                        else if ( (LA10_0=='M') ) {s = 4;}

                        else if ( (LA10_0=='S') ) {s = 5;}

                        else if ( (LA10_0=='{') ) {s = 6;}

                        else if ( (LA10_0=='}') ) {s = 7;}

                        else if ( (LA10_0=='T') ) {s = 8;}

                        else if ( (LA10_0==',') ) {s = 9;}

                        else if ( (LA10_0==';') ) {s = 10;}

                        else if ( (LA10_0=='i') ) {s = 11;}

                        else if ( (LA10_0==':') ) {s = 12;}

                        else if ( (LA10_0=='o') ) {s = 13;}

                        else if ( (LA10_0=='c') ) {s = 14;}

                        else if ( (LA10_0=='H') ) {s = 15;}

                        else if ( (LA10_0=='.') ) {s = 16;}

                        else if ( (LA10_0=='v') ) {s = 17;}

                        else if ( (LA10_0=='\"') ) {s = 18;}

                        else if ( (LA10_0=='^') ) {s = 19;}

                        else if ( ((LA10_0>='A' && LA10_0<='G')||(LA10_0>='I' && LA10_0<='L')||(LA10_0>='N' && LA10_0<='R')||(LA10_0>='U' && LA10_0<='Z')||LA10_0=='_'||LA10_0=='b'||(LA10_0>='d' && LA10_0<='h')||(LA10_0>='j' && LA10_0<='n')||(LA10_0>='p' && LA10_0<='r')||LA10_0=='u'||(LA10_0>='w' && LA10_0<='z')) ) {s = 20;}

                        else if ( ((LA10_0>='0' && LA10_0<='9')) ) {s = 21;}

                        else if ( (LA10_0=='/') ) {s = 22;}

                        else if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {s = 23;}

                        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\u001F')||LA10_0=='!'||(LA10_0>='#' && LA10_0<='+')||LA10_0=='-'||(LA10_0>='<' && LA10_0<='@')||(LA10_0>='[' && LA10_0<=']')||LA10_0=='`'||LA10_0=='|'||(LA10_0>='~' && LA10_0<='\uFFFF')) ) {s = 24;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_18 = input.LA(1);

                        s = -1;
                        if ( ((LA10_18>='\u0000' && LA10_18<='\uFFFF')) ) {s = 45;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}