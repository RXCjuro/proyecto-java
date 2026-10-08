package producto;

public class ProductoInventario {
    // Atributos protegidos para que el hijo pueda acceder a ellos
    protected String nombre;
    protected double precioUnitario;
    protected int cantidadVenta;

    // Constructor
    public ProductoInventario(String nombre, double precioUnitario, int cantidadVenta) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidadVenta = cantidadVenta;
    }

    // Métodos de cálculo base
    public double calcularSubtotal() {
        return precioUnitario * cantidadVenta;
    }

    public double calcularIgv(double valorBase) {
        return valorBase * 0.18; // 18% de IGV
    }

    // Getters para el reporte en el Main
    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidadVenta() {
        return cantidadVenta;
    }
}
