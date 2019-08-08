package br.digitalHouse.exercicios;

public class Principal {
    public static void main(String[] args) {

        Cliente novoCliente = new Cliente();
        novoCliente.setNome("Nina");
        novoCliente.setCpf("123456123");

        ContaCorrente novaContaCorrente = new ContaCorrente();
        novaContaCorrente.setCliente(novoCliente);
        novaContaCorrente.depositar(500.60);
        novaContaCorrente.sacar(130.00);

        Cheque novoCheque = new Cheque();
        novoCheque.setEmissor("Inter");
        novoCheque.setValor(800.00);
        novaContaCorrente.depositar(novoCheque);

    }
}
