package br.digitalHouse.ingresso;

public abstract class Ingresso {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double novoValor){
        valor = novoValor;
    }

    public abstract void imprimeValor();
}
