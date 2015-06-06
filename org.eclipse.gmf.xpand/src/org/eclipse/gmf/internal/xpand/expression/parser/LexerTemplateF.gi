--
-- An instance of this template must have a $Export section and the export_terminals option
--
-- Macros that may be redefined in an instance of this template
--
--     $eof_token
--     $additional_interfaces
--     $super_stream_class -- subclass com.ibm.lpg.LpgLexStream for getKind
--     $prs_stream_class -- use /.PrsStream./ if not subclassing
--
-- B E G I N N I N G   O F   T E M P L A T E   LexerTemplateD
--
%Options programming_language=java,margin=4
%Options table
%options action-block=("*.java", "/.", "./")
%options ParseTable=lpg.runtime.ParseTable
%Options prefix=Char_

--
-- This template requires that the name of the EOF token be set
-- to EOF and that the prefix be "Char_" to be consistent with
-- KeywordTemplateD.
--
%Eof
    EOF
%End

--
-- This template also requires that the name of the parser EOF
-- Token to be exported be set to EOF_TOKEN
--
%Export
    EOF_TOKEN
%End

%Define
    --
    -- Macros that are be needed in an instance of this template
    --
    $eof_token /.$_EOF_TOKEN./
    
    $additional_interfaces /../
    $super_stream_class /.LpgLexStream./
    $prs_stream_class /.PrsStream./

    $prs_stream /. // macro prs_stream is deprecated. Use function getPrsStream
                  getPrsStream()./
    $setSym1 /. // macro setSym1 is deprecated. Use function setResult
               lexParser.setSym1./
    $setResult /. // macro setResult is deprecated. Use function setResult
                 lexParser.setSym1./
    $getSym /. // macro getSym is deprecated. Use function getLastToken
              lexParser.getSym./
    $getToken /. // macro getToken is deprecated. Use function getToken
                lexParser.getToken./
    $getLeftSpan /. // macro getLeftSpan is deprecated. Use function getLeftSpan
                   lexParser.getFirstToken./
    $getRightSpan /. // macro getRightSpan is deprecated. Use function getRightSpan
                    lexParser.getLastToken./

    --
    -- Macros useful for specifying actions
    --
    $Header
    /.
                //
                // Rule $rule_number:  $rule_text
                //./

    $DefaultAction
    /. $Header
                case $rule_number: { ./

    $BeginAction /.$DefaultAction./

    $EndAction
    /.          break;
                }./

    $BeginCode
    /.$BeginAction
                $symbol_declarations./

    $EndCode /.$EndAction./

    $NoAction
    /. $Header
                case $rule_number:
                    break; ./

    $BeginActions
    /.
        public void ruleAction( int ruleNumber) {
            switch(ruleNumber) {./

    $SplitActions
    /.
	            default:
	                ruleAction$rule_number(ruleNumber);
	                break;
	        }
	        return;
	    }
	
	    public void ruleAction$rule_number(int ruleNumber) {
	        switch (ruleNumber) {./

    $EndActions
    /.
                default:
                    break;
            }
            return;
        }./

    -- Macros to provide different implementation of non-ascii char handing in getKind(int) method
    -- Default implementation always tells it's general non-ascii char
    $getNonASCIICharKindMethodImpl /.return Char_AfterASCII;./
%End

%Globals
    /.import lpg.runtime.*;
    ./
%End

-- INJECTED COPY OF LexerBasicMap.g, instead of $Include
-- The reasons to do that are:
--          once we started to import OCLLexer, we happen to get wrong LexerBasicMap.g
--          we need custom handling of LG/RG chars in addition to OCL's Acute handling
--          there's no apparent reason to keep methods in two separate files (as they are tightly related, anyway)
-- CHANGES to copied LexerBasicMap.g:
--          methods referencing Options class were removed
--          printValues and boolean attribute to control that were removed
--          getKind() extracted into separate overridable macro $getNonASCIICharKindMethodImpl

