package de.compilerbau.dot;

import de.compilerbau.dot.DOTParser.AndExprContext;
import de.compilerbau.dot.DOTParser.EqExprContext;
import de.compilerbau.dot.DOTParser.ExpressionContext;
import de.compilerbau.dot.DOTParser.ForControlContext;
import de.compilerbau.dot.DOTParser.ForInitContext;
import de.compilerbau.dot.DOTParser.ForUpdateContext;
import de.compilerbau.dot.DOTParser.GtEqExprContext;
import de.compilerbau.dot.DOTParser.GtExprContext;
import de.compilerbau.dot.DOTParser.LtEqExprContext;
import de.compilerbau.dot.DOTParser.LtExprContext;
import de.compilerbau.dot.DOTParser.NeqExprContext;
import de.compilerbau.dot.DOTParser.OrExprContext;
import de.compilerbau.dot.DOTParser.ParExpressionContext;
import de.compilerbau.dot.DOTParser.WhileStatementContext;

public class MyVisitor extends DOTBaseVisitor<Value>
{

    @Override
    public Value visitForControl(ForControlContext ctx)
    {
	this.visit(ctx.forInit());
	this.visit(ctx.expression());
	this.visit(ctx.forUpdate());
	return super.visitForControl(ctx);
    }

    @Override
    public Value visitForInit(ForInitContext ctx)
    {
	// TODO Auto-generated method stub
	return super.visitForInit(ctx);
    }

    @Override
    public Value visitForUpdate(ForUpdateContext ctx)
    {
	// TODO Auto-generated method stub
	return super.visitForUpdate(ctx);
    }

    @Override
    public Value visitWhileStatement(WhileStatementContext ctx)
    {
	int i = 0;
	Value v = visit(ctx.parExpression());
	while(v.asBoolean())
	{
	    System.out.println(i++);
	    visit(ctx.statement());
	    
	    v = visit(ctx.parExpression());
	}
	return null;
    }

    @Override
    public Value visitParExpression(ParExpressionContext ctx)
    {
	return new Value(visit(ctx.expression()));
    }

    @Override
    public Value visitGtExpr(GtExprContext ctx)
    {
	Value l = visit(ctx.expression(0));
	Value r = visit(ctx.expression(1));
	return new Value(l.asDouble() > r.asDouble());
    }

    @Override
    public Value visitLtExpr(LtExprContext ctx)
    {
	Value l = visit(ctx.expression(0));
	System.out.println(l);
	Value r = visit(ctx.expression(1));
	System.out.println(r);
	return new Value(l.asDouble() < r.asDouble());
    }

    @Override
    public Value visitOrExpr(OrExprContext ctx)
    {
	Value l = visit(ctx.expression(0));
	Value r = visit(ctx.expression(1));
	return new Value(l.asBoolean() || r.asBoolean());
    }

    @Override
    public Value visitLtEqExpr(LtEqExprContext ctx)
    {
	Value l = visit(ctx.expression(0));
	Value r = visit(ctx.expression(1));
	return new Value(l.asDouble() <= r.asDouble());
    }

    @Override
    public Value visitAndExpr(AndExprContext ctx)
    {
	Value l = visit(ctx.expression(0));
	Value r = visit(ctx.expression(1));
	return new Value(l.asBoolean() && r.asBoolean());
    }

    @Override
    public Value visitGtEqExpr(GtEqExprContext ctx)
    {
	Value l = visit(ctx.expression(0));
	Value r = visit(ctx.expression(1));
	return new Value(l.asDouble() >= r.asDouble());
    }

    @Override
    public Value visitNeqExpr(NeqExprContext ctx)
    {
	Value l = visit(ctx.expression(0));
	Value r = visit(ctx.expression(1));
	return new Value(l.asBoolean() != r.asBoolean());
    }

    @Override
    public Value visitEqExpr(EqExprContext ctx)
    {
	Value l = visit(ctx.expression(0));
	Value r = visit(ctx.expression(1));
	return new Value(l.asBoolean() == r.asBoolean());
    }
    
    

}
