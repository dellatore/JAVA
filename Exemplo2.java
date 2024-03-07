
package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Exemplo2 {
    public static void main(String[] args) {
        
        System.out.println("Criando Threads");
        
        Imprimir tarefa1 = new Imprimir("Tarefa1");
        Imprimir tarefa2 = new Imprimir("Tarefa1");
        Imprimir tarefa3 = new Imprimir("Tarefa1");
         
        
        System.out.println("Threads criadas. inicializando Threads");
        
        ExecutorService executorThreads = Executors.newCachedThreadPool();
        
        executorThreads.execute(tarefa1);
        executorThreads.execute(tarefa2);
        executorThreads.execute(tarefa3);
        
        System.out.println("Threads incializadas. Termino do Main");
        
        executorThreads.shutdown();//encerra threads trabalhadors quando suas tarefas terminam
        
    }
}
