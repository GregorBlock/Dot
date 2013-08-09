// Generated from DOT.g4 by ANTLR 4.1
    
package de.compilerbau.dot;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DOTParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, STRICT=14, GRAPH=15, DIGRAPH=16, NODE=17, 
		EDGE=18, SUBGRAPH=19, UNCOVER=20, ONLY=21, NUMBER=22, STRING=23, ID=24, 
		HTML_STRING=25, COMMENT=26, LINE_COMMENT=27, PREPROC=28, WS=29;
	public static final String[] tokenNames = {
		"<INVALID>", "'->'", "']'", "')'", "','", "'['", "'-'", "'('", "':'", 
		"'--'", "'='", "';'", "'{'", "'}'", "STRICT", "GRAPH", "DIGRAPH", "NODE", 
		"EDGE", "SUBGRAPH", "UNCOVER", "ONLY", "NUMBER", "STRING", "ID", "HTML_STRING", 
		"COMMENT", "LINE_COMMENT", "PREPROC", "WS"
	};
	public static final int
		RULE_s = 0, RULE_uncover = 1, RULE_only = 2, RULE_file_list = 3, RULE_file = 4, 
		RULE_graph = 5, RULE_stmt_list = 6, RULE_stmt = 7, RULE_attr_stmt = 8, 
		RULE_attr_list = 9, RULE_a_list = 10, RULE_edge_stmt = 11, RULE_edgeRHS = 12, 
		RULE_edgeop = 13, RULE_node_stmt = 14, RULE_node_id = 15, RULE_port = 16, 
		RULE_subgraph = 17, RULE_id = 18;
	public static final String[] ruleNames = {
		"s", "uncover", "only", "file_list", "file", "graph", "stmt_list", "stmt", 
		"attr_stmt", "attr_list", "a_list", "edge_stmt", "edgeRHS", "edgeop", 
		"node_stmt", "node_id", "port", "subgraph", "id"
	};

	@Override
	public String getGrammarFileName() { return "DOT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public DOTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public UncoverContext uncover() {
			return getRuleContext(UncoverContext.class,0);
		}
		public OnlyContext only() {
			return getRuleContext(OnlyContext.class,0);
		}
		public GraphContext graph() {
			return getRuleContext(GraphContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			setState(41);
			switch (_input.LA(1)) {
			case UNCOVER:
				enterOuterAlt(_localctx, 1);
				{
				setState(38); uncover();
				}
				break;
			case ONLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(39); only();
				}
				break;
			case STRICT:
			case GRAPH:
			case DIGRAPH:
				enterOuterAlt(_localctx, 3);
				{
				setState(40); graph();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UncoverContext extends ParserRuleContext {
		public GraphContext graph(int i) {
			return getRuleContext(GraphContext.class,i);
		}
		public TerminalNode UNCOVER() { return getToken(DOTParser.UNCOVER, 0); }
		public File_listContext file_list() {
			return getRuleContext(File_listContext.class,0);
		}
		public List<GraphContext> graph() {
			return getRuleContexts(GraphContext.class);
		}
		public UncoverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uncover; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterUncover(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitUncover(this);
		}
	}

	public final UncoverContext uncover() throws RecognitionException {
		UncoverContext _localctx = new UncoverContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_uncover);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(UNCOVER);
			setState(44); file_list();
			setState(45); match(12);
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46); graph();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRICT) | (1L << GRAPH) | (1L << DIGRAPH))) != 0) );
			setState(51); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnlyContext extends ParserRuleContext {
		public TerminalNode ONLY() { return getToken(DOTParser.ONLY, 0); }
		public File_listContext file_list() {
			return getRuleContext(File_listContext.class,0);
		}
		public GraphContext graph() {
			return getRuleContext(GraphContext.class,0);
		}
		public OnlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_only; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitOnly(this);
		}
	}

	public final OnlyContext only() throws RecognitionException {
		OnlyContext _localctx = new OnlyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_only);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(ONLY);
			setState(54); file_list();
			setState(55); match(12);
			setState(56); graph();
			setState(57); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_listContext extends ParserRuleContext {
		public FileContext file(int i) {
			return getRuleContext(FileContext.class,i);
		}
		public List<FileContext> file() {
			return getRuleContexts(FileContext.class);
		}
		public File_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterFile_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitFile_list(this);
		}
	}

	public final File_listContext file_list() throws RecognitionException {
		File_listContext _localctx = new File_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_file_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(7);
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60); file();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(65); match(3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileContext extends ParserRuleContext {
		public FileContext file(int i) {
			return getRuleContext(FileContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(DOTParser.NUMBER, 0); }
		public List<FileContext> file() {
			return getRuleContexts(FileContext.class);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_file);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(NUMBER);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(68); match(6);
					setState(69); file();
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GraphContext extends ParserRuleContext {
		public TerminalNode DIGRAPH() { return getToken(DOTParser.DIGRAPH, 0); }
		public TerminalNode GRAPH() { return getToken(DOTParser.GRAPH, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode STRICT() { return getToken(DOTParser.STRICT, 0); }
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterGraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitGraph(this);
		}
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_graph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(75); match(STRICT);
				}
			}

			setState(78);
			_la = _input.LA(1);
			if ( !(_la==GRAPH || _la==DIGRAPH) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(80);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << ID) | (1L << HTML_STRING))) != 0)) {
				{
				setState(79); id();
				}
			}

			setState(82); match(12);
			setState(83); stmt_list();
			setState(84); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stmt_listContext extends ParserRuleContext {
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterStmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitStmt_list(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 12) | (1L << GRAPH) | (1L << NODE) | (1L << EDGE) | (1L << SUBGRAPH) | (1L << NUMBER) | (1L << STRING) | (1L << ID) | (1L << HTML_STRING))) != 0)) {
				{
				{
				setState(86); stmt();
				setState(88);
				_la = _input.LA(1);
				if (_la==11) {
					{
					setState(87); match(11);
					}
				}

				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public SubgraphContext subgraph() {
			return getRuleContext(SubgraphContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public Attr_stmtContext attr_stmt() {
			return getRuleContext(Attr_stmtContext.class,0);
		}
		public Edge_stmtContext edge_stmt() {
			return getRuleContext(Edge_stmtContext.class,0);
		}
		public Node_stmtContext node_stmt() {
			return getRuleContext(Node_stmtContext.class,0);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); node_stmt();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96); edge_stmt();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97); attr_stmt();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98); id();
				setState(99); match(10);
				setState(100); id();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(102); subgraph();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attr_stmtContext extends ParserRuleContext {
		public TerminalNode GRAPH() { return getToken(DOTParser.GRAPH, 0); }
		public TerminalNode EDGE() { return getToken(DOTParser.EDGE, 0); }
		public TerminalNode NODE() { return getToken(DOTParser.NODE, 0); }
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public Attr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterAttr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitAttr_stmt(this);
		}
	}

	public final Attr_stmtContext attr_stmt() throws RecognitionException {
		Attr_stmtContext _localctx = new Attr_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_attr_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAPH) | (1L << NODE) | (1L << EDGE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(106); attr_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attr_listContext extends ParserRuleContext {
		public A_listContext a_list(int i) {
			return getRuleContext(A_listContext.class,i);
		}
		public List<A_listContext> a_list() {
			return getRuleContexts(A_listContext.class);
		}
		public Attr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterAttr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitAttr_list(this);
		}
	}

	public final Attr_listContext attr_list() throws RecognitionException {
		Attr_listContext _localctx = new Attr_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108); match(5);
				setState(110);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << ID) | (1L << HTML_STRING))) != 0)) {
					{
					setState(109); a_list();
					}
				}

				setState(112); match(2);
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==5 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A_listContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public A_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterA_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitA_list(this);
		}
	}

	public final A_listContext a_list() throws RecognitionException {
		A_listContext _localctx = new A_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_a_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117); id();
				setState(120);
				_la = _input.LA(1);
				if (_la==10) {
					{
					setState(118); match(10);
					setState(119); id();
					}
				}

				setState(123);
				_la = _input.LA(1);
				if (_la==4) {
					{
					setState(122); match(4);
					}
				}

				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << ID) | (1L << HTML_STRING))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Edge_stmtContext extends ParserRuleContext {
		public SubgraphContext subgraph() {
			return getRuleContext(SubgraphContext.class,0);
		}
		public Node_idContext node_id() {
			return getRuleContext(Node_idContext.class,0);
		}
		public EdgeRHSContext edgeRHS() {
			return getRuleContext(EdgeRHSContext.class,0);
		}
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public Edge_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterEdge_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitEdge_stmt(this);
		}
	}

	public final Edge_stmtContext edge_stmt() throws RecognitionException {
		Edge_stmtContext _localctx = new Edge_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_edge_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			switch (_input.LA(1)) {
			case NUMBER:
			case STRING:
			case ID:
			case HTML_STRING:
				{
				setState(129); node_id();
				}
				break;
			case 12:
			case SUBGRAPH:
				{
				setState(130); subgraph();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(133); edgeRHS();
			setState(135);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(134); attr_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EdgeRHSContext extends ParserRuleContext {
		public List<SubgraphContext> subgraph() {
			return getRuleContexts(SubgraphContext.class);
		}
		public Node_idContext node_id(int i) {
			return getRuleContext(Node_idContext.class,i);
		}
		public SubgraphContext subgraph(int i) {
			return getRuleContext(SubgraphContext.class,i);
		}
		public EdgeopContext edgeop(int i) {
			return getRuleContext(EdgeopContext.class,i);
		}
		public List<EdgeopContext> edgeop() {
			return getRuleContexts(EdgeopContext.class);
		}
		public List<Node_idContext> node_id() {
			return getRuleContexts(Node_idContext.class);
		}
		public EdgeRHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeRHS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterEdgeRHS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitEdgeRHS(this);
		}
	}

	public final EdgeRHSContext edgeRHS() throws RecognitionException {
		EdgeRHSContext _localctx = new EdgeRHSContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_edgeRHS);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137); edgeop();
				setState(140);
				switch (_input.LA(1)) {
				case NUMBER:
				case STRING:
				case ID:
				case HTML_STRING:
					{
					setState(138); node_id();
					}
					break;
				case 12:
				case SUBGRAPH:
					{
					setState(139); subgraph();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==1 || _la==9 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EdgeopContext extends ParserRuleContext {
		public EdgeopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterEdgeop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitEdgeop(this);
		}
	}

	public final EdgeopContext edgeop() throws RecognitionException {
		EdgeopContext _localctx = new EdgeopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_edgeop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !(_la==1 || _la==9) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Node_stmtContext extends ParserRuleContext {
		public Node_idContext node_id() {
			return getRuleContext(Node_idContext.class,0);
		}
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public Node_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterNode_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitNode_stmt(this);
		}
	}

	public final Node_stmtContext node_stmt() throws RecognitionException {
		Node_stmtContext _localctx = new Node_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_node_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); node_id();
			setState(150);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(149); attr_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Node_idContext extends ParserRuleContext {
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Node_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterNode_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitNode_id(this);
		}
	}

	public final Node_idContext node_id() throws RecognitionException {
		Node_idContext _localctx = new Node_idContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_node_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); id();
			setState(154);
			_la = _input.LA(1);
			if (_la==8) {
				{
				setState(153); port();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PortContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public PortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterPort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitPort(this);
		}
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_port);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(8);
			setState(157); id();
			setState(160);
			_la = _input.LA(1);
			if (_la==8) {
				{
				setState(158); match(8);
				setState(159); id();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubgraphContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode SUBGRAPH() { return getToken(DOTParser.SUBGRAPH, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public SubgraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subgraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterSubgraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitSubgraph(this);
		}
	}

	public final SubgraphContext subgraph() throws RecognitionException {
		SubgraphContext _localctx = new SubgraphContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_subgraph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if (_la==SUBGRAPH) {
				{
				setState(162); match(SUBGRAPH);
				setState(164);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << ID) | (1L << HTML_STRING))) != 0)) {
					{
					setState(163); id();
					}
				}

				}
			}

			setState(168); match(12);
			setState(169); stmt_list();
			setState(170); match(13);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DOTParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(DOTParser.NUMBER, 0); }
		public TerminalNode HTML_STRING() { return getToken(DOTParser.HTML_STRING, 0); }
		public TerminalNode STRING() { return getToken(DOTParser.STRING, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DOTListener ) ((DOTListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << ID) | (1L << HTML_STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\37\u00b1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\5\2,\n\2\3\3\3\3\3\3\3\3\6\3\62\n\3\r"+
		"\3\16\3\63\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\6\5@\n\5\r\5\16\5A"+
		"\3\5\3\5\3\6\3\6\3\6\7\6I\n\6\f\6\16\6L\13\6\3\7\5\7O\n\7\3\7\3\7\5\7"+
		"S\n\7\3\7\3\7\3\7\3\7\3\b\3\b\5\b[\n\b\7\b]\n\b\f\b\16\b`\13\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\tj\n\t\3\n\3\n\3\n\3\13\3\13\5\13q\n\13\3\13"+
		"\6\13t\n\13\r\13\16\13u\3\f\3\f\3\f\5\f{\n\f\3\f\5\f~\n\f\6\f\u0080\n"+
		"\f\r\f\16\f\u0081\3\r\3\r\5\r\u0086\n\r\3\r\3\r\5\r\u008a\n\r\3\16\3\16"+
		"\3\16\5\16\u008f\n\16\6\16\u0091\n\16\r\16\16\16\u0092\3\17\3\17\3\20"+
		"\3\20\5\20\u0099\n\20\3\21\3\21\5\21\u009d\n\21\3\22\3\22\3\22\3\22\5"+
		"\22\u00a3\n\22\3\23\3\23\5\23\u00a7\n\23\5\23\u00a9\n\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"\2\6\3\2\21\22\4\2\21\21\23\24\4\2\3\3\13\13\3\2\30\33\u00b8\2+\3\2\2"+
		"\2\4-\3\2\2\2\6\67\3\2\2\2\b=\3\2\2\2\nE\3\2\2\2\fN\3\2\2\2\16^\3\2\2"+
		"\2\20i\3\2\2\2\22k\3\2\2\2\24s\3\2\2\2\26\177\3\2\2\2\30\u0085\3\2\2\2"+
		"\32\u0090\3\2\2\2\34\u0094\3\2\2\2\36\u0096\3\2\2\2 \u009a\3\2\2\2\"\u009e"+
		"\3\2\2\2$\u00a8\3\2\2\2&\u00ae\3\2\2\2(,\5\4\3\2),\5\6\4\2*,\5\f\7\2+"+
		"(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\3\3\2\2\2-.\7\26\2\2./\5\b\5\2/\61\7\16"+
		"\2\2\60\62\5\f\7\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2"+
		"\2\2\64\65\3\2\2\2\65\66\7\17\2\2\66\5\3\2\2\2\678\7\27\2\289\5\b\5\2"+
		"9:\7\16\2\2:;\5\f\7\2;<\7\17\2\2<\7\3\2\2\2=?\7\t\2\2>@\5\n\6\2?>\3\2"+
		"\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\5\2\2D\t\3\2\2\2EJ\7"+
		"\30\2\2FG\7\b\2\2GI\5\n\6\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\13"+
		"\3\2\2\2LJ\3\2\2\2MO\7\20\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PR\t\2\2\2"+
		"QS\5&\24\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7\16\2\2UV\5\16\b\2VW\7\17"+
		"\2\2W\r\3\2\2\2XZ\5\20\t\2Y[\7\r\2\2ZY\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\X"+
		"\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\17\3\2\2\2`^\3\2\2\2aj\5\36\20"+
		"\2bj\5\30\r\2cj\5\22\n\2de\5&\24\2ef\7\f\2\2fg\5&\24\2gj\3\2\2\2hj\5$"+
		"\23\2ia\3\2\2\2ib\3\2\2\2ic\3\2\2\2id\3\2\2\2ih\3\2\2\2j\21\3\2\2\2kl"+
		"\t\3\2\2lm\5\24\13\2m\23\3\2\2\2np\7\7\2\2oq\5\26\f\2po\3\2\2\2pq\3\2"+
		"\2\2qr\3\2\2\2rt\7\4\2\2sn\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\25\3"+
		"\2\2\2wz\5&\24\2xy\7\f\2\2y{\5&\24\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|~\7"+
		"\6\2\2}|\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177w\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\27\3\2\2\2\u0083\u0086"+
		"\5 \21\2\u0084\u0086\5$\23\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\5\32\16\2\u0088\u008a\5\24\13\2\u0089\u0088"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\31\3\2\2\2\u008b\u008e\5\34\17\2\u008c"+
		"\u008f\5 \21\2\u008d\u008f\5$\23\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2"+
		"\2\2\u008f\u0091\3\2\2\2\u0090\u008b\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\33\3\2\2\2\u0094\u0095\t\4\2"+
		"\2\u0095\35\3\2\2\2\u0096\u0098\5 \21\2\u0097\u0099\5\24\13\2\u0098\u0097"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\37\3\2\2\2\u009a\u009c\5&\24\2\u009b"+
		"\u009d\5\"\22\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d!\3\2\2\2"+
		"\u009e\u009f\7\n\2\2\u009f\u00a2\5&\24\2\u00a0\u00a1\7\n\2\2\u00a1\u00a3"+
		"\5&\24\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3#\3\2\2\2\u00a4"+
		"\u00a6\7\25\2\2\u00a5\u00a7\5&\24\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3"+
		"\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00ab\7\16\2\2\u00ab\u00ac\5\16\b\2\u00ac\u00ad\7"+
		"\17\2\2\u00ad%\3\2\2\2\u00ae\u00af\t\5\2\2\u00af\'\3\2\2\2\31+\63AJNR"+
		"Z^ipuz}\u0081\u0085\u0089\u008e\u0092\u0098\u009c\u00a2\u00a6\u00a8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}