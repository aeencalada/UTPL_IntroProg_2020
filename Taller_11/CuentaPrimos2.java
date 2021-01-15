package cuentaprimos2;

import java.util.Scanner;

public class CuentaPrimos2 {

    public static void main(String[] args) {
        int n = leerEnteroPositivo("¿Cuántos números va a ingresar? ");
        int[] lista = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            lista[i] = leerEnteroPositivo("Ingrese elemento " + (i + 1) + ": ");
        }

        int cp = 0;
        for (int i = 0; i <= n - 1; i++) {
            if (esPrimo(lista[i])) {
                cp++;
            }
        }

        System.out.println("De los elementos ingresados " + cp + " son primos ");
    }

    // Función que lee desde teclaco un número entero positivo
    public static int leerEnteroPositivo(String mensaje) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean datoValido = false;
        while (!datoValido) {
            try {
                System.out.print(mensaje);
                num = sc.nextInt();
                if (num <= 0) {
                    System.out.print("Valor no válido\n");
                } else {
                    datoValido = true;
                }
            } catch (Exception e) {
                System.out.print("Valor no válido\n");
                sc.next();
            }
        }
        return num;
    }

    // Función que determina si un número es primo
    public static boolean esPrimo(int num) {
        boolean esPrimo = true;
        if (num < 2) {
            esPrimo = false;
        } else {
            int c = num - 1;
            while (c >= 2) {
                if (num % c == 0) {
                    esPrimo = false;
                    c = 1;
                } else {
                    c = c - 1;
                }
            }
        }
        return esPrimo;
    }

}
