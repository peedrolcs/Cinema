package org.Model;

public class Sessao {
    private String sala;
    private double horario;
    private int ingressos;
    enum status{
        Disponivel,
        Exibicao,
        Finalizado
    }
    public Sessao() {
        this.sala = "";
        this.horario = 0;
        this.ingressos = 0;
    }

    public Sessao(String sala, double horario, int ingressos) {
        this.sala = sala;
        this.horario = horario;
        this.ingressos = ingressos;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }

    public int getIngressos() {
        return ingressos;
    }

    public void setIngressos(int ingressos) {
        this.ingressos = ingressos;
    }
}
