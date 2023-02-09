package service;

import model.Funcionario;

public interface CalculadoraDeSalario<T extends Funcionario> {

    Double calcularSalarioDoDia(T funcionario) throws SalarioException;

}
