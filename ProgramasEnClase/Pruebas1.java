import java.util.Scanner;

public class Pruebas1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nombres;
    char apellidos;
    byte edad;
    int km_viajados;
    float estatura;

    System.out.print("Cuáles son sus nombres? ");
    nombres = sc.nextLine();
    System.out.print("Cuáles son sus apellidos? ");
    apellidos = sc.nextLine().charAt(0);

    System.out.println(nombres + " " + apellidos);
  }
}

