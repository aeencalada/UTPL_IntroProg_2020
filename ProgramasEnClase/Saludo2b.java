import java.util.*;
public class Saludo2b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre;
		System.out.print("Por favor, dime c\u00F3mo te llamas: ");
		nombre = sc.nextLine();
		System.out.print("Hola " + nombre);
		System.out.println(", \u00A1encantado de conocerte!");
	}
}