package Ej10;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		//Declaro variables
		int dia;
		int mes;
		int año;
		
		Scanner sc = new Scanner(System.in);

		// Solicitar al usuario que ingrese el día, mes y año
		System.out.print("Ingrese el día: ");
		dia = sc.nextInt();

		System.out.print("Ingrese el mes: ");
		mes = sc.nextInt();

		System.out.print("Ingrese el año: ");
		año = sc.nextInt();

		// Verificar si la fecha es válida utilizando la función esFechaValida
		if (VerificarFecha.esFechaValida(dia, mes, año)) {
			System.out.println("La fecha: "+año+"-"+mes+"-"+dia+" es válida.");
		} else {
			System.out.println("La fecha: "+año+"-"+mes+"-"+dia+" no es válida.");
		}

		// Cerrar el scanner
		sc.close();
	}

}
