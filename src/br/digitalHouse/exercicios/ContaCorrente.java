package br.digitalHouse.exercicios;

public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(double saldo){
        super(saldo);
    }

    @Override
    public String fazerDeposito(double valor) {
        return null;
    }

    @Override
    public boolean sacarDinheiro(double valor) {
        return false;
    }

    @Override
    public void consultarSaldo() {

    }

}
