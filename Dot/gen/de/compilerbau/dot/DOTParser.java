// Generated from E:\eclipse\git_repo\Dot\Dot\src/de/compilerbau/dot/DOT.g4 by ANTLR 4.1
    
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
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, INC=8, DEC=9, 
		OR=10, AND=11, EQ=12, NEQ=13, GT=14, LT=15, GTEQ=16, LTEQ=17, PLUS=18, 
		MINUS=19, MULT=20, DIV=21, MOD=22, POW=23, NOT=24, SCOL=25, ASSIGN=26, 
		OPAR=27, CPAR=28, OBRACE=29, CBRACE=30, TRUE=31, FALSE=32, IF=33, ELSE=34, 
		WHILE=35, FOR=36, INTTYPE=37, DOUBLETYPE=38, STRINGTYPE=39, STRICT=40, 
		GRAPH=41, DIGRAPH=42, NODE=43, EDGE=44, SUBGRAPH=45, UNCOVER=46, ONLY=47, 
		IDENTIFIER=48, INT=49, DOUBLE=50, NUMBER=51, STRING=52, COMMENT=53, LINE_COMMENT=54, 
		WS=55;
	public static final String[] tokenNames = {
		"<INVALID>", "'[]'", "'->'", "']'", "'to'", "','", "'['", "':'", "INC", 
		"'--'", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "';'", "'='", "'('", 
		"')'", "'{'", "'}'", "'true'", "'false'", "'if'", "'else'", "'while'", 
		"'for'", "'int'", "'double'", "'String'", "STRICT", "GRAPH", "DIGRAPH", 
		"NODE", "EDGE", "SUBGRAPH", "UNCOVER", "ONLY", "IDENTIFIER", "INT", "DOUBLE", 
		"NUMBER", "STRING", "COMMENT", "LINE_COMMENT", "WS"
	};
	public static final int
		RULE_s = 0, RULE_statement = 1, RULE_block = 2, RULE_declaration = 3, 
		RULE_arraydecl = 4, RULE_value_list = 5, RULE_assignment = 6, RULE_whileStat = 7, 
		RULE_forStat = 8, RULE_forControl = 9, RULE_ifElseStat = 10, RULE_parStat = 11, 
		RULE_expression = 12, RULE_primary = 13, RULE_type = 14, RULE_uncover = 15, 
		RULE_only = 16, RULE_file_list = 17, RULE_file = 18, RULE_graph = 19, 
		RULE_stmt_list = 20, RULE_stmt = 21, RULE_attr_stmt = 22, RULE_attr_list = 23, 
		RULE_a_list = 24, RULE_edge_stmt = 25, RULE_edgeRHS = 26, RULE_edgeop = 27, 
		RULE_node_stmt = 28, RULE_node_id = 29, RULE_port = 30, RULE_subgraph = 31, 
		RULE_id = 32;
	public static final String[] ruleNames = {
		"s", "statement", "block", "declaration", "arraydecl", "value_list", "assignment", 
		"whileStat", "forStat", "forControl", "ifElseStat", "parStat", "expression", 
		"primary", "type", "uncover", "only", "file_list", "file", "graph", "stmt_list", 
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPAR) | (1L << OBRACE) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << INTTYPE) | (1L << DOUBLETYPE) | (1L << STRINGTYPE) | (1L << STRICT) | (1L << GRAPH) | (1L << DIGRAPH) | (1L << UNCOVER) | (1L << ONLY) | (1L << IDENTIFIER) | (1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0)) {
				{
				{
				setState(66); statement();
				}
				}
				setState(71);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public OnlyContext only() {
			return getRuleContext(OnlyContext.class,0);
		}
		public ArraydeclContext arraydecl() {
			return getRuleContext(ArraydeclContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); graph();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74); uncover();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75); only();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76); assignment();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77); declaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(78); arraydecl();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(79); whileStat();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(80); forStat();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(81); ifElseStat();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(82); expression(0);
				setState(83); match(SCOL);
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
			setState(87); match(OBRACE);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPAR) | (1L << OBRACE) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << INTTYPE) | (1L << DOUBLETYPE) | (1L << STRINGTYPE) | (1L << STRICT) | (1L << GRAPH) | (1L << DIGRAPH) | (1L << UNCOVER) | (1L << ONLY) | (1L << IDENTIFIER) | (1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0)) {
				{
				{
				setState(88); statement();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94); match(CBRACE);
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
			setState(96); type();
			setState(97); match(IDENTIFIER);
			setState(100);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(98); match(ASSIGN);
				setState(99); expression(0);
				}
			}

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

	public static class ArraydeclContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(DOTParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DOTParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(DOTParser.SCOL, 0); }
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public ArraydeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraydecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitArraydecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraydeclContext arraydecl() throws RecognitionException {
		ArraydeclContext _localctx = new ArraydeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arraydecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); type();
			setState(105); match(1);
			setState(106); match(IDENTIFIER);
			setState(107); match(ASSIGN);
			setState(108); value_list();
			setState(109); match(SCOL);
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

	public static class Value_listContext extends ParserRuleContext {
		public Value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list; }
	 
		public Value_listContext() { }
		public void copyFrom(Value_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayListContext extends Value_listContext {
		public TerminalNode STRING(int i) {
			return getToken(DOTParser.STRING, i);
		}
		public List<TerminalNode> INT() { return getTokens(DOTParser.INT); }
		public TerminalNode DOUBLE(int i) {
			return getToken(DOTParser.DOUBLE, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(DOTParser.DOUBLE); }
		public TerminalNode INT(int i) {
			return getToken(DOTParser.INT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(DOTParser.STRING); }
		public ArrayListContext(Value_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitArrayList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_listContext value_list() throws RecognitionException {
		Value_listContext _localctx = new Value_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value_list);
		int _la;
		try {
			_localctx = new ArrayListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111); match(OBRACE);
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(118);
					switch (_input.LA(1)) {
					case INT:
						{
						setState(112); match(INT);
						}
						break;
					case DOUBLE:
						{
						setState(113); match(DOUBLE);
						}
						break;
					case STRING:
						{
						setState(114); match(STRING);
						setState(116);
						_la = _input.LA(1);
						if (_la==5) {
							{
							setState(115); match(5);
							}
						}

						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0) );
				setState(122); match(CBRACE);
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OBRACE );
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
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(IDENTIFIER);
			setState(128); match(ASSIGN);
			setState(129); expression(0);
			setState(130); match(SCOL);
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
		enterRule(_localctx, 14, RULE_whileStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(WHILE);
			setState(133); parStat();
			setState(134); statement();
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
		enterRule(_localctx, 16, RULE_forStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(FOR);
			setState(137); match(OPAR);
			setState(138); forControl();
			setState(139); match(CPAR);
			setState(140); statement();
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
		enterRule(_localctx, 18, RULE_forControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(IDENTIFIER);
			setState(143); match(2);
			setState(144); match(INT);
			setState(145); match(4);
			setState(146); match(INT);
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
		enterRule(_localctx, 20, RULE_ifElseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(IF);
			setState(149); parStat();
			setState(150); statement();
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(151); match(ELSE);
				setState(152); statement();
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
		enterRule(_localctx, 22, RULE_parStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(OPAR);
			setState(156); expression(0);
			setState(157); match(CPAR);
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
		public TerminalNode IDENTIFIER() { return getToken(DOTParser.IDENTIFIER, 0); }
		public TerminalNode DEC() { return getToken(DOTParser.DEC, 0); }
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
		int _startState = 24;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(160); primary();
				}
				break;

			case 2:
				{
				_localctx = new IncDecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161); match(IDENTIFIER);
				setState(162);
				((IncDecExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
					((IncDecExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(203);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new LtEqExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(166); match(LTEQ);
						setState(167); expression(13);
						}
						break;

					case 2:
						{
						_localctx = new MulDivExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(169);
						((MulDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((MulDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(170); expression(12);
						}
						break;

					case 3:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(171);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(172);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(173); expression(11);
						}
						break;

					case 4:
						{
						_localctx = new GtEqExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(175); match(GTEQ);
						setState(176); expression(9);
						}
						break;

					case 5:
						{
						_localctx = new GtExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(178); match(GT);
						setState(179); expression(8);
						}
						break;

					case 6:
						{
						_localctx = new LtExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(181); match(LT);
						setState(182); expression(7);
						}
						break;

					case 7:
						{
						_localctx = new EqExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(184); match(EQ);
						setState(185); expression(6);
						}
						break;

					case 8:
						{
						_localctx = new NeqExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(187); match(NEQ);
						setState(188); expression(5);
						}
						break;

					case 9:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(190); match(AND);
						setState(191); expression(4);
						}
						break;

					case 10:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(193); match(OR);
						setState(194); expression(3);
						}
						break;

					case 11:
						{
						_localctx = new AssignExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(196); match(ASSIGN);
						setState(197); expression(1);
						}
						break;

					case 12:
						{
						_localctx = new ArrayExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(199); match(6);
						setState(200); expression(0);
						setState(201); match(3);
						}
						break;
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
	public static class IntAtomContext extends PrimaryContext {
		public TerminalNode INT() { return getToken(DOTParser.INT, 0); }
		public IntAtomContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitIntAtom(this);
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
	public static class DoubleAtomContext extends PrimaryContext {
		public TerminalNode DOUBLE() { return getToken(DOTParser.DOUBLE, 0); }
		public DoubleAtomContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitDoubleAtom(this);
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

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primary);
		try {
			setState(213);
			switch (_input.LA(1)) {
			case OPAR:
				_localctx = new ParExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(208); parStat();
				}
				break;
			case IDENTIFIER:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209); match(IDENTIFIER);
				}
				break;
			case INT:
				_localctx = new IntAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(210); match(INT);
				}
				break;
			case DOUBLE:
				_localctx = new DoubleAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(211); match(DOUBLE);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(212); match(STRING);
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
		public TerminalNode DOUBLETYPE() { return getToken(DOTParser.DOUBLETYPE, 0); }
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
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTTYPE) | (1L << DOUBLETYPE) | (1L << STRINGTYPE))) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_uncover);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); match(UNCOVER);
			setState(218); file_list();
			setState(219); match(OBRACE);
			setState(221); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(220); graph();
				}
				}
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRICT) | (1L << GRAPH) | (1L << DIGRAPH))) != 0) );
			setState(225); match(CBRACE);
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
		enterRule(_localctx, 32, RULE_only);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); match(ONLY);
			setState(228); file_list();
			setState(229); match(OBRACE);
			setState(230); graph();
			setState(231); match(CBRACE);
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
		enterRule(_localctx, 34, RULE_file_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); match(OPAR);
			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(234); file();
				}
				}
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(239); match(CPAR);
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
		enterRule(_localctx, 36, RULE_file);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241); match(NUMBER);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(242); match(MINUS);
					setState(243); file();
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 38, RULE_graph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(249); match(STRICT);
				}
			}

			setState(252);
			_la = _input.LA(1);
			if ( !(_la==GRAPH || _la==DIGRAPH) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(254);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(253); id();
				}
			}

			setState(256); match(OBRACE);
			setState(257); stmt_list();
			setState(258); match(CBRACE);
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
		enterRule(_localctx, 40, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBRACE) | (1L << GRAPH) | (1L << NODE) | (1L << EDGE) | (1L << SUBGRAPH) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				{
				setState(260); stmt();
				setState(262);
				_la = _input.LA(1);
				if (_la==SCOL) {
					{
					setState(261); match(SCOL);
					}
				}

				}
				}
				setState(268);
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
		enterRule(_localctx, 42, RULE_stmt);
		try {
			setState(277);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269); node_stmt();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270); edge_stmt();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271); attr_stmt();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(272); id();
				setState(273); match(ASSIGN);
				setState(274); id();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(276); subgraph();
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
		enterRule(_localctx, 44, RULE_attr_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAPH) | (1L << NODE) | (1L << EDGE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(280); attr_list();
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
		enterRule(_localctx, 46, RULE_attr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(282); match(6);
				setState(284);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(283); a_list();
					}
				}

				setState(286); match(3);
				}
				}
				setState(289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==6 );
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
		enterRule(_localctx, 48, RULE_a_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(291); id();
				setState(294);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(292); match(ASSIGN);
					setState(293); id();
					}
				}

				setState(297);
				_la = _input.LA(1);
				if (_la==5) {
					{
					setState(296); match(5);
					}
				}

				}
				}
				setState(301); 
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
		enterRule(_localctx, 50, RULE_edge_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case NUMBER:
			case STRING:
				{
				setState(303); node_id();
				}
				break;
			case OBRACE:
			case SUBGRAPH:
				{
				setState(304); subgraph();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(307); edgeRHS();
			setState(309);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(308); attr_list();
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
		enterRule(_localctx, 52, RULE_edgeRHS);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(311); edgeop();
				setState(314);
				switch (_input.LA(1)) {
				case IDENTIFIER:
				case NUMBER:
				case STRING:
					{
					setState(312); node_id();
					}
					break;
				case OBRACE:
				case SUBGRAPH:
					{
					setState(313); subgraph();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(318); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==2 || _la==DEC );
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
		enterRule(_localctx, 54, RULE_edgeop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if ( !(_la==2 || _la==DEC) ) {
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
		enterRule(_localctx, 56, RULE_node_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); node_id();
			setState(324);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(323); attr_list();
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
		enterRule(_localctx, 58, RULE_node_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); id();
			setState(328);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(327); port();
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
		enterRule(_localctx, 60, RULE_port);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); match(7);
			setState(331); id();
			setState(334);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(332); match(7);
				setState(333); id();
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
		enterRule(_localctx, 62, RULE_subgraph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_la = _input.LA(1);
			if (_la==SUBGRAPH) {
				{
				setState(336); match(SUBGRAPH);
				setState(338);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(337); id();
					}
				}

				}
			}

			setState(342); match(OBRACE);
			setState(343); stmt_list();
			setState(344); match(CBRACE);
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
		enterRule(_localctx, 64, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
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
		case 12: return expression_sempred((ExpressionContext)_localctx, predIndex);
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
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\39\u015f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3X\n\3\3\4\3\4\7\4\\\n\4\f\4\16\4_\13\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\5\5g\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\5\7w\n\7\6\7y\n\7\r\7\16\7z\3\7\6\7~\n\7\r\7\16\7\177\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u009c\n\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\5\16\u00a6\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u00ce\n\16\f\16\16\16\u00d1\13\16\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00d8\n\17\3\20\3\20\3\21\3\21\3\21\3\21\6\21\u00e0\n"+
		"\21\r\21\16\21\u00e1\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\6\23\u00ee\n\23\r\23\16\23\u00ef\3\23\3\23\3\24\3\24\3\24\7\24\u00f7"+
		"\n\24\f\24\16\24\u00fa\13\24\3\25\5\25\u00fd\n\25\3\25\3\25\5\25\u0101"+
		"\n\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u0109\n\26\7\26\u010b\n\26\f"+
		"\26\16\26\u010e\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0118"+
		"\n\27\3\30\3\30\3\30\3\31\3\31\5\31\u011f\n\31\3\31\6\31\u0122\n\31\r"+
		"\31\16\31\u0123\3\32\3\32\3\32\5\32\u0129\n\32\3\32\5\32\u012c\n\32\6"+
		"\32\u012e\n\32\r\32\16\32\u012f\3\33\3\33\5\33\u0134\n\33\3\33\3\33\5"+
		"\33\u0138\n\33\3\34\3\34\3\34\5\34\u013d\n\34\6\34\u013f\n\34\r\34\16"+
		"\34\u0140\3\35\3\35\3\36\3\36\5\36\u0147\n\36\3\37\3\37\5\37\u014b\n\37"+
		"\3 \3 \3 \3 \5 \u0151\n \3!\3!\5!\u0155\n!\5!\u0157\n!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@B\2\n\3\2\n\13\3\2\26\27\3\2\24\25\3\2\')\3\2+,\4\2++-.\4\2\4\4\13"+
		"\13\4\2\62\62\65\66\u017a\2G\3\2\2\2\4W\3\2\2\2\6Y\3\2\2\2\bb\3\2\2\2"+
		"\nj\3\2\2\2\f}\3\2\2\2\16\u0081\3\2\2\2\20\u0086\3\2\2\2\22\u008a\3\2"+
		"\2\2\24\u0090\3\2\2\2\26\u0096\3\2\2\2\30\u009d\3\2\2\2\32\u00a5\3\2\2"+
		"\2\34\u00d7\3\2\2\2\36\u00d9\3\2\2\2 \u00db\3\2\2\2\"\u00e5\3\2\2\2$\u00eb"+
		"\3\2\2\2&\u00f3\3\2\2\2(\u00fc\3\2\2\2*\u010c\3\2\2\2,\u0117\3\2\2\2."+
		"\u0119\3\2\2\2\60\u0121\3\2\2\2\62\u012d\3\2\2\2\64\u0133\3\2\2\2\66\u013e"+
		"\3\2\2\28\u0142\3\2\2\2:\u0144\3\2\2\2<\u0148\3\2\2\2>\u014c\3\2\2\2@"+
		"\u0156\3\2\2\2B\u015c\3\2\2\2DF\5\4\3\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2"+
		"GH\3\2\2\2H\3\3\2\2\2IG\3\2\2\2JX\5\6\4\2KX\5(\25\2LX\5 \21\2MX\5\"\22"+
		"\2NX\5\16\b\2OX\5\b\5\2PX\5\n\6\2QX\5\20\t\2RX\5\22\n\2SX\5\26\f\2TU\5"+
		"\32\16\2UV\7\33\2\2VX\3\2\2\2WJ\3\2\2\2WK\3\2\2\2WL\3\2\2\2WM\3\2\2\2"+
		"WN\3\2\2\2WO\3\2\2\2WP\3\2\2\2WQ\3\2\2\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2"+
		"X\5\3\2\2\2Y]\7\37\2\2Z\\\5\4\3\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2"+
		"\2\2^`\3\2\2\2_]\3\2\2\2`a\7 \2\2a\7\3\2\2\2bc\5\36\20\2cf\7\62\2\2de"+
		"\7\34\2\2eg\5\32\16\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\33\2\2i\t\3\2"+
		"\2\2jk\5\36\20\2kl\7\3\2\2lm\7\62\2\2mn\7\34\2\2no\5\f\7\2op\7\33\2\2"+
		"p\13\3\2\2\2qx\7\37\2\2ry\7\63\2\2sy\7\64\2\2tv\7\66\2\2uw\7\7\2\2vu\3"+
		"\2\2\2vw\3\2\2\2wy\3\2\2\2xr\3\2\2\2xs\3\2\2\2xt\3\2\2\2yz\3\2\2\2zx\3"+
		"\2\2\2z{\3\2\2\2{|\3\2\2\2|~\7 \2\2}q\3\2\2\2~\177\3\2\2\2\177}\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\r\3\2\2\2\u0081\u0082\7\62\2\2\u0082\u0083"+
		"\7\34\2\2\u0083\u0084\5\32\16\2\u0084\u0085\7\33\2\2\u0085\17\3\2\2\2"+
		"\u0086\u0087\7%\2\2\u0087\u0088\5\30\r\2\u0088\u0089\5\4\3\2\u0089\21"+
		"\3\2\2\2\u008a\u008b\7&\2\2\u008b\u008c\7\35\2\2\u008c\u008d\5\24\13\2"+
		"\u008d\u008e\7\36\2\2\u008e\u008f\5\4\3\2\u008f\23\3\2\2\2\u0090\u0091"+
		"\7\62\2\2\u0091\u0092\7\4\2\2\u0092\u0093\7\63\2\2\u0093\u0094\7\6\2\2"+
		"\u0094\u0095\7\63\2\2\u0095\25\3\2\2\2\u0096\u0097\7#\2\2\u0097\u0098"+
		"\5\30\r\2\u0098\u009b\5\4\3\2\u0099\u009a\7$\2\2\u009a\u009c\5\4\3\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\27\3\2\2\2\u009d\u009e\7\35\2"+
		"\2\u009e\u009f\5\32\16\2\u009f\u00a0\7\36\2\2\u00a0\31\3\2\2\2\u00a1\u00a2"+
		"\b\16\1\2\u00a2\u00a6\5\34\17\2\u00a3\u00a4\7\62\2\2\u00a4\u00a6\t\2\2"+
		"\2\u00a5\u00a1\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00cf\3\2\2\2\u00a7\u00a8"+
		"\6\16\2\3\u00a8\u00a9\7\23\2\2\u00a9\u00ce\5\32\16\2\u00aa\u00ab\6\16"+
		"\3\3\u00ab\u00ac\t\3\2\2\u00ac\u00ce\5\32\16\2\u00ad\u00ae\6\16\4\3\u00ae"+
		"\u00af\t\4\2\2\u00af\u00ce\5\32\16\2\u00b0\u00b1\6\16\5\3\u00b1\u00b2"+
		"\7\22\2\2\u00b2\u00ce\5\32\16\2\u00b3\u00b4\6\16\6\3\u00b4\u00b5\7\20"+
		"\2\2\u00b5\u00ce\5\32\16\2\u00b6\u00b7\6\16\7\3\u00b7\u00b8\7\21\2\2\u00b8"+
		"\u00ce\5\32\16\2\u00b9\u00ba\6\16\b\3\u00ba\u00bb\7\16\2\2\u00bb\u00ce"+
		"\5\32\16\2\u00bc\u00bd\6\16\t\3\u00bd\u00be\7\17\2\2\u00be\u00ce\5\32"+
		"\16\2\u00bf\u00c0\6\16\n\3\u00c0\u00c1\7\r\2\2\u00c1\u00ce\5\32\16\2\u00c2"+
		"\u00c3\6\16\13\3\u00c3\u00c4\7\f\2\2\u00c4\u00ce\5\32\16\2\u00c5\u00c6"+
		"\6\16\f\3\u00c6\u00c7\7\34\2\2\u00c7\u00ce\5\32\16\2\u00c8\u00c9\6\16"+
		"\r\3\u00c9\u00ca\7\b\2\2\u00ca\u00cb\5\32\16\2\u00cb\u00cc\7\5\2\2\u00cc"+
		"\u00ce\3\2\2\2\u00cd\u00a7\3\2\2\2\u00cd\u00aa\3\2\2\2\u00cd\u00ad\3\2"+
		"\2\2\u00cd\u00b0\3\2\2\2\u00cd\u00b3\3\2\2\2\u00cd\u00b6\3\2\2\2\u00cd"+
		"\u00b9\3\2\2\2\u00cd\u00bc\3\2\2\2\u00cd\u00bf\3\2\2\2\u00cd\u00c2\3\2"+
		"\2\2\u00cd\u00c5\3\2\2\2\u00cd\u00c8\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\33\3\2\2\2\u00d1\u00cf\3\2\2"+
		"\2\u00d2\u00d8\5\30\r\2\u00d3\u00d8\7\62\2\2\u00d4\u00d8\7\63\2\2\u00d5"+
		"\u00d8\7\64\2\2\u00d6\u00d8\7\66\2\2\u00d7\u00d2\3\2\2\2\u00d7\u00d3\3"+
		"\2\2\2\u00d7\u00d4\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8"+
		"\35\3\2\2\2\u00d9\u00da\t\5\2\2\u00da\37\3\2\2\2\u00db\u00dc\7\60\2\2"+
		"\u00dc\u00dd\5$\23\2\u00dd\u00df\7\37\2\2\u00de\u00e0\5(\25\2\u00df\u00de"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\7 \2\2\u00e4!\3\2\2\2\u00e5\u00e6\7\61\2\2"+
		"\u00e6\u00e7\5$\23\2\u00e7\u00e8\7\37\2\2\u00e8\u00e9\5(\25\2\u00e9\u00ea"+
		"\7 \2\2\u00ea#\3\2\2\2\u00eb\u00ed\7\35\2\2\u00ec\u00ee\5&\24\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7\36\2\2\u00f2%\3\2\2\2\u00f3\u00f8"+
		"\7\65\2\2\u00f4\u00f5\7\25\2\2\u00f5\u00f7\5&\24\2\u00f6\u00f4\3\2\2\2"+
		"\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\'\3"+
		"\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\7*\2\2\u00fc\u00fb\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\t\6\2\2\u00ff\u0101\5B"+
		"\"\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0103\7\37\2\2\u0103\u0104\5*\26\2\u0104\u0105\7 \2\2\u0105)\3\2\2\2"+
		"\u0106\u0108\5,\27\2\u0107\u0109\7\33\2\2\u0108\u0107\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0106\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d+\3\2\2\2\u010e\u010c\3\2\2\2"+
		"\u010f\u0118\5:\36\2\u0110\u0118\5\64\33\2\u0111\u0118\5.\30\2\u0112\u0113"+
		"\5B\"\2\u0113\u0114\7\34\2\2\u0114\u0115\5B\"\2\u0115\u0118\3\2\2\2\u0116"+
		"\u0118\5@!\2\u0117\u010f\3\2\2\2\u0117\u0110\3\2\2\2\u0117\u0111\3\2\2"+
		"\2\u0117\u0112\3\2\2\2\u0117\u0116\3\2\2\2\u0118-\3\2\2\2\u0119\u011a"+
		"\t\7\2\2\u011a\u011b\5\60\31\2\u011b/\3\2\2\2\u011c\u011e\7\b\2\2\u011d"+
		"\u011f\5\62\32\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3"+
		"\2\2\2\u0120\u0122\7\5\2\2\u0121\u011c\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\61\3\2\2\2\u0125\u0128\5B\"\2"+
		"\u0126\u0127\7\34\2\2\u0127\u0129\5B\"\2\u0128\u0126\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u012c\7\7\2\2\u012b\u012a\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u0125\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\63\3\2\2\2\u0131\u0134"+
		"\5<\37\2\u0132\u0134\5@!\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0137\5\66\34\2\u0136\u0138\5\60\31\2\u0137\u0136"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0138\65\3\2\2\2\u0139\u013c\58\35\2\u013a"+
		"\u013d\5<\37\2\u013b\u013d\5@!\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2"+
		"\2\u013d\u013f\3\2\2\2\u013e\u0139\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\u0140\u0141\3\2\2\2\u0141\67\3\2\2\2\u0142\u0143\t\b\2\2\u0143"+
		"9\3\2\2\2\u0144\u0146\5<\37\2\u0145\u0147\5\60\31\2\u0146\u0145\3\2\2"+
		"\2\u0146\u0147\3\2\2\2\u0147;\3\2\2\2\u0148\u014a\5B\"\2\u0149\u014b\5"+
		"> \2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b=\3\2\2\2\u014c\u014d"+
		"\7\t\2\2\u014d\u0150\5B\"\2\u014e\u014f\7\t\2\2\u014f\u0151\5B\"\2\u0150"+
		"\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151?\3\2\2\2\u0152\u0154\7/\2\2\u0153"+
		"\u0155\5B\"\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2"+
		"\2\2\u0156\u0152\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0159\7\37\2\2\u0159\u015a\5*\26\2\u015a\u015b\7 \2\2\u015bA\3\2\2\2"+
		"\u015c\u015d\t\t\2\2\u015dC\3\2\2\2%GW]fvxz\177\u009b\u00a5\u00cd\u00cf"+
		"\u00d7\u00e1\u00ef\u00f8\u00fc\u0100\u0108\u010c\u0117\u011e\u0123\u0128"+
		"\u012b\u012f\u0133\u0137\u013c\u0140\u0146\u014a\u0150\u0154\u0156";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}