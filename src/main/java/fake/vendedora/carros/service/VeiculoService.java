package fake.vendedora.carros.service;

import fake.vendedora.carros.converter.VeiculoConverter;
import fake.vendedora.carros.model.Veiculo;
import fake.vendedora.carros.model.VeiculoXml;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class VeiculoService {

    private final String[] OPCOES_COMBUSTIVEl = {"Gasolina", "Álcool", "Diesel", "Elétrico", "Híbrido", "Flex"};
    private final String[] OPCOES_CAMBIO = {"Manual", "Automático"};
    private final String[] OPCOES_MARCA_MODELO = {"Volkswagen|Gol", "Fiat|Uno", "Chevrolet|Onix", "Hyundai|HB20", "Ford|Ka","Renault|Kwid", "Toyota|Etios"};
    private final String[] OPCOES_COR = {"Prata", "Preto", "Branco", "Vermelho", "Azul", "Amarelo", "Verde", "Laranja", "Roxo"};
    private final String[] OPCOES_OCPCIONAIS = {"Vidro Eletrico", "Direção Hidraulica", "Trava Elétrica", "Ar Codicionado", "Teto Solar", "Farois de LED"};

    private static String getRandomElement(String[] array, Random random) {
        int index = random.nextInt(array.length);
        return array[index];
    }

    private Veiculo generateVeiculo(Integer paramCodigoVeiculo) {
        Random random = new Random();
        Integer codigoVeiculo = paramCodigoVeiculo==null? random.nextInt((2000 - 1000)):paramCodigoVeiculo;
        String marca_modelo[] = getRandomElement(OPCOES_MARCA_MODELO,random).split("\\|");
        int ano = random.nextInt((2024 - 1950))+1950;
        String versao="XX";
        String cor = getRandomElement(OPCOES_COR,random);
        int km = random.nextInt((10000));
        String combustivel= getRandomElement(OPCOES_COMBUSTIVEl,random);
        String cambio= getRandomElement(OPCOES_CAMBIO,random);
        int portas=2;
        BigDecimal preco = BigDecimal.valueOf(random.nextFloat(100000)+10000);
        LocalDate date = LocalDate.now();
        Veiculo veiculo = new Veiculo(
            codigoVeiculo, marca_modelo[0], marca_modelo[1], ano, versao, cor, km,
            combustivel, cambio, portas, preco, date);
        int qtd_opcionais = random.nextInt(5);
        for (int i=0; i<=qtd_opcionais; i++) {
            String opcional = getRandomElement(OPCOES_OCPCIONAIS,random);
            if (!veiculo.getOpcionais().contains(opcional)) {
                veiculo.addOpcional(opcional);
            }
        }
        return veiculo;
    }

    public List<Veiculo> getRngVeiculos(){
        List<Veiculo> listVeiculos = new ArrayList<>();
        //listVeiculos.add(generateVeiculo(2244));
        listVeiculos.add(generateVeiculo(null));
        listVeiculos.add(generateVeiculo(null));
        listVeiculos.add(generateVeiculo(null));
        return listVeiculos;
    }

    public List<VeiculoXml> getRngVeiculosXml(){
        return VeiculoConverter.convertToVeiculoXmlList(getRngVeiculos());
    }
}
