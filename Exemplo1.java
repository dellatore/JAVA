
package thread;

public class Exemplo1 {
    public static void main(String[] args) {
        
        System.out.println("Criando as Threads");
        
        Thread thread1 = new Thread(new Imprimir("Tarefa1"));
        Thread thread2 = new Thread(new Imprimir("Tarefa2"));
        Thread thread3 = new Thread(new Imprimir("Tarefa3"));
        
        
        System.out.println("Threads criadas. inicializando Threads");
        thread1.start();//abre uma linha de execução(metodo run) de execução
        thread2.start();
        thread3.start();
        
        
        System.out.println("Threads incializadas. Termino do Main");
        
        
        
        
        
    }
 
}
