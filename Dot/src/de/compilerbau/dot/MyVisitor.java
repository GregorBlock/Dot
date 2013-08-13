package de.compilerbau.dot;

import de.compilerbau.dot.DOTParser.ExpressionContext;
import de.compilerbau.dot.DOTParser.ForControlContext;
import de.compilerbau.dot.DOTParser.ForInitContext;
import de.compilerbau.dot.DOTParser.ForUpdateContext;

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
   public Value visitExpression(ExpressionContext ctx)
   {
      // TODO Auto-generated method stub
      return super.visitExpression(ctx);
   }

   @Override
   public Value visitForUpdate(ForUpdateContext ctx)
   {
      // TODO Auto-generated method stub
      return super.visitForUpdate(ctx);
   }


   
   
   
}
