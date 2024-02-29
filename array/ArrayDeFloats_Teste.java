
package Atividade9;

public class ArrayDeFloats_Teste {
    public static void main(String[] args) {
        ArrayDeFloats arr1 = new ArrayDeFloats(5, 1);
        ArrayDeFloats arr2 = new ArrayDeFloats(6,2);
        ArrayDeFloats arr3 = new ArrayDeFloats(5, 1);
        
        arr1.eIgual(arr2);
        arr1.eIgual(arr3);
        arr1.soma(2);
        arr1.total();
        arr1.existe(2);
        
    }
}