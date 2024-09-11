package fake.vendedora.carros.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "estoque")
public class XmlVeiculoResponse {

    @JacksonXmlElementWrapper(localName = "veiculos")
    @JacksonXmlProperty(localName = "veiculo")
    private List<VeiculoXml> veiculos;

    public XmlVeiculoResponse() {}

    public XmlVeiculoResponse(List<VeiculoXml> veiculos) {
        this.veiculos = veiculos;
    }

    public List<VeiculoXml> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<VeiculoXml> veiculos) {
        this.veiculos = veiculos;
    }
}
