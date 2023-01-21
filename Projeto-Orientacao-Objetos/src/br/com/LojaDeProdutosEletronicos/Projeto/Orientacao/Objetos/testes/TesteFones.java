package br.com.LojaDeProdutosEletronicos.Projeto.Orientacao.Objetos.testes;

import br.com.LojaDeProdutosEletronicos.Projeto.Orientacao.Objetos.enumerador.EnumMarcaFones;
import br.com.LojaDeProdutosEletronicos.Projeto.Orientacao.Objetos.modelo.Fones;
import br.com.LojaDeProdutosEletronicos.Projeto.Orientacao.Objetos.util.ValidarEstoqueMinimo;

public class TesteFones {

    public static void main(String[] args) {

        Fones fone1 = new Fones(EnumMarcaFones.PHILIPS);

        fone1.setDuraçaoDeBateriaEmHora(5);
        fone1.setCompatibilidadeComAparelhos("Android, IOS, Windows");
        fone1.setConexao("Bluetooth");
        fone1.setIdDoProduto(06);
        fone1.setEstoqueAtual(5);
        fone1.setCor("Preto");
        fone1.setPreco(70.50);
        fone1.setGarantiaEmMeses(6);
        fone1.setModelo("E6s");

        System.out.println("Consultar preço: R$ " + fone1.getPreco());
        System.out.println("Consultar conexão: " + fone1.getConexao());
        fone1.reduzirProdutoEmEstoque(3);
        System.out.println("Estoque atual: " + fone1.getEstoqueAtual());
        fone1.adicionarProdutoEmEstoque(2);
        System.out.println("Estoque atual: " + fone1.getEstoqueAtual());
        fone1.caixa(5);
        System.out.println("Caixa atual: R$ " + fone1.getCaixaInicial());
        System.out.println(fone1);
        ValidarEstoqueMinimo.estoqueMinimo(fone1.getEstoqueAtual());

        Fones fone2 = new Fones(EnumMarcaFones.LENOVO);

        fone2.setDuraçaoDeBateriaEmHora(8);
        fone2.setCompatibilidadeComAparelhos("Android, IOS");
        fone2.setConexao("Bluetooth");
        fone2.setIdDoProduto(07);
        fone2.setEstoqueAtual(4);
        fone2.setCor("Cinza");
        fone2.setPreco(80.90);
        fone2.setGarantiaEmMeses(12);
        fone2.setModelo("LP40");

        Fones fone3 = new Fones(EnumMarcaFones.SAMSUNG);

        fone3.setDuraçaoDeBateriaEmHora(8);
        fone3.setCompatibilidadeComAparelhos("Android, IOS");
        fone3.setConexao("Com fio");
        fone3.setIdDoProduto(07);
        fone3.setEstoqueAtual(3);
        fone3.setCor("Preto");
        fone3.setPreco(40.80);
        fone3.setGarantiaEmMeses(6);
        fone3.setModelo("AKG");

    }
}
