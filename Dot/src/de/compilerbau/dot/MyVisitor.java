package de.compilerbau.dot;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import de.compilerbau.dot.DOTParser.A_listContext;
import de.compilerbau.dot.DOTParser.AddSubExprContext;
import de.compilerbau.dot.DOTParser.AndExprContext;
import de.compilerbau.dot.DOTParser.ArrayExprContext;
import de.compilerbau.dot.DOTParser.ArraydeclContext;
import de.compilerbau.dot.DOTParser.AssignmentContext;
import de.compilerbau.dot.DOTParser.Attr_listContext;
import de.compilerbau.dot.DOTParser.Attr_stmtContext;
import de.compilerbau.dot.DOTParser.DeclarationContext;
import de.compilerbau.dot.DOTParser.DoubleAtomContext;
import de.compilerbau.dot.DOTParser.EdgeRHSContext;
import de.compilerbau.dot.DOTParser.Edge_stmtContext;
import de.compilerbau.dot.DOTParser.EdgeopContext;
import de.compilerbau.dot.DOTParser.EqExprContext;
import de.compilerbau.dot.DOTParser.FalseAtomContext;
import de.compilerbau.dot.DOTParser.ForControlContext;
import de.compilerbau.dot.DOTParser.ForStatContext;
import de.compilerbau.dot.DOTParser.GraphContext;
import de.compilerbau.dot.DOTParser.GtEqExprContext;
import de.compilerbau.dot.DOTParser.GtExprContext;
import de.compilerbau.dot.DOTParser.IdAtomContext;
import de.compilerbau.dot.DOTParser.IdContext;
import de.compilerbau.dot.DOTParser.IfElseStatContext;
import de.compilerbau.dot.DOTParser.IncDecExprContext;
import de.compilerbau.dot.DOTParser.IntAtomContext;
import de.compilerbau.dot.DOTParser.LtEqExprContext;
import de.compilerbau.dot.DOTParser.LtExprContext;
import de.compilerbau.dot.DOTParser.MergeContext;
import de.compilerbau.dot.DOTParser.MulDivExprContext;
import de.compilerbau.dot.DOTParser.NeqExprContext;
import de.compilerbau.dot.DOTParser.Node_stmtContext;
import de.compilerbau.dot.DOTParser.OrExprContext;
import de.compilerbau.dot.DOTParser.ParStatContext;
import de.compilerbau.dot.DOTParser.PrintContext;
import de.compilerbau.dot.DOTParser.Stmt_listContext;
import de.compilerbau.dot.DOTParser.StringAtomContext;
import de.compilerbau.dot.DOTParser.SubgraphContext;
import de.compilerbau.dot.DOTParser.TrueAtomContext;
import de.compilerbau.dot.DOTParser.UncoverContext;
import de.compilerbau.dot.DOTParser.WhileStatContext;
import de.compilerbau.dot.util.IOManager;
import de.compilerbau.dot.value.BaseTypedValue;
import de.compilerbau.dot.value.BaseTypedValue.ArrayValue;
import de.compilerbau.dot.value.BaseTypedValue.BooleanValue;
import de.compilerbau.dot.value.BaseTypedValue.DoubleValue;
import de.compilerbau.dot.value.BaseTypedValue.GraphValue;
import de.compilerbau.dot.value.BaseTypedValue.IntValue;
import de.compilerbau.dot.value.BaseTypedValue.InvalidValue;
import de.compilerbau.dot.value.BaseTypedValue.StringValue;
import de.compilerbau.dot.value.BaseTypedValue.VoidValue;
import de.compilerbau.dot.value.TypedValue.Type;

/**
 * Visitorklasse traversiert durch den Baum. Durch den Visitor wird eine höhere
 * Kontrolle erreicht, da man selber die Aufrufe steuern kann.
 */
public class MyVisitor extends DOTBaseVisitor<BaseTypedValue<?>>
{
    // Speicher, in dem alle Identifier mit Wert gesichert werden
    private Map<String, BaseTypedValue<?>> memory = new HashMap<String, BaseTypedValue<?>>();

    // Parser, wird benötigt, um die Fehlermeldungen auszugeben
    private DOTParser parser;

    public MyVisitor(DOTParser parser)
    {
	this.parser = parser;
    }

    /**
     * Liefert ein neues Integer-Objekt.
     */
    @Override
    public BaseTypedValue<?> visitIntAtom(IntAtomContext ctx)
    {
	return new IntValue(Integer.valueOf(ctx.getText()));
    }

