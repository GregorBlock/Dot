package de.compilerbau.dot;

import java.util.ArrayList;

public class Value
{
    public enum Type
    {
	VOID, INT, DOUBLE, STRING, BOOLEAN
    }

    public static Integer DEFAULT_INT_VALUE = 0;
    public static Double DEFAULT_DOUBLE_VALUE = 0.0;
    public static String DEFAULT_STRING_VALUE = "";
    public static Boolean DEFAULT_BOOLEAN_VALUE = true;

    public static Value VOID = new Value(Type.VOID);

    private Object value;
    private Type type;

    public Value(Type type)
    {
	this.type = type;
	switch (type)
	{
	    case VOID:
		value = new Object();
		break;
	    case INT:
		value = DEFAULT_INT_VALUE;
		break;
	    case DOUBLE:
		value = DEFAULT_DOUBLE_VALUE;
		break;
	    case STRING:
		value = DEFAULT_STRING_VALUE;
	}
    }

    public Value(Type type, Object value)
    {
	this.type = type;
	this.value = value;
    }

    public ArrayList<Integer> asIntArray()
    {
	return (ArrayList<Integer>) value;
    }

    public Boolean asBoolean()
    {
	return (Boolean) value;
    }

    public double asDouble()
    {
	return ((Number) value).doubleValue();
    }

    public String asString()
    {
	return String.valueOf(value);
    }

    public boolean isDouble()
    {
	return value instanceof Double;
    }

    public Type getType()
    {
	return type;
    }

    @Override
    public int hashCode()
    {

	if (value == null)
	{
	    return 0;
	}

	return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o)
    {

	if (value == o)
	{
	    return true;
	}

	if (value == null || o == null || o.getClass() != value.getClass())
	{
	    return false;
	}

	Value that = (Value) o;

	return this.value.equals(that.value);
    }

    @Override
    public String toString()
    {

	return String.valueOf(value) + " " + type;
    }
}
