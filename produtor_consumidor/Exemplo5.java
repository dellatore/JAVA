
package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Exemplo5 {
    public static void main(String[] args) {
        
        Buffer buffer = new Buffer();
        
        Produtor produtor = new Produtor(buffer);
        
        Consumidor consumidor = new Consumidor(buffer);
        
        
        ExecutorService executorThreads = Executors.newCachedThreadPool();
        
        
        executorThreads.execute(produtor);
        executorThreads.execute(consumidor);
        
        executorThreads.shutdown();
    }
}