    /**
     * Liefert die Variable zum Identifier. Wirft einen Fehler, falls keine
     * Variable vorhanden ist.
     */
    @Override
    public BaseTypedValue<?> visitIdAtom(IdAtomContext ctx)
    {
	String id = ctx.IDENTIFIER().getText();
	BaseTypedValue<?> value = memory.get(id);

	// Variable nicht vorhanden, Fehler werfen
	if (value == null)
	{
	    parser.notifyErrorListeners(ctx.IDENTIFIER().getSymbol(),
		    "Variable '" + id + "' unbekannt!", null);
	}
	return value;
    }

    /**
     * Liefert ein neues String-Objekt.
     */
    @Override
    public BaseTypedValue<?> visitStringAtom(StringAtomContext ctx)
    {
	String str = ctx.getText();
	// Anführungszeichen aus dem Token entfernen
	str = str.substring(1, str.length() - 1).replace("\"\"", "\"");

	return new StringValue(str);
    }

    /**
     * Liefert ein neues Double-Objekt.
     */
    @Override
    public BaseTypedValue<?> visitDoubleAtom(DoubleAtomContext ctx)
    {
	return new DoubleValue(Double.valueOf(ctx.getText()));
    }

    /**
     * Liefert ein neues (false-) Boolean-Objekt
     */
    @Override
    public BaseTypedValue<?> visitFalseAtom(FalseAtomContext ctx)
    {
	return new BooleanValue(false);
    }

    /**
     * Liefert ein neues (true) Boolean-Objekt
     */
    @Override
    public BaseTypedValue<?> visitTrueAtom(TrueAtomContext ctx)
    {
	return new BooleanValue(true);
    }

    /**
     * Baut den Graphen zusammen und speichert diesen im Speicher, solange dem
     * Graphen eine ID angegeben wurde.
     */
    @Override
    public BaseTypedValue<?> visitGraph(GraphContext ctx)
    {
	StringBuilder buf = new StringBuilder();

	// Optionales "strict" anhängen, wenn vorhanden
	if (ctx.strict != null)
	{
	    buf.append(ctx.strict.getText());
	    buf.append(" ");
	}

	buf.append(ctx.g.getText());
	buf.append(" ");

	// Optionale ID anhängen, wenn vorhanden
	if (ctx.id() != null)
	{
	    buf.append(ctx.id().getText());
	    buf.append(" ");
	}
	buf.append("{\n");
	buf.append(((GraphValue) visit(ctx.stmt_list())).getValue());
	buf.append("\n}");

	// Speichern des Graphen nur, wenn eine ID angegeben wurde
	if (ctx.id() != null)
	    memory.put(ctx.id().getText(), new GraphValue(buf.toString()));

	return new VoidValue();
    }

    /**
     * Erstellt .dot-Dateien und die zugehörigen Bilddateien zu den angegebenen
     * Grapen.
     */
    @Override
    public BaseTypedValue<?> visitUncover(UncoverContext ctx)
    {
	for (int i = 0; i < ctx.IDENTIFIER().size(); i++)
	{
	    String id = ctx.IDENTIFIER(i).getText();
	    // Graph aus dem Speicher holen
	    GraphValue v = (GraphValue) memory.get(id);

	    // Fehler werfen, wenn es den Graphen mit dem Namen nicht gibt
	    if (v == null)
	    {
		parser.notifyErrorListeners("Graph '" + id + "' unbekannt!");
	    }
	    try
	    {
		// Speichern des Grapen
		IOManager.saveGraph(v.getValue(), id);
	    }
	    catch (IOException e)
	    {
		throw new RuntimeException("Fehler beim Speichern des Graphen",
			e);
	    }
	}
	return new VoidValue();
    }

    /**
     * Fügt zwei oder mehrere Graphen zusammen. Bislang nur für gerichtete
     * Graphen!
     */
    @Override
    public BaseTypedValue<?> visitMerge(MergeContext ctx)
    {
	String id = ctx.id().getText();
	StringBuilder buf = new StringBuilder();

	// Zusammen fügen der Graphen
	buf.append("digraph " + id + " {");
	for (int i = 0; i < ctx.IDENTIFIER().size(); i++)
	{
	    GraphValue v = (GraphValue) memory.get(ctx.IDENTIFIER(i).getText());
	    buf.append(v.getValue().substring(v.getValue().indexOf("{") + 1,
		    v.getValue().lastIndexOf("}")));
	}
	buf.append("}");
	memory.put(id, new GraphValue(buf.toString()));

	return new VoidValue();
    }

