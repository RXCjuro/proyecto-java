package producto;

public class ProductoDescuento extends ProductoInventario {

    // Constructor que invoca al padre usando super()
    public ProductoDescuento(String nombre, double precioUnitario, int cantidadVenta) {
        super(nombre, precioUnitario, cantidadVenta);
    }

    // Método propio del hijo para calcular el descuento condicional
    public double calcularDescuento() {
        double subtotal = calcularSubtotal();
        if (subtotal > 100.0) {
            return subtotal * 0.10; // 10% de descuento
        }
        return 0.0;
    }

    // Calcula el valor neto después de aplicar el descuento
    public double calcularValorConDescuento() {
        return calcularSubtotal() - calcularDescuento();
    }

    // Calcula el total definitivo sumando el IGV al valor con descuento
    public double calcularTotalAPagar() {
        double valorConDesc = calcularValorConDescuento();
        return valorConDesc + calcularIgv(valorConDesc);
    }
}
