// $ANTLR 3.5.1 C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g 2023-05-05 19:19:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class sLexer extends Lexer {
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ASSIGN=5;
	public static final int BCLOSE=6;
	public static final int BOPEN=7;
	public static final int B_AND=8;
	public static final int B_OR=9;
	public static final int CASE=10;
	public static final int CHAR=11;
	public static final int COMMENT=12;
	public static final int DIVIDE=13;
	public static final int DO=14;
	public static final int ELIF=15;
	public static final int ELSE=16;
	public static final int ESC_SEQ=17;
	public static final int EXPONENT=18;
	public static final int FLOAT=19;
	public static final int FOR=20;
	public static final int FUNCTION=21;
	public static final int HEX_DIGIT=22;
	public static final int ID=23;
	public static final int IF=24;
	public static final int INT=25;
	public static final int LCLOSE=26;
	public static final int LOPEN=27;
	public static final int MULTIPLY=28;
	public static final int OCTAL_ESC=29;
	public static final int OR=30;
	public static final int PLUS=31;
	public static final int POWER=32;
	public static final int REM=33;
	public static final int RETURN=34;
	public static final int SEMI=35;
	public static final int SLL=36;
	public static final int SRL=37;
	public static final int STRING=38;
	public static final int SUB=39;
	public static final int SWITCH=40;
	public static final int T_CHAR=41;
	public static final int T_FLOAT=42;
	public static final int T_INT=43;
	public static final int T_STRING=44;
	public static final int UNICODE_ESC=45;
	public static final int WHILE=46;
	public static final int WS=47;
	public static final int XOR=48;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public sLexer() {} 
	public sLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public sLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g"; }

	// $ANTLR start "SWITCH"
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:8: ( 'switch' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:10: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH"

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:17:6: ( 'case' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:17:8: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:20:4: ( 'if' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:20:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELIF"
	public final void mELIF() throws RecognitionException {
		try {
			int _type = ELIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:22:6: ( 'elif' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:22:8: 'elif'
			{
			match("elif"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELIF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:24:6: ( 'else' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:24:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:28:7: ( 'while' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:28:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:31:4: ( 'do' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:31:6: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:5: ( 'for' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:7: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:9: ( 'function' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:11: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTION"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:42:8: ( 'return' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:42:10: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "T_INT"
	public final void mT_INT() throws RecognitionException {
		try {
			int _type = T_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:7: ( 'int' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:9: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_INT"

	// $ANTLR start "T_FLOAT"
	public final void mT_FLOAT() throws RecognitionException {
		try {
			int _type = T_FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:50:9: ( 'float' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:50:11: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_FLOAT"

	// $ANTLR start "T_CHAR"
	public final void mT_CHAR() throws RecognitionException {
		try {
			int _type = T_CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:53:8: ( 'char' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:53:10: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_CHAR"

	// $ANTLR start "T_STRING"
	public final void mT_STRING() throws RecognitionException {
		try {
			int _type = T_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:56:9: ( 'string' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:56:11: 'string'
			{
			match("string"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T_STRING"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:61:6: ( ';' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:61:8: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI"

	// $ANTLR start "POWER"
	public final void mPOWER() throws RecognitionException {
		try {
			int _type = POWER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:67:7: ( '^^' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:67:9: '^^'
			{
			match("^^"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POWER"

	// $ANTLR start "REM"
	public final void mREM() throws RecognitionException {
		try {
			int _type = REM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:70:5: ( '%' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:70:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REM"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:73:6: ( '+' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:73:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:76:5: ( '-' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:76:7: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB"

	// $ANTLR start "MULTIPLY"
	public final void mMULTIPLY() throws RecognitionException {
		try {
			int _type = MULTIPLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:79:9: ( '*' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:79:11: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTIPLY"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:82:8: ( '/' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:82:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:85:8: ( '=' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:85:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "SLL"
	public final void mSLL() throws RecognitionException {
		try {
			int _type = SLL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:90:5: ( '<<' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:90:7: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SLL"

	// $ANTLR start "SRL"
	public final void mSRL() throws RecognitionException {
		try {
			int _type = SRL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:93:5: ( '>>' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:93:7: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SRL"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:96:5: ( '&' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:96:7: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:99:4: ( '|' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:99:6: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "XOR"
	public final void mXOR() throws RecognitionException {
		try {
			int _type = XOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:102:5: ( '^' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:102:7: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XOR"

	// $ANTLR start "B_AND"
	public final void mB_AND() throws RecognitionException {
		try {
			int _type = B_AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:107:7: ( '&&' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:107:9: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "B_AND"

	// $ANTLR start "B_OR"
	public final void mB_OR() throws RecognitionException {
		try {
			int _type = B_OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:109:6: ( '||' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:109:8: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "B_OR"

	// $ANTLR start "LOPEN"
	public final void mLOPEN() throws RecognitionException {
		try {
			int _type = LOPEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:115:7: ( '(' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:115:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOPEN"

	// $ANTLR start "LCLOSE"
	public final void mLCLOSE() throws RecognitionException {
		try {
			int _type = LCLOSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:118:8: ( ')' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:118:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCLOSE"

	// $ANTLR start "BOPEN"
	public final void mBOPEN() throws RecognitionException {
		try {
			int _type = BOPEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:120:7: ( '{' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:120:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOPEN"

	// $ANTLR start "BCLOSE"
	public final void mBCLOSE() throws RecognitionException {
		try {
			int _type = BCLOSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:123:8: ( '}' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:123:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BCLOSE"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:127:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:127:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:127:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:130:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:130:7: ( '0' .. '9' )+
			{
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:130:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:134:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt9=3;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:134:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:134:9: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match('.'); 
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:134:25: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop4;
						}
					}

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:134:37: ( EXPONENT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='E'||LA5_0=='e') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:134:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:135:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:135:13: ( '0' .. '9' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:135:25: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:135:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:136:9: ( '0' .. '9' )+ EXPONENT
					{
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:136:9: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:140:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='/') ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1=='/') ) {
					alt13=1;
				}
				else if ( (LA13_1=='*') ) {
					alt13=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:140:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:140:14: (~ ( '\\n' | '\\r' ) )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop10;
						}
					}

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:140:28: ( '\\r' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='\r') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:140:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:141:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:141:14: ( options {greedy=false; } : . )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0=='*') ) {
							int LA12_1 = input.LA(2);
							if ( (LA12_1=='/') ) {
								alt12=2;
							}
							else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
								alt12=1;
							}

						}
						else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:141:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop12;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:144:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:144:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:152:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:152:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:152:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop14:
			while (true) {
				int alt14=3;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='\\') ) {
					alt14=1;
				}
				else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '!')||(LA14_0 >= '#' && LA14_0 <= '[')||(LA14_0 >= ']' && LA14_0 <= '\uFFFF')) ) {
					alt14=2;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:152:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:152:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop14;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:155:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:155:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:155:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='\\') ) {
				alt15=1;
			}
			else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '&')||(LA15_0 >= '(' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:155:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:155:25: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:160:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:160:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:160:22: ( '+' | '-' )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='+'||LA16_0=='-') ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:160:33: ( '0' .. '9' )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:163:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:167:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt18=3;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt18=1;
					}
					break;
				case 'u':
					{
					alt18=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt18=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:167:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:168:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:169:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:174:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt19=3;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='\\') ) {
				int LA19_1 = input.LA(2);
				if ( ((LA19_1 >= '0' && LA19_1 <= '3')) ) {
					int LA19_2 = input.LA(3);
					if ( ((LA19_2 >= '0' && LA19_2 <= '7')) ) {
						int LA19_4 = input.LA(4);
						if ( ((LA19_4 >= '0' && LA19_4 <= '7')) ) {
							alt19=1;
						}

						else {
							alt19=2;
						}

					}

					else {
						alt19=3;
					}

				}
				else if ( ((LA19_1 >= '4' && LA19_1 <= '7')) ) {
					int LA19_3 = input.LA(3);
					if ( ((LA19_3 >= '0' && LA19_3 <= '7')) ) {
						alt19=2;
					}

					else {
						alt19=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:174:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:175:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:176:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:181:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:181:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:8: ( SWITCH | CASE | IF | ELIF | ELSE | WHILE | DO | FOR | FUNCTION | RETURN | T_INT | T_FLOAT | T_CHAR | T_STRING | SEMI | POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE | ASSIGN | SLL | SRL | AND | OR | XOR | B_AND | B_OR | LOPEN | LCLOSE | BOPEN | BCLOSE | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR )
		int alt20=40;
		alt20 = dfa20.predict(input);
		switch (alt20) {
			case 1 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:10: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 2 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:17: CASE
				{
				mCASE(); 

				}
				break;
			case 3 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:22: IF
				{
				mIF(); 

				}
				break;
			case 4 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:25: ELIF
				{
				mELIF(); 

				}
				break;
			case 5 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:30: ELSE
				{
				mELSE(); 

				}
				break;
			case 6 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:35: WHILE
				{
				mWHILE(); 

				}
				break;
			case 7 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:41: DO
				{
				mDO(); 

				}
				break;
			case 8 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:44: FOR
				{
				mFOR(); 

				}
				break;
			case 9 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:48: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 10 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:57: RETURN
				{
				mRETURN(); 

				}
				break;
			case 11 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:64: T_INT
				{
				mT_INT(); 

				}
				break;
			case 12 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:70: T_FLOAT
				{
				mT_FLOAT(); 

				}
				break;
			case 13 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:78: T_CHAR
				{
				mT_CHAR(); 

				}
				break;
			case 14 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:85: T_STRING
				{
				mT_STRING(); 

				}
				break;
			case 15 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:94: SEMI
				{
				mSEMI(); 

				}
				break;
			case 16 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:99: POWER
				{
				mPOWER(); 

				}
				break;
			case 17 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:105: REM
				{
				mREM(); 

				}
				break;
			case 18 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:109: PLUS
				{
				mPLUS(); 

				}
				break;
			case 19 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:114: SUB
				{
				mSUB(); 

				}
				break;
			case 20 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:118: MULTIPLY
				{
				mMULTIPLY(); 

				}
				break;
			case 21 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:127: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 22 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:134: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 23 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:141: SLL
				{
				mSLL(); 

				}
				break;
			case 24 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:145: SRL
				{
				mSRL(); 

				}
				break;
			case 25 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:149: AND
				{
				mAND(); 

				}
				break;
			case 26 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:153: OR
				{
				mOR(); 

				}
				break;
			case 27 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:156: XOR
				{
				mXOR(); 

				}
				break;
			case 28 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:160: B_AND
				{
				mB_AND(); 

				}
				break;
			case 29 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:166: B_OR
				{
				mB_OR(); 

				}
				break;
			case 30 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:171: LOPEN
				{
				mLOPEN(); 

				}
				break;
			case 31 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:177: LCLOSE
				{
				mLCLOSE(); 

				}
				break;
			case 32 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:184: BOPEN
				{
				mBOPEN(); 

				}
				break;
			case 33 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:190: BCLOSE
				{
				mBCLOSE(); 

				}
				break;
			case 34 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:197: ID
				{
				mID(); 

				}
				break;
			case 35 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:200: INT
				{
				mINT(); 

				}
				break;
			case 36 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:204: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 37 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:210: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 38 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:218: WS
				{
				mWS(); 

				}
				break;
			case 39 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:221: STRING
				{
				mSTRING(); 

				}
				break;
			case 40 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:228: CHAR
				{
				mCHAR(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	protected DFA20 dfa20 = new DFA20(this);
	static final String DFA9_eotS =
		"\5\uffff";
	static final String DFA9_eofS =
		"\5\uffff";
	static final String DFA9_minS =
		"\2\56\3\uffff";
	static final String DFA9_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA9_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA9_specialS =
		"\5\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "133:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA20_eotS =
		"\1\uffff\10\31\1\uffff\1\55\4\uffff\1\57\3\uffff\1\61\1\63\5\uffff\1\64"+
		"\4\uffff\4\31\1\71\3\31\1\76\4\31\11\uffff\4\31\1\uffff\1\107\3\31\1\uffff"+
		"\1\113\5\31\1\121\1\122\1\uffff\1\123\1\124\1\31\1\uffff\5\31\4\uffff"+
		"\1\133\1\31\1\135\1\31\1\137\1\140\1\uffff\1\31\1\uffff\1\142\2\uffff"+
		"\1\31\1\uffff\1\144\1\uffff";
	static final String DFA20_eofS =
		"\145\uffff";
	static final String DFA20_minS =
		"\1\11\1\164\1\141\1\146\1\154\1\150\1\157\1\154\1\145\1\uffff\1\136\4"+
		"\uffff\1\52\3\uffff\1\46\1\174\5\uffff\1\56\4\uffff\1\151\1\162\1\163"+
		"\1\141\1\60\1\164\2\151\1\60\1\162\1\156\1\157\1\164\11\uffff\1\164\1"+
		"\151\1\145\1\162\1\uffff\1\60\1\146\1\145\1\154\1\uffff\1\60\1\143\1\141"+
		"\1\165\1\143\1\156\2\60\1\uffff\2\60\1\145\1\uffff\2\164\1\162\1\150\1"+
		"\147\4\uffff\1\60\1\151\1\60\1\156\2\60\1\uffff\1\157\1\uffff\1\60\2\uffff"+
		"\1\156\1\uffff\1\60\1\uffff";
	static final String DFA20_maxS =
		"\1\175\1\167\1\150\1\156\1\154\1\150\1\157\1\165\1\145\1\uffff\1\136\4"+
		"\uffff\1\57\3\uffff\1\46\1\174\5\uffff\1\145\4\uffff\1\151\1\162\1\163"+
		"\1\141\1\172\1\164\1\163\1\151\1\172\1\162\1\156\1\157\1\164\11\uffff"+
		"\1\164\1\151\1\145\1\162\1\uffff\1\172\1\146\1\145\1\154\1\uffff\1\172"+
		"\1\143\1\141\1\165\1\143\1\156\2\172\1\uffff\2\172\1\145\1\uffff\2\164"+
		"\1\162\1\150\1\147\4\uffff\1\172\1\151\1\172\1\156\2\172\1\uffff\1\157"+
		"\1\uffff\1\172\2\uffff\1\156\1\uffff\1\172\1\uffff";
	static final String DFA20_acceptS =
		"\11\uffff\1\17\1\uffff\1\21\1\22\1\23\1\24\1\uffff\1\26\1\27\1\30\2\uffff"+
		"\1\36\1\37\1\40\1\41\1\42\1\uffff\1\44\1\46\1\47\1\50\15\uffff\1\20\1"+
		"\33\1\45\1\25\1\34\1\31\1\35\1\32\1\43\4\uffff\1\3\4\uffff\1\7\10\uffff"+
		"\1\13\3\uffff\1\10\5\uffff\1\2\1\15\1\4\1\5\6\uffff\1\6\1\uffff\1\14\1"+
		"\uffff\1\1\1\16\1\uffff\1\12\1\uffff\1\11";
	static final String DFA20_specialS =
		"\145\uffff}>";
	static final String[] DFA20_transitionS = {
			"\2\34\2\uffff\1\34\22\uffff\1\34\1\uffff\1\35\2\uffff\1\13\1\23\1\36"+
			"\1\25\1\26\1\16\1\14\1\uffff\1\15\1\33\1\17\12\32\1\uffff\1\11\1\21\1"+
			"\20\1\22\2\uffff\32\31\3\uffff\1\12\1\31\1\uffff\2\31\1\2\1\6\1\4\1\7"+
			"\2\31\1\3\10\31\1\10\1\1\3\31\1\5\3\31\1\27\1\24\1\30",
			"\1\40\2\uffff\1\37",
			"\1\41\6\uffff\1\42",
			"\1\43\7\uffff\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\52\2\uffff\1\50\5\uffff\1\51",
			"\1\53",
			"",
			"\1\54",
			"",
			"",
			"",
			"",
			"\1\56\4\uffff\1\56",
			"",
			"",
			"",
			"\1\60",
			"\1\62",
			"",
			"",
			"",
			"",
			"",
			"\1\33\1\uffff\12\32\13\uffff\1\33\37\uffff\1\33",
			"",
			"",
			"",
			"",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\72",
			"\1\73\11\uffff\1\74",
			"\1\75",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\110",
			"\1\111",
			"\1\112",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\125",
			"",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"",
			"",
			"",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\134",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\1\136",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"\1\141",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			"",
			"",
			"\1\143",
			"",
			"\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
			""
	};

	static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
	static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
	static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
	static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
	static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
	static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
	static final short[][] DFA20_transition;

	static {
		int numStates = DFA20_transitionS.length;
		DFA20_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
		}
	}

	protected class DFA20 extends DFA {

		public DFA20(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 20;
			this.eot = DFA20_eot;
			this.eof = DFA20_eof;
			this.min = DFA20_min;
			this.max = DFA20_max;
			this.accept = DFA20_accept;
			this.special = DFA20_special;
			this.transition = DFA20_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SWITCH | CASE | IF | ELIF | ELSE | WHILE | DO | FOR | FUNCTION | RETURN | T_INT | T_FLOAT | T_CHAR | T_STRING | SEMI | POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE | ASSIGN | SLL | SRL | AND | OR | XOR | B_AND | B_OR | LOPEN | LCLOSE | BOPEN | BCLOSE | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR );";
		}
	}

}
