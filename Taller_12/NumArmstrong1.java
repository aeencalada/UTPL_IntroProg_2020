package numarmstrong1;

import java.util.Scanner;

public class NumArmstrong1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Ingrese un número entero positivo: ");
        num = sc.nextInt();
        if (esNumeroArmstrong(num)) {
            System.out.println("SI, el número ingreado es de Armstrong");
        } else {
            System.out.println("NO, el número ingreado no es de Armstrong");
        }

    }

    // Función que cuenta los dítigos de un número entero positivo
    public static int contarDigitos(int x) {
        int dig = 1;
        while (x > 9) {
            x = x / 10;
            dig++;
        }
        return dig;
    }

    // Función que determina si un número entero es narcisista 
    public static boolean esNumeroArmstrong(int x) {
        int dig = contarDigitos(x);
        int cociente = x;
        int residuo = cociente % 10;
        int suma = (int) Math.pow(residuo, dig);
        while (cociente > 9) {
            cociente = cociente / 10;
            residuo = cociente % 10;
            suma += (int) Math.pow(residuo, dig);
        }

        return (suma == x);
    }

}
