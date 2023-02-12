package service;

import model.Salario;

public interface CalculadoraDeSalario {
    Double calcular(Double salarioBruto, Double descontos, Double bonus);
}
