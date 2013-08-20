package de.compilerbau.dot;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class DOTErrorListener extends BaseErrorListener
{

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
	    Object offendingSymbol, int line, int charPositionInLine,
	    String msg, RecognitionException e)
    {
	System.err.println("Zeile "+line+":"+charPositionInLine+": " + msg);
    }

}
