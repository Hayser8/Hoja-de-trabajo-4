/**
 * @author Julio García Salas
 * Tare: Hoja de trabajo 4
 * Archivo: Calculadora.java
 * Fecha: 21/02/2023
 */
public class Calculadora {
    private static Calculadora instance;
    private IStack<Double> stack;
    /**
    Crea una instancia de Calculadora que utiliza una pila de números.
    @param stack la pila de números utilizada por la Calculadora
    */
    private Calculadora(IStack<Double> stack) {
        this.stack = stack;
    }
    /**

    Obtiene una instancia única de la Calculadora, utilizando la pila especificada.
    Si aún no se ha creado una instancia, se crea una nueva.
    @param stack la pila de números a utilizar por la Calculadora
    @return la instancia única de la Calculadora
    */
    public static Calculadora getInstance(IStack<Double> stack) {
        if (instance == null) {
            instance = new Calculadora(stack);
        }
        return instance;
    }
    /**
    @param expression la expresión en notación polaca inversa a calcular
    @return el resultado de la operación aritmética
    @throws ArithmeticException si se intenta dividir por cero
    */
    public double calcular(String expression) {
        char[] expr = expression.toCharArray();
        for (int i = 0; i < expr.length; i++) {
            if (expr[i] != ' ') {
                if (expr[i] == '+') {
                    double b = stack.pop();
                    double a = stack.pop();
                    stack.push(a + b);
                } else if (expr[i] == '-') {
                    double b = stack.pop();
                    double a = stack.pop();
                    stack.push(a - b);
                } else if (expr[i] == '*') {
                    double b = stack.pop();
                    double a = stack.pop();
                    stack.push(a * b);
                } else if (expr[i] == '/') {
                    double b = stack.pop();
                    double a = stack.pop();
                    if (b == 0) {
                        throw new ArithmeticException("No se puede dividir por cero.");
                    }
                    stack.push(a / b);
                } else {
                    String numStr = String.valueOf(expr[i]);
                    double num = Double.parseDouble(numStr);
                    stack.push(num);
                }
            }
        }
        return stack.pop();
    }
    
}
