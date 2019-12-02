package com.revisaon2.junit.entidades;

public class Filme {

    private String nome;
    private Integer estoque;
    private Double preLocacao;

    public Filme() {
    }

    public Filme(String nome, Integer estoque, Double preLocacao) {
        this.nome = nome;
        this.estoque = estoque;
        this.preLocacao = preLocacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public Double getPreLocacao() {
        return preLocacao;
    }

    public void setPreLocacao(Double preLocacao) {
        this.preLocacao = preLocacao;
    }
}
