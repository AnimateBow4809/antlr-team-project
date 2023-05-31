// $ANTLR 3.5.1 C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g 2023-05-31 21:14:03

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
		"invalidRule", "synpred95_s", "synpred81_s", "synpred25_s", "do_st", "synpred21_s", 
		"condition2", "synpred72_s", "synpred4_s", "synpred8_s", "synpred9_s", 
		"synpred22_s", "synpred60_s", "synpred52_s", "synpred85_s", "synpred15_s", 
		"else_st", "s", "type1", "synpred10_s", "synpred53_s", "synpred78_s", 
		"synpred12_s", "synpred62_s", "synpred6_s", "synpred70_s", "synpred18_s", 
		"synpred46_s", "c", "synpred40_s", "synpred50_s", "synpred90_s", "synpred17_s", 
		"r", "assign_st", "synpred93_s", "params", "synpred34_s", "synpred48_s", 
		"synpred63_s", "block", "e", "m", "synpred39_s", "synpred16_s", "synpred24_s", 
		"condition", "synpred33_s", "synpred77_s", "synpred11_s", "synpred64_s", 
		"synpred69_s", "synpred59_s", "function_def", "function_st", "synpred35_s", 
		"synpred30_s", "synpred75_s", "synpred76_s", "synpred67_s", "synpred100_s", 
		"switch_st", "synpred97_s", "synpred37_s", "synpred55_s", "synpred91_s", 
		"synpred88_s", "synpred92_s", "else_if_st", "synpred71_s", "synpred36_s", 
		"synpred84_s", "f", "synpred19_s", "start", "b_op", "no", "synpred7_s", 
		"synpred1_s", "synpred96_s", "synpred43_s", "synpred79_s", "synpred87_s", 
		"for_st", "conOp", "synpred99_s", "def_params", "synpred73_s", "synpred94_s", 
		"blocks", "case_st", "synpred20_s", "synpred82_s", "synpred2_s", "synpred44_s", 
		"synpred57_s", "synpred66_s", "synpred31_s", "op", "synpred89_s", "synpred23_s", 
		"synpred61_s", "synpred49_s", "synpred26_s", "synpred56_s", "synpred68_s", 
		"synpred29_s", "type", "synpred80_s", "synpred54_s", "while_st", "synpred58_s", 
		"synpred47_s", "synpred38_s", "synpred13_s", "synpred51_s", "synpred3_s", 
		"synpred86_s", "synpred65_s", "statements", "synpred27_s", "synpred42_s", 
		"synpred28_s", "if_st", "synpred32_s", "synpred74_s", "synpred83_s", "synpred45_s", 
		"synpred98_s", "synpred5_s", "statement", "synpred14_s", "synpred41_s"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, true, false, false, false, false, false, false, false, false, 
		    false, true, false, false, false, false, false, false, false, false, 
		    false, false, true, false, false, false, false, false, false, false, 
		    false, false, false, false
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
				if ( (LA1_0==BOPEN||LA1_0==DO||(LA1_0 >= FOR && LA1_0 <= FUNCTION)||(LA1_0 >= ID && LA1_0 <= IF)||(LA1_0 >= SWITCH && LA1_0 <= T_STRING)||LA1_0==WHILE) ) {
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

			switch ( input.LA(1) ) {
			case FUNCTION:
				{
				alt2=1;
				}
				break;
			case BOPEN:
				{
				alt2=2;
				}
				break;
			case DO:
			case FOR:
			case ID:
			case IF:
			case SWITCH:
			case T_CHAR:
			case T_FLOAT:
			case T_INT:
			case T_STRING:
			case WHILE:
				{
				alt2=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
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
					int LA3_5 = input.LA(2);
					if ( (synpred4_s()) ) {
						alt3=1;
					}

					}
					break;
				case ID:
					{
					int LA3_6 = input.LA(2);
					if ( (synpred4_s()) ) {
						alt3=1;
					}

					}
					break;
				case IF:
					{
					int LA3_7 = input.LA(2);
					if ( (synpred4_s()) ) {
						alt3=1;
					}

					}
					break;
				case WHILE:
					{
					int LA3_8 = input.LA(2);
					if ( (synpred4_s()) ) {
						alt3=1;
					}

					}
					break;
				case DO:
					{
					int LA3_9 = input.LA(2);
					if ( (synpred4_s()) ) {
						alt3=1;
					}

					}
					break;
				case FOR:
					{
					int LA3_10 = input.LA(2);
					if ( (synpred4_s()) ) {
						alt3=1;
					}

					}
					break;
				case SWITCH:
					{
					int LA3_11 = input.LA(2);
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
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:24:1: statement : ( assign_st SEMI | if_st | function_st | while_st | do_st | for_st | switch_st );
	public final void statement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(24, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:25:2: ( assign_st SEMI | if_st | function_st | while_st | do_st | for_st | switch_st )
			int alt4=7;
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
			case FOR:
				{
				alt4=6;
				}
				break;
			case SWITCH:
				{
				alt4=7;
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

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:25:4: assign_st SEMI
					{
					dbg.location(25,4);
					pushFollow(FOLLOW_assign_st_in_statement100);
					assign_st();
					state._fsp--;
					if (state.failed) return;dbg.location(25,14);
					match(input,SEMI,FOLLOW_SEMI_in_statement102); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:25:21: if_st
					{
					dbg.location(25,21);
					pushFollow(FOLLOW_if_st_in_statement106);
					if_st();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:25:29: function_st
					{
					dbg.location(25,29);
					pushFollow(FOLLOW_function_st_in_statement110);
					function_st();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:25:43: while_st
					{
					dbg.location(25,43);
					pushFollow(FOLLOW_while_st_in_statement114);
					while_st();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:25:53: do_st
					{
					dbg.location(25,53);
					pushFollow(FOLLOW_do_st_in_statement117);
					do_st();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:25:60: for_st
					{
					dbg.location(25,60);
					pushFollow(FOLLOW_for_st_in_statement120);
					for_st();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:25:68: switch_st
					{
					dbg.location(25,68);
					pushFollow(FOLLOW_switch_st_in_statement123);
					switch_st();
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



	// $ANTLR start "switch_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:28:1: switch_st : SWITCH LOPEN ID LCLOSE BOPEN ( case_st )* BCLOSE ;
	public final void switch_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "switch_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(28, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:29:2: ( SWITCH LOPEN ID LCLOSE BOPEN ( case_st )* BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:29:4: SWITCH LOPEN ID LCLOSE BOPEN ( case_st )* BCLOSE
			{
			dbg.location(29,4);
			match(input,SWITCH,FOLLOW_SWITCH_in_switch_st135); if (state.failed) return;dbg.location(29,11);
			match(input,LOPEN,FOLLOW_LOPEN_in_switch_st137); if (state.failed) return;dbg.location(29,17);
			match(input,ID,FOLLOW_ID_in_switch_st139); if (state.failed) return;dbg.location(29,20);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_switch_st141); if (state.failed) return;dbg.location(29,27);
			match(input,BOPEN,FOLLOW_BOPEN_in_switch_st143); if (state.failed) return;dbg.location(29,33);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:29:33: ( case_st )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( (LA5_0==CASE) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:29:33: case_st
					{
					dbg.location(29,33);
					pushFollow(FOLLOW_case_st_in_switch_st145);
					case_st();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop5;
				}
			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(29,42);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_switch_st148); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(30, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "switch_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "switch_st"



	// $ANTLR start "case_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:31:1: case_st : CASE LOPEN no LCLOSE BOPEN statements BCLOSE ;
	public final void case_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "case_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(31, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:31:9: ( CASE LOPEN no LCLOSE BOPEN statements BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:31:11: CASE LOPEN no LCLOSE BOPEN statements BCLOSE
			{
			dbg.location(31,11);
			match(input,CASE,FOLLOW_CASE_in_case_st158); if (state.failed) return;dbg.location(31,16);
			match(input,LOPEN,FOLLOW_LOPEN_in_case_st160); if (state.failed) return;dbg.location(31,22);
			pushFollow(FOLLOW_no_in_case_st162);
			no();
			state._fsp--;
			if (state.failed) return;dbg.location(31,25);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_case_st164); if (state.failed) return;dbg.location(31,32);
			match(input,BOPEN,FOLLOW_BOPEN_in_case_st166); if (state.failed) return;dbg.location(31,38);
			pushFollow(FOLLOW_statements_in_case_st168);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(31,49);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_case_st170); if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "case_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "case_st"



	// $ANTLR start "for_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:1: for_st : FOR LOPEN ( ( assign_st )? SEMI ( condition )? SEMI ( assign_st )? ) LCLOSE BOPEN statements BCLOSE ;
	public final void for_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "for_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(33, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:8: ( FOR LOPEN ( ( assign_st )? SEMI ( condition )? SEMI ( assign_st )? ) LCLOSE BOPEN statements BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:10: FOR LOPEN ( ( assign_st )? SEMI ( condition )? SEMI ( assign_st )? ) LCLOSE BOPEN statements BCLOSE
			{
			dbg.location(33,10);
			match(input,FOR,FOLLOW_FOR_in_for_st180); if (state.failed) return;dbg.location(33,14);
			match(input,LOPEN,FOLLOW_LOPEN_in_for_st182); if (state.failed) return;dbg.location(33,19);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:19: ( ( assign_st )? SEMI ( condition )? SEMI ( assign_st )? )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:20: ( assign_st )? SEMI ( condition )? SEMI ( assign_st )?
			{
			dbg.location(33,20);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:20: ( assign_st )?
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID||(LA6_0 >= T_CHAR && LA6_0 <= T_STRING)) ) {
				alt6=1;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:20: assign_st
					{
					dbg.location(33,20);
					pushFollow(FOLLOW_assign_st_in_for_st184);
					assign_st();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(33,31);
			match(input,SEMI,FOLLOW_SEMI_in_for_st187); if (state.failed) return;dbg.location(33,36);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:36: ( condition )?
			int alt7=2;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==FLOAT||LA7_0==ID||LA7_0==INT||LA7_0==LOPEN) ) {
				alt7=1;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:36: condition
					{
					dbg.location(33,36);
					pushFollow(FOLLOW_condition_in_for_st189);
					condition();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(7);}
			dbg.location(33,47);
			match(input,SEMI,FOLLOW_SEMI_in_for_st192); if (state.failed) return;dbg.location(33,52);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:52: ( assign_st )?
			int alt8=2;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==ID||(LA8_0 >= T_CHAR && LA8_0 <= T_STRING)) ) {
				alt8=1;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:52: assign_st
					{
					dbg.location(33,52);
					pushFollow(FOLLOW_assign_st_in_for_st194);
					assign_st();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(8);}

			}
			dbg.location(33,63);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_for_st197); if (state.failed) return;dbg.location(33,70);
			match(input,BOPEN,FOLLOW_BOPEN_in_for_st199); if (state.failed) return;dbg.location(33,76);
			pushFollow(FOLLOW_statements_in_for_st201);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(33,87);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_for_st203); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(34, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "for_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "for_st"



	// $ANTLR start "while_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:35:1: while_st : WHILE LOPEN condition LCLOSE BOPEN statements BCLOSE ;
	public final void while_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "while_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(35, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:35:9: ( WHILE LOPEN condition LCLOSE BOPEN statements BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:35:11: WHILE LOPEN condition LCLOSE BOPEN statements BCLOSE
			{
			dbg.location(35,11);
			match(input,WHILE,FOLLOW_WHILE_in_while_st211); if (state.failed) return;dbg.location(35,17);
			match(input,LOPEN,FOLLOW_LOPEN_in_while_st213); if (state.failed) return;dbg.location(35,23);
			pushFollow(FOLLOW_condition_in_while_st215);
			condition();
			state._fsp--;
			if (state.failed) return;dbg.location(35,33);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_while_st217); if (state.failed) return;dbg.location(35,40);
			match(input,BOPEN,FOLLOW_BOPEN_in_while_st219); if (state.failed) return;dbg.location(35,46);
			pushFollow(FOLLOW_statements_in_while_st221);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(35,57);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_while_st223); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(36, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "while_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "while_st"



	// $ANTLR start "do_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:38:1: do_st : DO LOPEN condition LCLOSE BOPEN statements BCLOSE ;
	public final void do_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "do_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(38, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:38:7: ( DO LOPEN condition LCLOSE BOPEN statements BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:38:9: DO LOPEN condition LCLOSE BOPEN statements BCLOSE
			{
			dbg.location(38,9);
			match(input,DO,FOLLOW_DO_in_do_st234); if (state.failed) return;dbg.location(38,12);
			match(input,LOPEN,FOLLOW_LOPEN_in_do_st236); if (state.failed) return;dbg.location(38,18);
			pushFollow(FOLLOW_condition_in_do_st238);
			condition();
			state._fsp--;
			if (state.failed) return;dbg.location(38,28);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_do_st240); if (state.failed) return;dbg.location(38,35);
			match(input,BOPEN,FOLLOW_BOPEN_in_do_st242); if (state.failed) return;dbg.location(38,41);
			pushFollow(FOLLOW_statements_in_do_st244);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(38,52);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_do_st246); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(39, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "do_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "do_st"



	// $ANTLR start "function_def"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:40:1: function_def : FUNCTION type ID LOPEN def_params LCLOSE BOPEN block ( RETURN ( no | STRING | ID ) SEMI )? BCLOSE ;
	public final void function_def() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "function_def");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(40, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:2: ( FUNCTION type ID LOPEN def_params LCLOSE BOPEN block ( RETURN ( no | STRING | ID ) SEMI )? BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:4: FUNCTION type ID LOPEN def_params LCLOSE BOPEN block ( RETURN ( no | STRING | ID ) SEMI )? BCLOSE
			{
			dbg.location(41,4);
			match(input,FUNCTION,FOLLOW_FUNCTION_in_function_def256); if (state.failed) return;dbg.location(41,13);
			pushFollow(FOLLOW_type_in_function_def258);
			type();
			state._fsp--;
			if (state.failed) return;dbg.location(41,18);
			match(input,ID,FOLLOW_ID_in_function_def260); if (state.failed) return;dbg.location(41,21);
			match(input,LOPEN,FOLLOW_LOPEN_in_function_def262); if (state.failed) return;dbg.location(41,27);
			pushFollow(FOLLOW_def_params_in_function_def264);
			def_params();
			state._fsp--;
			if (state.failed) return;dbg.location(41,38);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_function_def266); if (state.failed) return;dbg.location(41,45);
			match(input,BOPEN,FOLLOW_BOPEN_in_function_def268); if (state.failed) return;dbg.location(41,51);
			pushFollow(FOLLOW_block_in_function_def270);
			block();
			state._fsp--;
			if (state.failed) return;dbg.location(41,57);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:57: ( RETURN ( no | STRING | ID ) SEMI )?
			int alt10=2;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==RETURN) ) {
				alt10=1;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:58: RETURN ( no | STRING | ID ) SEMI
					{
					dbg.location(41,58);
					match(input,RETURN,FOLLOW_RETURN_in_function_def273); if (state.failed) return;dbg.location(41,64);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:64: ( no | STRING | ID )
					int alt9=3;
					try { dbg.enterSubRule(9);
					try { dbg.enterDecision(9, decisionCanBacktrack[9]);

					switch ( input.LA(1) ) {
					case FLOAT:
					case INT:
						{
						alt9=1;
						}
						break;
					case STRING:
						{
						alt9=2;
						}
						break;
					case ID:
						{
						alt9=3;
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

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:65: no
							{
							dbg.location(41,65);
							pushFollow(FOLLOW_no_in_function_def275);
							no();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:68: STRING
							{
							dbg.location(41,68);
							match(input,STRING,FOLLOW_STRING_in_function_def277); if (state.failed) return;
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:75: ID
							{
							dbg.location(41,75);
							match(input,ID,FOLLOW_ID_in_function_def279); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(9);}
					dbg.location(41,79);
					match(input,SEMI,FOLLOW_SEMI_in_function_def282); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(10);}
			dbg.location(41,87);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_function_def287); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(42, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function_def");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "function_def"



	// $ANTLR start "def_params"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:43:1: def_params : ( ( type ID ) m |);
	public final void def_params() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "def_params");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:44:2: ( ( type ID ) m |)
			int alt11=2;
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( ((LA11_0 >= T_CHAR && LA11_0 <= T_STRING)) ) {
				alt11=1;
			}
			else if ( (LA11_0==LCLOSE) ) {
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

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:44:4: ( type ID ) m
					{
					dbg.location(44,4);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:44:4: ( type ID )
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:44:5: type ID
					{
					dbg.location(44,5);
					pushFollow(FOLLOW_type_in_def_params298);
					type();
					state._fsp--;
					if (state.failed) return;dbg.location(44,10);
					match(input,ID,FOLLOW_ID_in_def_params300); if (state.failed) return;
					}
					dbg.location(44,14);
					pushFollow(FOLLOW_m_in_def_params303);
					m();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:45:2: 
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
		dbg.location(45, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "def_params");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "def_params"



	// $ANTLR start "m"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:46:1: m : ( ( ',' ( type ID ) )* |);
	public final void m() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "m");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(46, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:46:3: ( ( ',' ( type ID ) )* |)
			int alt13=2;
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			switch ( input.LA(1) ) {
			case 57:
				{
				alt13=1;
				}
				break;
			case LCLOSE:
				{
				int LA13_2 = input.LA(2);
				if ( (synpred20_s()) ) {
					alt13=1;
				}
				else if ( (true) ) {
					alt13=2;
				}

				}
				break;
			case EOF:
				{
				int LA13_3 = input.LA(2);
				if ( (synpred20_s()) ) {
					alt13=1;
				}
				else if ( (true) ) {
					alt13=2;
				}

				}
				break;
			default:
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

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:46:5: ( ',' ( type ID ) )*
					{
					dbg.location(46,5);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:46:5: ( ',' ( type ID ) )*
					try { dbg.enterSubRule(12);

					loop12:
					while (true) {
						int alt12=2;
						try { dbg.enterDecision(12, decisionCanBacktrack[12]);

						int LA12_0 = input.LA(1);
						if ( (LA12_0==57) ) {
							alt12=1;
						}

						} finally {dbg.exitDecision(12);}

						switch (alt12) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:46:6: ',' ( type ID )
							{
							dbg.location(46,6);
							match(input,57,FOLLOW_57_in_m314); if (state.failed) return;dbg.location(46,9);
							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:46:9: ( type ID )
							dbg.enterAlt(1);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:46:10: type ID
							{
							dbg.location(46,10);
							pushFollow(FOLLOW_type_in_m316);
							type();
							state._fsp--;
							if (state.failed) return;dbg.location(46,15);
							match(input,ID,FOLLOW_ID_in_m318); if (state.failed) return;
							}

							}
							break;

						default :
							break loop12;
						}
					}
					} finally {dbg.exitSubRule(12);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:2: 
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
		dbg.location(47, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "m");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "m"



	// $ANTLR start "function_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:49:1: function_st : ID LOPEN params LCLOSE ( SEMI )? ;
	public final void function_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "function_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(49, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:50:2: ( ID LOPEN params LCLOSE ( SEMI )? )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:50:4: ID LOPEN params LCLOSE ( SEMI )?
			{
			dbg.location(50,4);
			match(input,ID,FOLLOW_ID_in_function_st335); if (state.failed) return;dbg.location(50,7);
			match(input,LOPEN,FOLLOW_LOPEN_in_function_st337); if (state.failed) return;dbg.location(50,13);
			pushFollow(FOLLOW_params_in_function_st339);
			params();
			state._fsp--;
			if (state.failed) return;dbg.location(50,20);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_function_st341); if (state.failed) return;dbg.location(50,27);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:50:27: ( SEMI )?
			int alt14=2;
			try { dbg.enterSubRule(14);
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( (LA14_0==SEMI) ) {
				alt14=1;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:50:27: SEMI
					{
					dbg.location(50,27);
					match(input,SEMI,FOLLOW_SEMI_in_function_st343); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(14);}

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
			dbg.exitRule(getGrammarFileName(), "function_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "function_st"



	// $ANTLR start "params"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:52:1: params : ( ( e | STRING ) f |);
	public final void params() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "params");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(52, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:52:8: ( ( e | STRING ) f |)
			int alt16=2;
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			int LA16_0 = input.LA(1);
			if ( (LA16_0==FLOAT||LA16_0==ID||LA16_0==INT||LA16_0==STRING) ) {
				alt16=1;
			}
			else if ( (LA16_0==LCLOSE) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:52:10: ( e | STRING ) f
					{
					dbg.location(52,10);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:52:10: ( e | STRING )
					int alt15=2;
					try { dbg.enterSubRule(15);
					try { dbg.enterDecision(15, decisionCanBacktrack[15]);

					int LA15_0 = input.LA(1);
					if ( (LA15_0==FLOAT||LA15_0==ID||LA15_0==INT) ) {
						alt15=1;
					}
					else if ( (LA15_0==STRING) ) {
						alt15=2;
					}

					else {
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

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:52:11: e
							{
							dbg.location(52,11);
							pushFollow(FOLLOW_e_in_params354);
							e();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:52:13: STRING
							{
							dbg.location(52,13);
							match(input,STRING,FOLLOW_STRING_in_params356); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(15);}
					dbg.location(52,21);
					pushFollow(FOLLOW_f_in_params359);
					f();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:53:2: 
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
		dbg.location(53, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "params");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "params"



	// $ANTLR start "f"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:54:1: f : ( ',' ( e | STRING ) )* ;
	public final void f() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "f");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(54, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:54:3: ( ( ',' ( e | STRING ) )* )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:54:5: ( ',' ( e | STRING ) )*
			{
			dbg.location(54,5);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:54:5: ( ',' ( e | STRING ) )*
			try { dbg.enterSubRule(18);

			loop18:
			while (true) {
				int alt18=2;
				try { dbg.enterDecision(18, decisionCanBacktrack[18]);

				int LA18_0 = input.LA(1);
				if ( (LA18_0==57) ) {
					alt18=1;
				}

				} finally {dbg.exitDecision(18);}

				switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:54:6: ',' ( e | STRING )
					{
					dbg.location(54,6);
					match(input,57,FOLLOW_57_in_f370); if (state.failed) return;dbg.location(54,9);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:54:9: ( e | STRING )
					int alt17=2;
					try { dbg.enterSubRule(17);
					try { dbg.enterDecision(17, decisionCanBacktrack[17]);

					int LA17_0 = input.LA(1);
					if ( (LA17_0==FLOAT||LA17_0==ID||LA17_0==INT) ) {
						alt17=1;
					}
					else if ( (LA17_0==STRING) ) {
						alt17=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(17);}

					switch (alt17) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:54:10: e
							{
							dbg.location(54,10);
							pushFollow(FOLLOW_e_in_f372);
							e();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:54:12: STRING
							{
							dbg.location(54,12);
							match(input,STRING,FOLLOW_STRING_in_f374); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(17);}

					}
					break;

				default :
					break loop18;
				}
			}
			} finally {dbg.exitSubRule(18);}

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
			dbg.exitRule(getGrammarFileName(), "f");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "f"



	// $ANTLR start "if_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:57:1: if_st : IF LOPEN condition LCLOSE BOPEN statements BCLOSE ( else_if_st )* ( else_st )? ;
	public final void if_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "if_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(57, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:57:6: ( IF LOPEN condition LCLOSE BOPEN statements BCLOSE ( else_if_st )* ( else_st )? )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:57:9: IF LOPEN condition LCLOSE BOPEN statements BCLOSE ( else_if_st )* ( else_st )?
			{
			dbg.location(57,9);
			match(input,IF,FOLLOW_IF_in_if_st389); if (state.failed) return;dbg.location(57,12);
			match(input,LOPEN,FOLLOW_LOPEN_in_if_st391); if (state.failed) return;dbg.location(57,18);
			pushFollow(FOLLOW_condition_in_if_st393);
			condition();
			state._fsp--;
			if (state.failed) return;dbg.location(57,28);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_if_st395); if (state.failed) return;dbg.location(57,35);
			match(input,BOPEN,FOLLOW_BOPEN_in_if_st397); if (state.failed) return;dbg.location(57,41);
			pushFollow(FOLLOW_statements_in_if_st399);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(57,52);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_if_st401); if (state.failed) return;dbg.location(57,59);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:57:59: ( else_if_st )*
			try { dbg.enterSubRule(19);

			loop19:
			while (true) {
				int alt19=2;
				try { dbg.enterDecision(19, decisionCanBacktrack[19]);

				int LA19_0 = input.LA(1);
				if ( (LA19_0==ELIF) ) {
					alt19=1;
				}

				} finally {dbg.exitDecision(19);}

				switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:57:60: else_if_st
					{
					dbg.location(57,60);
					pushFollow(FOLLOW_else_if_st_in_if_st404);
					else_if_st();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop19;
				}
			}
			} finally {dbg.exitSubRule(19);}
			dbg.location(57,73);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:57:73: ( else_st )?
			int alt20=2;
			try { dbg.enterSubRule(20);
			try { dbg.enterDecision(20, decisionCanBacktrack[20]);

			int LA20_0 = input.LA(1);
			if ( (LA20_0==ELSE) ) {
				alt20=1;
			}
			} finally {dbg.exitDecision(20);}

			switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:57:74: else_st
					{
					dbg.location(57,74);
					pushFollow(FOLLOW_else_st_in_if_st409);
					else_st();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(20);}

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
			dbg.exitRule(getGrammarFileName(), "if_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "if_st"



	// $ANTLR start "else_if_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:60:1: else_if_st : ELIF LOPEN condition LCLOSE BOPEN statements BCLOSE ;
	public final void else_if_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "else_if_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(60, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:61:2: ( ELIF LOPEN condition LCLOSE BOPEN statements BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:61:4: ELIF LOPEN condition LCLOSE BOPEN statements BCLOSE
			{
			dbg.location(61,4);
			match(input,ELIF,FOLLOW_ELIF_in_else_if_st422); if (state.failed) return;dbg.location(61,9);
			match(input,LOPEN,FOLLOW_LOPEN_in_else_if_st424); if (state.failed) return;dbg.location(61,15);
			pushFollow(FOLLOW_condition_in_else_if_st426);
			condition();
			state._fsp--;
			if (state.failed) return;dbg.location(61,25);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_else_if_st428); if (state.failed) return;dbg.location(61,32);
			match(input,BOPEN,FOLLOW_BOPEN_in_else_if_st430); if (state.failed) return;dbg.location(61,38);
			pushFollow(FOLLOW_statements_in_else_if_st432);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(61,49);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_else_if_st434); if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "else_if_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "else_if_st"



	// $ANTLR start "else_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:64:1: else_st : ELSE BOPEN statements BCLOSE ;
	public final void else_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "else_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(64, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:64:9: ( ELSE BOPEN statements BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:64:11: ELSE BOPEN statements BCLOSE
			{
			dbg.location(64,11);
			match(input,ELSE,FOLLOW_ELSE_in_else_st446); if (state.failed) return;dbg.location(64,16);
			match(input,BOPEN,FOLLOW_BOPEN_in_else_st448); if (state.failed) return;dbg.location(64,22);
			pushFollow(FOLLOW_statements_in_else_st450);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(64,33);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_else_st452); if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "else_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "else_st"



	// $ANTLR start "condition"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:67:1: condition : ( condition2 c | LOPEN condition2 LCLOSE c );
	public final void condition() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "condition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(67, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:68:2: ( condition2 c | LOPEN condition2 LCLOSE c )
			int alt21=2;
			try { dbg.enterDecision(21, decisionCanBacktrack[21]);

			int LA21_0 = input.LA(1);
			if ( (LA21_0==FLOAT||LA21_0==ID||LA21_0==INT) ) {
				alt21=1;
			}
			else if ( (LA21_0==LOPEN) ) {
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

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:68:4: condition2 c
					{
					dbg.location(68,4);
					pushFollow(FOLLOW_condition2_in_condition464);
					condition2();
					state._fsp--;
					if (state.failed) return;dbg.location(68,15);
					pushFollow(FOLLOW_c_in_condition466);
					c();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:68:19: LOPEN condition2 LCLOSE c
					{
					dbg.location(68,19);
					match(input,LOPEN,FOLLOW_LOPEN_in_condition470); if (state.failed) return;dbg.location(68,25);
					pushFollow(FOLLOW_condition2_in_condition472);
					condition2();
					state._fsp--;
					if (state.failed) return;dbg.location(68,36);
					match(input,LCLOSE,FOLLOW_LCLOSE_in_condition474); if (state.failed) return;dbg.location(68,43);
					pushFollow(FOLLOW_c_in_condition476);
					c();
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
			dbg.exitRule(getGrammarFileName(), "condition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "condition"



	// $ANTLR start "c"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:70:1: c : ( ( b_op condition2 )* | ( b_op LOPEN condition2 LCLOSE )* );
	public final void c() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "c");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(70, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:70:3: ( ( b_op condition2 )* | ( b_op LOPEN condition2 LCLOSE )* )
			int alt24=2;
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			switch ( input.LA(1) ) {
			case B_AND:
			case B_OR:
				{
				int LA24_1 = input.LA(2);
				if ( (LA24_1==FLOAT||LA24_1==ID||LA24_1==INT) ) {
					alt24=1;
				}
				else if ( (LA24_1==LOPEN) ) {
					alt24=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SEMI:
				{
				int LA24_2 = input.LA(2);
				if ( (synpred30_s()) ) {
					alt24=1;
				}
				else if ( (true) ) {
					alt24=2;
				}

				}
				break;
			case LCLOSE:
				{
				int LA24_3 = input.LA(2);
				if ( (synpred30_s()) ) {
					alt24=1;
				}
				else if ( (true) ) {
					alt24=2;
				}

				}
				break;
			case EOF:
				{
				int LA24_4 = input.LA(2);
				if ( (synpred30_s()) ) {
					alt24=1;
				}
				else if ( (true) ) {
					alt24=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:70:5: ( b_op condition2 )*
					{
					dbg.location(70,5);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:70:5: ( b_op condition2 )*
					try { dbg.enterSubRule(22);

					loop22:
					while (true) {
						int alt22=2;
						try { dbg.enterDecision(22, decisionCanBacktrack[22]);

						int LA22_0 = input.LA(1);
						if ( ((LA22_0 >= B_AND && LA22_0 <= B_OR)) ) {
							alt22=1;
						}

						} finally {dbg.exitDecision(22);}

						switch (alt22) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:70:6: b_op condition2
							{
							dbg.location(70,6);
							pushFollow(FOLLOW_b_op_in_c486);
							b_op();
							state._fsp--;
							if (state.failed) return;dbg.location(70,11);
							pushFollow(FOLLOW_condition2_in_c488);
							condition2();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop22;
						}
					}
					} finally {dbg.exitSubRule(22);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:70:26: ( b_op LOPEN condition2 LCLOSE )*
					{
					dbg.location(70,26);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:70:26: ( b_op LOPEN condition2 LCLOSE )*
					try { dbg.enterSubRule(23);

					loop23:
					while (true) {
						int alt23=2;
						try { dbg.enterDecision(23, decisionCanBacktrack[23]);

						int LA23_0 = input.LA(1);
						if ( ((LA23_0 >= B_AND && LA23_0 <= B_OR)) ) {
							alt23=1;
						}

						} finally {dbg.exitDecision(23);}

						switch (alt23) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:70:27: b_op LOPEN condition2 LCLOSE
							{
							dbg.location(70,27);
							pushFollow(FOLLOW_b_op_in_c495);
							b_op();
							state._fsp--;
							if (state.failed) return;dbg.location(70,32);
							match(input,LOPEN,FOLLOW_LOPEN_in_c497); if (state.failed) return;dbg.location(70,38);
							pushFollow(FOLLOW_condition2_in_c499);
							condition2();
							state._fsp--;
							if (state.failed) return;dbg.location(70,49);
							match(input,LCLOSE,FOLLOW_LCLOSE_in_c501); if (state.failed) return;
							}
							break;

						default :
							break loop23;
						}
					}
					} finally {dbg.exitSubRule(23);}

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
		dbg.location(71, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "c");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "c"



	// $ANTLR start "b_op"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:73:1: b_op : ( B_AND | B_OR );
	public final void b_op() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "b_op");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(73, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:73:6: ( B_AND | B_OR )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(73,6);
			if ( (input.LA(1) >= B_AND && input.LA(1) <= B_OR) ) {
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
		dbg.location(74, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "b_op");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "b_op"



	// $ANTLR start "condition2"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:76:1: condition2 : e conOp e ;
	public final void condition2() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "condition2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(76, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:77:2: ( e conOp e )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:77:4: e conOp e
			{
			dbg.location(77,4);
			pushFollow(FOLLOW_e_in_condition2528);
			e();
			state._fsp--;
			if (state.failed) return;dbg.location(77,6);
			pushFollow(FOLLOW_conOp_in_condition2530);
			conOp();
			state._fsp--;
			if (state.failed) return;dbg.location(77,12);
			pushFollow(FOLLOW_e_in_condition2532);
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
		dbg.location(78, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "condition2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "condition2"



	// $ANTLR start "e"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:80:1: e : ( ( ID | no ) ( op ( ID | no ) )* ) ;
	public final void e() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "e");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(80, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:80:3: ( ( ( ID | no ) ( op ( ID | no ) )* ) )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:80:5: ( ( ID | no ) ( op ( ID | no ) )* )
			{
			dbg.location(80,5);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:80:5: ( ( ID | no ) ( op ( ID | no ) )* )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:80:6: ( ID | no ) ( op ( ID | no ) )*
			{
			dbg.location(80,6);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:80:6: ( ID | no )
			int alt25=2;
			try { dbg.enterSubRule(25);
			try { dbg.enterDecision(25, decisionCanBacktrack[25]);

			int LA25_0 = input.LA(1);
			if ( (LA25_0==ID) ) {
				alt25=1;
			}
			else if ( (LA25_0==FLOAT||LA25_0==INT) ) {
				alt25=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(25);}

			switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:80:7: ID
					{
					dbg.location(80,7);
					match(input,ID,FOLLOW_ID_in_e545); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:80:10: no
					{
					dbg.location(80,10);
					pushFollow(FOLLOW_no_in_e547);
					no();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(25);}
			dbg.location(80,14);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:80:14: ( op ( ID | no ) )*
			try { dbg.enterSubRule(27);

			loop27:
			while (true) {
				int alt27=2;
				try { dbg.enterDecision(27, decisionCanBacktrack[27]);

				int LA27_0 = input.LA(1);
				if ( (LA27_0==AND||LA27_0==DIVIDE||LA27_0==MULTIPLY||(LA27_0 >= OR && LA27_0 <= REM)||(LA27_0 >= SLL && LA27_0 <= SRL)||LA27_0==SUB||LA27_0==XOR) ) {
					alt27=1;
				}

				} finally {dbg.exitDecision(27);}

				switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:80:15: op ( ID | no )
					{
					dbg.location(80,15);
					pushFollow(FOLLOW_op_in_e551);
					op();
					state._fsp--;
					if (state.failed) return;dbg.location(80,18);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:80:18: ( ID | no )
					int alt26=2;
					try { dbg.enterSubRule(26);
					try { dbg.enterDecision(26, decisionCanBacktrack[26]);

					int LA26_0 = input.LA(1);
					if ( (LA26_0==ID) ) {
						alt26=1;
					}
					else if ( (LA26_0==FLOAT||LA26_0==INT) ) {
						alt26=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 26, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(26);}

					switch (alt26) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:80:19: ID
							{
							dbg.location(80,19);
							match(input,ID,FOLLOW_ID_in_e554); if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:80:22: no
							{
							dbg.location(80,22);
							pushFollow(FOLLOW_no_in_e556);
							no();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(26);}

					}
					break;

				default :
					break loop27;
				}
			}
			} finally {dbg.exitSubRule(27);}

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
		dbg.location(81, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "e");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "e"



	// $ANTLR start "assign_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:83:1: assign_st : ( type ID r | ID r );
	public final void assign_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "assign_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(83, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:84:2: ( type ID r | ID r )
			int alt28=2;
			try { dbg.enterDecision(28, decisionCanBacktrack[28]);

			int LA28_0 = input.LA(1);
			if ( ((LA28_0 >= T_CHAR && LA28_0 <= T_STRING)) ) {
				alt28=1;
			}
			else if ( (LA28_0==ID) ) {
				alt28=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(28);}

			switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:84:4: type ID r
					{
					dbg.location(84,4);
					pushFollow(FOLLOW_type_in_assign_st571);
					type();
					state._fsp--;
					if (state.failed) return;dbg.location(84,10);
					match(input,ID,FOLLOW_ID_in_assign_st574); if (state.failed) return;dbg.location(84,13);
					pushFollow(FOLLOW_r_in_assign_st576);
					r();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:84:17: ID r
					{
					dbg.location(84,17);
					match(input,ID,FOLLOW_ID_in_assign_st580); if (state.failed) return;dbg.location(84,20);
					pushFollow(FOLLOW_r_in_assign_st582);
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
		dbg.location(85, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assign_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "assign_st"



	// $ANTLR start "r"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:87:1: r : ASSIGN e ;
	public final void r() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "r");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(87, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:87:3: ( ASSIGN e )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:87:5: ASSIGN e
			{
			dbg.location(87,5);
			match(input,ASSIGN,FOLLOW_ASSIGN_in_r594); if (state.failed) return;dbg.location(87,12);
			pushFollow(FOLLOW_e_in_r596);
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
		dbg.location(88, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "r");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "r"



	// $ANTLR start "type"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:92:1: type : type1 ( COPEN CCLOSE )* ;
	public final void type() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "type");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(92, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:92:6: ( type1 ( COPEN CCLOSE )* )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:92:8: type1 ( COPEN CCLOSE )*
			{
			dbg.location(92,8);
			pushFollow(FOLLOW_type1_in_type609);
			type1();
			state._fsp--;
			if (state.failed) return;dbg.location(92,14);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:92:14: ( COPEN CCLOSE )*
			try { dbg.enterSubRule(29);

			loop29:
			while (true) {
				int alt29=2;
				try { dbg.enterDecision(29, decisionCanBacktrack[29]);

				int LA29_0 = input.LA(1);
				if ( (LA29_0==COPEN) ) {
					alt29=1;
				}

				} finally {dbg.exitDecision(29);}

				switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:92:15: COPEN CCLOSE
					{
					dbg.location(92,15);
					match(input,COPEN,FOLLOW_COPEN_in_type612); if (state.failed) return;dbg.location(92,21);
					match(input,CCLOSE,FOLLOW_CCLOSE_in_type614); if (state.failed) return;
					}
					break;

				default :
					break loop29;
				}
			}
			} finally {dbg.exitSubRule(29);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(93, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "type"



	// $ANTLR start "type1"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:95:1: type1 : ( T_INT | T_FLOAT | T_CHAR | T_STRING );
	public final void type1() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "type1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(95, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:95:7: ( T_INT | T_FLOAT | T_CHAR | T_STRING )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(95,7);
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
		dbg.location(96, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "type1"



	// $ANTLR start "no"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:98:1: no : ( INT | FLOAT );
	public final void no() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "no");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(98, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:98:4: ( INT | FLOAT )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(98,4);
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
		dbg.location(99, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "no");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "no"



	// $ANTLR start "op"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:100:1: op : ( POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE | SLL | SRL | AND | OR | XOR );
	public final void op() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "op");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(100, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:100:4: ( POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE | SLL | SRL | AND | OR | XOR )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(100,4);
			if ( input.LA(1)==AND||input.LA(1)==DIVIDE||input.LA(1)==MULTIPLY||(input.LA(1) >= OR && input.LA(1) <= REM)||(input.LA(1) >= SLL && input.LA(1) <= SRL)||input.LA(1)==SUB||input.LA(1)==XOR ) {
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
		dbg.location(101, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "op");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "op"



	// $ANTLR start "conOp"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:103:1: conOp : ( NEQ | EQ | GT | GEQ | LT | LEQ );
	public final void conOp() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "conOp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(103, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:103:7: ( NEQ | EQ | GT | GEQ | LT | LEQ )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(103,7);
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
		dbg.location(104, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "conOp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "conOp"



	// $ANTLR start "s"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:107:1: s : ( ID | INT | FLOAT | STRING | CHAR | SWITCH | CASE | ELIF | ELSE | WHILE | DO | FOR | FUNCTION | RETURN | T_INT | T_FLOAT | T_CHAR | T_STRING | SEMI | POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE | ASSIGN | SLL | SRL | AND | OR | XOR | B_AND | B_OR | LOPEN | LCLOSE | BOPEN | BCLOSE | EQ | GT | GEQ | LT | LEQ | NEQ | COPEN | CCLOSE );
	public final void s() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "s");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(107, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:107:3: ( ID | INT | FLOAT | STRING | CHAR | SWITCH | CASE | ELIF | ELSE | WHILE | DO | FOR | FUNCTION | RETURN | T_INT | T_FLOAT | T_CHAR | T_STRING | SEMI | POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE | ASSIGN | SLL | SRL | AND | OR | XOR | B_AND | B_OR | LOPEN | LCLOSE | BOPEN | BCLOSE | EQ | GT | GEQ | LT | LEQ | NEQ | COPEN | CCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(107,3);
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
		dbg.location(110, 2);

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

	// $ANTLR start synpred20_s
	public final void synpred20_s_fragment() throws RecognitionException {
		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:46:5: ( ( ',' ( type ID ) )* )
		dbg.enterAlt(1);

		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:46:5: ( ',' ( type ID ) )*
		{
		dbg.location(46,5);
		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:46:5: ( ',' ( type ID ) )*
		try { dbg.enterSubRule(31);

		loop31:
		while (true) {
			int alt31=2;
			try { dbg.enterDecision(31, decisionCanBacktrack[31]);

			int LA31_0 = input.LA(1);
			if ( (LA31_0==57) ) {
				alt31=1;
			}

			} finally {dbg.exitDecision(31);}

			switch (alt31) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:46:6: ',' ( type ID )
				{
				dbg.location(46,6);
				match(input,57,FOLLOW_57_in_synpred20_s314); if (state.failed) return;dbg.location(46,9);
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:46:9: ( type ID )
				dbg.enterAlt(1);

				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:46:10: type ID
				{
				dbg.location(46,10);
				pushFollow(FOLLOW_type_in_synpred20_s316);
				type();
				state._fsp--;
				if (state.failed) return;dbg.location(46,15);
				match(input,ID,FOLLOW_ID_in_synpred20_s318); if (state.failed) return;
				}

				}
				break;

			default :
				break loop31;
			}
		}
		} finally {dbg.exitSubRule(31);}

		}

	}
	// $ANTLR end synpred20_s

	// $ANTLR start synpred30_s
	public final void synpred30_s_fragment() throws RecognitionException {
		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:70:5: ( ( b_op condition2 )* )
		dbg.enterAlt(1);

		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:70:5: ( b_op condition2 )*
		{
		dbg.location(70,5);
		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:70:5: ( b_op condition2 )*
		try { dbg.enterSubRule(34);

		loop34:
		while (true) {
			int alt34=2;
			try { dbg.enterDecision(34, decisionCanBacktrack[34]);

			int LA34_0 = input.LA(1);
			if ( ((LA34_0 >= B_AND && LA34_0 <= B_OR)) ) {
				alt34=1;
			}

			} finally {dbg.exitDecision(34);}

			switch (alt34) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:70:6: b_op condition2
				{
				dbg.location(70,6);
				pushFollow(FOLLOW_b_op_in_synpred30_s486);
				b_op();
				state._fsp--;
				if (state.failed) return;dbg.location(70,11);
				pushFollow(FOLLOW_condition2_in_synpred30_s488);
				condition2();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop34;
			}
		}
		} finally {dbg.exitSubRule(34);}

		}

	}
	// $ANTLR end synpred30_s

	// Delegated rules

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
	public final boolean synpred30_s() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred30_s_fragment(); // can never throw exception
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



	public static final BitSet FOLLOW_blocks_in_start37 = new BitSet(new long[]{0x005F000031810080L});
	public static final BitSet FOLLOW_EOF_in_start40 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_def_in_blocks50 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOPEN_in_blocks53 = new BitSet(new long[]{0x005F000030810000L});
	public static final BitSet FOLLOW_block_in_blocks55 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_blocks57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_blocks61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statements_in_block72 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements85 = new BitSet(new long[]{0x005F000030810002L});
	public static final BitSet FOLLOW_statement_in_statements87 = new BitSet(new long[]{0x005F000030810002L});
	public static final BitSet FOLLOW_assign_st_in_statement100 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_statement102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_st_in_statement106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_st_in_statement110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_st_in_statement114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_do_st_in_statement117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_st_in_statement120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switch_st_in_statement123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_switch_st135 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_switch_st137 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_switch_st139 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_switch_st141 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_switch_st143 = new BitSet(new long[]{0x0000000000000440L});
	public static final BitSet FOLLOW_case_st_in_switch_st145 = new BitSet(new long[]{0x0000000000000440L});
	public static final BitSet FOLLOW_BCLOSE_in_switch_st148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_case_st158 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_case_st160 = new BitSet(new long[]{0x0000000040400000L});
	public static final BitSet FOLLOW_no_in_case_st162 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_case_st164 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_case_st166 = new BitSet(new long[]{0x005F000030810000L});
	public static final BitSet FOLLOW_statements_in_case_st168 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_case_st170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_for_st180 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_for_st182 = new BitSet(new long[]{0x001E080010000000L});
	public static final BitSet FOLLOW_assign_st_in_for_st184 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_for_st187 = new BitSet(new long[]{0x0000080250400000L});
	public static final BitSet FOLLOW_condition_in_for_st189 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_for_st192 = new BitSet(new long[]{0x001E000090000000L});
	public static final BitSet FOLLOW_assign_st_in_for_st194 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_for_st197 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_for_st199 = new BitSet(new long[]{0x005F000030810000L});
	public static final BitSet FOLLOW_statements_in_for_st201 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_for_st203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_st211 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_while_st213 = new BitSet(new long[]{0x0000000250400000L});
	public static final BitSet FOLLOW_condition_in_while_st215 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_while_st217 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_while_st219 = new BitSet(new long[]{0x005F000030810000L});
	public static final BitSet FOLLOW_statements_in_while_st221 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_while_st223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_do_st234 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_do_st236 = new BitSet(new long[]{0x0000000250400000L});
	public static final BitSet FOLLOW_condition_in_do_st238 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_do_st240 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_do_st242 = new BitSet(new long[]{0x005F000030810000L});
	public static final BitSet FOLLOW_statements_in_do_st244 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_do_st246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_function_def256 = new BitSet(new long[]{0x001E000000000000L});
	public static final BitSet FOLLOW_type_in_function_def258 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_function_def260 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_function_def262 = new BitSet(new long[]{0x001E000080000000L});
	public static final BitSet FOLLOW_def_params_in_function_def264 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_function_def266 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_function_def268 = new BitSet(new long[]{0x005F000030810000L});
	public static final BitSet FOLLOW_block_in_function_def270 = new BitSet(new long[]{0x0000040000000040L});
	public static final BitSet FOLLOW_RETURN_in_function_def273 = new BitSet(new long[]{0x0000400050400000L});
	public static final BitSet FOLLOW_no_in_function_def275 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_STRING_in_function_def277 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_function_def279 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_function_def282 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_function_def287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_def_params298 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_def_params300 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_m_in_def_params303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_m314 = new BitSet(new long[]{0x001E000000000000L});
	public static final BitSet FOLLOW_type_in_m316 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_m318 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_ID_in_function_st335 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_function_st337 = new BitSet(new long[]{0x00004000D0400000L});
	public static final BitSet FOLLOW_params_in_function_st339 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_function_st341 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_SEMI_in_function_st343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_e_in_params354 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_STRING_in_params356 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_f_in_params359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_f370 = new BitSet(new long[]{0x0000400050400000L});
	public static final BitSet FOLLOW_e_in_f372 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_STRING_in_f374 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_IF_in_if_st389 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_if_st391 = new BitSet(new long[]{0x0000000250400000L});
	public static final BitSet FOLLOW_condition_in_if_st393 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_if_st395 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_if_st397 = new BitSet(new long[]{0x005F000030810000L});
	public static final BitSet FOLLOW_statements_in_if_st399 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_if_st401 = new BitSet(new long[]{0x0000000000060002L});
	public static final BitSet FOLLOW_else_if_st_in_if_st404 = new BitSet(new long[]{0x0000000000060002L});
	public static final BitSet FOLLOW_else_st_in_if_st409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELIF_in_else_if_st422 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_else_if_st424 = new BitSet(new long[]{0x0000000250400000L});
	public static final BitSet FOLLOW_condition_in_else_if_st426 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_else_if_st428 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_else_if_st430 = new BitSet(new long[]{0x005F000030810000L});
	public static final BitSet FOLLOW_statements_in_else_if_st432 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_else_if_st434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_st446 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_else_st448 = new BitSet(new long[]{0x005F000030810000L});
	public static final BitSet FOLLOW_statements_in_else_st450 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_else_st452 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condition2_in_condition464 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_c_in_condition466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOPEN_in_condition470 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_condition2_in_condition472 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_condition474 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_c_in_condition476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_b_op_in_c486 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_condition2_in_c488 = new BitSet(new long[]{0x0000000000000302L});
	public static final BitSet FOLLOW_b_op_in_c495 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_c497 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_condition2_in_c499 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_c501 = new BitSet(new long[]{0x0000000000000302L});
	public static final BitSet FOLLOW_e_in_condition2528 = new BitSet(new long[]{0x0000001506080000L});
	public static final BitSet FOLLOW_conOp_in_condition2530 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_e_in_condition2532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_e545 = new BitSet(new long[]{0x0100B3C800008012L});
	public static final BitSet FOLLOW_no_in_e547 = new BitSet(new long[]{0x0100B3C800008012L});
	public static final BitSet FOLLOW_op_in_e551 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_ID_in_e554 = new BitSet(new long[]{0x0100B3C800008012L});
	public static final BitSet FOLLOW_no_in_e556 = new BitSet(new long[]{0x0100B3C800008012L});
	public static final BitSet FOLLOW_type_in_assign_st571 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_assign_st574 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_r_in_assign_st576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assign_st580 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_r_in_assign_st582 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_r594 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_e_in_r596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type1_in_type609 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COPEN_in_type612 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CCLOSE_in_type614 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_statement_in_synpred4_s87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_synpred20_s314 = new BitSet(new long[]{0x001E000000000000L});
	public static final BitSet FOLLOW_type_in_synpred20_s316 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_synpred20_s318 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_b_op_in_synpred30_s486 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_condition2_in_synpred30_s488 = new BitSet(new long[]{0x0000000000000302L});
}
