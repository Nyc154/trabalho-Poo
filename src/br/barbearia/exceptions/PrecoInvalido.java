package br.barbearia.exceptions;

public class PrecoInvalido extends RuntimeException {
    public PrecoInvalido(String message) {
        super(message);
    }
}
