/**
 * @author Julio García Salas
 * Tare: Hoja de trabajo 4
 * Archivo: Controlador.java
 * Fecha: 21/02/2023
 */
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {
    Readersito reader = new Readersito();
    Vista view = new Vista();
    Scanner input = new Scanner(System.in);
    /**
    * Método que inicia el programa
    */
    public void starter() {
        int opcion2 = 1;
        while(opcion2 != 2) {
            opcion2 = view.menu();
            switch(opcion2) {
                case 1:
                    System.out.println("¿Dónde tienes tu archivo txt?"); 
                    String archivo = input.next();
                    infixToPostfix conversor = new infixToPostfix();
                    System.out.println("¿Qué tipo de pila deseas usar?"); 
                    System.out.println("1. ArrayList");
                    System.out.println("2. Vector");
                    System.out.println("3. SinglyLinkedList");
                    System.out.println("4. DoublyLinkedList");
                    String tipo1 = input.next();
                    IStack<Double> stack = StackFactory.createPila(tipo1);
                    Calculadora calcu = Calculadora.getInstance(stack);
                    ArrayList<ArrayList<String>> lineas1 = reader.read(archivo);
                    for (int index = 0; index < lineas1.size(); index++) {
                        ArrayList<String> caracteres = lineas1.get(index);
                        String infix = "";
                        for (int i = 0; i < caracteres.size(); i++) {
                            infix += caracteres.get(i);
                        }
                        String postfix = conversor.Conversor(infix);
                        System.out.println("\n Operación modo infix: " + infix); 
                        System.out.println("\n Operación modo postfix: " + postfix + "\n"); 
                        double datos = calcu.calcular(postfix);
                        System.out.println(" El resultado de la ecuación es: " + datos + "\n \t\t\t\t ¨¨¨¨"); 
                    }
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingresa una opción válida");
            }
        }
    }
}
