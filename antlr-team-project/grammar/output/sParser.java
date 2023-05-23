// $ANTLR 3.5.1 C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g 2023-05-15 20:37:53

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
		"B_AND", "B_OR", "CASE", "CCLOSE", "CHAR", "COMMENT", "COPEN", "DIVIDE", 
		"DO", "ELIF", "ELSE", "EQ", "ESC_SEQ", "EXPONENT", "FLOAT", "FOR", "FUNCTION", 
		"GEQ", "GT", "HEX_DIGIT", "ID", "IF", "INT", "LCLOSE", "LEQ", "LOPEN", 
		"LT", "MULTIPLY", "NEQ", "OCTAL_ESC", "OR", "PLUS", "POWER", "REM", "RETURN", 
		"SEMI", "SLL", "SRL", "STRING", "SUB", "SWITCH", "T_CHAR", "T_FLOAT", 
		"T_INT", "T_STRING", "UNICODE_ESC", "WHILE", "WS", "XOR"
	};
	public static final int EOF=-1;
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
		"invalidRule", "s", "condition", "if_st", "start"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false
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
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:5:1: start : ( s )* EOF ;
	public final void start() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "start");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(5, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:5:7: ( ( s )* EOF )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:5:9: ( s )* EOF
			{
			dbg.location(5,9);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:5:9: ( s )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= AND && LA1_0 <= CHAR)||(LA1_0 >= COPEN && LA1_0 <= EQ)||(LA1_0 >= FLOAT && LA1_0 <= GT)||(LA1_0 >= ID && LA1_0 <= NEQ)||(LA1_0 >= OR && LA1_0 <= T_STRING)||LA1_0==WHILE||LA1_0==XOR) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:5:9: s
					{
					dbg.location(5,9);
					pushFollow(FOLLOW_s_in_start12);
					s();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(5,12);
			match(input,EOF,FOLLOW_EOF_in_start15); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(5, 14);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "start");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "start"



	// $ANTLR start "if_st"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:7:1: if_st : IF LOPEN condition LCLOSE ;
	public final void if_st() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "if_st");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(7, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:7:7: ( IF LOPEN condition LCLOSE )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:7:9: IF LOPEN condition LCLOSE
			{
			dbg.location(7,9);
			match(input,IF,FOLLOW_IF_in_if_st23); dbg.location(7,12);
			match(input,LOPEN,FOLLOW_LOPEN_in_if_st25); dbg.location(7,18);
			pushFollow(FOLLOW_condition_in_if_st27);
			condition();
			state._fsp--;
			dbg.location(7,28);
			match(input,LCLOSE,FOLLOW_LCLOSE_in_if_st29); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(8, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "if_st");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "if_st"



	// $ANTLR start "condition"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:10:1: condition : ( ID ( B_AND | B_OR ) ID )+ ;
	public final void condition() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "condition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(10, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:11:2: ( ( ID ( B_AND | B_OR ) ID )+ )
			dbg.enterAlt(1);

			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:11:4: ( ID ( B_AND | B_OR ) ID )+
			{
			dbg.location(11,4);
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:11:4: ( ID ( B_AND | B_OR ) ID )+
			int cnt2=0;
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==ID) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:11:5: ID ( B_AND | B_OR ) ID
					{
					dbg.location(11,5);
					match(input,ID,FOLLOW_ID_in_condition42); dbg.location(11,8);
					if ( (input.LA(1) >= B_AND && input.LA(1) <= B_OR) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(11,21);
					match(input,ID,FOLLOW_ID_in_condition50); 
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt2++;
			}
			} finally {dbg.exitSubRule(2);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(12, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "condition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "condition"



	// $ANTLR start "s"
	// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:1: s : ( ID | INT | FLOAT | STRING | CHAR | SWITCH | CASE | if_st | ELIF | ELSE | WHILE | DO | FOR | FUNCTION | RETURN | T_INT | T_FLOAT | T_CHAR | T_STRING | SEMI | POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE | ASSIGN | SLL | SRL | AND | OR | XOR | B_AND | B_OR | LOPEN | LCLOSE | BOPEN | BCLOSE | EQ | GT | GEQ | LT | LEQ | NEQ | COPEN | CCLOSE );
	public final void s() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "s");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(14, 0);

		try {
			// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:3: ( ID | INT | FLOAT | STRING | CHAR | SWITCH | CASE | if_st | ELIF | ELSE | WHILE | DO | FOR | FUNCTION | RETURN | T_INT | T_FLOAT | T_CHAR | T_STRING | SEMI | POWER | REM | PLUS | SUB | MULTIPLY | DIVIDE | ASSIGN | SLL | SRL | AND | OR | XOR | B_AND | B_OR | LOPEN | LCLOSE | BOPEN | BCLOSE | EQ | GT | GEQ | LT | LEQ | NEQ | COPEN | CCLOSE )
			int alt3=46;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			switch ( input.LA(1) ) {
			case ID:
				{
				alt3=1;
				}
				break;
			case INT:
				{
				alt3=2;
				}
				break;
			case FLOAT:
				{
				alt3=3;
				}
				break;
			case STRING:
				{
				alt3=4;
				}
				break;
			case CHAR:
				{
				alt3=5;
				}
				break;
			case SWITCH:
				{
				alt3=6;
				}
				break;
			case CASE:
				{
				alt3=7;
				}
				break;
			case IF:
				{
				alt3=8;
				}
				break;
			case ELIF:
				{
				alt3=9;
				}
				break;
			case ELSE:
				{
				alt3=10;
				}
				break;
			case WHILE:
				{
				alt3=11;
				}
				break;
			case DO:
				{
				alt3=12;
				}
				break;
			case FOR:
				{
				alt3=13;
				}
				break;
			case FUNCTION:
				{
				alt3=14;
				}
				break;
			case RETURN:
				{
				alt3=15;
				}
				break;
			case T_INT:
				{
				alt3=16;
				}
				break;
			case T_FLOAT:
				{
				alt3=17;
				}
				break;
			case T_CHAR:
				{
				alt3=18;
				}
				break;
			case T_STRING:
				{
				alt3=19;
				}
				break;
			case SEMI:
				{
				alt3=20;
				}
				break;
			case POWER:
				{
				alt3=21;
				}
				break;
			case REM:
				{
				alt3=22;
				}
				break;
			case PLUS:
				{
				alt3=23;
				}
				break;
			case SUB:
				{
				alt3=24;
				}
				break;
			case MULTIPLY:
				{
				alt3=25;
				}
				break;
			case DIVIDE:
				{
				alt3=26;
				}
				break;
			case ASSIGN:
				{
				alt3=27;
				}
				break;
			case SLL:
				{
				alt3=28;
				}
				break;
			case SRL:
				{
				alt3=29;
				}
				break;
			case AND:
				{
				alt3=30;
				}
				break;
			case OR:
				{
				alt3=31;
				}
				break;
			case XOR:
				{
				alt3=32;
				}
				break;
			case B_AND:
				{
				alt3=33;
				}
				break;
			case B_OR:
				{
				alt3=34;
				}
				break;
			case LOPEN:
				{
				alt3=35;
				}
				break;
			case LCLOSE:
				{
				alt3=36;
				}
				break;
			case BOPEN:
				{
				alt3=37;
				}
				break;
			case BCLOSE:
				{
				alt3=38;
				}
				break;
			case EQ:
				{
				alt3=39;
				}
				break;
			case GT:
				{
				alt3=40;
				}
				break;
			case GEQ:
				{
				alt3=41;
				}
				break;
			case LT:
				{
				alt3=42;
				}
				break;
			case LEQ:
				{
				alt3=43;
				}
				break;
			case NEQ:
				{
				alt3=44;
				}
				break;
			case COPEN:
				{
				alt3=45;
				}
				break;
			case CCLOSE:
				{
				alt3=46;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:5: ID
					{
					dbg.location(14,5);
					match(input,ID,FOLLOW_ID_in_s63); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:8: INT
					{
					dbg.location(14,8);
					match(input,INT,FOLLOW_INT_in_s65); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:12: FLOAT
					{
					dbg.location(14,12);
					match(input,FLOAT,FOLLOW_FLOAT_in_s67); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:18: STRING
					{
					dbg.location(14,18);
					match(input,STRING,FOLLOW_STRING_in_s69); 
					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:25: CHAR
					{
					dbg.location(14,25);
					match(input,CHAR,FOLLOW_CHAR_in_s71); 
					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:30: SWITCH
					{
					dbg.location(14,30);
					match(input,SWITCH,FOLLOW_SWITCH_in_s73); 
					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:37: CASE
					{
					dbg.location(14,37);
					match(input,CASE,FOLLOW_CASE_in_s75); 
					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:42: if_st
					{
					dbg.location(14,42);
					pushFollow(FOLLOW_if_st_in_s77);
					if_st();
					state._fsp--;

					}
					break;
				case 9 :
					dbg.enterAlt(9);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:48: ELIF
					{
					dbg.location(14,48);
					match(input,ELIF,FOLLOW_ELIF_in_s79); 
					}
					break;
				case 10 :
					dbg.enterAlt(10);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:53: ELSE
					{
					dbg.location(14,53);
					match(input,ELSE,FOLLOW_ELSE_in_s81); 
					}
					break;
				case 11 :
					dbg.enterAlt(11);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:58: WHILE
					{
					dbg.location(14,58);
					match(input,WHILE,FOLLOW_WHILE_in_s83); 
					}
					break;
				case 12 :
					dbg.enterAlt(12);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:64: DO
					{
					dbg.location(14,64);
					match(input,DO,FOLLOW_DO_in_s85); 
					}
					break;
				case 13 :
					dbg.enterAlt(13);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:67: FOR
					{
					dbg.location(14,67);
					match(input,FOR,FOLLOW_FOR_in_s87); 
					}
					break;
				case 14 :
					dbg.enterAlt(14);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:71: FUNCTION
					{
					dbg.location(14,71);
					match(input,FUNCTION,FOLLOW_FUNCTION_in_s89); 
					}
					break;
				case 15 :
					dbg.enterAlt(15);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:80: RETURN
					{
					dbg.location(14,80);
					match(input,RETURN,FOLLOW_RETURN_in_s91); 
					}
					break;
				case 16 :
					dbg.enterAlt(16);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:14:87: T_INT
					{
					dbg.location(14,87);
					match(input,T_INT,FOLLOW_T_INT_in_s93); 
					}
					break;
				case 17 :
					dbg.enterAlt(17);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:15:3: T_FLOAT
					{
					dbg.location(15,3);
					match(input,T_FLOAT,FOLLOW_T_FLOAT_in_s98); 
					}
					break;
				case 18 :
					dbg.enterAlt(18);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:15:11: T_CHAR
					{
					dbg.location(15,11);
					match(input,T_CHAR,FOLLOW_T_CHAR_in_s100); 
					}
					break;
				case 19 :
					dbg.enterAlt(19);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:15:18: T_STRING
					{
					dbg.location(15,18);
					match(input,T_STRING,FOLLOW_T_STRING_in_s102); 
					}
					break;
				case 20 :
					dbg.enterAlt(20);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:15:27: SEMI
					{
					dbg.location(15,27);
					match(input,SEMI,FOLLOW_SEMI_in_s104); 
					}
					break;
				case 21 :
					dbg.enterAlt(21);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:15:32: POWER
					{
					dbg.location(15,32);
					match(input,POWER,FOLLOW_POWER_in_s106); 
					}
					break;
				case 22 :
					dbg.enterAlt(22);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:15:38: REM
					{
					dbg.location(15,38);
					match(input,REM,FOLLOW_REM_in_s108); 
					}
					break;
				case 23 :
					dbg.enterAlt(23);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:15:42: PLUS
					{
					dbg.location(15,42);
					match(input,PLUS,FOLLOW_PLUS_in_s110); 
					}
					break;
				case 24 :
					dbg.enterAlt(24);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:15:47: SUB
					{
					dbg.location(15,47);
					match(input,SUB,FOLLOW_SUB_in_s112); 
					}
					break;
				case 25 :
					dbg.enterAlt(25);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:15:51: MULTIPLY
					{
					dbg.location(15,51);
					match(input,MULTIPLY,FOLLOW_MULTIPLY_in_s114); 
					}
					break;
				case 26 :
					dbg.enterAlt(26);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:15:60: DIVIDE
					{
					dbg.location(15,60);
					match(input,DIVIDE,FOLLOW_DIVIDE_in_s116); 
					}
					break;
				case 27 :
					dbg.enterAlt(27);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:15:67: ASSIGN
					{
					dbg.location(15,67);
					match(input,ASSIGN,FOLLOW_ASSIGN_in_s118); 
					}
					break;
				case 28 :
					dbg.enterAlt(28);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:15:74: SLL
					{
					dbg.location(15,74);
					match(input,SLL,FOLLOW_SLL_in_s120); 
					}
					break;
				case 29 :
					dbg.enterAlt(29);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:15:78: SRL
					{
					dbg.location(15,78);
					match(input,SRL,FOLLOW_SRL_in_s122); 
					}
					break;
				case 30 :
					dbg.enterAlt(30);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:15:82: AND
					{
					dbg.location(15,82);
					match(input,AND,FOLLOW_AND_in_s124); 
					}
					break;
				case 31 :
					dbg.enterAlt(31);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:15:86: OR
					{
					dbg.location(15,86);
					match(input,OR,FOLLOW_OR_in_s126); 
					}
					break;
				case 32 :
					dbg.enterAlt(32);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:15:89: XOR
					{
					dbg.location(15,89);
					match(input,XOR,FOLLOW_XOR_in_s128); 
					}
					break;
				case 33 :
					dbg.enterAlt(33);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:16:3: B_AND
					{
					dbg.location(16,3);
					match(input,B_AND,FOLLOW_B_AND_in_s133); 
					}
					break;
				case 34 :
					dbg.enterAlt(34);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:16:9: B_OR
					{
					dbg.location(16,9);
					match(input,B_OR,FOLLOW_B_OR_in_s135); 
					}
					break;
				case 35 :
					dbg.enterAlt(35);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:16:14: LOPEN
					{
					dbg.location(16,14);
					match(input,LOPEN,FOLLOW_LOPEN_in_s137); 
					}
					break;
				case 36 :
					dbg.enterAlt(36);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:16:20: LCLOSE
					{
					dbg.location(16,20);
					match(input,LCLOSE,FOLLOW_LCLOSE_in_s139); 
					}
					break;
				case 37 :
					dbg.enterAlt(37);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:16:27: BOPEN
					{
					dbg.location(16,27);
					match(input,BOPEN,FOLLOW_BOPEN_in_s141); 
					}
					break;
				case 38 :
					dbg.enterAlt(38);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:16:33: BCLOSE
					{
					dbg.location(16,33);
					match(input,BCLOSE,FOLLOW_BCLOSE_in_s143); 
					}
					break;
				case 39 :
					dbg.enterAlt(39);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:16:40: EQ
					{
					dbg.location(16,40);
					match(input,EQ,FOLLOW_EQ_in_s145); 
					}
					break;
				case 40 :
					dbg.enterAlt(40);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:16:43: GT
					{
					dbg.location(16,43);
					match(input,GT,FOLLOW_GT_in_s147); 
					}
					break;
				case 41 :
					dbg.enterAlt(41);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:16:46: GEQ
					{
					dbg.location(16,46);
					match(input,GEQ,FOLLOW_GEQ_in_s149); 
					}
					break;
				case 42 :
					dbg.enterAlt(42);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:16:50: LT
					{
					dbg.location(16,50);
					match(input,LT,FOLLOW_LT_in_s151); 
					}
					break;
				case 43 :
					dbg.enterAlt(43);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:16:53: LEQ
					{
					dbg.location(16,53);
					match(input,LEQ,FOLLOW_LEQ_in_s153); 
					}
					break;
				case 44 :
					dbg.enterAlt(44);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:16:57: NEQ
					{
					dbg.location(16,57);
					match(input,NEQ,FOLLOW_NEQ_in_s155); 
					}
					break;
				case 45 :
					dbg.enterAlt(45);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:16:61: COPEN
					{
					dbg.location(16,61);
					match(input,COPEN,FOLLOW_COPEN_in_s157); 
					}
					break;
				case 46 :
					dbg.enterAlt(46);

					// C:\\Users\\Admin\\OneDrive\\Desktop\\Java stuff\\antlr-team-project\\grammar\\s.g:16:67: CCLOSE
					{
					dbg.location(16,67);
					match(input,CCLOSE,FOLLOW_CCLOSE_in_s159); 
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
		dbg.location(17, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "s");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "s"

	// Delegated rules



	public static final BitSet FOLLOW_s_in_start12 = new BitSet(new long[]{0x015FFFDFF7CFDFF0L});
	public static final BitSet FOLLOW_EOF_in_start15 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_st23 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_LOPEN_in_if_st25 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_condition_in_if_st27 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_LCLOSE_in_if_st29 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_condition42 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_set_in_condition44 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_condition50 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_ID_in_s63 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_s65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_s67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_s69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_s71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_in_s73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_s75 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_st_in_s77 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELIF_in_s79 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_s81 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_s83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_s85 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_s87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_in_s89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_in_s91 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_INT_in_s93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_FLOAT_in_s98 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_CHAR_in_s100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_T_STRING_in_s102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_in_s104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POWER_in_s106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REM_in_s108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_s110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUB_in_s112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MULTIPLY_in_s114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIVIDE_in_s116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_s118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SLL_in_s120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SRL_in_s122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_in_s124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_in_s126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XOR_in_s128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_B_AND_in_s133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_B_OR_in_s135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOPEN_in_s137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCLOSE_in_s139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOPEN_in_s141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BCLOSE_in_s143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_s145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_s147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GEQ_in_s149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_s151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEQ_in_s153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEQ_in_s155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COPEN_in_s157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CCLOSE_in_s159 = new BitSet(new long[]{0x0000000000000002L});
}
