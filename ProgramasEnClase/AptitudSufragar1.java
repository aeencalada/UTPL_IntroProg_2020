import java.util.Scanner;

public class AptitudSufragar1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    short anioNac, anioAct;
    byte edad;

    System.out.print("Ingrese su año de nacimiento: ");
    anioNac = sc.nextShort();
    System.out.print("Ingrese el año actual: ");
    anioAct = sc.nextShort();

    edad = (byte) (anioAct - anioNac);

    if (edad < 0) {
        System.out.println("\n¡Datos incorrectos! " + 
            "El año actual no puede ser menor al año de nacimiento");
    } else if (edad < 16) {
        System.out.println("\nUsted no puede votar");
    } else if (edad < 18) {
        System.out.println("\nUsted puede votar opcionalmente");
    } else if (edad < 65) {
        System.out.println("\nUsted debe votar obligatoriamente");
    } else {
        System.out.println("\nUsted puede votar opcionalmente");
    }
  }
}
