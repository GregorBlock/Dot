package de.compilerbau.dot.value;

/**
 * Interface für die einzelnen Typen der Sprache.
 * 
 * @param <T> Java-Typ, der intern für den Typen der Sprache verwendet wird.
 */
public interface TypedValue<T>
{
    /**
     * Typen, die für Quellsprache genutzt werden
     */
    public enum Type
    {
	VOID, INT, DOUBLE, STRING, GRAPH, INVALID, BOOLEAN, ARRAY
    }

    /**
     * Gibt den Wert zurück.
     * 
     * @return Wert
     */
    public T getValue();

    /**
     * Gibt den Typ zurück.
     * 
     * @return Typ
     */
    public Type getType();
}
