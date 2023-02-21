/**
 * @author Julio García Salas
 * Tare: Hoja de trabajo 4
 * Archivo: DoublyLinkedStackTest.java
 * Fecha: 21/02/2023
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import junit.framework.TestCase;
public class DoublyLinkedListStackTest extends TestCase {
    DoublyLinkedListStack<Double> listaDoblemente;
        /**
     * Método auxiliar para inicializar una nueva lista doblemente enlazada para cada prueba.
     */
    private void prueba()
    {
        listaDoblemente = new DoublyLinkedListStack<Double>();
    }

    /**
     * Método de prueba para el método push de la clase DoublyLinkedListStack.
     * Verifica que se añaden correctamente elementos a la lista y se incrementa el tamaño de la misma.
     */
    public void testPush()
    {
        prueba();
        listaDoblemente.push(1.0);
        listaDoblemente.push(2.0);
        listaDoblemente.push(3.0);
        assertEquals(3, listaDoblemente.size());
    }

    /**
     * Método de prueba para el método pop de la clase DoublyLinkedListStack.
     * Verifica que se eliminan correctamente elementos de la lista y se decrementa el tamaño de la misma.
     */
    public void testPop()
    {
        prueba();
        listaDoblemente.push(1.0);
        listaDoblemente.push(2.0);
        listaDoblemente.push(3.0);
        listaDoblemente.pop();
        assertEquals(2.0, listaDoblemente.pop());   
    }

    /**
     * Método de prueba para el método peek de la clase DoublyLinkedListStack.
     * Verifica que se puede acceder correctamente al elemento en la cima de la lista sin eliminarlo.
     */
    public void testPeek()
    {
        prueba();
        listaDoblemente.push(1.0);
        listaDoblemente.push(2.0);
        listaDoblemente.push(3.0);
        assertEquals(3.0, listaDoblemente.peek());
    }

    /**
     * Método de prueba para el método empty de la clase DoublyLinkedListStack.
     * Verifica que se puede determinar correctamente si la lista está vacía o no.
     */
    public void testEmpty()
    {
        prueba();
        assertEquals(true, listaDoblemente.empty());
    }

    /**
     * Método de prueba para el método size de la clase DoublyLinkedListStack.
     * Verifica que se puede obtener correctamente el tamaño de la lista.
     */
    public void testSize()
    {
        prueba();
        listaDoblemente.push(1.0);
        listaDoblemente.push(2.0);
        listaDoblemente.push(3.0);
        assertEquals(listaDoblemente.size(), 3);
    }
}
