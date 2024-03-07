
package thread;

import java.util.Arrays;
import java.util.Random;

public class FilaB {
   private int[] vetor ;
   private int indice;
   private final static Random gerador = new Random();
   
    public FilaB(int tamanho) {
    
        vetor = new int[tamanho];
        indice = 0;
        
    }
   
    public synchronized void add(int valor){
        int i = indice;
        try{
            Thread.sleep(gerador.nextInt(500));
        }catch(InterruptedException ex){
            System.out.println("A Thread foi interrompida (terminada) por exceção.");
            ex.printStackTrace();
        }
        
        vetor[i] = valor;
        
        System.out.println(Thread.currentThread().getName() + "escreveu o valor " + valor + "na posiçaõ " + i + ".");
        
        indice++;
        
        System.out.println("O indice foi incrementado praa " + indice + ".\n");
        
    }
    
    @Override
    public String toString(){
        return "Fila: " + Arrays.toString(vetor);
    }
   
}
