import br.com.localiza.concessionaria.enumerador.EnumMarca;
import br.com.localiza.concessionaria.modelo.Carro;

public class TesteConcessonaria {

    // Atalho psvm para adicionar public static void main(String[] args)
        public static void main(String[] args) {

        Carro carro1 = new Carro(EnumMarca.MERCEDES);

        //Atalho para printar algo sout

        carro1.setModelo("Sedan");
        carro1.setCor("Prata");
        carro1.setNumeroDeRodas(4);
        carro1.setAroRoda(18);
        carro1.setAnoDeFabricao(2022);
        carro1.setDono("Renato Anderson");
        carro1.setEstiloDeCombustivel("Gasolina");
        carro1.setMotor("16 Valvulas");
        carro1.setPreco(370000.00);
        carro1.setVelocidadeMaxima(220);

        System.out.println(carro1.getNumeroDeRodas());


        System.out.println(carro1.obterVelocidadeMaxima());
        carro1.ligar();
        carro1.acelerar(100);
        System.out.println(carro1);

        carro1.acelerar(20);
        System.out.println(carro1);

        carro1.desacelerar(50);
        System.out.println(carro1);

        carro1.morrer();
        System.out.println(carro1);


        /* Exemplo
        System.out.println(carro1.ligar); */

        // Instaciar um objeto abaixo
        /*br.com.localiza.concessionaria.modelo.br.com.localiza.concessionaria.modelo.Carro carro2 = new br.com.localiza.concessionaria.modelo.br.com.localiza.concessionaria.modelo.Carro();
        carro2.marca = "FIAT";
        carro2.modelo = "UNO";
        carro2.cor = "AZUL";
        carro2.numerosDeRodas = 5;
        carro2.aroRoda = 18;
        carro2.anoDeFabricacao = 1995;
        carro2.dono = "Anderson ";
        carro2.estiloCombustivel = "Gasolina";
        carro2.motor = "8 válvulas";
        carro2.preco = 50000.00;
        carro2.velocidadeMaxima = 200;

        System.out.println(carro2); */

    }
}
