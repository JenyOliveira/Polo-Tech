import model.Produto;
import service.CalculadoraDeDesconto;
import service.CalculadoraDeFrete;
import service.NãoEntregaExpection;
import service.PrecoDoProduto;

import java.sql.SQLOutput;


public class TestePrecoDoProduto {

    public static void main(String[] args) throws NãoEntregaExpection {

        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
        CalculadoraDeFrete calculadoraDeFrete = new CalculadoraDeFrete();
        PrecoDoProduto precoDoProduto1 = new PrecoDoProduto(calculadoraDeFrete, calculadoraDeDesconto);


        Produto produto = new Produto(1850.00, 0.18, "Celular", 1.0);
        Double quilometro = 101.00;


        try {
            System.out.println("Preco do Celular:");
            System.out.println(precoDoProduto1.calcular(produto, quilometro));
        } catch (NãoEntregaExpection e) {
            System.out.println(e.getMessage());
        }


    }
}