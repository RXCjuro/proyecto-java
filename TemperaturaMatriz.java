import java.util.Scanner;

public class TemperaturaMatriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("=== MONITOR DE TEMPERATURA ===");
        // Temperatura optimas permitidos es de 2°C a 8° C
        // Temperartura fuera de rango menores de 2°C o mayores de 8°C
        // 3 días y 3 horarios
        double[][] temperaturas = new double[3][3];
        int optimas = 0;
        int fueraRango = 0;
        String[] horarios = { "Mañana", "Mediodía", "Noche" };

        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- DÍA " + (i + 1) + " ---");

            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese temperatura de " + horarios[j] + ": ");
                temperaturas[i][j] = entrada.nextDouble();

                if (temperaturas[i][j] >= 2 && temperaturas[i][j] <= 8) {
                    System.out.println("Temperatura óptima.");
                    optimas++;
                } else {
                    System.out.println("Temperatura fuera del rango.");
                    fueraRango++;
                }
            }
        }
        System.out.println("\n==============================");
        System.out.println("RESULTADO FINAL");
        System.out.println("==============================");
        System.out.println("Temperaturas óptimas: " + optimas);
        System.out.println("Temperaturas fuera de rango: " + fueraRango);
        entrada.close();
    }
}