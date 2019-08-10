package br.digitalHouse.impressora;

public class Contrato extends Impressora implements Imprimivel {
    private String nome;
    private String tipo;

    public Contrato(String novoNome, String novoTipo){
        nome = novoNome;
        tipo = novoTipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String novoTipo) {
        tipo = novoTipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um contrato muito legal\nNome: " + nome + "\nTipo: " + tipo);
    }


}
