package br.digitalHouse.tarefa;

//TODO Falta finalizar
import java.util.ArrayList;
import java.util.List;

public class CadastroPessoa {
    private int qtdePessoas;

    private List<Pessoa> pessoas = new ArrayList<>();

        public void cadastraPessoa(Pessoa pess){

            Pessoa pessoa = new Pessoa() {
            
            @Override
            public void imprimeDados() {
                System.out.println("Nome: " + getNome());
                System.out.println("Nascimento: " + getNascimento()));
            }
            };

            this.pessoas.add(pess);

        };



    }
}
