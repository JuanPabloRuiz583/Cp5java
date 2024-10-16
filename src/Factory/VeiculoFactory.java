package Factory;

import Entities.Carro;
import Entities.Cliente;
import Entities.Moto;
import Entities.Veiculo;

public class VeiculoFactory {

    public static Veiculo criarVeiculo(String tipo, String modelo, String placa, Cliente cliente) {
        switch (tipo.toLowerCase()) {
            case "carro":
                return new Carro(modelo, placa, cliente);
            case "moto":
                return new Moto(modelo, placa, cliente);
            default:
                throw new IllegalArgumentException("Tipo de veículo inválido: " + tipo);
        }
    }
}
