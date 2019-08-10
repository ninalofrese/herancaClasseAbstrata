package br.digitalHouse.tarefaInterface;

public class Cliente extends Pessoa {
    private int codigo;

    //Ele tem o super e passa nome e nascimento por causa do construtor base feito no pai Pessoa
    public Cliente(String novoNome, Data novoNascimento, int novoCodigo) {
        super(novoNome, novoNascimento); //sempre que quiser acessar algo do pai quando é protected
        codigo = novoCodigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int novoCodigo) {
        codigo = novoCodigo;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Nome: " + super.getNome()); //como é do pai, usa super
        //System.out.println("Nascimento: " + super.getNascimento().getDia() + "/" + super.getNascimento().getMes() + "/" + super.getNascimento().getAno());
        System.out.println("Nascimento: " + super.getNascimento().toString()); //outra opção que usa o toString que está sobrescrito em Data
        System.out.println("Código do cliente: " + codigo);
    }
}
