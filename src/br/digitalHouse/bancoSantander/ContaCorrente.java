package br.digitalHouse.bancoSantander;

public class ContaCorrente extends Conta {
    private double limite;

    @Override
    public void sacar(double valor) {
        System.out.println("Valor desejado: " + valor);

        if (this.getSaldo() < valor) {
            if (limite > valor) { //talvez voltar aqui para checar se o limite + saldo > valor
                System.out.println("Você está acessando seu limite, não tem mais volta!");
                limite = limite - (this.getSaldo() - valor);
                this.setSaldo(limite);
            } else {
                System.out.println("Você está pobre MESMO");
            }
        } else{
            this.setSaldo(this.getSaldo() - valor);
        }

        System.out.println("Saque realizado. Novo saldo: "+ this.getSaldo());
    }

    public void depositar(Cheque cheque) {
        System.out.println("Valor de depósito: " + cheque.getValor());
        this.setSaldo(this. getSaldo() + cheque.getValor());
        System.out.println("Saldo atualizado: " + this.getSaldo());
    }
}
