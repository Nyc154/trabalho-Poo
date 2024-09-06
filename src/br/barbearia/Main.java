package br.barbearia;
import br.barbearia.controle.ControleCliente;
import br.barbearia.controle.ControleCorte;
import br.barbearia.controle.ControleFuncionario;
import br.barbearia.exceptions.PrecoInvalido;
import br.barbearia.interfaces.Servico;
import br.barbearia.modelo.Cliente;
import br.barbearia.modelo.Corte;
import br.barbearia.modelo.Funcionario;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Main {
    static ControleFuncionario cf = new ControleFuncionario();
    static ControleCliente cc = new ControleCliente();
    static ControleCorte cr = new ControleCorte();
    static Scanner sc = new Scanner(System.in);
    static Servico sv = new Servico() {
        @Override
        public void executar() {

        }

        @Override
        public String getDescricao() {
            return "";
        }

        @Override
        public double getPreco() {
            return 0;
        }
    };
    public static void main(String[] args) {


        int op = 0;
        do {
            System.out.println("________BEM VINDO A BARBEARIA________");
            System.out.println("Selecione a operação desejada: ");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Funcionário");
            System.out.println("3 - Cadastrar Corte de cabelo");
            System.out.println("4 - Listar Cliente");
            System.out.println("5 - Listar Funcionários");
            System.out.println("6 - Listar Corte de cabelo");
            System.out.println("7 - Executar um corte de cabelo");
            System.out.println("8 - Sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("________Cadastrar Cliente________");

                    System.out.println("Digite o nome do cliente: ");
                    String nome = sc.next();

                    System.out.println("Digite o CPF do cliente: ");
                    String cpf = sc.next();

                    System.out.println("Digite o telefone do cliente: ");
                    String telefone = sc.next();

                    Cliente cliente = new Cliente(nome, cpf, telefone);

                    System.out.println("Cliente cadastrado com sucesso!");
                    System.out.println("Nome: " + cliente.getNome() + "\nCPF: " + cliente.getCpf() + "\nTelefone: " + cliente.getTelefone());
                    cc.adicionar(cliente);
                    break;

                case 2:
                    System.out.println("________Cadastrar Funcionario________");

                    System.out.println("Digite o nome do Funcionario: ");
                    String nomeFuncionario = sc.next();

                    System.out.println("Digite o CPF do Funcionario: ");
                    String cpfFuncionario = sc.next();

                    System.out.println("Digite o telefone do Funcionario: ");
                    String telefoneFuncionario = sc.next();

                    System.out.println("Digite o cargo do Funcionario: ");
                    String cargoFuncionario = sc.next();

                    Funcionario funcionario = new Funcionario(nomeFuncionario, cpfFuncionario, telefoneFuncionario, cargoFuncionario);
                    cf.adicionar(funcionario);


                    System.out.println("Cliente cadastrado com sucesso!");
                    System.out.println("Nome: " + funcionario.getNome() + "\nCPF: " + funcionario.getCpf() + "\nTelefone: " + funcionario.getTelefone() + "\nCargo: " + funcionario.getCargo());

                    break;

                case 3:
                    System.out.println("________Cadastrar Corte de cabelo________");
                    System.out.println("Digite o nome do Corte: ");
                    String nomeCorte = sc.next();

                    try {
                        System.out.println("Digite o valor do corte: ");
                        double preco = sc.nextDouble();

                        if (preco <= 0) {
                            throw new PrecoInvalido("O preço deve ser maior que 0!");
                        }

                        Corte corte = new Corte(nomeCorte, preco);

                        cr.adicionar(corte);

                        System.out.println("Corte cadastrado com sucesso!");
                        System.out.println("Nome: " + corte.getNomeCorte() + "\nValor: " + corte.getPreco());
                    }catch (PrecoInvalido e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("________Exibindo lista de clientes________");
                    cc.exibir();
                    break;

                case 5:
                    System.out.println("________Exibindo lista de funcionários________");
                    cf.exibir();
                    break;

                case 6:
                    System.out.println("________Exibindo lista de cortes________");
                    cr.exibir();
                    break;

                case 7:
                    System.out.println("________Executar um corte de cabelo________");

                    cr.exibir();

                    System.out.println("Digite a descrição do corte que deseja executar:");
                    String corteEscolhido = sc.next();

                    String corteSelecionado = cr.encontrar(corteEscolhido);
                    if (corteSelecionado != null) {
                        sv.executar();
                    } else {
                        System.out.println("Corte não encontrado.");
                    }
                    break;
            }
        }while (op !=8);
        System.out.println("Programa encerrado");

    }
}
