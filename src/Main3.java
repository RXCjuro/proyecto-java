package src;

import java.util.Scanner;
import src.model.MonitorTemperatura;

public class Main3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("=== MONITOR DE TEMPERATURA ===");

        MonitorTemperatura[][] temperaturas = new MonitorTemperatura[3][3];

        int optimas = 0;
        int fueraRango = 0;

        String[] horarios = {
                "Mañana",
                "Mediodía",
                "Noche"
        };

        for (int i = 0; i < 3; i++) {

            System.out.println("\n--- DÍA " + (i + 1) + " ---");

            for (int j = 0; j < 3; j++) {

                System.out.print(
                        "Ingrese temperatura de "
                                + horarios[j] + ": ");

                double valor = entrada.nextDouble();

                temperaturas[i][j] = new MonitorTemperatura(valor);

                temperaturas[i][j].mostrarResultado();

                if (temperaturas[i][j].esOptima()) {
                    optimas++;
                } else {
                    fueraRango++;
                }
            }
        }

        System.out.println("\n==============================");
        System.out.println("RESULTADO FINAL");
        System.out.println("==============================");

        System.out.println(
                "Temperaturas óptimas: " + optimas);

        System.out.println(
                "Temperaturas fuera de rango: " + fueraRango);

        entrada.close();
    }
}