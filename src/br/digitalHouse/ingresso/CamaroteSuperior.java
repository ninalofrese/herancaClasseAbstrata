package br.digitalHouse.ingresso;

public class CamaroteSuperior extends VIP {
    private double valorAdicional;

    public CamaroteSuperior(double extraInicial) {
        valorAdicional = extraInicial;
    }

    @Override
    public void imprimeValor() {
        System.out.println("Valor do camarote: " + (super.getValor() + super.getValorVIP() + valorAdicional));
    }
}
