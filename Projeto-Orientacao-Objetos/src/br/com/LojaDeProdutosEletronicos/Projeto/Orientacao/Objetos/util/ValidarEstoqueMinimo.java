package br.com.LojaDeProdutosEletronicos.Projeto.Orientacao.Objetos.util;

public class ValidarEstoqueMinimo {

    public static boolean estoqueMinimo(int estoqueAtual){
        if (estoqueAtual < 5) {
            System.out.println("Fazer novo pedido, produto com estoque mínimo!");
            return true;
        }
        return false;
    }
}
