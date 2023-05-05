// $ANTLR 3.5.1 C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g 2023-05-05 18:14:33

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class sParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "CHAR", "COMMENT", "DIVIDE", 
		"ESC_SEQ", "EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "MULTIPLY", 
		"OCTAL_ESC", "PLUS", "STRING", "SUB", "SWITCH", "UNICODE_ESC", "WS"
	};
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
				if ( ((LA1_0 >= ASSIGN && LA1_0 <= CHAR)||LA1_0==DIVIDE||LA1_0==FLOAT||(LA1_0 >= ID && LA1_0 <= MULTIPLY)||(LA1_0 >= PLUS && LA1_0 <= SWITCH)) ) {
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
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:5:1: s : ( ID | SWITCH | INT | FLOAT | STRING | CHAR | PLUS | SUB | MULTIPLY | DIVIDE | ASSIGN );
	public final void s() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "s");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(5, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:5:3: ( ID | SWITCH | INT | FLOAT | STRING | CHAR | PLUS | SUB | MULTIPLY | DIVIDE | ASSIGN )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(5,3);
			if ( (input.LA(1) >= ASSIGN && input.LA(1) <= CHAR)||input.LA(1)==DIVIDE||input.LA(1)==FLOAT||(input.LA(1) >= ID && input.LA(1) <= MULTIPLY)||(input.LA(1) >= PLUS && input.LA(1) <= SWITCH) ) {
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
		dbg.location(6, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "s");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "s"

	// Delegated rules



	public static final BitSet FOLLOW_s_in_start10 = new BitSet(new long[]{0x00000000000F74B0L});
	public static final BitSet FOLLOW_EOF_in_start13 = new BitSet(new long[]{0x0000000000000002L});
}
