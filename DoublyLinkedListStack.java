/**
 * @author Julio García Salas
 * Tare: Hoja de trabajo 4
 * Archivo: DoublyLinkedListStack.java
 * Fecha: 21/02/2023
 */
import java.util.EmptyStackException;
import structure5.DoublyLinkedList;
    public class DoublyLinkedListStack<E> implements IStack<E> {
        private DoublyLinkedList<E> list;

        /**
         * Crea una nueva instancia de la clase DoublyLinkedListStack.
         * La instancia contiene una lista doblemente enlazada vacía.
         */
        public DoublyLinkedListStack() {
            list = new DoublyLinkedList<>();
        }

        /**
         * Agrega un elemento al tope de la pila.
         * 
         * @param item el elemento que se desea agregar a la pila
         */
        public void push(E item) {
            list.addFirst(item);
        }

        /**
         * Quita el elemento que se encuentra en el tope de la pila y lo devuelve.
         * 
         * @return el elemento que se encontraba en el tope de la pila
         * @throws EmptyStackException si se intenta quitar un elemento de una pila vacía
         */
        public E pop() throws EmptyStackException {
            if (empty()) {
                throw new EmptyStackException();
            }
            return list.removeFirst();
        }

        /**
         * Devuelve el elemento que se encuentra en el tope de la pila sin quitarlo.
         * 
         * @return el elemento que se encuentra en el tope de la pila
         * @throws EmptyStackException si se intenta obtener un elemento de una pila vacía
         */
        public E peek() throws EmptyStackException {
            if (empty()) {
                throw new EmptyStackException();
            }
            return list.getFirst();
        }

        /**
         * Verifica si la pila está vacía.
         * 
         * @return true si la pila está vacía, false en caso contrario
         */
        public boolean empty() {
            return list.isEmpty();
        }

        /**
         * Devuelve el número de elementos que hay en la pila.
         * 
         * @return el número de elementos en la pila
         */
        public int size() {
            return list.size();
        }
    }
