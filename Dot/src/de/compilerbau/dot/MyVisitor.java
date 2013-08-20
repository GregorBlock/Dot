package de.compilerbau.dot;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import de.compilerbau.dot.BaseTypedValue.ArrayValue;
import de.compilerbau.dot.BaseTypedValue.BooleanValue;
import de.compilerbau.dot.BaseTypedValue.DoubleValue;
import de.compilerbau.dot.BaseTypedValue.GraphValue;
import de.compilerbau.dot.BaseTypedValue.IntValue;
import de.compilerbau.dot.BaseTypedValue.InvalidValue;
import de.compilerbau.dot.BaseTypedValue.StringValue;
import de.compilerbau.dot.BaseTypedValue.VoidValue;
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
import de.compilerbau.dot.DOTParser.UncoverContext;
import de.compilerbau.dot.DOTParser.WhileStatContext;
import de.compilerbau.dot.TypedValue.Type;
import de.compilerbau.dot.util.IOManager;

public class MyVisitor extends DOTBaseVisitor<BaseTypedValue<?>>
{
    private Map<String, BaseTypedValue<?>> memory = new HashMap<String, BaseTypedValue<?>>();
    private DOTParser parser;

    public MyVisitor(DOTParser parser)
    {
	this.parser = parser;
    }

    @Override
    public BaseTypedValue<?> visitIntAtom(IntAtomContext ctx)
    {
	return new IntValue(Integer.valueOf(ctx.getText()));
    }

    @Override
    public BaseTypedValue<?> visitIdAtom(IdAtomContext ctx)
    {
	String id = ctx.IDENTIFIER().getText();
	BaseTypedValue<?> value = memory.get(id);
	if (value == null)
	{
	    parser.notifyErrorListeners(ctx.IDENTIFIER().getSymbol(),
		    "Variable '" + id + "' unbekannt!", null);
	}
	return value;
    }

    @Override
    public BaseTypedValue<?> visitStringAtom(StringAtomContext ctx)
    {
	String str = ctx.getText();
	str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
	return new StringValue(str);
    }

    @Override
    public BaseTypedValue<?> visitDoubleAtom(DoubleAtomContext ctx)
    {
	return new DoubleValue(Double.valueOf(ctx.getText()));
    }

    @Override
    public BaseTypedValue<?> visitGraph(GraphContext ctx)
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
	buf.append("{\n");
	buf.append(((GraphValue) visit(ctx.stmt_list())).getValue());
	buf.append("\n}");

	if (ctx.id() != null)
	    memory.put(ctx.id().getText(), new GraphValue(buf.toString()));

