package br.digitalHouse.voo;

public class Aviao implements Voador {
    private int horasDeVoo;

    public Aviao(int horasIniciais){
        horasDeVoo = horasIniciais;
    }

    public int getHorasDeVoo(){
        return horasDeVoo;
    }

    public void setHorasDeVoo(int novasHorasDeVoo){
        horasDeVoo = novasHorasDeVoo;
    }


    @Override
    public void voar() {
        horasDeVoo += 13;
        System.out.println("Estou voando como um avião");
    }
}
