/**
 * 
 */
package de.compilerbau.dot;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.text.PlainDocument;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * TODO Add comment here
 * 
 * @author $Author: $
 * @version $Revision: $, $Date: $ UTC
 */
public class Gui extends JFrame
{
   /** TODO Add comment for <code>serialVersionUID</code> */
   private static final long serialVersionUID = -4617001557053665649L;

   private JButton btnCompile;

   private JTextPane editor;

   private JTextPane console;

   private JTabbedPane tabbedPane;

   private JMenuBar menuBar;

   private JMenu menu;

   public Gui()
   {
      menuBar = new JMenuBar();
      editor = new JTextPane();
      editor.setText("digraph g { A->B; } uncover(g);");
      console = new JTextPane();
//      console.setEditable(false);
      
//      MessageConsole mc = new MessageConsole(console);
//      mc.redirectOut();
//      mc.redirectErr();
      
      tabbedPane = new JTabbedPane();
      btnCompile = new JButton("Compile");
      btnCompile.setSize(200, 50);

      JPanel btnPanel = new JPanel();
      btnPanel.add(btnCompile);
      btnCompile.addActionListener(new ActionListener()
      {

         @Override
         public void actionPerformed(ActionEvent arg0)
         {
            String code = editor.getText();
            DOTLexer lexer;
            lexer = new DOTLexer(new ANTLRInputStream(code));
            DOTParser parser = new DOTParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.s();
            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);
            
            createTabs(IOManager.load(IOManager.IMAGE_PATH));
         }

      });

      setSize(1024, 800);
      setTitle("Dot Compiler");

      menu = new JMenu("Menu");

      menuBar.add(menu);
      setJMenuBar(menuBar);

      JScrollPane jspEditor = new JScrollPane(editor);
      JScrollPane jspConsole = new JScrollPane(console);
      JScrollPane jspTap = new JScrollPane(tabbedPane);

      setLayout(new BorderLayout());

      JPanel westPanel = new JPanel(new GridLayout(2, 1));

      JPanel editorPanel = new JPanel(new BorderLayout());
      editorPanel.setBorder(BorderFactory.createTitledBorder("Editor"));
      editorPanel.add(jspEditor, BorderLayout.CENTER);
      editorPanel.add(btnPanel, BorderLayout.SOUTH);

      JPanel consolePanel = new JPanel(new BorderLayout());
      consolePanel.setBorder(BorderFactory.createTitledBorder("Console"));
      consolePanel.add(jspConsole);
      westPanel.add(editorPanel);
      westPanel.add(consolePanel);
      westPanel.setPreferredSize(new Dimension(500, 600));
      add(westPanel, BorderLayout.WEST);

      
      add(jspTap, BorderLayout.CENTER);
   }

   private void createTabs(ArrayList<File> files)
   {
      for(int i = 0; i < files.size(); i++)
      {
         Icon icon = new ImageIcon(files.get(i).getPath());
         JLabel lbl = new JLabel(icon);
         
         
         tabbedPane.addTab(files.get(i).getName(), lbl);
      }
   }
   
   protected JComponent makeTextPanel(String text)
   {
      JPanel panel = new JPanel(false);
      JLabel filler = new JLabel(text);
      filler.setHorizontalAlignment(JLabel.CENTER);
      panel.setLayout(new GridLayout(1, 1));
      panel.add(filler);
      return panel;
   }
}
