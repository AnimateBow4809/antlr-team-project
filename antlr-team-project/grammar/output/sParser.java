// $ANTLR 3.5.1 C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g 2023-05-05 19:19:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class sParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN", "BCLOSE", "BOPEN", 
		"B_AND", "B_OR", "CASE", "CHAR", "COMMENT", "DIVIDE", "DO", "ELIF", "ELSE", 
		"ESC_SEQ", "EXPONENT", "FLOAT", "FOR", "FUNCTION", "HEX_DIGIT", "ID", 
		"IF", "INT", "LCLOSE", "LOPEN", "MULTIPLY", "OCTAL_ESC", "OR", "PLUS", 
		"POWER", "REM", "RETURN", "SEMI", "SLL", "SRL", "STRING", "SUB", "SWITCH", 
		"T_CHAR", "T_FLOAT", "T_INT", "T_STRING", "UNICODE_ESC", "WHILE", "WS", 
		"XOR"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "start", "s"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public sParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public sParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public sParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return sParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g"; }



	// $ANTLR start "start"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:3:1: start : ( s )* EOF ;
	public final void start() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "start");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(3, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:3:7: ( ( s )* EOF )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:3:9: ( s )* EOF
			{
			dbg.location(3,9);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:3:9: ( s )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= AND && LA1_0 <= CHAR)||(LA1_0 >= DIVIDE && LA1_0 <= ELSE)||(LA1_0 >= FLOAT && LA1_0 <= FUNCTION)||(LA1_0 >= ID && LA1_0 <= MULTIPLY)||(LA1_0 >= OR && LA1_0 <= T_STRING)||LA1_0==WHILE||LA1_0==XOR) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:3:9: s
					{
					dbg.location(3,9);
					pushFollow(FOLLOW_s_in_start10);
					s();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(3,12);
			match(input,EOF,FOLLOW_EOF_in_start13); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(3, 14);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "start");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "start"



	// $ANTLR start "s"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:5:1: s : ( ID | INT | FLOAT | STRING | CHAR | SWITCH | CASE | IF | ELIF | ELSE | WHILE | DO | FOR | FUNCTION | RETURN | T_INT | T_FLOAT | T_CHAR | T_STRING | SEMI | POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE | ASSIGN | SLL | SRL | AND | OR | XOR | B_AND | B_OR | LOPEN | LCLOSE | BOPEN | BCLOSE );
	public final void s() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "s");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(5, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:5:3: ( ID | INT | FLOAT | STRING | CHAR | SWITCH | CASE | IF | ELIF | ELSE | WHILE | DO | FOR | FUNCTION | RETURN | T_INT | T_FLOAT | T_CHAR | T_STRING | SEMI | POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE | ASSIGN | SLL | SRL | AND | OR | XOR | B_AND | B_OR | LOPEN | LCLOSE | BOPEN | BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(5,3);
			if ( (input.LA(1) >= AND && input.LA(1) <= CHAR)||(input.LA(1) >= DIVIDE && input.LA(1) <= ELSE)||(input.LA(1) >= FLOAT && input.LA(1) <= FUNCTION)||(input.LA(1) >= ID && input.LA(1) <= MULTIPLY)||(input.LA(1) >= OR && input.LA(1) <= T_STRING)||input.LA(1)==WHILE||input.LA(1)==XOR ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(8, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "s");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "s"

	// Delegated rules



	public static final BitSet FOLLOW_s_in_start10 = new BitSet(new long[]{0x00015FFFDFB9EFF0L});
	public static final BitSet FOLLOW_EOF_in_start13 = new BitSet(new long[]{0x0000000000000002L});
}
