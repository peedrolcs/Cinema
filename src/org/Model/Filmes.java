package org.Model;

import java.util.ArrayList;
import java.util.List;

    public class Filmes {
        private String titulo;
        private String duracao;
        private List<Sessao> sessao;
        private List<Sala> sala;

        public Filmes() {
            this.titulo = "";
            this.duracao = "";
            this.sessao = new ArrayList<>();
            this.sala = new ArrayList<>();
        }

        public Filmes(String titulo, String duracao, List<Sessao> sessao, List<Sala> sala) {
            this.titulo = titulo;
            this.duracao = duracao;
            this.sessao = sessao;
            this.sala = sala;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getDuracao() {
            return duracao;
        }

        public void setDuracao(String duracao) {
            this.duracao = duracao;
        }

        public List<Sessao> getSessao() {
            return sessao;
        }

        public void setSessao(List<Sessao> sessao) {
            this.sessao = sessao;
        }

        public List<Sala> getSala() {
            return sala;
        }

        public void setSala(List<Sala> sala) {
            this.sala = sala;
        }
    }