/**
 * @author Julio García Salas
 * Tare: Hoja de trabajo 4
 * Archivo: Vista.java
 * Fecha: 21/02/2023
 */
import java.util.Scanner;
public class Vista {
    /**
    * Muestra el menú de opciones al usuario y lee la opción elegida.
    * 
    * @return La opción elegida por el usuario.
    */
    public int menu()
    {
        Scanner input = new Scanner(System.in);
        int opcion;
        System.out.println("Bienvenido a la calculadora \n¿Qué deseas hacer?");
        System.out.println("1. Calcular");  
        System.out.println("2. Salir"); 
        opcion = input.nextInt(); 
        return opcion;
    }       
}

