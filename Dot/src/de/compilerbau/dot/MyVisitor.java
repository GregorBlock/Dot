package de.compilerbau.dot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import de.compilerbau.dot.DOTParser.AddSubExprContext;
import de.compilerbau.dot.DOTParser.AndExprContext;
import de.compilerbau.dot.DOTParser.ArrayExprContext;
import de.compilerbau.dot.DOTParser.ArraydeclContext;
import de.compilerbau.dot.DOTParser.AssignmentContext;
import de.compilerbau.dot.DOTParser.DeclarationContext;
import de.compilerbau.dot.DOTParser.DoubleAtomContext;
import de.compilerbau.dot.DOTParser.EqExprContext;
import de.compilerbau.dot.DOTParser.ForControlContext;
import de.compilerbau.dot.DOTParser.ForStatContext;
import de.compilerbau.dot.DOTParser.GraphContext;
import de.compilerbau.dot.DOTParser.GtEqExprContext;
import de.compilerbau.dot.DOTParser.GtExprContext;
import de.compilerbau.dot.DOTParser.IdAtomContext;
import de.compilerbau.dot.DOTParser.IfElseStatContext;
import de.compilerbau.dot.DOTParser.IncDecExprContext;
import de.compilerbau.dot.DOTParser.IntAtomContext;
import de.compilerbau.dot.DOTParser.LtEqExprContext;
import de.compilerbau.dot.DOTParser.LtExprContext;
import de.compilerbau.dot.DOTParser.MergeContext;
import de.compilerbau.dot.DOTParser.MulDivExprContext;
import de.compilerbau.dot.DOTParser.NeqExprContext;
import de.compilerbau.dot.DOTParser.ParStatContext;
import de.compilerbau.dot.DOTParser.PrintContext;
import de.compilerbau.dot.DOTParser.StringAtomContext;
import de.compilerbau.dot.DOTParser.UncoverContext;
import de.compilerbau.dot.DOTParser.WhileStatContext;
import de.compilerbau.dot.Value.Type;

public class MyVisitor extends DOTBaseVisitor<Value>
{
   private Map<String, Value> memory = new HashMap<String, Value>();

   @Override
   public Value visitStringAtom(StringAtomContext ctx)
   {
      String str = ctx.getText();
      str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
      return new Value(Value.Type.STRING, str);
   }

   @Override
   public Value visitDoubleAtom(DoubleAtomContext ctx)
   {
      return new Value(Value.Type.DOUBLE, Double.valueOf(ctx.getText()));
   }

   @Override
   public Value visitIntAtom(IntAtomContext ctx)
   {
      return new Value(Value.Type.INT, Integer.valueOf(ctx.getText()));
   }

   @Override
   public Value visitDeclaration(DeclarationContext ctx)
   {
      String id = ctx.IDENTIFIER().getText();

      Value value;
      if (!(ctx.expression() == null))
      {
         if (!checkType(ctx.start.getType(), ctx.expression().start.getType()))
            throw new RuntimeException("Type mismatch");
         value = this.visit(ctx.expression());
      }
      else
      {
         value = new Value(setType(ctx.start.getType()));
      }
      return memory.put(id, value);
   }

   @Override
   public Value visitArraydecl(ArraydeclContext ctx)
   {
      Value value = null;
      String id = ctx.IDENTIFIER(0).getText();

      // TODO: kp wie man das besser machen kann hehe
      // TODO: int [] b = {1.2,2.2,3.2}; zeigt kein fehler!
      switch (ctx.type().getText())
      {
         case "int":
            ArrayList<Integer> intArrayList = new ArrayList<Integer>();
            for (int i = 0; i < ctx.INT().size(); i++)
            {
               intArrayList.add(Integer.valueOf(ctx.INT(i).getText()));
            }
            value = new Value(setType(ctx.start.getType()), intArrayList);
            break;
         case "double":
            ArrayList<Double> doubleArrayList = new ArrayList<Double>();
            for (int i = 0; i < ctx.DOUBLE().size(); i++)
            {
               doubleArrayList.add(Double.valueOf(ctx.DOUBLE(i).getText()));
            }
            value = new Value(setType(ctx.start.getType()), doubleArrayList);
            break;
         case "String":
            ArrayList<String> stringArrayList = new ArrayList<String>();
            for (int i = 0; i < ctx.STRING().size(); i++)
            {
               String str = ctx.STRING(i).getText();
               str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
               stringArrayList.add(str);
            }
            value = new Value(setType(ctx.start.getType()), stringArrayList);
            break;

         default:
            break;
      }

      return memory.put(id, value);
   }

