package sucesionrecu1;

import java.util.Scanner;

public class SucesionRecu1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, numerador, denominador;
        float suma;
        System.out.print("Ingrese la cantidad de elementos de la serie: ");
        n = sc.nextInt();
        suma = 0;
        denominador = 2;
        for (numerador = 1; numerador <= n; numerador++) {
            suma += (float) numerador / denominador;
            denominador = numerador + denominador;
        }
        System.out.println("El resultado de la sucesión es: " + suma);
    }

}
