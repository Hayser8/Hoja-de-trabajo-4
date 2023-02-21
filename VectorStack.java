/**
 * @author Julio García Salas
 * Tare: Hoja de trabajo 4
 * Archivo: VectorStack.java
 * Fecha: 21/02/2023
 */
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Vector;
public class VectorStack<E> implements IStack<E> {
    protected Vector<E> stackElements;

    /**
     * Crea una nueva pila utilizando un Vector como estructura de datos subyacente.
     */
    public VectorStack(){
        this.stackElements = new Vector<>();
    }

    /**
     * Añade un elemento a la cima de la pila.
     *
     * @param item el elemento que se va a añadir.
     */
    public void push(E item){
        this.stackElements.add(item);
    }

    /**
     * Quita y devuelve el elemento que está en la cima de la pila. Si la pila está vacía,
     * se lanza una excepción EmptyStackException.
     *
     * @return el elemento que está en la cima de la pila.
     * @throws EmptyStackException si la pila está vacía.
     */
    public E pop() throws EmptyStackException{
        if (empty()){
            throw new NoSuchElementException("No se puede realizar la opción -pop- en un stack vacío.");
        }
        return this.stackElements.remove(this.stackElements.size()-1);
    }

    /**
     * Devuelve el elemento que está en la cima de la pila, sin quitarlo de la pila. Si la pila
     * está vacía, se lanza una excepción EmptyStackException.
     *
     * @return el elemento que está en la cima de la pila.
     * @throws EmptyStackException si la pila está vacía.
     */
    public E peek() throws EmptyStackException{
        if (empty()){
            throw new NoSuchElementException("Error, el stack está vacío.");
        }
        return stackElements.get(stackElements.size()-1);
    }

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false en caso contrario.
     */
    public boolean empty(){
        return this.stackElements.isEmpty();
    }

    /**
     * Devuelve la cantidad de elementos que hay en la pila.
     *
     * @return la cantidad de elementos que hay en la pila.
     */
    public int size(){
        return this.stackElements.size();
    }
}
