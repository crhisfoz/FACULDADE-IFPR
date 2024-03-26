package br.edu.ifpr.formulario.models;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Formulario {


    private String texto;
    private Integer numero;
    private LocalDate data;
    private String opcao;
    private String[] herois;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }

    public String[] getHerois() {
        return herois;
    }

    public void setHerois(String[] herois) {
        this.herois = herois;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Formulario that = (Formulario) o;
        return Objects.equals(texto, that.texto) && Objects.equals(numero, that.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(texto, numero);
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "texto='" + texto + '\'' +
                ", numero=" + numero +
                ", data=" + data +
                ", opcao='" + opcao + '\'' +
                ", herois=" + Arrays.toString(herois) +
                '}';
    }
}
