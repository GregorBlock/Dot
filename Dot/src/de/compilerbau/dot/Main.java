/**
 * 
 */
package de.compilerbau.dot;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * TODO Add comment here
 *
 * @author $Author:  $
 * @version $Revision:  $, $Date:  $ UTC
 */
public class Main
{

   /**
    * TODO Add method comment here
    *
    * @param args
    */
   public static void main(String[] args)
   {
      try
      {
         String inputFile = "src\\de\\compilerbau\\dot\\t.expr"; 
         InputStream is; 
         is = new FileInputStream(inputFile);
         ANTLRInputStream input = new ANTLRInputStream(is); 
         DOTLexer lexer = new DOTLexer(input);
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         DOTParser parser = new DOTParser(tokens);   
         ParseTree t = parser.s();
         
         // System.out.println(t.toStringTree(parser));
         ParseTreeWalker walker = new ParseTreeWalker();
         MyListener listen = new MyListener();
         walker.walk(listen, t);  
//      System.out.println("Ergebnis: "+listen.returnValue()); 
      }
      catch (FileNotFoundException e) 
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      catch (IOException e) 
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

}
