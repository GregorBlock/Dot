// Generated from E:\eclipse\git_repo\Dot\Dot\src/de/compilerbau/dot/grammar/DOT.g4 by ANTLR 4.1
    
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
		T__1=1, T__0=2, INC=3, DEC=4, ARROW=5, OR=6, AND=7, EQ=8, NEQ=9, GT=10, 
		LT=11, GTEQ=12, LTEQ=13, PLUS=14, MINUS=15, MULT=16, DIV=17, SCOL=18, 
		COLON=19, COMMA=20, ASSIGN=21, OPAR=22, CPAR=23, OBRACE=24, CBRACE=25, 
		OBRACKET=26, CBRACKET=27, TRUE=28, FALSE=29, IF=30, ELSE=31, WHILE=32, 
		FOR=33, INTTYPE=34, DOUBLETYPE=35, STRINGTYPE=36, STRICT=37, GRAPH=38, 
		DIGRAPH=39, NODE=40, EDGE=41, SUBGRAPH=42, UNCOVER=43, MERGE=44, PRINT=45, 
		IDENTIFIER=46, INT=47, DOUBLE=48, STRING=49, COMMENT=50, LINE_COMMENT=51, 
		WS=52;
	public static final String[] tokenNames = {
		"<INVALID>", "'[]'", "'to'", "INC", "'--'", "'->'", "'||'", "'&&'", "'=='", 
		"'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "';'", 
		"':'", "','", "'='", "'('", "')'", "'{'", "'}'", "'['", "']'", "'true'", 
		"'false'", "'if'", "'else'", "'while'", "'for'", "'int'", "'double'", 
		"'String'", "STRICT", "GRAPH", "DIGRAPH", "NODE", "EDGE", "SUBGRAPH", 
		"UNCOVER", "MERGE", "PRINT", "IDENTIFIER", "INT", "DOUBLE", "STRING", 
		"COMMENT", "LINE_COMMENT", "WS"
	};
	public static final int
		RULE_s = 0, RULE_statement = 1, RULE_block = 2, RULE_declaration = 3, 
		RULE_arraydecl = 4, RULE_print = 5, RULE_assignment = 6, RULE_whileStat = 7, 
		RULE_forStat = 8, RULE_forControl = 9, RULE_ifElseStat = 10, RULE_parStat = 11, 
		RULE_expression = 12, RULE_primary = 13, RULE_values = 14, RULE_type = 15, 
		RULE_uncover = 16, RULE_merge = 17, RULE_graph = 18, RULE_stmt_list = 19, 
		RULE_stmt = 20, RULE_attr_stmt = 21, RULE_attr_list = 22, RULE_a_list = 23, 
		RULE_edge_stmt = 24, RULE_edgeRHS = 25, RULE_edgeop = 26, RULE_node_stmt = 27, 
		RULE_node_id = 28, RULE_port = 29, RULE_subgraph = 30, RULE_id = 31;
	public static final String[] ruleNames = {
		"s", "statement", "block", "declaration", "arraydecl", "print", "assignment", 
		"whileStat", "forStat", "forControl", "ifElseStat", "parStat", "expression", 
		"primary", "values", "type", "uncover", "merge", "graph", "stmt_list", 
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPAR) | (1L << OBRACE) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << INTTYPE) | (1L << DOUBLETYPE) | (1L << STRINGTYPE) | (1L << STRICT) | (1L << GRAPH) | (1L << DIGRAPH) | (1L << UNCOVER) | (1L << MERGE) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0)) {
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
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public MergeContext merge() {
			return getRuleContext(MergeContext.class,0);
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
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); block();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71); graph();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72); uncover();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73); merge();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74); assignment();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75); declaration();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(76); arraydecl();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(77); whileStat();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(78); forStat();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(79); ifElseStat();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(80); print();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(81); expression(0);
				setState(82); match(SCOL);
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
			setState(86); match(OBRACE);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPAR) | (1L << OBRACE) | (1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << INTTYPE) | (1L << DOUBLETYPE) | (1L << STRINGTYPE) | (1L << STRICT) | (1L << GRAPH) | (1L << DIGRAPH) | (1L << UNCOVER) | (1L << MERGE) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0)) {
				{
				{
				setState(87); statement();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93); match(CBRACE);
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
			setState(95); type();
			setState(96); match(IDENTIFIER);
			setState(99);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(97); match(ASSIGN);
				setState(98); expression(0);
				}
			}

			setState(101); match(SCOL);
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
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public TerminalNode CBRACE() { return getToken(DOTParser.CBRACE, 0); }
		public TerminalNode ASSIGN() { return getToken(DOTParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DOTParser.IDENTIFIER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DOTParser.COMMA); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OBRACE() { return getToken(DOTParser.OBRACE, 0); }
		public TerminalNode SCOL() { return getToken(DOTParser.SCOL, 0); }
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DOTParser.COMMA, i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); type();
			setState(104); match(1);
			setState(105); match(IDENTIFIER);
			setState(106); match(ASSIGN);
			setState(107); match(OBRACE);
			setState(108); values();
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109); match(COMMA);
				setState(110); values();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(115); match(CBRACE);
			setState(116); match(SCOL);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(DOTParser.PRINT, 0); }
		public TerminalNode CPAR() { return getToken(DOTParser.CPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(DOTParser.SCOL, 0); }
		public TerminalNode OPAR() { return getToken(DOTParser.OPAR, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(PRINT);
			setState(119); match(OPAR);
			setState(120); expression(0);
			setState(121); match(CPAR);
			setState(122); match(SCOL);
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
			setState(124); match(IDENTIFIER);
			setState(125); match(ASSIGN);
			setState(126); expression(0);
			setState(127); match(SCOL);
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
			setState(129); match(WHILE);
			setState(130); parStat();
			setState(131); statement();
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
			setState(133); match(FOR);
			setState(134); match(OPAR);
			setState(135); forControl();
			setState(136); match(CPAR);
			setState(137); statement();
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
		public TerminalNode ARROW() { return getToken(DOTParser.ARROW, 0); }
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
			setState(139); match(IDENTIFIER);
			setState(140); match(ARROW);
			setState(141); match(INT);
			setState(142); match(2);
			setState(143); match(INT);
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
			setState(145); match(IF);
			setState(146); parStat();
			setState(147); statement();
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(148); match(ELSE);
				setState(149); statement();
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
			setState(152); match(OPAR);
			setState(153); expression(0);
			setState(154); match(CPAR);
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
			setState(160);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(157); primary();
				}
				break;

			case 2:
				{
				_localctx = new IncDecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158); match(IDENTIFIER);
				setState(159);
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
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(197);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new LtEqExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(162);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(163); match(LTEQ);
						setState(164); expression(12);
						}
						break;

					case 2:
						{
						_localctx = new MulDivExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(166);
						((MulDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((MulDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(167); expression(11);
						}
						break;

					case 3:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(169);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(170); expression(10);
						}
						break;

					case 4:
						{
						_localctx = new GtEqExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(171);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(172); match(GTEQ);
						setState(173); expression(8);
						}
						break;

					case 5:
						{
						_localctx = new GtExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(175); match(GT);
						setState(176); expression(7);
						}
						break;

					case 6:
						{
						_localctx = new LtExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(177);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(178); match(LT);
						setState(179); expression(6);
						}
						break;

					case 7:
						{
						_localctx = new EqExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(180);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(181); match(EQ);
						setState(182); expression(5);
						}
						break;

					case 8:
						{
						_localctx = new NeqExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(183);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(184); match(NEQ);
						setState(185); expression(4);
						}
						break;

					case 9:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(187); match(AND);
						setState(188); expression(3);
						}
						break;

					case 10:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(190); match(OR);
						setState(191); expression(2);
						}
						break;

					case 11:
						{
						_localctx = new ArrayExprContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(193); match(OBRACKET);
						setState(194); expression(0);
						setState(195); match(CBRACKET);
						}
						break;
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public ParStatContext parStat() {
			return getRuleContext(ParStatContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primary);
		try {
			setState(204);
			switch (_input.LA(1)) {
			case OPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(202); parStat();
				}
				break;
			case TRUE:
			case FALSE:
			case IDENTIFIER:
			case INT:
			case DOUBLE:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(203); values();
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

	public static class ValuesContext extends ParserRuleContext {
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
	 
		public ValuesContext() { }
		public void copyFrom(ValuesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntAtomContext extends ValuesContext {
		public TerminalNode INT() { return getToken(DOTParser.INT, 0); }
		public IntAtomContext(ValuesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitIntAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdAtomContext extends ValuesContext {
		public TerminalNode IDENTIFIER() { return getToken(DOTParser.IDENTIFIER, 0); }
		public IdAtomContext(ValuesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitIdAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueAtomContext extends ValuesContext {
		public TerminalNode TRUE() { return getToken(DOTParser.TRUE, 0); }
		public TrueAtomContext(ValuesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitTrueAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseAtomContext extends ValuesContext {
		public TerminalNode FALSE() { return getToken(DOTParser.FALSE, 0); }
		public FalseAtomContext(ValuesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitFalseAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleAtomContext extends ValuesContext {
		public TerminalNode DOUBLE() { return getToken(DOTParser.DOUBLE, 0); }
		public DoubleAtomContext(ValuesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitDoubleAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends ValuesContext {
		public TerminalNode STRING() { return getToken(DOTParser.STRING, 0); }
		public StringAtomContext(ValuesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_values);
		try {
			setState(212);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206); match(IDENTIFIER);
				}
				break;
			case INT:
				_localctx = new IntAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(207); match(INT);
				}
				break;
			case DOUBLE:
				_localctx = new DoubleAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(208); match(DOUBLE);
				}
				break;
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(209); match(STRING);
				}
				break;
			case TRUE:
				_localctx = new TrueAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(210); match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(211); match(FALSE);
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
		enterRule(_localctx, 30, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
		public TerminalNode CPAR() { return getToken(DOTParser.CPAR, 0); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DOTParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(DOTParser.IDENTIFIER); }
		public List<TerminalNode> COMMA() { return getTokens(DOTParser.COMMA); }
		public TerminalNode UNCOVER() { return getToken(DOTParser.UNCOVER, 0); }
		public TerminalNode SCOL() { return getToken(DOTParser.SCOL, 0); }
		public TerminalNode OPAR() { return getToken(DOTParser.OPAR, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(DOTParser.COMMA, i);
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
		enterRule(_localctx, 32, RULE_uncover);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216); match(UNCOVER);
			setState(217); match(OPAR);
			setState(218); match(IDENTIFIER);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(219); match(COMMA);
				setState(220); match(IDENTIFIER);
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226); match(CPAR);
			setState(227); match(SCOL);
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

	public static class MergeContext extends ParserRuleContext {
		public TerminalNode CPAR() { return getToken(DOTParser.CPAR, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(DOTParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(DOTParser.IDENTIFIER); }
		public List<TerminalNode> COMMA() { return getTokens(DOTParser.COMMA); }
		public TerminalNode SCOL() { return getToken(DOTParser.SCOL, 0); }
		public TerminalNode OPAR() { return getToken(DOTParser.OPAR, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(DOTParser.COMMA, i);
		}
		public TerminalNode MERGE() { return getToken(DOTParser.MERGE, 0); }
		public MergeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DOTVisitor ) return ((DOTVisitor<? extends T>)visitor).visitMerge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeContext merge() throws RecognitionException {
		MergeContext _localctx = new MergeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_merge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); match(MERGE);
			setState(230); id();
			setState(231); match(OPAR);
			setState(232); match(IDENTIFIER);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(233); match(COMMA);
				setState(234); match(IDENTIFIER);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240); match(CPAR);
			setState(241); match(SCOL);
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
		public Token strict;
		public Token g;
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
			setState(244);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(243); ((GraphContext)_localctx).strict = match(STRICT);
				}
			}

			setState(246);
			((GraphContext)_localctx).g = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==GRAPH || _la==DIGRAPH) ) {
				((GraphContext)_localctx).g = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(248);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0)) {
				{
				setState(247); id();
				}
			}

			setState(250); match(OBRACE);
			setState(251); stmt_list();
			setState(252); match(CBRACE);
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
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OBRACE) | (1L << GRAPH) | (1L << NODE) | (1L << EDGE) | (1L << SUBGRAPH) | (1L << IDENTIFIER) | (1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0)) {
				{
				{
				setState(254); stmt();
				setState(256);
				_la = _input.LA(1);
				if (_la==SCOL) {
					{
					setState(255); match(SCOL);
					}
				}

				}
				}
				setState(262);
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
			setState(271);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263); node_stmt();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264); edge_stmt();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265); attr_stmt();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(266); id();
				setState(267); match(ASSIGN);
				setState(268); id();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(270); subgraph();
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
		public Token t;
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
			setState(273);
			((Attr_stmtContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GRAPH) | (1L << NODE) | (1L << EDGE))) != 0)) ) {
				((Attr_stmtContext)_localctx).t = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(274); attr_list();
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
		public TerminalNode OBRACKET() { return getToken(DOTParser.OBRACKET, 0); }
		public TerminalNode CBRACKET() { return getToken(DOTParser.CBRACKET, 0); }
		public A_listContext a_list() {
			return getRuleContext(A_listContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); match(OBRACKET);
			setState(277); a_list();
			setState(278); match(CBRACKET);
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
		public TerminalNode ASSIGN() { return getToken(DOTParser.ASSIGN, 0); }
		public A_listContext a_list(int i) {
			return getRuleContext(A_listContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DOTParser.COMMA); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(DOTParser.COMMA, i);
		}
		public List<A_listContext> a_list() {
			return getRuleContexts(A_listContext.class);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280); id();
			setState(281); match(ASSIGN);
			setState(282); id();
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(283); match(COMMA);
					setState(284); a_list();
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
			setState(292);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case INT:
			case DOUBLE:
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
			setState(294); edgeRHS();
			setState(296);
			_la = _input.LA(1);
			if (_la==OBRACKET) {
				{
				setState(295); attr_list();
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
		public SubgraphContext subgraph() {
			return getRuleContext(SubgraphContext.class,0);
		}
		public EdgeopContext edgeop() {
			return getRuleContext(EdgeopContext.class,0);
		}
		public Node_idContext node_id() {
			return getRuleContext(Node_idContext.class,0);
		}
		public EdgeRHSContext edgeRHS(int i) {
			return getRuleContext(EdgeRHSContext.class,i);
		}
		public List<EdgeRHSContext> edgeRHS() {
			return getRuleContexts(EdgeRHSContext.class);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(298); edgeop();
			setState(301);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case INT:
			case DOUBLE:
			case STRING:
				{
				setState(299); node_id();
				}
				break;
			case OBRACE:
			case SUBGRAPH:
				{
				setState(300); subgraph();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(303); edgeRHS();
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class EdgeopContext extends ParserRuleContext {
		public Token op;
		public TerminalNode ARROW() { return getToken(DOTParser.ARROW, 0); }
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
		try {
			setState(311);
			switch (_input.LA(1)) {
			case ARROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(309); ((EdgeopContext)_localctx).op = match(ARROW);
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(310); match(DEC);
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
			setState(313); node_id();
			setState(315);
			_la = _input.LA(1);
			if (_la==OBRACKET) {
				{
				setState(314); attr_list();
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
			setState(317); id();
			setState(319);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(318); port();
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
		public TerminalNode COLON(int i) {
			return getToken(DOTParser.COLON, i);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(DOTParser.COLON); }
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
			setState(321); match(COLON);
			setState(322); id();
			setState(325);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(323); match(COLON);
				setState(324); id();
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
			setState(331);
			_la = _input.LA(1);
			if (_la==SUBGRAPH) {
				{
				setState(327); match(SUBGRAPH);
				setState(329);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0)) {
					{
					setState(328); id();
					}
				}

				}
			}

			setState(333); match(OBRACE);
			setState(334); stmt_list();
			setState(335); match(CBRACE);
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
		public Token i;
		public TerminalNode INT() { return getToken(DOTParser.INT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DOTParser.IDENTIFIER, 0); }
		public TerminalNode DOUBLE() { return getToken(DOTParser.DOUBLE, 0); }
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
			setState(337);
			((IdContext)_localctx).i = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT) | (1L << DOUBLE) | (1L << STRING))) != 0)) ) {
				((IdContext)_localctx).i = (Token)_errHandler.recoverInline(this);
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
		case 0: return 11 >= _localctx._p;

		case 1: return 10 >= _localctx._p;

		case 2: return 9 >= _localctx._p;

		case 3: return 7 >= _localctx._p;

		case 4: return 6 >= _localctx._p;

		case 5: return 5 >= _localctx._p;

		case 6: return 4 >= _localctx._p;

		case 7: return 3 >= _localctx._p;

		case 8: return 2 >= _localctx._p;

		case 9: return 1 >= _localctx._p;

		case 10: return 12 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\66\u0156\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3W\n\3\3\4\3\4\7\4[\n\4\f\4\16\4^\13\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\5\5f\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6r\n"+
		"\6\r\6\16\6s\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u0099\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5"+
		"\16\u00a3\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00c8\n\16\f\16"+
		"\16\16\u00cb\13\16\3\17\3\17\5\17\u00cf\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00d7\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u00e0\n"+
		"\22\f\22\16\22\u00e3\13\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\7\23\u00ee\n\23\f\23\16\23\u00f1\13\23\3\23\3\23\3\23\3\24\5\24\u00f7"+
		"\n\24\3\24\3\24\5\24\u00fb\n\24\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u0103"+
		"\n\25\7\25\u0105\n\25\f\25\16\25\u0108\13\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0112\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\7\31\u0120\n\31\f\31\16\31\u0123\13\31\3\32\3\32"+
		"\5\32\u0127\n\32\3\32\3\32\5\32\u012b\n\32\3\33\3\33\3\33\5\33\u0130\n"+
		"\33\3\33\7\33\u0133\n\33\f\33\16\33\u0136\13\33\3\34\3\34\5\34\u013a\n"+
		"\34\3\35\3\35\5\35\u013e\n\35\3\36\3\36\5\36\u0142\n\36\3\37\3\37\3\37"+
		"\3\37\5\37\u0148\n\37\3 \3 \5 \u014c\n \5 \u014e\n \3 \3 \3 \3 \3!\3!"+
		"\3!\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@\2\t\3\2\5\6\3\2\22\23\3\2\20\21\3\2$&\3\2()\4\2((*+\3\2\60\63\u016c"+
		"\2E\3\2\2\2\4V\3\2\2\2\6X\3\2\2\2\ba\3\2\2\2\ni\3\2\2\2\fx\3\2\2\2\16"+
		"~\3\2\2\2\20\u0083\3\2\2\2\22\u0087\3\2\2\2\24\u008d\3\2\2\2\26\u0093"+
		"\3\2\2\2\30\u009a\3\2\2\2\32\u00a2\3\2\2\2\34\u00ce\3\2\2\2\36\u00d6\3"+
		"\2\2\2 \u00d8\3\2\2\2\"\u00da\3\2\2\2$\u00e7\3\2\2\2&\u00f6\3\2\2\2(\u0106"+
		"\3\2\2\2*\u0111\3\2\2\2,\u0113\3\2\2\2.\u0116\3\2\2\2\60\u011a\3\2\2\2"+
		"\62\u0126\3\2\2\2\64\u012c\3\2\2\2\66\u0139\3\2\2\28\u013b\3\2\2\2:\u013f"+
		"\3\2\2\2<\u0143\3\2\2\2>\u014d\3\2\2\2@\u0153\3\2\2\2BD\5\4\3\2CB\3\2"+
		"\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\3\3\2\2\2GE\3\2\2\2HW\5\6\4\2IW\5"+
		"&\24\2JW\5\"\22\2KW\5$\23\2LW\5\16\b\2MW\5\b\5\2NW\5\n\6\2OW\5\20\t\2"+
		"PW\5\22\n\2QW\5\26\f\2RW\5\f\7\2ST\5\32\16\2TU\7\24\2\2UW\3\2\2\2VH\3"+
		"\2\2\2VI\3\2\2\2VJ\3\2\2\2VK\3\2\2\2VL\3\2\2\2VM\3\2\2\2VN\3\2\2\2VO\3"+
		"\2\2\2VP\3\2\2\2VQ\3\2\2\2VR\3\2\2\2VS\3\2\2\2W\5\3\2\2\2X\\\7\32\2\2"+
		"Y[\5\4\3\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2"+
		"\2\2_`\7\33\2\2`\7\3\2\2\2ab\5 \21\2be\7\60\2\2cd\7\27\2\2df\5\32\16\2"+
		"ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\24\2\2h\t\3\2\2\2ij\5 \21\2jk\7\3\2"+
		"\2kl\7\60\2\2lm\7\27\2\2mn\7\32\2\2nq\5\36\20\2op\7\26\2\2pr\5\36\20\2"+
		"qo\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\33\2\2vw\7\24\2"+
		"\2w\13\3\2\2\2xy\7/\2\2yz\7\30\2\2z{\5\32\16\2{|\7\31\2\2|}\7\24\2\2}"+
		"\r\3\2\2\2~\177\7\60\2\2\177\u0080\7\27\2\2\u0080\u0081\5\32\16\2\u0081"+
		"\u0082\7\24\2\2\u0082\17\3\2\2\2\u0083\u0084\7\"\2\2\u0084\u0085\5\30"+
		"\r\2\u0085\u0086\5\4\3\2\u0086\21\3\2\2\2\u0087\u0088\7#\2\2\u0088\u0089"+
		"\7\30\2\2\u0089\u008a\5\24\13\2\u008a\u008b\7\31\2\2\u008b\u008c\5\4\3"+
		"\2\u008c\23\3\2\2\2\u008d\u008e\7\60\2\2\u008e\u008f\7\7\2\2\u008f\u0090"+
		"\7\61\2\2\u0090\u0091\7\4\2\2\u0091\u0092\7\61\2\2\u0092\25\3\2\2\2\u0093"+
		"\u0094\7 \2\2\u0094\u0095\5\30\r\2\u0095\u0098\5\4\3\2\u0096\u0097\7!"+
		"\2\2\u0097\u0099\5\4\3\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\27\3\2\2\2\u009a\u009b\7\30\2\2\u009b\u009c\5\32\16\2\u009c\u009d\7\31"+
		"\2\2\u009d\31\3\2\2\2\u009e\u009f\b\16\1\2\u009f\u00a3\5\34\17\2\u00a0"+
		"\u00a1\7\60\2\2\u00a1\u00a3\t\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u00a0\3"+
		"\2\2\2\u00a3\u00c9\3\2\2\2\u00a4\u00a5\6\16\2\3\u00a5\u00a6\7\17\2\2\u00a6"+
		"\u00c8\5\32\16\2\u00a7\u00a8\6\16\3\3\u00a8\u00a9\t\3\2\2\u00a9\u00c8"+
		"\5\32\16\2\u00aa\u00ab\6\16\4\3\u00ab\u00ac\t\4\2\2\u00ac\u00c8\5\32\16"+
		"\2\u00ad\u00ae\6\16\5\3\u00ae\u00af\7\16\2\2\u00af\u00c8\5\32\16\2\u00b0"+
		"\u00b1\6\16\6\3\u00b1\u00b2\7\f\2\2\u00b2\u00c8\5\32\16\2\u00b3\u00b4"+
		"\6\16\7\3\u00b4\u00b5\7\r\2\2\u00b5\u00c8\5\32\16\2\u00b6\u00b7\6\16\b"+
		"\3\u00b7\u00b8\7\n\2\2\u00b8\u00c8\5\32\16\2\u00b9\u00ba\6\16\t\3\u00ba"+
		"\u00bb\7\13\2\2\u00bb\u00c8\5\32\16\2\u00bc\u00bd\6\16\n\3\u00bd\u00be"+
		"\7\t\2\2\u00be\u00c8\5\32\16\2\u00bf\u00c0\6\16\13\3\u00c0\u00c1\7\b\2"+
		"\2\u00c1\u00c8\5\32\16\2\u00c2\u00c3\6\16\f\3\u00c3\u00c4\7\34\2\2\u00c4"+
		"\u00c5\5\32\16\2\u00c5\u00c6\7\35\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00a4"+
		"\3\2\2\2\u00c7\u00a7\3\2\2\2\u00c7\u00aa\3\2\2\2\u00c7\u00ad\3\2\2\2\u00c7"+
		"\u00b0\3\2\2\2\u00c7\u00b3\3\2\2\2\u00c7\u00b6\3\2\2\2\u00c7\u00b9\3\2"+
		"\2\2\u00c7\u00bc\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\33\3\2\2"+
		"\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\5\30\r\2\u00cd\u00cf\5\36\20\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\35\3\2\2\2\u00d0\u00d7\7\60\2"+
		"\2\u00d1\u00d7\7\61\2\2\u00d2\u00d7\7\62\2\2\u00d3\u00d7\7\63\2\2\u00d4"+
		"\u00d7\7\36\2\2\u00d5\u00d7\7\37\2\2\u00d6\u00d0\3\2\2\2\u00d6\u00d1\3"+
		"\2\2\2\u00d6\u00d2\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\37\3\2\2\2\u00d8\u00d9\t\5\2\2\u00d9!\3\2\2\2\u00da"+
		"\u00db\7-\2\2\u00db\u00dc\7\30\2\2\u00dc\u00e1\7\60\2\2\u00dd\u00de\7"+
		"\26\2\2\u00de\u00e0\7\60\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e4\u00e5\7\31\2\2\u00e5\u00e6\7\24\2\2\u00e6#\3\2\2\2\u00e7\u00e8"+
		"\7.\2\2\u00e8\u00e9\5@!\2\u00e9\u00ea\7\30\2\2\u00ea\u00ef\7\60\2\2\u00eb"+
		"\u00ec\7\26\2\2\u00ec\u00ee\7\60\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3"+
		"\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f2\u00f3\7\31\2\2\u00f3\u00f4\7\24\2\2\u00f4%\3\2\2"+
		"\2\u00f5\u00f7\7\'\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u00fa\t\6\2\2\u00f9\u00fb\5@!\2\u00fa\u00f9\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7\32\2\2\u00fd\u00fe\5"+
		"(\25\2\u00fe\u00ff\7\33\2\2\u00ff\'\3\2\2\2\u0100\u0102\5*\26\2\u0101"+
		"\u0103\7\24\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3"+
		"\2\2\2\u0104\u0100\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107)\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u0112\58\35\2"+
		"\u010a\u0112\5\62\32\2\u010b\u0112\5,\27\2\u010c\u010d\5@!\2\u010d\u010e"+
		"\7\27\2\2\u010e\u010f\5@!\2\u010f\u0112\3\2\2\2\u0110\u0112\5> \2\u0111"+
		"\u0109\3\2\2\2\u0111\u010a\3\2\2\2\u0111\u010b\3\2\2\2\u0111\u010c\3\2"+
		"\2\2\u0111\u0110\3\2\2\2\u0112+\3\2\2\2\u0113\u0114\t\7\2\2\u0114\u0115"+
		"\5.\30\2\u0115-\3\2\2\2\u0116\u0117\7\34\2\2\u0117\u0118\5\60\31\2\u0118"+
		"\u0119\7\35\2\2\u0119/\3\2\2\2\u011a\u011b\5@!\2\u011b\u011c\7\27\2\2"+
		"\u011c\u0121\5@!\2\u011d\u011e\7\26\2\2\u011e\u0120\5\60\31\2\u011f\u011d"+
		"\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\61\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0127\5:\36\2\u0125\u0127\5> \2"+
		"\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a"+
		"\5\64\33\2\u0129\u012b\5.\30\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2"+
		"\u012b\63\3\2\2\2\u012c\u012f\5\66\34\2\u012d\u0130\5:\36\2\u012e\u0130"+
		"\5> \2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\u0134\3\2\2\2\u0131"+
		"\u0133\5\64\33\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3"+
		"\2\2\2\u0134\u0135\3\2\2\2\u0135\65\3\2\2\2\u0136\u0134\3\2\2\2\u0137"+
		"\u013a\7\7\2\2\u0138\u013a\7\6\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2"+
		"\2\2\u013a\67\3\2\2\2\u013b\u013d\5:\36\2\u013c\u013e\5.\30\2\u013d\u013c"+
		"\3\2\2\2\u013d\u013e\3\2\2\2\u013e9\3\2\2\2\u013f\u0141\5@!\2\u0140\u0142"+
		"\5<\37\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142;\3\2\2\2\u0143"+
		"\u0144\7\25\2\2\u0144\u0147\5@!\2\u0145\u0146\7\25\2\2\u0146\u0148\5@"+
		"!\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148=\3\2\2\2\u0149\u014b"+
		"\7,\2\2\u014a\u014c\5@!\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014e\3\2\2\2\u014d\u0149\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0150\7\32\2\2\u0150\u0151\5(\25\2\u0151\u0152\7\33\2\2\u0152"+
		"?\3\2\2\2\u0153\u0154\t\b\2\2\u0154A\3\2\2\2\37EV\\es\u0098\u00a2\u00c7"+
		"\u00c9\u00ce\u00d6\u00e1\u00ef\u00f6\u00fa\u0102\u0106\u0111\u0121\u0126"+
		"\u012a\u012f\u0134\u0139\u013d\u0141\u0147\u014b\u014d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}