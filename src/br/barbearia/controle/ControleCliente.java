package br.barbearia.controle;

import br.barbearia.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ControleCliente {
    private List<Cliente> listaCliente;


    public ControleCliente() {
        this.listaCliente = new ArrayList<Cliente>();

    }

    public void adicionar(Cliente cliente){
        this.listaCliente.add(cliente);
    }

    public void remover(Cliente cliente){
        this.listaCliente.remove(cliente);
    }

    public String encontrar(Cliente cliente){
        for (Cliente clie : listaCliente){
            if (clie == cliente){
                return cliente.toString();
            }else {
                return "Usuario não encontrado";
            }
        }
        return "";
    }

    public void exibir(){
        for (Cliente clie : listaCliente){
            clie.exibirDados();
        }
    }
}
