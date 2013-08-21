package de.compilerbau.dot;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import de.compilerbau.dot.error.DOTErrorListener;
import de.compilerbau.dot.error.DOTErrorStrategy;
import de.compilerbau.dot.gui.Gui;
import de.compilerbau.dot.gui.JFrameShower;

/**
 * Hauptklasse
 */
public class Main
{

    /**
     * TODO Add method comment here
     * 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
    {
	// Programmaufruf ohne Parameter, gibt eine Meldung aus, wie das
	// Programm aufgerufen werden muss
	if (args.length == 0)
	{
	    System.out.println("Proper Usage is: dotcompiler.jar -gui");
	    System.out.println("or: dotcompiler.jar expr.txt");
	    System.exit(0);
	}
	// Starten des Compilers mit Benutzeroberfläche
	else if (args[0].equals("-gui"))
	{
	    new JFrameShower(new Gui());
	}
	else
	{
	    // Starten des Compilers von der Konsole
	    DOTLexer lexer = new DOTLexer(new ANTLRFileStream(args[0]));
	    lexer.addErrorListener(new DOTErrorListener());
	    DOTParser parser = new DOTParser(new CommonTokenStream(lexer));
	    parser.removeErrorListeners();
	    parser.addErrorListener(new DOTErrorListener());
	    parser.setErrorHandler(new DOTErrorStrategy());
	    ParseTree tree = parser.s();
	    MyVisitor visitor = new MyVisitor(parser);
	    visitor.visit(tree);
	}

    }
}
