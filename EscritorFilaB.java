
package thread;

public class EscritorFilaB implements Runnable{

    private FilaB fila;
    private int valorIncial;

    public EscritorFilaB(FilaB fila, int valorInicial) {
    
        this.fila = fila;
        this.valorIncial = valorIncial;
    }
    
    
    @Override
    public void run(){
        for (int i = valorIncial; i < valorIncial + 3; i++) {
            fila.add(i);
        }
    
    
    }
    
    

    
}
