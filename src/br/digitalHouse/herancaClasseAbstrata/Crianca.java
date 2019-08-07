package br.digitalHouse.herancaClasseAbstrata;

public class Crianca extends Pessoa{

    //ele pede para criar um construtor pq tem no pai, se não tivesse nada não pediria
    public Crianca(String novoNome, String novoSexo) {
//        super.setNome(novoNome);
//        super.setNome(novoSexo);
        super(novoNome, novoSexo); //uso do super dentro do construtor
    }

    // método abstrato na filha, que pode ter implementação lógica
    @Override
    public void respirar() {
        //não tem obrigação de implementar lógica
        System.out.println("A pessoa está respirando =)");
    }

    // Forma de implementar o polimorfismo
    @Override
    public boolean estudar(boolean status) {
        if(status){
            System.out.println("A criança está estudando =)");
            return true;
        } else{
            System.out.println("Não tem ninguém estudando! =(");
            return false;
        }
    //  return super.estudar(status); // uso do super em um método sem alterar nada
    }
}
