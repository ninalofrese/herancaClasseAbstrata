package br.digitalHouse.exercicios;

public abstract class Conta {
    private double saldo;

    public Conta(double novoSaldo){
        saldo = novoSaldo;
    }

    public abstract String fazerDeposito(double valor);
    public abstract boolean sacarDinheiro(double valor);
    public abstract void consultarSaldo();

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

}