    /**
     * Weist einer Variable einen Wert zu.
     */
    @Override
    public BaseTypedValue<?> visitAssignment(AssignmentContext ctx)
    {
	String id = ctx.IDENTIFIER().getText();
	BaseTypedValue<?> value = memory.get(id);

	if (value == null)
	{
	    // Variable nicht vorhanden, Fehler werden
	    parser.notifyErrorListeners(ctx.IDENTIFIER().getSymbol(),
		    "Variable " + id + " unbekannt!", null);
	}
	else if (visit(ctx.expression()).getType() != value.getType())
	{
	    // Variablen haben nicht den selben Typ, Fehler werfen
	    parser.notifyErrorListeners(
		    ctx.expression().start,
		    "Fehler bei Zuweisung! Typen stimmen nicht überein! Erwartet: "
			    + value.getType() + " - Erhalten: "
			    + visit(ctx.expression()).getType(), null);
	}

	return memory.put(id, visit(ctx.expression()));
    }

    /**
     * Deklariert eine neue Variable und speichert diese in den Speicher.
     * Optional: Zuweisung eines Wertes.
     */
    @Override
    public BaseTypedValue<?> visitDeclaration(DeclarationContext ctx)
    {
	String id = ctx.IDENTIFIER().getText();

	if (memory.containsKey(id))
	{
	    // Variable bereits vorhande, Fehler werfen
	    parser.notifyErrorListeners("Variable " + id
		    + " bereits deklariert!");
	}

	BaseTypedValue<?> value;
	// Optionale Zuweisung
	if (ctx.expression() != null)
	{
	    if (!checkType(ctx.start.getType(), visit(ctx.expression())
		    .getType()))
	    {
		// Typ der Variable und Typ des zuzuweisenden Wertes stimmen
		// nicht überein, Fehler werfen
		parser.notifyErrorListeners(ctx.start,
			"Deklaration: Typ stimmt nicht überein! Erwartet: "
				+ setType(ctx.start.getType())
				+ " - Erhalten: "
				+ visit(ctx.expression()).getType(), null);
	    }
	    value = visit(ctx.expression());
	}
	else
	{
	    // Neues Objekt erstellen mit Standartwerten
	    value = createNew(setType(ctx.start.getType()));
	}
	return memory.put(id, value);
    }

    /**
     * Deklaration eines Arrays.
     */
    @Override
    public BaseTypedValue<?> visitArraydecl(ArraydeclContext ctx)
    {
	String id = ctx.IDENTIFIER().getText();

	ArrayList<BaseTypedValue<?>> arrayList = new ArrayList<BaseTypedValue<?>>();

	// Prüfen, ob die Typen der Werte auch den selben Typ haben, wie das
	// Array selbst.
	for (int i = 0; i < ctx.values().size(); i++)
	{
	    BaseTypedValue<?> v = visit(ctx.values(i));
	    if (!checkType(ctx.start.getType(), v.getType()))
	    {
		// Fehler werfen, wenn nicht
		parser.notifyErrorListeners("Wertetypen stimmen nicht mit dem Arraytyp überein!");
	    }
	    arrayList.add(v);
	}

	return memory.put(id,
		new ArrayValue(arrayList, setType(ctx.start.getType())));
    }

    /**
     * Führt eine While-Schleife aus
     */
    @Override
    public BaseTypedValue<?> visitWhileStat(WhileStatContext ctx)
    {
	// Holen der Bedingung
	BooleanValue v = (BooleanValue) visit(ctx.parStat());

	while (v.getValue())
	{
	    // ausführen des While-Rumpfes
	    visit(ctx.statement());

	    // Bedingung überprüfen
	    v = (BooleanValue) visit(ctx.parStat());
	}
	return new BaseTypedValue.VoidValue();
    }

    /**
     * Ausführung einer For-Schleife.
     */
    @Override
    public BaseTypedValue<?> visitForStat(ForStatContext ctx)
    {
	// Holen der Bedingung
	BooleanValue v = (BooleanValue) visit(ctx.forControl());

	while (v.getValue())
	{
	    // ausführen des For-Rumpfes
	    visit(ctx.statement());

	    // Bedingung überprüfen
	    v = (BooleanValue) visit(ctx.forControl());
	}

	return new BaseTypedValue.VoidValue();
    }

    /**
     * Berrechnet die Bedingung für eine For-Schleife
     */
    @Override
    public BaseTypedValue<?> visitForControl(ForControlContext ctx)
    {
	boolean condition = true;
	String id = ctx.IDENTIFIER().getText();

	// Beim ersten Durchgang einer For-Schleife, wird die Variable mit dem
	// Wert in den Speicher geschrieben.
	if (!memory.containsKey(id))
	    memory.put(id, new IntValue(Integer.valueOf(ctx.INT(0).getText())));
	else
	{
	    // Bei allen weiteren Durchgängen wird die Variable aus dem Speicher
	    // gelesen
	    IntValue n = (IntValue) memory.get(id);
	    Integer r = Integer.valueOf(ctx.INT(1).getText());

	    // Bedingung berechnen
	    condition = n.getValue() < r;

	    // Wert aktualisieren, wenn die For-Schleife weiter ausgeführt
	    // werden muss
	    if (condition)
		memory.put(id, new IntValue(n.getValue() + 1));
	}
	return new BooleanValue(condition);
    }

