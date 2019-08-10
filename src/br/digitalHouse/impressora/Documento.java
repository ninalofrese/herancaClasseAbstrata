package br.digitalHouse.impressora;

public class Documento implements Imprimivel{
    private String nome;
    private String tipo;

    public Documento(String novoNome, String novoTipo){
        nome = novoNome;
        tipo = novoTipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um documento do Word\nNome: " + nome + "\nTipo: " + tipo);
    }
}
