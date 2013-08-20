package de.compilerbau.dot;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.RecognitionException;

import de.compilerbau.dot.DOTBaseVisitor;
import de.compilerbau.dot.DOTParser;
import de.compilerbau.dot.DOTParser.AddSubExprContext;
import de.compilerbau.dot.DOTParser.AndExprContext;
import de.compilerbau.dot.DOTParser.ArrayExprContext;
import de.compilerbau.dot.DOTParser.ArraydeclContext;
import de.compilerbau.dot.DOTParser.AssignmentContext;
import de.compilerbau.dot.DOTParser.DeclarationContext;
import de.compilerbau.dot.DOTParser.DoubleAtomContext;
import de.compilerbau.dot.DOTParser.EqExprContext;
import de.compilerbau.dot.DOTParser.ForControlContext;
import de.compilerbau.dot.DOTParser.ForStatContext;
import de.compilerbau.dot.DOTParser.GraphContext;
import de.compilerbau.dot.DOTParser.GtEqExprContext;
import de.compilerbau.dot.DOTParser.GtExprContext;
import de.compilerbau.dot.DOTParser.IdAtomContext;
import de.compilerbau.dot.DOTParser.IfElseStatContext;
import de.compilerbau.dot.DOTParser.IncDecExprContext;
import de.compilerbau.dot.DOTParser.IntAtomContext;
import de.compilerbau.dot.DOTParser.LtEqExprContext;
import de.compilerbau.dot.DOTParser.LtExprContext;
import de.compilerbau.dot.DOTParser.MergeContext;
import de.compilerbau.dot.DOTParser.MulDivExprContext;
import de.compilerbau.dot.DOTParser.NeqExprContext;
import de.compilerbau.dot.DOTParser.ParStatContext;
import de.compilerbau.dot.DOTParser.PrintContext;
import de.compilerbau.dot.DOTParser.StringAtomContext;
import de.compilerbau.dot.DOTParser.UncoverContext;
import de.compilerbau.dot.DOTParser.WhileStatContext;
import de.compilerbau.dot.Value.Type;
import de.compilerbau.dot.util.IOManager;

public class MyVisitor_orig extends DOTBaseVisitor<Value>
{

    private Map<String, Value> memory = new HashMap<String, Value>();
    private DOTParser parser;

    public MyVisitor_orig(DOTParser parser)
    {
	this.parser = parser;
    }

    @Override
    public Value visitStringAtom(StringAtomContext ctx)
    {
	String str = ctx.getText();
	str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
	return new Value(Value.Type.STRING, str);
    }

    @Override
    public Value visitDoubleAtom(DoubleAtomContext ctx)
    {
	return new Value(Value.Type.DOUBLE, Double.valueOf(ctx.getText()));
    }

    @Override
    public Value visitIntAtom(IntAtomContext ctx)
    {
	return new Value(Value.Type.INT, Integer.valueOf(ctx.getText()));
    }

    @Override
    public Value visitDeclaration(DeclarationContext ctx)
    {
	String id = ctx.IDENTIFIER().getText();

	if (memory.containsKey(id))
	{
	    parser.notifyErrorListeners("Variable " + id
		    + " bereits deklariert!");
	}
	// throw new RuntimeException("Duplicate local variable " + id);

	Value value;
	if (ctx.expression() != null)
	{
	    if (!checkType(ctx.start.getType(), visit(ctx.expression())
		    .getType()))
	    {
		parser.notifyErrorListeners("Typ stimmt nicht �berein! Erwartet: "
			+ setType(ctx.start.getType())
			+ " - Erhalten: "
			+ visit(ctx.expression()).getType());
	    }
	    value = new Value(setType(ctx.start.getType()), visit(
		    ctx.expression()).asString());
	}
	else
	{
	    value = new Value(setType(ctx.start.getType()));
	}
	return memory.put(id, value);
    }