    /**
     * Ausführung einer If-Abfrage mit optionalem Else-Zweig
     */
    @Override
    public BaseTypedValue<?> visitIfElseStat(IfElseStatContext ctx)
    {
	BooleanValue v = (BooleanValue) visit(ctx.parStat());
	if (v.getValue())
	{
	    visit(ctx.statement(0));
	}
	else
	{
	    if (ctx.statement(1) != null)
	    {
		visit(ctx.statement(1));
	    }
	}
	return new VoidValue();
    }

    /**
     * Ausführung einer Print-Anweisung
     */
    @Override
    public BaseTypedValue<?> visitPrint(PrintContext ctx)
    {
	BaseTypedValue<?> value = visit(ctx.expression());

	switch (value.getType())
	{
	    case INT:
		System.out.println(((IntValue) value).getValue());
		break;
	    case DOUBLE:
		System.out.println(((DoubleValue) value).getValue());
		break;
	    case STRING:
		System.out.println(((StringValue) value).getValue());
		break;
	    case GRAPH:
		System.out.println(((GraphValue) value).getValue());
		break;
	    case BOOLEAN:
		System.out.println(((BooleanValue) value).getValue());
	    default:
		break;
	}
	return new VoidValue();
    }

    /**
     * Führt eine in Klammern gesetzte Expression aus.
     */
    @Override
    public BaseTypedValue<?> visitParStat(ParStatContext ctx)
    {
	return visit(ctx.expression()); // Gibt den Wert der Kinder zurück.
    }

    /**
     * Gibt den Wert in einem Array an einer bestimmten Indexposition zurück.
     */
    @Override
    public BaseTypedValue<?> visitArrayExpr(ArrayExprContext ctx)
    {
	ArrayValue l = (ArrayValue) visit(ctx.expression(0));
	BaseTypedValue<?> r = visit(ctx.expression(1));

	// Array nicht deklariert
	if (l == null)
	    parser.notifyErrorListeners("Variable " + ctx.start.getText()
		    + " unbekannt!");

	if (r == null)
	    parser.notifyErrorListeners("Variable "
		    + ctx.expression(1).getText() + " unbekannt!");
	
	if (!(r instanceof IntValue))
	{
	    parser.notifyErrorListeners("Indexvariable " + ctx.expression(1).getText()
		    + " darf nur ein Integer sein!");
	    
	    return new InvalidValue();
	}

	int index = ((IntValue) r).getValue();

	if (index < 0)
	    parser.notifyErrorListeners("Arrayindex ist negativ!");

	if (index > l.getValue().size())
	    parser.notifyErrorListeners("Arrayindex ist zu groß! Arraygroeße: "
		    + l.getValue().size() + " Index: " + index);

	return createNewWithValue(l.getArrayType(), l.getValue().get(index));
    }

    @Override
    public BaseTypedValue<?> visitAddSubExpr(AddSubExprContext ctx)
    {
	BaseTypedValue<?> l = visit(ctx.expression(0));
	BaseTypedValue<?> r = visit(ctx.expression(1));

	if (l.getType() == Type.STRING)
	    parser.notifyErrorListeners(ctx.expression(0).start,
		    "Strings können nicht addiert/subtrahiert werden!", null);
	if (r.getType() == Type.STRING)
	    parser.notifyErrorListeners(ctx.expression(1).start,
		    "Strings können nicht addiert/subtrahiert werden!", null);

	if (l.getType() == Type.BOOLEAN)
	    parser.notifyErrorListeners(ctx.expression(0).start,
		    "Boolean können nicht addiert/subtrahiert werden!", null);
	if (r.getType() == Type.BOOLEAN)
	    parser.notifyErrorListeners(ctx.expression(1).start,
		    "Boolean können nicht addiert/subtrahiert werden!", null);

	if (l.getType() != r.getType())
	    parser.notifyErrorListeners("Werte nicht vom selbem Typ! " + "("
		    + l.getType() + " und " + r.getType() + ")");

	if (ctx.op.getType() == DOTParser.PLUS)
	    return createNewWithValue(
		    visit(ctx.expression(0)).getType(),
		    ((Number) l.getValue()).doubleValue()
			    + ((Number) r.getValue()).doubleValue());

	return createNewWithValue(
		visit(ctx.expression(0)).getType(),
		((Number) l.getValue()).doubleValue()
			- ((Number) r.getValue()).doubleValue());
    }

