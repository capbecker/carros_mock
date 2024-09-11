package fake.vendedora.carros.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class VeiculoXml {

    @JacksonXmlProperty(localName = "id")
    private int codigoVeiculo;

    @JacksonXmlProperty(localName = "marca")
    private String marca;

    @JacksonXmlProperty(localName = "modelo")
    private String modelo;

    @JacksonXmlProperty(localName = "ano")
    private int ano;

    @JacksonXmlProperty(localName = "versao")
    private String versao;

    @JacksonXmlProperty(localName = "cor")
    private String cor;

    @JacksonXmlProperty(localName = "quilometragem")
    private int km;

    @JacksonXmlProperty(localName = "tipocombustivel")
    private String combustivel;

    @JacksonXmlProperty(localName = "cambio")
    private String cambio;

    @JacksonXmlProperty(localName = "portas")
    private int portas;

    @JacksonXmlProperty(localName = "precoVenda")
    private BigDecimal preco;

    @JacksonXmlProperty(localName = "data")
    private LocalDate date;

    @JacksonXmlElementWrapper(localName = "opcionais")
    @JacksonXmlProperty(localName = "opcional")
    private List<String> opcionais;

    public int getCodigoVeiculo() {
        return codigoVeiculo;
    }

    public void setCodigoVeiculo(int codigoVeiculo) {
        this.codigoVeiculo = codigoVeiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<String> getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(List<String> opcionais) {
        this.opcionais = opcionais;
    }
}
