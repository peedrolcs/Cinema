package org.Model;

public class Funcionario {
    private String nome;
    private int idFuncionario;

    public Funcionario() {
        this.nome = "";
        this.idFuncionario = 0;
    }

    public Funcionario(String nome, int idFuncionario) {
        this.nome = nome;
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
}
