package br.com.LojaDeProdutosEletronicos.Projeto.Orientacao.Objetos.testes;

import br.com.LojaDeProdutosEletronicos.Projeto.Orientacao.Objetos.enumerador.EnumMarcaCelulares;
import br.com.LojaDeProdutosEletronicos.Projeto.Orientacao.Objetos.modelo.Celulares;
import br.com.LojaDeProdutosEletronicos.Projeto.Orientacao.Objetos.util.ValidarEstoqueMinimo;

public class TesteCelulares {

    public static void main(String[] args) {

        Celulares celular1 = new Celulares(EnumMarcaCelulares.SAMSUNG);

        celular1.setIdDoProduto(01);
        celular1.setSistemaOperacional("Android");
        celular1.setTamanhoDeDisplay(6.6);
        celular1.setCameraTraseira("50MP + 5MP + 2MP + 2MP");
        celular1.setCameraFrontal("8MP");
        celular1.setProcessador("Octa-Core 2.0GHz");
        celular1.setMemoriaRam("4GB");
        celular1.setMemoriaInterna("128GB");
        celular1.setCor("Preto");
        celular1.setGarantiaEmMeses(12);
        celular1.setModelo("Galaxy A13");
        celular1.setPreco(989.10);
        celular1.setEstoqueAtual(3);

        System.out.println("Consultar preço: R$ " + celular1.getPreco());
        celular1.reduzirProdutoEmEstoque(3);
        System.out.println("Estoque atual: " + celular1.getEstoqueAtual());
        celular1.adicionarProdutoEmEstoque(1);
        System.out.println("Estoque atual: " + celular1.getEstoqueAtual());
        celular1.caixa(1);
        System.out.println("Caixa atual: R$ " + celular1.getCaixaInicial());
        System.out.println(celular1);
        ValidarEstoqueMinimo.estoqueMinimo(celular1.getEstoqueAtual());

        Celulares celular2 = new Celulares(EnumMarcaCelulares.SAMSUNG);

        celular2.setIdDoProduto(02);
        celular2.setSistemaOperacional("Android");
        celular2.setTamanhoDeDisplay(6.6);
        celular2.setCameraTraseira("50MP + 5MP + 2MP + 2MP");
        celular2.setCameraFrontal("8MP");
        celular2.setProcessador("Octa-Core 2.0GHz");
        celular2.setMemoriaRam("4GB");
        celular2.setMemoriaInterna("128GB");
        celular2.setCor("Prata");
        celular2.setGarantiaEmMeses(12);
        celular2.setModelo("Galaxy A13");
        celular2.setPreco(989.10);
        celular2.setEstoqueAtual(20);


        Celulares celular3 = new Celulares(EnumMarcaCelulares.MOTOROLA);

        celular3.setIdDoProduto(03);
        celular3.setSistemaOperacional("Android");
        celular3.setTamanhoDeDisplay(6.5);
        celular3.setCameraTraseira("50MP + 8MP + 2MP + 2MP");
        celular3.setCameraFrontal("16MP");
        celular3.setProcessador("MediaTek G37 (2,3 GHz Octa-Core)");
        celular3.setMemoriaRam("4GB");
        celular3.setMemoriaInterna("128GB");
        celular3.setCor("Azul");
        celular3.setGarantiaEmMeses(12);
        celular3.setModelo("Moto G22");
        celular3.setPreco(999.10);
        celular3.setEstoqueAtual(30);

        Celulares celular4 = new Celulares(EnumMarcaCelulares.MOTOROLA);

        celular4.setIdDoProduto(04);
        celular4.setSistemaOperacional("Android");
        celular4.setTamanhoDeDisplay(6.6);
        celular4.setCameraTraseira("50MP + 8MP + 2MP");
        celular4.setCameraFrontal("16MP");
        celular4.setProcessador("Snapdragon 680 (2,4 GHz Octa-Core)");
        celular4.setMemoriaRam("4GB");
        celular4.setMemoriaInterna("128GB");
        celular4.setCor("Branco");
        celular4.setGarantiaEmMeses(12);
        celular4.setModelo("Moto G52");
        celular4.setPreco(1414.55);
        celular4.setEstoqueAtual(40);


        Celulares celular5 = new Celulares(EnumMarcaCelulares.APPLE);

        celular5.setIdDoProduto(05);
        celular5.setSistemaOperacional("Iphone IOS");
        celular5.setTamanhoDeDisplay(6.15);
        celular5.setCameraTraseira("12MP");
        celular5.setCameraFrontal("2.2MP");
        celular5.setProcessador("A13 Bionic Neural Engine de terceira geração");
        celular5.setMemoriaRam("2GB");
        celular5.setMemoriaInterna("64GB");
        celular5.setCor("Rosé");
        celular5.setGarantiaEmMeses(12);
        celular5.setModelo("iPhone 11");
        celular5.setPreco(3151.77);
        celular5.setEstoqueAtual(50);

        int quantidadeDeCelulares = Celulares.getQuantidadeDeProdutos();
        System.out.println("Quantos modelos de aparelhos tem em estoque? " + quantidadeDeCelulares);

    }
}
