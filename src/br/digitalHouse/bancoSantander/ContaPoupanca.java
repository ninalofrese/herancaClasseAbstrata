package br.digitalHouse.bancoSantander;

public class ContaPoupanca extends Conta {
    private double taxa;

    public void recolherJuros() {
        this.setSaldo(this.getSaldo() * (taxa / 100));
        System.out.println("Saldo atualizado depois dos juros: " + this.getSaldo());
    }
}
