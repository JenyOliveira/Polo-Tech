package service;

import model.Produto;

public class PrecoDoProduto {

        private final FreteDoProduto freteDoProduto;
        private ValordeDesconto valordeDesconto;


        public PrecoDoProduto (FreteDoProduto freteDoProduto, ValordeDesconto valordeDesconto) {
            this.freteDoProduto = freteDoProduto;
            this.valordeDesconto = valordeDesconto;
        }

        public Double calcular (Produto produto, Double quilometro) throws NãoEntregaExpection {
            Double frete = freteDoProduto.calcular(produto, quilometro);
            Double desconto = valordeDesconto.calcular(produto);
            return (produto.getPreco() * produto.getQuantidade()) + frete - desconto;
        }

}
