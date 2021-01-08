package cuentaprimos1;

import java.util.Scanner;

public class CuentaPrimos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, num, c;
        boolean esPrimo;
        System.out.print("¿Cuántos números va a ingresar? ");
        n = sc.nextInt();
        int[] lista = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Ingrese elemento " + (i + 1) + ": ");
            lista[i] = sc.nextInt();
        }

        int cp = 0;
        for (int i = 0; i <= n - 1; i++) {
            num = lista[i];
            esPrimo = false;
            if (num >= 2) {
                c = num - 1;
                while (num % c != 0) {
                    c = c - 1;
                }
                if (c == 1) {
                    esPrimo = true;
                }
            }
            if (esPrimo) {
                cp++;
            }
        }

        System.out.println("De los elementos ingresados " + cp + " son primos ");
    }

}
