package br.com.localiza.concessionaria.builder;

import br.com.localiza.concessionaria.modelo.Moto;

public class MotoBuilder {


        private String cor;
        private String modelo;
        private int cilindrada;
        private String placa ;
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

        public Moto build(){
            return new Moto(cor, modelo, cilindrada, placa, marca, escapamento, preco, velocidadeMaxima);

        }
}
