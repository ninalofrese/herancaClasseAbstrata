package br.digitalHouse.tarefa;

public class Gerente extends Funcionario {
    private String area;

    public Gerente(double novoSalario, String novaArea) {
        super(novoSalario);
        area = novaArea;
    }

    public String getArea(){
        return area;
    }

    public void setArea(String novaArea){
        area = novaArea;
    }

    @Override
    public void setImposto(double imposto) {
        imposto = 5.0;
        super.setImposto(imposto);
    }

    @Override
    public void calculaImposto() {
        System.out.println("Nome: " + getNome());
        System.out.println("Nascimento: " + getNascimento());
        System.out.println("Area: " + area);
        System.out.println("Salário: " + (getSalario() - getImposto()));
    }
}
