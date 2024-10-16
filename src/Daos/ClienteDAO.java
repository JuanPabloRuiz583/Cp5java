package Daos;

import Entities.Cliente;

public interface ClienteDAO {
    void salvar(Cliente cliente);
    Cliente buscar(String documento);
}
