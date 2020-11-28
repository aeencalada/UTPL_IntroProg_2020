import java.util.Scanner;

public class Notas1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float nota1, nota2, nota3, nota4, notaFinal;
		String status;

		System.out.println("\nNOTA FINAL DE ASIGANTURA");
		System.out.println("------------------------\n");
		System.out.print("Ingrese nota parcial 1 (sobre 10): ");
		nota1 = sc.nextFloat();
		System.out.print("Ingrese nota parcial 2 (sobre 10): ");
		nota2 = sc.nextFloat();
		System.out.print("Ingrese nota parcial 3 (sobre 10): ");
		nota3 = sc.nextFloat();
		System.out.print("Ingrese nota parcial 4 (sobre 10): ");
		nota4 = sc.nextFloat();

		notaFinal = ( nota1 + nota2 + nota3 + nota4 ) / 4;

		if (notaFinal >= 7) {
			status = "APRUEBA";
		} else {
			status = "REPRUEBA";
		}

		System.out.println("\nSu nota final es " + notaFinal + 
			", por consiguiente usted " + status + " la asignatura");
	}
}