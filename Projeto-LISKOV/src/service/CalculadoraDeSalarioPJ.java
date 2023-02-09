package service;

import model.FuncionarioPJ;

public class CalculadoraDeSalarioPJ implements CalculadoraDeSalario<FuncionarioPJ> {

    private final CalculadoraDeImpostoPJ calculadoraDeImposto = new CalculadoraDeImpostoPJ();

    public Double calcularSalarioDoDia(FuncionarioPJ funcionarioPJ) throws SalarioException {
        Double salarioBruto = funcionarioPJ.getHorasNormais() * funcionarioPJ.getValorHora();
        return salarioBruto - calculadoraDeImposto.calcularImpostoTotal(salarioBruto);
    }

}
