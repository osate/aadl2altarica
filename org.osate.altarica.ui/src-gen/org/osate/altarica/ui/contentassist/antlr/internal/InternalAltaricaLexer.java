package org.osate.altarica.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAltaricaLexer extends Lexer {
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

    public InternalAltaricaLexer() {;} 
    public InternalAltaricaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAltaricaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:11:7: ( '==' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:11:9: '=='
            {
            match("=="); 


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
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:12:7: ( '!=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:12:9: '!='
            {
            match("!="); 


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
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:13:7: ( '<' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:13:9: '<'
            {
            match('<'); 

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
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:14:7: ( '<=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:14:9: '<='
            {
            match("<="); 


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
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:15:7: ( '>=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:15:9: '>='
            {
            match(">="); 


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
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:16:7: ( '>' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:16:9: '>'
            {
            match('>'); 

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
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:17:7: ( '+' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:17:9: '+'
            {
            match('+'); 

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
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:18:7: ( '-' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:18:9: '-'
            {
            match('-'); 

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
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:19:7: ( '*' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:19:9: '*'
            {
            match('*'); 

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
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:20:7: ( '/' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:20:9: '/'
            {
            match('/'); 

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
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:21:7: ( 'true' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:21:9: 'true'
            {
            match("true"); 


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
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:22:7: ( 'false' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:22:9: 'false'
            {
            match("false"); 


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
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:23:7: ( 'exponential' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:23:9: 'exponential'
            {
            match("exponential"); 


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
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:24:7: ( 'dirac' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:24:9: 'dirac'
            {
            match("dirac"); 


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
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:25:7: ( 'constant' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:25:9: 'constant'
            {
            match("constant"); 


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
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:26:7: ( 'Integer' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:26:9: 'Integer'
            {
            match("Integer"); 


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
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:27:7: ( 'Boolean' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:27:9: 'Boolean'
            {
            match("Boolean"); 


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
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:28:7: ( 'domain' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:28:9: 'domain'
            {
            match("domain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:29:7: ( '{' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:29:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:30:7: ( '}' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:30:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:31:7: ( ',' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:31:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:32:7: ( 'class' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:32:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:33:7: ( 'end' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:33:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:34:7: ( 'transition' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:34:9: 'transition'
            {
            match("transition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:35:7: ( 'assertion' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:35:9: 'assertion'
            {
            match("assertion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:36:7: ( ';' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:36:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:37:7: ( '(' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:37:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:38:7: ( ')' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:38:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:39:7: ( '=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:39:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:40:7: ( 'event' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:40:9: 'event'
            {
            match("event"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:41:7: ( 'parameter' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:41:9: 'parameter'
            {
            match("parameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:42:7: ( 'observer' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:42:9: 'observer'
            {
            match("observer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:43:7: ( ':' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:43:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:44:7: ( '&' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:44:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:45:7: ( '|' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:45:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:46:7: ( '->' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:46:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:47:7: ( 'skip' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:47:9: 'skip'
            {
            match("skip"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:48:7: ( ':=' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:48:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:49:7: ( 'if' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:49:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:50:7: ( 'then' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:50:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:51:7: ( 'else' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:51:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:52:7: ( 'switch' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:52:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:53:7: ( 'not' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:53:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:54:7: ( '.' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:54:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:55:7: ( 'or' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:55:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:56:7: ( 'and' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:56:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "RULE_ALPHA"
    public final void mRULE_ALPHA() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8022:21: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8022:23: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALPHA"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8024:21: ( '0' .. '9' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8024:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_REGULAR_ID"
    public final void mRULE_REGULAR_ID() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8026:26: ( ( RULE_ALPHA | '_' ) ( RULE_ALPHA | '_' | RULE_DIGIT )* )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8026:28: ( RULE_ALPHA | '_' ) ( RULE_ALPHA | '_' | RULE_DIGIT )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8026:45: ( RULE_ALPHA | '_' | RULE_DIGIT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:
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
            	    break loop1;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_REGULAR_ID"

    // $ANTLR start "RULE_STRING_ID"
    public final void mRULE_STRING_ID() throws RecognitionException {
        try {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8028:25: ( '\\'' ( RULE_ALPHA | RULE_DIGIT | '!' | '#' | '$' | '%' | '&' | '(' | ')' | '*' | '+' | ',' | '-' | '.' | '/' | ':' | ';' | '<' | '>' | '=' | '?' | '@' | '[' | ']' | '^' | '{' | '}' | '|' | '~' | '_' )* '\\'' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8028:27: '\\'' ( RULE_ALPHA | RULE_DIGIT | '!' | '#' | '$' | '%' | '&' | '(' | ')' | '*' | '+' | ',' | '-' | '.' | '/' | ':' | ';' | '<' | '>' | '=' | '?' | '@' | '[' | ']' | '^' | '{' | '}' | '|' | '~' | '_' )* '\\''
            {
            match('\''); 
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8028:32: ( RULE_ALPHA | RULE_DIGIT | '!' | '#' | '$' | '%' | '&' | '(' | ')' | '*' | '+' | ',' | '-' | '.' | '/' | ':' | ';' | '<' | '>' | '=' | '?' | '@' | '[' | ']' | '^' | '{' | '}' | '|' | '~' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='!'||(LA2_0>='#' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='_')||(LA2_0>='a' && LA2_0<='~')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:
            	    {
            	    if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='~') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\''); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_ID"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8030:9: ( ( RULE_REGULAR_ID | RULE_STRING_ID ) )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8030:11: ( RULE_REGULAR_ID | RULE_STRING_ID )
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8030:11: ( RULE_REGULAR_ID | RULE_STRING_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                alt3=1;
            }
            else if ( (LA3_0=='\'') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8030:12: RULE_REGULAR_ID
                    {
                    mRULE_REGULAR_ID(); 

                    }
                    break;
                case 2 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8030:28: RULE_STRING_ID
                    {
                    mRULE_STRING_ID(); 

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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8032:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\"' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8032:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8032:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\"') ) {
                    int LA4_1 = input.LA(2);

                    if ( ((LA4_1>='\u0000' && LA4_1<='&')||(LA4_1>='(' && LA4_1<='\uFFFF')) ) {
                        alt4=2;
                    }


                }
                else if ( (LA4_0=='\\') ) {
                    alt4=1;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8032:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8032:65: ~ ( ( '\\\\' | '\\'' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
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

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8034:13: ( ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )+ )? ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8034:15: ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )+ )? ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )?
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8034:15: ( RULE_DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8034:15: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8034:27: ( '.' ( RULE_DIGIT )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8034:28: '.' ( RULE_DIGIT )+
                    {
                    match('.'); 
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8034:32: ( RULE_DIGIT )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8034:32: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }

            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8034:46: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='E'||LA10_0=='e') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8034:47: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8034:57: ( '+' | '-' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='+'||LA8_0=='-') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8034:68: ( RULE_DIGIT )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8034:68: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

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
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8036:10: ( '_@_this has been deactivated_' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8036:12: '_@_this has been deactivated_'
            {
            match("_@_this has been deactivated_"); 


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
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8038:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8038:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8038:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8038:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8040:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8040:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8040:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8040:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8040:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8040:41: ( '\\r' )? '\\n'
                    {
                    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8040:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8040:41: '\\r'
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
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8042:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8042:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8042:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8044:16: ( . )
            // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:8044:18: .
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
        // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | RULE_ID | RULE_STRING | RULE_NUMBER | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=54;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:286: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 48 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:294: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 49 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:306: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 50 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:318: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 51 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:327: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 52 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:343: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 53 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:359: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 54 :
                // ../org.osate.altarica.ui/src-gen/org/osate/altarica/ui/contentassist/antlr/internal/InternalAltarica.g:1:367: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\50\1\46\1\53\1\55\1\uffff\1\60\1\uffff\1\64\7\67\3\uffff\1\67\3\uffff\2\67\1\117\2\uffff\3\67\1\uffff\1\67\2\46\22\uffff\2\67\1\uffff\13\67\3\uffff\2\67\3\uffff\2\67\1\155\4\uffff\2\67\1\160\1\67\5\uffff\5\67\1\167\11\67\1\u0081\2\67\1\uffff\2\67\1\uffff\1\u0086\1\u0087\1\67\1\u0089\2\67\1\uffff\1\67\1\u008d\7\67\1\uffff\2\67\1\u0097\1\67\2\uffff\1\67\1\uffff\1\u009a\1\67\1\u009c\1\uffff\1\u009d\2\67\1\u00a0\5\67\1\uffff\2\67\1\uffff\1\67\2\uffff\1\u00a9\1\67\1\uffff\5\67\1\u00b0\2\67\1\uffff\1\67\1\u00b4\1\u00b5\3\67\1\uffff\2\67\1\u00bb\2\uffff\2\67\1\u00be\2\67\1\uffff\1\u00c1\1\u00c2\1\uffff\1\u00c3\1\67\3\uffff\1\u00c5\1\uffff";
    static final String DFA16_eofS =
        "\u00c6\uffff";
    static final String DFA16_minS =
        "\1\0\4\75\1\uffff\1\76\1\uffff\1\52\1\150\1\141\1\154\1\151\1\154\1\156\1\157\3\uffff\1\156\3\uffff\1\141\1\142\1\75\2\uffff\1\153\1\146\1\157\1\uffff\1\100\1\41\1\0\22\uffff\1\141\1\145\1\uffff\1\154\1\160\1\144\1\145\1\163\1\162\1\155\1\156\1\141\1\164\1\157\3\uffff\1\163\1\144\3\uffff\1\162\1\163\1\60\4\uffff\2\151\1\60\1\164\5\uffff\1\145\2\156\1\163\1\157\1\60\1\156\1\145\2\141\2\163\1\145\1\154\1\145\1\60\1\141\1\145\1\uffff\1\160\1\164\1\uffff\2\60\1\163\1\60\1\145\1\156\1\uffff\1\164\1\60\1\143\1\151\1\164\1\163\1\147\1\145\1\162\1\uffff\1\155\1\162\1\60\1\143\2\uffff\1\151\1\uffff\1\60\1\145\1\60\1\uffff\1\60\1\156\1\141\1\60\1\145\1\141\1\164\1\145\1\166\1\uffff\1\150\1\164\1\uffff\1\156\2\uffff\1\60\1\156\1\uffff\1\162\1\156\1\151\1\164\1\145\1\60\1\151\1\164\1\uffff\1\164\2\60\1\157\1\145\1\162\1\uffff\1\157\1\151\1\60\2\uffff\1\156\1\162\1\60\1\156\1\141\1\uffff\2\60\1\uffff\1\60\1\154\3\uffff\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\4\75\1\uffff\1\76\1\uffff\1\57\1\162\1\141\1\170\2\157\1\156\1\157\3\uffff\1\163\3\uffff\1\141\1\162\1\75\2\uffff\1\167\1\146\1\157\1\uffff\1\100\1\176\1\uffff\22\uffff\1\165\1\145\1\uffff\1\154\1\160\1\144\1\145\1\163\1\162\1\155\1\156\1\141\1\164\1\157\3\uffff\1\163\1\144\3\uffff\1\162\1\163\1\172\4\uffff\2\151\1\172\1\164\5\uffff\1\145\2\156\1\163\1\157\1\172\1\156\1\145\2\141\2\163\1\145\1\154\1\145\1\172\1\141\1\145\1\uffff\1\160\1\164\1\uffff\2\172\1\163\1\172\1\145\1\156\1\uffff\1\164\1\172\1\143\1\151\1\164\1\163\1\147\1\145\1\162\1\uffff\1\155\1\162\1\172\1\143\2\uffff\1\151\1\uffff\1\172\1\145\1\172\1\uffff\1\172\1\156\1\141\1\172\1\145\1\141\1\164\1\145\1\166\1\uffff\1\150\1\164\1\uffff\1\156\2\uffff\1\172\1\156\1\uffff\1\162\1\156\1\151\1\164\1\145\1\172\1\151\1\164\1\uffff\1\164\2\172\1\157\1\145\1\162\1\uffff\1\157\1\151\1\172\2\uffff\1\156\1\162\1\172\1\156\1\141\1\uffff\2\172\1\uffff\1\172\1\154\3\uffff\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\5\uffff\1\7\1\uffff\1\11\10\uffff\1\23\1\24\1\25\1\uffff\1\32\1\33\1\34\3\uffff\1\42\1\43\3\uffff\1\54\3\uffff\1\61\1\57\1\65\1\66\1\1\1\35\1\2\1\4\1\3\1\5\1\6\1\7\1\44\1\10\1\11\1\63\1\64\1\12\2\uffff\1\57\13\uffff\1\23\1\24\1\25\2\uffff\1\32\1\33\1\34\3\uffff\1\46\1\41\1\42\1\43\4\uffff\1\54\1\62\1\60\1\61\1\65\22\uffff\1\55\2\uffff\1\47\6\uffff\1\27\11\uffff\1\56\4\uffff\1\53\1\13\1\uffff\1\50\3\uffff\1\51\11\uffff\1\45\2\uffff\1\14\1\uffff\1\36\1\16\2\uffff\1\26\10\uffff\1\22\6\uffff\1\52\3\uffff\1\20\1\21\5\uffff\1\17\2\uffff\1\40\2\uffff\1\31\1\37\1\30\1\uffff\1\15";
    static final String DFA16_specialS =
        "\1\0\41\uffff\1\1\u00a3\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\46\2\45\2\46\1\45\22\46\1\45\1\2\1\42\3\46\1\32\1\41\1\25\1\26\1\7\1\5\1\22\1\6\1\37\1\10\12\43\1\31\1\24\1\3\1\1\1\4\2\46\1\44\1\17\6\44\1\16\21\44\4\46\1\40\1\46\1\23\1\44\1\15\1\14\1\13\1\12\2\44\1\35\4\44\1\36\1\30\1\27\2\44\1\34\1\11\6\44\1\20\1\33\1\21\uff82\46",
            "\1\47",
            "\1\51",
            "\1\52",
            "\1\54",
            "",
            "\1\57",
            "",
            "\1\62\4\uffff\1\63",
            "\1\66\11\uffff\1\65",
            "\1\70",
            "\1\74\1\uffff\1\72\7\uffff\1\73\1\uffff\1\71",
            "\1\75\5\uffff\1\76",
            "\1\100\2\uffff\1\77",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "\1\107\4\uffff\1\106",
            "",
            "",
            "",
            "\1\113",
            "\1\114\17\uffff\1\115",
            "\1\116",
            "",
            "",
            "\1\122\13\uffff\1\123",
            "\1\124",
            "\1\125",
            "",
            "\1\127",
            "\1\67\1\uffff\71\67\1\uffff\3\67\1\uffff\36\67",
            "\47\130\1\uffff\uffd8\130",
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
            "",
            "\1\134\23\uffff\1\133",
            "\1\135",
            "",
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
            "",
            "",
            "",
            "\1\151",
            "\1\152",
            "",
            "",
            "",
            "\1\153",
            "\1\154",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "",
            "",
            "\1\156",
            "\1\157",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\161",
            "",
            "",
            "",
            "",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0082",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0088",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u008a",
            "\1\u008b",
            "",
            "\1\u008c",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "",
            "\1\u0095",
            "\1\u0096",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u0098",
            "",
            "",
            "\1\u0099",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u009b",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u009e",
            "\1\u009f",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "\1\u00a8",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00b1",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            "\1\u00c4",
            "",
            "",
            "",
            "\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | RULE_ID | RULE_STRING | RULE_NUMBER | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='=') ) {s = 1;}

                        else if ( (LA16_0=='!') ) {s = 2;}

                        else if ( (LA16_0=='<') ) {s = 3;}

                        else if ( (LA16_0=='>') ) {s = 4;}

                        else if ( (LA16_0=='+') ) {s = 5;}

                        else if ( (LA16_0=='-') ) {s = 6;}

                        else if ( (LA16_0=='*') ) {s = 7;}

                        else if ( (LA16_0=='/') ) {s = 8;}

                        else if ( (LA16_0=='t') ) {s = 9;}

                        else if ( (LA16_0=='f') ) {s = 10;}

                        else if ( (LA16_0=='e') ) {s = 11;}

                        else if ( (LA16_0=='d') ) {s = 12;}

                        else if ( (LA16_0=='c') ) {s = 13;}

                        else if ( (LA16_0=='I') ) {s = 14;}

                        else if ( (LA16_0=='B') ) {s = 15;}

                        else if ( (LA16_0=='{') ) {s = 16;}

                        else if ( (LA16_0=='}') ) {s = 17;}

                        else if ( (LA16_0==',') ) {s = 18;}

                        else if ( (LA16_0=='a') ) {s = 19;}

                        else if ( (LA16_0==';') ) {s = 20;}

                        else if ( (LA16_0=='(') ) {s = 21;}

                        else if ( (LA16_0==')') ) {s = 22;}

                        else if ( (LA16_0=='p') ) {s = 23;}

                        else if ( (LA16_0=='o') ) {s = 24;}

                        else if ( (LA16_0==':') ) {s = 25;}

                        else if ( (LA16_0=='&') ) {s = 26;}

                        else if ( (LA16_0=='|') ) {s = 27;}

                        else if ( (LA16_0=='s') ) {s = 28;}

                        else if ( (LA16_0=='i') ) {s = 29;}

                        else if ( (LA16_0=='n') ) {s = 30;}

                        else if ( (LA16_0=='.') ) {s = 31;}

                        else if ( (LA16_0=='_') ) {s = 32;}

                        else if ( (LA16_0=='\'') ) {s = 33;}

                        else if ( (LA16_0=='\"') ) {s = 34;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 35;}

                        else if ( (LA16_0=='A'||(LA16_0>='C' && LA16_0<='H')||(LA16_0>='J' && LA16_0<='Z')||LA16_0=='b'||(LA16_0>='g' && LA16_0<='h')||(LA16_0>='j' && LA16_0<='m')||(LA16_0>='q' && LA16_0<='r')||(LA16_0>='u' && LA16_0<='z')) ) {s = 36;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 37;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||(LA16_0>='#' && LA16_0<='%')||(LA16_0>='?' && LA16_0<='@')||(LA16_0>='[' && LA16_0<='^')||LA16_0=='`'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_34 = input.LA(1);

                        s = -1;
                        if ( ((LA16_34>='\u0000' && LA16_34<='&')||(LA16_34>='(' && LA16_34<='\uFFFF')) ) {s = 88;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}