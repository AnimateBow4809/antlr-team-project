// $ANTLR 3.5.1 C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g 2023-05-05 18:14:33

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class sLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ASSIGN=4;
	public static final int CHAR=5;
	public static final int COMMENT=6;
	public static final int DIVIDE=7;
	public static final int ESC_SEQ=8;
	public static final int EXPONENT=9;
	public static final int FLOAT=10;
	public static final int HEX_DIGIT=11;
	public static final int ID=12;
	public static final int INT=13;
	public static final int MULTIPLY=14;
	public static final int OCTAL_ESC=15;
	public static final int PLUS=16;
	public static final int STRING=17;
	public static final int SUB=18;
	public static final int SWITCH=19;
	public static final int UNICODE_ESC=20;
	public static final int WS=21;

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
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:8:8: ( 'switch' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:8:10: 'switch'
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

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:11:6: ( '+' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:11:8: '+'
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
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:5: ( '-' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:7: '-'
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
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:17:9: ( '*' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:17:11: '*'
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
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:20:8: ( '/' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:20:10: '/'
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
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:23:8: ( '=' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:23:10: '='
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

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:26:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:26:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:26:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:29:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:29:7: ( '0' .. '9' )+
			{
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:29:7: ( '0' .. '9' )+
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
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt9=3;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:9: ( '0' .. '9' )+
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
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:25: ( '0' .. '9' )*
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

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:37: ( EXPONENT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='E'||LA5_0=='e') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:13: ( '0' .. '9' )+
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

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:25: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:35:9: ( '0' .. '9' )+ EXPONENT
					{
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:35:9: ( '0' .. '9' )+
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
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:14: (~ ( '\\n' | '\\r' ) )*
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

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:28: ( '\\r' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='\r') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:28: '\\r'
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
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:40:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:40:14: ( options {greedy=false; } : . )*
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
							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:40:42: .
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
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:43:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:43:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:51:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:51:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:51:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:51:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:51:24: ~ ( '\\\\' | '\"' )
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
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:54:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:54:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:54:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
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
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:54:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:54:25: ~ ( '\\'' | '\\\\' )
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
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:59:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:59:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:59:22: ( '+' | '-' )?
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

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:59:33: ( '0' .. '9' )+
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
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:62:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
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
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:66:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:66:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:67:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:68:9: OCTAL_ESC
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
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:73:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:73:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:74:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:75:9: '\\\\' ( '0' .. '7' )
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
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:80:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:80:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:8: ( SWITCH | PLUS | SUB | MULTIPLY | DIVIDE | ASSIGN | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR )
		int alt20=13;
		alt20 = dfa20.predict(input);
		switch (alt20) {
			case 1 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:10: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 2 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:17: PLUS
				{
				mPLUS(); 

				}
				break;
			case 3 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:22: SUB
				{
				mSUB(); 

				}
				break;
			case 4 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:26: MULTIPLY
				{
				mMULTIPLY(); 

				}
				break;
			case 5 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:35: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 6 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:42: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 7 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:49: ID
				{
				mID(); 

				}
				break;
			case 8 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:52: INT
				{
				mINT(); 

				}
				break;
			case 9 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:56: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 10 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:62: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 11 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:70: WS
				{
				mWS(); 

				}
				break;
			case 12 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:73: STRING
				{
				mSTRING(); 

				}
				break;
			case 13 :
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:1:80: CHAR
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
			return "32:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA20_eotS =
		"\1\uffff\1\7\3\uffff\1\17\2\uffff\1\20\4\uffff\1\7\3\uffff\3\7\1\25\1"+
		"\uffff";
	static final String DFA20_eofS =
		"\26\uffff";
	static final String DFA20_minS =
		"\1\11\1\167\3\uffff\1\52\2\uffff\1\56\4\uffff\1\151\3\uffff\1\164\1\143"+
		"\1\150\1\60\1\uffff";
	static final String DFA20_maxS =
		"\1\172\1\167\3\uffff\1\57\2\uffff\1\145\4\uffff\1\151\3\uffff\1\164\1"+
		"\143\1\150\1\172\1\uffff";
	static final String DFA20_acceptS =
		"\2\uffff\1\2\1\3\1\4\1\uffff\1\6\1\7\1\uffff\1\11\1\13\1\14\1\15\1\uffff"+
		"\1\12\1\5\1\10\4\uffff\1\1";
	static final String DFA20_specialS =
		"\26\uffff}>";
	static final String[] DFA20_transitionS = {
			"\2\12\2\uffff\1\12\22\uffff\1\12\1\uffff\1\13\4\uffff\1\14\2\uffff\1"+
			"\4\1\2\1\uffff\1\3\1\11\1\5\12\10\3\uffff\1\6\3\uffff\32\7\4\uffff\1"+
			"\7\1\uffff\22\7\1\1\7\7",
			"\1\15",
			"",
			"",
			"",
			"\1\16\4\uffff\1\16",
			"",
			"",
			"\1\11\1\uffff\12\10\13\uffff\1\11\37\uffff\1\11",
			"",
			"",
			"",
			"",
			"\1\21",
			"",
			"",
			"",
			"\1\22",
			"\1\23",
			"\1\24",
			"\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
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
			return "1:1: Tokens : ( SWITCH | PLUS | SUB | MULTIPLY | DIVIDE | ASSIGN | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR );";
		}
	}

}
