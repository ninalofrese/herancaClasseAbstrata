package br.digitalHouse.tarefa;

import java.util.ArrayList;
import java.util.List;

//CadastroPessoa usa Pessoa
public class CadastroPessoa {
    //private int qtdeAtual; não precisa desse atributo

    private List<Pessoa> pessoas = new ArrayList<>();
    // visibilidade List<tipo de dado que vai popular> variavel = instancia o ArrayList<>()
    // [item1, item2,..]
    //adiciona pessoa na lista
    public void cadastrarPessoa(Pessoa pess){
        pessoas.add(pess);
    }

    //imprime as pessoas
    public void imprimeCadastro(){
        for(int i=0; i < pessoas.size(); i++){
            System.out.println(pessoas.get(i).toString()); //toString sobrescrito na classe pesssoa.
        }
    }

}
