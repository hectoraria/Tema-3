package Ej09;

public class calculadora {
	static double calculadora(double operando1, double operando2, int operacion) {
        double resultado = 0.0;

        switch (operacion) {
            case 1:
                resultado = operando1 + operando2;
                break;
            case 2:
                resultado = operando1 - operando2;
                break;
            case 3:
                resultado = operando1 * operando2;
                break;
            case 4:
                if (operando2 != 0) {
                    resultado = operando1 / operando2;
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }

        return resultado;
    }
}
