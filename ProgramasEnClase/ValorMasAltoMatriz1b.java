package valormasaltomatriz1b;

import java.util.Scanner;

public class ValorMasAltoMatriz1b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n, m;
        int mayor;
        String pos = "";
        //Ingresar el tamaño de la matriz
        System.out.print("¿Cuántas filas tiene la matriz? ");
        n = sc.nextShort();
        System.out.print("¿Cuántas columnas tiene la matriz? ");
        m = sc.nextShort();
        //Definir y dimensionar la matriz
        int[][] m_num = new int[n][m];
        //Poblar la matriz
        System.out.println("\nIngrese los valores de la matriz");
        System.out.println("--------------------------------");
        for (short i = 0; i <= n - 1; i++) {
            for (short j = 0; j <= m - 1; j++) {
                System.out.print("Ingrese elemento de la posición [" + (i + 1)
                        + "," + (j + 1) + "]: ");
                m_num[i][j] = sc.nextInt();
            }
        }
        //Determinar valor más alto y posiciones
        mayor = m_num[0][0];
        for (short i = 0; i <= n - 1; i++) {
            for (short j = 0; j <= m - 1; j++) {
                if (m_num[i][j] > mayor) {
                    mayor = m_num[i][j];
                }
            }
        }
        for (short i = 0; i <= n - 1; i++) {
            for (short j = 0; j <= m - 1; j++) {
                if (m_num[i][j] == mayor) {
                    pos = pos + "[" + (i + 1) + "," + (j + 1) + "] ";
                }
            }
        }
        //Mostrar valor más alto y posicion(es)
        System.out.println("\nValor más alto: " + mayor);
        System.out.println("Posición(es): " + pos);
    }
}
