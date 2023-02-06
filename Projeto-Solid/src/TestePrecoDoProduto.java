import model.Produto;
import service.PrecoDoProduto;


public class TestePrecoDoProduto {

    public static void main(String[] args) {

        PrecoDoProduto precoDoProduto1 = new PrecoDoProduto();


        Produto produto = new Produto(1850.00, 0.18, "Celular", 2.0);
        Double quilometro = 15.00;



        System.out.println("Preco do Celular:");
        System.out.println(precoDoProduto1.calcular(produto, quilometro));


    }
}