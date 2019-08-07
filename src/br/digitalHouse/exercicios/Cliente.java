package br.digitalHouse.exercicios;

public class Cliente {
    private int numero;
    private String nome;
    private String sobrenome;
    private String rg;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
