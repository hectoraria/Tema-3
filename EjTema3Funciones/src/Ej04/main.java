package Ej04;

import java.util.Scanner;

import Ej03.mayor_numero;

public class main {

	public static void main(String[] args) {
		 // Variable de char para ver si lo introducido es correcto
        char letra;
        // Incio escaner
		Scanner sc = new Scanner (System.in);
		
		// Pregunto al usuario por el caracter que quiere introducir
		System.out.println("Introduce un caracter: ");
		letra = sc.next().charAt(0);
		
		//Creo el bolean para ver el resultado
		 System.out.println("Es vocal? " + vocalbolean.esVocal(letra));
		
		
		// Cierro escaner
		sc.close();
	}

}
