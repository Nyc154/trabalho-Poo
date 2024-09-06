package br.barbearia.controle;

import br.barbearia.modelo.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class ControleFuncionario{
    private List<Funcionario> listaFuncionario;

    public ControleFuncionario() {
        this.listaFuncionario = new ArrayList<Funcionario>();
    }

    public void adicionar(Funcionario funcionario){
        this.listaFuncionario.add(funcionario);
    }

    public void remover(Funcionario funcionario){
        this.listaFuncionario.remove(funcionario);
    }

    public String encontrar(Funcionario funcionario){
        for (Funcionario func : listaFuncionario){
            if (func == funcionario){
                return funcionario.toString();
            }else {
                return "Usuario não encontrado";
            }
        }
        return "";
    }

    public void exibir(){
        for (Funcionario func : listaFuncionario){
            func.exibirDados();
        }
    }
}
