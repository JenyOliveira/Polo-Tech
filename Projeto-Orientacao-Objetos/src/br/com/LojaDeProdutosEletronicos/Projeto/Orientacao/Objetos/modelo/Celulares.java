package br.com.LojaDeProdutosEletronicos.Projeto.Orientacao.Objetos.modelo;

import br.com.LojaDeProdutosEletronicos.Projeto.Orientacao.Objetos.enumerador.EnumMarcaCelulares;

public class Celulares extends ProdutoEletronicos {

    // Abstração, Encapsulamento e Modificadores de acesso


    private String sistemaOperacional;
    private double tamanhoDeDisplay;
    private EnumMarcaCelulares marca;
    private String cameraTraseira;
    private String cameraFrontal;
    private String processador;
    private String memoriaRam;
    private String memoriaInterna;
    private int estoqueAtual;



    public Celulares(){
        atualizarQuantidadeDeProdutos();
    }

    public Celulares(EnumMarcaCelulares marca) {  // Consttrutor
        atualizarQuantidadeDeProdutos();
        this.marca = marca;
    }

    private void atualizarQuantidadeDeProdutos(){
        quantidadeDeProdutos ++;
    }

    // Encapsulamento

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public double getTamanhoDeDisplay() {
        return tamanhoDeDisplay;
    }

    public void setTamanhoDeDisplay(double tamanhoDeDisplay) {
        this.tamanhoDeDisplay = tamanhoDeDisplay;
    }

    public EnumMarcaCelulares getMarca() {
        return marca;
    }
    public void setMarca(EnumMarcaCelulares marca) {
        this.marca = marca;
    }

    public String getCameraTraseira() {
        return cameraTraseira;
    }

    public void setCameraTraseira(String cameraTraseira) {
        this.cameraTraseira = cameraTraseira;
    }

    public String getCameraFrontal() {
        return cameraFrontal;
    }

    public void setCameraFrontal(String cameraFrontal) {
        this.cameraFrontal = cameraFrontal;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getMemoriaInterna() {
        return memoriaInterna;
    }

    public void setMemoriaInterna(String memoriaInterna) {
        this.memoriaInterna = memoriaInterna;
    }


    @Override
    public String toString() {
        return "br.com.LojaDeCelulares.Projeto.Orientacao.Objetos.modelo.Celulares{" +
                "idDoProduto=" + idDoProduto +
                ", marca=" + marca +
                ", sistemaOperacional='" + sistemaOperacional + '\'' +
                ", tamanhoDeDisplay=" + tamanhoDeDisplay +
                ", cameraTraseira='" + cameraTraseira + '\'' +
                ", cameraFrontal='" + cameraFrontal + '\'' +
                ", processador='" + processador + '\'' +
                ", memoriaRam='" + memoriaRam + '\'' +
                ", memoriaInterna='" + memoriaInterna + '\'' +
                ", cor='" + cor + '\'' +
                ", garantiaEmMeses=" + garantiaEmMeses +
                ", modelo='" + modelo + '\'' +
                ", preco=" + preco +
                ", estoqueAtual=" + estoqueAtual +
                ", caixaInicial=" + caixaInicial +
                '}';
    }
}
