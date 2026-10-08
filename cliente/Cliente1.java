package cliente;

public class Cliente1 {
    protected double compra;
    protected double edad;
    protected double tarjeta;

    public Cliente1(double compra, double edad, double tarjeta) {
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