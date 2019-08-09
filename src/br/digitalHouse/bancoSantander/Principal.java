package br.digitalHouse.bancoSantander;

public class Principal {
    public static void main(String[] args) {

        Cliente novoCliente = new Cliente();
        novoCliente.setNome("Nina");

        ContaCorrente novaConta = new ContaCorrente();

        novaConta.setSaldo(200.0);
        novaConta.setLimite(600.0);
        novaConta.sacar(400.0);
        novaConta.sacar(200.0);
    }
}
