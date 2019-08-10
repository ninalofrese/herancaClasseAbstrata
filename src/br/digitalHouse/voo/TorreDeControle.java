package br.digitalHouse.voo;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {
    List<Voador> voadores = new ArrayList<>();


    public void voemTodos(){
        for(int i=0; i<voadores.size();i++){
            voadores.get(i).voar();
        }
    }

    public void adicionarVoador(Voador umVoador){
        voadores.add(umVoador);
    }
}
