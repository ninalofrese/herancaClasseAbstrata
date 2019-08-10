package br.digitalHouse.voo;

public class Pato implements Voador {
    private int energia;

    public Pato(int energiaInicial){
        energia = energiaInicial;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int novaEnergia) {
        energia = novaEnergia;
    }

    @Override
    public void voar() {
        energia -= 5;
        System.out.println("Estou voando como um pato");
    }

}
