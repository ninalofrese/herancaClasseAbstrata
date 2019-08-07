package br.digitalHouse.herancaClasseAbstrata;

public class Principal {
    public static void main(String[] args) {

        Crianca bebe = new Crianca("Maria", "Feminino");

        System.out.println(bebe.getNome() + "\n" + bebe.getSexo());

        bebe.estudar(true);

//        Pessoa oi = new Pessoa("Nathalia", "Feminino");
//        oi.estudar(false);
//        oi.cadastroPessoa("Nina", "Lofrese");

    }
}
