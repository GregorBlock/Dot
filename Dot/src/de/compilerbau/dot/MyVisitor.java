package de.compilerbau.dot;

import java.util.HashMap;
import java.util.Map;

import de.compilerbau.dot.DOTParser.AddSubExprContext;
import de.compilerbau.dot.DOTParser.AndExprContext;
import de.compilerbau.dot.DOTParser.DeclarationContext;
import de.compilerbau.dot.DOTParser.EqExprContext;
import de.compilerbau.dot.DOTParser.GtEqExprContext;
import de.compilerbau.dot.DOTParser.GtExprContext;
import de.compilerbau.dot.DOTParser.IdAtomContext;
import de.compilerbau.dot.DOTParser.IncDecExprContext;
import de.compilerbau.dot.DOTParser.LtEqExprContext;
import de.compilerbau.dot.DOTParser.LtExprContext;
import de.compilerbau.dot.DOTParser.MulDivExprContext;
import de.compilerbau.dot.DOTParser.NeqExprContext;
import de.compilerbau.dot.DOTParser.NumberAtomContext;
import de.compilerbau.dot.DOTParser.ParStatContext;
import de.compilerbau.dot.DOTParser.StringAtomContext;
import de.compilerbau.dot.DOTParser.WhileStatContext;

public class MyVisitor extends DOTBaseVisitor<Value>
{
   private Map<String, Value> memory = new HashMap<String, Value>();

   @Override
   public Value visitStringAtom(StringAtomContext ctx)
   {
      String str = ctx.getText();
      str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
      return new Value(str);
   }

   @Override
   public Value visitNumberAtom(NumberAtomContext ctx)
   {
      return new Value(Double.valueOf(ctx.getText()));
   }

   @Override
   public Value visitDeclaration(DeclarationContext ctx)
   {
      String id = ctx.IDENTIFIER().getText();
      Value value = this.visit(ctx.expression());
      return memory.put(id, value); 
   }

   @Override
   public Value visitIdAtom(IdAtomContext ctx)
   {
      String id = ctx.IDENTIFIER().getText();
      Value value = memory.get(id);
      if (value == null)
      {
         throw new RuntimeException("no such variable: " + id);
      }
      return value;
   }

   @Override
   public Value visitWhileStat(WhileStatContext ctx)
   {
      Value v = visit(ctx.parStat());
      while (v.asBoolean())
      {
         visit(ctx.statement());

         v = visit(ctx.parStat());
      }
      return Value.VOID;
   }

   @Override
   public Value visitParStat(ParStatContext ctx)
   {
      return visit(ctx.expression());
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
      Value r = visit(ctx.expression(1));
      Value asd = new Value(l.asDouble() < r.asDouble()); 
      return asd;
   }

   @Override
   public Value visitLtEqExpr(LtEqExprContext ctx)
   {
      Value l = this.visit(ctx.expression(0));
      Value r = this.visit(ctx.expression(1));
      return new Value(l.asDouble() <= r.asDouble());
   }

   @Override
   public Value visitAndExpr(AndExprContext ctx)
   {
      Value l = this.visit(ctx.expression(0));
      Value r = this.visit(ctx.expression(1));
      return new Value(l.asBoolean() && r.asBoolean());
   }

   @Override
   public Value visitGtEqExpr(GtEqExprContext ctx)
   {
      Value l = this.visit(ctx.expression(0));
      Value r = this.visit(ctx.expression(1));
      return new Value(l.asDouble() >= r.asDouble());
   }

   @Override
   public Value visitIncDecExpr(IncDecExprContext ctx)
   {
      // muss noch in der map akt. werden

      Value l = this.visit(ctx.expression());

      if (ctx.op.getType() == DOTParser.INC)
         return new Value(l.asDouble()+1);
      else
         return new Value(l.asDouble()-1);
   }

   @Override
   public Value visitNeqExpr(NeqExprContext ctx)
   {
      Value l = this.visit(ctx.expression(0));
      Value r = this.visit(ctx.expression(1));
      return new Value(l.asBoolean() != r.asBoolean());
   }

   @Override
   public Value visitEqExpr(EqExprContext ctx)
   {
      Value l = this.visit(ctx.expression(0));
      Value r = this.visit(ctx.expression(1));
      return new Value(l.asBoolean() == r.asBoolean());
   }

   @Override
   public Value visitMulDivExpr(MulDivExprContext ctx)
   {
      Value l = visit(ctx.expression(0));
      Value r = visit(ctx.expression(1));
      if (ctx.op.getType() == DOTParser.MULT)
         return new Value(l.asDouble() * r.asDouble());
      return new Value(l.asDouble() / r.asDouble());
   }

   @Override
   public Value visitAddSubExpr(AddSubExprContext ctx)
   {
      Value l = visit(ctx.expression(0));
      Value r = visit(ctx.expression(1));
      if (ctx.op.getType() == DOTParser.PLUS)
         return new Value(l.asDouble() + r.asDouble());
      return new Value(l.asDouble() - r.asDouble());
   }
}
