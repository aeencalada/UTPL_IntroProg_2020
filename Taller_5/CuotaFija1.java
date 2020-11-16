import java.util.Scanner;

public class CuotaFija1 {
    public static void main(String[] args) {
        // Declaracion de variables
  	    Scanner sc = new Scanner(System.in);
        byte plazo; // Plazo en meses
        float monto, interes_anual, interes_mensual;
        float cuota_parcial, seguro_des, cuota_final;

  	    // Titulo
  	    System.out.print("\nCalculo de la cuota fija de un prestamo\n");
        System.out.println("========================================\n");
        // Entradas de datos
  	    System.out.print("Ingrese monto total del prestamo: ");
        monto = sc.nextFloat();
        System.out.print("Ingrese plazo para pago de prestamo (en meses): ");
        plazo = sc.nextByte();
        System.out.print("Ingrese tasa de interes anual: ");
        interes_anual = sc.nextFloat();

        // Validar plazo mínimo
        if (plazo < 3) {
    	    System.out.println("Error, el plazo no puede ser inferior a 3");
        } else {
    	    if (plazo > 36 && monto < 20000) {
    			System.out.println("Error, el plazo no puede ser mayor a 36 en " +
    			"prestamos inferiores a USD 20000");
    	    } else {
    		// Calculo de la cuota
    		    interes_mensual = interes_anual / 12 / 100;
    		    cuota_parcial = (float) (monto * ((interes_mensual * Math.pow((1 + interes_mensual),plazo)) / (Math.pow((1 + interes_mensual), plazo) - 1)));
    		    seguro_des = (float) (cuota_parcial * 0.05 / 100);
    		    cuota_final = (float) (cuota_parcial + seguro_des);
    		    // Presentacion de datos
    		    System.out.println("\nLA CUOTA MENSUAL A PAGAR ASCIENDE A: " + cuota_final);
    	    }	
    	}
    }
}
    