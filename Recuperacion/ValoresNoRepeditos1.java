package valoresnorepeditos1;

import java.util.Scanner;

public class ValoresNoRepeditos1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, p;
        String repetido;
        System.out.print("Ingrese el tamaño del vector: ");
        n = sc.nextInt();
        int lista[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("Ingrese elemento " + (i + 1) + ": ");
            lista[i] = sc.nextInt();
        }
        System.out.print("Los elementos que no se repiten son: ");
        for (i = 0; i < n; i++) {
            repetido = "N";
            for (p = 0; p < n; p++) {
                if (p != i && lista[p] == lista[i]) {
                    repetido = "S";
                }
            }
            if (repetido.equals("N")) {
                System.out.print(lista[i] + ", ");
            }
        }
        System.out.println();
    }
}
