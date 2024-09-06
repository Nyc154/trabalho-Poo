package br.barbearia.modelo;

public class Cliente extends Pessoa {

    public Cliente(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
    }

    @Override
    public void exibirDados() {
        System.out.println("Cliente: " + getNome() + "\nTelefone: " + getTelefone() + "\n----------------------------------");
    }
}
