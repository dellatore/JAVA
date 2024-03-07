
package thread;

import java.util.Random;

public class Produtor implements Runnable{
    private Buffer buffer;
    private static final Random gerador = new Random();
    
    
    public Produtor(Buffer buffer) {
    
        this.buffer = buffer;
    }
    
    @Override
    public void run(){
        try{
            
            for (int i = 0; i <= 10; i++) {
                
                Thread.sleep(gerador.nextInt(3000));
                
                buffer.set(i);
            }
            
        }catch(InterruptedException ex){
            System.out.println("Interrompido por Exceção");
            ex.printStackTrace();       
        }
    }
    
}
