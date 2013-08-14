package de.compilerbau.dot;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

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
       
       DOTLexer lexer = new DOTLexer(new ANTLRFileStream("src\\de\\compilerbau\\dot\\t.expr"));
       DOTParser parser = new DOTParser(new CommonTokenStream(lexer));
       ParseTree tree = parser.s();
       MyVisitor visitor = new MyVisitor();
       visitor.visit(tree);
       
//      try
//      {
//         String inputFile = "src\\de\\compilerbau\\dot\\t.expr";
//         InputStream is = System.in;
//         if ( inputFile!=null ) is = new FileInputStream(inputFile);
//         ANTLRInputStream input = new ANTLRInputStream(is);
//         DOTLexer lexer = new DOTLexer(input); 
//         CommonTokenStream tokens = new CommonTokenStream(lexer);
//         DOTParser parser = new DOTParser(tokens);
//         ParseTree tree = parser.s(); // parse
//
//         MyVisitor myvisitor = new MyVisitor();
//         myvisitor.visit(tree);
//         
//         
//         // System.out.println("Ergebnis: "+listen.returnValue());
//         InputStream input2 = null;
////         new Demo12().doDemo(input2);
//      }
//      catch (FileNotFoundException e)
//      {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//      }
//      catch (IOException e)
//      {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//      }
   }
}
