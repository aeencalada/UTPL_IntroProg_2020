package busquedarepetidos1b;

import java.util.Scanner;
public class BusquedaRepetidos1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, cr = 0;
        String pos = "";
        System.out.print("¿Cuántos valores desea ingresar? ");
        n = sc.nextInt();
        int[] lista = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            lista[i] = sc.nextInt();
        }
        for (int i = 0; i <= n - 1; i++) {
            if (lista[i] == lista[n - 1]) {
                cr++;
                pos = pos + (i + 1) + ", ";
            }
        }
        System.out.println("El último elemento " + lista[n - 1] + ", se repite "
                + cr + " veces en las posiciones " + pos);
    }
}
