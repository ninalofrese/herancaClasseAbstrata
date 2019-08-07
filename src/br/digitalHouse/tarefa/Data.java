package br.digitalHouse.tarefa;

public class Data {
    public int dia;
    public int mes;
    public int ano;

    public String getData(){
        String data = dia + "/" + mes + "/" + ano;
        return data;
    }

    public int getDia() {
        return dia;
    }

    public void setData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

}
