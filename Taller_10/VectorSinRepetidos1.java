package vectorsinrepetidos1;

import java.util.Scanner;

public class VectorSinRepetidos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        boolean repetido;
        System.out.print("¿Cuantos números desea ingresar? ");
        n = sc.nextInt();
        int[] lista = new int[n];
        System.out.println();
        for (i = 0; i <= n - 1; i++) {
            repetido = true;
            while (repetido) {
                System.out.print("Ingrese el elemento " + (i + 1) + ": ");
                lista[i] = sc.nextInt();
                repetido = false;
                for (j = 0; j <= i - 1; j++) {
                    if (lista[j] == lista[i]) {
                        repetido = true;
                    }
                }
                if (repetido) {
                    System.out.println("¡Valor repetido, ingresar uno  nuevo!");
                }
            }   
        }
        System.out.print("\nArreglo ingresado: [ ");
        for (i = 0; i <= n - 1; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println("]");
    }

}
