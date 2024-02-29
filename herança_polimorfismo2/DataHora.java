
package Atividade12;


public class DataHora {private int dia;
    private int mes;
    private int ano;
    private int hora;
    

    public DataHora(int dia, int mes, int ano, int hora) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
        setHora(hora);
    }

    public int getHora() {
        return hora;
    }

    protected void setHora(int hora) {
        this.hora = hora;
    }

    
    public int getDia() {
        return dia;
    }

    protected void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    protected void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    protected void setAno(int ano) {
        this.ano = ano;
    }
 
    public void mostrarData(){
        System.out.println(getDia() + "/" + getMes() + "/" + getAno());
    }
    
    public void duplicaData(DataHora d){
        this.dia = d.dia * 2;
        this.mes = d.mes *2;
        this.ano = d.ano *2;
    }
}