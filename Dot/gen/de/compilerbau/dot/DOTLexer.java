// Generated from E:\eclipse\git_repo\Dot\Dot\src/de/compilerbau/dot/DOT.g4 by ANTLR 4.1
    
package de.compilerbau.dot;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DOTLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, INC=7, DEC=8, OR=9, AND=10, 
		EQ=11, NEQ=12, GT=13, LT=14, GTEQ=15, LTEQ=16, PLUS=17, MINUS=18, MULT=19, 
		DIV=20, MOD=21, POW=22, NOT=23, SCOL=24, ASSIGN=25, OPAR=26, CPAR=27, 
		OBRACE=28, CBRACE=29, TRUE=30, FALSE=31, IF=32, ELSE=33, WHILE=34, DO=35, 
		FOR=36, INTTYPE=37, FlOATTYPE=38, STRINGTYPE=39, STRICT=40, GRAPH=41, 
		DIGRAPH=42, NODE=43, EDGE=44, SUBGRAPH=45, UNCOVER=46, ONLY=47, IDENTIFIER=48, 
		INT=49, FLOAT=50, NUMBER=51, STRING=52, HTML_STRING=53, COMMENT=54, LINE_COMMENT=55, 
		WS=56;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'->'", "']'", "'to'", "','", "'['", "':'", "INC", "'--'", "'||'", "'&&'", 
		"'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'^'", "'!'", "';'", "'='", "'('", "')'", "'{'", "'}'", "'true'", 
		"'false'", "'if'", "'else'", "'while'", "'do'", "'for'", "'int'", "'float'", 
		"'String'", "STRICT", "GRAPH", "DIGRAPH", "NODE", "EDGE", "SUBGRAPH", 
		"UNCOVER", "ONLY", "IDENTIFIER", "INT", "FLOAT", "NUMBER", "STRING", "HTML_STRING", 
		"COMMENT", "LINE_COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "INC", "DEC", "OR", "AND", 
		"EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", 
		"MOD", "POW", "NOT", "SCOL", "ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", 
		"TRUE", "FALSE", "IF", "ELSE", "WHILE", "DO", "FOR", "INTTYPE", "FlOATTYPE", 
		"STRINGTYPE", "STRICT", "GRAPH", "DIGRAPH", "NODE", "EDGE", "SUBGRAPH", 
		"UNCOVER", "ONLY", "IDENTIFIER", "INT", "FLOAT", "NUMBER", "DIGIT", "STRING", 
		"LETTER", "HTML_STRING", "TAG", "COMMENT", "LINE_COMMENT", "WS"
	};


	public DOTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DOT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 56: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 57: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 58: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: _channel = HIDDEN;  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = HIDDEN;  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = HIDDEN;  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2:\u01ac\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3&"+
		"\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)"+
		"\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-"+
		"\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\7\61\u0126\n\61\f\61\16\61\u0129\13\61\3\62"+
		"\5\62\u012c\n\62\3\62\6\62\u012f\n\62\r\62\16\62\u0130\3\63\5\63\u0134"+
		"\n\63\3\63\6\63\u0137\n\63\r\63\16\63\u0138\3\63\3\63\7\63\u013d\n\63"+
		"\f\63\16\63\u0140\13\63\3\63\5\63\u0143\n\63\3\63\3\63\6\63\u0147\n\63"+
		"\r\63\16\63\u0148\5\63\u014b\n\63\3\64\5\64\u014e\n\64\3\64\3\64\6\64"+
		"\u0152\n\64\r\64\16\64\u0153\3\64\6\64\u0157\n\64\r\64\16\64\u0158\3\64"+
		"\3\64\7\64\u015d\n\64\f\64\16\64\u0160\13\64\5\64\u0162\n\64\5\64\u0164"+
		"\n\64\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u016c\n\66\f\66\16\66\u016f\13"+
		"\66\3\66\3\66\3\67\3\67\38\38\38\78\u0178\n8\f8\168\u017b\138\38\38\3"+
		"9\39\79\u0181\n9\f9\169\u0184\139\39\39\3:\3:\3:\3:\7:\u018c\n:\f:\16"+
		":\u018f\13:\3:\3:\3:\3:\3:\3;\3;\3;\3;\7;\u019a\n;\f;\16;\u019d\13;\3"+
		";\5;\u01a0\n;\3;\3;\3;\3;\3<\6<\u01a7\n<\r<\16<\u01a8\3<\3<\6\u016d\u0182"+
		"\u018d\u019b=\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13"+
		"\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1"+
		"= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60"+
		"\1_\61\1a\62\1c\63\1e\64\1g\65\1i\2\1k\66\1m\2\1o\67\1q\2\1s8\2u9\3w:"+
		"\4\3\2\32\4\2UUuu\4\2VVvv\4\2TTtt\4\2KKkk\4\2EEee\4\2IIii\4\2CCcc\4\2"+
		"RRrr\4\2JJjj\4\2FFff\4\2PPpp\4\2QQqq\4\2GGgg\4\2WWww\4\2DDdd\4\2XXxx\4"+
		"\2NNnn\4\2[[{{\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\6\2C\\aac|\u0082\u0101"+
		"\4\2>>@@\5\2\13\f\17\17\"\"\u01c0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2k\3\2\2\2\2o\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3y\3\2\2\2\5"+
		"|\3\2\2\2\7~\3\2\2\2\t\u0081\3\2\2\2\13\u0083\3\2\2\2\r\u0085\3\2\2\2"+
		"\17\u0087\3\2\2\2\21\u008a\3\2\2\2\23\u008d\3\2\2\2\25\u0090\3\2\2\2\27"+
		"\u0093\3\2\2\2\31\u0096\3\2\2\2\33\u0099\3\2\2\2\35\u009b\3\2\2\2\37\u009d"+
		"\3\2\2\2!\u00a0\3\2\2\2#\u00a3\3\2\2\2%\u00a5\3\2\2\2\'\u00a7\3\2\2\2"+
		")\u00a9\3\2\2\2+\u00ab\3\2\2\2-\u00ad\3\2\2\2/\u00af\3\2\2\2\61\u00b1"+
		"\3\2\2\2\63\u00b3\3\2\2\2\65\u00b5\3\2\2\2\67\u00b7\3\2\2\29\u00b9\3\2"+
		"\2\2;\u00bb\3\2\2\2=\u00bd\3\2\2\2?\u00c2\3\2\2\2A\u00c8\3\2\2\2C\u00cb"+
		"\3\2\2\2E\u00d0\3\2\2\2G\u00d6\3\2\2\2I\u00d9\3\2\2\2K\u00dd\3\2\2\2M"+
		"\u00e1\3\2\2\2O\u00e7\3\2\2\2Q\u00ee\3\2\2\2S\u00f5\3\2\2\2U\u00fb\3\2"+
		"\2\2W\u0103\3\2\2\2Y\u0108\3\2\2\2[\u010d\3\2\2\2]\u0116\3\2\2\2_\u011e"+
		"\3\2\2\2a\u0123\3\2\2\2c\u012b\3\2\2\2e\u014a\3\2\2\2g\u014d\3\2\2\2i"+
		"\u0165\3\2\2\2k\u0167\3\2\2\2m\u0172\3\2\2\2o\u0174\3\2\2\2q\u017e\3\2"+
		"\2\2s\u0187\3\2\2\2u\u0195\3\2\2\2w\u01a6\3\2\2\2yz\7/\2\2z{\7@\2\2{\4"+
		"\3\2\2\2|}\7_\2\2}\6\3\2\2\2~\177\7v\2\2\177\u0080\7q\2\2\u0080\b\3\2"+
		"\2\2\u0081\u0082\7.\2\2\u0082\n\3\2\2\2\u0083\u0084\7]\2\2\u0084\f\3\2"+
		"\2\2\u0085\u0086\7<\2\2\u0086\16\3\2\2\2\u0087\u0088\7-\2\2\u0088\u0089"+
		"\7-\2\2\u0089\20\3\2\2\2\u008a\u008b\7/\2\2\u008b\u008c\7/\2\2\u008c\22"+
		"\3\2\2\2\u008d\u008e\7~\2\2\u008e\u008f\7~\2\2\u008f\24\3\2\2\2\u0090"+
		"\u0091\7(\2\2\u0091\u0092\7(\2\2\u0092\26\3\2\2\2\u0093\u0094\7?\2\2\u0094"+
		"\u0095\7?\2\2\u0095\30\3\2\2\2\u0096\u0097\7#\2\2\u0097\u0098\7?\2\2\u0098"+
		"\32\3\2\2\2\u0099\u009a\7@\2\2\u009a\34\3\2\2\2\u009b\u009c\7>\2\2\u009c"+
		"\36\3\2\2\2\u009d\u009e\7@\2\2\u009e\u009f\7?\2\2\u009f \3\2\2\2\u00a0"+
		"\u00a1\7>\2\2\u00a1\u00a2\7?\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7-\2\2\u00a4"+
		"$\3\2\2\2\u00a5\u00a6\7/\2\2\u00a6&\3\2\2\2\u00a7\u00a8\7,\2\2\u00a8("+
		"\3\2\2\2\u00a9\u00aa\7\61\2\2\u00aa*\3\2\2\2\u00ab\u00ac\7\'\2\2\u00ac"+
		",\3\2\2\2\u00ad\u00ae\7`\2\2\u00ae.\3\2\2\2\u00af\u00b0\7#\2\2\u00b0\60"+
		"\3\2\2\2\u00b1\u00b2\7=\2\2\u00b2\62\3\2\2\2\u00b3\u00b4\7?\2\2\u00b4"+
		"\64\3\2\2\2\u00b5\u00b6\7*\2\2\u00b6\66\3\2\2\2\u00b7\u00b8\7+\2\2\u00b8"+
		"8\3\2\2\2\u00b9\u00ba\7}\2\2\u00ba:\3\2\2\2\u00bb\u00bc\7\177\2\2\u00bc"+
		"<\3\2\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7w\2\2\u00c0"+
		"\u00c1\7g\2\2\u00c1>\3\2\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7c\2\2\u00c4"+
		"\u00c5\7n\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7g\2\2\u00c7@\3\2\2\2\u00c8"+
		"\u00c9\7k\2\2\u00c9\u00ca\7h\2\2\u00caB\3\2\2\2\u00cb\u00cc\7g\2\2\u00cc"+
		"\u00cd\7n\2\2\u00cd\u00ce\7u\2\2\u00ce\u00cf\7g\2\2\u00cfD\3\2\2\2\u00d0"+
		"\u00d1\7y\2\2\u00d1\u00d2\7j\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7n\2\2"+
		"\u00d4\u00d5\7g\2\2\u00d5F\3\2\2\2\u00d6\u00d7\7f\2\2\u00d7\u00d8\7q\2"+
		"\2\u00d8H\3\2\2\2\u00d9\u00da\7h\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7"+
		"t\2\2\u00dcJ\3\2\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7p\2\2\u00df\u00e0"+
		"\7v\2\2\u00e0L\3\2\2\2\u00e1\u00e2\7h\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4"+
		"\7q\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7v\2\2\u00e6N\3\2\2\2\u00e7\u00e8"+
		"\7U\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7k\2\2\u00eb"+
		"\u00ec\7p\2\2\u00ec\u00ed\7i\2\2\u00edP\3\2\2\2\u00ee\u00ef\t\2\2\2\u00ef"+
		"\u00f0\t\3\2\2\u00f0\u00f1\t\4\2\2\u00f1\u00f2\t\5\2\2\u00f2\u00f3\t\6"+
		"\2\2\u00f3\u00f4\t\3\2\2\u00f4R\3\2\2\2\u00f5\u00f6\t\7\2\2\u00f6\u00f7"+
		"\t\4\2\2\u00f7\u00f8\t\b\2\2\u00f8\u00f9\t\t\2\2\u00f9\u00fa\t\n\2\2\u00fa"+
		"T\3\2\2\2\u00fb\u00fc\t\13\2\2\u00fc\u00fd\t\5\2\2\u00fd\u00fe\t\7\2\2"+
		"\u00fe\u00ff\t\4\2\2\u00ff\u0100\t\b\2\2\u0100\u0101\t\t\2\2\u0101\u0102"+
		"\t\n\2\2\u0102V\3\2\2\2\u0103\u0104\t\f\2\2\u0104\u0105\t\r\2\2\u0105"+
		"\u0106\t\13\2\2\u0106\u0107\t\16\2\2\u0107X\3\2\2\2\u0108\u0109\t\16\2"+
		"\2\u0109\u010a\t\13\2\2\u010a\u010b\t\7\2\2\u010b\u010c\t\16\2\2\u010c"+
		"Z\3\2\2\2\u010d\u010e\t\2\2\2\u010e\u010f\t\17\2\2\u010f\u0110\t\20\2"+
		"\2\u0110\u0111\t\7\2\2\u0111\u0112\t\4\2\2\u0112\u0113\t\b\2\2\u0113\u0114"+
		"\t\t\2\2\u0114\u0115\t\n\2\2\u0115\\\3\2\2\2\u0116\u0117\t\17\2\2\u0117"+
		"\u0118\t\f\2\2\u0118\u0119\t\6\2\2\u0119\u011a\t\r\2\2\u011a\u011b\t\21"+
		"\2\2\u011b\u011c\t\16\2\2\u011c\u011d\t\4\2\2\u011d^\3\2\2\2\u011e\u011f"+
		"\t\r\2\2\u011f\u0120\t\f\2\2\u0120\u0121\t\22\2\2\u0121\u0122\t\23\2\2"+
		"\u0122`\3\2\2\2\u0123\u0127\t\24\2\2\u0124\u0126\t\25\2\2\u0125\u0124"+
		"\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"b\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012c\5%\23\2\u012b\u012a\3\2\2\2"+
		"\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012f\5i\65\2\u012e\u012d"+
		"\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"d\3\2\2\2\u0132\u0134\5%\23\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2"+
		"\u0134\u0136\3\2\2\2\u0135\u0137\5i\65\2\u0136\u0135\3\2\2\2\u0137\u0138"+
		"\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013e\7\60\2\2\u013b\u013d\5i\65\2\u013c\u013b\3\2\2\2\u013d\u0140\3"+
		"\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u014b\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0141\u0143\5%\23\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0146\7\60\2\2\u0145\u0147\5i\65\2\u0146"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149\u014b\3\2\2\2\u014a\u0133\3\2\2\2\u014a\u0142\3\2\2\2\u014b"+
		"f\3\2\2\2\u014c\u014e\7/\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0163\3\2\2\2\u014f\u0151\7\60\2\2\u0150\u0152\5i\65\2\u0151\u0150\3"+
		"\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0164\3\2\2\2\u0155\u0157\5i\65\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0161\3\2\2\2\u015a"+
		"\u015e\7\60\2\2\u015b\u015d\5i\65\2\u015c\u015b\3\2\2\2\u015d\u0160\3"+
		"\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0162\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0161\u015a\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2"+
		"\2\2\u0163\u014f\3\2\2\2\u0163\u0156\3\2\2\2\u0164h\3\2\2\2\u0165\u0166"+
		"\t\26\2\2\u0166j\3\2\2\2\u0167\u016d\7$\2\2\u0168\u0169\7^\2\2\u0169\u016c"+
		"\7$\2\2\u016a\u016c\13\2\2\2\u016b\u0168\3\2\2\2\u016b\u016a\3\2\2\2\u016c"+
		"\u016f\3\2\2\2\u016d\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u0170\3\2"+
		"\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7$\2\2\u0171l\3\2\2\2\u0172\u0173"+
		"\t\27\2\2\u0173n\3\2\2\2\u0174\u0179\5\35\17\2\u0175\u0178\5q9\2\u0176"+
		"\u0178\n\30\2\2\u0177\u0175\3\2\2\2\u0177\u0176\3\2\2\2\u0178\u017b\3"+
		"\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017c\u017d\5\33\16\2\u017dp\3\2\2\2\u017e\u0182\5\35\17"+
		"\2\u017f\u0181\13\2\2\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2"+
		"\2\2\u0185\u0186\5\33\16\2\u0186r\3\2\2\2\u0187\u0188\7\61\2\2\u0188\u0189"+
		"\7,\2\2\u0189\u018d\3\2\2\2\u018a\u018c\13\2\2\2\u018b\u018a\3\2\2\2\u018c"+
		"\u018f\3\2\2\2\u018d\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0190\3\2"+
		"\2\2\u018f\u018d\3\2\2\2\u0190\u0191\7,\2\2\u0191\u0192\7\61\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0194\b:\2\2\u0194t\3\2\2\2\u0195\u0196\7\61\2\2"+
		"\u0196\u0197\7\61\2\2\u0197\u019b\3\2\2\2\u0198\u019a\13\2\2\2\u0199\u0198"+
		"\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c"+
		"\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a0\7\17\2\2\u019f\u019e\3"+
		"\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\7\f\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a4\b;\3\2\u01a4v\3\2\2\2\u01a5\u01a7\t\31\2\2"+
		"\u01a6\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9"+
		"\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\b<\4\2\u01abx\3\2\2\2\33\2\u0127"+
		"\u012b\u0130\u0133\u0138\u013e\u0142\u0148\u014a\u014d\u0153\u0158\u015e"+
		"\u0161\u0163\u016b\u016d\u0177\u0179\u0182\u018d\u019b\u019f\u01a8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}