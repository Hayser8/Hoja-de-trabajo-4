/**
 * @author Julio García Salas
 * Tare: Hoja de trabajo 4
 * Archivo: ArrayListStack.java
 * Fecha: 21/02/2023
 */
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Stack;

public class ArrayListStack<E> implements IStack<E> {
    /**
     * Crea una nueva pila utilizando un Arraylist como estructura de datos subyacente.
     */
    private ArrayList<E> stackElements = new ArrayList<E>();

    /**
     * Añade un elemento al stack.
     * @param item el elemento a añadir.
     */
    public void push(E item) { 
        stackElements.add(item);
    }

    /**
     * Elimina el último elemento del stack.
     * @return el último elemento del stack.
     * @throws EmptyStackException si el stack está vacío.
     */
    public E pop() throws EmptyStackException {
        try {
            return stackElements.remove(stackElements.size() - 1);
        } catch (IndexOutOfBoundsException e) {
            throw new EmptyStackException();
        }
    }
    /**

    * Retorna el elemento en la cima del stack sin eliminarlo.
    * @return el elemento en la cima del stack.
    * @throws EmptyStackException si el stack está vacío.
    */
    public E peek() throws EmptyStackException {
        try {
            return stackElements.get(stackElements.size() - 1);
        } catch (IndexOutOfBoundsException e) {
            throw new EmptyStackException();
        }
    }
    

    /**
     * Verifica si el stack está vacío.
     * @return true si el stack está vacío, de lo contrario false.
     */
    public boolean empty() { 
        return stackElements.isEmpty();
    }

    /**
     * Retorna la cantidad de elementos en el stack.
     * @return la cantidad de elementos en el stack.
     */
    public int size() { 
        return stackElements.size();
    }
}

