package br.com.LojaDeCelulares.Projeto.Orientacao.Objetos.modelo;

import br.com.LojaDeCelulares.Projeto.Orientacao.Objetos.enumerador.EnumMarca;

public class Celulares {

    // Abstração, Encapsulamento e Modificadores de acesso

    private int idDoProduto;
    private EnumMarca marca;
    private String sistemaOperacional;
    private double tamanhoDeDisplay;
    private String cameraTraseira;
    private String cameraFrontal;
    private String processador;
    private String memoriaRam;
    private String memoriaInterna;
    private String cor;
    private int garantiaEmMeses;
    private String modelo;
    private double preco;
    private int estoqueAtual;
    private double caixaInicial = 1000.00;
    private static int quantidadeDeProdutos;


    public Celulares(){
        atualizarQuantidadeDeProdutos();
    }

    public Celulares(EnumMarca marca) {  // Consttrutor
        atualizarQuantidadeDeProdutos();
        this.marca = marca;
    }

    private void atualizarQuantidadeDeProdutos(){
        quantidadeDeProdutos ++;
    }



    // Métodos
    public void reduzirProdutoEmEstoque(int quantidadeVendida){
        estoqueAtual -= quantidadeVendida;
    }

    public void adicionarProdutoEmEstoque(int quantidadeVendida) {
        estoqueAtual += quantidadeVendida;
    }

    public void caixa(int quantidadeVendida){
        caixaInicial += preco * quantidadeVendida;
    }



    // Encapsulamento

    public int getIdDoProduto() {
        return idDoProduto;
    }

    public void setIdDoProduto(int idDoProduto) {
        this.idDoProduto = idDoProduto;
    }

    public EnumMarca getMarca() {
        return marca;
    }

    public void setMarca(EnumMarca marca) {
        this.marca = marca;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public double getTamanhoDeDisplay() {
        return tamanhoDeDisplay;
    }

    public void setTamanhoDeDisplay(double tamanhoDeDisplay) {
        this.tamanhoDeDisplay = tamanhoDeDisplay;
    }

    public String getCameraTraseira() {
        return cameraTraseira;
    }

    public void setCameraTraseira(String cameraTraseira) {
        this.cameraTraseira = cameraTraseira;
    }

    public String getCameraFrontal() {
        return cameraFrontal;
    }

    public void setCameraFrontal(String cameraFrontal) {
        this.cameraFrontal = cameraFrontal;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getMemoriaInterna() {
        return memoriaInterna;
    }

    public void setMemoriaInterna(String memoriaInterna) {
        this.memoriaInterna = memoriaInterna;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getGarantiaEmMeses() {
        return garantiaEmMeses;
    }

    public void setGarantiaEmMeses(int garantiaEmMeses) {
        this.garantiaEmMeses = garantiaEmMeses;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public double getCaixaInicial() {
        return caixaInicial;
    }

    public void setCaixaInicial(double caixaInicial) {
        this.caixaInicial = caixaInicial;
    }

    public static int getQuantidadeDeProdutos() {
        return quantidadeDeProdutos;
    }

    @Override
    public String toString() {
        return "br.com.LojaDeCelulares.Projeto.Orientacao.Objetos.modelo.Celulares{" +
                "idDoProduto=" + idDoProduto +
                ", marca=" + marca +
                ", sistemaOperacional='" + sistemaOperacional + '\'' +
                ", tamanhoDeDisplay=" + tamanhoDeDisplay +
                ", cameraTraseira='" + cameraTraseira + '\'' +
                ", cameraFrontal='" + cameraFrontal + '\'' +
                ", processador='" + processador + '\'' +
                ", memoriaRam='" + memoriaRam + '\'' +
                ", memoriaInterna='" + memoriaInterna + '\'' +
                ", cor='" + cor + '\'' +
                ", garantiaEmMeses=" + garantiaEmMeses +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                ", estoqueAtual=" + estoqueAtual +
                ", caixaInicial=" + caixaInicial +
                '}';
    }
}
