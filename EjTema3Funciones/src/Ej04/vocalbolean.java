package Ej04;

public class vocalbolean {
	public static boolean esVocal(char letra) {
        char caracterMinuscula = Character.toLowerCase(letra);

        // Verificamos si el carácter es una vocal
        return (caracterMinuscula == 'a' || caracterMinuscula == 'e' || caracterMinuscula == 'i'
                || caracterMinuscula == 'o' || caracterMinuscula == 'u');
    }
}
