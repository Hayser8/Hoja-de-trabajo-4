/**
 * @author Julio García Salas
 * Tare: Hoja de trabajo 4
 * Archivo: VectorStackTest.java
 * Fecha: 21/02/2023
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import junit.framework.TestCase;
public class VectorStackTest extends TestCase{
    VectorStack<Double> vector;

    /**
     * Método auxiliar que inicializa la pila antes de realizar cada prueba.
     */
    private void prueba() {
        vector = new VectorStack<Double>();
    }

    /**
     * Prueba unitaria del método push.
     * Se agregan tres elementos a la pila y se verifica que su tamaño sea correcto.
     */
    public void testPush() {
        prueba();
        vector.push(1.0);
        vector.push(2.0);
        vector.push(3.0);
        assertEquals(3, vector.size());
    }

    /**
     * Prueba unitaria del método pop.
     * Se agregan tres elementos a la pila, se elimina el último y se verifica que el siguiente elemento sea el esperado.
     */
    public void testPop() {
        prueba();
        vector.push(1.0);
        vector.push(2.0);
        vector.push(3.0);
        vector.pop();
        assertEquals(2.0, vector.pop());
    }

    /**
     * Prueba unitaria del método peek.
     * Se agregan tres elementos a la pila y se verifica que el último elemento sea el esperado.
     */
    public void testPeek() {
        prueba();
        vector.push(1.0);
        vector.push(2.0);
        vector.push(3.0);
        assertEquals(3.0, vector.peek());
    }

    /**
     * Prueba unitaria del método empty.
     * Se verifica que la pila esté vacía.
     */
    public void testEmpty() {
        prueba();
        assertEquals(true, vector.empty());
    }

    /**
     * Prueba unitaria del método size.
     * Se agregan tres elementos a la pila y se verifica que su tamaño sea el esperado.
     */
    public void testSize() {
        prueba();
        vector.push(1.0);
        vector.push(2.0);
        vector.push(3.0);
        assertEquals(3, vector.size());
    }
}
