package de.compilerbau.dot.error;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.IntervalSet;

/**
 * Behandelt die geworfenen Fehler vom Parser. Erstellt die Fehlermeldung mit
 * allen wichtigen Informationen und informiert die ErrorListener, welche die
 * Fehler anschließend ausgeben.
 */
public class DOTErrorStrategy extends DefaultErrorStrategy
{
    @Override
    protected void reportMissingToken(Parser recognizer)
    {
	// Fehlermeldung zusammenstellen
	Token currentToken = recognizer.getCurrentToken();
	IntervalSet expectedToken = getExpectedTokens(recognizer);
	String msg = "Fehlendes "
		+ expectedToken.toString(recognizer.getTokenNames()) + "bei "
		+ getTokenErrorDisplay(currentToken);

	// ErrorListener informieren
	recognizer.notifyErrorListeners(currentToken, msg, null);
    }

    @Override
    public void reportError(Parser recognizer, RecognitionException e)
    {
	// Fehlermeldung zusammenstellen
	Token currentToken = recognizer.getCurrentToken();
	String msg = "Unerwartete Zeichen:" + getTokenErrorDisplay(currentToken);

	// ErrorListener informieren
	recognizer.notifyErrorListeners(currentToken, msg, e);
    }

    @Override
    protected void reportUnwantedToken(Parser recognizer)
    {
	// Fehlermeldung zusammenstellen
	Token currentToken = recognizer.getCurrentToken();
	String msg = "Unerwünschte Zeichenfolge"
		+ getTokenErrorDisplay(currentToken);

	// ErrorListener informieren
	recognizer.notifyErrorListeners(currentToken, msg, null);
    }
}
