package br.edu.ifpr.formulario.services;

public class FormularioService {
    public String validaTexto(String text)throws IllegalArgumentException{
        if (text == null || text.isEmpty() || text.length() < 2) {
            throw new IllegalArgumentException("O valor informado é inválido");
        }
        return text.trim();
    }
}
