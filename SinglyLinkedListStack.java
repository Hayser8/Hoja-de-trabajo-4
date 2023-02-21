/**
 * @author Julio García Salas
 * Tare: Hoja de trabajo 4
 * Archivo: SinglyLinkedStack.java
 * Fecha: 21/02/2023
 */
import java.util.EmptyStackException;
import structure5.SinglyLinkedList;
    /**
 * Implementación de una pila utilizando una lista enlazada simple.
 * @param <E> tipo de elementos a guardar en la pila.
 */
public class SinglyLinkedListStack<E> implements IStack<E> {
    private SinglyLinkedList<E> list;
    
    /**
     * Constructor de la clase que crea una nueva lista enlazada.
     */
    public SinglyLinkedListStack() {
        list = new SinglyLinkedList<>();
    }
    
    /**
     * Agrega un elemento a la cima de la pila.
     * @param item elemento a agregar.
     */
    public void push(E item) {
        list.addFirst(item);
    }
    
    /**
     * Elimina y devuelve el elemento en la cima de la pila.
     * @return elemento en la cima de la pila.
     * @throws EmptyStackException si la pila está vacía.
     */
    public E pop() throws EmptyStackException {
        if (empty()) {
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }
    
    /**
     * Devuelve el elemento en la cima de la pila sin eliminarlo.
     * @return elemento en la cima de la pila.
     * @throws EmptyStackException si la pila está vacía.
     */
    public E peek() throws EmptyStackException {
        if (empty()) {
            throw new EmptyStackException();
        }
        return list.getFirst();
    }
    
    /**
     * Verifica si la pila está vacía.
     * @return true si la pila está vacía, false en caso contrario.
     */
    public boolean empty() {
        return list.isEmpty();
    }
    
    /**
     * Devuelve la cantidad de elementos en la pila.
     * @return cantidad de elementos en la pila.
     */
    public int size() {
        return list.size();
    }
}
