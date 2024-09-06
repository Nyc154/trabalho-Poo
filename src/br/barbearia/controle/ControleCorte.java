package br.barbearia.controle;

import br.barbearia.modelo.Corte;

import java.util.ArrayList;
import java.util.List;

public class ControleCorte {
    private List<Corte> listaCorte;


    public ControleCorte() {
        this.listaCorte = new ArrayList<>();

    }

    public void adicionar(Corte corte){
        this.listaCorte.add(corte);
    }

    public void remover(Corte corte){
        this.listaCorte.remove(corte);
    }

    public String encontrar(String corte){
        for (Corte cort : listaCorte){
            if (cort == corte){
                return corte.toString();
            }else {
                return "Usuario não encontrado";
            }
        }
        return "";
    }

    public void exibir(){
        for (Corte cort : listaCorte){
            cort.exibirDados();
        }
    }
}
