package br.barbearia.servicos;

import br.barbearia.interfaces.Servico;

public class CorteCabelo implements Servico {
    private String descricao;
    private double preco;

    public CorteCabelo(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public void executar() {
        System.out.println("Corte Cabelo: " + descricao + "no valor: " + preco);
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
