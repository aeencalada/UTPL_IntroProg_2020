package convertidortemp1;

// Convertidor temperatura
import java.util.Scanner;

public class ConvertidorTemp1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float grados, conversion;
        String unidad;
        System.out.print("Ingrese la temperatura: ");
        grados = sc.nextFloat();
        System.out.print("Indique la unidad de medida (C o F): ");
        unidad = sc.next();
        if (unidad.equals("F")) {
            conversion = (float) 5 / 9 * (grados - 32);
            System.out.println("\nLa temperatura en grados Celsius es "
                    + conversion);
        } else {
            conversion = (float) 9 / 5 * grados + 32;
            System.out.println("\nLLa temperatura en grados Fahrenheit es "
                    + conversion);
        }
    }
}
