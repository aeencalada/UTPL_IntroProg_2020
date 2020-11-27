package listaimpares1;

// Lista de N primeros números impares
import java.util.Scanner;

public class ListaImpares1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, impar, c;

        System.out.print("Ingrese la cantidad de impares a mostrar: ");
        N = sc.nextInt();

        impar = 1;
        c = 1;
        while (c <= N) {
            System.out.println(impar);
            impar = impar + 2;
            c = c + 1;
        }
    }
}

