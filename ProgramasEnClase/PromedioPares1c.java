package promediopares1c;

// Promedio de los N primeros números pares
import java.util.Scanner;

public class PromedioPares1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short N, c;
        int suma;
        float promedio;
        // Entrada de datos
        System.out.print("Ingrese la cantidad de pares a promediar: ");
        N = sc.nextShort();
        // Proceso
        suma = 0;
        c = 1;
        while (c <= N) {
            suma = suma + c * 2;
            c = (short) (c + 1);
        }
        promedio = (float) suma / N;
        // Salida
        System.out.println("\nEl promedio de los " + N
                + " primeros números pares es " + promedio);
    }
}
