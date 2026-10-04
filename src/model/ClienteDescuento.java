package src.model;

public class ClienteDescuento extends Cliente1 {

    public ClienteDescuento(double compra, double edad, double tarjeta) {
        super(compra, edad, tarjeta);
    }

    public double calcularDescuento() {

        double descuento = 0;

        if (tarjeta == 1 && edad >= 60) {
            descuento = compra * 0.20;
        } else if (edad >= 60) {
            descuento = compra * 0.15;
        } else if (tarjeta == 1) {
            descuento = compra * 0.10;
        }

        return descuento;
    }

    public void mostrarResultado() {

        double descuento = calcularDescuento();
        double total = compra - descuento;

        System.out.println("Compra: S/. " + compra);
        System.out.println("Descuento: S/. " + descuento);
        System.out.println("Total a pagar: S/. " + total);
    }
}