    @Override
    public Value visitArraydecl(ArraydeclContext ctx)
    {
	String id = ctx.IDENTIFIER().getText();

	ArrayList<Value> arrayList = new ArrayList<Value>();
	for (int i = 0; i < ctx.values().size(); i++)
	{
	    Value v = visit(ctx.values(i));
	    if (!checkType(ctx.start.getType(), v.getType()))
	    {
		parser.notifyErrorListeners("Wertetypen stimmen nicht mit dem Arraytyp �berein!");
	    }
	    arrayList.add(v);
	}
	return memory.put(id,
		new Value(setType(ctx.start.getType()), arrayList));
    }

    private boolean checkType(int type, Value.Type value)
    {
	switch (type)
	{
	    case DOTParser.INTTYPE:
		return value == Value.Type.INT;
	    case DOTParser.DOUBLETYPE:
		if (value == Value.Type.INT)
		    return true;
		return value == Value.Type.DOUBLE;
	    case DOTParser.STRINGTYPE:
		return value == Value.Type.STRING;
	    default:
		return false;
	}
    }

    private boolean check(int type, Value.Type value)
    {
	switch (value)
	{
	    case INT:
		return type == DOTParser.INT;
	    case DOUBLE:
		return type == DOTParser.DOUBLE;
	    case STRING:
		return type == DOTParser.STRING;
	    default:
		return false;
	}
    }

    private Type setType(int type)
    {
	switch (type)
	{
	    case DOTParser.INTTYPE:
		return Value.Type.INT;
	    case DOTParser.DOUBLETYPE:
		return Value.Type.DOUBLE;
	    case DOTParser.STRINGTYPE:
		return Value.Type.STRING;
	    default:
		return Value.Type.VOID;
	}
    }

    @Override
    public Value visitArrayExpr(ArrayExprContext ctx)
    {
	Value l = visit(ctx.expression(0));
	Value r = visit(ctx.expression(1));

	if (l == null)
	    parser.notifyErrorListeners("Variable " + ctx.start.getText()
		    + " unbekannt!");

	if (r == null)
	    parser.notifyErrorListeners("Variable "
		    + ctx.expression(1).getText() + " unbekannt!");

	int index = r.asInt();

	if (index < 0)
	    parser.notifyErrorListeners("Arrayindex ist negativ!");

	if (index > l.asArray().size())
	    parser.notifyErrorListeners("Arrayindex ist zu gro�! Arraygroe�e: "
		    + l.asArray().size() + " Index: " + index);

	// TODO ausgabe entfernen?
	System.out.println(l.asArray().get(index));

	// TODO warum void? muss nicht wert aus array?
	return Value.VOID;
    }

    @Override
    public Value visitAssignment(AssignmentContext ctx)
    {
	String id = ctx.IDENTIFIER().getText();
	Value value = memory.get(id);
	if (value == null)
	{
	    parser.notifyErrorListeners(ctx.IDENTIFIER().getSymbol(),
		    "Variable " + id + " unbekannt!", null);
	}
	else if (visit(ctx.expression()).getType() != value.getType())
	{
	    parser.notifyErrorListeners(ctx.expression().start,
		    "Fehler bei Zuweisung! Typen stimmen nicht �berein! Erwartet: " + value.getType()
			    + " - Erhalten: "
			    + visit(ctx.expression()).getType(), null);
	}

	return memory.put(id, visit(ctx.expression()));
    }

    @Override
    public Value visitIdAtom(IdAtomContext ctx)
    {
	String id = ctx.IDENTIFIER().getText();
	Value value = memory.get(id);
	if (value == null)
	{
	    parser.notifyErrorListeners(ctx.IDENTIFIER().getSymbol(),
		    "Variable '" + id + "' unbekannt!", null);
	}
	return value;
    }

    @Override
    public Value visitWhileStat(WhileStatContext ctx)
    {
	Value v = visit(ctx.parStat());
	while (v.asBoolean())
	{
	    visit(ctx.statement());

	    v = visit(ctx.parStat());
	}
	return Value.VOID;
    }

