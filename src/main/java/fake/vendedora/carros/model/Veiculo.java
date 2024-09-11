package fake.vendedora.carros.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Veiculo {

    private int codigoVeiculo;
    private String marca;
    private String modelo;
    private int ano;
    private String versao;
    private String cor;
    private int km;
    private String combustivel;//', ['Gasolina', 'Álcool', 'Diesel', 'Elétrico', 'Híbrido', 'Flex'])->nullable();
    private String cambio;//', ['Manual', 'Automático'])->nullable();
    private int portas;
    private BigDecimal preco;
    private LocalDate date;
    private ArrayList<String> opcionais;


    public Veiculo(int codigoVeiculo, String marca, String modelo, int ano, String versao, String cor, int km, String combustivel, String cambio, int portas, BigDecimal preco, LocalDate date) {
        this.codigoVeiculo = codigoVeiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.versao = versao;
        this.cor = cor;
        this.km = km;
        this.combustivel = combustivel;
        this.cambio = cambio;
        this.portas = portas;
        this.preco = preco;
        this.date = date;
        this.opcionais = new ArrayList<String>();
    }

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

    public ArrayList getOpcionais() {
        return opcionais;
    }

    public void addOpcional(String opcional) {
        this.opcionais.add(opcional);
    }
}
