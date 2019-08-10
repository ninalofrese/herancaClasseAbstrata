package br.digitalHouse.tarefa;

public abstract class Pessoa {
    private String nome;
    private Data nascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data novoNascimento) {
        nascimento = novoNascimento;
    }

    public abstract void imprimeDados();

}