    @Override
    public BaseTypedValue<?> visitMulDivExpr(MulDivExprContext ctx)
    {
	BaseTypedValue<?> l = visit(ctx.expression(0));
	BaseTypedValue<?> r = visit(ctx.expression(1));

	if (l.getType() == Type.STRING)
	    parser.notifyErrorListeners(ctx.expression(0).start,
		    "Strings können nicht multipliziert/dividiert werden!",
		    null);
	if (r.getType() == Type.STRING)
	    parser.notifyErrorListeners(ctx.expression(1).start,
		    "Strings können nicht multipliziert/dividiert werden!",
		    null);

	if (l.getType() == Type.BOOLEAN)
	    parser.notifyErrorListeners(ctx.expression(0).start,
		    "Boolean können nicht multipliziert/dividiert werden!",
		    null);
	if (r.getType() == Type.BOOLEAN)
	    parser.notifyErrorListeners(ctx.expression(1).start,
		    "Boolean können nicht multipliziert/dividiert werden!",
		    null);

	if (ctx.op.getType() == DOTParser.MULT)
	{
	    return createNewWithValue(
		    ctx.expression(0).start.getType(),
		    ((Number) l.getValue()).doubleValue()
			    * ((Number) r.getValue()).doubleValue());
	}

	Number rVal = (Number) r.getValue();
	if (rVal.doubleValue() == 0.0 || rVal.intValue() == 0)
	    parser.notifyErrorListeners("Division durch 0!");

	return createNewWithValue(
		ctx.expression(0).start.getType(),
		((Number) l.getValue()).doubleValue()
			/ ((Number) r.getValue()).doubleValue());
    }

    @Override
    public BaseTypedValue<?> visitAndExpr(AndExprContext ctx)
    {
	if (!(visit(ctx.expression(0)) instanceof BooleanValue))
	    parser.notifyErrorListeners(ctx.expression(0).start,
		    "Kein boolscher Ausdruck!", null);

	if (!(visit(ctx.expression(1)) instanceof BooleanValue))
	    parser.notifyErrorListeners(ctx.expression(1).start,
		    "Kein boolscher Ausdruck!", null);

	BooleanValue l = (BooleanValue) visit(ctx.expression(0));
	BooleanValue r = (BooleanValue) visit(ctx.expression(1));
	return new BooleanValue(l.getValue() && r.getValue());
    }

    @Override
    public BaseTypedValue<?> visitOrExpr(OrExprContext ctx)
    {
	if (!(visit(ctx.expression(0)) instanceof BooleanValue))
	    parser.notifyErrorListeners(ctx.expression(0).start,
		    "Kein boolscher Ausdruck!", null);

	if (!(visit(ctx.expression(1)) instanceof BooleanValue))
	    parser.notifyErrorListeners(ctx.expression(1).start,
		    "Kein boolscher Ausdruck!", null);

	BooleanValue l = (BooleanValue) visit(ctx.expression(0));
	BooleanValue r = (BooleanValue) visit(ctx.expression(1));
	return new BooleanValue(l.getValue() || r.getValue());
    }

    @Override
    public BaseTypedValue<?> visitGtExpr(GtExprContext ctx)
    {
	BaseTypedValue<?> l = visit(ctx.expression(0));
	BaseTypedValue<?> r = visit(ctx.expression(1));

	if (l.getType() == Type.STRING)
	    parser.notifyErrorListeners(ctx.expression(0).start,
		    "Strings können nicht verglichen werden!", null);
	if (r.getType() == Type.STRING)
	    parser.notifyErrorListeners(ctx.expression(1).start,
		    "Strings können nicht verglichen werden!", null);

	if (l.getType() == Type.BOOLEAN)
	    parser.notifyErrorListeners(ctx.expression(0).start,
		    "Boolean können nicht verglichen werden!", null);
	if (r.getType() == Type.BOOLEAN)
	    parser.notifyErrorListeners(ctx.expression(1).start,
		    "Boolean können nicht verglichen werden!", null);

	return new BooleanValue(
		((Number) l.getValue()).doubleValue() > ((Number) r.getValue())
			.doubleValue());
    }

