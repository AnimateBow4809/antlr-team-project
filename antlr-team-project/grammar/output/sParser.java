// $ANTLR 3.5.1 C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g 2023-05-31 17:13:56

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
		"invalidRule", "synpred56_s", "synpred74_s", "block", "synpred67_s", "synpred23_s", 
		"synpred26_s", "m", "synpred65_s", "synpred17_s", "else_if_st", "synpred53_s", 
		"synpred5_s", "synpred33_s", "synpred11_s", "synpred66_s", "synpred6_s", 
		"s", "synpred25_s", "synpred45_s", "params", "synpred72_s", "type1", "e", 
		"synpred3_s", "synpred63_s", "synpred68_s", "synpred13_s", "synpred71_s", 
		"synpred61_s", "synpred40_s", "synpred50_s", "synpred47_s", "synpred9_s", 
		"synpred31_s", "synpred76_s", "synpred34_s", "synpred1_s", "synpred22_s", 
		"synpred52_s", "synpred24_s", "r", "synpred28_s", "synpred46_s", "synpred15_s", 
		"type", "synpred7_s", "function_st", "synpred38_s", "op", "synpred16_s", 
		"synpred70_s", "blocks", "synpred19_s", "synpred60_s", "else_st", "synpred48_s", 
		"synpred41_s", "synpred51_s", "synpred59_s", "synpred73_s", "synpred12_s", 
		"synpred55_s", "synpred62_s", "synpred42_s", "synpred54_s", "synpred20_s", 
		"statement", "synpred75_s", "function_def", "synpred49_s", "synpred44_s", 
		"condition", "statements", "synpred18_s", "synpred27_s", "synpred36_s", 
		"if_st", "synpred2_s", "synpred58_s", "start", "synpred37_s", "synpred35_s", 
		"f", "no", "synpred43_s", "synpred39_s", "synpred21_s", "synpred57_s", 
		"synpred10_s", "synpred14_s", "def_params", "assign_st", "synpred8_s", 
		"synpred4_s", "synpred29_s", "synpred30_s", "synpred64_s", "synpred32_s", 
		"synpred69_s"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, true, false, false, false, true, false, false, false, false, 
		    false, true, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false
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
				if ( (LA1_0==BOPEN||(LA1_0 >= ID && LA1_0 <= IF)||(LA1_0 >= T_CHAR && LA1_0 <= T_STRING)) ) {
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
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:24:1: statement : ( assign_st | if_st | function_st );
	public final void statement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(24, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:25:2: ( assign_st | if_st | function_st )
			int alt4=3;
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



	// $ANTLR start "function_def"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:28:1: function_def : type ID LOPEN def_params LCLOSE BOPEN block BCLOSE ;
	public final void function_def() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "function_def");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(28, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:29:2: ( type ID LOPEN def_params LCLOSE BOPEN block BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:29:4: type ID LOPEN def_params LCLOSE BOPEN block BCLOSE
			{
			dbg.location(29,4);
			pushFollow(FOLLOW_type_in_function_def120);
			type();
			state._fsp--;
			if (state.failed) return;dbg.location(29,9);
			match(input,ID,FOLLOW_ID_in_function_def122); if (state.failed) return;dbg.location(29,12);
			match(input,LOPEN,FOLLOW_LOPEN_in_function_def124); if (state.failed) return;dbg.location(29,18);
			pushFollow(FOLLOW_def_params_in_function_def126);
			def_params();
			state._fsp--;
			if (state.failed) return;dbg.location(29,29);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_function_def128); if (state.failed) return;dbg.location(29,36);
			match(input,BOPEN,FOLLOW_BOPEN_in_function_def130); if (state.failed) return;dbg.location(29,42);
			pushFollow(FOLLOW_block_in_function_def132);
			block();
			state._fsp--;
			if (state.failed) return;dbg.location(29,48);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_function_def134); if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "function_def");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "function_def"



	// $ANTLR start "def_params"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:31:1: def_params : ( ( type ID ) m |);
	public final void def_params() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "def_params");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(31, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:32:2: ( ( type ID ) m |)
			int alt5=2;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= T_CHAR && LA5_0 <= T_STRING)) ) {
				alt5=1;
			}
			else if ( (LA5_0==LCLOSE) ) {
				alt5=2;
			}

			else {
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

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:32:4: ( type ID ) m
					{
					dbg.location(32,4);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:32:4: ( type ID )
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:32:5: type ID
					{
					dbg.location(32,5);
					pushFollow(FOLLOW_type_in_def_params145);
					type();
					state._fsp--;
					if (state.failed) return;dbg.location(32,10);
					match(input,ID,FOLLOW_ID_in_def_params147); if (state.failed) return;
					}
					dbg.location(32,14);
					pushFollow(FOLLOW_m_in_def_params150);
					m();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:33:2: 
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
		dbg.location(33, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "def_params");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "def_params"



	// $ANTLR start "m"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:1: m : ( ( ',' ( type ID ) )* |);
	public final void m() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "m");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(34, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:3: ( ( ',' ( type ID ) )* |)
			int alt7=2;
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			switch ( input.LA(1) ) {
			case 57:
				{
				alt7=1;
				}
				break;
			case LCLOSE:
				{
				int LA7_2 = input.LA(2);
				if ( (synpred9_s()) ) {
					alt7=1;
				}
				else if ( (true) ) {
					alt7=2;
				}

				}
				break;
			case EOF:
				{
				int LA7_3 = input.LA(2);
				if ( (synpred9_s()) ) {
					alt7=1;
				}
				else if ( (true) ) {
					alt7=2;
				}

				}
				break;
			default:
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

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:5: ( ',' ( type ID ) )*
					{
					dbg.location(34,5);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:5: ( ',' ( type ID ) )*
					try { dbg.enterSubRule(6);

					loop6:
					while (true) {
						int alt6=2;
						try { dbg.enterDecision(6, decisionCanBacktrack[6]);

						int LA6_0 = input.LA(1);
						if ( (LA6_0==57) ) {
							alt6=1;
						}

						} finally {dbg.exitDecision(6);}

						switch (alt6) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:6: ',' ( type ID )
							{
							dbg.location(34,6);
							match(input,57,FOLLOW_57_in_m161); if (state.failed) return;dbg.location(34,9);
							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:9: ( type ID )
							dbg.enterAlt(1);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:10: type ID
							{
							dbg.location(34,10);
							pushFollow(FOLLOW_type_in_m163);
							type();
							state._fsp--;
							if (state.failed) return;dbg.location(34,15);
							match(input,ID,FOLLOW_ID_in_m165); if (state.failed) return;
							}

							}
							break;

						default :
							break loop6;
						}
					}
					} finally {dbg.exitSubRule(6);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:35:2: 
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
		dbg.location(35, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "m");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "m"



	// $ANTLR start "function_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:37:1: function_st : ID LOPEN params LCLOSE ( SEMI )? ;
	public final void function_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "function_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(37, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:38:2: ( ID LOPEN params LCLOSE ( SEMI )? )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:38:4: ID LOPEN params LCLOSE ( SEMI )?
			{
			dbg.location(38,4);
			match(input,ID,FOLLOW_ID_in_function_st182); if (state.failed) return;dbg.location(38,7);
			match(input,LOPEN,FOLLOW_LOPEN_in_function_st184); if (state.failed) return;dbg.location(38,13);
			pushFollow(FOLLOW_params_in_function_st186);
			params();
			state._fsp--;
			if (state.failed) return;dbg.location(38,20);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_function_st188); if (state.failed) return;dbg.location(38,27);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:38:27: ( SEMI )?
			int alt8=2;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==SEMI) ) {
				alt8=1;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:38:27: SEMI
					{
					dbg.location(38,27);
					match(input,SEMI,FOLLOW_SEMI_in_function_st190); if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(8);}

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
			dbg.exitRule(getGrammarFileName(), "function_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "function_st"



	// $ANTLR start "params"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:40:1: params : ( ( e | STRING ) f |);
	public final void params() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "params");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(40, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:40:8: ( ( e | STRING ) f |)
			int alt10=2;
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==FLOAT||LA10_0==ID||LA10_0==INT||LA10_0==STRING) ) {
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

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:40:10: ( e | STRING ) f
					{
					dbg.location(40,10);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:40:10: ( e | STRING )
					int alt9=2;
					try { dbg.enterSubRule(9);
					try { dbg.enterDecision(9, decisionCanBacktrack[9]);

					int LA9_0 = input.LA(1);
					if ( (LA9_0==FLOAT||LA9_0==ID||LA9_0==INT) ) {
						alt9=1;
					}
					else if ( (LA9_0==STRING) ) {
						alt9=2;
					}

					else {
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

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:40:11: e
							{
							dbg.location(40,11);
							pushFollow(FOLLOW_e_in_params201);
							e();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:40:13: STRING
							{
							dbg.location(40,13);
							match(input,STRING,FOLLOW_STRING_in_params203); if (state.failed) return;
							}
							break;

					}
					} finally {dbg.exitSubRule(9);}
					dbg.location(40,21);
					pushFollow(FOLLOW_f_in_params206);
					f();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:41:2: 
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
		dbg.location(41, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "params");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "params"



	// $ANTLR start "f"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:42:1: f : ( ( ',' ( e | STRING ) )* |);
	public final void f() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "f");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(42, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:42:3: ( ( ',' ( e | STRING ) )* |)
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
				if ( (synpred15_s()) ) {
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
				if ( (synpred15_s()) ) {
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

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:42:5: ( ',' ( e | STRING ) )*
					{
					dbg.location(42,5);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:42:5: ( ',' ( e | STRING ) )*
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

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:42:6: ',' ( e | STRING )
							{
							dbg.location(42,6);
							match(input,57,FOLLOW_57_in_f217); if (state.failed) return;dbg.location(42,9);
							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:42:9: ( e | STRING )
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

									// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:42:10: e
									{
									dbg.location(42,10);
									pushFollow(FOLLOW_e_in_f219);
									e();
									state._fsp--;
									if (state.failed) return;
									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:42:12: STRING
									{
									dbg.location(42,12);
									match(input,STRING,FOLLOW_STRING_in_f221); if (state.failed) return;
									}
									break;

							}
							} finally {dbg.exitSubRule(11);}

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

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:43:2: 
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
		dbg.location(43, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "f");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "f"



	// $ANTLR start "if_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:45:1: if_st : IF LOPEN condition LCLOSE BOPEN statements BCLOSE ( else_if_st )* ( else_st )? ;
	public final void if_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "if_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:45:6: ( IF LOPEN condition LCLOSE BOPEN statements BCLOSE ( else_if_st )* ( else_st )? )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:45:9: IF LOPEN condition LCLOSE BOPEN statements BCLOSE ( else_if_st )* ( else_st )?
			{
			dbg.location(45,9);
			match(input,IF,FOLLOW_IF_in_if_st237); if (state.failed) return;dbg.location(45,12);
			match(input,LOPEN,FOLLOW_LOPEN_in_if_st239); if (state.failed) return;dbg.location(45,18);
			pushFollow(FOLLOW_condition_in_if_st241);
			condition();
			state._fsp--;
			if (state.failed) return;dbg.location(45,28);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_if_st243); if (state.failed) return;dbg.location(45,35);
			match(input,BOPEN,FOLLOW_BOPEN_in_if_st245); if (state.failed) return;dbg.location(45,41);
			pushFollow(FOLLOW_statements_in_if_st247);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(45,52);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_if_st249); if (state.failed) return;dbg.location(45,59);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:45:59: ( else_if_st )*
			try { dbg.enterSubRule(14);

			loop14:
			while (true) {
				int alt14=2;
				try { dbg.enterDecision(14, decisionCanBacktrack[14]);

				int LA14_0 = input.LA(1);
				if ( (LA14_0==ELIF) ) {
					alt14=1;
				}

				} finally {dbg.exitDecision(14);}

				switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:45:60: else_if_st
					{
					dbg.location(45,60);
					pushFollow(FOLLOW_else_if_st_in_if_st252);
					else_if_st();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop14;
				}
			}
			} finally {dbg.exitSubRule(14);}
			dbg.location(45,73);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:45:73: ( else_st )?
			int alt15=2;
			try { dbg.enterSubRule(15);
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==ELSE) ) {
				alt15=1;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:45:74: else_st
					{
					dbg.location(45,74);
					pushFollow(FOLLOW_else_st_in_if_st257);
					else_st();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(15);}

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
			dbg.exitRule(getGrammarFileName(), "if_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "if_st"



	// $ANTLR start "else_if_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:48:1: else_if_st : ELIF LOPEN condition LCLOSE BOPEN statements BCLOSE ;
	public final void else_if_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "else_if_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(48, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:49:2: ( ELIF LOPEN condition LCLOSE BOPEN statements BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:49:4: ELIF LOPEN condition LCLOSE BOPEN statements BCLOSE
			{
			dbg.location(49,4);
			match(input,ELIF,FOLLOW_ELIF_in_else_if_st270); if (state.failed) return;dbg.location(49,9);
			match(input,LOPEN,FOLLOW_LOPEN_in_else_if_st272); if (state.failed) return;dbg.location(49,15);
			pushFollow(FOLLOW_condition_in_else_if_st274);
			condition();
			state._fsp--;
			if (state.failed) return;dbg.location(49,25);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_else_if_st276); if (state.failed) return;dbg.location(49,32);
			match(input,BOPEN,FOLLOW_BOPEN_in_else_if_st278); if (state.failed) return;dbg.location(49,38);
			pushFollow(FOLLOW_statements_in_else_if_st280);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(49,49);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_else_if_st282); if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "else_if_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "else_if_st"



	// $ANTLR start "else_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:52:1: else_st : ELSE BOPEN statements BCLOSE ;
	public final void else_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "else_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(52, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:52:9: ( ELSE BOPEN statements BCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:52:11: ELSE BOPEN statements BCLOSE
			{
			dbg.location(52,11);
			match(input,ELSE,FOLLOW_ELSE_in_else_st294); if (state.failed) return;dbg.location(52,16);
			match(input,BOPEN,FOLLOW_BOPEN_in_else_st296); if (state.failed) return;dbg.location(52,22);
			pushFollow(FOLLOW_statements_in_else_st298);
			statements();
			state._fsp--;
			if (state.failed) return;dbg.location(52,33);
			match(input,BCLOSE,FOLLOW_BCLOSE_in_else_st300); if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "else_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "else_st"



	// $ANTLR start "condition"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:55:1: condition : e ( NEQ | EQ ) e ;
	public final void condition() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "condition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(55, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:56:2: ( e ( NEQ | EQ ) e )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:56:4: e ( NEQ | EQ ) e
			{
			dbg.location(56,4);
			pushFollow(FOLLOW_e_in_condition312);
			e();
			state._fsp--;
			if (state.failed) return;dbg.location(56,6);
			if ( input.LA(1)==EQ||input.LA(1)==NEQ ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}dbg.location(56,15);
			pushFollow(FOLLOW_e_in_condition320);
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
		dbg.location(57, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "condition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "condition"



	// $ANTLR start "e"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:59:1: e : ( ( ID | no ) ( op ( ID | no ) )* ) ;
	public final void e() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "e");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(59, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:59:3: ( ( ( ID | no ) ( op ( ID | no ) )* ) )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:59:5: ( ( ID | no ) ( op ( ID | no ) )* )
			{
			dbg.location(59,5);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:59:5: ( ( ID | no ) ( op ( ID | no ) )* )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:59:6: ( ID | no ) ( op ( ID | no ) )*
			{
			dbg.location(59,6);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:59:6: ( ID | no )
			int alt16=2;
			try { dbg.enterSubRule(16);
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			int LA16_0 = input.LA(1);
			if ( (LA16_0==ID) ) {
				alt16=1;
			}
			else if ( (LA16_0==FLOAT||LA16_0==INT) ) {
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

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:59:7: ID
					{
					dbg.location(59,7);
					match(input,ID,FOLLOW_ID_in_e333); if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:59:10: no
					{
					dbg.location(59,10);
					pushFollow(FOLLOW_no_in_e335);
					no();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
			} finally {dbg.exitSubRule(16);}
			dbg.location(59,14);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:59:14: ( op ( ID | no ) )*
			try { dbg.enterSubRule(18);

			loop18:
			while (true) {
				int alt18=2;
				try { dbg.enterDecision(18, decisionCanBacktrack[18]);

				int LA18_0 = input.LA(1);
				if ( (LA18_0==DIVIDE||LA18_0==MULTIPLY||(LA18_0 >= PLUS && LA18_0 <= REM)||LA18_0==SUB) ) {
					alt18=1;
				}

				} finally {dbg.exitDecision(18);}

				switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:59:15: op ( ID | no )
					{
					dbg.location(59,15);
					pushFollow(FOLLOW_op_in_e339);
					op();
					state._fsp--;
					if (state.failed) return;dbg.location(59,18);
					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:59:18: ( ID | no )
					int alt17=2;
					try { dbg.enterSubRule(17);
					try { dbg.enterDecision(17, decisionCanBacktrack[17]);

					int LA17_0 = input.LA(1);
					if ( (LA17_0==ID) ) {
						alt17=1;
					}
					else if ( (LA17_0==FLOAT||LA17_0==INT) ) {
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

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:59:19: ID
							{
							dbg.location(59,19);
							match(input,ID,FOLLOW_ID_in_e342); if (state.failed) return;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:59:22: no
							{
							dbg.location(59,22);
							pushFollow(FOLLOW_no_in_e344);
							no();
							state._fsp--;
							if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "e");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "e"



	// $ANTLR start "assign_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:62:1: assign_st : ( type ID r | ID r );
	public final void assign_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "assign_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(62, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:63:2: ( type ID r | ID r )
			int alt19=2;
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			int LA19_0 = input.LA(1);
			if ( ((LA19_0 >= T_CHAR && LA19_0 <= T_STRING)) ) {
				alt19=1;
			}
			else if ( (LA19_0==ID) ) {
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

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:63:4: type ID r
					{
					dbg.location(63,4);
					pushFollow(FOLLOW_type_in_assign_st359);
					type();
					state._fsp--;
					if (state.failed) return;dbg.location(63,10);
					match(input,ID,FOLLOW_ID_in_assign_st362); if (state.failed) return;dbg.location(63,13);
					pushFollow(FOLLOW_r_in_assign_st364);
					r();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:63:17: ID r
					{
					dbg.location(63,17);
					match(input,ID,FOLLOW_ID_in_assign_st368); if (state.failed) return;dbg.location(63,20);
					pushFollow(FOLLOW_r_in_assign_st370);
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
		dbg.location(64, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assign_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "assign_st"



	// $ANTLR start "r"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:66:1: r : ASSIGN e SEMI ;
	public final void r() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "r");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(66, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:66:3: ( ASSIGN e SEMI )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:66:5: ASSIGN e SEMI
			{
			dbg.location(66,5);
			match(input,ASSIGN,FOLLOW_ASSIGN_in_r382); if (state.failed) return;dbg.location(66,12);
			pushFollow(FOLLOW_e_in_r384);
			e();
			state._fsp--;
			if (state.failed) return;dbg.location(66,14);
			match(input,SEMI,FOLLOW_SEMI_in_r386); if (state.failed) return;
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
			dbg.exitRule(getGrammarFileName(), "r");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "r"



	// $ANTLR start "type"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:71:1: type : type1 ( COPEN CCLOSE )* ;
	public final void type() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "type");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(71, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:71:6: ( type1 ( COPEN CCLOSE )* )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:71:8: type1 ( COPEN CCLOSE )*
			{
			dbg.location(71,8);
			pushFollow(FOLLOW_type1_in_type398);
			type1();
			state._fsp--;
			if (state.failed) return;dbg.location(71,14);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:71:14: ( COPEN CCLOSE )*
			try { dbg.enterSubRule(20);

			loop20:
			while (true) {
				int alt20=2;
				try { dbg.enterDecision(20, decisionCanBacktrack[20]);

				int LA20_0 = input.LA(1);
				if ( (LA20_0==COPEN) ) {
					alt20=1;
				}

				} finally {dbg.exitDecision(20);}

				switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:71:15: COPEN CCLOSE
					{
					dbg.location(71,15);
					match(input,COPEN,FOLLOW_COPEN_in_type401); if (state.failed) return;dbg.location(71,21);
					match(input,CCLOSE,FOLLOW_CCLOSE_in_type403); if (state.failed) return;
					}
					break;

				default :
					break loop20;
				}
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
		dbg.location(72, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "type"



	// $ANTLR start "type1"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:74:1: type1 : ( T_INT | T_FLOAT | T_CHAR | T_STRING );
	public final void type1() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "type1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(74, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:74:7: ( T_INT | T_FLOAT | T_CHAR | T_STRING )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(74,7);
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
		dbg.location(75, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "type1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "type1"



	// $ANTLR start "no"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:77:1: no : ( INT | FLOAT );
	public final void no() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "no");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(77, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:77:4: ( INT | FLOAT )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(77,4);
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
		dbg.location(78, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "no");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "no"



	// $ANTLR start "op"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:79:1: op : ( POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE );
	public final void op() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "op");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(79, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:79:4: ( POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(79,4);
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
		dbg.location(80, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "op");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "op"



	// $ANTLR start "s"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:83:1: s : ( ID | INT | FLOAT | STRING | CHAR | SWITCH | CASE | ELIF | ELSE | WHILE | DO | FOR | FUNCTION | RETURN | T_INT | T_FLOAT | T_CHAR | T_STRING | SEMI | POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE | ASSIGN | SLL | SRL | AND | OR | XOR | B_AND | B_OR | LOPEN | LCLOSE | BOPEN | BCLOSE | EQ | GT | GEQ | LT | LEQ | NEQ | COPEN | CCLOSE );
	public final void s() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "s");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(83, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:83:3: ( ID | INT | FLOAT | STRING | CHAR | SWITCH | CASE | ELIF | ELSE | WHILE | DO | FOR | FUNCTION | RETURN | T_INT | T_FLOAT | T_CHAR | T_STRING | SEMI | POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE | ASSIGN | SLL | SRL | AND | OR | XOR | B_AND | B_OR | LOPEN | LCLOSE | BOPEN | BCLOSE | EQ | GT | GEQ | LT | LEQ | NEQ | COPEN | CCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:
			{
			dbg.location(83,3);
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
		dbg.location(86, 2);

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

	// $ANTLR start synpred9_s
	public final void synpred9_s_fragment() throws RecognitionException {
		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:5: ( ( ',' ( type ID ) )* )
		dbg.enterAlt(1);

		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:5: ( ',' ( type ID ) )*
		{
		dbg.location(34,5);
		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:5: ( ',' ( type ID ) )*
		try { dbg.enterSubRule(21);

		loop21:
		while (true) {
			int alt21=2;
			try { dbg.enterDecision(21, decisionCanBacktrack[21]);

			int LA21_0 = input.LA(1);
			if ( (LA21_0==57) ) {
				alt21=1;
			}

			} finally {dbg.exitDecision(21);}

			switch (alt21) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:6: ',' ( type ID )
				{
				dbg.location(34,6);
				match(input,57,FOLLOW_57_in_synpred9_s161); if (state.failed) return;dbg.location(34,9);
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:9: ( type ID )
				dbg.enterAlt(1);

				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:34:10: type ID
				{
				dbg.location(34,10);
				pushFollow(FOLLOW_type_in_synpred9_s163);
				type();
				state._fsp--;
				if (state.failed) return;dbg.location(34,15);
				match(input,ID,FOLLOW_ID_in_synpred9_s165); if (state.failed) return;
				}

				}
				break;

			default :
				break loop21;
			}
		}
		} finally {dbg.exitSubRule(21);}

		}

	}
	// $ANTLR end synpred9_s

	// $ANTLR start synpred15_s
	public final void synpred15_s_fragment() throws RecognitionException {
		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:42:5: ( ( ',' ( e | STRING ) )* )
		dbg.enterAlt(1);

		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:42:5: ( ',' ( e | STRING ) )*
		{
		dbg.location(42,5);
		// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:42:5: ( ',' ( e | STRING ) )*
		try { dbg.enterSubRule(25);

		loop25:
		while (true) {
			int alt25=2;
			try { dbg.enterDecision(25, decisionCanBacktrack[25]);

			int LA25_0 = input.LA(1);
			if ( (LA25_0==57) ) {
				alt25=1;
			}

			} finally {dbg.exitDecision(25);}

			switch (alt25) {
			case 1 :
				dbg.enterAlt(1);

				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:42:6: ',' ( e | STRING )
				{
				dbg.location(42,6);
				match(input,57,FOLLOW_57_in_synpred15_s217); if (state.failed) return;dbg.location(42,9);
				// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:42:9: ( e | STRING )
				int alt24=2;
				try { dbg.enterSubRule(24);
				try { dbg.enterDecision(24, decisionCanBacktrack[24]);

				int LA24_0 = input.LA(1);
				if ( (LA24_0==FLOAT||LA24_0==ID||LA24_0==INT) ) {
					alt24=1;
				}
				else if ( (LA24_0==STRING) ) {
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

						// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:42:10: e
						{
						dbg.location(42,10);
						pushFollow(FOLLOW_e_in_synpred15_s219);
						e();
						state._fsp--;
						if (state.failed) return;
						}
						break;
					case 2 :
						dbg.enterAlt(2);

						// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:42:12: STRING
						{
						dbg.location(42,12);
						match(input,STRING,FOLLOW_STRING_in_synpred15_s221); if (state.failed) return;
						}
						break;

				}
				} finally {dbg.exitSubRule(24);}

				}
				break;

			default :
				break loop25;
			}
		}
		} finally {dbg.exitSubRule(25);}

		}

	}
	// $ANTLR end synpred15_s

	// Delegated rules

	public final boolean synpred9_s() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred9_s_fragment(); // can never throw exception
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
	public final boolean synpred15_s() {
		state.backtracking++;
		dbg.beginBacktrack(state.backtracking);
		int start = input.mark();
		try {
			synpred15_s_fragment(); // can never throw exception
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


	protected DFA2 dfa2 = new DFA2(this);
	static final String DFA2_eotS =
		"\10\uffff";
	static final String DFA2_eofS =
		"\10\uffff";
	static final String DFA2_minS =
		"\1\7\1\16\2\uffff\1\13\1\5\1\16\1\uffff";
	static final String DFA2_maxS =
		"\1\64\1\34\2\uffff\1\13\1\41\1\34\1\uffff";
	static final String DFA2_acceptS =
		"\2\uffff\1\2\1\3\3\uffff\1\1";
	static final String DFA2_specialS =
		"\10\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\2\24\uffff\2\3\23\uffff\4\1",
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

	public static final BitSet FOLLOW_blocks_in_start37 = new BitSet(new long[]{0x001E000030000080L});
	public static final BitSet FOLLOW_EOF_in_start40 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_def_in_blocks50 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOPEN_in_blocks53 = new BitSet(new long[]{0x001E000030000000L});
	public static final BitSet FOLLOW_block_in_blocks55 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_blocks57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_blocks61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statements_in_block72 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements85 = new BitSet(new long[]{0x001E000030000002L});
	public static final BitSet FOLLOW_statement_in_statements87 = new BitSet(new long[]{0x001E000030000002L});
	public static final BitSet FOLLOW_assign_st_in_statement100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_st_in_statement104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_st_in_statement108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_function_def120 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_function_def122 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_function_def124 = new BitSet(new long[]{0x001E000080000000L});
	public static final BitSet FOLLOW_def_params_in_function_def126 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_function_def128 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_function_def130 = new BitSet(new long[]{0x001E000030000000L});
	public static final BitSet FOLLOW_block_in_function_def132 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_function_def134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_def_params145 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_def_params147 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_m_in_def_params150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_m161 = new BitSet(new long[]{0x001E000000000000L});
	public static final BitSet FOLLOW_type_in_m163 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_m165 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_ID_in_function_st182 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_function_st184 = new BitSet(new long[]{0x00004000D0400000L});
	public static final BitSet FOLLOW_params_in_function_st186 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_function_st188 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_SEMI_in_function_st190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_e_in_params201 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_STRING_in_params203 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_f_in_params206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_f217 = new BitSet(new long[]{0x0000400050400000L});
	public static final BitSet FOLLOW_e_in_f219 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_STRING_in_f221 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_IF_in_if_st237 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_if_st239 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_condition_in_if_st241 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_if_st243 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_if_st245 = new BitSet(new long[]{0x001E000030000000L});
	public static final BitSet FOLLOW_statements_in_if_st247 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_if_st249 = new BitSet(new long[]{0x0000000000060002L});
	public static final BitSet FOLLOW_else_if_st_in_if_st252 = new BitSet(new long[]{0x0000000000060002L});
	public static final BitSet FOLLOW_else_st_in_if_st257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELIF_in_else_if_st270 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_else_if_st272 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_condition_in_else_if_st274 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_else_if_st276 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_else_if_st278 = new BitSet(new long[]{0x001E000030000000L});
	public static final BitSet FOLLOW_statements_in_else_if_st280 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_else_if_st282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_else_st294 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BOPEN_in_else_st296 = new BitSet(new long[]{0x001E000030000000L});
	public static final BitSet FOLLOW_statements_in_else_st298 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_BCLOSE_in_else_st300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_e_in_condition312 = new BitSet(new long[]{0x0000001000080000L});
	public static final BitSet FOLLOW_set_in_condition314 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_e_in_condition320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_e333 = new BitSet(new long[]{0x0000838800008002L});
	public static final BitSet FOLLOW_no_in_e335 = new BitSet(new long[]{0x0000838800008002L});
	public static final BitSet FOLLOW_op_in_e339 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_ID_in_e342 = new BitSet(new long[]{0x0000838800008002L});
	public static final BitSet FOLLOW_no_in_e344 = new BitSet(new long[]{0x0000838800008002L});
	public static final BitSet FOLLOW_type_in_assign_st359 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_assign_st362 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_r_in_assign_st364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assign_st368 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_r_in_assign_st370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_r382 = new BitSet(new long[]{0x0000000050400000L});
	public static final BitSet FOLLOW_e_in_r384 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_SEMI_in_r386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type1_in_type398 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COPEN_in_type401 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CCLOSE_in_type403 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_statement_in_synpred4_s87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_synpred9_s161 = new BitSet(new long[]{0x001E000000000000L});
	public static final BitSet FOLLOW_type_in_synpred9_s163 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_synpred9_s165 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_57_in_synpred15_s217 = new BitSet(new long[]{0x0000400050400000L});
	public static final BitSet FOLLOW_e_in_synpred15_s219 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_STRING_in_synpred15_s221 = new BitSet(new long[]{0x0200000000000002L});
}
