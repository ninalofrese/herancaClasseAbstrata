package br.digitalHouse.herancaClasseAbstrata;

public abstract class Pessoa {
    protected String nome;
    private String sobrenome;
    private String cpf;
    protected String sexo;

    //o construtor pode existir na classe abstrata, não deve ser instanciado diretamente
    public Pessoa(String novoNome, String novoSexo) {
        nome = novoNome;
        sexo = novoSexo;
    }

    //método abstrato não pode ter implementação lógica na classe abstrata, mas pode ter parâmetro
    public abstract void respirar();

    //OVERLOAD
    //mesma visibilidade, mesmo nome, parâmetros diferentes
    public void cadastroPessoa(String nome, String sobrenome) {
        System.out.println("Dados da pessoa: " + nome + " " + sobrenome);
    }

    public void cadastroPessoa(String nome, String sobrenome, String sexo) {
        System.out.println("Dados atualizados: " + nome + " " + sobrenome + " e " + sexo);
    }

    public void cadastroPessoa(String nome) {
        System.out.println("Dados simples: " + nome);
    }


    public boolean estudar(boolean status) {
        return false;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
