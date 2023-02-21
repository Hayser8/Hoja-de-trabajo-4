/**
 * @author Julio García Salas
 * Tare: Hoja de trabajo 4
 * Archivo: IStack.java
 * Fecha: 21/02/2023
 */
import java.util.EmptyStackException;
import structure5.SinglyLinkedList;
import structure5.DoublyLinkedList;
import java.util.EmptyStackException;
/**
 * Una interfaz que representa una pila de elementos genéricos.
 * Los elementos se agregan y eliminan en la parte superior de la pila, siguiendo el orden LIFO (Last-In-First-Out).
 * 
 * @param <E> el tipo de elementos que se almacenarán en la pila
 */
public interface IStack<E> {
    
    /**
     * Agrega un elemento a la parte superior de la pila.
     * 
     * @param item el elemento a agregar a la pila
     */
    public void push(E item);
 
    /**
     * Elimina y devuelve el elemento en la parte superior de la pila.
     * 
     * @return el elemento en la parte superior de la pila
     * @throws EmptyStackException si la pila está vacía
     */
    public E pop() throws EmptyStackException;
 
    /**
     * Devuelve el elemento en la parte superior de la pila sin eliminarlo.
     * 
     * @return el elemento en la parte superior de la pila
     * @throws EmptyStackException si la pila está vacía
     */
    public E peek() throws EmptyStackException;
 
    /**
     * Indica si la pila está vacía o no.
     * 
     * @return true si la pila está vacía, false de lo contrario
     */
    public boolean empty();

    /**
     * Devuelve el número de elementos en la pila.
     * 
     * @return el número de elementos en la pila
     */
    public int size();
}