%Headers
    /.
    public class $action_type extends $super_stream_class implements $exp_type, $sym_type, RuleAction$additional_interfaces {
        private static ParseTable prs = new $prs_type();
        private $prs_stream_class prsStream;
        private final LexParser lexParser = new LexParser(this, prs, this);

        private $kw_lexer_class kwLexer;

        public $prs_stream_class getPrsStream() { return prsStream; }
        public int getToken(int i) { return lexParser.getToken(i); }
        public int getRhsFirstTokenIndex(int i) { return lexParser.getFirstToken(i); }
        public int getRhsLastTokenIndex(int i) { return lexParser.getLastToken(i); }

        public int getLeftSpan() { return lexParser.getFirstToken(); }
        public int getRightSpan() { return lexParser.getLastToken(); }
  
        public $action_type(char[] input_chars, String filename, int tab) {
            super(input_chars, filename, tab);
        }

        public $action_type(char[] input_chars, String filename) {
            this(input_chars, filename, 4);
        }

        public String[] orderedExportedSymbols() { return $exp_type.orderedTerminalSymbols; }
        public LexStream getLexStream() { return (LexStream) this; }

        public int [] getKeywordKinds() { return kwLexer.getKeywordKinds(); }

        public void lexer($prs_stream_class prsStream) {
            lexer(null, prsStream);
        }
        
        public void lexer(Monitor monitor, $prs_stream_class prsStream) {
            if (getInputChars() == null) {
                throw new NullPointerException("LexStream was not initialized");
            }

            this.prsStream = prsStream;
            resetErrors();

            prsStream.makeToken(0, 0, 0); // Token list must start with a bad token
                
            lexParser.parseCharacters(monitor);  // Lex the input characters
                
            int i = getStreamIndex();
            prsStream.makeToken(i, i, $eof_token); // and end with the end of file token
            prsStream.setStreamLength(prsStream.getSize());
                
            return;
        }

		@Override
        public void initialize(char [] content, String filename) {
            super.initialize(content, filename);
            if (this.kwLexer == null) {
                 this.kwLexer = new $kw_lexer_class(getInputChars(), $_IDENTIFIER);
            } else {
            	this.kwLexer.setInputChars(getInputChars());
            }
        }
        
        final void makeToken(int kind) {
            int startOffset = getLeftSpan(),
                endOffset = getRightSpan();
            makeToken(startOffset, endOffset, kind);
        }

        final void makeComment(int kind) {
            int startOffset = getLeftSpan(),
                endOffset = getRightSpan();
            super.getPrsStream().makeAdjunct(startOffset, endOffset, kind);
        }

        final void skipToken() {
        }
        
        final void checkForKeyWord() {
            int startOffset = getLeftSpan(),
                endOffset = getRightSpan(),
            kwKind = kwLexer.lexer(startOffset, endOffset);
            makeToken(startOffset, endOffset, kwKind);
        }

        // aux data for getKind method        
        private final int tokenKind[] = {
            Char_CtlCharNotWS,    // 000    0x00
            Char_CtlCharNotWS,    // 001    0x01
            Char_CtlCharNotWS,    // 002    0x02
            Char_CtlCharNotWS,    // 003    0x03
            Char_CtlCharNotWS,    // 004    0x04
            Char_CtlCharNotWS,    // 005    0x05
            Char_CtlCharNotWS,    // 006    0x06
            Char_CtlCharNotWS,    // 007    0x07
            Char_CtlCharNotWS,    // 008    0x08
            Char_HT,              // 009    0x09
            Char_LF,              // 010    0x0A
            Char_CtlCharNotWS,    // 011    0x0B
            Char_FF,              // 012    0x0C
            Char_CR,              // 013    0x0D
            Char_CtlCharNotWS,    // 014    0x0E
            Char_CtlCharNotWS,    // 015    0x0F
            Char_CtlCharNotWS,    // 016    0x10
            Char_CtlCharNotWS,    // 017    0x11
            Char_CtlCharNotWS,    // 018    0x12
            Char_CtlCharNotWS,    // 019    0x13
            Char_CtlCharNotWS,    // 020    0x14
            Char_CtlCharNotWS,    // 021    0x15
            Char_CtlCharNotWS,    // 022    0x16
            Char_CtlCharNotWS,    // 023    0x17
            Char_CtlCharNotWS,    // 024    0x18
            Char_CtlCharNotWS,    // 025    0x19
            Char_CtlCharNotWS,    // 026    0x1A
            Char_CtlCharNotWS,    // 027    0x1B
            Char_CtlCharNotWS,    // 028    0x1C
            Char_CtlCharNotWS,    // 029    0x1D
            Char_CtlCharNotWS,    // 030    0x1E
            Char_CtlCharNotWS,    // 031    0x1F
            Char_Space,           // 032    0x20
            Char_Exclamation,     // 033    0x21
            Char_DoubleQuote,     // 034    0x22
            Char_Sharp,           // 035    0x23
            Char_DollarSign,      // 036    0x24
            Char_Percent,         // 037    0x25
            Char_Ampersand,       // 038    0x26
            Char_SingleQuote,     // 039    0x27
            Char_LeftParen,       // 040    0x28
            Char_RightParen,      // 041    0x29
            Char_Star,            // 042    0x2A
            Char_Plus,            // 043    0x2B
            Char_Comma,           // 044    0x2C
            Char_Minus,           // 045    0x2D
            Char_Dot,             // 046    0x2E
            Char_Slash,           // 047    0x2F
            Char_0,               // 048    0x30
            Char_1,               // 049    0x31
            Char_2,               // 050    0x32
            Char_3,               // 051    0x33
            Char_4,               // 052    0x34
            Char_5,               // 053    0x35
            Char_6,               // 054    0x36
            Char_7,               // 055    0x37
            Char_8,               // 056    0x38
            Char_9,               // 057    0x39
            Char_Colon,           // 058    0x3A
            Char_SemiColon,       // 059    0x3B
            Char_LessThan,        // 060    0x3C
            Char_Equal,           // 061    0x3D
            Char_GreaterThan,     // 062    0x3E
            Char_QuestionMark,    // 063    0x3F
            Char_AtSign,          // 064    0x40
            Char_A,               // 065    0x41
            Char_B,               // 066    0x42
            Char_C,               // 067    0x43
            Char_D,               // 068    0x44
            Char_E,               // 069    0x45
            Char_F,               // 070    0x46
            Char_G,               // 071    0x47
            Char_H,               // 072    0x48
            Char_I,               // 073    0x49
            Char_J,               // 074    0x4A
            Char_K,               // 075    0x4B
            Char_L,               // 076    0x4C
            Char_M,               // 077    0x4D
            Char_N,               // 078    0x4E
            Char_O,               // 079    0x4F
            Char_P,               // 080    0x50
            Char_Q,               // 081    0x51
            Char_R,               // 082    0x52
            Char_S,               // 083    0x53
            Char_T,               // 084    0x54
            Char_U,               // 085    0x55
            Char_V,               // 086    0x56
            Char_W,               // 087    0x57
            Char_X,               // 088    0x58
            Char_Y,               // 089    0x59
            Char_Z,               // 090    0x5A
            Char_LeftBracket,     // 091    0x5B
            Char_BackSlash,       // 092    0x5C
            Char_RightBracket,    // 093    0x5D
            Char_Caret,           // 094    0x5E
            Char__,               // 095    0x5F
            Char_BackQuote,       // 096    0x60
            Char_a,               // 097    0x61
            Char_b,               // 098    0x62
            Char_c,               // 099    0x63
            Char_d,               // 100    0x64
            Char_e,               // 101    0x65
            Char_f,               // 102    0x66
            Char_g,               // 103    0x67
            Char_h,               // 104    0x68
            Char_i,               // 105    0x69
            Char_j,               // 106    0x6A
            Char_k,               // 107    0x6B
            Char_l,               // 108    0x6C
            Char_m,               // 109    0x6D
            Char_n,               // 110    0x6E
            Char_o,               // 111    0x6F
            Char_p,               // 112    0x70
            Char_q,               // 113    0x71
            Char_r,               // 114    0x72
            Char_s,               // 115    0x73
            Char_t,               // 116    0x74
            Char_u,               // 117    0x75
            Char_v,               // 118    0x76
            Char_w,               // 119    0x77
            Char_x,               // 120    0x78
            Char_y,               // 121    0x79
            Char_z,               // 122    0x7A
            Char_LeftBrace,       // 123    0x7B
            Char_VerticalBar,     // 124    0x7C
            Char_RightBrace,      // 125    0x7D
            Char_Tilde,           // 126    0x7E
                                  // [artem] As I understand, there's no need to specify characters other than those
                                  //  we'll try to access by index from getKind method (iow, this array is auxilary
                                  // as I indicated in its comment). Thus, there seems to be no reason to specify
                                  // Char_Acute here as it's done in OCL's LexerBasicMap.g
            Char_AfterASCII,      // for all chars in range 128..65534
            Char_EOF              // for '\uffff' or 65535 
        };

        // Classify character at ith location
        @Override
        public final int getKind(int i) {
            char c = (i >= getStreamLength() ? '\uffff' : getCharValue(i));
            return (c < 128 // ASCII Character
                ? tokenKind[c]
                : c == '\uffff'
                    ? Char_EOF
                    : getNonAsciiKind(c));
                    
        }

        private final static int getNonAsciiKind(char c) {
            $getNonASCIICharKindMethodImpl
        }
    ./
%End

%Define
	$tokenStartOffset /.leftToken./
	$tokenEndOffset /.rightToken./
%Include
	errorHandling.g
%End

%Rules
    /.$BeginActions./
%End

%Trailers
    /.
        $EndActions
    }
    ./
%End

--
-- E N D   O F   T E M P L A T E
--