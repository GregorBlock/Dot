// Generated from C:\Users\Gregor Block\Studium\git\Dot\Dot\src/de/compilerbau/dot/DOT.g4 by ANTLR 4.1
    
package de.compilerbau.dot;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DOTParser}.
 */
public interface DOTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DOTParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull DOTParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull DOTParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#attr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttr_stmt(@NotNull DOTParser.Attr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#attr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttr_stmt(@NotNull DOTParser.Attr_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(@NotNull DOTParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(@NotNull DOTParser.PortContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull DOTParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull DOTParser.VariableDeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(@NotNull DOTParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(@NotNull DOTParser.VariableDeclaratorIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull DOTParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull DOTParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(@NotNull DOTParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(@NotNull DOTParser.Stmt_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#uncover}.
	 * @param ctx the parse tree
	 */
	void enterUncover(@NotNull DOTParser.UncoverContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#uncover}.
	 * @param ctx the parse tree
	 */
	void exitUncover(@NotNull DOTParser.UncoverContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#edgeRHS}.
	 * @param ctx the parse tree
	 */
	void enterEdgeRHS(@NotNull DOTParser.EdgeRHSContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#edgeRHS}.
	 * @param ctx the parse tree
	 */
	void exitEdgeRHS(@NotNull DOTParser.EdgeRHSContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull DOTParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull DOTParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull DOTParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull DOTParser.VariableInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull DOTParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull DOTParser.BlockStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull DOTParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull DOTParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(@NotNull DOTParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(@NotNull DOTParser.ForUpdateContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#node_id}.
	 * @param ctx the parse tree
	 */
	void enterNode_id(@NotNull DOTParser.Node_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#node_id}.
	 * @param ctx the parse tree
	 */
	void exitNode_id(@NotNull DOTParser.Node_idContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull DOTParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull DOTParser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraph(@NotNull DOTParser.GraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraph(@NotNull DOTParser.GraphContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(@NotNull DOTParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(@NotNull DOTParser.LocalVariableDeclarationStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#a_list}.
	 * @param ctx the parse tree
	 */
	void enterA_list(@NotNull DOTParser.A_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#a_list}.
	 * @param ctx the parse tree
	 */
	void exitA_list(@NotNull DOTParser.A_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull DOTParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull DOTParser.FileContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull DOTParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull DOTParser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#edge_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEdge_stmt(@NotNull DOTParser.Edge_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#edge_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEdge_stmt(@NotNull DOTParser.Edge_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#only}.
	 * @param ctx the parse tree
	 */
	void enterOnly(@NotNull DOTParser.OnlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#only}.
	 * @param ctx the parse tree
	 */
	void exitOnly(@NotNull DOTParser.OnlyContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(@NotNull DOTParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(@NotNull DOTParser.ParExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#edgeop}.
	 * @param ctx the parse tree
	 */
	void enterEdgeop(@NotNull DOTParser.EdgeopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#edgeop}.
	 * @param ctx the parse tree
	 */
	void exitEdgeop(@NotNull DOTParser.EdgeopContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(@NotNull DOTParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(@NotNull DOTParser.StmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#file_list}.
	 * @param ctx the parse tree
	 */
	void enterFile_list(@NotNull DOTParser.File_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#file_list}.
	 * @param ctx the parse tree
	 */
	void exitFile_list(@NotNull DOTParser.File_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(@NotNull DOTParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(@NotNull DOTParser.VariableDeclaratorsContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull DOTParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull DOTParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#subgraph}.
	 * @param ctx the parse tree
	 */
	void enterSubgraph(@NotNull DOTParser.SubgraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#subgraph}.
	 * @param ctx the parse tree
	 */
	void exitSubgraph(@NotNull DOTParser.SubgraphContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull DOTParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull DOTParser.ArrayInitializerContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(@NotNull DOTParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(@NotNull DOTParser.SContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#attr_list}.
	 * @param ctx the parse tree
	 */
	void enterAttr_list(@NotNull DOTParser.Attr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#attr_list}.
	 * @param ctx the parse tree
	 */
	void exitAttr_list(@NotNull DOTParser.Attr_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(@NotNull DOTParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(@NotNull DOTParser.ForControlContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull DOTParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull DOTParser.ForInitContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#node_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNode_stmt(@NotNull DOTParser.Node_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#node_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNode_stmt(@NotNull DOTParser.Node_stmtContext ctx);

	/**
	 * Enter a parse tree produced by {@link DOTParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(@NotNull DOTParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DOTParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(@NotNull DOTParser.LocalVariableDeclarationContext ctx);
}