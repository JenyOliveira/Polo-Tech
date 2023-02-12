package service;

public class RegrasSalarioLiquido extends SalarioLiquido {


    @Override
    public Double calcular(Double salarioBruto, Double descontos, Double bonus){
        Double salarioLiquido = super.calcular(salarioBruto, descontos, bonus);
        if (bonus < 100.00) {
            salarioLiquido = salarioBruto + 100.00 - descontos;
        }
        if (descontos >= (salarioBruto * 0.5)) {
            salarioLiquido = salarioBruto + salarioBruto - descontos;
        }
        return salarioLiquido;
    }

}
