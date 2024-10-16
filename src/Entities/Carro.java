package Entities;

public class Carro implements Veiculo {
    private String modelo;
    private String placa;
    private Cliente cliente;

    public Carro(String modelo, String placa, Cliente cliente) {
        this.modelo = modelo;
        this.placa = placa;
        this.cliente = cliente;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public Cliente getCliente() {
        return cliente;
    }
}

