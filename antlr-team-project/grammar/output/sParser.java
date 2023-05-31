// $ANTLR 3.5.1 C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g 2023-05-31 17:49:15

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
		"invalidRule", "block", "params", "do_st", "synpred44_s", "synpred30_s", 
		"f", "synpred29_s", "synpred73_s", "synpred43_s", "synpred46_s", "synpred3_s", 
		"synpred86_s", "synpred13_s", "function_def", "statement", "synpred59_s", 
		"synpred85_s", "synpred8_s", "synpred67_s", "synpred71_s", "synpred38_s", 
		"synpred57_s", "synpred78_s", "synpred48_s", "synpred10_s", "synpred12_s", 
		"conOp", "synpred4_s", "synpred28_s", "s", "synpred6_s", "else_st", "synpred20_s", 
		"synpred1_s", "synpred22_s", "synpred36_s", "synpred34_s", "synpred89_s", 
		"synpred40_s", "if_st", "synpred14_s", "synpred79_s", "assign_st", "synpred62_s", 
		"synpred82_s", "while_st", "synpred83_s", "synpred52_s", "synpred41_s", 
		"synpred47_s", "synpred24_s", "synpred75_s", "synpred84_s", "condition", 
		"synpred60_s", "synpred9_s", "synpred65_s", "op", "synpred63_s", "synpred74_s", 
		"synpred54_s", "synpred87_s", "function_st", "synpred61_s", "r", "synpred16_s", 
		"no", "synpred45_s", "synpred31_s", "synpred42_s", "statements", "synpred32_s", 
		"synpred80_s", "synpred81_s", "synpred18_s", "m", "synpred11_s", "synpred23_s", 
		"synpred19_s", "synpred26_s", "type1", "synpred7_s", "synpred35_s", "synpred51_s", 
		"else_if_st", "synpred64_s", "synpred55_s", "e", "synpred66_s", "start", 
		"synpred33_s", "synpred15_s", "synpred76_s", "synpred72_s", "synpred17_s", 
		"synpred21_s", "def_params", "synpred88_s", "synpred37_s", "synpred77_s", 
		"synpred53_s", "synpred69_s", "synpred2_s", "for_st", "synpred68_s", "type", 
		"synpred49_s", "synpred25_s", "synpred27_s", "synpred56_s", "synpred70_s", 
		"synpred58_s", "synpred39_s", "blocks", "synpred5_s", "synpred50_s"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, true, false, false, false, false, false, false, false, false, 
		    true, false, false, false, false, false, true, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
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
				if ( (LA1_0==BOPEN||LA1_0==DO||LA1_0==FOR||(LA1_0 >= ID && LA1_0 <= IF)||(LA1_0 >= T_CHAR && LA1_0 <= T_STRING)||LA1_0==WHILE) ) {
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
				case FOR:
					{
					int LA3_9 = input.LA(2);
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
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:24:1: statement : ( assign_st SEMI | if_st | function_st | while_st | do_st | for_st );
	public final void statement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(24, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:25:2: ( assign_st SEMI | if_st | function_st | while_st | do_st | for_st )
			int alt4=6;
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



	// $ANTLR start "for_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:28:1: for_st : FOR LOPEN ( ( assign_st )? SEMI ( condition )? SEMI ( assign_st )? ) LCLOSE BOPEN statements BCLOSE ;
	public final void for_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "for_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(28, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:28:8: ( FOR LOPEN ( ( assign_st )? SEMI ( condition )? SEMI ( assign_st )? ) LCLOSE BOPEN statements BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:28:10: FOR LOPEN ( ( assign_st )? SEMI ( condition )? SEMI ( assign_st )? ) LCLOSE BOPEN statements BCLOSE
			{
			dbg.location(28,10);
			match(input,FOR,FOLLOW_FOR_in_for_st131); if (state.failed) return;dbg.location(28,14);
			match(input,LOPEN,FOLLOW_LOPEN_in_for_st133); if (state.failed) return;dbg.location(28,19);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:28:19: ( ( assign_st )? SEMI ( condition )? SEMI ( assign_st )? )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:28:20: ( assign_st )? SEMI ( condition )? SEMI ( assign_st )?
			{
			dbg.location(28,20);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:28:20: ( assign_st )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==ID||(LA5_0 >= T_CHAR && LA5_0 <= T_STRING)) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:28:20: assign_st
					{
					dbg.location(28,20);
					pushFollow(FOLLOW_assign_st_in_for_st135);
					assign_st();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(28,31);
			match(input,SEMI,FOLLOW_SEMI_in_for_st138); if (state.failed) return;dbg.location(28,36);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:28:36: ( condition )?
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==FLOAT||LA6_0==ID||LA6_0==INT) ) {
				alt6=1;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:28:36: condition
					{
					dbg.location(28,36);
					pushFollow(FOLLOW_condition_in_for_st140);
					condition();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(28,47);
			match(input,SEMI,FOLLOW_SEMI_in_for_st143); if (state.failed) return;dbg.location(28,52);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:28:52: ( assign_st )?
			int alt7=2;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==ID||(LA7_0 >= T_CHAR && LA7_0 <= T_STRING)) ) {
				alt7=1;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:28:52: assign_st
					{
					dbg.location(28,52);
					pushFollow(FOLLOW_assign_st_in_for_st145);
					assign_st();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(7);}

			}
			dbg.location(28,63);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_for_st148); if (state.failed) return;dbg.location(28,70);
			match(input,BOPEN,FOLLOW_BOPEN_in_for_st150); if (state.failed) return;dbg.location(28,76);
			pushFollow(FOLLOW_statements_in_for_st152);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(28,87);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_for_st154); if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "for_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "for_st"



	// $ANTLR start "while_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:30:1: while_st : WHILE LOPEN condition LCLOSE BOPEN statements BCLOSE ;
	public final void while_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "while_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(30, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:30:9: ( WHILE LOPEN condition LCLOSE BOPEN statements BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:30:11: WHILE LOPEN condition LCLOSE BOPEN statements BCLOSE
			{
			dbg.location(30,11);
			match(input,WHILE,FOLLOW_WHILE_in_while_st162); if (state.failed) return;dbg.location(30,17);
			match(input,LOPEN,FOLLOW_LOPEN_in_while_st164); if (state.failed) return;dbg.location(30,23);
			pushFollow(FOLLOW_condition_in_while_st166);
			condition();
			state._fsp--;
			if (state.failed) return;dbg.location(30,33);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_while_st168); if (state.failed) return;dbg.location(30,40);
			match(input,BOPEN,FOLLOW_BOPEN_in_while_st170); if (state.failed) return;dbg.location(30,46);
			pushFollow(FOLLOW_statements_in_while_st172);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(30,57);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_while_st174); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(31, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "while_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "while_st"



	// $ANTLR start "do_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:1: do_st : DO LOPEN condition LCLOSE BOPEN statements BCLOSE ;
	public final void do_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "do_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(33, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:7: ( DO LOPEN condition LCLOSE BOPEN statements BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:9: DO LOPEN condition LCLOSE BOPEN statements BCLOSE
			{
			dbg.location(33,9);
			match(input,DO,FOLLOW_DO_in_do_st185); if (state.failed) return;dbg.location(33,12);
			match(input,LOPEN,FOLLOW_LOPEN_in_do_st187); if (state.failed) return;dbg.location(33,18);
			pushFollow(FOLLOW_condition_in_do_st189);
			condition();
			state._fsp--;
			if (state.failed) return;dbg.location(33,28);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_do_st191); if (state.failed) return;dbg.location(33,35);
			match(input,BOPEN,FOLLOW_BOPEN_in_do_st193); if (state.failed) return;dbg.location(33,41);
			pushFollow(FOLLOW_statements_in_do_st195);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(33,52);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_do_st197); if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "do_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "do_st"



	// $ANTLR start "function_def"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:35:1: function_def : type ID LOPEN def_params LCLOSE BOPEN block ( RETURN ( no | STRING | ID ) SEMI )? BCLOSE ;
	public final void function_def() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "function_def");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(35, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:36:2: ( type ID LOPEN def_params LCLOSE BOPEN block ( RETURN ( no | STRING | ID ) SEMI )? BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:36:4: type ID LOPEN def_params LCLOSE BOPEN block ( RETURN ( no | STRING | ID ) SEMI )? BCLOSE
			{
			dbg.location(36,4);
			pushFollow(FOLLOW_type_in_function_def207);
			type();
			state._fsp--;
			if (state.failed) return;dbg.location(36,9);
			match(input,ID,FOLLOW_ID_in_function_def209); if (state.failed) return;dbg.location(36,12);
			match(input,LOPEN,FOLLOW_LOPEN_in_function_def211); if (state.failed) return;dbg.location(36,18);
			pushFollow(FOLLOW_def_params_in_function_def213);
			def_params();
			state._fsp--;
			if (state.failed) return;dbg.location(36,29);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_function_def215); if (state.failed) return;dbg.location(36,36);
			match(input,BOPEN,FOLLOW_BOPEN_in_function_def217); if (state.failed) return;dbg.location(36,42);
			pushFollow(FOLLOW_block_in_function_def219);
			block();
			state._fsp--;
			if (state.failed) return;dbg.location(36,48);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:36:48: ( RETURN ( no | STRING | ID ) SEMI )?
			int alt9=2;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==RETURN) ) {
				alt9=1;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:36:49: RETURN ( no | STRING | ID ) SEMI
					{
					dbg.location(36,49);
					match(input,RETURN,FOLLOW_RETURN_in_function_def222); if (state.failed) return;dbg.location(36,55);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:36:55: ( no | STRING | ID )
					int alt8=3;
					try { dbg.enterSubRule(8);
					try { dbg.enterDecision(8, decisionCanBacktrack[8]);

					switch ( input.LA(1) ) {
					case FLOAT:
					case INT:
						{
						alt8=1;
						}
						break;
					case STRING:
						{
						alt8=2;
						}
						break;
					case ID:
						{
						alt8=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(8);}

					switch (alt8) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:36:56: no
							{
							dbg.location(36,56);
							pushFollow(FOLLOW_no_in_function_def224);
							no();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:36:59: STRING
							{
							dbg.location(36,59);
							match(input,STRING,FOLLOW_STRING_in_function_def226); if (state.failed) return;
							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:36:66: ID
							{
							dbg.location(36,66);
							match(input,ID,FOLLOW_ID_in_function_def228); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(8);}
					dbg.location(36,70);
					match(input,SEMI,FOLLOW_SEMI_in_function_def231); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(9);}
			dbg.location(36,78);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_function_def236); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(37, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function_def");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "function_def"



	// $ANTLR start "def_params"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:38:1: def_params : ( ( type ID ) m |);
	public final void def_params() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "def_params");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(38, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:2: ( ( type ID ) m |)
			int alt10=2;
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( ((LA10_0 >= T_CHAR && LA10_0 <= T_STRING)) ) {
				alt10=1;
			}
			else if ( (LA10_0==LCLOSE) ) {
				alt10=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:4: ( type ID ) m
					{
					dbg.location(39,4);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:4: ( type ID )
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:39:5: type ID
					{
					dbg.location(39,5);
					pushFollow(FOLLOW_type_in_def_params247);
					type();
					state._fsp--;
					if (state.failed) return;dbg.location(39,10);
					match(input,ID,FOLLOW_ID_in_def_params249); if (state.failed) return;
					}
					dbg.location(39,14);
					pushFollow(FOLLOW_m_in_def_params252);
					m();
					state._fsp--;
					if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "def_params");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "def_params"



	// $ANTLR start "m"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:1: m : ( ( ',' ( type ID ) )* |);
	public final void m() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "m");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(41, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:3: ( ( ',' ( type ID ) )* |)
			int alt12=2;
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			switch ( input.LA(1) ) {
			case 57:
				{
				alt12=1;
				}
				break;
			case LCLOSE:
				{
				int LA12_2 = input.LA(2);
				if ( (synpred18_s()) ) {
					alt12=1;
				}
				else if ( (true) ) {
					alt12=2;
				}

				}
				break;
			case EOF:
				{
				int LA12_3 = input.LA(2);
				if ( (synpred18_s()) ) {
					alt12=1;
				}
				else if ( (true) ) {
					alt12=2;
				}

				}
				break;
			default:
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

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:5: ( ',' ( type ID ) )*
					{
					dbg.location(41,5);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:5: ( ',' ( type ID ) )*
					try { dbg.enterSubRule(11);

					loop11:
					while (true) {
						int alt11=2;
						try { dbg.enterDecision(11, decisionCanBacktrack[11]);

						int LA11_0 = input.LA(1);
						if ( (LA11_0==57) ) {
							alt11=1;
						}

						} finally {dbg.exitDecision(11);}

						switch (alt11) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:6: ',' ( type ID )
							{
							dbg.location(41,6);
							match(input,57,FOLLOW_57_in_m263); if (state.failed) return;dbg.location(41,9);
							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:9: ( type ID )
							dbg.enterAlt(1);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:10: type ID
							{
							dbg.location(41,10);
							pushFollow(FOLLOW_type_in_m265);
							type();
							state._fsp--;
							if (state.failed) return;dbg.location(41,15);
							match(input,ID,FOLLOW_ID_in_m267); if (state.failed) return;
							}

							}
							break;

						default :
							break loop11;
						}
					}
					} finally {dbg.exitSubRule(11);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:42:2: 
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
		dbg.location(42, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "m");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "m"



	// $ANTLR start "function_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:44:1: function_st : ID LOPEN params LCLOSE ( SEMI )? ;
	public final void function_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "function_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(44, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:45:2: ( ID LOPEN params LCLOSE ( SEMI )? )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:45:4: ID LOPEN params LCLOSE ( SEMI )?
			{
			dbg.location(45,4);
			match(input,ID,FOLLOW_ID_in_function_st284); if (state.failed) return;dbg.location(45,7);
			match(input,LOPEN,FOLLOW_LOPEN_in_function_st286); if (state.failed) return;dbg.location(45,13);
			pushFollow(FOLLOW_params_in_function_st288);
			params();
			state._fsp--;
			if (state.failed) return;dbg.location(45,20);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_function_st290); if (state.failed) return;dbg.location(45,27);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:45:27: ( SEMI )?
			int alt13=2;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			int LA13_0 = input.LA(1);
			if ( (LA13_0==SEMI) ) {
				alt13=1;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:45:27: SEMI
					{
					dbg.location(45,27);
					match(input,SEMI,FOLLOW_SEMI_in_function_st292); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(13);}

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
			dbg.exitRule(getGrammarFileName(), "function_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "function_st"



	// $ANTLR start "params"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:1: params : ( ( e | STRING ) f |);
	public final void params() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "params");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(47, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:8: ( ( e | STRING ) f |)
			int alt15=2;
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==FLOAT||LA15_0==ID||LA15_0==INT||LA15_0==STRING) ) {
				alt15=1;
			}
			else if ( (LA15_0==LCLOSE) ) {
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

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:10: ( e | STRING ) f
					{
					dbg.location(47,10);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:10: ( e | STRING )
					int alt14=2;
					try { dbg.enterSubRule(14);
					try { dbg.enterDecision(14, decisionCanBacktrack[14]);

					int LA14_0 = input.LA(1);
					if ( (LA14_0==FLOAT||LA14_0==ID||LA14_0==INT) ) {
						alt14=1;
					}
					else if ( (LA14_0==STRING) ) {
						alt14=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 14, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(14);}

					switch (alt14) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:11: e
							{
							dbg.location(47,11);
							pushFollow(FOLLOW_e_in_params303);
							e();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:47:13: STRING
							{
							dbg.location(47,13);
							match(input,STRING,FOLLOW_STRING_in_params305); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(14);}
					dbg.location(47,21);
					pushFollow(FOLLOW_f_in_params308);
					f();
					state._fsp--;
					if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "params");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "params"



	// $ANTLR start "f"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:49:1: f : ( ( ',' ( e | STRING ) )* |);
	public final void f() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "f");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(49, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:49:3: ( ( ',' ( e | STRING ) )* |)
			int alt18=2;
			try { dbg.enterDecision(18, decisionCanBacktrack[18]);

			switch ( input.LA(1) ) {
			case 57:
				{
				alt18=1;
				}
				break;
			case LCLOSE:
				{
				int LA18_2 = input.LA(2);
				if ( (synpred24_s()) ) {
					alt18=1;
				}
				else if ( (true) ) {
					alt18=2;
				}

				}
				break;
			case EOF:
				{
				int LA18_3 = input.LA(2);
				if ( (synpred24_s()) ) {
					alt18=1;
				}
				else if ( (true) ) {
					alt18=2;
				}

				}
				break;
			default:
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

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:49:5: ( ',' ( e | STRING ) )*
					{
					dbg.location(49,5);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:49:5: ( ',' ( e | STRING ) )*
					try { dbg.enterSubRule(17);

					loop17:
					while (true) {
						int alt17=2;
						try { dbg.enterDecision(17, decisionCanBacktrack[17]);

						int LA17_0 = input.LA(1);
						if ( (LA17_0==57) ) {
							alt17=1;
						}

						} finally {dbg.exitDecision(17);}

						switch (alt17) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:49:6: ',' ( e | STRING )
							{
							dbg.location(49,6);
							match(input,57,FOLLOW_57_in_f319); if (state.failed) return;dbg.location(49,9);
							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:49:9: ( e | STRING )
							int alt16=2;
							try { dbg.enterSubRule(16);
							try { dbg.enterDecision(16, decisionCanBacktrack[16]);

							int LA16_0 = input.LA(1);
							if ( (LA16_0==FLOAT||LA16_0==ID||LA16_0==INT) ) {
								alt16=1;
							}
							else if ( (LA16_0==STRING) ) {
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

									// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:49:10: e
									{
									dbg.location(49,10);
									pushFollow(FOLLOW_e_in_f321);
									e();
									state._fsp--;
									if (state.failed) return;
									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:49:12: STRING
									{
									dbg.location(49,12);
									match(input,STRING,FOLLOW_STRING_in_f323); if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(16);}

							}
							break;

						default :
							break loop17;
						}
					}
					} finally {dbg.exitSubRule(17);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:50:2: 
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
		dbg.location(50, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "f");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "f"



	// $ANTLR start "if_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:52:1: if_st : IF LOPEN condition LCLOSE BOPEN statements BCLOSE ( else_if_st )* ( else_st )? ;
	public final void if_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "if_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(52, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:52:6: ( IF LOPEN condition LCLOSE BOPEN statements BCLOSE ( else_if_st )* ( else_st )? )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:52:9: IF LOPEN condition LCLOSE BOPEN statements BCLOSE ( else_if_st )* ( else_st )?
			{
			dbg.location(52,9);
			match(input,IF,FOLLOW_IF_in_if_st339); if (state.failed) return;dbg.location(52,12);
			match(input,LOPEN,FOLLOW_LOPEN_in_if_st341); if (state.failed) return;dbg.location(52,18);
			pushFollow(FOLLOW_condition_in_if_st343);
			condition();
			state._fsp--;
			if (state.failed) return;dbg.location(52,28);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_if_st345); if (state.failed) return;dbg.location(52,35);
			match(input,BOPEN,FOLLOW_BOPEN_in_if_st347); if (state.failed) return;dbg.location(52,41);
			pushFollow(FOLLOW_statements_in_if_st349);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(52,52);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_if_st351); if (state.failed) return;dbg.location(52,59);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:52:59: ( else_if_st )*
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

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:52:60: else_if_st
					{
					dbg.location(52,60);
					pushFollow(FOLLOW_else_if_st_in_if_st354);
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
			dbg.location(52,73);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:52:73: ( else_st )?
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

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:52:74: else_st
					{
					dbg.location(52,74);
					pushFollow(FOLLOW_else_st_in_if_st359);
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
		dbg.location(53, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "if_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "if_st"



	// $ANTLR start "else_if_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:55:1: else_if_st : ELIF LOPEN condition LCLOSE BOPEN statements BCLOSE ;
	public final void else_if_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "else_if_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(55, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:56:2: ( ELIF LOPEN condition LCLOSE BOPEN statements BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:56:4: ELIF LOPEN condition LCLOSE BOPEN statements BCLOSE
			{
			dbg.location(56,4);
			match(input,ELIF,FOLLOW_ELIF_in_else_if_st372); if (state.failed) return;dbg.location(56,9);
			match(input,LOPEN,FOLLOW_LOPEN_in_else_if_st374); if (state.failed) return;dbg.location(56,15);
			pushFollow(FOLLOW_condition_in_else_if_st376);
			condition();
			state._fsp--;
			if (state.failed) return;dbg.location(56,25);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_else_if_st378); if (state.failed) return;dbg.location(56,32);
			match(input,BOPEN,FOLLOW_BOPEN_in_else_if_st380); if (state.failed) return;dbg.location(56,38);
			pushFollow(FOLLOW_statements_in_else_if_st382);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(56,49);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_else_if_st384); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(57, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "else_if_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "else_if_st"



	// $ANTLR start "else_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:59:1: else_st : ELSE BOPEN statements BCLOSE ;
	public final void else_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "else_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(59, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:59:9: ( ELSE BOPEN statements BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:59:11: ELSE BOPEN statements BCLOSE
			{
			dbg.location(59,11);
			match(input,ELSE,FOLLOW_ELSE_in_else_st396); if (state.failed) return;dbg.location(59,16);
			match(input,BOPEN,FOLLOW_BOPEN_in_else_st398); if (state.failed) return;dbg.location(59,22);
			pushFollow(FOLLOW_statements_in_else_st400);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(59,33);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_else_st402); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(60, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "else_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "else_st"



	// $ANTLR start "condition"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:62:1: condition : e conOp e ;
	public final void condition() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "condition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(62, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:63:2: ( e conOp e )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:63:4: e conOp e
			{
			dbg.location(63,4);
			pushFollow(FOLLOW_e_in_condition414);
			e();
			state._fsp--;
			if (state.failed) return;dbg.location(63,6);
			pushFollow(FOLLOW_conOp_in_condition416);
			conOp();
			state._fsp--;
			if (state.failed) return;dbg.location(63,12);
			pushFollow(FOLLOW_e_in_condition418);
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
		dbg.location(64, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "condition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "condition"



	// $ANTLR start "e"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:66:1: e : ( ( ID | no ) ( op ( ID | no ) )* ) ;
	public final void e() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "e");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(66, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:66:3: ( ( ( ID | no ) ( op ( ID | no ) )* ) )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:66:5: ( ( ID | no ) ( op ( ID | no ) )* )
			{
			dbg.location(66,5);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:66:5: ( ( ID | no ) ( op ( ID | no ) )* )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:66:6: ( ID | no ) ( op ( ID | no ) )*
			{
			dbg.location(66,6);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:66:6: ( ID | no )
			int alt21=2;
			try { dbg.enterSubRule(21);
			try { dbg.enterDecision(21, decisionCanBacktrack[21]);

			int LA21_0 = input.LA(1);
			if ( (LA21_0==ID) ) {
				alt21=1;
			}
			else if ( (LA21_0==FLOAT||LA21_0==INT) ) {
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

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:66:7: ID
					{
					dbg.location(66,7);
					match(input,ID,FOLLOW_ID_in_e431); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:66:10: no
					{
					dbg.location(66,10);
					pushFollow(FOLLOW_no_in_e433);
					no();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(21);}
			dbg.location(66,14);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:66:14: ( op ( ID | no ) )*
			try { dbg.enterSubRule(23);

			loop23:
			while (true) {
				int alt23=2;
				try { dbg.enterDecision(23, decisionCanBacktrack[23]);

				int LA23_0 = input.LA(1);
				if ( (LA23_0==DIVIDE||LA23_0==MULTIPLY||(LA23_0 >= PLUS && LA23_0 <= REM)||LA23_0==SUB) ) {
					alt23=1;
				}

				} finally {dbg.exitDecision(23);}

				switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:66:15: op ( ID | no )
					{
					dbg.location(66,15);
					pushFollow(FOLLOW_op_in_e437);
					op();
					state._fsp--;
					if (state.failed) return;dbg.location(66,18);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:66:18: ( ID | no )
					int alt22=2;
					try { dbg.enterSubRule(22);
					try { dbg.enterDecision(22, decisionCanBacktrack[22]);

					int LA22_0 = input.LA(1);
					if ( (LA22_0==ID) ) {
						alt22=1;
					}
					else if ( (LA22_0==FLOAT||LA22_0==INT) ) {
						alt22=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 22, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(22);}

					switch (alt22) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:66:19: ID
							{
							dbg.location(66,19);
							match(input,ID,FOLLOW_ID_in_e440); if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:66:22: no
							{
							dbg.location(66,22);
							pushFollow(FOLLOW_no_in_e442);
							no();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(22);}

					}
					break;

				default :
					break loop23;
				}
			}
			} finally {dbg.exitSubRule(23);}

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
		dbg.location(67, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "e");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "e"



	// $ANTLR start "assign_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:69:1: assign_st : ( type ID r | ID r );
	public final void assign_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "assign_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(69, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:70:2: ( type ID r | ID r )
			int alt24=2;
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			int LA24_0 = input.LA(1);
			if ( ((LA24_0 >= T_CHAR && LA24_0 <= T_STRING)) ) {
				alt24=1;
			}
			else if ( (LA24_0==ID) ) {
				alt24=2;
			}

			else {
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

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:70:4: type ID r
					{
					dbg.location(70,4);
					pushFollow(FOLLOW_type_in_assign_st457);
					type();
					state._fsp--;
					if (state.failed) return;dbg.location(70,10);
					match(input,ID,FOLLOW_ID_in_assign_st460); if (state.failed) return;dbg.location(70,13);
					pushFollow(FOLLOW_r_in_assign_st462);
					r();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:70:17: ID r
					{
					dbg.location(70,17);
					match(input,ID,FOLLOW_ID_in_assign_st466); if (state.failed) return;dbg.location(70,20);
					pushFollow(FOLLOW_r_in_assign_st468);
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
		dbg.location(71, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assign_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "assign_st"



	// $ANTLR start "r"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:73:1: r : ASSIGN e ;
	public final void r() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "r");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(73, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:73:3: ( ASSIGN e )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:73:5: ASSIGN e
			{
			dbg.location(73,5);
			match(input,ASSIGN,FOLLOW_ASSIGN_in_r480); if (state.failed) return;dbg.location(73,12);
			pushFollow(FOLLOW_e_in_r482);
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
		dbg.location(74, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "r");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "r"



	// $ANTLR start "type"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:78:1: type : type1 ( COPEN CCLOSE )* ;
	public final void type() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "type");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(78, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:78:6: ( type1 ( COPEN CCLOSE )* )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:78:8: type1 ( COPEN CCLOSE )*
			{
			dbg.location(78,8);
			pushFollow(FOLLOW_type1_in_type495);
			type1();
			state._fsp--;
			if (state.failed) return;dbg.location(78,14);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:78:14: ( COPEN CCLOSE )*
			try { dbg.enterSubRule(25);

			loop25:
			while (true) {
				int alt25=2;
				try { dbg.enterDecision(25, decisionCanBacktrack[25]);

				int LA25_0 = input.LA(1);
				if ( (LA25_0==COPEN) ) {
					alt25=1;
				}

				} finally {dbg.exitDecision(25);}

				switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:78:15: COPEN CCLOSE
					{
					dbg.location(78,15);
					match(input,COPEN,FOLLOW_COPEN_in_type498); if (state.failed) return;dbg.location(78,21);
					match(input,CCLOSE,FOLLOW_CCLOSE_in_type500); if (state.failed) return;
					}
					break;

				default :
					break loop25;
				}
			}
			} finally {dbg.exitSubRule(25);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(79, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "type"



	// $ANTLR start "type1"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:81:1: type1 : ( T_INT | T_FLOAT | T_CHAR | T_STRING );
	public final void type1() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "type1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(81, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:81:7: ( T_INT | T_FLOAT | T_CHAR | T_STRING )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(81,7);
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
		dbg.location(82, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "type1"



	// $ANTLR start "no"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:84:1: no : ( INT | FLOAT );
	public final void no() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "no");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(84, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:84:4: ( INT | FLOAT )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(84,4);
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
		dbg.location(85, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "no");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "no"



	// $ANTLR start "op"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:86:1: op : ( POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE );
	public final void op() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "op");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(86, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:86:4: ( POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(86,4);
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
		dbg.location(87, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "op");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "op"



	// $ANTLR start "conOp"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:89:1: conOp : ( NEQ | EQ | GT | GEQ | LT | LEQ );
	public final void conOp() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "conOp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(89, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:89:7: ( NEQ | EQ | GT | GEQ | LT | LEQ )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(89,7);
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
		dbg.location(90, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "conOp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "conOp"



	// $ANTLR start "s"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:93:1: s : ( ID | INT | FLOAT | STRING | CHAR | SWITCH | CASE | ELIF | ELSE | WHILE | DO | FOR | FUNCTION | RETURN | T_INT | T_FLOAT | T_CHAR | T_STRING | SEMI | POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE | ASSIGN | SLL | SRL | AND | OR | XOR | B_AND | B_OR | LOPEN | LCLOSE | BOPEN | BCLOSE | EQ | GT | GEQ | LT | LEQ | NEQ | COPEN | CCLOSE );
	public final void s() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "s");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(93, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:93:3: ( ID | INT | FLOAT | STRING | CHAR | SWITCH | CASE | ELIF | ELSE | WHILE | DO | FOR | FUNCTION | RETURN | T_INT | T_FLOAT | T_CHAR | T_STRING | SEMI | POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE | ASSIGN | SLL | SRL | AND | OR | XOR | B_AND | B_OR | LOPEN | LCLOSE | BOPEN | BCLOSE | EQ | GT | GEQ | LT | LEQ | NEQ | COPEN | CCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(93,3);
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
		dbg.location(96, 2);

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

	// $ANTLR start synpred18_s
	public final void synpred18_s_fragment() throws RecognitionException {
		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:5: ( ( ',' ( type ID ) )* )
		dbg.enterAlt(1);

		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:5: ( ',' ( type ID ) )*
		{
		dbg.location(41,5);
		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:5: ( ',' ( type ID ) )*
		try { dbg.enterSubRule(27);

		loop27:
		while (true) {
			int alt27=2;
			try { dbg.enterDecision(27, decisionCanBacktrack[27]);

			int LA27_0 = input.LA(1);
			if ( (LA27_0==57) ) {
				alt27=1;
			}

			} finally {dbg.exitDecision(27);}

			switch (alt27) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:6: ',' ( type ID )
				{
				dbg.location(41,6);
				match(input,57,FOLLOW_57_in_synpred18_s263); if (state.failed) return;dbg.location(41,9);
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:9: ( type ID )
				dbg.enterAlt(1);

				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:10: type ID
				{
				dbg.location(41,10);
				pushFollow(FOLLOW_type_in_synpred18_s265);
				type();
				state._fsp--;
				if (state.failed) return;dbg.location(41,15);
				match(input,ID,FOLLOW_ID_in_synpred18_s267); if (state.failed) return;
				}

				}
				break;

			default :
				break loop27;
			}
		}
		} finally {dbg.exitSubRule(27);}

		}

	}
	// $ANTLR end synpred18_s

	// $ANTLR start synpred24_s
	public final void synpred24_s_fragment() throws RecognitionException {
		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:49:5: ( ( ',' ( e | STRING ) )* )
		dbg.enterAlt(1);

		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:49:5: ( ',' ( e | STRING ) )*
		{
		dbg.location(49,5);
		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:49:5: ( ',' ( e | STRING ) )*
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

				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:49:6: ',' ( e | STRING )
				{
				dbg.location(49,6);
				match(input,57,FOLLOW_57_in_synpred24_s319); if (state.failed) return;dbg.location(49,9);
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:49:9: ( e | STRING )
				int alt30=2;
				try { dbg.enterSubRule(30);
				try { dbg.enterDecision(30, decisionCanBacktrack[30]);

				int LA30_0 = input.LA(1);
				if ( (LA30_0==FLOAT||LA30_0==ID||LA30_0==INT) ) {
					alt30=1;
				}
				else if ( (LA30_0==STRING) ) {
					alt30=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					NoViableAltException nvae =
						new NoViableAltException("", 30, 0, input);
					dbg.recognitionException(nvae);
					throw nvae;
				}

				} finally {dbg.exitDecision(30);}

				switch (alt30) {
					case 1 :
						dbg.enterAlt(1);

						// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:49:10: e
						{
						dbg.location(49,10);
						pushFollow(FOLLOW_e_in_synpred24_s321);
						e();
						state._fsp--;
						if (state.failed) return;
						}
						break;
					case 2 :
						dbg.enterAlt(2);

						// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:49:12: STRING
						{
						dbg.location(49,12);
						match(input,STRING,FOLLOW_STRING_in_synpred24_s323); if (state.failed) return;
						}
						break;

				}
				} finally {dbg.exitSubRule(30);}

				}
				break;

			default :
				break loop31;
			}
		}
		} finally {dbg.exitSubRule(31);}

		}

	}
	// $ANTLR end synpred24_s

	// Delegated rules

	public final boolean synpred18_s() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred18_s_fragment(); // can never throw exception
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
	public final boolean synpred24_s() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred24_s_fragment(); // can never throw exception
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
			"\1\2\10\uffff\1\3\6\uffff\1\3\4\uffff\2\3\23\uffff\4\1\1\uffff\1\3",
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

	public static final BitSet FOLLOW_blocks_in_start37 = new BitSet(new long[]{0x005E000030810080L});
	public static final BitSet FOLLOW_EOF_in_start40 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_def_in_blocks50 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOPEN_in_blocks53 = new BitSet(new long[]{0x005E000030810000L});
	public static final BitSet FOLLOW_block_in_blocks55 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_blocks57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_blocks61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statements_in_block72 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements85 = new BitSet(new long[]{0x005E000030810002L});
	public static final BitSet FOLLOW_statement_in_statements87 = new BitSet(new long[]{0x005E000030810002L});
	public static final BitSet FOLLOW_assign_st_in_statement100 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_statement102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_st_in_statement106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_st_in_statement110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_st_in_statement114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_do_st_in_statement117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for_st_in_statement120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_for_st131 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_for_st133 = new BitSet(new long[]{0x001E080010000000L});
	public static final BitSet FOLLOW_assign_st_in_for_st135 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_for_st138 = new BitSet(new long[]{0x0000080050400000L});
	public static final BitSet FOLLOW_condition_in_for_st140 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_for_st143 = new BitSet(new long[]{0x001E000090000000L});
	public static final BitSet FOLLOW_assign_st_in_for_st145 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_for_st148 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_for_st150 = new BitSet(new long[]{0x005E000030810000L});
	public static final BitSet FOLLOW_statements_in_for_st152 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_for_st154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_while_st162 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_while_st164 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_condition_in_while_st166 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_while_st168 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_while_st170 = new BitSet(new long[]{0x005E000030810000L});
	public static final BitSet FOLLOW_statements_in_while_st172 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_while_st174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_do_st185 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_do_st187 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_condition_in_do_st189 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_do_st191 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_do_st193 = new BitSet(new long[]{0x005E000030810000L});
	public static final BitSet FOLLOW_statements_in_do_st195 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_do_st197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_function_def207 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_function_def209 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_function_def211 = new BitSet(new long[]{0x001E000080000000L});
	public static final BitSet FOLLOW_def_params_in_function_def213 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_function_def215 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_function_def217 = new BitSet(new long[]{0x005E000030810000L});
	public static final BitSet FOLLOW_block_in_function_def219 = new BitSet(new long[]{0x0000040000000040L});
	public static final BitSet FOLLOW_RETURN_in_function_def222 = new BitSet(new long[]{0x0000400050400000L});
	public static final BitSet FOLLOW_no_in_function_def224 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_STRING_in_function_def226 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_ID_in_function_def228 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_function_def231 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_function_def236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_def_params247 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_def_params249 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_m_in_def_params252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_m263 = new BitSet(new long[]{0x001E000000000000L});
	public static final BitSet FOLLOW_type_in_m265 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_m267 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_ID_in_function_st284 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_function_st286 = new BitSet(new long[]{0x00004000D0400000L});
	public static final BitSet FOLLOW_params_in_function_st288 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_function_st290 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_SEMI_in_function_st292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_e_in_params303 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_STRING_in_params305 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_f_in_params308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_f319 = new BitSet(new long[]{0x0000400050400000L});
	public static final BitSet FOLLOW_e_in_f321 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_STRING_in_f323 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_IF_in_if_st339 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_if_st341 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_condition_in_if_st343 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_if_st345 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_if_st347 = new BitSet(new long[]{0x005E000030810000L});
	public static final BitSet FOLLOW_statements_in_if_st349 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_if_st351 = new BitSet(new long[]{0x0000000000060002L});
	public static final BitSet FOLLOW_else_if_st_in_if_st354 = new BitSet(new long[]{0x0000000000060002L});
	public static final BitSet FOLLOW_else_st_in_if_st359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELIF_in_else_if_st372 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_else_if_st374 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_condition_in_else_if_st376 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_else_if_st378 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_else_if_st380 = new BitSet(new long[]{0x005E000030810000L});
	public static final BitSet FOLLOW_statements_in_else_if_st382 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_else_if_st384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_st396 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_else_st398 = new BitSet(new long[]{0x005E000030810000L});
	public static final BitSet FOLLOW_statements_in_else_st400 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_else_st402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_e_in_condition414 = new BitSet(new long[]{0x0000001506080000L});
	public static final BitSet FOLLOW_conOp_in_condition416 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_e_in_condition418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_e431 = new BitSet(new long[]{0x0000838800008002L});
	public static final BitSet FOLLOW_no_in_e433 = new BitSet(new long[]{0x0000838800008002L});
	public static final BitSet FOLLOW_op_in_e437 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_ID_in_e440 = new BitSet(new long[]{0x0000838800008002L});
	public static final BitSet FOLLOW_no_in_e442 = new BitSet(new long[]{0x0000838800008002L});
	public static final BitSet FOLLOW_type_in_assign_st457 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_assign_st460 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_r_in_assign_st462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assign_st466 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_r_in_assign_st468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_r480 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_e_in_r482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type1_in_type495 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COPEN_in_type498 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CCLOSE_in_type500 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_statement_in_synpred4_s87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_synpred18_s263 = new BitSet(new long[]{0x001E000000000000L});
	public static final BitSet FOLLOW_type_in_synpred18_s265 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_synpred18_s267 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_57_in_synpred24_s319 = new BitSet(new long[]{0x0000400050400000L});
	public static final BitSet FOLLOW_e_in_synpred24_s321 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_STRING_in_synpred24_s323 = new BitSet(new long[]{0x0200000000000002L});
}
