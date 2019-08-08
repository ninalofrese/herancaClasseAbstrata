package br.digitalHouse.exercicios;

public class ContaCorrente extends Conta{
    private double limite;

    public void depositar(Cheque cheque){
        System.out.println("Realizando depósito de cheque... quantia: R$ "+ cheque.getValor());
        this.setSaldo(getSaldo() + cheque.getValor());
        System.out.println("Depósito realizado " + this.getCliente().getNome() + "\nSaldo atualizado: R$" + this.getSaldo());
    }

    @Override
    public void sacar(double quantia) {
        System.out.println("Realizando saque... quantia R$ " + quantia);

        if(this.getSaldo() < quantia){
            System.out.println("Saldo insuficiente. Sacando do limite, cuidado...");

            if(limite > quantia){
                this.setSaldo(getSaldo() - (limite - quantia)); //tira o valor do saldo
                this.limite -= quantia; //limite restante
            } else {
                System.out.println("Saldo insuficiente, você tá sem grana, " + this.getCliente().getNome() + " e seu nome tá mal na praça");
            }

            return;
        }

        this.setSaldo(this.getSaldo() - quantia);
        System.out.println("Saque realizado " + this.getCliente().getNome() + "\nSaldo atualizado: R$ " + this.getSaldo());
    }
}
