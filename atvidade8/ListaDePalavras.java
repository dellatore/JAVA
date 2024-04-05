
package atvidade8;

import java.util.HashMap;
import java.util.Map;


public class ListaDePalavras {
    private Map<Integer, String> lista;
    private int index;
    
    
    public ListaDePalavras() {
        this.lista = new HashMap<>();
        this.index= 0;
    }
    
    
    public void add(String str){
        lista.put(index,str);
        this.index++;
    }
    
    public Long conta(String str){
        if (lista.containsValue(str)) {
            return lista.values().stream().filter(p -> p.equals(str)).count();
        }else{
            return 0l;
        }
        
        
        
        
    }
            
    
}
