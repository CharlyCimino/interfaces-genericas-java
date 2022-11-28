
package ar.charlycimino.ejemplos.interfaces;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        Persona p = new Persona(1234, "Luis", "Gomez");
        Auto a = new Auto("ABC789", "Rojo");
        
        identificar(p);
        identificar(a);
    }
    
    public static void identificar(Identificable objIdentif) {
        System.out.println("Yo soy " + objIdentif.getId());
    }

}
