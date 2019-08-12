package br.digitalHouse.bancoSantander;

public class Principal {
    public static void main(String[] args) {

        Cliente novoCliente = new Cliente();
        novoCliente.setNome("Nina");

        ContaCorrente novaConta = new ContaCorrente();

        novaConta.setSaldo(200.0);
        novaConta.setLimite(600.0);
        novaConta.sacar(400.0); //novo saldo = -200, limite: 400
        novaConta.sacar(200.0); // novo saldo = -400, limite: 200
        novaConta.sacar(400.0); //nao saca, pq é menor do que o limite e nao tem mais saldo
        novaConta.depositar(600.0); //
    }
}
