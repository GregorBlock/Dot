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
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, STRICT=14, GRAPH=15, DIGRAPH=16, NODE=17, 
		EDGE=18, SUBGRAPH=19, UNCOVER=20, ONLY=21, NUMBER=22, STRING=23, ID=24, 
		HTML_STRING=25, COMMENT=26, LINE_COMMENT=27, PREPROC=28, WS=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'->'", "']'", "')'", "','", "'['", "'-'", "'('", "':'", "'--'", "'='", 
		"';'", "'{'", "'}'", "STRICT", "GRAPH", "DIGRAPH", "NODE", "EDGE", "SUBGRAPH", 
		"UNCOVER", "ONLY", "NUMBER", "STRING", "ID", "HTML_STRING", "COMMENT", 
		"LINE_COMMENT", "PREPROC", "WS"
	};
	public static final String[] ruleNames = {
		"T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", 
		"T__3", "T__2", "T__1", "T__0", "STRICT", "GRAPH", "DIGRAPH", "NODE", 
		"EDGE", "SUBGRAPH", "UNCOVER", "ONLY", "NUMBER", "DIGIT", "STRING", "ID", 
		"LETTER", "HTML_STRING", "TAG", "COMMENT", "LINE_COMMENT", "PREPROC", 
		"WS"
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
		case 28: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 29: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 30: PREPROC_action((RuleContext)_localctx, actionIndex); break;

		case 31: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void PREPROC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\37\u0107\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\5\27\u0096\n\27\3\27\3\27"+
		"\6\27\u009a\n\27\r\27\16\27\u009b\3\27\6\27\u009f\n\27\r\27\16\27\u00a0"+
		"\3\27\3\27\7\27\u00a5\n\27\f\27\16\27\u00a8\13\27\5\27\u00aa\n\27\5\27"+
		"\u00ac\n\27\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00b4\n\31\f\31\16\31\u00b7"+
		"\13\31\3\31\3\31\3\32\3\32\3\32\7\32\u00be\n\32\f\32\16\32\u00c1\13\32"+
		"\3\33\3\33\3\34\3\34\3\34\7\34\u00c8\n\34\f\34\16\34\u00cb\13\34\3\34"+
		"\3\34\3\35\3\35\7\35\u00d1\n\35\f\35\16\35\u00d4\13\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\7\36\u00dc\n\36\f\36\16\36\u00df\13\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u00ea\n\37\f\37\16\37\u00ed\13\37"+
		"\3\37\5\37\u00f0\n\37\3\37\3\37\3\37\3\37\3 \3 \7 \u00f8\n \f \16 \u00fb"+
		"\13 \3 \3 \3 \3 \3!\6!\u0102\n!\r!\16!\u0103\3!\3!\7\u00b5\u00d2\u00dd"+
		"\u00eb\u00f9\"\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13"+
		"\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\1)\26\1+\27\1-\30\1/\2\1\61\31\1\63\32\1\65\2\1\67\33\19\2\1;\34\2=\35"+
		"\3?\36\4A\37\5\3\2\30\4\2UUuu\4\2VVvv\4\2TTtt\4\2KKkk\4\2EEee\4\2IIii"+
		"\4\2CCcc\4\2RRrr\4\2JJjj\4\2FFff\4\2PPpp\4\2QQqq\4\2GGgg\4\2WWww\4\2D"+
		"Ddd\4\2XXxx\4\2NNnn\4\2[[{{\3\2\62;\6\2C\\aac|\u0082\u0101\4\2>>@@\5\2"+
		"\13\f\17\17\"\"\u0115\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\67\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5F\3\2\2\2\7H\3\2\2\2\tJ\3\2\2\2"+
		"\13L\3\2\2\2\rN\3\2\2\2\17P\3\2\2\2\21R\3\2\2\2\23T\3\2\2\2\25W\3\2\2"+
		"\2\27Y\3\2\2\2\31[\3\2\2\2\33]\3\2\2\2\35_\3\2\2\2\37f\3\2\2\2!l\3\2\2"+
		"\2#t\3\2\2\2%y\3\2\2\2\'~\3\2\2\2)\u0087\3\2\2\2+\u008f\3\2\2\2-\u0095"+
		"\3\2\2\2/\u00ad\3\2\2\2\61\u00af\3\2\2\2\63\u00ba\3\2\2\2\65\u00c2\3\2"+
		"\2\2\67\u00c4\3\2\2\29\u00ce\3\2\2\2;\u00d7\3\2\2\2=\u00e5\3\2\2\2?\u00f5"+
		"\3\2\2\2A\u0101\3\2\2\2CD\7/\2\2DE\7@\2\2E\4\3\2\2\2FG\7_\2\2G\6\3\2\2"+
		"\2HI\7+\2\2I\b\3\2\2\2JK\7.\2\2K\n\3\2\2\2LM\7]\2\2M\f\3\2\2\2NO\7/\2"+
		"\2O\16\3\2\2\2PQ\7*\2\2Q\20\3\2\2\2RS\7<\2\2S\22\3\2\2\2TU\7/\2\2UV\7"+
		"/\2\2V\24\3\2\2\2WX\7?\2\2X\26\3\2\2\2YZ\7=\2\2Z\30\3\2\2\2[\\\7}\2\2"+
		"\\\32\3\2\2\2]^\7\177\2\2^\34\3\2\2\2_`\t\2\2\2`a\t\3\2\2ab\t\4\2\2bc"+
		"\t\5\2\2cd\t\6\2\2de\t\3\2\2e\36\3\2\2\2fg\t\7\2\2gh\t\4\2\2hi\t\b\2\2"+
		"ij\t\t\2\2jk\t\n\2\2k \3\2\2\2lm\t\13\2\2mn\t\5\2\2no\t\7\2\2op\t\4\2"+
		"\2pq\t\b\2\2qr\t\t\2\2rs\t\n\2\2s\"\3\2\2\2tu\t\f\2\2uv\t\r\2\2vw\t\13"+
		"\2\2wx\t\16\2\2x$\3\2\2\2yz\t\16\2\2z{\t\13\2\2{|\t\7\2\2|}\t\16\2\2}"+
		"&\3\2\2\2~\177\t\2\2\2\177\u0080\t\17\2\2\u0080\u0081\t\20\2\2\u0081\u0082"+
		"\t\7\2\2\u0082\u0083\t\4\2\2\u0083\u0084\t\b\2\2\u0084\u0085\t\t\2\2\u0085"+
		"\u0086\t\n\2\2\u0086(\3\2\2\2\u0087\u0088\t\17\2\2\u0088\u0089\t\f\2\2"+
		"\u0089\u008a\t\6\2\2\u008a\u008b\t\r\2\2\u008b\u008c\t\21\2\2\u008c\u008d"+
		"\t\16\2\2\u008d\u008e\t\4\2\2\u008e*\3\2\2\2\u008f\u0090\t\r\2\2\u0090"+
		"\u0091\t\f\2\2\u0091\u0092\t\22\2\2\u0092\u0093\t\23\2\2\u0093,\3\2\2"+
		"\2\u0094\u0096\7/\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u00ab"+
		"\3\2\2\2\u0097\u0099\7\60\2\2\u0098\u009a\5/\30\2\u0099\u0098\3\2\2\2"+
		"\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00ac"+
		"\3\2\2\2\u009d\u009f\5/\30\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a9\3\2\2\2\u00a2\u00a6\7\60"+
		"\2\2\u00a3\u00a5\5/\30\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a9\u00a2\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab"+
		"\u0097\3\2\2\2\u00ab\u009e\3\2\2\2\u00ac.\3\2\2\2\u00ad\u00ae\t\24\2\2"+
		"\u00ae\60\3\2\2\2\u00af\u00b5\7$\2\2\u00b0\u00b1\7^\2\2\u00b1\u00b4\7"+
		"$\2\2\u00b2\u00b4\13\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b8\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7$\2\2\u00b9\62\3\2\2\2\u00ba\u00bf"+
		"\5\65\33\2\u00bb\u00be\5\65\33\2\u00bc\u00be\5/\30\2\u00bd\u00bb\3\2\2"+
		"\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\64\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\t\25\2\2\u00c3"+
		"\66\3\2\2\2\u00c4\u00c9\7>\2\2\u00c5\u00c8\59\35\2\u00c6\u00c8\n\26\2"+
		"\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cd\7@\2\2\u00cd8\3\2\2\2\u00ce\u00d2\7>\2\2\u00cf\u00d1\13\2\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7@\2\2\u00d6"+
		":\3\2\2\2\u00d7\u00d8\7\61\2\2\u00d8\u00d9\7,\2\2\u00d9\u00dd\3\2\2\2"+
		"\u00da\u00dc\13\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e1\7,\2\2\u00e1\u00e2\7\61\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\b\36"+
		"\2\2\u00e4<\3\2\2\2\u00e5\u00e6\7\61\2\2\u00e6\u00e7\7\61\2\2\u00e7\u00eb"+
		"\3\2\2\2\u00e8\u00ea\13\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2"+
		"\u00eb\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb"+
		"\3\2\2\2\u00ee\u00f0\7\17\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2"+
		"\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7\f\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4"+
		"\b\37\3\2\u00f4>\3\2\2\2\u00f5\u00f9\7%\2\2\u00f6\u00f8\13\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00fa\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7\f\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u00ff\b \4\2\u00ff@\3\2\2\2\u0100\u0102\t\27\2\2"+
		"\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\b!\5\2\u0106B\3\2\2\2\25\2\u0095"+
		"\u009b\u00a0\u00a6\u00a9\u00ab\u00b3\u00b5\u00bd\u00bf\u00c7\u00c9\u00d2"+
		"\u00dd\u00eb\u00ef\u00f9\u0103";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}