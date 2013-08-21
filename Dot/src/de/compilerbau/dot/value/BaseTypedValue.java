package de.compilerbau.dot.value;

import java.util.ArrayList;

/**
 * Basisklasse für die einzelnen Typen der Sprache.
 * 
 * @param <T> Java-Typ, der intern für den Typen der Sprache verwendet wird.
 */
public class BaseTypedValue<T> implements TypedValue<T>
{
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
    public de.compilerbau.dot.value.TypedValue.Type getType()
    {
	return type;
    }

    /**
     * Klasse represäntiert den Typ eines Integeres mit dessen Inhalt.
     */
    public static class IntValue extends BaseTypedValue<Integer>
    {
	/**
	 * Konstruktor mit Standart-Wert
	 */
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

    /**
     * Klasse represäntiert den Typ eines Strings mit dessen Inhalt.
     */
    public static class StringValue extends BaseTypedValue<String>
    {
	/**
	 * Konstruktor mit Standart-Wert
	 */
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

    /**
     * Klasse represäntiert den Typ eines Doubles mit dessen Inhalt.
     */
    public static class DoubleValue extends BaseTypedValue<Double>
    {
	/**
	 * Konstruktor mit Standart-Wert
	 */
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

    /**
     * Klasse represäntiert den Typ eines Graphen mit dessen Inhalt.
     */
    public static class GraphValue extends BaseTypedValue<String>
    {
	/**
	 * Konstruktor mit Standart-Wert
	 */
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

    /**
     * Klasse represäntiert den Typ eines Voids. Void Objekte können keinen
     * Inhalt bekommen.
     */
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

    /**
     * Klasse represäntiert den Typ eines Invalid. Invalids können keinen Inhalt
     * bekommen.
     * Wird genutzt, wenn ein unbekannter Typ verwendet wurde.
     */
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

    /**
     * Klasse represäntiert den Typ eines Arrays mit dessen Inhalt. Das Array an
     * sich (welches dem Inhalt entspricht) besitzt ebenfalls einen bestimmten
     * Typ aus der Quellsprache. Arrays besitzen keinen Standartwert, sonder
     * müssen immer mit Inhalt gefüllt werden.
     * 
     */
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

    /**
     * Klasse represäntiert den Typ eines Boolean mit dessen Inhalt.
     */
    public static class BooleanValue extends BaseTypedValue<Boolean>
    {
	/**
	 * Konstruktor mit Standart-Wert
	 */
	public BooleanValue()
	{
	    this(true);
	}

	public BooleanValue(Boolean value)
	{
	    super(value);
	    type = Type.BOOLEAN;
	}

    }

}
