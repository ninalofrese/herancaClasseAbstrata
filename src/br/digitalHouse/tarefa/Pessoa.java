package br.digitalHouse.tarefa;

public abstract class Pessoa {
    private String nome;
    private Data nascimento;

    //construtor opcional neste caso
    public Pessoa(String novoNome, Data novoNascimento){
        nome = novoNome;
        nascimento = novoNascimento;
    }

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

    // método abstrato não tem implementação lógica
    // quem herda da classe abstrata deve ter o método
    public abstract void imprimeDados();

    //converte atributos para string para visualizar
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                '}';
    }
}
