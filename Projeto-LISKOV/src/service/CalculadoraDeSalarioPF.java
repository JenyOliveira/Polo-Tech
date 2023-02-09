package service;

import model.FuncionarioCLT;

public class CalculadoraDeSalarioPF implements CalculadoraDeSalario<FuncionarioCLT> {

    private final CalculadoraDeImpostoPF calculadoraDeImposto = new CalculadoraDeImpostoPF();
    private final CalculadoraDeHoraExtraService<FuncionarioCLT> calculadoraDeHoraExtraService = new CalculadoraDeHoraExtraService();

    private final CalculadoraDeBonusPF calculadoraDeBonusPF = new CalculadoraDeBonusPF();
    public Double calcularSalarioDoDia(FuncionarioCLT funcionarioCLT) throws SalarioException {

        Double valorHoraExtra = 0.0;
        Double valorHorasNormais = 0.0;


        int totalDeHoras = funcionarioCLT.getHorasNormais() + funcionarioCLT.getHorasExtras();

        if (totalDeHoras > 8) {
            valorHoraExtra = calculadoraDeHoraExtraService.calcularHoraExtra(funcionarioCLT);
        }

        valorHorasNormais = funcionarioCLT.getHorasNormais() * funcionarioCLT.getValorHora();


        Double salarioBruto = valorHorasNormais + valorHoraExtra;
        if (salarioBruto < 1302.00) {
            throw new RuntimeException("Valor abaixo do permitido por lei, ajustar valor de horas normais");
        } else if (salarioBruto < calculadoraDeImposto.calcularImpostoTotal(salarioBruto)) {
            throw new RuntimeException("O desconto não pode ser maior que o salário bruto");

        }
        return salarioBruto - calculadoraDeImposto.calcularImpostoTotal(salarioBruto) + calculadoraDeBonusPF.calcularBonus(500.00);
    }

}
