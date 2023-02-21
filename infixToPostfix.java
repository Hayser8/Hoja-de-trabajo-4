/**
 * @author Julio García Salas
 * Tare: Hoja de trabajo 4
 * Archivo: InfixToPostfix.java
 * Fecha: 21/02/2023
 */
public class infixToPostfix {

    /**
     * Este método recibe una expresión en formato infix y retorna su equivalente en formato postfix.
     *
     * @param infix la expresión en formato infix a convertir.
     * @return la expresión equivalente en formato postfix.
     */
    public String Conversor(String infix) {
        String postfix = "";
        IStack<Character> stack = new ArrayListStack<>();

        for (char c : infix.toCharArray()) { 
            if (Character.isDigit(c)) {
                postfix += c + " ";
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.empty() && stack.peek() != '(') {
                    postfix += stack.pop() + " ";
                }
                stack.pop();
            } else {
                while (!stack.empty() && hasPrecedence(c, stack.peek())) {
                    postfix += stack.pop() + " ";
                }
                stack.push(c);
            }
        }

        while (!stack.empty()) {
            postfix += stack.pop() + " ";
        }

        return postfix.trim();
    }

    /**
     * Este método determina si un operador tiene precedencia sobre otro.
     *
     * @param op1 el operador a evaluar.
     * @param op2 el operador a comparar.
     * @return true si op1 tiene mayor o igual precedencia que op2, false de lo contrario.
     */
    private boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        }
        return true;
    }
}