
package Atividade4;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
 
    public void mostrarData(){
        System.out.println(getDia() + "/" + getMes() + "/" + getAno());
    }
    
    public void duplicaData(Data d){
        this.dia = d.dia * 2;
        this.mes = d.mes *2;
        this.ano = d.ano *2;
    }
}
