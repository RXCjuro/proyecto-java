package src.model;

public class MonitorTemperatura extends Temperatura {

    public MonitorTemperatura(double valor) {
        super(valor);
    }

    public void mostrarResultado() {

        if (esOptima()) {
            System.out.println("Temperatura óptima.");
        } else {
            System.out.println("Temperatura fuera del rango.");
        }
    }
}