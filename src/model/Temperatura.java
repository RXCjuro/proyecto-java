package src.model;

public class Temperatura {

    protected double valor;

    public Temperatura(double valor) {
        this.valor = valor;
    }

    public boolean esOptima() {
        return valor >= 2 && valor <= 8;
    }
}
