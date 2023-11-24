package Ej08;

import Ej07.Primos;

public class divisores {
    static int contarDivisoresPrimos(int numero) {
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0 && Primos.esPrimo(i)) {
                contador++;
            }
        }
        return contador;
    }
}
