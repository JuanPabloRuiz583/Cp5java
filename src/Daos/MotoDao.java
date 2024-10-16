package Daos;

import Entities.Moto;

public interface MotoDao {
    void salvar(Moto moto);
    Moto buscarPorPlaca(String placa);
}

