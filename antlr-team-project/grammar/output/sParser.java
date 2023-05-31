// $ANTLR 3.5.1 C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g 2023-05-31 17:32:47

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class sParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN", "BCLOSE", "BOPEN", 
		"B_AND", "B_OR", "CASE", "CCLOSE", "CHAR", "COMMENT", "COPEN", "DIVIDE", 
		"DO", "ELIF", "ELSE", "EQ", "ESC_SEQ", "EXPONENT", "FLOAT", "FOR", "FUNCTION", 
		"GEQ", "GT", "HEX_DIGIT", "ID", "IF", "INT", "LCLOSE", "LEQ", "LOPEN", 
		"LT", "MULTIPLY", "NEQ", "OCTAL_ESC", "OR", "PLUS", "POWER", "REM", "RETURN", 
		"SEMI", "SLL", "SRL", "STRING", "SUB", "SWITCH", "T_CHAR", "T_FLOAT", 
		"T_INT", "T_STRING", "UNICODE_ESC", "WHILE", "WS", "XOR", "','"
	};
	public static final int EOF=-1;
	public static final int T__57=57;
	public static final int AND=4;
	public static final int ASSIGN=5;
	public static final int BCLOSE=6;
	public static final int BOPEN=7;
	public static final int B_AND=8;
	public static final int B_OR=9;
	public static final int CASE=10;
	public static final int CCLOSE=11;
	public static final int CHAR=12;
	public static final int COMMENT=13;
	public static final int COPEN=14;
	public static final int DIVIDE=15;
	public static final int DO=16;
	public static final int ELIF=17;
	public static final int ELSE=18;
	public static final int EQ=19;
	public static final int ESC_SEQ=20;
	public static final int EXPONENT=21;
	public static final int FLOAT=22;
	public static final int FOR=23;
	public static final int FUNCTION=24;
	public static final int GEQ=25;
	public static final int GT=26;
	public static final int HEX_DIGIT=27;
	public static final int ID=28;
	public static final int IF=29;
	public static final int INT=30;
	public static final int LCLOSE=31;
	public static final int LEQ=32;
	public static final int LOPEN=33;
	public static final int LT=34;
	public static final int MULTIPLY=35;
	public static final int NEQ=36;
	public static final int OCTAL_ESC=37;
	public static final int OR=38;
	public static final int PLUS=39;
	public static final int POWER=40;
	public static final int REM=41;
	public static final int RETURN=42;
	public static final int SEMI=43;
	public static final int SLL=44;
	public static final int SRL=45;
	public static final int STRING=46;
	public static final int SUB=47;
	public static final int SWITCH=48;
	public static final int T_CHAR=49;
	public static final int T_FLOAT=50;
	public static final int T_INT=51;
	public static final int T_STRING=52;
	public static final int UNICODE_ESC=53;
	public static final int WHILE=54;
	public static final int WS=55;
	public static final int XOR=56;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "synpred31_s", "f", "start", "synpred85_s", "synpred37_s", 
		"synpred41_s", "synpred57_s", "synpred68_s", "s", "synpred22_s", "else_if_st", 
		"params", "synpred6_s", "synpred34_s", "synpred81_s", "synpred12_s", "r", 
		"synpred9_s", "def_params", "synpred29_s", "synpred23_s", "synpred30_s", 
		"synpred25_s", "synpred49_s", "synpred72_s", "synpred1_s", "synpred70_s", 
		"synpred11_s", "synpred60_s", "synpred40_s", "synpred82_s", "else_st", 
		"synpred24_s", "synpred50_s", "synpred61_s", "synpred39_s", "synpred44_s", 
		"synpred10_s", "while_st", "synpred8_s", "synpred26_s", "synpred52_s", 
		"synpred75_s", "synpred71_s", "synpred69_s", "assign_st", "synpred32_s", 
		"do_st", "synpred42_s", "statements", "synpred64_s", "synpred73_s", "synpred53_s", 
		"synpred21_s", "synpred59_s", "synpred54_s", "synpred27_s", "synpred58_s", 
		"synpred80_s", "synpred16_s", "synpred51_s", "synpred66_s", "synpred28_s", 
		"block", "synpred55_s", "synpred67_s", "synpred20_s", "function_def", 
		"synpred4_s", "synpred38_s", "condition", "synpred17_s", "no", "synpred5_s", 
		"conOp", "synpred78_s", "synpred43_s", "synpred19_s", "synpred62_s", "synpred56_s", 
		"synpred33_s", "synpred47_s", "synpred3_s", "op", "synpred76_s", "synpred15_s", 
		"synpred77_s", "synpred79_s", "synpred84_s", "if_st", "synpred74_s", "e", 
		"type", "synpred65_s", "synpred46_s", "function_st", "synpred7_s", "statement", 
		"synpred14_s", "synpred63_s", "blocks", "type1", "synpred36_s", "synpred48_s", 
		"synpred35_s", "m", "synpred83_s", "synpred13_s", "synpred2_s", "synpred18_s", 
		"synpred45_s"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, true, false, false, false, false, false, true, false, false, 
		    false, false, false, true, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false
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
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:11:1: start : ( blocks )* EOF ;
	public final void start() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "start");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(11, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:11:7: ( ( blocks )* EOF )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:11:9: ( blocks )* EOF
			{
			dbg.location(11,9);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:11:9: ( blocks )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==BOPEN||LA1_0==DO||(LA1_0 >= ID && LA1_0 <= IF)||(LA1_0 >= T_CHAR && LA1_0 <= T_STRING)||LA1_0==WHILE) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:11:9: blocks
					{
					dbg.location(11,9);
					pushFollow(FOLLOW_blocks_in_start37);
					blocks();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(11,17);
			match(input,EOF,FOLLOW_EOF_in_start40); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(12, 0);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "start");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "start"



	// $ANTLR start "blocks"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:1: blocks : ( function_def | BOPEN block BCLOSE | block );
	public final void blocks() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "blocks");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(14, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:8: ( function_def | BOPEN block BCLOSE | block )
			int alt2=3;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			try {
				isCyclicDecision = true;
				alt2 = dfa2.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:11: function_def
					{
					dbg.location(14,11);
					pushFollow(FOLLOW_function_def_in_blocks50);
					function_def();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:25: BOPEN block BCLOSE
					{
					dbg.location(14,25);
					match(input,BOPEN,FOLLOW_BOPEN_in_blocks53); if (state.failed) return;dbg.location(14,31);
					pushFollow(FOLLOW_block_in_blocks55);
					block();
					state._fsp--;
					if (state.failed) return;dbg.location(14,37);
					match(input,BCLOSE,FOLLOW_BCLOSE_in_blocks57); if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:46: block
					{
					dbg.location(14,46);
					pushFollow(FOLLOW_block_in_blocks61);
					block();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(15, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "blocks");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "blocks"



	// $ANTLR start "block"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:17:1: block : statements ;
	public final void block() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(17, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:17:7: ( statements )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:17:9: statements
			{
			dbg.location(17,9);
			pushFollow(FOLLOW_statements_in_block72);
			statements();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(18, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "block"



	// $ANTLR start "statements"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:20:1: statements : statement ( statement )* ;
	public final void statements() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statements");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(20, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:21:2: ( statement ( statement )* )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:21:4: statement ( statement )*
			{
			dbg.location(21,4);
			pushFollow(FOLLOW_statement_in_statements85);
			statement();
			state._fsp--;
			if (state.failed) return;dbg.location(21,14);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:21:14: ( statement )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				switch ( input.LA(1) ) {
				case T_CHAR:
				case T_FLOAT:
				case T_INT:
				case T_STRING:
					{
					int LA3_3 = input.LA(2);
					if ( (synpred4_s()) ) {
						alt3=1;
					}

					}
					break;
				case ID:
					{
					int LA3_5 = input.LA(2);
					if ( (synpred4_s()) ) {
						alt3=1;
					}

					}
					break;
				case IF:
					{
					int LA3_6 = input.LA(2);
					if ( (synpred4_s()) ) {
						alt3=1;
					}

					}
					break;
				case WHILE:
					{
					int LA3_7 = input.LA(2);
					if ( (synpred4_s()) ) {
						alt3=1;
					}

					}
					break;
				case DO:
					{
					int LA3_8 = input.LA(2);
					if ( (synpred4_s()) ) {
						alt3=1;
					}

					}
					break;
				}
				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:21:14: statement
					{
					dbg.location(21,14);
					pushFollow(FOLLOW_statement_in_statements87);
					statement();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(22, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statements");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statements"



	// $ANTLR start "statement"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:24:1: statement : ( assign_st | if_st | function_st | while_st | do_st );
	public final void statement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(24, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:25:2: ( assign_st | if_st | function_st | while_st | do_st )
			int alt4=5;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			switch ( input.LA(1) ) {
			case T_CHAR:
			case T_FLOAT:
			case T_INT:
			case T_STRING:
				{
				alt4=1;
				}
				break;
			case ID:
				{
				int LA4_2 = input.LA(2);
				if ( (LA4_2==LOPEN) ) {
					alt4=3;
				}
				else if ( (LA4_2==ASSIGN) ) {
					alt4=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IF:
				{
				alt4=2;
				}
				break;
			case WHILE:
				{
				alt4=4;
				}
				break;
			case DO:
				{
				alt4=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:25:4: assign_st
					{
					dbg.location(25,4);
					pushFollow(FOLLOW_assign_st_in_statement100);
					assign_st();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:25:16: if_st
					{
					dbg.location(25,16);
					pushFollow(FOLLOW_if_st_in_statement104);
					if_st();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:25:24: function_st
					{
					dbg.location(25,24);
					pushFollow(FOLLOW_function_st_in_statement108);
					function_st();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:25:38: while_st
					{
					dbg.location(25,38);
					pushFollow(FOLLOW_while_st_in_statement112);
					while_st();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:25:48: do_st
					{
					dbg.location(25,48);
					pushFollow(FOLLOW_do_st_in_statement115);
					do_st();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(26, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "while_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:28:1: while_st : WHILE LOPEN condition LCLOSE BOPEN statements BCLOSE ;
	public final void while_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "while_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(28, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:28:9: ( WHILE LOPEN condition LCLOSE BOPEN statements BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:28:11: WHILE LOPEN condition LCLOSE BOPEN statements BCLOSE
			{
			dbg.location(28,11);
			match(input,WHILE,FOLLOW_WHILE_in_while_st125); if (state.failed) return;dbg.location(28,17);
			match(input,LOPEN,FOLLOW_LOPEN_in_while_st127); if (state.failed) return;dbg.location(28,23);
			pushFollow(FOLLOW_condition_in_while_st129);
			condition();
			state._fsp--;
			if (state.failed) return;dbg.location(28,33);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_while_st131); if (state.failed) return;dbg.location(28,40);
			match(input,BOPEN,FOLLOW_BOPEN_in_while_st133); if (state.failed) return;dbg.location(28,46);
			pushFollow(FOLLOW_statements_in_while_st135);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(28,57);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_while_st137); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(29, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "while_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "while_st"



	// $ANTLR start "do_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:31:1: do_st : DO LOPEN condition LCLOSE BOPEN statements BCLOSE ;
	public final void do_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "do_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(31, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:31:7: ( DO LOPEN condition LCLOSE BOPEN statements BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:31:9: DO LOPEN condition LCLOSE BOPEN statements BCLOSE
			{
			dbg.location(31,9);
			match(input,DO,FOLLOW_DO_in_do_st148); if (state.failed) return;dbg.location(31,12);
			match(input,LOPEN,FOLLOW_LOPEN_in_do_st150); if (state.failed) return;dbg.location(31,18);
			pushFollow(FOLLOW_condition_in_do_st152);
			condition();
			state._fsp--;
			if (state.failed) return;dbg.location(31,28);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_do_st154); if (state.failed) return;dbg.location(31,35);
			match(input,BOPEN,FOLLOW_BOPEN_in_do_st156); if (state.failed) return;dbg.location(31,41);
			pushFollow(FOLLOW_statements_in_do_st158);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(31,52);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_do_st160); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(32, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "do_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "do_st"



	// $ANTLR start "function_def"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:1: function_def : type ID LOPEN def_params LCLOSE BOPEN block ( RETURN ( no | STRING | ID ) SEMI )? BCLOSE ;
	public final void function_def() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "function_def");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(33, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:2: ( type ID LOPEN def_params LCLOSE BOPEN block ( RETURN ( no | STRING | ID ) SEMI )? BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:4: type ID LOPEN def_params LCLOSE BOPEN block ( RETURN ( no | STRING | ID ) SEMI )? BCLOSE
			{
			dbg.location(34,4);
			pushFollow(FOLLOW_type_in_function_def170);
			type();
			state._fsp--;
			if (state.failed) return;dbg.location(34,9);
			match(input,ID,FOLLOW_ID_in_function_def172); if (state.failed) return;dbg.location(34,12);
			match(input,LOPEN,FOLLOW_LOPEN_in_function_def174); if (state.failed) return;dbg.location(34,18);
			pushFollow(FOLLOW_def_params_in_function_def176);
			def_params();
			state._fsp--;
			if (state.failed) return;dbg.location(34,29);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_function_def178); if (state.failed) return;dbg.location(34,36);
			match(input,BOPEN,FOLLOW_BOPEN_in_function_def180); if (state.failed) return;dbg.location(34,42);
			pushFollow(FOLLOW_block_in_function_def182);
			block();
			state._fsp--;
			if (state.failed) return;dbg.location(34,48);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:48: ( RETURN ( no | STRING | ID ) SEMI )?
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==RETURN) ) {
				alt6=1;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:49: RETURN ( no | STRING | ID ) SEMI
					{
					dbg.location(34,49);
					match(input,RETURN,FOLLOW_RETURN_in_function_def185); if (state.failed) return;dbg.location(34,55);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:55: ( no | STRING | ID )
					int alt5=3;
					try { dbg.enterSubRule(5);
					try { dbg.enterDecision(5, decisionCanBacktrack[5]);

					switch ( input.LA(1) ) {
					case FLOAT:
					case INT:
						{
						alt5=1;
						}
						break;
					case STRING:
						{
						alt5=2;
						}
						break;
					case ID:
						{
						alt5=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(5);}

					switch (alt5) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:56: no
							{
							dbg.location(34,56);
							pushFollow(FOLLOW_no_in_function_def187);
							no();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:59: STRING
							{
							dbg.location(34,59);
							match(input,STRING,FOLLOW_STRING_in_function_def189); if (state.failed) return;
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:66: ID
							{
							dbg.location(34,66);
							match(input,ID,FOLLOW_ID_in_function_def191); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(5);}
					dbg.location(34,70);
					match(input,SEMI,FOLLOW_SEMI_in_function_def194); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(34,78);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_function_def199); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(35, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function_def");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "function_def"



	// $ANTLR start "def_params"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:36:1: def_params : ( ( type ID ) m |);
	public final void def_params() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "def_params");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(36, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:37:2: ( ( type ID ) m |)
			int alt7=2;
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( ((LA7_0 >= T_CHAR && LA7_0 <= T_STRING)) ) {
				alt7=1;
			}
			else if ( (LA7_0==LCLOSE) ) {
				alt7=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:37:4: ( type ID ) m
					{
					dbg.location(37,4);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:37:4: ( type ID )
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:37:5: type ID
					{
					dbg.location(37,5);
					pushFollow(FOLLOW_type_in_def_params210);
					type();
					state._fsp--;
					if (state.failed) return;dbg.location(37,10);
					match(input,ID,FOLLOW_ID_in_def_params212); if (state.failed) return;
					}
					dbg.location(37,14);
					pushFollow(FOLLOW_m_in_def_params215);
					m();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:38:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(38, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "def_params");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "def_params"



	// $ANTLR start "m"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:1: m : ( ( ',' ( type ID ) )* |);
	public final void m() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "m");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(39, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:3: ( ( ',' ( type ID ) )* |)
			int alt9=2;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			switch ( input.LA(1) ) {
			case 57:
				{
				alt9=1;
				}
				break;
			case LCLOSE:
				{
				int LA9_2 = input.LA(2);
				if ( (synpred14_s()) ) {
					alt9=1;
				}
				else if ( (true) ) {
					alt9=2;
				}

				}
				break;
			case EOF:
				{
				int LA9_3 = input.LA(2);
				if ( (synpred14_s()) ) {
					alt9=1;
				}
				else if ( (true) ) {
					alt9=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:5: ( ',' ( type ID ) )*
					{
					dbg.location(39,5);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:5: ( ',' ( type ID ) )*
					try { dbg.enterSubRule(8);

					loop8:
					while (true) {
						int alt8=2;
						try { dbg.enterDecision(8, decisionCanBacktrack[8]);

						int LA8_0 = input.LA(1);
						if ( (LA8_0==57) ) {
							alt8=1;
						}

						} finally {dbg.exitDecision(8);}

						switch (alt8) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:6: ',' ( type ID )
							{
							dbg.location(39,6);
							match(input,57,FOLLOW_57_in_m226); if (state.failed) return;dbg.location(39,9);
							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:9: ( type ID )
							dbg.enterAlt(1);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:10: type ID
							{
							dbg.location(39,10);
							pushFollow(FOLLOW_type_in_m228);
							type();
							state._fsp--;
							if (state.failed) return;dbg.location(39,15);
							match(input,ID,FOLLOW_ID_in_m230); if (state.failed) return;
							}

							}
							break;

						default :
							break loop8;
						}
					}
					} finally {dbg.exitSubRule(8);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:40:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(40, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "m");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "m"



	// $ANTLR start "function_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:42:1: function_st : ID LOPEN params LCLOSE ( SEMI )? ;
	public final void function_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "function_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(42, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:43:2: ( ID LOPEN params LCLOSE ( SEMI )? )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:43:4: ID LOPEN params LCLOSE ( SEMI )?
			{
			dbg.location(43,4);
			match(input,ID,FOLLOW_ID_in_function_st247); if (state.failed) return;dbg.location(43,7);
			match(input,LOPEN,FOLLOW_LOPEN_in_function_st249); if (state.failed) return;dbg.location(43,13);
			pushFollow(FOLLOW_params_in_function_st251);
			params();
			state._fsp--;
			if (state.failed) return;dbg.location(43,20);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_function_st253); if (state.failed) return;dbg.location(43,27);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:43:27: ( SEMI )?
			int alt10=2;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==SEMI) ) {
				alt10=1;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:43:27: SEMI
					{
					dbg.location(43,27);
					match(input,SEMI,FOLLOW_SEMI_in_function_st255); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(10);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(44, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "function_st"



	// $ANTLR start "params"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:45:1: params : ( ( e | STRING ) f |);
	public final void params() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "params");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:45:8: ( ( e | STRING ) f |)
			int alt12=2;
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			int LA12_0 = input.LA(1);
			if ( (LA12_0==FLOAT||LA12_0==ID||LA12_0==INT||LA12_0==STRING) ) {
				alt12=1;
			}
			else if ( (LA12_0==LCLOSE) ) {
				alt12=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:45:10: ( e | STRING ) f
					{
					dbg.location(45,10);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:45:10: ( e | STRING )
					int alt11=2;
					try { dbg.enterSubRule(11);
					try { dbg.enterDecision(11, decisionCanBacktrack[11]);

					int LA11_0 = input.LA(1);
					if ( (LA11_0==FLOAT||LA11_0==ID||LA11_0==INT) ) {
						alt11=1;
					}
					else if ( (LA11_0==STRING) ) {
						alt11=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(11);}

					switch (alt11) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:45:11: e
							{
							dbg.location(45,11);
							pushFollow(FOLLOW_e_in_params266);
							e();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:45:13: STRING
							{
							dbg.location(45,13);
							match(input,STRING,FOLLOW_STRING_in_params268); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(11);}
					dbg.location(45,21);
					pushFollow(FOLLOW_f_in_params271);
					f();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:46:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(46, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "params");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "params"



	// $ANTLR start "f"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:1: f : ( ( ',' ( e | STRING ) )* |);
	public final void f() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "f");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(47, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:3: ( ( ',' ( e | STRING ) )* |)
			int alt15=2;
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			switch ( input.LA(1) ) {
			case 57:
				{
				alt15=1;
				}
				break;
			case LCLOSE:
				{
				int LA15_2 = input.LA(2);
				if ( (synpred20_s()) ) {
					alt15=1;
				}
				else if ( (true) ) {
					alt15=2;
				}

				}
				break;
			case EOF:
				{
				int LA15_3 = input.LA(2);
				if ( (synpred20_s()) ) {
					alt15=1;
				}
				else if ( (true) ) {
					alt15=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:5: ( ',' ( e | STRING ) )*
					{
					dbg.location(47,5);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:5: ( ',' ( e | STRING ) )*
					try { dbg.enterSubRule(14);

					loop14:
					while (true) {
						int alt14=2;
						try { dbg.enterDecision(14, decisionCanBacktrack[14]);

						int LA14_0 = input.LA(1);
						if ( (LA14_0==57) ) {
							alt14=1;
						}

						} finally {dbg.exitDecision(14);}

						switch (alt14) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:6: ',' ( e | STRING )
							{
							dbg.location(47,6);
							match(input,57,FOLLOW_57_in_f282); if (state.failed) return;dbg.location(47,9);
							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:9: ( e | STRING )
							int alt13=2;
							try { dbg.enterSubRule(13);
							try { dbg.enterDecision(13, decisionCanBacktrack[13]);

							int LA13_0 = input.LA(1);
							if ( (LA13_0==FLOAT||LA13_0==ID||LA13_0==INT) ) {
								alt13=1;
							}
							else if ( (LA13_0==STRING) ) {
								alt13=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								NoViableAltException nvae =
									new NoViableAltException("", 13, 0, input);
								dbg.recognitionException(nvae);
								throw nvae;
							}

							} finally {dbg.exitDecision(13);}

							switch (alt13) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:10: e
									{
									dbg.location(47,10);
									pushFollow(FOLLOW_e_in_f284);
									e();
									state._fsp--;
									if (state.failed) return;
									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:12: STRING
									{
									dbg.location(47,12);
									match(input,STRING,FOLLOW_STRING_in_f286); if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(13);}

							}
							break;

						default :
							break loop14;
						}
					}
					} finally {dbg.exitSubRule(14);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:48:2: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(48, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "f");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "f"



	// $ANTLR start "if_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:50:1: if_st : IF LOPEN condition LCLOSE BOPEN statements BCLOSE ( else_if_st )* ( else_st )? ;
	public final void if_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "if_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(50, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:50:6: ( IF LOPEN condition LCLOSE BOPEN statements BCLOSE ( else_if_st )* ( else_st )? )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:50:9: IF LOPEN condition LCLOSE BOPEN statements BCLOSE ( else_if_st )* ( else_st )?
			{
			dbg.location(50,9);
			match(input,IF,FOLLOW_IF_in_if_st302); if (state.failed) return;dbg.location(50,12);
			match(input,LOPEN,FOLLOW_LOPEN_in_if_st304); if (state.failed) return;dbg.location(50,18);
			pushFollow(FOLLOW_condition_in_if_st306);
			condition();
			state._fsp--;
			if (state.failed) return;dbg.location(50,28);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_if_st308); if (state.failed) return;dbg.location(50,35);
			match(input,BOPEN,FOLLOW_BOPEN_in_if_st310); if (state.failed) return;dbg.location(50,41);
			pushFollow(FOLLOW_statements_in_if_st312);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(50,52);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_if_st314); if (state.failed) return;dbg.location(50,59);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:50:59: ( else_if_st )*
			try { dbg.enterSubRule(16);

			loop16:
			while (true) {
				int alt16=2;
				try { dbg.enterDecision(16, decisionCanBacktrack[16]);

				int LA16_0 = input.LA(1);
				if ( (LA16_0==ELIF) ) {
					alt16=1;
				}

				} finally {dbg.exitDecision(16);}

				switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:50:60: else_if_st
					{
					dbg.location(50,60);
					pushFollow(FOLLOW_else_if_st_in_if_st317);
					else_if_st();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop16;
				}
			}
			} finally {dbg.exitSubRule(16);}
			dbg.location(50,73);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:50:73: ( else_st )?
			int alt17=2;
			try { dbg.enterSubRule(17);
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( (LA17_0==ELSE) ) {
				alt17=1;
			}
			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:50:74: else_st
					{
					dbg.location(50,74);
					pushFollow(FOLLOW_else_st_in_if_st322);
					else_st();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(17);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(51, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "if_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "if_st"



	// $ANTLR start "else_if_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:53:1: else_if_st : ELIF LOPEN condition LCLOSE BOPEN statements BCLOSE ;
	public final void else_if_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "else_if_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(53, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:54:2: ( ELIF LOPEN condition LCLOSE BOPEN statements BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:54:4: ELIF LOPEN condition LCLOSE BOPEN statements BCLOSE
			{
			dbg.location(54,4);
			match(input,ELIF,FOLLOW_ELIF_in_else_if_st335); if (state.failed) return;dbg.location(54,9);
			match(input,LOPEN,FOLLOW_LOPEN_in_else_if_st337); if (state.failed) return;dbg.location(54,15);
			pushFollow(FOLLOW_condition_in_else_if_st339);
			condition();
			state._fsp--;
			if (state.failed) return;dbg.location(54,25);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_else_if_st341); if (state.failed) return;dbg.location(54,32);
			match(input,BOPEN,FOLLOW_BOPEN_in_else_if_st343); if (state.failed) return;dbg.location(54,38);
			pushFollow(FOLLOW_statements_in_else_if_st345);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(54,49);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_else_if_st347); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(55, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "else_if_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "else_if_st"



	// $ANTLR start "else_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:57:1: else_st : ELSE BOPEN statements BCLOSE ;
	public final void else_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "else_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(57, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:57:9: ( ELSE BOPEN statements BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:57:11: ELSE BOPEN statements BCLOSE
			{
			dbg.location(57,11);
			match(input,ELSE,FOLLOW_ELSE_in_else_st359); if (state.failed) return;dbg.location(57,16);
			match(input,BOPEN,FOLLOW_BOPEN_in_else_st361); if (state.failed) return;dbg.location(57,22);
			pushFollow(FOLLOW_statements_in_else_st363);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(57,33);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_else_st365); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(58, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "else_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "else_st"



	// $ANTLR start "condition"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:60:1: condition : e conOp e ;
	public final void condition() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "condition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(60, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:61:2: ( e conOp e )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:61:4: e conOp e
			{
			dbg.location(61,4);
			pushFollow(FOLLOW_e_in_condition377);
			e();
			state._fsp--;
			if (state.failed) return;dbg.location(61,6);
			pushFollow(FOLLOW_conOp_in_condition379);
			conOp();
			state._fsp--;
			if (state.failed) return;dbg.location(61,12);
			pushFollow(FOLLOW_e_in_condition381);
			e();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(62, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "condition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "condition"



	// $ANTLR start "e"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:64:1: e : ( ( ID | no ) ( op ( ID | no ) )* ) ;
	public final void e() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "e");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(64, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:64:3: ( ( ( ID | no ) ( op ( ID | no ) )* ) )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:64:5: ( ( ID | no ) ( op ( ID | no ) )* )
			{
			dbg.location(64,5);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:64:5: ( ( ID | no ) ( op ( ID | no ) )* )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:64:6: ( ID | no ) ( op ( ID | no ) )*
			{
			dbg.location(64,6);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:64:6: ( ID | no )
			int alt18=2;
			try { dbg.enterSubRule(18);
			try { dbg.enterDecision(18, decisionCanBacktrack[18]);

			int LA18_0 = input.LA(1);
			if ( (LA18_0==ID) ) {
				alt18=1;
			}
			else if ( (LA18_0==FLOAT||LA18_0==INT) ) {
				alt18=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(18);}

			switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:64:7: ID
					{
					dbg.location(64,7);
					match(input,ID,FOLLOW_ID_in_e394); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:64:10: no
					{
					dbg.location(64,10);
					pushFollow(FOLLOW_no_in_e396);
					no();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(18);}
			dbg.location(64,14);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:64:14: ( op ( ID | no ) )*
			try { dbg.enterSubRule(20);

			loop20:
			while (true) {
				int alt20=2;
				try { dbg.enterDecision(20, decisionCanBacktrack[20]);

				int LA20_0 = input.LA(1);
				if ( (LA20_0==DIVIDE||LA20_0==MULTIPLY||(LA20_0 >= PLUS && LA20_0 <= REM)||LA20_0==SUB) ) {
					alt20=1;
				}

				} finally {dbg.exitDecision(20);}

				switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:64:15: op ( ID | no )
					{
					dbg.location(64,15);
					pushFollow(FOLLOW_op_in_e400);
					op();
					state._fsp--;
					if (state.failed) return;dbg.location(64,18);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:64:18: ( ID | no )
					int alt19=2;
					try { dbg.enterSubRule(19);
					try { dbg.enterDecision(19, decisionCanBacktrack[19]);

					int LA19_0 = input.LA(1);
					if ( (LA19_0==ID) ) {
						alt19=1;
					}
					else if ( (LA19_0==FLOAT||LA19_0==INT) ) {
						alt19=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 19, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(19);}

					switch (alt19) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:64:19: ID
							{
							dbg.location(64,19);
							match(input,ID,FOLLOW_ID_in_e403); if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:64:22: no
							{
							dbg.location(64,22);
							pushFollow(FOLLOW_no_in_e405);
							no();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(19);}

					}
					break;

				default :
					break loop20;
				}
			}
			} finally {dbg.exitSubRule(20);}

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
		dbg.location(65, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "e");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "e"



	// $ANTLR start "assign_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:67:1: assign_st : ( type ID r | ID r );
	public final void assign_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "assign_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(67, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:68:2: ( type ID r | ID r )
			int alt21=2;
			try { dbg.enterDecision(21, decisionCanBacktrack[21]);

			int LA21_0 = input.LA(1);
			if ( ((LA21_0 >= T_CHAR && LA21_0 <= T_STRING)) ) {
				alt21=1;
			}
			else if ( (LA21_0==ID) ) {
				alt21=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(21);}

			switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:68:4: type ID r
					{
					dbg.location(68,4);
					pushFollow(FOLLOW_type_in_assign_st420);
					type();
					state._fsp--;
					if (state.failed) return;dbg.location(68,10);
					match(input,ID,FOLLOW_ID_in_assign_st423); if (state.failed) return;dbg.location(68,13);
					pushFollow(FOLLOW_r_in_assign_st425);
					r();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:68:17: ID r
					{
					dbg.location(68,17);
					match(input,ID,FOLLOW_ID_in_assign_st429); if (state.failed) return;dbg.location(68,20);
					pushFollow(FOLLOW_r_in_assign_st431);
					r();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(69, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assign_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "assign_st"



	// $ANTLR start "r"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:71:1: r : ASSIGN e SEMI ;
	public final void r() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "r");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(71, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:71:3: ( ASSIGN e SEMI )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:71:5: ASSIGN e SEMI
			{
			dbg.location(71,5);
			match(input,ASSIGN,FOLLOW_ASSIGN_in_r443); if (state.failed) return;dbg.location(71,12);
			pushFollow(FOLLOW_e_in_r445);
			e();
			state._fsp--;
			if (state.failed) return;dbg.location(71,14);
			match(input,SEMI,FOLLOW_SEMI_in_r447); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(72, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "r");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "r"



	// $ANTLR start "type"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:76:1: type : type1 ( COPEN CCLOSE )* ;
	public final void type() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "type");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(76, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:76:6: ( type1 ( COPEN CCLOSE )* )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:76:8: type1 ( COPEN CCLOSE )*
			{
			dbg.location(76,8);
			pushFollow(FOLLOW_type1_in_type459);
			type1();
			state._fsp--;
			if (state.failed) return;dbg.location(76,14);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:76:14: ( COPEN CCLOSE )*
			try { dbg.enterSubRule(22);

			loop22:
			while (true) {
				int alt22=2;
				try { dbg.enterDecision(22, decisionCanBacktrack[22]);

				int LA22_0 = input.LA(1);
				if ( (LA22_0==COPEN) ) {
					alt22=1;
				}

				} finally {dbg.exitDecision(22);}

				switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:76:15: COPEN CCLOSE
					{
					dbg.location(76,15);
					match(input,COPEN,FOLLOW_COPEN_in_type462); if (state.failed) return;dbg.location(76,21);
					match(input,CCLOSE,FOLLOW_CCLOSE_in_type464); if (state.failed) return;
					}
					break;

				default :
					break loop22;
				}
			}
			} finally {dbg.exitSubRule(22);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(77, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "type"



	// $ANTLR start "type1"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:79:1: type1 : ( T_INT | T_FLOAT | T_CHAR | T_STRING );
	public final void type1() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "type1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(79, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:79:7: ( T_INT | T_FLOAT | T_CHAR | T_STRING )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(79,7);
			if ( (input.LA(1) >= T_CHAR && input.LA(1) <= T_STRING) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
		dbg.location(80, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "type1"



	// $ANTLR start "no"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:82:1: no : ( INT | FLOAT );
	public final void no() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "no");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(82, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:82:4: ( INT | FLOAT )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(82,4);
			if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
		dbg.location(83, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "no");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "no"



	// $ANTLR start "op"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:84:1: op : ( POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE );
	public final void op() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "op");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(84, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:84:4: ( POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(84,4);
			if ( input.LA(1)==DIVIDE||input.LA(1)==MULTIPLY||(input.LA(1) >= PLUS && input.LA(1) <= REM)||input.LA(1)==SUB ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
		dbg.location(85, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "op");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "op"



	// $ANTLR start "conOp"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:87:1: conOp : ( NEQ | EQ | GT | GEQ | LT | LEQ );
	public final void conOp() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "conOp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(87, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:87:7: ( NEQ | EQ | GT | GEQ | LT | LEQ )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(87,7);
			if ( input.LA(1)==EQ||(input.LA(1) >= GEQ && input.LA(1) <= GT)||input.LA(1)==LEQ||input.LA(1)==LT||input.LA(1)==NEQ ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
		dbg.location(88, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "conOp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "conOp"



	// $ANTLR start "s"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:91:1: s : ( ID | INT | FLOAT | STRING | CHAR | SWITCH | CASE | ELIF | ELSE | WHILE | DO | FOR | FUNCTION | RETURN | T_INT | T_FLOAT | T_CHAR | T_STRING | SEMI | POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE | ASSIGN | SLL | SRL | AND | OR | XOR | B_AND | B_OR | LOPEN | LCLOSE | BOPEN | BCLOSE | EQ | GT | GEQ | LT | LEQ | NEQ | COPEN | CCLOSE );
	public final void s() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "s");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(91, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:91:3: ( ID | INT | FLOAT | STRING | CHAR | SWITCH | CASE | ELIF | ELSE | WHILE | DO | FOR | FUNCTION | RETURN | T_INT | T_FLOAT | T_CHAR | T_STRING | SEMI | POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE | ASSIGN | SLL | SRL | AND | OR | XOR | B_AND | B_OR | LOPEN | LCLOSE | BOPEN | BCLOSE | EQ | GT | GEQ | LT | LEQ | NEQ | COPEN | CCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(91,3);
			if ( (input.LA(1) >= AND && input.LA(1) <= CHAR)||(input.LA(1) >= COPEN && input.LA(1) <= EQ)||(input.LA(1) >= FLOAT && input.LA(1) <= GT)||input.LA(1)==ID||(input.LA(1) >= INT && input.LA(1) <= NEQ)||(input.LA(1) >= OR && input.LA(1) <= T_STRING)||input.LA(1)==WHILE||input.LA(1)==XOR ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
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
		dbg.location(94, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "s");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "s"

	// $ANTLR start synpred4_s
	public final void synpred4_s_fragment() throws RecognitionException {
		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:21:14: ( statement )
		dbg.enterAlt(1);

		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:21:14: statement
		{
		dbg.location(21,14);
		pushFollow(FOLLOW_statement_in_synpred4_s87);
		statement();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred4_s

	// $ANTLR start synpred14_s
	public final void synpred14_s_fragment() throws RecognitionException {
		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:5: ( ( ',' ( type ID ) )* )
		dbg.enterAlt(1);

		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:5: ( ',' ( type ID ) )*
		{
		dbg.location(39,5);
		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:5: ( ',' ( type ID ) )*
		try { dbg.enterSubRule(24);

		loop24:
		while (true) {
			int alt24=2;
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			int LA24_0 = input.LA(1);
			if ( (LA24_0==57) ) {
				alt24=1;
			}

			} finally {dbg.exitDecision(24);}

			switch (alt24) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:6: ',' ( type ID )
				{
				dbg.location(39,6);
				match(input,57,FOLLOW_57_in_synpred14_s226); if (state.failed) return;dbg.location(39,9);
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:9: ( type ID )
				dbg.enterAlt(1);

				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:10: type ID
				{
				dbg.location(39,10);
				pushFollow(FOLLOW_type_in_synpred14_s228);
				type();
				state._fsp--;
				if (state.failed) return;dbg.location(39,15);
				match(input,ID,FOLLOW_ID_in_synpred14_s230); if (state.failed) return;
				}

				}
				break;

			default :
				break loop24;
			}
		}
		} finally {dbg.exitSubRule(24);}

		}

	}
	// $ANTLR end synpred14_s

	// $ANTLR start synpred20_s
	public final void synpred20_s_fragment() throws RecognitionException {
		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:5: ( ( ',' ( e | STRING ) )* )
		dbg.enterAlt(1);

		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:5: ( ',' ( e | STRING ) )*
		{
		dbg.location(47,5);
		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:5: ( ',' ( e | STRING ) )*
		try { dbg.enterSubRule(28);

		loop28:
		while (true) {
			int alt28=2;
			try { dbg.enterDecision(28, decisionCanBacktrack[28]);

			int LA28_0 = input.LA(1);
			if ( (LA28_0==57) ) {
				alt28=1;
			}

			} finally {dbg.exitDecision(28);}

			switch (alt28) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:6: ',' ( e | STRING )
				{
				dbg.location(47,6);
				match(input,57,FOLLOW_57_in_synpred20_s282); if (state.failed) return;dbg.location(47,9);
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:9: ( e | STRING )
				int alt27=2;
				try { dbg.enterSubRule(27);
				try { dbg.enterDecision(27, decisionCanBacktrack[27]);

				int LA27_0 = input.LA(1);
				if ( (LA27_0==FLOAT||LA27_0==ID||LA27_0==INT) ) {
					alt27=1;
				}
				else if ( (LA27_0==STRING) ) {
					alt27=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					NoViableAltException nvae =
						new NoViableAltException("", 27, 0, input);
					dbg.recognitionException(nvae);
					throw nvae;
				}

				} finally {dbg.exitDecision(27);}

				switch (alt27) {
					case 1 :
						dbg.enterAlt(1);

						// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:10: e
						{
						dbg.location(47,10);
						pushFollow(FOLLOW_e_in_synpred20_s284);
						e();
						state._fsp--;
						if (state.failed) return;
						}
						break;
					case 2 :
						dbg.enterAlt(2);

						// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:12: STRING
						{
						dbg.location(47,12);
						match(input,STRING,FOLLOW_STRING_in_synpred20_s286); if (state.failed) return;
						}
						break;

				}
				} finally {dbg.exitSubRule(27);}

				}
				break;

			default :
				break loop28;
			}
		}
		} finally {dbg.exitSubRule(28);}

		}

	}
	// $ANTLR end synpred20_s

	// Delegated rules

	public final boolean synpred14_s() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred14_s_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_s() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred4_s_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred20_s() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred20_s_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		dbg.endBacktrack(state.backtracking, success);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA2 dfa2 = new DFA2(this);
	static final String DFA2_eotS =
		"\10\uffff";
	static final String DFA2_eofS =
		"\10\uffff";
	static final String DFA2_minS =
		"\1\7\1\16\2\uffff\1\13\1\5\1\16\1\uffff";
	static final String DFA2_maxS =
		"\1\66\1\34\2\uffff\1\13\1\41\1\34\1\uffff";
	static final String DFA2_acceptS =
		"\2\uffff\1\2\1\3\3\uffff\1\1";
	static final String DFA2_specialS =
		"\10\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\2\10\uffff\1\3\13\uffff\2\3\23\uffff\4\1\1\uffff\1\3",
			"\1\4\15\uffff\1\5",
			"",
			"",
			"\1\6",
			"\1\3\33\uffff\1\7",
			"\1\4\15\uffff\1\5",
			""
	};

	static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
	static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
	static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
	static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
	static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
	static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
	static final short[][] DFA2_transition;

	static {
		int numStates = DFA2_transitionS.length;
		DFA2_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
		}
	}

	protected class DFA2 extends DFA {

		public DFA2(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 2;
			this.eot = DFA2_eot;
			this.eof = DFA2_eof;
			this.min = DFA2_min;
			this.max = DFA2_max;
			this.accept = DFA2_accept;
			this.special = DFA2_special;
			this.transition = DFA2_transition;
		}
		@Override
		public String getDescription() {
			return "14:1: blocks : ( function_def | BOPEN block BCLOSE | block );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_blocks_in_start37 = new BitSet(new long[]{0x005E000030010080L});
	public static final BitSet FOLLOW_EOF_in_start40 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_def_in_blocks50 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOPEN_in_blocks53 = new BitSet(new long[]{0x005E000030010000L});
	public static final BitSet FOLLOW_block_in_blocks55 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_blocks57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_blocks61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statements_in_block72 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements85 = new BitSet(new long[]{0x005E000030010002L});
	public static final BitSet FOLLOW_statement_in_statements87 = new BitSet(new long[]{0x005E000030010002L});
	public static final BitSet FOLLOW_assign_st_in_statement100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_st_in_statement104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_st_in_statement108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_st_in_statement112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_do_st_in_statement115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_st125 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_while_st127 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_condition_in_while_st129 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_while_st131 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_while_st133 = new BitSet(new long[]{0x005E000030010000L});
	public static final BitSet FOLLOW_statements_in_while_st135 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_while_st137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_do_st148 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_do_st150 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_condition_in_do_st152 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_do_st154 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_do_st156 = new BitSet(new long[]{0x005E000030010000L});
	public static final BitSet FOLLOW_statements_in_do_st158 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_do_st160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_function_def170 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_function_def172 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_function_def174 = new BitSet(new long[]{0x001E000080000000L});
	public static final BitSet FOLLOW_def_params_in_function_def176 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_function_def178 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_function_def180 = new BitSet(new long[]{0x005E000030010000L});
	public static final BitSet FOLLOW_block_in_function_def182 = new BitSet(new long[]{0x0000040000000040L});
	public static final BitSet FOLLOW_RETURN_in_function_def185 = new BitSet(new long[]{0x0000400050400000L});
	public static final BitSet FOLLOW_no_in_function_def187 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_STRING_in_function_def189 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_function_def191 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_function_def194 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_function_def199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_def_params210 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_def_params212 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_m_in_def_params215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_m226 = new BitSet(new long[]{0x001E000000000000L});
	public static final BitSet FOLLOW_type_in_m228 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_m230 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_ID_in_function_st247 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_function_st249 = new BitSet(new long[]{0x00004000D0400000L});
	public static final BitSet FOLLOW_params_in_function_st251 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_function_st253 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_SEMI_in_function_st255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_e_in_params266 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_STRING_in_params268 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_f_in_params271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_f282 = new BitSet(new long[]{0x0000400050400000L});
	public static final BitSet FOLLOW_e_in_f284 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_STRING_in_f286 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_IF_in_if_st302 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_if_st304 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_condition_in_if_st306 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_if_st308 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_if_st310 = new BitSet(new long[]{0x005E000030010000L});
	public static final BitSet FOLLOW_statements_in_if_st312 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_if_st314 = new BitSet(new long[]{0x0000000000060002L});
	public static final BitSet FOLLOW_else_if_st_in_if_st317 = new BitSet(new long[]{0x0000000000060002L});
	public static final BitSet FOLLOW_else_st_in_if_st322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELIF_in_else_if_st335 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_else_if_st337 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_condition_in_else_if_st339 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_else_if_st341 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_else_if_st343 = new BitSet(new long[]{0x005E000030010000L});
	public static final BitSet FOLLOW_statements_in_else_if_st345 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_else_if_st347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_st359 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_else_st361 = new BitSet(new long[]{0x005E000030010000L});
	public static final BitSet FOLLOW_statements_in_else_st363 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_else_st365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_e_in_condition377 = new BitSet(new long[]{0x0000001506080000L});
	public static final BitSet FOLLOW_conOp_in_condition379 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_e_in_condition381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_e394 = new BitSet(new long[]{0x0000838800008002L});
	public static final BitSet FOLLOW_no_in_e396 = new BitSet(new long[]{0x0000838800008002L});
	public static final BitSet FOLLOW_op_in_e400 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_ID_in_e403 = new BitSet(new long[]{0x0000838800008002L});
	public static final BitSet FOLLOW_no_in_e405 = new BitSet(new long[]{0x0000838800008002L});
	public static final BitSet FOLLOW_type_in_assign_st420 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_assign_st423 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_r_in_assign_st425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assign_st429 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_r_in_assign_st431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_r443 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_e_in_r445 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_r447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type1_in_type459 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COPEN_in_type462 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CCLOSE_in_type464 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_statement_in_synpred4_s87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_synpred14_s226 = new BitSet(new long[]{0x001E000000000000L});
	public static final BitSet FOLLOW_type_in_synpred14_s228 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_synpred14_s230 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_57_in_synpred20_s282 = new BitSet(new long[]{0x0000400050400000L});
	public static final BitSet FOLLOW_e_in_synpred20_s284 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_STRING_in_synpred20_s286 = new BitSet(new long[]{0x0200000000000002L});
}
