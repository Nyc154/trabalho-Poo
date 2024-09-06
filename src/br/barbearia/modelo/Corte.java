package br.barbearia.modelo;

public class Corte {
    private String nomeCorte;
    private double preco;

    public Corte(String nome, double preco){
        this.nomeCorte = nome;
        this.preco = preco;
    }

    public String getNomeCorte() {
        return nomeCorte;
    }

    public void setNomeCorte(String nome) {
        this.nomeCorte = nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirDados() {
        System.out.println("Nome: " + getNomeCorte() + "\nPreco: " + getPreco() + "\n-------------------------------");
    }
}
