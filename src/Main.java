import Service.SeguroService;
import Entities.Cliente;
import Entities.Carro;
import Entities.Moto;

public class Main {
    public static void main(String[] args) {
        SeguroService service = SeguroService.getInstance();

        // Cadastrando clientes
        service.cadastrarCliente("João Silva", "123456789");
        service.cadastrarCliente("Maria Oliveira", "987654321");

        // Cadastrando veículos
        service.cadastrarVeiculo("carro", "Fusca", "ABC-1234", "123456789");
        service.cadastrarVeiculo("carro", "Civic", "XYZ-5678", "987654321");
        service.cadastrarVeiculo("moto", "XRE", "MNO-9101", "123456789");
        service.cadastrarVeiculo("moto", "Fazer", "DEF-2345", "987654321");

        // Calculando prêmio de seguro
        double premioJoao = service.calcularPremioSeguro("123456789", 10000);
        System.out.println("Prêmio do seguro de João: R$ " + premioJoao);

        double premioMaria = service.calcularPremioSeguro("987654321", 15000);
        System.out.println("Prêmio do seguro de Maria: R$ " + premioMaria);

        // Listando clientes
        System.out.println("Clientes cadastrados:");
        for (Cliente cliente : service.listarClientes().values()) {
            System.out.println(cliente.getNome() + " - " + cliente.getDocumento());
        }

        // Listando carros
        System.out.println("Carros cadastrados:");
        for (Carro carro : service.listarCarros().values()) {
            System.out.println(carro.getModelo() + " - " + carro.getPlaca());
        }

        // Listando motos
        System.out.println("Motos cadastradas:");
        for (Moto moto : service.listarMotos().values()) {
            System.out.println(moto.getModelo() + " - " + moto.getPlaca());
        }
    }
}