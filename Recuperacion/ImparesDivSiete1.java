package imparesdivsiete1;

import java.util.Scanner;

public class ImparesDivSiete1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, num;
        System.out.println("Números impares divisibles por 7 entre 0 y N");
        System.out.println("--------------------------------------------");
        System.out.print("Ingrese el límite para la búsqueda: ");
        n = sc.nextInt();
        if (n < 0) {
            System.out.println("Límite no válido");
        } else {
            System.out.print("Los números impares divisibles por 7 entre 0 y "
                    + n + " son: ");
            for (int i = 0; i < n; i++) {
                if (i % 2 != 0 && i % 7 == 0) {
                    System.out.print(i + ", ");
                }
            }
            System.out.println();
        }
    }
}
