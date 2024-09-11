package fake.vendedora.carros.model;

import java.util.List;

public class GSonVeiculoResponse {

    private List<Veiculo> veiculos;

    public GSonVeiculoResponse(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}