    @Override
    public BaseTypedValue<?> visitGtEqExpr(GtEqExprContext ctx)
    {
	BaseTypedValue<?> l = visit(ctx.expression(0));
	BaseTypedValue<?> r = visit(ctx.expression(1));

	if (l.getType() == Type.STRING)
	    parser.notifyErrorListeners(ctx.expression(0).start,
		    "Strings können nicht verglichen werden!", null);
	if (r.getType() == Type.STRING)
	    parser.notifyErrorListeners(ctx.expression(1).start,
		    "Strings können nicht verglichen werden!", null);

	if (l.getType() == Type.BOOLEAN)
	    parser.notifyErrorListeners(ctx.expression(0).start,
		    "Boolean können nicht verglichen werden!", null);
	if (r.getType() == Type.BOOLEAN)
	    parser.notifyErrorListeners(ctx.expression(1).start,
		    "Boolean können nicht verglichen werden!", null);

	return new BooleanValue(
		((Number) l.getValue()).doubleValue() >= ((Number) r.getValue())
			.doubleValue());
    }

    @Override
    public BaseTypedValue<?> visitEqExpr(EqExprContext ctx)
    {
	BaseTypedValue<?> l = visit(ctx.expression(0));
	BaseTypedValue<?> r = visit(ctx.expression(1));

	if (l.getType() != r.getType())
	    parser.notifyErrorListeners("Vergleich von unterschiedlichen Typen!");

	boolean neq = false;

	switch (l.getType())
	{
	    case INT:
		neq = ((IntValue) l).getValue() == ((IntValue) r).getValue();
		break;
	    case DOUBLE:
		neq = ((DoubleValue) l).getValue() == ((DoubleValue) r)
			.getValue();
		break;
	    case STRING:
		neq = ((StringValue) l).getValue().equals(
			((StringValue) r).getValue());
		break;
	    case BOOLEAN:
		neq = ((BooleanValue) l).getValue() == ((BooleanValue) r)
			.getValue();
		break;
	}

	return new BooleanValue(neq);
    }

    @Override
    public BaseTypedValue<?> visitNeqExpr(NeqExprContext ctx)
    {
	BaseTypedValue<?> l = visit(ctx.expression(0));
	BaseTypedValue<?> r = visit(ctx.expression(1));

	if (l.getType() != r.getType())
	    parser.notifyErrorListeners("Vergleich von unterschiedlichen Typen!");

	boolean neq = false;

	switch (l.getType())
	{
	    case INT:
		neq = ((IntValue) l).getValue() != ((IntValue) r).getValue();
		break;
	    case DOUBLE:
		neq = ((DoubleValue) l).getValue() != ((DoubleValue) r)
			.getValue();
		break;
	    case STRING:
		neq = !((StringValue) l).getValue().equals(
			((StringValue) r).getValue());
		break;
	    case BOOLEAN:
		neq = ((BooleanValue) l).getValue() != ((BooleanValue) r)
			.getValue();
		break;
	}

	return new BooleanValue(neq);
    }

    @Override
    public BaseTypedValue<?> visitLtExpr(LtExprContext ctx)
    {
	BaseTypedValue<?> l = visit(ctx.expression(0));
	BaseTypedValue<?> r = visit(ctx.expression(1));

	if (l.getType() == Type.STRING)
	    parser.notifyErrorListeners(ctx.expression(0).start,
		    "Strings können nicht verglichen werden!", null);
	if (r.getType() == Type.STRING)
	    parser.notifyErrorListeners(ctx.expression(1).start,
		    "Strings können nicht verglichen werden!", null);

	if (l.getType() == Type.BOOLEAN)
	    parser.notifyErrorListeners(ctx.expression(0).start,
		    "Boolean können nicht verglichen werden!", null);
	if (r.getType() == Type.BOOLEAN)
	    parser.notifyErrorListeners(ctx.expression(1).start,
		    "Boolean können nicht verglichen werden!", null);

	return new BooleanValue(
		((Number) l.getValue()).doubleValue() < ((Number) r.getValue())
			.doubleValue());
    }

    @Override
    public BaseTypedValue<?> visitLtEqExpr(LtEqExprContext ctx)
    {
	BaseTypedValue<?> l = visit(ctx.expression(0));
	BaseTypedValue<?> r = visit(ctx.expression(1));

	if (l.getType() == Type.STRING)
	    parser.notifyErrorListeners(ctx.expression(0).start,
		    "Strings können nicht verglichen werden!", null);
	if (r.getType() == Type.STRING)
	    parser.notifyErrorListeners(ctx.expression(1).start,
		    "Strings können nicht verglichen werden!", null);

	if (l.getType() == Type.BOOLEAN)
	    parser.notifyErrorListeners(ctx.expression(0).start,
		    "Boolean können nicht verglichen werden!", null);
	if (r.getType() == Type.BOOLEAN)
	    parser.notifyErrorListeners(ctx.expression(1).start,
		    "Boolean können nicht verglichen werden!", null);

	return new BooleanValue(
		((Number) l.getValue()).doubleValue() <= ((Number) r.getValue())
			.doubleValue());
    }

