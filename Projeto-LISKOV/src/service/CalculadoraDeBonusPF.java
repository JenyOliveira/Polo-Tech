package service;

import model.Funcionario;

public class CalculadoraDeBonusPF extends Funcionario implements CalculadoraDeBonus {


    @Override
    public Double calcularBonus(Double venda) {
        if (getVendas() > 10_001.00) {
            throw new RuntimeException("O valor máximo de bonficação é 1.000");

        }
        return getVendas() * 0.1;
    }
}
