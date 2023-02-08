package service;

import model.Produto;

public interface FreteDoProduto {
    Double calcular(Produto produto, Double quilometro) throws NãoEntregaExpection;
}
