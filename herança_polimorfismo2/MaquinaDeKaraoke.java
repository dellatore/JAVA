
package Atividade12;

import java.util.ArrayList;
import java.util.Scanner;

public class MaquinaDeKaraoke {
    private ArrayList<String> musicas = new ArrayList<>();
    private int res;
    
    public MaquinaDeKaraoke() throws InterruptedException{
        System.out.println("karaoke!!");
        Thread.sleep(1500);
        System.out.println("add musicas");
        Thread.sleep(1500);
        menuKaraoke();
    }
            
    public void adicionarMusica() throws InterruptedException{
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("add uma musica a lista!!");
        
        System.out.println("nome da musica:");
        String musica = leitor.nextLine();
        
        musicas.add(musica);
        Thread.sleep(1500);
        System.out.println("a musica foi adicionada com sucsso");
        menuKaraoke();
    }
    
    public void listaDeMusicas() throws InterruptedException{
        Thread.sleep(1500);
        System.out.println("lista de musicas do karaoke:");
        for(int i = 0; i < musicas.size(); i++){
            System.out.printf("t%d. %s\n", i+1,musicas.get(i));
        }
        System.out.println("fim");
        
        menuKaraoke();
    }
           
    public void reproduzir() throws InterruptedException{
        Thread.sleep(1500);
        for(int j = 0; j < musicas.size(); j++){
        System.out.println("tocando no momento::");
        System.out.printf("%d. %s...\n", j+1, musicas.get(j));
            System.out.println("carregando proxima...");
            musicas.set(j,null);
        }   
        
        menuKaraoke();
    }
    
    public void menuKaraoke() throws InterruptedException{
        Scanner resposta = new Scanner(System.in);
        res = 1;
        while(res != 0){
            System.out.println("MENU");
            System.out.println("1.ver lista de musicas!");
            System.out.println("2.reproduzir musicas");
            System.out.println("3.add musica");
            System.out.println("0.encerrar o karaoke");
            res = resposta.nextInt();
            
            switch(res){
                case 1:
                    listaDeMusicas();
                case 2:
                    reproduzir();
                case 3:
                    adicionarMusica();
                case 0:
                    break;
                default:
                    System.out.println("opcao invalida");
                    menuKaraoke();
            }
        }
    }
            
            
}
