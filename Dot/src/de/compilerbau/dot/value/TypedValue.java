package de.compilerbau.dot.value;

/**
 * Interface f�r die einzelnen Typen der Sprache.
 * 
 * @param <T> Java-Typ, der intern f�r den Typen der Sprache verwendet wird.
 */
public interface TypedValue<T>
{
    /**
     * Typen, die f�r Quellsprache genutzt werden
     */
    public enum Type
    {
	VOID, INT, DOUBLE, STRING, GRAPH, INVALID, BOOLEAN, ARRAY
    }

    /**
     * Gibt den Wert zur�ck.
     * 
     * @return Wert
     */
    public T getValue();

    /**
     * Gibt den Typ zur�ck.
     * 
     * @return Typ
     */
    public Type getType();
}
