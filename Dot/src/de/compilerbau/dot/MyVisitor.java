package de.compilerbau.dot;

import java.util.HashMap;
import java.util.Map; 

import de.compilerbau.dot.DOTParser.AddSubExprContext;
import de.compilerbau.dot.DOTParser.AssignExprContext;
import de.compilerbau.dot.DOTParser.EqExprContext;
import de.compilerbau.dot.DOTParser.GtEqExprContext;
import de.compilerbau.dot.DOTParser.GtExprContext;
import de.compilerbau.dot.DOTParser.IdExprContext;
import de.compilerbau.dot.DOTParser.IncDecExprContext;
import de.compilerbau.dot.DOTParser.LtEqExprContext;
import de.compilerbau.dot.DOTParser.LtExprContext;
import de.compilerbau.dot.DOTParser.MulDivExprContext;
import de.compilerbau.dot.DOTParser.NeqExprContext;
import de.compilerbau.dot.DOTParser.NumberExprContext;
import de.compilerbau.dot.DOTParser.WhileStatementContext;

public class MyVisitor extends DOTBaseVisitor<Integer>
{
   private Map<String, Integer> memory = new HashMap<String, Integer>();
   
   @Override
   public Integer visitNumberExpr(NumberExprContext ctx)
   {
      return Integer.valueOf(ctx.NUMBER().getText());
   }

   @Override
   public Integer visitAssignExpr(AssignExprContext ctx)
   {
      String id = ctx.variableDeclaratorId().getText();
      int value = this.visit(ctx.variableInitializer());
      memory.put(id,value);
      return super.visitAssignExpr(ctx);
   }

   @Override
   public Integer visitIdExpr(IdExprContext ctx)
   {
      String id = ctx.ID().getText();
      if ( memory.containsKey(id) ) return memory.get(id);
      return 0;
   }

   @Override
   public Integer visitWhileStatement(WhileStatementContext ctx)
   {  
      Integer v = visit(ctx.expression());
      
      while (v==1)
      {
         visit(ctx.statement());

         v = visit(ctx.expression());
      }
      return null;
   }

   
   @Override
   public Integer visitGtExpr(GtExprContext ctx)
   {
      int l = visit(ctx.expression(0));
      int r = visit(ctx.expression(1));
      return (l > r) ? 1 : 0;
   }

   @Override
   public Integer visitLtExpr(LtExprContext ctx)
   {
      int l = visit(ctx.expression(0));
      int r = visit(ctx.expression(1));
      System.out.println("l: "+l + " r: "+r);
      return (l < r) ? 1 : 0;
   }

   @Override
   public Integer visitLtEqExpr(LtEqExprContext ctx)
   {
      int l = this.visit(ctx.expression(0));
      int r = this.visit(ctx.expression(1));
      return (l <= r) ? 1 : 0;
   }

//   @Override
//   public Integer visitAndExpr(AndExprContext ctx)
//   {
//      Integer l = this.visit(ctx.expression(0));
//      Integer r = this.visit(ctx.expression(1));
//      return (l && r) ? 1 : 0;
//   }

   @Override
   public Integer visitGtEqExpr(GtEqExprContext ctx)
   {
      int l = this.visit(ctx.expression(0));
      int r = this.visit(ctx.expression(1));
      return (l >= r) ? 1 : 0;
   }

   @Override
   public Integer visitIncDecExpr(IncDecExprContext ctx)
   {
      // muss noch in der map akt. werden
      
      int l = this.visit(ctx.expression());
      
      if ( ctx.op.getType() == DOTParser.PP ) 
         l += 1;
      else
         l -= 1;
      return l;  
   }

   @Override
   public Integer visitNeqExpr(NeqExprContext ctx)
   {
      int l = this.visit(ctx.expression(0));
      int r = this.visit(ctx.expression(1));
      return (l != r) ? 1 : 0;   
   }
      
   @Override
   public Integer visitEqExpr(EqExprContext ctx)
   {
      int l = this.visit(ctx.expression(0));
      int r = this.visit(ctx.expression(1));
      return (l == r) ? 1 : 0;
   }
   
   
   @Override
   public Integer visitMulDivExpr(MulDivExprContext ctx)
   {
      int left = visit(ctx.expression(0));  
      int right = visit(ctx.expression(1)); 
      if ( ctx.op.getType() == DOTParser.MUL ) return left * right;
      return left / right; 
   }

   @Override
   public Integer visitAddSubExpr(AddSubExprContext ctx)
   {
      int left = visit(ctx.expression(0));  
      int right = visit(ctx.expression(1)); 
      if ( ctx.op.getType() == DOTParser.ADD ) return left + right;
      return left - right; 
   }
   
   
}
