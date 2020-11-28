import java.util.Scanner;

public class NotaCualitativa1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float nota;
		String status;

		System.out.println("\nNOTA CUALITATIVA EQUIVALENTE");
		System.out.println("----------------------------\n");
		System.out.print("Ingrese la nota sobre 10: ");
		nota = sc.nextFloat();


		if (nota < 0 || nota > 10) {
			System.out.println("\nLa nota ingresada es incorrecta");
		} else {
			if (nota < 5) {
				status = "SUSPENSO";	
			} else if (nota < 6.5) {
				status = "APPROBADO";
			} else if (nota < 8.5) {
				status = "NOTABLE";
			} else if (nota < 10) {
				status = "SOBRESALIENTE";
			} else {
				status = "MATRÍCULA DE HONOR";
			}
			System.out.println("\nSu calificación cualitativa es " + status);
		}
	}
}