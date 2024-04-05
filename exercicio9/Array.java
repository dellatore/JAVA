package exercicio9;

import java.util.Iterator;
import java.util.LinkedList;


public class Array {
    LinkedList<String> arr1;

    public Array() {
        this.arr1 = new LinkedList<>();
    }
    public void add(String str){
        arr1.add(str);
    }
    
    public void comparaArray(LinkedList<String> arr2){
        
        Iterator<String> it = arr1.iterator();
        if (arr1.equals(arr2)) {
            System.out.println(arr1);
            System.out.println(arr2);
            System.out.println("os arrays sao iguais");
        }else{
            System.out.println("os arrays sao diferentes");
        }
    }

    public int ocorrenciaElemento(String str){
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i).equals(str)) {
                return i; 
            }
        }
        
        return -1;
    }
    
    
    
}
