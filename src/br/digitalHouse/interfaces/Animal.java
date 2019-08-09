package br.digitalHouse.interfaces;

public abstract class Animal implements Brincavel{
    private String raca;
    private int idade;
    private String cor;

    public Animal(String novaRaca) {
        raca = novaRaca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String novaRaca) {
        raca = novaRaca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        idade = novaIdade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String novaCor) {
        cor = novaCor;
    }
}
