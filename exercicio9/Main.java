
package exercicio9;

import java.util.LinkedList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        //EXE 1
        Array arr = new Array();
        LinkedList<String> arr2 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        String str4 = sc.nextLine();
        String str5 = sc.nextLine();
        
        arr.add(str1);
        arr.add(str2);
        arr.add(str3);
        arr.add(str4);
        arr.add(str5);
        
        
        arr2.add("gabriel");
        arr2.add("vinicius");
        arr2.add("pedro");
        arr2.add("kauan");
        arr2.add("joao");
        System.out.println("Array digitado pelo usuario: " + arr.arr1);
        System.out.println( "Array de comparacao: " + arr2);
        
        arr.comparaArray(arr2);
        
        System.out.println("--------------------------------------------------------------");
        
        //EXE 2
        int index;
        System.out.println("digite a string a ser procuarada: ");
        String str = sc.nextLine();
        index = arr.ocorrenciaElemento(str);
        if (index == -1) {
            System.out.println("o elemento nao pertence ao Array");
        }else{
            System.out.println("o elemento se encontra na posicao [" + index + "]");
        }
        
    }
}
