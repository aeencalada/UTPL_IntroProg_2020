package impnomultsiete1;

import java.util.Scanner;

public class ImpNoMultSiete1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cont, aux;

        System.out.println("Números impares que no son múltiplos de 7");
        System.out.println("-----------------------------------------");
        System.out.print("\nIngrese la cantidad de números a mostrar: ");
        n = sc.nextInt();

        if (n < 0) {
            System.out.println("Cantidad no válida");
        } else {
            System.out.print("Los " + n
                    + " primeros números impares que no son multiplos de 7 son: ");
            aux = 1;
            cont = 1;
            while (cont <= n) {
                if (aux % 2 != 0 && aux % 7 != 0) {
                    System.out.print(aux + ",");
                    cont++;
                }
                aux++;
            }
            System.out.println();
        }
    }
}
