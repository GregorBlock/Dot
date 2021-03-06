// Generated from E:\eclipse\git_repo\Dot\Dot\src/de/compilerbau/dot/grammar/DOT.g4 by ANTLR 4.1
    
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
		T__1=1, T__0=2, INC=3, DEC=4, ARROW=5, OR=6, AND=7, EQ=8, NEQ=9, GT=10, 
		LT=11, GTEQ=12, LTEQ=13, PLUS=14, MINUS=15, MULT=16, DIV=17, SCOL=18, 
		COLON=19, COMMA=20, ASSIGN=21, OPAR=22, CPAR=23, OBRACE=24, CBRACE=25, 
		OBRACKET=26, CBRACKET=27, TRUE=28, FALSE=29, IF=30, ELSE=31, WHILE=32, 
		FOR=33, INTTYPE=34, DOUBLETYPE=35, STRINGTYPE=36, STRICT=37, GRAPH=38, 
		DIGRAPH=39, NODE=40, EDGE=41, SUBGRAPH=42, UNCOVER=43, MERGE=44, PRINT=45, 
		IDENTIFIER=46, INT=47, DOUBLE=48, STRING=49, COMMENT=50, LINE_COMMENT=51, 
		WS=52;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'[]'", "'to'", "INC", "'--'", "'->'", "'||'", "'&&'", "'=='", "'!='", 
		"'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "';'", "':'", 
		"','", "'='", "'('", "')'", "'{'", "'}'", "'['", "']'", "'true'", "'false'", 
		"'if'", "'else'", "'while'", "'for'", "'int'", "'double'", "'String'", 
		"STRICT", "GRAPH", "DIGRAPH", "NODE", "EDGE", "SUBGRAPH", "UNCOVER", "MERGE", 
		"PRINT", "IDENTIFIER", "INT", "DOUBLE", "STRING", "COMMENT", "LINE_COMMENT", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "INC", "DEC", "ARROW", "OR", "AND", "EQ", "NEQ", "GT", 
		"LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", "SCOL", "COLON", 
		"COMMA", "ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", "OBRACKET", "CBRACKET", 
		"TRUE", "FALSE", "IF", "ELSE", "WHILE", "FOR", "INTTYPE", "DOUBLETYPE", 
		"STRINGTYPE", "STRICT", "GRAPH", "DIGRAPH", "NODE", "EDGE", "SUBGRAPH", 
		"UNCOVER", "MERGE", "PRINT", "IDENTIFIER", "INT", "DOUBLE", "DIGIT", "STRING", 
		"COMMENT", "LINE_COMMENT", "WS"
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
		case 50: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 51: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 52: WS_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\66\u0174\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\7/\u011c\n"+
		"/\f/\16/\u011f\13/\3\60\5\60\u0122\n\60\3\60\6\60\u0125\n\60\r\60\16\60"+
		"\u0126\3\61\5\61\u012a\n\61\3\61\6\61\u012d\n\61\r\61\16\61\u012e\3\61"+
		"\3\61\7\61\u0133\n\61\f\61\16\61\u0136\13\61\3\61\5\61\u0139\n\61\3\61"+
		"\3\61\6\61\u013d\n\61\r\61\16\61\u013e\5\61\u0141\n\61\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\7\63\u0149\n\63\f\63\16\63\u014c\13\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\7\64\u0154\n\64\f\64\16\64\u0157\13\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0162\n\65\f\65\16\65\u0165\13\65"+
		"\3\65\5\65\u0168\n\65\3\65\3\65\3\65\3\65\3\66\6\66\u016f\n\66\r\66\16"+
		"\66\u0170\3\66\3\66\5\u014a\u0155\u0163\67\3\3\1\5\4\1\7\5\1\t\6\1\13"+
		"\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1"+
		"\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33"+
		"\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O"+
		")\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\2\1e\63\1g\64\2i\65\3k"+
		"\66\4\3\2\27\4\2UUuu\4\2VVvv\4\2TTtt\4\2KKkk\4\2EEee\4\2IIii\4\2CCcc\4"+
		"\2RRrr\4\2JJjj\4\2FFff\4\2PPpp\4\2QQqq\4\2GGgg\4\2WWww\4\2DDdd\4\2XXx"+
		"x\4\2OOoo\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\u0181\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5p\3\2\2\2"+
		"\7s\3\2\2\2\tv\3\2\2\2\13y\3\2\2\2\r|\3\2\2\2\17\177\3\2\2\2\21\u0082"+
		"\3\2\2\2\23\u0085\3\2\2\2\25\u0088\3\2\2\2\27\u008a\3\2\2\2\31\u008c\3"+
		"\2\2\2\33\u008f\3\2\2\2\35\u0092\3\2\2\2\37\u0094\3\2\2\2!\u0096\3\2\2"+
		"\2#\u0098\3\2\2\2%\u009a\3\2\2\2\'\u009c\3\2\2\2)\u009e\3\2\2\2+\u00a0"+
		"\3\2\2\2-\u00a2\3\2\2\2/\u00a4\3\2\2\2\61\u00a6\3\2\2\2\63\u00a8\3\2\2"+
		"\2\65\u00aa\3\2\2\2\67\u00ac\3\2\2\29\u00ae\3\2\2\2;\u00b3\3\2\2\2=\u00b9"+
		"\3\2\2\2?\u00bc\3\2\2\2A\u00c1\3\2\2\2C\u00c7\3\2\2\2E\u00cb\3\2\2\2G"+
		"\u00cf\3\2\2\2I\u00d6\3\2\2\2K\u00dd\3\2\2\2M\u00e4\3\2\2\2O\u00ea\3\2"+
		"\2\2Q\u00f2\3\2\2\2S\u00f7\3\2\2\2U\u00fc\3\2\2\2W\u0105\3\2\2\2Y\u010d"+
		"\3\2\2\2[\u0113\3\2\2\2]\u0119\3\2\2\2_\u0121\3\2\2\2a\u0140\3\2\2\2c"+
		"\u0142\3\2\2\2e\u0144\3\2\2\2g\u014f\3\2\2\2i\u015d\3\2\2\2k\u016e\3\2"+
		"\2\2mn\7]\2\2no\7_\2\2o\4\3\2\2\2pq\7v\2\2qr\7q\2\2r\6\3\2\2\2st\7-\2"+
		"\2tu\7-\2\2u\b\3\2\2\2vw\7/\2\2wx\7/\2\2x\n\3\2\2\2yz\7/\2\2z{\7@\2\2"+
		"{\f\3\2\2\2|}\7~\2\2}~\7~\2\2~\16\3\2\2\2\177\u0080\7(\2\2\u0080\u0081"+
		"\7(\2\2\u0081\20\3\2\2\2\u0082\u0083\7?\2\2\u0083\u0084\7?\2\2\u0084\22"+
		"\3\2\2\2\u0085\u0086\7#\2\2\u0086\u0087\7?\2\2\u0087\24\3\2\2\2\u0088"+
		"\u0089\7@\2\2\u0089\26\3\2\2\2\u008a\u008b\7>\2\2\u008b\30\3\2\2\2\u008c"+
		"\u008d\7@\2\2\u008d\u008e\7?\2\2\u008e\32\3\2\2\2\u008f\u0090\7>\2\2\u0090"+
		"\u0091\7?\2\2\u0091\34\3\2\2\2\u0092\u0093\7-\2\2\u0093\36\3\2\2\2\u0094"+
		"\u0095\7/\2\2\u0095 \3\2\2\2\u0096\u0097\7,\2\2\u0097\"\3\2\2\2\u0098"+
		"\u0099\7\61\2\2\u0099$\3\2\2\2\u009a\u009b\7=\2\2\u009b&\3\2\2\2\u009c"+
		"\u009d\7<\2\2\u009d(\3\2\2\2\u009e\u009f\7.\2\2\u009f*\3\2\2\2\u00a0\u00a1"+
		"\7?\2\2\u00a1,\3\2\2\2\u00a2\u00a3\7*\2\2\u00a3.\3\2\2\2\u00a4\u00a5\7"+
		"+\2\2\u00a5\60\3\2\2\2\u00a6\u00a7\7}\2\2\u00a7\62\3\2\2\2\u00a8\u00a9"+
		"\7\177\2\2\u00a9\64\3\2\2\2\u00aa\u00ab\7]\2\2\u00ab\66\3\2\2\2\u00ac"+
		"\u00ad\7_\2\2\u00ad8\3\2\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7t\2\2\u00b0"+
		"\u00b1\7w\2\2\u00b1\u00b2\7g\2\2\u00b2:\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4"+
		"\u00b5\7c\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7g\2\2"+
		"\u00b8<\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7h\2\2\u00bb>\3\2\2\2\u00bc"+
		"\u00bd\7g\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7g\2\2"+
		"\u00c0@\3\2\2\2\u00c1\u00c2\7y\2\2\u00c2\u00c3\7j\2\2\u00c3\u00c4\7k\2"+
		"\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7g\2\2\u00c6B\3\2\2\2\u00c7\u00c8\7"+
		"h\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7t\2\2\u00caD\3\2\2\2\u00cb\u00cc"+
		"\7k\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7v\2\2\u00ceF\3\2\2\2\u00cf\u00d0"+
		"\7f\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7w\2\2\u00d2\u00d3\7d\2\2\u00d3"+
		"\u00d4\7n\2\2\u00d4\u00d5\7g\2\2\u00d5H\3\2\2\2\u00d6\u00d7\7U\2\2\u00d7"+
		"\u00d8\7v\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7p\2\2"+
		"\u00db\u00dc\7i\2\2\u00dcJ\3\2\2\2\u00dd\u00de\t\2\2\2\u00de\u00df\t\3"+
		"\2\2\u00df\u00e0\t\4\2\2\u00e0\u00e1\t\5\2\2\u00e1\u00e2\t\6\2\2\u00e2"+
		"\u00e3\t\3\2\2\u00e3L\3\2\2\2\u00e4\u00e5\t\7\2\2\u00e5\u00e6\t\4\2\2"+
		"\u00e6\u00e7\t\b\2\2\u00e7\u00e8\t\t\2\2\u00e8\u00e9\t\n\2\2\u00e9N\3"+
		"\2\2\2\u00ea\u00eb\t\13\2\2\u00eb\u00ec\t\5\2\2\u00ec\u00ed\t\7\2\2\u00ed"+
		"\u00ee\t\4\2\2\u00ee\u00ef\t\b\2\2\u00ef\u00f0\t\t\2\2\u00f0\u00f1\t\n"+
		"\2\2\u00f1P\3\2\2\2\u00f2\u00f3\t\f\2\2\u00f3\u00f4\t\r\2\2\u00f4\u00f5"+
		"\t\13\2\2\u00f5\u00f6\t\16\2\2\u00f6R\3\2\2\2\u00f7\u00f8\t\16\2\2\u00f8"+
		"\u00f9\t\13\2\2\u00f9\u00fa\t\7\2\2\u00fa\u00fb\t\16\2\2\u00fbT\3\2\2"+
		"\2\u00fc\u00fd\t\2\2\2\u00fd\u00fe\t\17\2\2\u00fe\u00ff\t\20\2\2\u00ff"+
		"\u0100\t\7\2\2\u0100\u0101\t\4\2\2\u0101\u0102\t\b\2\2\u0102\u0103\t\t"+
		"\2\2\u0103\u0104\t\n\2\2\u0104V\3\2\2\2\u0105\u0106\t\17\2\2\u0106\u0107"+
		"\t\f\2\2\u0107\u0108\t\6\2\2\u0108\u0109\t\r\2\2\u0109\u010a\t\21\2\2"+
		"\u010a\u010b\t\16\2\2\u010b\u010c\t\4\2\2\u010cX\3\2\2\2\u010d\u010e\t"+
		"\22\2\2\u010e\u010f\t\16\2\2\u010f\u0110\t\4\2\2\u0110\u0111\t\7\2\2\u0111"+
		"\u0112\t\16\2\2\u0112Z\3\2\2\2\u0113\u0114\t\t\2\2\u0114\u0115\t\4\2\2"+
		"\u0115\u0116\t\5\2\2\u0116\u0117\t\f\2\2\u0117\u0118\t\3\2\2\u0118\\\3"+
		"\2\2\2\u0119\u011d\t\23\2\2\u011a\u011c\t\24\2\2\u011b\u011a\3\2\2\2\u011c"+
		"\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e^\3\2\2\2"+
		"\u011f\u011d\3\2\2\2\u0120\u0122\5\37\20\2\u0121\u0120\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0125\5c\62\2\u0124\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127`\3\2\2\2"+
		"\u0128\u012a\5\37\20\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c"+
		"\3\2\2\2\u012b\u012d\5c\62\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0134\7\60"+
		"\2\2\u0131\u0133\5c\62\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0141\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137\u0139\5\37\20\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013c\7\60\2\2\u013b\u013d\5c\62\2\u013c\u013b\3"+
		"\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0141\3\2\2\2\u0140\u0129\3\2\2\2\u0140\u0138\3\2\2\2\u0141b\3\2\2\2"+
		"\u0142\u0143\t\25\2\2\u0143d\3\2\2\2\u0144\u014a\7$\2\2\u0145\u0146\7"+
		"^\2\2\u0146\u0149\7$\2\2\u0147\u0149\13\2\2\2\u0148\u0145\3\2\2\2\u0148"+
		"\u0147\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u014b\3\2\2\2\u014a\u0148\3\2"+
		"\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7$\2\2\u014e"+
		"f\3\2\2\2\u014f\u0150\7\61\2\2\u0150\u0151\7,\2\2\u0151\u0155\3\2\2\2"+
		"\u0152\u0154\13\2\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0156"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158"+
		"\u0159\7,\2\2\u0159\u015a\7\61\2\2\u015a\u015b\3\2\2\2\u015b\u015c\b\64"+
		"\2\2\u015ch\3\2\2\2\u015d\u015e\7\61\2\2\u015e\u015f\7\61\2\2\u015f\u0163"+
		"\3\2\2\2\u0160\u0162\13\2\2\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2"+
		"\u0163\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163"+
		"\3\2\2\2\u0166\u0168\7\17\2\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2"+
		"\u0168\u0169\3\2\2\2\u0169\u016a\7\f\2\2\u016a\u016b\3\2\2\2\u016b\u016c"+
		"\b\65\3\2\u016cj\3\2\2\2\u016d\u016f\t\26\2\2\u016e\u016d\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2"+
		"\2\2\u0172\u0173\b\66\4\2\u0173l\3\2\2\2\22\2\u011d\u0121\u0126\u0129"+
		"\u012e\u0134\u0138\u013e\u0140\u0148\u014a\u0155\u0163\u0167\u0170";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}