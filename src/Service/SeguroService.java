package Service;

import Daos.*;
import Entities.*;
import Factory.VeiculoFactory;
import java.util.Map;

public class SeguroService {
    private static SeguroService instance;
    private ClienteDAO clienteDAO;
    private CarroDao carroDAO;
    private MotoDao motoDAO;

    private SeguroService() {
        clienteDAO = new ClienteDAOImpl();
        carroDAO = new CarroDaoImpl();
        motoDAO = new MotoDaoImpl();
    }

    public static SeguroService getInstance() {
        if (instance == null) {
            instance = new SeguroService();
        }
        return instance;
    }

    public void cadastrarCliente(String nome, String documento) {
        Cliente cliente = new Cliente(nome, documento);
        clienteDAO.salvar(cliente);
    }

    public void cadastrarVeiculo(String tipo, String modelo, String placa, String documentoCliente) {
        Cliente cliente = clienteDAO.buscar(documentoCliente);
        if (cliente != null) {
            Veiculo veiculo = VeiculoFactory.criarVeiculo(tipo, modelo, placa, cliente);
            if (veiculo instanceof Carro) {
                carroDAO.salvar((Carro) veiculo);
            } else if (veiculo instanceof Moto) {
                motoDAO.salvar((Moto) veiculo);
            }
        }
    }

    public double calcularPremioSeguro(String documento, double valor) {
        Cliente cliente = clienteDAO.buscar(documento);
        if (cliente != null) {
            Seguro seguro = new Seguro(cliente, valor);
            return seguro.calcularPremio();
        }
        return 0;
    }

    public Map<String, Cliente> listarClientes() {
        return ((ClienteDAOImpl) clienteDAO).listarClientes();
    }

    public Map<String, Carro> listarCarros() {
        return ((CarroDaoImpl) carroDAO).listarCarros();
    }

    public Map<String, Moto> listarMotos() {
        return ((MotoDaoImpl) motoDAO).listarMotos();
    }
}