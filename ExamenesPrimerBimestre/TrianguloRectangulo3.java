import java.util.Scanner;

public class TrianguloRectangulo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short lado1, lado2, lado3;

		System.out.println("\nLADOS DE UN TRIÁNGULO RECTANGULO");
		System.out.println("--------------------------------\n");
		System.out.print("Ingrese el lado 1: ");
		lado1 = sc.nextShort();
		System.out.print("Ingrese el lado 2: ");
		lado2 = sc.nextShort();
		System.out.print("Ingrese el lado 3: ");
		lado3 = sc.nextShort();

		if (Math.pow(lado1,2) == Math.pow(lado2,2) + Math.pow(lado3,2)) {
			System.out.println("\nSI corresponden a los lados de un triángulo rectángulo");
		} else if (Math.pow(lado2,2) == Math.pow(lado1,2) + Math.pow(lado3,2)) {
			System.out.println("\nSI corresponden a los lados de un triángulo rectángulo");
		} else if (Math.pow(lado3,2) != Math.pow(lado1,2) + Math.pow(lado2,2)) {
			System.out.println("\nNO corresponden a los lados de un triángulo rectángulo");
		} else {
			System.out.println("\nSI corresponden a los lados de un triángulo rectángulo");
		}
	}
}