/**
 * @author Julio García Salas
 * Tare: Hoja de trabajo 4
 * Archivo: ArrayListStackTest.java
 * Fecha: 21/02/2023
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import junit.framework.TestCase;
public class ArrayListStackTest extends TestCase{

    ArrayListStack<Double> arrayListStack;

    /**
     * Inicializa una nueva instancia de ArrayListStack para cada prueba.
     */
    private void prueba()
    {
        arrayListStack = new ArrayListStack<Double>();
    }

    /**
     * Prueba que el método push agregue elementos a la pila correctamente.
     */
    public void testPush()
    {
        prueba();
        arrayListStack.push(1.0);
        arrayListStack.push(2.0);
        arrayListStack.push(3.0);

        assertEquals(3, arrayListStack.size());
    }

    /**
     * Prueba que el método peek devuelva el elemento superior de la pila sin modificar la pila.
     */
    public void testPeek()
    {
        prueba();
        arrayListStack.push(1.0);
        arrayListStack.push(2.0);
        arrayListStack.push(3.0);
        assertEquals(3.0, arrayListStack.peek());
    }

    /**
     * Prueba que el método empty devuelve true cuando la pila está vacía y false cuando tiene elementos.
     */
    public void testEmpty()
    {
        prueba();
        assertEquals(arrayListStack.empty(), true);
    }

    /**
     * Prueba que el método size devuelve el número correcto de elementos en la pila.
     */
    public void testSize()
    {
        prueba();
        arrayListStack.push(1.0);
        arrayListStack.push(2.0);
        arrayListStack.push(3.0);
        assertEquals(3, arrayListStack.size());
    }
}