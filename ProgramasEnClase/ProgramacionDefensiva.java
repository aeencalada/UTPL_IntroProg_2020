package programaciondefensiva;

import java.util.Scanner;

public class ProgramacionDefensiva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Raiz cuadrada de un número");
        System.out.println("==========================\n");
        boolean datoValido = false;
        while (!datoValido) {
            try {
                System.out.print("Por favor ingrese un número entero positivo: ");
                num = sc.nextInt();
                if (num < 0) {
                    throw new Exception("Número no positivo");
                }
                datoValido = true;
            } catch (Exception e) {
                System.out.print("\nValor no válido\n");
                sc.next();
            }
        }
        System.out.println("\nRaiz cuadrada: " + Math.sqrt(num));
    }

}
