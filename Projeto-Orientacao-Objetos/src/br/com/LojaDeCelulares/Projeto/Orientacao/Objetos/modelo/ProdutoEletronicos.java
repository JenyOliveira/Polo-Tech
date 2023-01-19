package br.com.LojaDeCelulares.Projeto.Orientacao.Objetos.modelo;

import br.com.LojaDeCelulares.Projeto.Orientacao.Objetos.enumerador.EnumMarca;

public abstract class ProdutoEletronicos { //Herança

    protected int idDoProduto;
    protected EnumMarca marca;
    protected String cor;
    protected int garantiaEmMeses; //usar esse método com abstrato, dando opção de garantia em meses e dias em diferentes produtos
    protected int estoqueAtual;
    protected String modelo;
    protected double preco;
    protected double caixaInicial = 1000.00;
    protected static int quantidadeDeProdutos;

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

    public int getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
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

    public double getCaixaInicial() {
        return caixaInicial;
    }

    public void setCaixaInicial(double caixaInicial) {
        this.caixaInicial = caixaInicial;
    }

    public static int getQuantidadeDeProdutos() {
        return quantidadeDeProdutos;
    }
}
