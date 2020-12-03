package estadnumeros3;

import java.util.Scanner;

public class EstadNumeros3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, num, c, suma, mayor;
        float promedio;
        System.out.print("¿Cuántos números desea ingresar?: ");
        N = sc.nextInt();
        suma = 0;
        mayor = 0;
        c = 1;
        while (c <= N) {
            System.out.print("Ingrese el valor " + c + ": ");
            num = sc.nextInt();
            suma = suma + num;
            if (c == 1 || num > mayor) {
                mayor = num;
            }
            c = c + 1;
        }
        promedio = (float) suma / N;
        System.out.println("\nLa media aritmética de los " + N + " números es: "
                + promedio);
        System.out.println("El mayor de los números ingresados es: "
                + mayor);
    }
}