    @Override
    public Value visitParStat(ParStatContext ctx)
    {
	return visit(ctx.expression());
    }

    @Override
    public Value visitGtExpr(GtExprContext ctx)
    {
	Value l = visit(ctx.expression(0));
	Value r = visit(ctx.expression(1));
	return new Value(Value.Type.BOOLEAN, l.asDouble() > r.asDouble());
    }

    @Override
    public Value visitLtExpr(LtExprContext ctx)
    {
	Value l = visit(ctx.expression(0));
	Value r = visit(ctx.expression(1));
	Value asd = new Value(Value.Type.BOOLEAN, l.asDouble() < r.asDouble());
	return asd;
    }

    @Override
    public Value visitLtEqExpr(LtEqExprContext ctx)
    {
	Value l = this.visit(ctx.expression(0));
	Value r = this.visit(ctx.expression(1));
	return new Value(Value.Type.BOOLEAN, l.asDouble() <= r.asDouble());
    }

    @Override
    public Value visitAndExpr(AndExprContext ctx)
    {
	Value l = this.visit(ctx.expression(0));
	Value r = this.visit(ctx.expression(1));
	return new Value(Value.Type.BOOLEAN, l.asBoolean() && r.asBoolean());
    }

    @Override
    public Value visitGtEqExpr(GtEqExprContext ctx)
    {
	Value l = this.visit(ctx.expression(0));
	Value r = this.visit(ctx.expression(1));
	return new Value(Value.Type.BOOLEAN, l.asDouble() >= r.asDouble());
    }

    @Override
    public Value visitIncDecExpr(IncDecExprContext ctx)
    {
	String id = ctx.IDENTIFIER().getText();
	Value value = memory.get(id);
	if (value == null)
	{
	    parser.notifyErrorListeners(ctx.IDENTIFIER().getSymbol(),
		    "Variable '" + id + "' unbekannt!", null);
	}

	if (ctx.op.getType() == DOTParser.INC)
	    return memory.put(id, new Value(value.getType(),
		    value.asDouble() + 1));
	else
	    return memory.put(id, new Value(value.getType(),
		    value.asDouble() - 1));
    }

    @Override
    public Value visitNeqExpr(NeqExprContext ctx)
    {
	Value l = this.visit(ctx.expression(0));
	Value r = this.visit(ctx.expression(1));
	return new Value(Value.Type.BOOLEAN, l.asBoolean() != r.asBoolean());
    }

    @Override
    public Value visitEqExpr(EqExprContext ctx)
    {
	Value l = this.visit(ctx.expression(0));
	Value r = this.visit(ctx.expression(1));
	return new Value(Value.Type.BOOLEAN, l.asDouble() == r.asDouble());
    }

    @Override
    public Value visitMulDivExpr(MulDivExprContext ctx)
    {
	Value l = visit(ctx.expression(0));
	Value r = visit(ctx.expression(1));
	if (ctx.op.getType() == DOTParser.MULT)
	    return new Value(Value.Type.DOUBLE, l.asDouble() * r.asDouble());
	return new Value(Value.Type.DOUBLE, l.asDouble() / r.asDouble());
    }

    @Override
    public Value visitAddSubExpr(AddSubExprContext ctx)
    {
	Value l = visit(ctx.expression(0));
	Value r = visit(ctx.expression(1));
	if(l.getType() != r.getType())
	    parser.notifyErrorListeners("Werte nicht vom selbem Typ! " +
	    		"(" + l.getType() + " und " + r.getType() + ")");
	
	if (ctx.op.getType() == DOTParser.PLUS)
	    return new Value(Value.Type.DOUBLE, l.asDouble() + r.asDouble());
	return new Value(Value.Type.DOUBLE, l.asDouble() - r.asDouble());
    }

