package Daos;

import Entities.Carro;
import java.util.HashMap;
import java.util.Map;

public class CarroDaoImpl implements CarroDao {
    private Map<String, Carro> carros = new HashMap<>();

    @Override
    public void salvar(Carro carro) {
        carros.put(carro.getPlaca(), carro);
    }

    @Override
    public Carro buscarPorPlaca(String placa) {

        return carros.get(placa);
    }



    public Map<String, Carro> listarCarros() {
        return carros;
    }
}