package service;

import model.Funcionario;

public class CalculadoraDeBonusPF<T extends Funcionario & CalculadoraDeBonus> {

    public Double calcularBonus(T funcionario) {
        Double valorDaBonificacao = funcionario.getVendas() * 0.1;
        return valorDaBonificacao;
    }
}
