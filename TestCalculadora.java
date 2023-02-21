/**
 * @author Julio García Salas
 * Tare: Hoja de trabajo 4
 * Archivo: TestCalculadora.java
 * Fecha: 21/02/2023
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import junit.framework.TestCase;
public class TestCalculadora extends TestCase {
    Calculadora calculadora;
    
    /**
     * Constructor de prueba para poder hacer los tests
     */
    private void prueba()
    {
        IStack<Double> stack = new ArrayListStack<>();
        calculadora = Calculadora.getInstance(stack);
    }
    
    /**
     * Prueba para verificar que solo existe una instancia de la calculadora
     */
    public void testGetInstance()
    {
        prueba();
        IStack<Double> stack = new ArrayListStack<>();
        Calculadora calculadora1 = Calculadora.getInstance(stack);
        Calculadora calculadora2 = Calculadora.getInstance(stack);
        assertEquals(calculadora1, calculadora2);
    }
    
    /**
     * Prueba para verificar que el método calcular realiza operaciones correctamente
     */
    public void testCalcular()
    {
        prueba();
        calculadora.calcular("8 7 * 5 -");
        assertEquals(calculadora.calcular("8 7 * 5 -"), 51.0);
    }
}