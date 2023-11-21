package Ej03;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Variable de los dos numero e incializo las variables
		int num1=0,num2=0;
				
		// Incio escaner
		Scanner sc = new Scanner (System.in);
		
		// Pregunto al usuario por el primer numero y lo guardo en la variable
		System.out.println("Introduce un primer numero: ");
		num1 = sc.nextInt();

		// Pregunto al usuario por el segundo numero y lo guardo en la variable
		System.out.println("Introduce el segundo numero: ");
		num2 = sc.nextInt();
		int maximo= mayor_numero.obtenerMaximo(num1,num2);
		System.err.println("El numero mayor es: "+maximo);
		
		// Cierro escaner
		sc.close();
	}

}
