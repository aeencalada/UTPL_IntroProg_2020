public class PrecioTV1c {
	public static void main (String[] args) {
		float precio = 837;
		float iva;
		float total;

		iva = precio * 12 / 100 ;
		total = precio + iva ;

		System.out.println("El total a pagar por el TV es: " + total);

	}
}