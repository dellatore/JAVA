
package Atividade4;


public class Contador {
    private int cont;

    public Contador(int cont) {
        this.cont = cont;
    }

    public int getCont() {
        return cont;
    }
    
    public int incrementar(int valor){
        return this.cont += valor;
    }
    
    public void imprimirValor(){
        System.out.println("valor:" + getCont());
    }
    
    public int zerar(){
        return this.cont = 0;
    }
    
    
}
