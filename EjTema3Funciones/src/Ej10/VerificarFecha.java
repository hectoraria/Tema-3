package Ej10;

public class VerificarFecha {
	static boolean esFechaValida(int dia, int mes, int año) {
        // Suponemos que todos los meses tienen 30 días
        if (dia > 0 && dia <= 30 && mes > 0 && mes <= 12 && año > 0) {
            return true;
        } else {
            return false;
        }
    }
}
