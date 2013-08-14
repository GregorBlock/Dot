// Generated from C:\Users\Gregor Block\Studium\git\Dot\Dot\src/de/compilerbau/dot/DOT.g4 by ANTLR 4.1
    
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
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, INC=7, DEC=8, OR=9, AND=10, 
		EQ=11, NEQ=12, GT=13, LT=14, GTEQ=15, LTEQ=16, PLUS=17, MINUS=18, MULT=19, 
		DIV=20, MOD=21, POW=22, NOT=23, SCOL=24, ASSIGN=25, OPAR=26, CPAR=27, 
		OBRACE=28, CBRACE=29, TRUE=30, FALSE=31, IF=32, ELSE=33, WHILE=34, DO=35, 
		FOR=36, INTTYPE=37, FlOATTYPE=38, STRINGTYPE=39, STRICT=40, GRAPH=41, 
		DIGRAPH=42, NODE=43, EDGE=44, SUBGRAPH=45, UNCOVER=46, ONLY=47, IDENTIFIER=48, 
		INT=49, FLOAT=50, NUMBER=51, STRING=52, HTML_STRING=53, COMMENT=54, LINE_COMMENT=55, 
		WS=56, FLOATTYPE=57;
	public static final String[] tokenNames = {
		"<INVALID>", "'->'", "']'", "'to'", "','", "'['", "':'", "INC", "'--'", 
		"'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'^'", "'!'", "';'", "'='", "'('", "')'", "'{'", 
		"'}'", "'true'", "'false'", "'if'", "'else'", "'while'", "'do'", "'for'", 
		"'int'", "'float'", "'String'", "STRICT", "GRAPH", "DIGRAPH", "NODE", 
		"EDGE", "SUBGRAPH", "UNCOVER", "ONLY", "IDENTIFIER", "INT", "FLOAT", "NUMBER", 
		"STRING", "HTML_STRING", "COMMENT", "LINE_COMMENT", "WS", "FLOATTYPE"
	};
	public static final int
		RULE_s = 0, RULE_statement = 1, RULE_block = 2, RULE_declaration = 3, 
		RULE_assignment = 4, RULE_whileStat = 5, RULE_doStat = 6, RULE_forStat = 7, 
		RULE_forControl = 8, RULE_ifElseStat = 9, RULE_parStat = 10, RULE_expression = 11, 
		RULE_primary = 12, RULE_type = 13, RULE_uncover = 14, RULE_only = 15, 
		RULE_file_list = 16, RULE_file = 17, RULE_graph = 18, RULE_stmt_list = 19, 
		RULE_stmt = 20, RULE_attr_stmt = 21, RULE_attr_list = 22, RULE_a_list = 23, 
		RULE_edge_stmt = 24, RULE_edgeRHS = 25, RULE_edgeop = 26, RULE_node_stmt = 27, 
		RULE_node_id = 28, RULE_port = 29, RULE_subgraph = 30, RULE_id = 31;
	public static final String[] ruleNames = {
		"s", "statement", "block", "declaration", "assignment", "whileStat", "doStat", 
		"forStat", "forControl", "ifElseStat", "parStat", "expression", "primary", 
		"type", "uncover", "only", "file_list", "file", "graph", "stmt_list", 
		"stmt", "attr_stmt", "attr_list", "a_list", "edge_stmt", "edgeRHS", "edgeop", 
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBRACE) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << INTTYPE) | (1L << STRINGTYPE) | (1L << STRICT) | (1L << GRAPH) | (1L << DIGRAPH) | (1L << UNCOVER) | (1L << ONLY) | (1L << IDENTIFIER) | (1L << FLOATTYPE))) != 0)) {
				{
				{
				setState(64); statement();
				}
				}
				setState(69);
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

	public static class StatementContext extends ParserRuleContext {
		public UncoverContext uncover() {
			return getRuleContext(UncoverContext.class,0);
		}
		public WhileStatContext whileStat() {
			return getRuleContext(WhileStatContext.class,0);
		}
		public DoStatContext doStat() {
			return getRuleContext(DoStatContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public OnlyContext only() {
			return getRuleContext(OnlyContext.class,0);
		}
		public ForStatContext forStat() {
			return getRuleContext(ForStatContext.class,0);
		}
		public GraphContext graph() {
			return getRuleContext(GraphContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfElseStatContext ifElseStat() {
			return getRuleContext(IfElseStatContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(80);
			switch (_input.LA(1)) {
			case OBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); block();
				}
				break;
			case STRICT:
			case GRAPH:
			case DIGRAPH:
				enterOuterAlt(_localctx, 2);
				{
				setState(71); graph();
				}
				break;
			case UNCOVER:
				enterOuterAlt(_localctx, 3);
				{
				setState(72); uncover();
				}
				break;
			case ONLY:
				enterOuterAlt(_localctx, 4);
				{
				setState(73); only();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(74); assignment();
				}
				break;
			case INTTYPE:
			case STRINGTYPE:
			case FLOATTYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(75); declaration();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 7);
				{
				setState(76); whileStat();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 8);
				{
				setState(77); doStat();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 9);
				{
				setState(78); forStat();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 10);
				{
				setState(79); ifElseStat();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode CBRACE() { return getToken(DOTParser.CBRACE, 0); }
		public TerminalNode OBRACE() { return getToken(DOTParser.OBRACE, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(OBRACE);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBRACE) | (1L << IF) | (1L << WHILE) | (1L << DO) | (1L << FOR) | (1L << INTTYPE) | (1L << STRINGTYPE) | (1L << STRICT) | (1L << GRAPH) | (1L << DIGRAPH) | (1L << UNCOVER) | (1L << ONLY) | (1L << IDENTIFIER) | (1L << FLOATTYPE))) != 0)) {
				{
				{
				setState(83); statement();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89); match(CBRACE);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(DOTParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DOTParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(DOTParser.SCOL, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); type();
			setState(92); match(IDENTIFIER);
			setState(95);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(93); match(ASSIGN);
				setState(94); expression(0);
				}
			}

			setState(97); match(SCOL);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(DOTParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DOTParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(DOTParser.SCOL, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(IDENTIFIER);
			setState(100); match(ASSIGN);
			setState(101); expression(0);
			setState(102); match(SCOL);
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

	public static class WhileStatContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(DOTParser.WHILE, 0); }
		public ParStatContext parStat() {
			return getRuleContext(ParStatContext.class,0);
		}
		public WhileStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatContext whileStat() throws RecognitionException {
		WhileStatContext _localctx = new WhileStatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(WHILE);
			setState(105); parStat();
			setState(106); statement();
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

	public static class DoStatContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(DOTParser.WHILE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode CBRACE() { return getToken(DOTParser.CBRACE, 0); }
		public TerminalNode DO() { return getToken(DOTParser.DO, 0); }
		public ParStatContext parStat() {
			return getRuleContext(ParStatContext.class,0);
		}
		public TerminalNode OBRACE() { return getToken(DOTParser.OBRACE, 0); }
		public TerminalNode SCOL() { return getToken(DOTParser.SCOL, 0); }
		public DoStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitDoStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatContext doStat() throws RecognitionException {
		DoStatContext _localctx = new DoStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_doStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(DO);
			setState(109); match(OBRACE);
			setState(110); statement();
			setState(111); match(CBRACE);
			setState(112); match(WHILE);
			setState(113); parStat();
			setState(114); match(SCOL);
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

	public static class ForStatContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(DOTParser.CPAR, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode FOR() { return getToken(DOTParser.FOR, 0); }
		public TerminalNode OPAR() { return getToken(DOTParser.OPAR, 0); }
		public ForStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitForStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatContext forStat() throws RecognitionException {
		ForStatContext _localctx = new ForStatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(FOR);
			setState(117); match(OPAR);
			setState(118); forControl();
			setState(119); match(CPAR);
			setState(120); statement();
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

	public static class ForControlContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(DOTParser.INT); }
		public TerminalNode IDENTIFIER() { return getToken(DOTParser.IDENTIFIER, 0); }
		public TerminalNode INT(int i) {
			return getToken(DOTParser.INT, i);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(IDENTIFIER);
			setState(123); match(1);
			setState(124); match(INT);
			setState(125); match(3);
			setState(126); match(INT);
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

	public static class IfElseStatContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode IF() { return getToken(DOTParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(DOTParser.ELSE, 0); }
		public ParStatContext parStat() {
			return getRuleContext(ParStatContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitIfElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseStatContext ifElseStat() throws RecognitionException {
		IfElseStatContext _localctx = new IfElseStatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifElseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(IF);
			setState(129); parStat();
			setState(130); statement();
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(131); match(ELSE);
				setState(132); statement();
				}
				break;
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

	public static class ParStatContext extends ParserRuleContext {
		public TerminalNode CPAR() { return getToken(DOTParser.CPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(DOTParser.OPAR, 0); }
		public ParStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitParStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParStatContext parStat() throws RecognitionException {
		ParStatContext _localctx = new ParStatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(OPAR);
			setState(136); expression(0);
			setState(137); match(CPAR);
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

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class AndExprContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(DOTParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(DOTParser.DIV, 0); }
		public TerminalNode MULT() { return getToken(DOTParser.MULT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MulDivExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitMulDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtEqExprContext extends ExpressionContext {
		public TerminalNode GTEQ() { return getToken(DOTParser.GTEQ, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public GtEqExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitGtEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtExprContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(DOTParser.LT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public LtExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitLtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(DOTParser.ASSIGN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AssignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExprContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExprContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(DOTParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncDecExprContext extends ExpressionContext {
		public Token op;
		public TerminalNode INC() { return getToken(DOTParser.INC, 0); }
		public TerminalNode DEC() { return getToken(DOTParser.DEC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IncDecExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitIncDecExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubExprContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(DOTParser.MINUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode PLUS() { return getToken(DOTParser.PLUS, 0); }
		public AddSubExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtExprContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode GT() { return getToken(DOTParser.GT, 0); }
		public GtExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitGtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtEqExprContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LTEQ() { return getToken(DOTParser.LTEQ, 0); }
		public LtEqExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitLtEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NeqExprContext extends ExpressionContext {
		public TerminalNode NEQ() { return getToken(DOTParser.NEQ, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public NeqExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitNeqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExprContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExprContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode EQ() { return getToken(DOTParser.EQ, 0); }
		public EqExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(140); primary();
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new LtEqExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(142);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(143); match(LTEQ);
						setState(144); expression(13);
						}
						break;

					case 2:
						{
						_localctx = new MulDivExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(145);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(146);
						((MulDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((MulDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(147); expression(12);
						}
						break;

					case 3:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(148);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(149);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(150); expression(11);
						}
						break;

					case 4:
						{
						_localctx = new GtEqExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(151);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(152); match(GTEQ);
						setState(153); expression(9);
						}
						break;

					case 5:
						{
						_localctx = new GtExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(154);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(155); match(GT);
						setState(156); expression(8);
						}
						break;

					case 6:
						{
						_localctx = new LtExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(157);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(158); match(LT);
						setState(159); expression(7);
						}
						break;

					case 7:
						{
						_localctx = new EqExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(160);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(161); match(EQ);
						setState(162); expression(6);
						}
						break;

					case 8:
						{
						_localctx = new NeqExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(163);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(164); match(NEQ);
						setState(165); expression(5);
						}
						break;

					case 9:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(166);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(167); match(AND);
						setState(168); expression(4);
						}
						break;

					case 10:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(169);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(170); match(OR);
						setState(171); expression(3);
						}
						break;

					case 11:
						{
						_localctx = new AssignExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(172);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(173); match(ASSIGN);
						setState(174); expression(1);
						}
						break;

					case 12:
						{
						_localctx = new ArrayExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(175);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(176); match(5);
						setState(177); expression(0);
						setState(178); match(2);
						}
						break;

					case 13:
						{
						_localctx = new IncDecExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(181);
						((IncDecExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((IncDecExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExprContext extends PrimaryContext {
		public ParStatContext parStat() {
			return getRuleContext(ParStatContext.class,0);
		}
		public ParExprContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdAtomContext extends PrimaryContext {
		public TerminalNode IDENTIFIER() { return getToken(DOTParser.IDENTIFIER, 0); }
		public IdAtomContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends PrimaryContext {
		public TerminalNode STRING() { return getToken(DOTParser.STRING, 0); }
		public StringAtomContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberAtomContext extends PrimaryContext {
		public TerminalNode FLOAT() { return getToken(DOTParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(DOTParser.INT, 0); }
		public NumberAtomContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_primary);
		int _la;
		try {
			setState(191);
			switch (_input.LA(1)) {
			case OPAR:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187); parStat();
				}
				break;
			case IDENTIFIER:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(188); match(IDENTIFIER);
				}
				break;
			case INT:
			case FLOAT:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(190); match(STRING);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode FLOATTYPE() { return getToken(DOTParser.FLOATTYPE, 0); }
		public TerminalNode STRINGTYPE() { return getToken(DOTParser.STRINGTYPE, 0); }
		public TerminalNode INTTYPE() { return getToken(DOTParser.INTTYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTTYPE) | (1L << STRINGTYPE) | (1L << FLOATTYPE))) != 0)) ) {
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

	public static class UncoverContext extends ParserRuleContext {
		public TerminalNode CBRACE() { return getToken(DOTParser.CBRACE, 0); }
		public GraphContext graph(int i) {
			return getRuleContext(GraphContext.class,i);
		}
		public TerminalNode UNCOVER() { return getToken(DOTParser.UNCOVER, 0); }
		public TerminalNode OBRACE() { return getToken(DOTParser.OBRACE, 0); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitUncover(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UncoverContext uncover() throws RecognitionException {
		UncoverContext _localctx = new UncoverContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_uncover);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(UNCOVER);
			setState(196); file_list();
			setState(197); match(OBRACE);
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198); graph();
				}
				}
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRICT) | (1L << GRAPH) | (1L << DIGRAPH))) != 0) );
			setState(203); match(CBRACE);
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
		public TerminalNode CBRACE() { return getToken(DOTParser.CBRACE, 0); }
		public TerminalNode ONLY() { return getToken(DOTParser.ONLY, 0); }
		public TerminalNode OBRACE() { return getToken(DOTParser.OBRACE, 0); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitOnly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnlyContext only() throws RecognitionException {
		OnlyContext _localctx = new OnlyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_only);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(ONLY);
			setState(206); file_list();
			setState(207); match(OBRACE);
			setState(208); graph();
			setState(209); match(CBRACE);
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
		public TerminalNode CPAR() { return getToken(DOTParser.CPAR, 0); }
		public FileContext file(int i) {
			return getRuleContext(FileContext.class,i);
		}
		public List<FileContext> file() {
			return getRuleContexts(FileContext.class);
		}
		public TerminalNode OPAR() { return getToken(DOTParser.OPAR, 0); }
		public File_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitFile_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_listContext file_list() throws RecognitionException {
		File_listContext _localctx = new File_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_file_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); match(OPAR);
			setState(213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(212); file();
				}
				}
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(217); match(CPAR);
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
		public TerminalNode MINUS(int i) {
			return getToken(DOTParser.MINUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(DOTParser.MINUS); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_file);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219); match(NUMBER);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(220); match(MINUS);
					setState(221); file();
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public TerminalNode CBRACE() { return getToken(DOTParser.CBRACE, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode STRICT() { return getToken(DOTParser.STRICT, 0); }
		public TerminalNode OBRACE() { return getToken(DOTParser.OBRACE, 0); }
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitGraph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_graph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(227); match(STRICT);
				}
			}

			setState(230);
			_la = _input.LA(1);
			if ( !(_la==GRAPH || _la==DIGRAPH) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(232);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(231); id();
				}
			}

			setState(234); match(OBRACE);
			setState(235); stmt_list();
			setState(236); match(CBRACE);
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
		public List<TerminalNode> SCOL() { return getTokens(DOTParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(DOTParser.SCOL, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitStmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBRACE) | (1L << GRAPH) | (1L << NODE) | (1L << EDGE) | (1L << SUBGRAPH) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				{
				setState(238); stmt();
				setState(240);
				_la = _input.LA(1);
				if (_la==SCOL) {
					{
					setState(239); match(SCOL);
					}
				}

				}
				}
				setState(246);
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
		public TerminalNode ASSIGN() { return getToken(DOTParser.ASSIGN, 0); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stmt);
		try {
			setState(255);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247); node_stmt();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248); edge_stmt();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249); attr_stmt();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(250); id();
				setState(251); match(ASSIGN);
				setState(252); id();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(254); subgraph();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitAttr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attr_stmtContext attr_stmt() throws RecognitionException {
		Attr_stmtContext _localctx = new Attr_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_attr_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAPH) | (1L << NODE) | (1L << EDGE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(258); attr_list();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitAttr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attr_listContext attr_list() throws RecognitionException {
		Attr_listContext _localctx = new Attr_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_attr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(260); match(5);
				setState(262);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(261); a_list();
					}
				}

				setState(264); match(2);
				}
				}
				setState(267); 
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitA_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A_listContext a_list() throws RecognitionException {
		A_listContext _localctx = new A_listContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_a_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(269); id();
				setState(272);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(270); match(ASSIGN);
					setState(271); id();
					}
				}

				setState(275);
				_la = _input.LA(1);
				if (_la==4) {
					{
					setState(274); match(4);
					}
				}

				}
				}
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRING))) != 0) );
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitEdge_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edge_stmtContext edge_stmt() throws RecognitionException {
		Edge_stmtContext _localctx = new Edge_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_edge_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case NUMBER:
			case STRING:
				{
				setState(281); node_id();
				}
				break;
			case OBRACE:
			case SUBGRAPH:
				{
				setState(282); subgraph();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(285); edgeRHS();
			setState(287);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(286); attr_list();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitEdgeRHS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeRHSContext edgeRHS() throws RecognitionException {
		EdgeRHSContext _localctx = new EdgeRHSContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_edgeRHS);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(289); edgeop();
				setState(292);
				switch (_input.LA(1)) {
				case IDENTIFIER:
				case NUMBER:
				case STRING:
					{
					setState(290); node_id();
					}
					break;
				case OBRACE:
				case SUBGRAPH:
					{
					setState(291); subgraph();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(296); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==1 || _la==DEC );
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
		public TerminalNode DEC() { return getToken(DOTParser.DEC, 0); }
		public EdgeopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitEdgeop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeopContext edgeop() throws RecognitionException {
		EdgeopContext _localctx = new EdgeopContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_edgeop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if ( !(_la==1 || _la==DEC) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitNode_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_stmtContext node_stmt() throws RecognitionException {
		Node_stmtContext _localctx = new Node_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_node_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300); node_id();
			setState(302);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(301); attr_list();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitNode_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_idContext node_id() throws RecognitionException {
		Node_idContext _localctx = new Node_idContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_node_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); id();
			setState(306);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(305); port();
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitPort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_port);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308); match(6);
			setState(309); id();
			setState(312);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(310); match(6);
				setState(311); id();
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
		public TerminalNode CBRACE() { return getToken(DOTParser.CBRACE, 0); }
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode OBRACE() { return getToken(DOTParser.OBRACE, 0); }
		public SubgraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subgraph; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitSubgraph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubgraphContext subgraph() throws RecognitionException {
		SubgraphContext _localctx = new SubgraphContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_subgraph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if (_la==SUBGRAPH) {
				{
				setState(314); match(SUBGRAPH);
				setState(316);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(315); id();
					}
				}

				}
			}

			setState(320); match(OBRACE);
			setState(321); stmt_list();
			setState(322); match(CBRACE);
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
		public TerminalNode IDENTIFIER() { return getToken(DOTParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(DOTParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(DOTParser.STRING, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRING))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 12 >= _localctx._p;

		case 1: return 11 >= _localctx._p;

		case 2: return 10 >= _localctx._p;

		case 3: return 8 >= _localctx._p;

		case 4: return 7 >= _localctx._p;

		case 5: return 6 >= _localctx._p;

		case 6: return 5 >= _localctx._p;

		case 7: return 4 >= _localctx._p;

		case 8: return 3 >= _localctx._p;

		case 9: return 2 >= _localctx._p;

		case 10: return 1 >= _localctx._p;

		case 11: return 13 >= _localctx._p;

		case 12: return 9 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3;\u0149\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3S\n\3\3\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5"+
		"\5b\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u0088\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\7\r\u00b9\n\r\f\r\16\r\u00bc\13\r\3\16\3\16\3\16\3\16\5\16"+
		"\u00c2\n\16\3\17\3\17\3\20\3\20\3\20\3\20\6\20\u00ca\n\20\r\20\16\20\u00cb"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\6\22\u00d8\n\22\r\22"+
		"\16\22\u00d9\3\22\3\22\3\23\3\23\3\23\7\23\u00e1\n\23\f\23\16\23\u00e4"+
		"\13\23\3\24\5\24\u00e7\n\24\3\24\3\24\5\24\u00eb\n\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\5\25\u00f3\n\25\7\25\u00f5\n\25\f\25\16\25\u00f8\13\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0102\n\26\3\27\3\27\3\27"+
		"\3\30\3\30\5\30\u0109\n\30\3\30\6\30\u010c\n\30\r\30\16\30\u010d\3\31"+
		"\3\31\3\31\5\31\u0113\n\31\3\31\5\31\u0116\n\31\6\31\u0118\n\31\r\31\16"+
		"\31\u0119\3\32\3\32\5\32\u011e\n\32\3\32\3\32\5\32\u0122\n\32\3\33\3\33"+
		"\3\33\5\33\u0127\n\33\6\33\u0129\n\33\r\33\16\33\u012a\3\34\3\34\3\35"+
		"\3\35\5\35\u0131\n\35\3\36\3\36\5\36\u0135\n\36\3\37\3\37\3\37\3\37\5"+
		"\37\u013b\n\37\3 \3 \5 \u013f\n \5 \u0141\n \3 \3 \3 \3 \3!\3!\3!\2\""+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\13"+
		"\3\2\25\26\3\2\23\24\3\2\t\n\3\2\63\64\5\2\'\'));;\3\2+,\4\2++-.\4\2\3"+
		"\3\n\n\4\2\62\62\65\66\u015e\2E\3\2\2\2\4R\3\2\2\2\6T\3\2\2\2\b]\3\2\2"+
		"\2\ne\3\2\2\2\fj\3\2\2\2\16n\3\2\2\2\20v\3\2\2\2\22|\3\2\2\2\24\u0082"+
		"\3\2\2\2\26\u0089\3\2\2\2\30\u008d\3\2\2\2\32\u00c1\3\2\2\2\34\u00c3\3"+
		"\2\2\2\36\u00c5\3\2\2\2 \u00cf\3\2\2\2\"\u00d5\3\2\2\2$\u00dd\3\2\2\2"+
		"&\u00e6\3\2\2\2(\u00f6\3\2\2\2*\u0101\3\2\2\2,\u0103\3\2\2\2.\u010b\3"+
		"\2\2\2\60\u0117\3\2\2\2\62\u011d\3\2\2\2\64\u0128\3\2\2\2\66\u012c\3\2"+
		"\2\28\u012e\3\2\2\2:\u0132\3\2\2\2<\u0136\3\2\2\2>\u0140\3\2\2\2@\u0146"+
		"\3\2\2\2BD\5\4\3\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\3\3\2\2\2"+
		"GE\3\2\2\2HS\5\6\4\2IS\5&\24\2JS\5\36\20\2KS\5 \21\2LS\5\n\6\2MS\5\b\5"+
		"\2NS\5\f\7\2OS\5\16\b\2PS\5\20\t\2QS\5\24\13\2RH\3\2\2\2RI\3\2\2\2RJ\3"+
		"\2\2\2RK\3\2\2\2RL\3\2\2\2RM\3\2\2\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3"+
		"\2\2\2S\5\3\2\2\2TX\7\36\2\2UW\5\4\3\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2X"+
		"Y\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\37\2\2\\\7\3\2\2\2]^\5\34\17\2^a\7"+
		"\62\2\2_`\7\33\2\2`b\5\30\r\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\32\2\2"+
		"d\t\3\2\2\2ef\7\62\2\2fg\7\33\2\2gh\5\30\r\2hi\7\32\2\2i\13\3\2\2\2jk"+
		"\7$\2\2kl\5\26\f\2lm\5\4\3\2m\r\3\2\2\2no\7%\2\2op\7\36\2\2pq\5\4\3\2"+
		"qr\7\37\2\2rs\7$\2\2st\5\26\f\2tu\7\32\2\2u\17\3\2\2\2vw\7&\2\2wx\7\34"+
		"\2\2xy\5\22\n\2yz\7\35\2\2z{\5\4\3\2{\21\3\2\2\2|}\7\62\2\2}~\7\3\2\2"+
		"~\177\7\63\2\2\177\u0080\7\5\2\2\u0080\u0081\7\63\2\2\u0081\23\3\2\2\2"+
		"\u0082\u0083\7\"\2\2\u0083\u0084\5\26\f\2\u0084\u0087\5\4\3\2\u0085\u0086"+
		"\7#\2\2\u0086\u0088\5\4\3\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\25\3\2\2\2\u0089\u008a\7\34\2\2\u008a\u008b\5\30\r\2\u008b\u008c\7\35"+
		"\2\2\u008c\27\3\2\2\2\u008d\u008e\b\r\1\2\u008e\u008f\5\32\16\2\u008f"+
		"\u00ba\3\2\2\2\u0090\u0091\6\r\2\3\u0091\u0092\7\22\2\2\u0092\u00b9\5"+
		"\30\r\2\u0093\u0094\6\r\3\3\u0094\u0095\t\2\2\2\u0095\u00b9\5\30\r\2\u0096"+
		"\u0097\6\r\4\3\u0097\u0098\t\3\2\2\u0098\u00b9\5\30\r\2\u0099\u009a\6"+
		"\r\5\3\u009a\u009b\7\21\2\2\u009b\u00b9\5\30\r\2\u009c\u009d\6\r\6\3\u009d"+
		"\u009e\7\17\2\2\u009e\u00b9\5\30\r\2\u009f\u00a0\6\r\7\3\u00a0\u00a1\7"+
		"\20\2\2\u00a1\u00b9\5\30\r\2\u00a2\u00a3\6\r\b\3\u00a3\u00a4\7\r\2\2\u00a4"+
		"\u00b9\5\30\r\2\u00a5\u00a6\6\r\t\3\u00a6\u00a7\7\16\2\2\u00a7\u00b9\5"+
		"\30\r\2\u00a8\u00a9\6\r\n\3\u00a9\u00aa\7\f\2\2\u00aa\u00b9\5\30\r\2\u00ab"+
		"\u00ac\6\r\13\3\u00ac\u00ad\7\13\2\2\u00ad\u00b9\5\30\r\2\u00ae\u00af"+
		"\6\r\f\3\u00af\u00b0\7\33\2\2\u00b0\u00b9\5\30\r\2\u00b1\u00b2\6\r\r\3"+
		"\u00b2\u00b3\7\7\2\2\u00b3\u00b4\5\30\r\2\u00b4\u00b5\7\4\2\2\u00b5\u00b9"+
		"\3\2\2\2\u00b6\u00b7\6\r\16\3\u00b7\u00b9\t\4\2\2\u00b8\u0090\3\2\2\2"+
		"\u00b8\u0093\3\2\2\2\u00b8\u0096\3\2\2\2\u00b8\u0099\3\2\2\2\u00b8\u009c"+
		"\3\2\2\2\u00b8\u009f\3\2\2\2\u00b8\u00a2\3\2\2\2\u00b8\u00a5\3\2\2\2\u00b8"+
		"\u00a8\3\2\2\2\u00b8\u00ab\3\2\2\2\u00b8\u00ae\3\2\2\2\u00b8\u00b1\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\31\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c2\5\26\f"+
		"\2\u00be\u00c2\7\62\2\2\u00bf\u00c2\t\5\2\2\u00c0\u00c2\7\66\2\2\u00c1"+
		"\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2"+
		"\2\2\u00c2\33\3\2\2\2\u00c3\u00c4\t\6\2\2\u00c4\35\3\2\2\2\u00c5\u00c6"+
		"\7\60\2\2\u00c6\u00c7\5\"\22\2\u00c7\u00c9\7\36\2\2\u00c8\u00ca\5&\24"+
		"\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\7\37\2\2\u00ce\37\3\2\2\2\u00cf"+
		"\u00d0\7\61\2\2\u00d0\u00d1\5\"\22\2\u00d1\u00d2\7\36\2\2\u00d2\u00d3"+
		"\5&\24\2\u00d3\u00d4\7\37\2\2\u00d4!\3\2\2\2\u00d5\u00d7\7\34\2\2\u00d6"+
		"\u00d8\5$\23\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\7\35\2\2\u00dc"+
		"#\3\2\2\2\u00dd\u00e2\7\65\2\2\u00de\u00df\7\24\2\2\u00df\u00e1\5$\23"+
		"\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3%\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\7*\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\t\7\2\2\u00e9"+
		"\u00eb\5@!\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2"+
		"\2\u00ec\u00ed\7\36\2\2\u00ed\u00ee\5(\25\2\u00ee\u00ef\7\37\2\2\u00ef"+
		"\'\3\2\2\2\u00f0\u00f2\5*\26\2\u00f1\u00f3\7\32\2\2\u00f2\u00f1\3\2\2"+
		"\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f5\u00f8"+
		"\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7)\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u0102\58\35\2\u00fa\u0102\5\62\32\2\u00fb\u0102\5"+
		",\27\2\u00fc\u00fd\5@!\2\u00fd\u00fe\7\33\2\2\u00fe\u00ff\5@!\2\u00ff"+
		"\u0102\3\2\2\2\u0100\u0102\5> \2\u0101\u00f9\3\2\2\2\u0101\u00fa\3\2\2"+
		"\2\u0101\u00fb\3\2\2\2\u0101\u00fc\3\2\2\2\u0101\u0100\3\2\2\2\u0102+"+
		"\3\2\2\2\u0103\u0104\t\b\2\2\u0104\u0105\5.\30\2\u0105-\3\2\2\2\u0106"+
		"\u0108\7\7\2\2\u0107\u0109\5\60\31\2\u0108\u0107\3\2\2\2\u0108\u0109\3"+
		"\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\7\4\2\2\u010b\u0106\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e/\3\2\2\2"+
		"\u010f\u0112\5@!\2\u0110\u0111\7\33\2\2\u0111\u0113\5@!\2\u0112\u0110"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0116\7\6\2\2\u0115"+
		"\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u010f\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\61\3\2\2\2\u011b\u011e\5:\36\2\u011c\u011e\5> \2\u011d\u011b\3\2\2\2"+
		"\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\5\64\33\2\u0120\u0122"+
		"\5.\30\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\63\3\2\2\2\u0123"+
		"\u0126\5\66\34\2\u0124\u0127\5:\36\2\u0125\u0127\5> \2\u0126\u0124\3\2"+
		"\2\2\u0126\u0125\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0123\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\65\3\2\2"+
		"\2\u012c\u012d\t\t\2\2\u012d\67\3\2\2\2\u012e\u0130\5:\36\2\u012f\u0131"+
		"\5.\30\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u01319\3\2\2\2\u0132"+
		"\u0134\5@!\2\u0133\u0135\5<\37\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2"+
		"\2\u0135;\3\2\2\2\u0136\u0137\7\b\2\2\u0137\u013a\5@!\2\u0138\u0139\7"+
		"\b\2\2\u0139\u013b\5@!\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"=\3\2\2\2\u013c\u013e\7/\2\2\u013d\u013f\5@!\2\u013e\u013d\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013c\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0143\7\36\2\2\u0143\u0144\5(\25\2\u0144"+
		"\u0145\7\37\2\2\u0145?\3\2\2\2\u0146\u0147\t\n\2\2\u0147A\3\2\2\2 ERX"+
		"a\u0087\u00b8\u00ba\u00c1\u00cb\u00d9\u00e2\u00e6\u00ea\u00f2\u00f6\u0101"+
		"\u0108\u010d\u0112\u0115\u0119\u011d\u0121\u0126\u012a\u0130\u0134\u013a"+
		"\u013e\u0140";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}