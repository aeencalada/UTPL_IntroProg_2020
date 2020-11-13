import java.util.Scanner;

public class ParImpar1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.print("Ingrese un número entero: ");
		numero = sc.nextInt();

		System.out.println();
		if (numero % 2 == 0) {
			System.out.println("El número es PAR");
		} else {
			System.out.println("El número es IMPAR");
		}
	}
}

