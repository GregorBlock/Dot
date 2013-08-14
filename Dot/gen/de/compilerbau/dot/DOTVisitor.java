// Generated from C:\Users\Gregor Block\Studium\git\Dot\Dot\src/de/compilerbau/dot/DOT.g4 by ANTLR 4.1
    
package de.compilerbau.dot;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DOTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DOTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DOTParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(@NotNull DOTParser.PortContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#attr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_stmt(@NotNull DOTParser.Attr_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#forStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStat(@NotNull DOTParser.ForStatContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(@NotNull DOTParser.AndExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_list(@NotNull DOTParser.Stmt_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#uncover}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUncover(@NotNull DOTParser.UncoverContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#edgeRHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeRHS(@NotNull DOTParser.EdgeRHSContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#gtEqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtEqExpr(@NotNull DOTParser.GtEqExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull DOTParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#assignExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(@NotNull DOTParser.AssignExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull DOTParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#stringAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(@NotNull DOTParser.StringAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#ifElseStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStat(@NotNull DOTParser.IfElseStatContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#numberAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(@NotNull DOTParser.NumberAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#arrayExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(@NotNull DOTParser.ArrayExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#node_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_id(@NotNull DOTParser.Node_idContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull DOTParser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#parExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(@NotNull DOTParser.ParExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#graph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph(@NotNull DOTParser.GraphContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#idAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(@NotNull DOTParser.IdAtomContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#a_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_list(@NotNull DOTParser.A_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(@NotNull DOTParser.FileContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#gtExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtExpr(@NotNull DOTParser.GtExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#edge_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_stmt(@NotNull DOTParser.Edge_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#only}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnly(@NotNull DOTParser.OnlyContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#neqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeqExpr(@NotNull DOTParser.NeqExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(@NotNull DOTParser.PrimaryExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#eqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(@NotNull DOTParser.EqExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#doStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStat(@NotNull DOTParser.DoStatContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull DOTParser.DeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#edgeop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgeop(@NotNull DOTParser.EdgeopContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(@NotNull DOTParser.StmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#mulDivExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(@NotNull DOTParser.MulDivExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#file_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_list(@NotNull DOTParser.File_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#ltExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtExpr(@NotNull DOTParser.LtExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(@NotNull DOTParser.OrExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull DOTParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#subgraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubgraph(@NotNull DOTParser.SubgraphContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#incDecExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecExpr(@NotNull DOTParser.IncDecExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#whileStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(@NotNull DOTParser.WhileStatContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull DOTParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#addSubExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(@NotNull DOTParser.AddSubExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(@NotNull DOTParser.SContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#attr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_list(@NotNull DOTParser.Attr_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#ltEqExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtEqExpr(@NotNull DOTParser.LtEqExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(@NotNull DOTParser.ForControlContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#node_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_stmt(@NotNull DOTParser.Node_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#parStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParStat(@NotNull DOTParser.ParStatContext ctx);
}