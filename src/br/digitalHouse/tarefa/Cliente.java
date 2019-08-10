package br.digitalHouse.tarefa;

public class Cliente extends Pessoa {
    private int codigo;

    public Cliente(int novoCodigo){
        codigo = novoCodigo;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int novoCodigo){
        codigo = novoCodigo;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Nascimento: " + getNascimento());
        System.out.println("Código do cliente: " + codigo);
    }
}
