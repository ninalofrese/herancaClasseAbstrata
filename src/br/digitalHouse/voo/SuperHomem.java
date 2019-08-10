package br.digitalHouse.voo;

public class SuperHomem implements Voador {
    private int experiencia;

    public SuperHomem(int experienciaInicial){
        experiencia = experienciaInicial;
    }

    public int getExperiencia(){
        return experiencia;
    }

    public void setExperiencia(int novaExperiencia){
        experiencia = novaExperiencia;
    }

    @Override
    public void voar() {
        experiencia += 3;
        System.out.println("Estou voando como um campeão");
    }
}
