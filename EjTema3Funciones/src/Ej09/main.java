package Ej09;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Declaro variable de los operadores y la operacion que se va a calcular
		double operando1;
		double operando2;
		int operacion;
		double resultado;
		// Inicio escaner
		Scanner sc = new Scanner(System.in);

		// Solicitar al usuario que ingrese los operandos y la operación
		System.out.print("Ingrese el primer operando: ");
		operando1 = sc.nextDouble();

		System.out.print("Ingrese el segundo operando: ");
		operando2 = sc.nextDouble();

		System.out.print("Elija la operación (1 para sumar, 2 para restar, 3 para multiplicar, 4 para dividir): ");
		operacion = sc.nextInt();

		//Llama a la funcion y calculo el resultado
		resultado= calculadora.calculadora(operando1, operando2, operacion);
		System.out.println("El resultado de la operación es: " + resultado);
		// Cierro el escaner
		sc.close();
	}

}
