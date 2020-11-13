// Solución solo del caso 3
public class Expresiones3 {
    public static void main (String[] args){
        // Declaración de variables
        float tam_fotos_hd_GB;
        float tam_fotos_sd_GB;
        float tam_videos_GB;
        float total_MS;     // Cantidad de Memory Sticks

        // Cálculos Problema 3
        tam_fotos_hd_GB = (float) 500 * 64 / 1024;
        tam_fotos_sd_GB = (float) 2000 * 8300 / 1024 / 1024;
        tam_videos_GB = 50 * 4;
        total_MS = ( tam_fotos_hd_GB + tam_fotos_sd_GB + tam_videos_GB ) / 32;

        // SALIDAS
        System.out.println("UNIDADES DE ALMACENAMIENTO");
        System.out.println("==========================");
        System.out.println("\nProblema 3:");
        System.out.print("Un fotógrafo utiliza una cámara de alta definición para capturar");
        System.out.print(" fotos panorámicas en excursiones a reservas naturales. Para ");
        System.out.println("almacenar las fotos lleva Memory Sticks de 32GB cada una. " + 
                         "¿Cuántos Memory Stick debe llevar para almacenar 500 fotos de " + 
                         "alta definición de 64MB cada una, 2000 fotos de mediana " +
                         "definición de 8300KB cada una y 50 videos de 4GB cada uno?\n");
        System.out.println("El fotógrafo debe llevar " + total_MS + " Memory Sticks");

    }
}
