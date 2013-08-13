package de.compilerbau.dot;

import java.util.HashMap;
import java.util.Map;

import de.compilerbau.dot.DOTParser.VariableDeclaratorContext;
import de.compilerbau.dot.DOTParser.VariableInitializerContext;

public class MyVisitor extends DOTBaseVisitor<Value>
{

   private Map<String, Value> memory = new HashMap<String, Value>();
   
   @Override
   public Value visitVariableDeclarator(VariableDeclaratorContext ctx)
   {
      String id = ctx.variableDeclaratorId().getText();
      memory.put(id, this.visit(ctx.variableInitializer()));
      System.out.println(memory.get(id).asString());
      return super.visitVariableDeclarator(ctx);
   }

   @Override
   public Value visitVariableInitializer(VariableInitializerContext ctx)
   {
      Value value = new Value(ctx.getText());
      return value;
   }
   
}
