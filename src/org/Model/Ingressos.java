package org.Model;

import java.util.ArrayList;
import java.util.List;

public class Ingressos {
    private int quantidade;
    private int meiaEntrada;
    private int inteiraEntrada;
    private List<Filmes> filmes;

    public Ingressos() {
        this.quantidade = 0;
        this.meiaEntrada = 0;
        this.inteiraEntrada = 0;
        this.filmes = new ArrayList<>();
    }

    public Ingressos(int quantidade, int meiaEntrada, int inteiraEntrada, List<Filmes> filmes) {
        this.quantidade = quantidade;
        this.meiaEntrada = meiaEntrada;
        this.inteiraEntrada = inteiraEntrada;
        this.filmes = filmes;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getMeiaEntrada() {
        return meiaEntrada;
    }

    public void setMeiaEntrada(int meiaEntrada) {
        this.meiaEntrada = meiaEntrada;
    }

    public int getInteiraEntrada() {
        return inteiraEntrada;
    }

    public void setInteiraEntrada(int inteiraEntrada) {
        this.inteiraEntrada = inteiraEntrada;
    }

    public List<Filmes> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filmes> filmes) {
        this.filmes = filmes;
    }
}
