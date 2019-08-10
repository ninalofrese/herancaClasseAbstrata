package br.digitalHouse.impressora;

import java.util.ArrayList;
import java.util.List;

public class Impressora {
    private List<Imprimivel> arquivos = new ArrayList<>();

    public List<Imprimivel> getArquivos() {
        return arquivos;
    }

    public void setArquivos(List<Imprimivel> arquivos) {
        this.arquivos = arquivos;
    }

    public void imprimirTudo(){
        //percorre a lista de imprimíveis para fazer a impressão (for?)
        for(int i= 0; i < arquivos.size();i++){
            arquivos.get(i).imprimir();
        }
    }

    public void adicionarImprimivel(Imprimivel umImprimivel){
        //adiciona na lista... ou seja, .add()
        arquivos.add(umImprimivel);
    }
}
