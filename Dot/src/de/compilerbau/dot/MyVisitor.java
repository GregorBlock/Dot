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
import de.compilerbau.dot.DOTParser.BlockContext;
import de.compilerbau.dot.DOTParser.DeclarationContext;
import de.compilerbau.dot.DOTParser.DoubleAtomContext;
import de.compilerbau.dot.DOTParser.EdgeRHSContext;
import de.compilerbau.dot.DOTParser.Edge_stmtContext;
import de.compilerbau.dot.DOTParser.EdgeopContext;
import de.compilerbau.dot.DOTParser.EqExprContext;
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
import de.compilerbau.dot.DOTParser.Node_idContext;
import de.compilerbau.dot.DOTParser.Node_stmtContext;
import de.compilerbau.dot.DOTParser.OrExprContext;
import de.compilerbau.dot.DOTParser.ParStatContext;
import de.compilerbau.dot.DOTParser.PortContext;
import de.compilerbau.dot.DOTParser.PrimaryContext;
import de.compilerbau.dot.DOTParser.PrimaryExprContext;
import de.compilerbau.dot.DOTParser.PrintContext;
import de.compilerbau.dot.DOTParser.SContext;
import de.compilerbau.dot.DOTParser.StatementContext;
import de.compilerbau.dot.DOTParser.Stmt_listContext;
import de.compilerbau.dot.DOTParser.StringAtomContext;
import de.compilerbau.dot.DOTParser.SubgraphContext;
import de.compilerbau.dot.DOTParser.TypeContext;
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
	return new BaseTypedValue.IntValue(Integer.valueOf(ctx.getText()));
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
	return new BaseTypedValue.StringValue(str);
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
	buf.append("{");
	// TODO ausgabe?
	System.out.println(visit(ctx.stmt_list()).getValue());
	buf.append(ctx.stmt_list().getText());
	buf.append("}");

	if (ctx.id() != null)
	    memory.put(ctx.id().getText(),
		    new GraphValue(buf.toString()));

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
	    // new Demo12().doDemo(v.asGraph());
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
	return new BaseTypedValue.VoidValue();
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
	    System.out.println(ctx.start.getText());
	    if (!checkType(ctx.start.getType(), visit(ctx.expression())
		    .getType()))
	    {
		parser.notifyErrorListeners(ctx.start, "Deklaration: Typ stimmt nicht überein! Erwartet: "
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
	return memory.put(id, new BaseTypedValue.ArrayValue(arrayList));
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
//	String id = ctx.IDENTIFIER().getText();
//	BaseTypedValue<?> value = memory.get(id);
//	if (value == null)
//	{
//	    parser.notifyErrorListeners("Variable '" + id + "' unbekannt!");
//	}

//	System.out.println(value.getValue());
	printMem("asd");

	// switch (value.getType())
	// {
	// case INT:
	// System.out.println(value.asInt());
	// break;
	// case DOUBLE:
	// System.out.println(value.asDouble());
	// break;
	// case STRING:
	// System.out.println(value.asString());
	// break;
	// case GRAPH:
	// System.out.println(value.asGraph());
	// break;
	// default:
	// break;
	// }
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
	System.out.println(l.getValue().get(index));

	return new VoidValue();
    }

    @Override
    public BaseTypedValue<?> visitAddSubExpr(AddSubExprContext ctx)
    {
	BaseTypedValue<?> l = visit(ctx.expression(0));
	BaseTypedValue<?> r = visit(ctx.expression(1));

	// Value l = visit(ctx.expression(0));
	// Value r = visit(ctx.expression(1));
	if (l.getType() != r.getType())
	    parser.notifyErrorListeners("Werte nicht vom selbem Typ! " + "("
		    + l.getType() + " und " + r.getType() + ")");

	if (ctx.op.getType() == DOTParser.PLUS)
	    return createNewWithValue(visit(ctx.expression(0)).getType(),
		    ((Number) l.getValue()).doubleValue() + ((Number) r.getValue()).doubleValue());
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
	return new BooleanValue(((Number) l.getValue()).doubleValue() > ((Number) r.getValue()).doubleValue());
    }

    @Override
    public BaseTypedValue<?> visitGtEqExpr(GtEqExprContext ctx)
    {
	// TODO vllt zuerst prüfen ob int|double und dann mit double rechnen
	BaseTypedValue<?> l = visit(ctx.expression(0));
	BaseTypedValue<?> r = visit(ctx.expression(1));
	return new BooleanValue(((Number) l.getValue()).doubleValue() >= ((Number) r.getValue()).doubleValue());
    }

    @Override
    public BaseTypedValue<?> visitNeqExpr(NeqExprContext ctx)
    {
	// TODO vllt zuerst prüfen ob int|double und dann mit double rechnen
	BaseTypedValue<?> l = visit(ctx.expression(0));
	BaseTypedValue<?> r = visit(ctx.expression(1));
	return new BooleanValue(((Number) l.getValue()).doubleValue() != ((Number) r.getValue()).doubleValue());
    }

    @Override
    public BaseTypedValue<?> visitLtExpr(LtExprContext ctx)
    {
	// TODO vllt zuerst prüfen ob int|double und dann mit double rechnen
	BaseTypedValue<?> l = visit(ctx.expression(0));
	BaseTypedValue<?> r = visit(ctx.expression(1));
	return new BooleanValue(((Number) l.getValue()).doubleValue() < ((Number) r.getValue()).doubleValue());
    }

    @Override
    public BaseTypedValue<?> visitLtEqExpr(LtEqExprContext ctx)
    {
	// TODO vllt zuerst prüfen ob int|double und dann mit double rechnen
	BaseTypedValue<?> l = visit(ctx.expression(0));
	BaseTypedValue<?> r = visit(ctx.expression(1));
	return new BooleanValue(((Number) l.getValue()).doubleValue() <= ((Number) r.getValue()).doubleValue());
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
	    return memory.put(id, createNewWithValue(value.getType(), ((Number) value.getValue()).doubleValue() + 1));
	else
	    return memory.put(id, createNewWithValue(value.getType(), ((Number) value.getValue()).doubleValue() - 1));
    }
    

    @Override
    public BaseTypedValue<?> visitStmt_list(Stmt_listContext ctx)
    {
//	for(int i = 0; i < ctx.stmt().size(); i++)
//	{
//	    BaseTypedValue<?> v = visit(ctx.stmt(i));
//	    System.out.println(v);
//	}
	return new VoidValue();
    }
    
    

    @Override
    public BaseTypedValue<?> visitPort(PortContext ctx)
    {
	// TODO Auto-generated method stub
	return super.visitPort(ctx);
    }

    @Override
    public BaseTypedValue<?> visitAttr_stmt(Attr_stmtContext ctx)
    {
	// TODO Auto-generated method stub
	return super.visitAttr_stmt(ctx);
    }

    @Override
    public BaseTypedValue<?> visitEdgeRHS(EdgeRHSContext ctx)
    {
	// TODO Auto-generated method stub
	return super.visitEdgeRHS(ctx);
    }

    @Override
    public BaseTypedValue<?> visitBlock(BlockContext ctx)
    {
	// TODO Auto-generated method stub
	return super.visitBlock(ctx);
    }

    @Override
    public BaseTypedValue<?> visitType(TypeContext ctx)
    {
	// TODO Auto-generated method stub
	return super.visitType(ctx);
    }

    @Override
    public BaseTypedValue<?> visitNode_id(Node_idContext ctx)
    {
	// TODO Auto-generated method stub
	return super.visitNode_id(ctx);
    }

    @Override
    public BaseTypedValue<?> visitId(IdContext ctx)
    {
	// TODO Auto-generated method stub
	return super.visitId(ctx);
    }

    @Override
    public BaseTypedValue<?> visitA_list(A_listContext ctx)
    {
	// TODO Auto-generated method stub
	return super.visitA_list(ctx);
    }

    @Override
    public BaseTypedValue<?> visitPrimary(PrimaryContext ctx)
    {
	// TODO Auto-generated method stub
	return super.visitPrimary(ctx);
    }

    @Override
    public BaseTypedValue<?> visitEdge_stmt(Edge_stmtContext ctx)
    {
	// TODO Auto-generated method stub
	return super.visitEdge_stmt(ctx);
    }

    @Override
    public BaseTypedValue<?> visitPrimaryExpr(PrimaryExprContext ctx)
    {
	// TODO Auto-generated method stub
	return super.visitPrimaryExpr(ctx);
    }

    @Override
    public BaseTypedValue<?> visitEqExpr(EqExprContext ctx)
    {
	// TODO Auto-generated method stub
	return super.visitEqExpr(ctx);
    }

    @Override
    public BaseTypedValue<?> visitEdgeop(EdgeopContext ctx)
    {
	// TODO Auto-generated method stub
	return super.visitEdgeop(ctx);
    }
//
//    @Override
//    public BaseTypedValue<?> visitStmt(StmtContext ctx)
//    {
//	return ctx.;
//    }

    @Override
    public BaseTypedValue<?> visitStatement(StatementContext ctx)
    {
	// TODO Auto-generated method stub
	return super.visitStatement(ctx);
    }

    @Override
    public BaseTypedValue<?> visitSubgraph(SubgraphContext ctx)
    {
	// TODO Auto-generated method stub
	return super.visitSubgraph(ctx);
    }

    @Override
    public BaseTypedValue<?> visitS(SContext ctx)
    {
	// TODO Auto-generated method stub
	return super.visitS(ctx);
    }

    @Override
    public BaseTypedValue<?> visitAttr_list(Attr_listContext ctx)
    {
	// TODO Auto-generated method stub
	return super.visitAttr_list(ctx);
    }

    @Override
    public BaseTypedValue<?> visitNode_stmt(Node_stmtContext ctx)
    {
	// TODO Auto-generated method stub
	return super.visitNode_stmt(ctx);
    }

    private BaseTypedValue<?> createNewWithValue(Type type, Object value)
    {
	switch (type)
	{
	    case INT:
		return new IntValue(((Number) value).intValue());
	    case DOUBLE:
		// if (value == Value.Type.INT)
		// return true;
		return new DoubleValue((Double) value);
	    case STRING:
		return new StringValue((String) value);
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
		// if (value == Value.Type.INT)
		// return true;
		return new DoubleValue();
	    case DOTParser.STRING:
		return new StringValue();
	    default:
		return new InvalidValue();
	}
    }

    private BaseTypedValue<?> createNewWithValue(int type, Object value)
    {
	System.out.println(type);
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
            System.out.println("key: " + s + " value: " + memory.get(s).getValue() + " type: " + memory.get(s).getType());
        }
    }

}
