package dicas.enumerador;
import java.lang.management.GarbageCollectorMXBean;
import java.util.Scanner;

public class TesteEnum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o id do tipo do produto");
        int idTipoProduto = scanner.nextInt();
        TipoProdutoEnum tipoProdutoEnum = TipoProdutoEnum.obterPorId(idTipoProduto);
        System.out.println(tipoProdutoEnum);
        System.out.println(tipoProdutoEnum.getId());
        System.out.println(tipoProdutoEnum.getDescricao());

        Geladeira geladeira = new Geladeira();
        geladeira.id = 1;
        geladeira.tipoProdutoEnum = TipoProdutoEnum.ELETRODOMESTICO;

        Fogao fogao = new Fogao();
        fogao.id = 2;
        fogao.tipoProdutoEnum = TipoProdutoEnum.ELETRODOMESTICO;
    }
}

class Geladeira{
    int id;
    TipoProdutoEnum tipoProdutoEnum;
}

class Fogao{
    int id;
    TipoProdutoEnum tipoProdutoEnum;

}
