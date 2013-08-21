package de.compilerbau.dot.error;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

/**
 * Gibt die Fehlermeldungen (von ANTLR oder von uns geworfen) unter Angabe der
 * Zeile, Position und einer weiteren Fehlermeldung auf der System-Konsole aus.
 */
public class DOTErrorListener extends BaseErrorListener
{
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
	    Object offendingSymbol, int line, int charPositionInLine,
	    String msg, RecognitionException e)
    {
	System.err.println("Zeile " + line + ":" + charPositionInLine + " ["
		+ ((Token) offendingSymbol).getText() + "]: " + msg);
    }

}
