package br.digitalHouse.exercicios;

public abstract class Conta {
    private double saldo;
    private Cliente cliente;

    public void depositar(double quantia) {
        System.out.println("Realizando depósito... quantia R$ " + quantia);
        this.saldo += quantia;
        System.out.println("Depósito realizado" + this.cliente.getNome() + ".\nSaldo atualizado: " + this.saldo);
    }

    public void sacar(double quantia) {
        System.out.println("Realizando saque... quantia R$ " + quantia);

        if (saldo < quantia) {
            System.out.println("Saldo insuficiente.\nVocê tá sem grana, " + this.cliente.getNome());
            return;
        }

        this.saldo -= quantia;
        System.out.println("Saque realizado " + this.cliente.getNome() + "\nSaldo atualizado: " + this.saldo);

    }

    // consultar saldo
    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
