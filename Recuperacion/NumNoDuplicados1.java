package numnoduplicados1;

import java.util.Scanner;

public class NumNoDuplicados1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean unico;
        int tamano, i, j;
        System.out.print("Ingrese la longitud del vector: ");
        tamano = sc.nextInt();
        int arreglo[] = new int[tamano];
        for (i = 0; i < tamano; i++) {
            System.out.print("Ingrese valor " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt();
        }
        System.out.print("Los valores que no se duplican son: ");
        for (i = 0; i < tamano; i++) {
            unico = true;
            for (j = 0; j < tamano; j++) {
                if (j != i && arreglo[j] == arreglo[i]) {
                    unico = false;
                }
            }
            if (unico) {
                System.out.print(arreglo[i] + ",");
            }
        }
        System.out.println();
    }

}
