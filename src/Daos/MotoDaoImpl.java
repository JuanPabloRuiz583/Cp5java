package Daos;

import Entities.Moto;
import java.util.HashMap;
import java.util.Map;

public class MotoDaoImpl implements MotoDao {
    private Map<String, Moto> motos = new HashMap<>();

    @Override
    public void salvar(Moto moto) {
        motos.put(moto.getPlaca(), moto);
    }

    @Override
    public Moto buscarPorPlaca(String placa) {
        return motos.get(placa);
    }



    public Map<String, Moto> listarMotos() {
        return motos;
    }
}