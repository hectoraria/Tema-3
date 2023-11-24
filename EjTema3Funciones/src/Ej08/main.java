package Ej08;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Declaro variable del numero entero
		int n;
		int divisor;
		
		// Inicio escaner
		Scanner sc = new Scanner(System.in);

		// Solicitar al usuario que ingrese el primer número
		System.out.print("Ingrese el número: ");
		n = sc.nextInt();

		// Llamo a la funcion de los divisores
		 divisor = divisores.contarDivisoresPrimos(n);
		// Imprimo el numero de numeros pirmos que tiene
		System.out.println("El numero "+n+" tiene "+divisor+ " de numeros divisores primos " );
		
		
		sc.close();
	}

}
