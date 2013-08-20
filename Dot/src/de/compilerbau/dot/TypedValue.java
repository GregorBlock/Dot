package de.compilerbau.dot;

public interface TypedValue<T>
{
    public enum Type {
	      VOID, INT, DOUBLE, STRING, GRAPH, INVALID, BOOLEAN
	   }
    
    public T getValue();
    public Type getType();
}

