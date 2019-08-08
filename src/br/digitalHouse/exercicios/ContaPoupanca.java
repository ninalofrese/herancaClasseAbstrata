package br.digitalHouse.exercicios;

public class ContaPoupanca extends Conta {
    private double taxa;

    public void recolherJuros() {
        this.setSaldo(this.getSaldo() + (taxa / 100));
    }
}
