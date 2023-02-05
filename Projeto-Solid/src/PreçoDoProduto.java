import model.Produto;

public class PreçoDoProduto {

    private int quantidade;




    public  double calcularPreco (Produto produto) {
        return produto.getPreco() * quantidade;
    }

    public double calcularDesconto (){
        if calcularPreco() < 100 {
            preco = calcularPreco() - 0.10;
        }
    }





}
