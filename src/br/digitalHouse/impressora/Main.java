package br.digitalHouse.impressora;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Documento novoDocumento = new Documento("Notas", "Word");
        Foto novaFoto = new Foto("Atibaia", "Raw");
        Contrato novoContrato = new Contrato("Contrato Social", "PDF");

//        List<Imprimivel> novaFila = new ArrayList<>();
//        novaFila.add(novoDocumento);
//        novaFila.add(novoContrato);
//        novaFila.add(novaFoto);

        Impressora epson = new Impressora();

        epson.adicionarImprimivel(novaFoto);
        epson.adicionarImprimivel(novoContrato);
        epson.adicionarImprimivel(novoDocumento);
        epson.imprimirTudo();



    }
}
