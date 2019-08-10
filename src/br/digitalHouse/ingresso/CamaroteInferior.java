package br.digitalHouse.ingresso;

public class CamaroteInferior extends VIP {
    private String localizacaoDoIngresso;

    public CamaroteInferior(String novaLocalizacao) {
        localizacaoDoIngresso = novaLocalizacao;
    }

    public String getLocalizacaoDoIngresso() {
        return localizacaoDoIngresso;
    }

    public void setLocalizacaoDoIngresso(String novaLocalizacaoDoIngresso) {
        localizacaoDoIngresso = novaLocalizacaoDoIngresso;
    }

    public void imprimirLocalizacao() {
        System.out.println("Local do assento: " + localizacaoDoIngresso);
    }
}
