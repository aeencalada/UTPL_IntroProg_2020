package notas1;

import java.util.Scanner;
public class Notas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, ca = 0, cd = 0;
        float promedio;
        System.out.print("¿Cuántas notas desea ingresar? ");
        n = sc.nextInt();
        float notas[] = new float[n];
        float suma = 0;
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = sc.nextFloat();
            suma = suma + notas[i];
        }
        promedio = suma / n;
        for (int i = 0; i <= n - 1; i++) {
            if (notas[i] >= promedio) {
                ca++;
            } else {
                cd++;
            }
        }
        System.out.println("\nPromedio: " + promedio);
        System.out.println("Estudiantes por arriba de la media: " + ca);
        System.out.println("Estudiantes por debajo de la media: " + cd);
    }
}
