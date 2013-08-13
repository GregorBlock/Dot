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
	 * Visit a parse tree produced by {@link DOTParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull DOTParser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#attr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_stmt(@NotNull DOTParser.Attr_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(@NotNull DOTParser.PortContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(@NotNull DOTParser.VariableDeclaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(@NotNull DOTParser.VariableDeclaratorIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull DOTParser.ExpressionListContext ctx);

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
	 * Visit a parse tree produced by {@link DOTParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull DOTParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(@NotNull DOTParser.VariableInitializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(@NotNull DOTParser.BlockStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull DOTParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(@NotNull DOTParser.ForUpdateContext ctx);

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
	 * Visit a parse tree produced by {@link DOTParser#graph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraph(@NotNull DOTParser.GraphContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(@NotNull DOTParser.LocalVariableDeclarationStatementContext ctx);

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
	 * Visit a parse tree produced by {@link DOTParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(@NotNull DOTParser.PrimaryContext ctx);

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
	 * Visit a parse tree produced by {@link DOTParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(@NotNull DOTParser.ParExpressionContext ctx);

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
	 * Visit a parse tree produced by {@link DOTParser#file_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_list(@NotNull DOTParser.File_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(@NotNull DOTParser.VariableDeclaratorsContext ctx);

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
	 * Visit a parse tree produced by {@link DOTParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(@NotNull DOTParser.ArrayInitializerContext ctx);

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
	 * Visit a parse tree produced by {@link DOTParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(@NotNull DOTParser.ForControlContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(@NotNull DOTParser.ForInitContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#node_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode_stmt(@NotNull DOTParser.Node_stmtContext ctx);

	/**
	 * Visit a parse tree produced by {@link DOTParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(@NotNull DOTParser.LocalVariableDeclarationContext ctx);
}