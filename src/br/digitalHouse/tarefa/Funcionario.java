package br.digitalHouse.tarefa;

public class Funcionario extends Pessoa {
    private double salario;
    private double imposto = 3.0;

    public Funcionario(String novoNome, String nascimento, double novoSalario){
        setNome(novoNome);
        //setNascimento(nascimento);
        salario = novoSalario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void calculaImposto() {
        this.imposto = salario * (imposto / 100);
    }

    @Override
    public void imprimeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Nascimento: " + getNascimento());
        System.out.println("Salário: " + (salario - imposto));
    }


}
