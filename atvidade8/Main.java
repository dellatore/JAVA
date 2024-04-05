package atvidade8;


import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        ListaDePalavras lista = new ListaDePalavras();
        ListaDeNumeros lista2 = new ListaDeNumeros();
      
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        String str4 = sc.nextLine();
        String str5 = sc.nextLine();
        
        lista.add(str1);
        lista.add(str2);
        lista.add(str3);
        lista.add(str4);
        lista.add(str5);
        
        Long reps;
        reps = lista.conta("gabriel");
        System.out.println( "total de vezes que a palavra 'gabriel' se repetiu: "+ reps);
        
        System.out.println("lista sem os itens removidos: "+ lista2.lista);
        System.out.println("lista com os itens removidos: "+ lista2.remover());
    }
    
    
    
    
 
    
}