    @Override
    public Value visitForStat(ForStatContext ctx)
    {
	Value v = visit(ctx.forControl());

	while (v.asBoolean())
	{
	    visit(ctx.statement());
	    v = visit(ctx.forControl());
	}

	return Value.VOID;
    }

    @Override
    public Value visitForControl(ForControlContext ctx)
    {
	boolean condition = true;
	String id = ctx.IDENTIFIER().getText();
	if (!memory.containsKey(id))
	    memory.put(
		    id,
		    new Value(Value.Type.INT, Integer.valueOf(ctx.INT(0)
			    .getText())));
	else
	{
	    Value n = memory.get(id);
	    Integer r = Integer.valueOf(ctx.INT(1).getText());
	    condition = n.asDouble() < r;
	    if (condition)
		memory.put(id,
			new Value(Value.Type.INT, (int) n.asDouble() + 1));
	}
	return new Value(Value.Type.BOOLEAN, condition);
    }

    @Override
    public Value visitIfElseStat(IfElseStatContext ctx)
    {
	Value v = visit(ctx.parStat());
	if (v.asBoolean())
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
	return Value.VOID;
    }

    @Override
    public Value visitGraph(GraphContext ctx)
    {
	StringBuilder buf = new StringBuilder();
	if (ctx.strict != null)
	{
	    buf.append(ctx.strict.getText());
	    buf.append(" ");
	}
	buf.append(ctx.g.getText());
	buf.append(" ");
	if (ctx.id() != null)
	{
	    buf.append(ctx.id().getText());
	    buf.append(" ");
	}
	buf.append("{");
	System.out.println();
	buf.append(ctx.stmt_list().getText());
	buf.append("}");

	if (ctx.id() != null)
	    memory.put(ctx.id().getText(),
		    new Value(Value.Type.GRAPH, buf.toString()));

	return Value.VOID;
    }

    @Override
    public Value visitUncover(UncoverContext ctx)
    {
	for (int i = 0; i < ctx.IDENTIFIER().size(); i++)
	{
	    String id = ctx.IDENTIFIER(i).getText();
	    Value v = memory.get(id);

	    if (v == null)
	    {
		parser.notifyErrorListeners("Graph '" + id + "' unbekannt!");
	    }
	    // new Demo12().doDemo(v.asGraph());
	    try
	    {
		IOManager.saveGraph(v.asGraph(), id);
	    }
	    catch (FileNotFoundException e1)
	    {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	    }
	    catch (IOException e)
	    {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
	return Value.VOID;
    }

    @Override
    public Value visitMerge(MergeContext ctx)
    {
	String id = ctx.id().getText();
	StringBuilder buf = new StringBuilder();
	buf.append("digraph " + id + " {");
	for (int i = 0; i < ctx.IDENTIFIER().size(); i++)
	{
	    Value v = memory.get(ctx.IDENTIFIER(i).getText());
	    buf.append(v.asGraph().substring(v.asGraph().indexOf("{") + 1,
		    v.asGraph().indexOf("}")));
	}
	buf.append("}");
	memory.put(id, new Value(Value.Type.GRAPH, buf.toString()));
	return Value.VOID;
    }

    @Override
    public Value visitPrint(PrintContext ctx)
    {
	String id = ctx.IDENTIFIER().getText();
	Value value = memory.get(id);
	if (value == null)
	{
	    parser.notifyErrorListeners("Variable '" + id + "' unbekannt!");
	}

	switch (value.getType())
	{
	    case INT:
		System.out.println(value.asInt());
		break;
	    case DOUBLE:
		System.out.println(value.asDouble());
		break;
	    case STRING:
		System.out.println(value.asString());
		break;
	    case GRAPH:
		System.out.println(value.asGraph());
		break;
	    default:
		break;
	}
	return Value.VOID;
    }

    private void printMem(String a)
    {
	System.out.println(a);
	for (String s : memory.keySet())
	{
	    System.out.println("key: " + s + " value: " + memory.get(s));
	}
    }

}