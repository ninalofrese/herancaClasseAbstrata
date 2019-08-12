package br.digitalHouse.bancoSantander;

public class ContaCorrente extends Conta {
    private double limite;
    private double limiteMaximo;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
        limiteMaximo = limite;
    }

    @Override
    public void sacar(double valor) {
        System.out.println("Valor desejado: " + valor);

        if (this.getSaldo() < valor) {
            if (this.getSaldo() + limite > valor) {
                this.setSaldo(this.getSaldo() - valor);

                if (getSaldo() < 0) {
                    limite += getSaldo();
                    double resto = Math.abs(this.getSaldo());
                    setSaldo(0);
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
        System.out.println("Valor depositado: " + cheque.getValor());

        limite = limite + cheque.getValor();

        if (limite > limiteMaximo) {
            this.setSaldo(this.getSaldo() + limite - limiteMaximo);
            limite = limiteMaximo;
        }
        System.out.println("Depósito realizado. Novo saldo: " + this.getSaldo());
        System.out.println("Seu limite é de: " + limite);
        
    }

    //Usei o limite também no depósito
    @Override
    public void depositar(double valor) {
        System.out.println("Valor depositado: " + valor);

        limite = limite + valor;

        if (limite > limiteMaximo) {
            this.setSaldo(this.getSaldo() + limite - limiteMaximo);
            limite = limiteMaximo;
        }
        System.out.println("Depósito realizado. Novo saldo: " + this.getSaldo());
        System.out.println("Seu limite é de: " + limite);
    }
}
