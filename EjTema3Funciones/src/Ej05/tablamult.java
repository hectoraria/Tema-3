package Ej05;

public class tablamult {
	 public static void mostrarTablaMultiplicar(int numero) {
		 
		 	int resultado=0;
		 	
	        System.out.println("Tabla de multiplicar del " + numero + ":");

	        for (int i = 1; i <= 10; i++) {
	            resultado = numero * i;
	            
	            System.out.println();
	            System.out.println(numero + " x " + i + " = " + resultado);
	        }
	    }

}
