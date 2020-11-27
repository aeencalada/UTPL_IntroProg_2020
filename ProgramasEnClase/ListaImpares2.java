package listaimpares2;

// Programa que lista los impares entre 0 y N
import java.util.Scanner;

public class ListaImpares2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, impar;

        System.out.print("Ingrese el valor límite de impares a mostrar: ");
        N = sc.nextInt();

        impar = 1;
        while (impar <= N) {
            System.out.println(impar);
            impar = impar + 2;
        }
    }
}

