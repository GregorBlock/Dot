/**
 * 
 */
package de.compilerbau.dot.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import de.compilerbau.dot.DOTLexer;
import de.compilerbau.dot.DOTParser;
import de.compilerbau.dot.MyVisitor;
import de.compilerbau.dot.error.DOTErrorListener;
import de.compilerbau.dot.error.DOTErrorStrategy;
import de.compilerbau.dot.gui.console.MessageConsole;
import de.compilerbau.dot.util.IOManager;

/**
 * Benutzeroberfläche des Compilers.
 */
public class Gui extends JFrame
{
    private static final long serialVersionUID = -4617001557053665649L;

    private JTabbedPane tabbedPane;

    public Gui()
    {
	setTitle("Dot Compiler");
	setSize(1224, 800);
	setLayout(new BorderLayout());

	final JTextPane editor = new JTextPane();
	editor.setFont(new Font(null, Font.PLAIN, 16));
	// TODO löschen, bevor ausliefern
	editor.setText("digraph g { A->B; } uncover(g);");
	final JTextPane console = new JTextPane();
	console.setEditable(false);

	// MessageConsole leitet alle Ausgaben in die JTextPane um
	MessageConsole mc = new MessageConsole(console);
	mc.redirectOut();
	mc.redirectErr();

	tabbedPane = new JTabbedPane();
	JButton btnCompile = new JButton("Compile");
	btnCompile.setSize(200, 50);

	JPanel btnPanel = new JPanel();
	btnPanel.add(btnCompile);
	btnCompile.addActionListener(new ActionListener()
	{

	    @Override
	    public void actionPerformed(ActionEvent arg0)
	    {
		IOManager.deleteFiles();
		String code = editor.getText();
		console.setText(" ");

		// Parsen des Quelltextes
		DOTLexer lexer = new DOTLexer(new ANTLRInputStream(code));
		lexer.addErrorListener(new DOTErrorListener());
		DOTParser parser = new DOTParser(new CommonTokenStream(lexer));
		parser.removeErrorListeners();
		parser.addErrorListener(new DOTErrorListener());
		parser.setErrorHandler(new DOTErrorStrategy());
		ParseTree tree = parser.s();
		MyVisitor visitor = new MyVisitor(parser);
		visitor.visit(tree);

		// Tabs erstellen
		createTabs(IOManager.load(IOManager.IMAGE_PATH));
	    }

	});

	JScrollPane jspEditor = new JScrollPane(editor);
	JScrollPane jspConsole = new JScrollPane(console);
	JScrollPane jspTap = new JScrollPane(tabbedPane);


	JPanel westPanel = new JPanel(new GridLayout(2, 1));

	// Panel für das Textfeld, in den der Quelltext geschrieben wird
	JPanel editorPanel = new JPanel(new BorderLayout());
	editorPanel.setBorder(BorderFactory.createTitledBorder("Editor"));
	editorPanel.add(jspEditor, BorderLayout.CENTER);
	editorPanel.add(btnPanel, BorderLayout.SOUTH);

	// Panel für die Konsole mit allen Ausgaben
	JPanel consolePanel = new JPanel(new BorderLayout());
	consolePanel.setBorder(BorderFactory.createTitledBorder("Console"));
	consolePanel.add(jspConsole);
	
	westPanel.add(editorPanel);
	westPanel.add(consolePanel);
	westPanel.setPreferredSize(new Dimension(500, 600));
	
	// Panels hinzufügen
	add(westPanel, BorderLayout.WEST);
	add(jspTap, BorderLayout.CENTER);
    }

    /**
     * Erstellt neue Tabs mit dem Graphen als Inhalt.
     * 
     * @param files Bilddateien, die als Inhalt in den Tabs gesetzt werden.
     */
    private void createTabs(ArrayList<File> files)
    {
	// Entfernt alle vorher erstellten Tabs
	tabbedPane.removeAll();

	// Tabs mit Inhalt erstellen
	for (int i = 0; i < files.size(); i++)
	{
	    Icon icon = new ImageIcon(files.get(i).getPath());
	    JLabel lbl = new JLabel(icon);

	    tabbedPane.addTab(files.get(i).getName(), lbl);
	}
    }

}
