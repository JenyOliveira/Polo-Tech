package service;

import model.Produto;

public class CalculadoraDeFrete implements FreteDoProduto {
    @Override
    public Double calcular(Produto produto, Double quilometro) throws NãoEntregaExpection {
        if (quilometro < 0){
            throw new RuntimeException("Quilomêtro errado, digite um número acima de zero");
        }
        if (quilometro > 100) {
            throw new RuntimeException("Fora da área de entrega");
        }
        return produto.getPeso() * quilometro * 0.8;
    }


}
