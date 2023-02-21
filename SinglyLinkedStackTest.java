/**
 * @author Julio García Salas
 * Tare: Hoja de trabajo 4
 * Archivo: SinglyLinkedSTackTest.java
 * Fecha: 21/02/2023
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import junit.framework.TestCase;
public class SinglyLinkedStackTest extends TestCase{
    SinglyLinkedListStack<Double> listaSimplemente;
    /**
     * Crea una instancia de la pila de enlace sencillo para cada prueba.
     */
    private void prueba() {
        listaSimplemente = new SinglyLinkedListStack<>();
    }

    /**
     * Prueba el método push() de la pila de enlace sencillo.
     */
    public void testPush() {
        prueba();
        listaSimplemente.push(1.0);
        listaSimplemente.push(2.0);
        listaSimplemente.push(3.0);
        assertEquals(3, listaSimplemente.size());
    }

    /**
     * Prueba el método pop() de la pila de enlace sencillo.
     */
    public void testPop() {
        prueba();
        listaSimplemente.push(1.0);
        listaSimplemente.push(2.0);
        listaSimplemente.push(3.0);
        listaSimplemente.pop();
        assertEquals(2.0, listaSimplemente.pop());  
    }

    /**
     * Prueba el método peek() de la pila de enlace sencillo.
     */
    public void testPeek() {
        prueba();
        listaSimplemente.push(1.0);
        listaSimplemente.push(2.0);
        listaSimplemente.push(3.0);
        assertEquals(3.0, listaSimplemente.peek());
    }

    /**
     * Prueba el método empty() de la pila de enlace sencillo.
     */
    public void testEmpty() {
        prueba();
        assertEquals(true, listaSimplemente.empty());
    }

    /**
     * Prueba el método size() de la pila de enlace sencillo.
     */
    public void testSize() {
        prueba();
        listaSimplemente.push(1.0);
        listaSimplemente.push(2.0);
        listaSimplemente.push(3.0);
        assertEquals(3, listaSimplemente.size());
    }
}