   private boolean checkType(int type, int value)
   {
      switch (type)
      {
         case DOTParser.INTTYPE:
            return value == DOTParser.INT;
         case DOTParser.DOUBLETYPE:
            return value == DOTParser.DOUBLE;
         case DOTParser.STRINGTYPE:
            return value == DOTParser.STRING;
         default:
            return false;
      }
   }

   private Type setType(int type)
   {
      switch (type)
      {
         case DOTParser.INTTYPE:
            return Value.Type.INT;
         case DOTParser.DOUBLETYPE:
            return Value.Type.DOUBLE;
         case DOTParser.STRINGTYPE:
            return Value.Type.STRING;
         default:
            return Value.Type.VOID;
      }
   }

   @Override
   public Value visitArrayExpr(ArrayExprContext ctx)
   {
      Value l = visit(ctx.expression(0));
      Value r = visit(ctx.expression(1));
      switch (l.getType())
      {
         case INT:
            System.out.println(l.asIntArray().get(r.asInt()));
            break;
         case DOUBLE:
            System.out.println(l.asDoubleArray().get(r.asInt()));
            break;
         case STRING:
            System.out.println(l.asStringArray().get(r.asInt()));
            break;
         default:
            break;
      }
      return Value.VOID;
   }

   @Override
   public Value visitAssignment(AssignmentContext ctx)
   {
      String id = ctx.IDENTIFIER().getText();
      Value value = memory.get(id);
      if (value == null)
      {
         throw new RuntimeException("Id " + id + " unbekannt");
      }

      return memory.put(id, visit(ctx.expression()));

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
      return new Value(Value.Type.BOOLEAN, l.asDouble() > r.asDouble());
   }

   @Override
   public Value visitLtExpr(LtExprContext ctx)
   {
      Value l = visit(ctx.expression(0));
      Value r = visit(ctx.expression(1));
      Value asd = new Value(Value.Type.BOOLEAN, l.asDouble() < r.asDouble());
      return asd;
   }

   @Override
   public Value visitLtEqExpr(LtEqExprContext ctx)
   {
      Value l = this.visit(ctx.expression(0));
      Value r = this.visit(ctx.expression(1));
      return new Value(Value.Type.BOOLEAN, l.asDouble() <= r.asDouble());
   }

   @Override
   public Value visitAndExpr(AndExprContext ctx)
   {
      Value l = this.visit(ctx.expression(0));
      Value r = this.visit(ctx.expression(1));
      return new Value(Value.Type.BOOLEAN, l.asBoolean() && r.asBoolean());
   }

   @Override
   public Value visitGtEqExpr(GtEqExprContext ctx)
   {
      Value l = this.visit(ctx.expression(0));
      Value r = this.visit(ctx.expression(1));
      return new Value(Value.Type.BOOLEAN, l.asDouble() >= r.asDouble());
   }

   @Override
   public Value visitIncDecExpr(IncDecExprContext ctx)
   {
      String id = ctx.IDENTIFIER().getText();
      Value value = memory.get(id);
      if (value == null)
      {
         throw new RuntimeException("bla");
      }

      if (ctx.op.getType() == DOTParser.INC)
         return memory.put(id, new Value(value.getType(),
               value.asDouble() + 1));
      else
         return memory.put(id, new Value(value.getType(),
               value.asDouble() - 1));
   }

   @Override
   public Value visitNeqExpr(NeqExprContext ctx)
   {
      Value l = this.visit(ctx.expression(0));
      Value r = this.visit(ctx.expression(1));
      return new Value(Value.Type.BOOLEAN, l.asBoolean() != r.asBoolean());
   }

   @Override
   public Value visitEqExpr(EqExprContext ctx)
   {
      Value l = this.visit(ctx.expression(0));
      Value r = this.visit(ctx.expression(1));
      return new Value(Value.Type.BOOLEAN, l.asBoolean() == r.asBoolean());
   }

   @Override
   public Value visitMulDivExpr(MulDivExprContext ctx)
   {
      Value l = visit(ctx.expression(0));
      Value r = visit(ctx.expression(1));
      if (ctx.op.getType() == DOTParser.MULT)
         return new Value(Value.Type.DOUBLE, l.asDouble() * r.asDouble());
      return new Value(Value.Type.DOUBLE, l.asDouble() / r.asDouble());
   }

