
package thread;


public class Buffer {
    
    private int valor;
    private boolean ocupado;

    public Buffer() {
        valor = -1;
        ocupado = false;
    
    }
    
    public synchronized void set(int valor) throws InterruptedException{
        
        while (ocupado) {
            System.out.println("Produtor tenta escrever no buffer mas o mesmo esta cheio");
            System.out.println(valor + " | " + ocupado + ".\n");
            wait();
        }
        this.valor = valor;
        ocupado = true;
        System.out.println("Produtor escreveu no Buffer o valor " + valor + ".\n");
        
        notifyAll();
        
    }
    
    public synchronized int get() throws InterruptedException{
        
        while(!ocupado){
            System.out.println("Consumidor tenta ler o buffer mas o mesmo se encontra desocupado");
            System.out.println(valor + " | " + ocupado + ".\n");
            wait();
        }
        
        ocupado = false;
        System.out.println("Consumidor leu do buffer o " + valor + ".\n");
        notifyAll();
        
        return valor;
    }
    
    
}
