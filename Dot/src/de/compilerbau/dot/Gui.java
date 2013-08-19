/**
 * 
 */
package de.compilerbau.dot;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;

/**
 * TODO Add comment here
 *
 * @author $Author:  $
 * @version $Revision:  $, $Date:  $ UTC
 */
public class Gui extends JFrame
{
   /** TODO Add comment for <code>serialVersionUID</code> */
   private static final long serialVersionUID = -4617001557053665649L;
   
   private JButton btnCompile;
   private JTextPane editor;
   private JTextPane console;
   private JTabbedPane tabbedPane;

   public Gui()
   {
      editor = new JTextPane();
      console = new JTextPane();
      tabbedPane = new JTabbedPane();
      btnCompile = new JButton("Compile");
      
      setSize(1024, 800);
      setTitle("Dot Compiler");
      
      JScrollPane jspEditor = new JScrollPane(editor);
      JScrollPane jspConsole = new JScrollPane(console);
      JScrollPane jspTap = new JScrollPane(tabbedPane);
      
      setLayout(new BorderLayout());
      
      JPanel westPanel = new JPanel(new GridLayout(2, 1));
      
      JPanel editorPanel = new JPanel(new GridLayout(2, 1));
      editorPanel.setBorder(BorderFactory.createTitledBorder("Editor"));    
      editorPanel.add(jspEditor);
      editorPanel.add(btnCompile);
      
      JPanel consolePanel = new JPanel(new BorderLayout());
      consolePanel.setBorder(BorderFactory.createTitledBorder("Console"));    
      consolePanel.add(jspConsole);
      westPanel.add(editorPanel);
      westPanel.add(consolePanel);
      westPanel.setPreferredSize(new Dimension(500, 600));
      add(westPanel, BorderLayout.WEST);
      
      Icon icon = new ImageIcon("output.png");
      JLabel lbl = new JLabel(icon);
      JComponent panel1 = lbl;
      tabbedPane.addTab("Tab 1", null, panel1,
            "Does nothing");
      tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);  
      
      JComponent panel2 = makeTextPanel("Panel #2");
      tabbedPane.addTab("Tab 2", null, panel2,
              "Does twice as much nothing");
      tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
       
      JComponent panel3 = makeTextPanel("Panel #3");
      tabbedPane.addTab("Tab 3", null, panel3,
              "Still does nothing");
      tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
      
      add(jspTap, BorderLayout.CENTER);
   }
   protected JComponent makeTextPanel(String text) {
      JPanel panel = new JPanel(false);
      JLabel filler = new JLabel(text);
      filler.setHorizontalAlignment(JLabel.CENTER);
      panel.setLayout(new GridLayout(1, 1));
      panel.add(filler);
      return panel;
  }
}
