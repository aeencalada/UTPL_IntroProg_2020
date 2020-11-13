import java.util.Scanner;

public class MayorMenorEdad1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		short anioNac, anioAct;
		byte edad;

		System.out.print("Ingrese su año de nacimiento: ");
		anioNac = sc.nextShort();
		System.out.print("Ingrese el año actual: ");
		anioAct = sc.nextShort();

		edad = (byte) (anioAct - anioNac);

		if (edad >= 18) {
			System.out.println("\nUsted es MAYOR DE EDAD");
		} else {
			System.out.println("\nUsted es MENOR DE EDAD");
		}
	}
}