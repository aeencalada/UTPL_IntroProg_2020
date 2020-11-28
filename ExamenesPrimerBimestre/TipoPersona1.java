import java.util.Scanner;

public class TipoPersona1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte edad;
		String tipo;

		System.out.println("\nTIPO DE PERSONA SEGÚN SU EDAD");
		System.out.println("-----------------------------\n");
		System.out.print("Ingrese su edad en años: ");
		edad = sc.nextByte();

		if (edad < 0) {
			System.out.println("\nLa edad ingresada es incorrecta");
		} else {
			if (edad <= 13) {
				tipo = "INFANTE";	
			} else if (edad <= 17) {
				tipo = "ADOLESCENTE";	
			} else if (edad <= 23) {
				tipo = "JOVEN";	
			} else if (edad <= 65) {
				tipo = "ADULTO";	
			} else {
				tipo = "ADULTO MAYOR";	
			}
			System.out.println("\nUsted es un " + tipo);
		}
	}
}