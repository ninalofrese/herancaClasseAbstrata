package br.digitalHouse.bancoSantander;

public abstract class Conta {
    private double saldo;

    // substitui consultar()
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        System.out.println("Valor de depósito: " + valor);
        saldo += valor;
        System.out.println("Saldo atualizado: " + saldo);
    }

    public void sacar(double valor) {
        System.out.println("Tentando sacar: " + valor);
        if (valor > saldo) {
            System.out.println("Você tá pobre e não tem saldo.");
        } else {
            saldo -= valor;
            System.out.println("Saldo atualizado: " + saldo);
        }
    }


}
