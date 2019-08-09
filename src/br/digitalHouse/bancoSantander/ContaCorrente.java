package br.digitalHouse.bancoSantander;

public class ContaCorrente extends Conta {
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        System.out.println("Valor desejado: " + valor);

        if (this.getSaldo() < valor) {
            if (limite > valor) { //talvez voltar aqui para checar se o limite + saldo > valor
                System.out.println("Sacando do limite");
                if (getSaldo() > 0) {
                    this.setSaldo(getSaldo() - valor);
                    limite = limite - (getSaldo() + valor);
                } else {
                    this.setSaldo(this.getSaldo() - valor);
                    limite = limite - (valor - this.getSaldo());
                }
                System.out.println("Saque realizado. Novo saldo: " + this.getSaldo());
                System.out.println("Você tem somente " + limite + " do seu limite do cheque especial");
            } else {
                System.out.println("Você está pobre MESMO, seu limite é insuficiente");
            }
        } else {
            this.setSaldo(this.getSaldo() - valor);
        }


    }

    public void depositar(Cheque cheque) {
        System.out.println("Valor de depósito: " + cheque.getValor());
        this.setSaldo(this.getSaldo() + cheque.getValor());
        System.out.println("Saldo atualizado: " + this.getSaldo());
    }
}
