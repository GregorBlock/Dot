package de.compilerbau.dot;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.IntervalSet;

public class DOTErrorStrategy extends DefaultErrorStrategy
{
    @Override
    protected void reportMissingToken(Parser recognizer)
    {
	Token current = recognizer.getCurrentToken();
	IntervalSet expected = getExpectedTokens(recognizer);
	String msg = "Fehlendes " + expected.toString(recognizer.getTokenNames()) + "bei " + getTokenErrorDisplay(current);
	recognizer.notifyErrorListeners(current, msg,  null);

//	throw new RuntimeException(msg);
    }

    @Override
    public void reportError(Parser recognizer, RecognitionException e)
    {
//	System.out.println("reportError");
//	throw new RuntimeException(e);
    }

    @Override
    protected void reportInputMismatch(Parser recognizer,
	    InputMismatchException e)
    {
	Token current = recognizer.getCurrentToken();
	IntervalSet expected = getExpectedTokens(recognizer);
	String msg = "Unerwarteter Token " + expected.toString(recognizer.getTokenNames()) + "bei " + getTokenErrorDisplay(current);
	recognizer.notifyErrorListeners(current, msg,  null);
	System.out.println("reportInputMismatch");
    }

    @Override
    protected void reportNoViableAlternative(Parser arg0,
	    NoViableAltException arg1)
    {
	Token current = arg0.getCurrentToken();
	IntervalSet expected = getExpectedTokens(arg0);
	String msg = "Unerwarteter Token " + expected.toString(arg0.getTokenNames()) + "bei " + getTokenErrorDisplay(current);
	arg0.notifyErrorListeners(current, msg,  null);
	System.out.println("reportNoViableAlternative");
    }

    @Override
    protected void reportFailedPredicate(Parser recognizer,
	    FailedPredicateException e)
    {
	System.out.println("reportFailedPredicate");
    }

    @Override
    protected void reportUnwantedToken(Parser recognizer)
    {
	Token current = recognizer.getCurrentToken();
	IntervalSet expected = getExpectedTokens(recognizer);
	String msg = "Unerwarteter Token " + expected.toString(recognizer.getTokenNames()) + " bei " + getTokenErrorDisplay(current);
	recognizer.notifyErrorListeners(current, msg,  null);
	System.out.println("reportUnwantedToken");
	super.reportUnwantedToken(recognizer);
    }
    
    

}
