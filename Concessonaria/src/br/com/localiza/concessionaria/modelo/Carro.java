package br.com.localiza.concessionaria.modelo;
import br.com.localiza.concessionaria.enumerador.EnumMarca;


// nomenclatura padrão para pacotes:
// 1 - br
// 2 - com
// 3 - nome da empresa - localiza
// 4 - nome do projeto - concessionaria
// 5 - nome da subdivisao - modelo

// private - só permite que construtores, ou metodos, sejam acessados na mesma classe
// default - só permite que classes, construtores, ou metodos, sejam acessados no mesmo pacote
// public - permite que classes, construtores, ou metodos, sejam acessados em qualquer pacote
// classes no pacote default (mesmo se as classes foram publicas), não podem ser acessadas fora do pacote default

public class Carro{

    Carro(){ // default
        desengatar();
    }

    public Carro(EnumMarca marca){ // construtor de classe
        desengatar();
        this.marca = marca; // sombreamento
    }

    private String motor;
    private int numeroDeRodas;
    private int anoDeFabricacao;
    private String cor;

    private EnumMarca marca;

    private String modelo;
    private String estiloDeCombustivel;
    private double preco;
    private int aroRoda;
    private String dono;
    private int velocidadeMaxima;
    private int velocidadeAtual;
    // String ligar;



    //Métodos

    public void acelerar(int aumentoDeVelocidade){

        int i = velocidadeAtual + aumentoDeVelocidade;
    }

    public int obterVelocidadeMaxima(){
        // logica da minha tarefa/metodo
        return velocidadeMaxima;
    }

    /*String parseToString(int numero){
        String numeroParseado = String.valueOf(numero);
        // classes wrappers
        //int i = Integer.parseInt(numeroParseado);
        //Integer i2 = Integer.valueOf(1);
        return numeroParseado;
    } */

    String parseToString(int numero){
        String cpf = String.valueOf(numero);
        // classes wrappers
        validarCpf(cpf);
        return cpf;
    }

    private void validarCpf(String cpf){
        int i = Integer.parseInt(cpf);
        Integer i2 = Integer.valueOf(1);
    }

    public void ligar() { // sobrecarga de metodos

        System.out.println("Carro ligado com chave...");
     }

    public void ligar(String comandoDeVoz){ // sobrecarga de metodos
        System.out.println("Carro ligado com comando de voz..." + comandoDeVoz);
    }

  /*Exemplo
   //String ligar() {
   //    return ligar();
     } */


    public void desacelerar(int diminuicaoDeVelocidade) {
        //60 = (80 - 20);
        velocidadeAtual -= diminuicaoDeVelocidade;
    }

    public void morrer() {
        System.out.println("Faltou gasolina...");
        desacelerar(velocidadeAtual);
        parar();
    }

    public void parar() {
        if (velocidadeAtual > 0) {
            desacelerar(velocidadeAtual);
        }
        System.out.println("br.com.localiza.concessionaria.modelo.Carro parado!");
    }

   public void desengatar(){
        System.out.println("br.com.localiza.concessionaria.modelo.Carro desengatado");
    }

    //Atalho do Intellij Alt+Insert, escolher get and setter, escolhe e gera automático
    // metodo configurador cujo nome padrão é setXXX, atalho exemplo setN já puxa setNumeroDeRodas
    public void setNumeroDeRodas(int numeroDeRodas) {
        if(numeroDeRodas < 4 || numeroDeRodas > 5){
            throw new IllegalArgumentException("Numero de rodas abaixo de 4");
        }
        this.numeroDeRodas = numeroDeRodas;
    }


    // metodo de busca, cujo padrão getXXXX
    public int getNumeroDeRodas() {
        return numeroDeRodas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getAnoDeFabricao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricao(int anoDeFabricao) {
        this.anoDeFabricacao = anoDeFabricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public EnumMarca getMarca() {
        return marca;
    }

    public void setMarca(EnumMarca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstiloDeCombustivel() {
        return estiloDeCombustivel;
    }

    public void setEstiloDeCombustivel(String estiloDeCombustivel) {
        this.estiloDeCombustivel = estiloDeCombustivel;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAroRoda() {
        return aroRoda;
    }

    public void setAroRoda(int aroRoda) {
        this.aroRoda = aroRoda;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }




    // Alt + Insert abre uma caixa de opções incluindo o toString automático
    @Override
    public String toString() {

        return "br.com.localiza.concessionaria.modelo.Carro{" +
                "motor='" + motor + '\'' +
                ", numeroDeRodas=" + numeroDeRodas +
                ", anoDeFabricao=" + anoDeFabricacao +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", estiloDeCombustivel='" + estiloDeCombustivel + '\'' +
                ", preco=" + preco +
                ", aroRoda=" + aroRoda +
                ", dono='" + dono + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", velocidadeAtual=" + velocidadeAtual +
                '}';
    }
}
