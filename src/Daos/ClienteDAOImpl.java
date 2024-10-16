package Daos;

import Entities.Cliente;
import java.util.HashMap;
import java.util.Map;

public class ClienteDAOImpl implements ClienteDAO {
    private Map<String, Cliente> clientes = new HashMap<>();

    @Override
    public void salvar(Cliente cliente) {
        clientes.put(cliente.getDocumento(), cliente);
    }

    @Override
    public Cliente buscar(String documento) {
        return clientes.get(documento);
    }

    public Map<String, Cliente> listarClientes() {
        return clientes;
    }
}