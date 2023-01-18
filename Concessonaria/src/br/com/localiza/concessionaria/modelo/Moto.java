package br.com.localiza.concessionaria.modelo;
import br.com.localiza.concessionaria.builder.MotoBuilder;


/**
 * Essa classe representa uma moto
 *
 * @author Anderson Piotto
 * @since 11/01/2023
 * @version 1.0.0
 */

public class Moto {

    /** Esse construtor privado ajudará na construção do objeto em outro construtores publicos ou default
     *
     * @param cilindrada
     */

   /* private int anoDeFabricacao;
    private String cor;
    private String marca;
    private String modelo;
    private String estiloCombustivel;
    private double preco;
    private int aroRoda;
    private String dono;
    private int cilindrada;
    private int anosDeGarantia;
    private int velocidadeAtual;

    //Construtor

    public Moto(String marca){
        this.marca = marca;

    }

    public Moto(){

    }

    public Moto(String marca,String cor, int anoDeFabricacao){
        this(marca);
        this.cor = cor;
        this.anoDeFabricacao = anoDeFabricacao;
    }


    //Método
    public void ligar(){
        System.out.println("Carro ligado!");
    }

    public int acelerar(int aumentoDeVelocidade) {
        //50 = (30 + 20);
        velocidadeAtual += aumentoDeVelocidade;
        return velocidadeAtual;
    }

    public int desacelerar(int diminuicaoDeVelocidade) {
        //0 = (50 - 50);
        velocidadeAtual -= diminuicaoDeVelocidade;
        return velocidadeAtual;
    }

    public void desligar(int parar){
        if (velocidadeAtual <= 0) {
            System.out.println("Desligado!");
        } else {
            System.out.println("Ainda tem velocidade, desacele!");
            velocidadeAtual -= parar;
        }
    }



    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstiloCombustivel() {
        return estiloCombustivel;
    }

    public void setEstiloCombustivel(String estiloCombustivel) {
        this.estiloCombustivel = estiloCombustivel;
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

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getAnosDeGarantia() {
        return anosDeGarantia;
    }

    public void setAnosDeGarantia(int anosDeGarantia) {
        this.anosDeGarantia = anosDeGarantia;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }


    // Para criar o toString pode usar o atalho toS
    @Override
    public String toString() {
        return "br.com.localiza.concessionaria.modelo.Moto{" +
                "anoDeFabricacao=" + anoDeFabricacao +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", estiloCombustivel='" + estiloCombustivel + '\'' +
                ", preco=" + preco +
                ", aroRoda=" + aroRoda +
                ", dono='" + dono + '\'' +
                ", Cilindrada=" + cilindrada +
                ", anosDeGarantia=" + anosDeGarantia +
                ", velocidadeAtual=" + velocidadeAtual +
                '}';

    */

    private Moto(int cilindrada){

        this.cilindrada = cilindrada;
    }

    private Moto(){
    }

    public Moto(String cor){

        setCor(cor);
    }
    public Moto(String modelo, String marca){ // sobrecarga de construtores
        setModelo(modelo);
        setMarca(marca);
    }

    public Moto(String cor, String modelo, int cilindrada, String placa, String marca, String escapamento, Double preco, int velocidadeMaxima) {
        this.cor = cor;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.placa = placa;
        this.marca = marca;
        this.escapamento = escapamento;
        this.preco = preco;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    private String cor;

    private String modelo;

    private int cilindrada;
    private String placa ;
    private String marca;
    private String escapamento;
    private Double preco;
    private int velocidadeMaxima;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setEscapamento(String escapamento) {
        this.escapamento = escapamento;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    /** Metodo para obter a placa da moto
     *
     * @return String placa - uma placa do tipo String
     */
    public String getPlaca() {
        return this.placa;
    }

    public String getCor() {
        return this.cor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public String getEscapamento() {
        return escapamento;
    }

    public Double getPreco() {
        return preco;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "br.com.localiza.concessionaria.modelo.Moto{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindrada=" + cilindrada +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", escapamento='" + escapamento + '\'' +
                ", preco=" + preco +
                ", velocidadeMaxima=" + velocidadeMaxima +
                '}';


    }

    public static class MotoBuilder {

        private String cor;

        public String getCor() {
            return this.cor;
        }

        private String modelo;
        private int cilindrada;
        private String placa;
        private String marca;
        private String escapamento;
        private Double preco;
        private int velocidadeMaxima;

        public MotoBuilder cor(String cor) {
            this.cor = cor;
            return this;
        }

        public MotoBuilder modelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public MotoBuilder cilindrada(int cilindrada) {
            this.cilindrada = cilindrada;
            return this;
        }

        public MotoBuilder placa(String placa) {
            this.placa = placa;
            return this;
        }

        public MotoBuilder marca(String marca) {
            this.marca = marca;
            return this;
        }

        public MotoBuilder escapamento(String escapamento) {
            this.escapamento = escapamento;
            return this;
        }

        public MotoBuilder preco(Double preco) {
            this.preco = preco;
            return this;
        }

        public MotoBuilder velocidadeMaxima(int velocidadeMaxima) {
            this.velocidadeMaxima = velocidadeMaxima;
            return this;
        }

        public Moto build() {
            return new Moto(cor, modelo, cilindrada, placa, marca, escapamento, preco, velocidadeMaxima);
        }

    }
}
