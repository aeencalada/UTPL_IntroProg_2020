package simplificafraccion1;

import java.util.Scanner;

public class SimplificaFraccion1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, den, num_s, den_s, div;
        System.out.print("Ingrese numerador: ");
        num = sc.nextInt();
        System.out.print("Ingrese denominador: ");
        den = sc.nextInt();
        num_s = num;
        den_s = den;
        div = num_s;
        if (den_s < num_s) {
            div = den;
        }
        while (div >= 2) {
            if ((num_s % div == 0) && (den_s % div == 0)) {
                num_s = num_s / div;
                den_s = den_s / div;
                div = num_s;
                if (den_s < num_s) {
                    div = den_s;
                }
            } else {
                div--;
            }

        }
        System.out.println("\nLa fracción " + num + "/" + den
                + " simplificada es igual a " + num_s + "/" + den_s);
    }

}
