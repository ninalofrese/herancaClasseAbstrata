package br.digitalHouse.tarefa;

public class Funcionario extends Pessoa {
    private double salario;
    private double imposto;

    public void calculaImposto(){
        this.imposto = salario * (imposto/100);
    }

    @Override
    public void imprimeDados() {

    }
}
