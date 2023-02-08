package service;

import model.Produto;

public class CalculadoraDeDesconto implements ValordeDesconto{
    @Override
    public Double calcular(Produto produto) {
        Double preco = produto.getPreco();

        if (preco >= 100.00){
            return preco * 0.1;
        } else if (preco >= 500.00){
            return preco * 0.2;
        }
        return preco;
    }
}
