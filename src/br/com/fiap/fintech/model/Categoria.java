package br.com.fiap.fintech.model;

public class Categoria {
    private String nome;
    private String corHexadecimal;

    public Categoria(String nome, String corHexadecimal) {
        this.nome = nome;
        this.corHexadecimal = corHexadecimal;
    }

    public String getNome() {
        return nome;
    }

    public String getCorHexadecimal() {
        return corHexadecimal;
    }
}