package Ej05;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//Variable para recoger el numero
		int numero;
		// Inicio escaner
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que introduzca un número
        System.out.print("Introduce un número para obtener su tabla de multiplicar: ");
        // Leer el número introducido por el usuario
        numero = sc.nextInt();

        // Llamar a la función para mostrar la tabla de multiplicar del número ingresado
        tablamult.mostrarTablaMultiplicar(numero);

        // Cerrar el Scanner 
        sc.close();
 
	
	}

}


