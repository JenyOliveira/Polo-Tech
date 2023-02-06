package service;

import model.Produto;

public class PrecoDoProduto {

        private FreteDoProduto freteDoProduto;
        private ValordeDesconto valordeDesconto;


        public PrecoDoProduto () {
            this.freteDoProduto = freteDoProduto;
            this.valordeDesconto = valordeDesconto;
        }

        public Double calcular (Produto produto, Double quilometro) {
            Double frete = freteDoProduto.calcular(produto, quilometro);
            Double desconto = valordeDesconto.calcular(produto);
            return (produto.getPreco()  * produto.getQuantidade()) + frete - desconto;
        }

}
