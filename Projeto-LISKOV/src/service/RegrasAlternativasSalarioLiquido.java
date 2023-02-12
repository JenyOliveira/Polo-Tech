package service;

public class RegrasAlternativasSalarioLiquido extends SalarioLiquido {

    @Override
    public Double calcular(Double salarioBruto, Double descontos, Double bonus){
        double salarioLiquido=super.calcular(salarioBruto, descontos, bonus);
        if (bonus < 1000.00) {
            salarioLiquido = salarioLiquido * 0.5;
        }
        if (descontos > salarioBruto/2){
            throw new RuntimeException("Não pode ter descontos que totalizem mais de metade do salário bruto");
        }
        if (salarioBruto < 1000.00) {
            throw new RuntimeException("Salário abaixo do salário mínimo vigente");
        }
        return salarioLiquido;
    }
}
