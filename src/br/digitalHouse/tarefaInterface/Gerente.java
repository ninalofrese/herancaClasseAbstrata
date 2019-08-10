package br.digitalHouse.tarefaInterface;

public class Gerente extends Funcionario implements Imposto {
    private String area;

    public Gerente(String novoNome, Data novoNascimento, double novoSalario, String novaArea) {
        super(novoNome, novoNascimento, novoSalario);
        area = novaArea;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String novaArea) {
        area = novaArea;
    }

    // Ele não obriga a herdar o imprimeDados, mas podemos sobrescrever porque temos no diagrama

    // não dá pra ser void sem parâmetro
    @Override
    public double calculaImposto() {
        double callImposto = super.getSalario() * 0.05;
        setImposto(callImposto);
        return callImposto;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        //desnecessário porque ele tá usando a sobrescrita do calculaImposto quando roda o objeto Gerente
        //double salarioComImposto = super.getSalario() - calculaImposto();
        //mas eu poderia usar se eu não usasse o super
        System.out.println("Area: " + area);
    }
}
