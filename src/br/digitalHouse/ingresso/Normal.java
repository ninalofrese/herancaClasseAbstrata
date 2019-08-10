package br.digitalHouse.ingresso;

public class Normal extends Ingresso {

    public Normal(double precoInicial){
        super.setValor(precoInicial);
    }

    @Override
    public void imprimeValor() {
        System.out.println("Valor: R$ " + super.getValor());
    }
}
