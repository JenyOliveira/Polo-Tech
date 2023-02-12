package service;


public class SalarioLiquido implements CalculadoraDeSalario {

    private Double salarioMinimo = 1302.00;
    Double salarioLiquido = 0.00;

    public Double calcular(Double salarioBruto, Double descontos, Double bonus) {

        if (salarioBruto < salarioMinimo){
            throw new RuntimeException("O salario bruto não pode ser menor do que o salário mínimo, aumentar salário bruto");
        }
        if (bonus > 1000.00){
            throw new RuntimeException("Bônus superior a R$ 1000.00 não é permitido");
        }
        if (salarioBruto > salarioMinimo && bonus <= 1000.00) {
            salarioLiquido = salarioBruto - descontos;
        }
        return salarioLiquido;
    }


}
