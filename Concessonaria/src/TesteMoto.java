import br.com.localiza.concessionaria.modelo.Moto;

public class TesteMoto {

    public static void main(String[] args) {

        // usando o set, se torna verboso

        /*Moto moto1 = new Moto("Yamaha");

        moto1.setAnoDeFabricacao(2022);
        moto1.setCilindrada(125);
        moto1.setCor("Cinza Escuro");
        moto1.setDono("Jenyfer");
        moto1.setAnoDeFabricacao(14);
        moto1.setAnoDeFabricacao(4);
        moto1.setEstiloCombustivel("Gasolina");
        moto1.setMarca("NEO 125");
        moto1.setPreco(11990.00);

        //System.out.println(moto1);

        // Chamar métodos
        moto1.ligar();
        moto1.acelerar(50);
        System.out.println(moto1);

        moto1.desacelerar(50);
        System.out.println(moto1);

        moto1.desligar(50);

        /*
        // teste com entrada do teclado
        /*Scanner sc = new Scanner(System.in);
        System.out.println("informe o numero de motos que deseja cadastrar");
        int numeroDeMotos = sc.nextInt();
        List<Moto> motos = new ArrayList<>();
        for (int i = 0; i < numeroDeMotos; i++) {
            System.out.println("informe a cor");
            String cor = sc.next();
            Moto moto = new Moto.MotoBuilder()
                    .cor(cor)
                    .escapamento("Tunado")
                    .preco(20_000.00)
                    .marca("CBR500")
                    .velocidadeMaxima(500)
                    .cilindrada(500)
                    .placa("RRR-8575")
                    .modelo("Yamawha")
                    .build();
            motos.add(moto);
        }
        for (Moto moto :motos) {
            System.out.println(moto);
        }
         sc.close();
        */

//        Moto moto3 = new Moto.MotoBuilder()
//                .cor("preto")
//                .escapamento("Tunado")
//                .preco(20_000.00)
//                .marca("CBR500")
//                .velocidadeMaxima(500)
//                .cilindrada(500)
//                .placa("RRR-8575")
//                .modelo("Yamawha")
//                .build();
//
//        System.out.println(moto3);
//
//        List<Moto> motos = List.of(moto3, moto3, moto3);
//        System.out.println(motos.size());
//
//        System.out.println(moto3);
//
//        StringBuilder sb = new StringBuilder()
//                .append("palavra1 ")
//                .append("palavra 2")
//                .append("palavra 3")
//                .append("palavra 4");
//        System.out.println(sb.toString());



    }
}
