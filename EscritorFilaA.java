
package thread;

public class EscritorFilaA implements Runnable{

    private FilaA fila;
    private int valorIncial;

    public EscritorFilaA(FilaA fila, int valorInicial) {
    
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
