package Entities;

public class Seguro {
    private Cliente cliente;
    private double valor;

    public Seguro(Cliente cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    public double calcularPremio() {
        // Lógica simplificada para calcular o prêmio
        return valor * 0.05;
    }
}




