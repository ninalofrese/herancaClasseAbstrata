package br.digitalHouse.interfaces;

public class Principal {
    public static void main(String[] args) {

        Cachorro meuCachorro = new Cachorro("Labrador");
        meuCachorro.animalSaudavel("deu bom!");

        boolean retornoMetodo = meuCachorro.animalSaudavel("deu ruim!");
        System.out.println(retornoMetodo); //usando o return

        meuCachorro.setIdade(10);
        int idadeAnimal = meuCachorro.calculoIdadeAnimal(6);
        System.out.println("A idade total é " + idadeAnimal);

    }
}
