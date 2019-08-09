package br.digitalHouse.interfaces;

public class Cachorro extends Animal implements Saudavel {

    public Cachorro(String novaRaca){
        super(novaRaca);
    }

    @Override
    public boolean animalSaudavel(String diagnostico) {
        if (diagnostico != null && diagnostico != "") {
            System.out.println("O cachorro " + getRaca() + " está com o seguinte diagnóstico: " + diagnostico);
            return true;
        } else {
            System.out.println("O cachorro " + getRaca() + " não tem diagnóstico!");
            return false;
        }


    }

    @Override
    public int calculoIdadeAnimal(int novaIdade) {
        System.out.println("Estamos somando as idades");
        return getIdade() + novaIdade;
    }

    //herda de Animal, e animal implementa Brincavel
    @Override
    public void seDivertir() {

    }
}
