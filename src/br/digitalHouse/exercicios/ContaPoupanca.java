package br.digitalHouse.exercicios;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo){
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

    public void recolherJuros(){

    }
}
