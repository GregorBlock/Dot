package de.compilerbau.dot;

import java.util.ArrayList;

public class BaseTypedValue<T> implements TypedValue<T>
{
    public static final Object VOID = new Object();

    private T value;
    protected Type type;

    public BaseTypedValue(T value)
    {
	this.value = value;
    }

    @Override
    public T getValue()
    {
	return value;
    }

    @Override
    public de.compilerbau.dot.TypedValue.Type getType()
    {
	return type;
    }

    public static class IntValue extends BaseTypedValue<Integer>
    {
	public IntValue()
	{
	    this(0);
	}
	
	public IntValue(Integer value)
	{
	    super(value);
	    type = Type.INT;
	}
    }

    public static class StringValue extends BaseTypedValue<String>
    {
	public StringValue()
	{
	    this("");
	}
	
	public StringValue(String value)
	{
	    super(value);
	    type = Type.STRING;
	}
    }
    
    public static class DoubleValue extends BaseTypedValue<Double>
    {
	public DoubleValue()
	{
	    this(0.0);
	}
	
	public DoubleValue(Double value)
	{
	    super(value);
	    type = Type.DOUBLE;
	}
    }
    
    public static class GraphValue extends BaseTypedValue<String>
    {
	public GraphValue()
	{
	    this("");
	}
	
	public GraphValue(String value)
	{
	    super(value);
	    type = Type.GRAPH;
	}
    }
    
    public static class VoidValue extends BaseTypedValue<Object>
    {
	public VoidValue()
	{
	    this(new Object());
	}
	
	private VoidValue(Object value)
	{
	    super(value);
	    type = Type.VOID;
	}
    }
    
    public static class InvalidValue extends BaseTypedValue<Object>
    {
	public InvalidValue()
	{
	    this(new Object());
	}
	
	private InvalidValue(Object value)
	{
	    super(value);
	    type = Type.INVALID;
	}
	
    }
    
    public static class ArrayValue extends BaseTypedValue<ArrayList<?>>
    {
	private Type arrayType;
	public ArrayValue(ArrayList<?> value, Type type)
	{
	    super(value);
	    this.type = Type.ARRAY;
	    arrayType = type;
	}
	
	public Type getArrayType()
	{
	    return arrayType;
	}
    }
    
    public static class BooleanValue extends BaseTypedValue<Boolean>
    {
	public BooleanValue()
	{
	    this(true);
	}
	
	public BooleanValue(Boolean value)
	{
	    super(value);
	}
	
    }

}
