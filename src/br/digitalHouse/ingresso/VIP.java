package br.digitalHouse.ingresso;

public class VIP extends Ingresso {
    private double valorVIP;

    public double getValorVIP() {
        return valorVIP;
    }

    public void setValorVIP(double valorAdicional) {
        this.valorVIP = valorAdicional;
    }

    @Override
    public void imprimeValor() {
        System.out.println("Valor VIP: " + (super.getValor() + valorVIP));
    }
}
