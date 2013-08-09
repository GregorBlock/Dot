package de.compilerbau.dot;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import att.grappa.Graph;
import att.grappa.Grappa;
import att.grappa.GrappaAdapter;
import att.grappa.GrappaConstants;
import att.grappa.GrappaPanel;
import att.grappa.GrappaSupport;
import att.grappa.Parser;

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
         
         
         // System.out.println("Ergebnis: "+listen.returnValue());
         InputStream input2 = null;
//         new Demo12().doDemo(input2);
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
