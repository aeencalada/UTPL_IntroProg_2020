package presionarterial1;

import java.util.Scanner;

public class PresionArterial1 {
    public static void main(String[] args) {
        //Variables
        Scanner sc = new Scanner(System.in);
        short n, c, grado, suma, b;
        float resultado;
        
        //Entrada de datos        
        System.out.println("Ingreso de medidas de Presión Arterial");
        System.out.println("======================================");
        
        System.out.print("\n¿A cuántas personas se midió la presión?: ");
        n = sc.nextShort();
        
        //Desarrollo del problema
        c = 1;
        suma = 0;
        b = 0;
        
        System.out.println("\n");
        
        while (c <= n) {
            System.out.print("Ingrese la medida de PA de la persona " + c + ": ");
            grado = sc.nextShort();
            if (grado < 80) {
                System.out.println("** HIPOTENSO **");
            } else if (grado >= 80 && grado <= 119) {
                System.out.println("** NORMAL **");
                
            } else if (grado >= 120 && grado <= 139) {
                System.out.println("** PREHIPERTENSO **");
                
            } else if (grado >= 140 && grado <= 159) {
                System.out.println("** HIPERTENSO GRADO 1 **");
                b = (short)(b + 1);
                
            } else {
                System.out.println("** HIPERTENSO GRADO 2 **");
                b = (short)(b + 1);
            }
            suma = (short)(suma + grado);
            c = (short) (c + 1);
        }
        resultado = (float)((b * 100) / (float)(n));
        
        System.out.println("Porcentaje de HIPERTENSOS: " + resultado + "%");
    }
}
