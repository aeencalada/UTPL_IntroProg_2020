// Solución solo de algunas de las expresiones planteadas
public class Expresiones2 {
	public static void main (String[] args){
		float resp1;
		float resp2;
		byte a = 100;
		byte b = -12;
		short c = 4000;
		byte d = 5;
		byte e = 0;
		boolean resp6;

		System.out.println("EVALUACIÓN DE EXPRESIONES");
		System.out.println("=========================\n");

		resp1 = 2 * (float) 8 / 2 / 2 - 22 * (float) 4 / 8 - ( 100 + 25 ) / (float) Math.pow(5,2);

		System.out.println("Expresión 1:");
		System.out.println("    2 * 8 / 2 / 2 – 22 * 4 / 8 - (100 + 25) / 5 ^ 2");
		System.out.println("Resultado:");
		System.out.println("    " + resp1);

		resp2 = (float) ( ( 2 * 16.0 / Math.pow(2,3) - 4 ) + 32 - ( 125.0 / 5 / 5 + 3 ) );

		System.out.println("\nExpresión 2:");
		System.out.println("    ( 2 * 16 / 2 ^ 3 – 4 ) + 32 - ( 125 / 5 / 5 + 3 )");
		System.out.println("Resultado:");
		System.out.println("    " + resp2);

		resp6 = ( a + b * c + e ) <= e * d * b && ( (float) c / a + e - d ) < e + d - c + b * a;

		System.out.println("\nExpresión 6:");
		System.out.println("    (a + b * c + e) <= e * d * b AND (c / a + e - d) < e + d – c + b * a");
		System.out.println("    donde: a = 100 , b = -12 , c = 4000 , d = 5 , e = 0");
		System.out.println("Resultado:");
		System.out.println("    " + resp6);

	}
}