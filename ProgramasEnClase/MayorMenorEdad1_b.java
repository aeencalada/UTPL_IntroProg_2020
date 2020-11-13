import java.util.Scanner;

public class MayorMenorEdad1b {
	public static void main (String[] args) {
		// Declaración de variables
		Scanner sc = new Scanner(System.in);
		short anioAct, anioNac;
		byte edad;
		String mensaje;

		// Entrada de datos
		System.out.print("Ingrese su año de nacimiento: ");
		anioNac = sc.nextShort();
		System.out.print("Ingrese el año actual: ");
		anioAct = sc.nextShort();

		// Proceso
		edad = (byte) (anioAct - anioNac);

		if (edad >= 18) {
			mensaje = "MAYOR DE EDAD";
		} else {
			mensaje = "MENOR DE EDAD";
		}

		// Salida de información
		System.out.println("\nUsted es " + mensaje);
	}
}