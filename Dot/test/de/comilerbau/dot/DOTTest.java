package de.comilerbau.dot;

import junit.framework.Assert;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Before;
import org.junit.Test;

import de.compilerbau.dot.DOTErrorListener;
import de.compilerbau.dot.DOTErrorStrategy;
import de.compilerbau.dot.DOTLexer;
import de.compilerbau.dot.DOTParser;
import de.compilerbau.dot.MyVisitor_orig;
import de.compilerbau.dot.Value;

public class DOTTest
{
    @Before
    public void setUp() throws Exception
    {
    }

    @Test(expected = RuntimeException.class)
    public void testMissingSemicolon1()
    {
	String grammar = "int i";
	testGrammar(grammar);
    }
    
    @Test(expected = RuntimeException.class)
    public void testMissingSemicolon2()
    {
	String grammar = "int i = 1";
	testGrammar(grammar);
    }

    private void testGrammar(String grammar)
    {
	DOTLexer lexer = new DOTLexer(new ANTLRInputStream(grammar));
	lexer.addErrorListener(new DOTErrorListener());
	DOTParser parser = new DOTParser(new CommonTokenStream(lexer));
	parser.removeErrorListeners();
	parser.addErrorListener(new DOTErrorListener());
	parser.setErrorHandler(new DOTErrorStrategy());
	ParseTree tree = parser.s();
	MyVisitor_orig visitor = new MyVisitor_orig(parser);
	Value v = visitor.visit(tree);
    }
}
