public class PrecioTV1 {
	public static void main (String[] args) {
		float precio = 837;
		float iva;
		float total;

		iva = precio * (float) 0.12 ;
		total = precio + iva ;

		System.out.println("El total a pagar por el TV es: " + total);

	}
}