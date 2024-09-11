package fake.vendedora.carros.converter;

import fake.vendedora.carros.model.Veiculo;
import fake.vendedora.carros.model.VeiculoXml;

import java.util.List;
import java.util.stream.Collectors;

public class VeiculoConverter {

    public static VeiculoXml convertToVeiculoXml(Veiculo veiculo) {
        if (veiculo == null) {
            return null;
        }
        VeiculoXml veiculoXml = new VeiculoXml();
        veiculoXml.setCodigoVeiculo(veiculo.getCodigoVeiculo());
        veiculoXml.setMarca(veiculo.getMarca());
        veiculoXml.setModelo(veiculo.getModelo());
        veiculoXml.setAno(veiculo.getAno());
        veiculoXml.setVersao(veiculo.getVersao());
        veiculoXml.setCor(veiculo.getCor());
        veiculoXml.setKm(veiculo.getKm());
        veiculoXml.setCombustivel(veiculo.getCombustivel());
        veiculoXml.setCambio(veiculo.getCambio());
        veiculoXml.setPortas(veiculo.getPortas());
        veiculoXml.setPreco(veiculo.getPreco());
        veiculoXml.setDate(veiculo.getDate());
        veiculoXml.setOpcionais(veiculo.getOpcionais());
        return veiculoXml;
    }

    public static List<VeiculoXml> convertToVeiculoXmlList(List<Veiculo> veiculos) {
        return veiculos.stream()
                       .map(VeiculoConverter::convertToVeiculoXml)
                       .collect(Collectors.toList());
    }
}
