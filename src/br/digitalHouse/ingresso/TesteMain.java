package br.digitalHouse.ingresso;

import java.util.Scanner;

public class TesteMain {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        Normal umIngressoNormal = new Normal(10.0);
        CamaroteInferior umCamaroteInferior = new CamaroteInferior( "A15");
        umCamaroteInferior.setValor(10.0);
        umCamaroteInferior.setValorVIP(20.0);
        CamaroteSuperior umCamaroteSuperior = new CamaroteSuperior(30.0);
        umCamaroteSuperior.setValor(10.0);
        umCamaroteSuperior.setValorVIP(20.0);

        System.out.println("Digite 1 para ingresso normal e 2 para VIP");
        int escolha = le.nextInt();

        if(escolha == 1){
            umIngressoNormal.imprimeValor();
        } else if(escolha == 2){
            System.out.println("Digite 1 para camarote superior ou 2 para inferior");
            escolha = le.nextInt();
            if (escolha == 1){
                umCamaroteSuperior.imprimeValor();
            } else if(escolha ==2){
                umCamaroteInferior.imprimeValor();
            }
        }

    }
}