	return new VoidValue();
    }

    @Override
    public BaseTypedValue<?> visitUncover(UncoverContext ctx)
    {
	for (int i = 0; i < ctx.IDENTIFIER().size(); i++)
	{
	    String id = ctx.IDENTIFIER(i).getText();
	    GraphValue v = (GraphValue) memory.get(id);

	    if (v == null)
	    {
		parser.notifyErrorListeners("Graph '" + id + "' unbekannt!");
	    }
	    try
	    {
		IOManager.saveGraph(v.getValue(), id);

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
	return new VoidValue();
    }

    @Override
    public BaseTypedValue<?> visitMerge(MergeContext ctx)
    {
	String id = ctx.id().getText();
	StringBuilder buf = new StringBuilder();
	buf.append("digraph " + id + " {");
	for (int i = 0; i < ctx.IDENTIFIER().size(); i++)
	{
	    GraphValue v = (GraphValue) memory.get(ctx.IDENTIFIER(i).getText());
	    buf.append(v.getValue().substring(v.getValue().indexOf("{") + 1,
		    v.getValue().indexOf("}")));
	}
	buf.append("}");
	memory.put(id, new GraphValue(buf.toString()));
	return new VoidValue();
    }

    @Override
    public BaseTypedValue<?> visitAssignment(AssignmentContext ctx)
    {
	String id = ctx.IDENTIFIER().getText();
	BaseTypedValue<?> value = memory.get(id);
	if (value == null)
	{
	    parser.notifyErrorListeners(ctx.IDENTIFIER().getSymbol(),
		    "Variable " + id + " unbekannt!", null);
	}
	else if (visit(ctx.expression()).getType() != value.getType())
	{
	    parser.notifyErrorListeners(
		    ctx.expression().start,
		    "Fehler bei Zuweisung! Typen stimmen nicht überein! Erwartet: "
			    + value.getType() + " - Erhalten: "
			    + visit(ctx.expression()).getType(), null);
	}

	return memory.put(id, visit(ctx.expression()));
    }

    @Override
    public BaseTypedValue<?> visitDeclaration(DeclarationContext ctx)
    {
	String id = ctx.IDENTIFIER().getText();

	if (memory.containsKey(id))
	{
	    parser.notifyErrorListeners("Variable " + id
		    + " bereits deklariert!");
	}
	// throw new RuntimeException("Duplicate local variable " + id);

	BaseTypedValue<?> value;
	if (ctx.expression() != null)
	{
	    if (!checkType(ctx.start.getType(), visit(ctx.expression())
		    .getType()))
	    {
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
	    value = createNew(ctx.start.getType());
	}
	return memory.put(id, value);
    }

    @Override
    public BaseTypedValue<?> visitArraydecl(ArraydeclContext ctx)
    {
	String id = ctx.IDENTIFIER().getText();

	ArrayList<BaseTypedValue<?>> arrayList = new ArrayList<BaseTypedValue<?>>();
	for (int i = 0; i < ctx.values().size(); i++)
	{
	    BaseTypedValue<?> v = visit(ctx.values(i));
	    if (!checkType(ctx.start.getType(), v.getType()))
	    {
		parser.notifyErrorListeners("Wertetypen stimmen nicht mit dem Arraytyp überein!");
	    }
	    arrayList.add(v);
	}
	return memory.put(id, new ArrayValue(arrayList, setType(ctx.start.getType())));
    }

    @Override
    public BaseTypedValue<?> visitWhileStat(WhileStatContext ctx)
    {
	BooleanValue v = (BooleanValue) visit(ctx.parStat());
	while (v.getValue())
	{
	    visit(ctx.statement());

	    v = (BooleanValue) visit(ctx.parStat());
	}
	return new BaseTypedValue.VoidValue();
    }

    @Override
    public BaseTypedValue<?> visitForStat(ForStatContext ctx)
    {
	BooleanValue v = (BooleanValue) visit(ctx.forControl());

	while (v.getValue())
	{
	    visit(ctx.statement());
	    v = (BooleanValue) visit(ctx.forControl());
	}

	return new BaseTypedValue.VoidValue();
    }

    @Override
    public BaseTypedValue<?> visitForControl(ForControlContext ctx)
    {
	boolean condition = true;
	String id = ctx.IDENTIFIER().getText();
	if (!memory.containsKey(id))
	    memory.put(id, new IntValue(Integer.valueOf(ctx.INT(0).getText())));
	else
	{
	    IntValue n = (IntValue) memory.get(id);
	    Integer r = Integer.valueOf(ctx.INT(1).getText());
	    condition = n.getValue() < r;
	    if (condition)
		memory.put(id, new IntValue(n.getValue() + 1));
	}
	return new BooleanValue(condition);
    }

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

    @Override
    public BaseTypedValue<?> visitPrint(PrintContext ctx)
    {
	 BaseTypedValue<?> value = visit(ctx.expression());
System.out.println(value.getType());
	switch (value.getType())
	{
	    case INT:
		System.out.println(((IntValue)value).getValue());
		break;
	    case DOUBLE:
		System.out.println(((DoubleValue)value).getValue());
		break;
	    case STRING:
		System.out.println(((StringValue)value).getValue());
		break;
	    case GRAPH:
		System.out.println(((GraphValue)value).getValue());
		break;
//	    case ARRAY:
//		System.out.println(((ArrayValue)visit(ctx.expression())).getValue());
	    default:
		break;
	}
	return new VoidValue();
    }

    @Override
    public BaseTypedValue<?> visitParStat(ParStatContext ctx)
    {
	return visit(ctx.expression());
    }

    @Override
    public BaseTypedValue<?> visitArrayExpr(ArrayExprContext ctx)
    {
	ArrayValue l = (ArrayValue) visit(ctx.expression(0));
	IntValue r = (IntValue) visit(ctx.expression(1));

	if (l == null)
	    parser.notifyErrorListeners("Variable " + ctx.start.getText()
		    + " unbekannt!");

	if (r == null)
	    parser.notifyErrorListeners("Variable "
		    + ctx.expression(1).getText() + " unbekannt!");

	int index = r.getValue();

	if (index < 0)
	    parser.notifyErrorListeners("Arrayindex ist negativ!");

	if (index > l.getValue().size())
	    parser.notifyErrorListeners("Arrayindex ist zu groß! Arraygroeße: "
		    + l.getValue().size() + " Index: " + index);

	// TODO ausgabe entfernen?
	System.out.println(l.getArrayType());
	
	return createNewWithValue(l.getArrayType(), l.getValue().get(index));
    }

    @Override
    public BaseTypedValue<?> visitAddSubExpr(AddSubExprContext ctx)
    {
	// TODO prüfen auf String -> fehler
	BaseTypedValue<?> l = visit(ctx.expression(0));
	BaseTypedValue<?> r = visit(ctx.expression(1));

	// Value l = visit(ctx.expression(0));
	// Value r = visit(ctx.expression(1));
	if (l.getType() != r.getType())
	    parser.notifyErrorListeners("Werte nicht vom selbem Typ! " + "("
		    + l.getType() + " und " + r.getType() + ")");

	if (ctx.op.getType() == DOTParser.PLUS)
	    return createNewWithValue(
		    visit(ctx.expression(0)).getType(),
		    ((Number) l.getValue()).doubleValue()
			    + ((Number) r.getValue()).doubleValue());
	return createNewWithValue(visit(ctx.expression(0)).getType(),
		(Double) l.getValue() - (Double) r.getValue());
    }

    @Override
    public BaseTypedValue<?> visitMulDivExpr(MulDivExprContext ctx)
    {
	// TODO vllt zuerst prüfen ob int|double und dann mit double rechnen
	// TODO prüfen auf 0 -> 1/0
	BaseTypedValue<?> l = visit(ctx.expression(0));
	BaseTypedValue<?> r = visit(ctx.expression(1));
	if (ctx.op.getType() == DOTParser.MULT)
	    return createNewWithValue(ctx.expression(0).start.getType(),
		    (Double) l.getValue() * (Double) r.getValue());
	return createNewWithValue(ctx.expression(0).start.getType(),
		(Double) l.getValue() / (Double) r.getValue());
    }

    @Override
    public BaseTypedValue<?> visitAndExpr(AndExprContext ctx)
    {
	// TODO prüfen auf typ`?
	BooleanValue l = (BooleanValue) visit(ctx.expression(0));
	BooleanValue r = (BooleanValue) visit(ctx.expression(1));
	return new BooleanValue(l.getValue() && r.getValue());
    }

    @Override
    public BaseTypedValue<?> visitOrExpr(OrExprContext ctx)
    {
	// TODO prüfen auf typ`?
	BooleanValue l = (BooleanValue) visit(ctx.expression(0));
	BooleanValue r = (BooleanValue) visit(ctx.expression(1));
	return new BooleanValue(l.getValue() || r.getValue());
    }

    @Override
    public BaseTypedValue<?> visitGtExpr(GtExprContext ctx)
    {
	// TODO vllt zuerst prüfen ob int|double und dann mit double rechnen
	BaseTypedValue<?> l = visit(ctx.expression(0));
	BaseTypedValue<?> r = visit(ctx.expression(1));
	return new BooleanValue(
		((Number) l.getValue()).doubleValue() > ((Number) r.getValue())
			.doubleValue());
    }

    @Override
    public BaseTypedValue<?> visitGtEqExpr(GtEqExprContext ctx)
    {
	// TODO vllt zuerst prüfen ob int|double und dann mit double rechnen
	BaseTypedValue<?> l = visit(ctx.expression(0));
	BaseTypedValue<?> r = visit(ctx.expression(1));
	return new BooleanValue(
		((Number) l.getValue()).doubleValue() >= ((Number) r.getValue())
			.doubleValue());
    }

    @Override
    public BaseTypedValue<?> visitNeqExpr(NeqExprContext ctx)
    {
	// TODO vllt zuerst prüfen ob int|double und dann mit double rechnen
	BaseTypedValue<?> l = visit(ctx.expression(0));
	BaseTypedValue<?> r = visit(ctx.expression(1));
	return new BooleanValue(
		((Number) l.getValue()).doubleValue() != ((Number) r.getValue())
			.doubleValue());
    }

    @Override
    public BaseTypedValue<?> visitLtExpr(LtExprContext ctx)
    {
	// TODO vllt zuerst prüfen ob int|double und dann mit double rechnen
	BaseTypedValue<?> l = visit(ctx.expression(0));
	BaseTypedValue<?> r = visit(ctx.expression(1));
	return new BooleanValue(
		((Number) l.getValue()).doubleValue() < ((Number) r.getValue())
			.doubleValue());
    }

    @Override
    public BaseTypedValue<?> visitLtEqExpr(LtEqExprContext ctx)
    {
	// TODO vllt zuerst prüfen ob int|double und dann mit double rechnen
	BaseTypedValue<?> l = visit(ctx.expression(0));
	BaseTypedValue<?> r = visit(ctx.expression(1));
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
		    return (IntValue)value;
		else
		    return new IntValue(((Number)value).intValue());
	    case DOUBLE:
		if (value instanceof DoubleValue)
		    return (DoubleValue)value;
		else
		    return new DoubleValue(((Number)value).doubleValue());
	    case STRING:
		return new StringValue(((StringValue)value).getValue());
//	    case ARRAY:
//		return new ArrayValue((ArrayList)value, type);
	    default:
		return new InvalidValue();
	}
    }

    private BaseTypedValue<?> createNew(int type)
    {
	switch (type)
	{
	    case DOTParser.INT:
		return new IntValue();
	    case DOTParser.DOUBLE:
		return new DoubleValue();
	    case DOTParser.STRING:
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

    private void printMem(String a)
    {
	System.out.println(a);
	for (String s : memory.keySet())
	{
	    System.out.println("key: " + s + " value: "
		    + memory.get(s).getValue() + " type: "
		    + memory.get(s).getType());
	}
    }

}
