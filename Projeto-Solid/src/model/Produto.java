package model;

public class Produto  {
    
    private String nomeDoProduto;
    private Double preco;
    private Double peso;
    private  Double quantidade;

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public Double getPeso() {
        return peso;
    }

    public Double getPreco() {
        return preco;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public Produto(Double preco, Double peso, String nomeDoProduto, Double quantidade){
        this.preco = preco;
        this.peso = peso;
        this.nomeDoProduto = nomeDoProduto;
        this.quantidade = quantidade;
    }

}
