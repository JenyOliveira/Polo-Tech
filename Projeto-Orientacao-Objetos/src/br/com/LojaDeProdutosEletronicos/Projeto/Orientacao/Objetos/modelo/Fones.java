package br.com.LojaDeProdutosEletronicos.Projeto.Orientacao.Objetos.modelo;

import br.com.LojaDeProdutosEletronicos.Projeto.Orientacao.Objetos.enumerador.EnumMarcaFones;

public class Fones extends ProdutoEletronicos{

    private int duraçaoDeBateriaEmHora;
    private String compatibilidadeComAparelhos;
    private String conexao;
    private EnumMarcaFones marca;

    public Fones(EnumMarcaFones marca) {  // Consttrutor
        this.marca = marca;
    }


    public int getDuraçaoDeBateriaEmHora() {
        return duraçaoDeBateriaEmHora;
    }

    public void setDuraçaoDeBateriaEmHora(int duraçaoDeBateriaEmHora) {
        this.duraçaoDeBateriaEmHora = duraçaoDeBateriaEmHora;
    }

    public String getCompatibilidadeComAparelhos() {
        return compatibilidadeComAparelhos;
    }

    public void setCompatibilidadeComAparelhos(String compatibilidadeComAparelhos) {
        this.compatibilidadeComAparelhos = compatibilidadeComAparelhos;
    }

    public String getConexao() {
        return conexao;
    }

    public void setConexao(String conexao) {
        this.conexao = conexao;
    }

    public EnumMarcaFones getMarca() {
        return marca;
    }

    public void setMarca(EnumMarcaFones marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Fones{" +
                "duraçaoDeBateriaEmHora=" + duraçaoDeBateriaEmHora +
                ", compatibilidadeComAparelhos='" + compatibilidadeComAparelhos + '\'' +
                ", conexao='" + conexao + '\'' +
                ", idDoProduto=" + idDoProduto +
                ", marca=" + marca +
                ", cor='" + cor + '\'' +
                ", garantiaEmMeses=" + garantiaEmMeses +
                ", estoqueAtual=" + estoqueAtual +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                '}';
    }
}
