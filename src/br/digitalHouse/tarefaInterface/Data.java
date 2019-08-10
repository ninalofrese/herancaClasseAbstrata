package br.digitalHouse.tarefaInterface;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    String dataDeNascimento;

    //o construtor nesse caso facilita para passar tudo de uma vez
    public Data(int novoDia, int novoMes, int novoAno) {
        dia = novoDia;
        mes = novoMes;
        ano = novoAno;
        //se eu printar aqui, vai printar quando criar a data
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return dia +
                "/" + mes +
                "/" + ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


}