    @Override
    public BaseTypedValue<?> visitIncDecExpr(IncDecExprContext ctx)
    {
	String id = ctx.IDENTIFIER().getText();
	BaseTypedValue<?> value = memory.get(id);

	if (value == null)
	{
	    parser.notifyErrorListeners(ctx.IDENTIFIER().getSymbol(),
		    "Variable '" + id + "' unbekannt!", null);
	}

	if (ctx.op.getType() == DOTParser.INC)
	    return memory.put(
		    id,
		    createNewWithValue(value.getType(),
			    ((Number) value.getValue()).doubleValue() + 1));
	else
	    return memory.put(
		    id,
		    createNewWithValue(value.getType(),
			    ((Number) value.getValue()).doubleValue() - 1));
    }

    @Override
    public BaseTypedValue<?> visitStmt_list(Stmt_listContext ctx)
    {
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < ctx.stmt().size(); i++)
	{
	    GraphValue v = (GraphValue) visit(ctx.stmt(i));
	    sb.append(v.getValue());
	    if (ctx.SCOL(i) != null)
	    {
		sb.append(ctx.SCOL(i).getText());
		sb.append("\n");
	    }
	}
	return new GraphValue(sb.toString());
    }

    @Override
    public BaseTypedValue<?> visitAttr_stmt(Attr_stmtContext ctx)
    {
	StringBuilder sb = new StringBuilder();
	sb.append(ctx.t.getText());
	sb.append(((GraphValue) visit(ctx.attr_list())).getValue());

	return new GraphValue(sb.toString());
    }

    @Override
    public BaseTypedValue<?> visitEdgeRHS(EdgeRHSContext ctx)
    {
	StringBuilder sb = new StringBuilder();
	sb.append(((GraphValue) visit(ctx.edgeop())).getValue());

	if (ctx.node_id() != null)
	    sb.append(((GraphValue) visit(ctx.node_id())).getValue());
	else if (ctx.subgraph() != null)
	    sb.append(((GraphValue) visit(ctx.subgraph())).getValue());

	for (int i = 0; i < ctx.edgeRHS().size(); i++)
	{
	    sb.append(((GraphValue) visit(ctx.edgeRHS(i))).getValue());
	}

	return new GraphValue(sb.toString());
    }

    @Override
    public BaseTypedValue<?> visitId(IdContext ctx)
    {
	if (ctx.IDENTIFIER() != null
		&& memory.containsKey(ctx.IDENTIFIER().getText()))
	{
	    return memory.get(ctx.IDENTIFIER().getText());

	}
	else
	{
	    return new GraphValue(ctx.i.getText());
	}
    }

    @Override
    public BaseTypedValue<?> visitA_list(A_listContext ctx)
    {
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < ctx.id().size(); i++)
	{
	    switch (visit(ctx.id(i)).getType())
	    {
		case INT:
		    IntValue intV = (IntValue) visit(ctx.id(i));
		    sb.append(intV.getValue());
		    break;
		case DOUBLE:
		    DoubleValue doubleV = (DoubleValue) visit(ctx.id(i));
		    sb.append(doubleV.getValue());
		    break;
		case STRING:
		    StringValue stringV = (StringValue) visit(ctx.id(i));
		    sb.append(stringV.getValue());
		    break;
		case GRAPH:
		    GraphValue graphV = (GraphValue) visit(ctx.id(i));
		    sb.append(graphV.getValue());
		    break;
		default:
		    break;
	    }
	    if (i % 2 == 0)
		sb.append(" = ");
	}

	for (int i = 0; i < ctx.a_list().size(); i++)
	{
	    sb.append(", ");
	    switch (visit(ctx.id(i)).getType())
	    {
		case INT:
		    IntValue intV = (IntValue) visit(ctx.a_list(i));
		    sb.append(intV.getValue());
		    break;
		case DOUBLE:
		    DoubleValue doubleV = (DoubleValue) visit(ctx.a_list(i));
		    sb.append(doubleV.getValue());
		    break;
		case STRING:
		    StringValue stringV = (StringValue) visit(ctx.a_list(i));
		    sb.append(stringV.getValue());
		    break;
		case GRAPH:
		    GraphValue graphV = (GraphValue) visit(ctx.a_list(i));
		    sb.append(graphV.getValue());
		    break;
		default:
		    break;
	    }
	}

	return new GraphValue(sb.toString());
    }

    @Override
    public BaseTypedValue<?> visitEdge_stmt(Edge_stmtContext ctx)
    {
	StringBuilder sb = new StringBuilder();

	if (ctx.node_id() != null)
	    sb.append(((GraphValue) visit(ctx.node_id())).getValue());
	else if (ctx.subgraph() != null)
	    sb.append(((GraphValue) visit(ctx.subgraph())).getValue());

	sb.append(((GraphValue) visit(ctx.edgeRHS())).getValue());

	if (ctx.attr_list() != null)
	    sb.append(((GraphValue) visit(ctx.attr_list())).getValue());

	return new GraphValue(sb.toString());
    }

    @Override
    public BaseTypedValue<?> visitEdgeop(EdgeopContext ctx)
    {
	return new GraphValue(ctx.op.getText());
    }

    @Override
    public BaseTypedValue<?> visitSubgraph(SubgraphContext ctx)
    {
	StringBuilder sb = new StringBuilder();
	if (ctx.SUBGRAPH() != null)
	{
	    sb.append(ctx.SUBGRAPH().getText());
	    if (ctx.id() != null)
		sb.append(((GraphValue) visit(ctx.id())).getValue());
	}

	sb.append(((GraphValue) visit(ctx.stmt_list())).getValue());

	return new GraphValue(sb.toString());
    }

    @Override
    public BaseTypedValue<?> visitAttr_list(Attr_listContext ctx)
    {
	StringBuilder sb = new StringBuilder();
	sb.append("[");
	switch (visit(ctx.a_list()).getType())
	{
	    case INT:
		IntValue intV = (IntValue) visit(ctx.a_list());
		sb.append(intV.getValue());
		break;
	    case DOUBLE:
		DoubleValue doubleV = (DoubleValue) visit(ctx.a_list());
		sb.append(doubleV.getValue());
		break;
	    case STRING:
		StringValue stringV = (StringValue) visit(ctx.a_list());
		sb.append(stringV.getValue());
		break;
	    case GRAPH:
		GraphValue graphV = (GraphValue) visit(ctx.a_list());
		sb.append(graphV.getValue());
		break;
	    default:
		break;
	}
	sb.append("]");

	return new GraphValue(sb.toString());
    }

    @Override
    public BaseTypedValue<?> visitNode_stmt(Node_stmtContext ctx)
    {
	StringBuilder sb = new StringBuilder();
	sb.append(((GraphValue) visit(ctx.node_id())).getValue());
	if (ctx.attr_list() != null)
	    sb.append(((GraphValue) visit(ctx.attr_list())).getValue());

	return new GraphValue(sb.toString());
    }

    private BaseTypedValue<?> createNewWithValue(Type type, Object value)
    {
	switch (type)
	{
	    case INT:
		if (value instanceof IntValue)
		    return (IntValue) value;
		else
		    return new IntValue(((Number) value).intValue());
	    case DOUBLE:
		if (value instanceof DoubleValue)
		    return (DoubleValue) value;
		else
		    return new DoubleValue(((Number) value).doubleValue());
	    case STRING:
		return new StringValue(((StringValue) value).getValue());
	    default:
		return new InvalidValue();
	}
    }

    private BaseTypedValue<?> createNew(Type type)
    {
	switch (type)
	{
	    case INT:
		return new IntValue();
	    case DOUBLE:
		return new DoubleValue();
	    case STRING:
		return new StringValue();
	    default:
		return new InvalidValue();
	}
    }

    private BaseTypedValue<?> createNewWithValue(int type, Object value)
    {
	switch (type)
	{
	    case DOTParser.INT:
		return new IntValue(((Number) value).intValue());
	    case DOTParser.DOUBLE:
		return new DoubleValue((Double) value);
	    case DOTParser.STRING:
		return new StringValue((String) value);
	    default:
		return new InvalidValue();
	}
    }

    private boolean checkType(int type, Type value)
    {
	switch (type)
	{
	    case DOTParser.INTTYPE:
		return value == Type.INT;
	    case DOTParser.DOUBLETYPE:
		return value == Type.DOUBLE;
	    case DOTParser.STRINGTYPE:
		return value == Type.STRING;
	    default:
		return false;
	}
    }

    private Type setType(int type)
    {
	switch (type)
	{
	    case DOTParser.INTTYPE:
		return Type.INT;
	    case DOTParser.DOUBLETYPE:
		return Type.DOUBLE;
	    case DOTParser.STRINGTYPE:
		return Type.STRING;
	    default:
		return Type.VOID;
	}
    }
}
