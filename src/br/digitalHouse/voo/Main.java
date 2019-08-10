package br.digitalHouse.voo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pato novoPato = new Pato(30);
        Aviao novoAviao = new Aviao(50);
        SuperHomem novoHeroi = new SuperHomem(100);
        TorreDeControle novaTorre = new TorreDeControle();

//        List<Voador> decolavel = new ArrayList<>();
//        decolavel.add(novoPato);
//        decolavel.add(novoAviao);
//        decolavel.add(novoHeroi);

        novaTorre.adicionarVoador(novoPato);
        novaTorre.adicionarVoador(novoAviao);
        novaTorre.adicionarVoador(novoHeroi);
        novaTorre.voemTodos();


    }
}
