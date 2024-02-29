
package Atividade13;

public class Data {
    
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int d, int m, int a) {
        setDia(d);
        setMes(m);
        setAno(a);
    }
    
    public int getDia() {
        return dia;
    }
    
    public void setDia(int d) {
        if( d >= 1 && d <= 31 ) {
            dia = d;
        }
    }
    
    public int getMes() {
        return mes;
    }
    
    public void setMes(int m) {
        if( m >= 1 && m <= 12 ) {
            mes = m;
        }
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int a) {
        if( a >= 1 ) {
            ano = a;
        }
    }
    
    public boolean vemAntes(Data d) {
        
        if( d.getAno() > ano ) {
            return true;
        }
        
        if( ( d.getAno() == ano ) && ( d.getMes() > mes ) ) {
            return true;
        }
        
        if( ( d.getAno() == ano ) && ( d.getMes() == mes ) && ( d.getDia() > dia ) ) {
            return true;
        }
        
        if( ( d.getAno() == ano ) && ( d.getMes() == mes ) && ( d.getDia() == dia ) ) {
            return true;
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
    
}

