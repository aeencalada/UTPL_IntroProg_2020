package sumarvector1;

import java.util.Scanner;

public class SumarVector1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Ingrese el tamaño del vector: ");
        n = sc.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }
        mostrarVector(vector);
        System.out.println("La sumatoria del vector es: " + sumarVector(vector));
    }

    //Procedimiento que muestra el contenido de un vector
    public static void mostrarVector(int[] x) {
        System.out.print("\nContenido del vector: [ ");
        for (int i = 0; i <= x.length - 1; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println("]\n");
    }

    //Función que calcula la sumatoria de los elementos del vector
    public static int sumarVector(int x[]) {
        int suma = 0;
        for (int i = 0; i <= x.length - 1; i++) {
            suma += x[i];
        }
        return suma;
    }
}
