
package thread;

import java.util.Random;

public class Imprimir implements Runnable{
    
    private String nomeTarefa;
    private final int delay;
    private final static Random gerador = new Random();

    public Imprimir(String nomeTarefa) {
        
        this.nomeTarefa = nomeTarefa;
        this.delay = gerador.nextInt(5000);
    }
    
    
    @Override
    public void run(){
        System.out.println(nomeTarefa + "indo dormir por " + delay/1000.0 + "segundos1");
        
        try{
        Thread.sleep(delay);
        System.out.println(nomeTarefa + "terminou de dormir");
        }catch(InterruptedException ex){
            System.out.println("A Thread foi interrompida (terminada) por exceção.");
        }
    }
}


