import java.util.Scanner;

public class TrianguloRectangulo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short val1, val2, val3;

		System.out.println("\nValidando lados de un tríangulo rectángulo");
		System.out.println("------------------------------------------\n");
		System.out.print("Ingrese valor 1: ");
		val1 = sc.nextShort();
		System.out.print("Ingrese valor 2: ");
		val2 = sc.nextShort();
		System.out.print("Ingrese valor 3: ");
		val3 = sc.nextShort();

		if (Math.pow(val1,2) == Math.pow(val2,2) + Math.pow(val3,2)) {
			System.out.println("\nLos números SI corresponden a los lados de un triángulo rectángulo");
		} else if (Math.pow(val2,2) == Math.pow(val1,2) + Math.pow(val3,2)) {
			System.out.println("\nLos números SI corresponden a los lados de un triángulo rectángulo");
		} else if (Math.pow(val3,2) == Math.pow(val1,2) + Math.pow(val2,2)) {
			System.out.println("\nLos números SI corresponden a los lados de un triángulo rectángulo");
		} else {
			System.out.println("\nLos números NO corresponden a los lados de un triángulo rectángulo");
		}
	}
}