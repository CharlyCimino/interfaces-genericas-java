
package ar.charlycimino.ejemplos.interfaces;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public interface Identificable<T> {
    public abstract T getId();
    public abstract void setId(T x);
}
