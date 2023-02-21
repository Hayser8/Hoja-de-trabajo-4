/**
 * @author Julio García Salas
 * Tare: Hoja de trabajo 4
 * Archivo: StackFactory.java
 * Fecha: 21/02/2023
 */
public class StackFactory {
    
    /**
     * Este método crea una pila utilizando la implementación especificada por el parámetro tipo.
     *
     * @param tipo una cadena que indica el tipo de pila a crear. Puede ser "1" para ArrayListStack, "2" para VectorStack,
     *             "3" para SinglyLinkedListStack o "4" para DoublyLinkedListStack.
     * @param <E> el tipo de elementos que contendrá la pila.
     * @return una instancia de la implementación de pila especificada por el parámetro tipo.
     * @throws IllegalArgumentException si se especifica un tipo de pila inválido.
     */
    public static <E> IStack<E> createPila(String tipo) {
        switch (tipo) {
            case "1":
                return new ArrayListStack<E>();
            case "2":
                return new VectorStack<E>();
            case "3":
                return new SinglyLinkedListStack<E>();
            case "4":
                return new DoublyLinkedListStack<E>();
            default:
                throw new IllegalArgumentException("Stack no válido, ingrese una opcion del 1-4");
        }
    }
}
