public class Expresiones1 {
  public static void main(String[] args) {
    byte a = 4;
    byte b = 3;
    byte c = 5;
    boolean resultado;

    resultado = ( a > b + 2 ) & !( c + a == b * c );
  
    System.out.println("Dados a = "+ a + " ; b = " + b + " ; c = "+ c);
    System.out.println("\n( a > b + 2 ) & !( c + a == b * c ) = " + resultado);
  }
}

