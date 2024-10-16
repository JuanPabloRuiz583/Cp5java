package Daos;

import Entities.Carro;

public interface CarroDao {
    void salvar(Carro carro);
    Carro buscarPorPlaca(String placa);
}
