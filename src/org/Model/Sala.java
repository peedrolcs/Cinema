package org.Model;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int capacidade;
    private int numero;
    private List<Filmes> filmes;
    private List<Sessao> sessoes;

    public Sala() {
        this.capacidade = 0;
        this.numero = 0;
        this.filmes = new ArrayList<>();
        this.sessoes = new ArrayList<>();
    }

    public Sala(int capacidade, int numero, List<Filmes> filmes, List<Sessao> sessoes) {
        this.capacidade = capacidade;
        this.numero = numero;
        this.filmes = filmes;
        this.sessoes = sessoes;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Filmes> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filmes> filmes) {
        this.filmes = filmes;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }
}
