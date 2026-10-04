package src.model;

public class Cliente {
    protected double compra;
    protected double edad;
    protected double tarjeta;

    public Cliente(double compra, double edad, double tarjeta) {
        this.compra = compra;
        this.edad = edad;
        this.tarjeta = tarjeta;
    }

    public void mostrarInformacion() {
        System.out.println("Compra: S/. " + compra);
        System.out.println("Edad: " + edad);
        System.out.println("Tarjeta: " + tarjeta);
    }
}