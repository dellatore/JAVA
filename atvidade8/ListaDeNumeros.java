
package atvidade8;

import java.util.List;
import java.util.stream.Collectors;


public class ListaDeNumeros {
    List<Integer> lista;

    public ListaDeNumeros() {
        lista = List.of(1,2,3,4,1,2,3);
        
    }
    
    public List<Integer> remover(){
        //System.out.println("lista sem as palavras que se repetem: "+ lista.stream().distinct().collect(Collectors.toList()));
        return lista.stream().distinct().collect(Collectors.toList());
        
    }
    
}
