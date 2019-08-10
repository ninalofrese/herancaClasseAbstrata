package br.digitalHouse.tarefaInterface;

public class Funcionario extends Pessoa implements Imposto{
    private double salario;
    private double imposto;

    public Funcionario(String novoNome, Data novoNascimento, double novoSalario) {
        super(novoNome, novoNascimento);
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

    @Override
    public void imprimeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Nascimento: " + super.getNascimento().getDia() + "/" + super.getNascimento().getMes() + "/" + super.getNascimento().getAno());
        double salarioComImposto = salario - calculaImposto();
        System.out.println("Salário: " + salarioComImposto);
    }


    @Override
    public double calculaImposto() {
        imposto = salario * 0.03;

        return imposto;
    }
}
