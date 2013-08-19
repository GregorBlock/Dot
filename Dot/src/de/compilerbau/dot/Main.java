package de.compilerbau.dot;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import de.compilerbau.dot.gui.Gui;
import de.compilerbau.dot.gui.JFrameShower;

import att.grappa.GrappaConstants;

/**
 * TODO Add comment here
 * 
 * @author $Author: $
 * @version $Revision: $, $Date: $ UTC
 */
public class Main implements GrappaConstants
{

   /**
    * TODO Add method comment here
    * 
    * @param args
    * @throws IOException
    */
   public static void main(String[] args) throws IOException
   {
      // Check how many arguments were passed in
      if (args.length == 0)
      {
         System.out.println("Proper Usage is: dotcompiler.jar -gui");
         System.out.println("or: dotcompiler.jar expr.txt");
         System.exit(0);
      }
      else if (args[0].equals("-gui"))
      {
         new JFrameShower(new Gui());
      }
      else
      {
         DOTLexer lexer = new DOTLexer(new ANTLRFileStream(
               args[0]));
//         DOTLexer lexer = new DOTLexer(new ANTLRFileStream(
//               "src\\de\\compilerbau\\dot\\t.expr"));
         DOTParser parser = new DOTParser(new CommonTokenStream(lexer));
         ParseTree tree = parser.s();
         System.out.println(tree.toStringTree(parser));
         MyVisitor visitor = new MyVisitor();
         visitor.visit(tree);
      }

   }
}
