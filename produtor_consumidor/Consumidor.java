
package thread;

import java.util.Random;


public class Consumidor implements Runnable{
    private Buffer buffer;
    private static final Random gerador = new Random();

    public Consumidor( Buffer buffer) {
        this.buffer = buffer;
    }
    
    
    @Override
    public void run(){
        try{
            
            for (int i = 0; i <= 10; i++) {
                
                Thread.sleep(gerador.nextInt(3000));
                buffer.get();
            }
            
        }catch(InterruptedException ex){
            System.out.println("Interrompido por Exceção");
            ex.printStackTrace();       
        }
    }
    
    
    
}