   @Override
   public Value visitAddSubExpr(AddSubExprContext ctx)
   {
      Value l = visit(ctx.expression(0));
      Value r = visit(ctx.expression(1));
      if (ctx.op.getType() == DOTParser.PLUS)
         return new Value(Value.Type.DOUBLE, l.asDouble() + r.asDouble());
      return new Value(Value.Type.DOUBLE, l.asDouble() - r.asDouble());
   }

   @Override
   public Value visitForStat(ForStatContext ctx)
   {
      Value v = visit(ctx.forControl());

      while (v.asBoolean())
      {
         visit(ctx.statement());
         v = visit(ctx.forControl());
      }

      printMem("for");

      return Value.VOID;
   }

   @Override
   public Value visitForControl(ForControlContext ctx)
   {
      boolean condition = true;
      String id = ctx.IDENTIFIER().getText();
      if (!memory.containsKey(id))
         memory.put(
               id,
               new Value(Value.Type.INT, Integer
                     .valueOf(ctx.INT(0).getText())));
      else
      {
         Value n = memory.get(id);
         Integer r = Integer.valueOf(ctx.INT(1).getText());
         condition = n.asDouble() < r;
         if (condition)
            memory.put(id, new Value(Value.Type.INT, (int) n.asDouble() + 1));
      }
      return new Value(Value.Type.BOOLEAN, condition);
   }

   @Override
   public Value visitIfElseStat(IfElseStatContext ctx)
   {
      Value v = visit(ctx.parStat());
      if (v.asBoolean())
      {
         visit(ctx.statement(0));
      }
      else
      {
         if (ctx.statement(1) != null)
         {
            visit(ctx.statement(1));
         }
      }
      return Value.VOID;
   }

   @Override
   public Value visitGraph(GraphContext ctx)
   {
      if (!(ctx.id() == null))
      {
         String id = ctx.id().getText();

         StringBuilder buf = new StringBuilder();
         if(ctx.strict != null)
         {
             buf.append(ctx.strict.getText());
             buf.append(" ");
         }
         buf.append(ctx.g.getText());
         buf.append(" ");
         buf.append(id);
         buf.append(" {");
         System.out.println();
         buf.append(ctx.stmt_list().getText());
         buf.append("}");

         memory.put(id, new Value(Value.Type.GRAPH, buf.toString()));

         // new Demo12().doDemo(buf.toString());
      }
      return Value.VOID;
   }

   @Override
   public Value visitUncover(UncoverContext ctx)
   {
      for (int i = 0; i < ctx.IDENTIFIER().size(); i++)
      {
         String id = ctx.IDENTIFIER(i).getText();
         Value v = memory.get(id);

         if (v == null)
         {
            throw new RuntimeException("Graph " + id + " unbekannt");
         }

         try
         {
            File file = new File(id + ".dot");
            FileOutputStream fileOutputStream;
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(v.asGraph().getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
         }
         catch (FileNotFoundException e1)
         {
            // TODO Auto-generated catch block
            e1.printStackTrace();
         }
         catch (IOException e)
         {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      return Value.VOID;
   }

   @Override
   public Value visitMerge(MergeContext ctx)
   {
      String id = ctx.id().getText();
      StringBuilder buf = new StringBuilder();
      buf.append("digraph " + id + " {");
      for (int i = 0; i < ctx.IDENTIFIER().size(); i++)
      {
         Value v = memory.get(ctx.IDENTIFIER(i).getText());
         System.out.println(v.asGraph());
         //TODO: alles auserhalb der {} ausschneiden
         buf.append(v.asGraph());
      }
      buf.append("}");
      memory.put(id, new Value(Value.Type.GRAPH, buf.toString() ));
      return Value.VOID;
   }

   @Override
   public Value visitPrint(PrintContext ctx)
   {
      String id = ctx.IDENTIFIER().getText();
      Value value = memory.get(id);
      if (value == null)
      {
         throw new RuntimeException("no such variable: " + id);
      }

      switch (value.getType())
      {
         case INT:
            System.out.println(value.asInt());
            break;
         case DOUBLE:
            System.out.println(value.asDouble());
            break;
         case STRING:
            System.out.println(value.asString());
            break;
         case GRAPH:
            System.out.println(value.asGraph());
            break;
         default:
            break;
      }
      return Value.VOID;
   }

   private void printMem(String a)
   {
      System.out.println(a);
      for (String s : memory.keySet())
      {
         System.out.println("key: " + s + " value: " + memory.get(s));
      }
   }

}
