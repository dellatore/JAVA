
package Atividade4;

public class Teste {
    public static void main(String[] args) {
        
        //exe 2.18
        CadernoDeEnderecos c1 = new CadernoDeEnderecos("gabriel", 988522953, "dellatoregabriel8@gmail", "araraquara");
        
        System.out.println(c1.getNome());
        System.out.println(c1.getEmail());
        System.out.println(c1.getEndereco());
        System.out.println(c1.getTelefone());
        
        //exe 2.19
        Ponto2D p1 = new Ponto2D(2,5);
        p1.exibirCoordenadas();
        
        //exe 2.20
        Livro l = new Livro(500,12,"romance");
        System.out.println(l.getCapitulos());
        System.out.println(l.getFolhas());
        System.out.println(l.getGenero());
        
        //exe 2.21
        LivroBiblioteca l2= new LivroBiblioteca(600, 5, "terror");
        System.out.println(l2.getCapitulos());
        System.out.println(l2.getFolhas());
        System.out.println(l2.getGenero());

        //exe 2.22
        LivroLivraria l3 = new LivroLivraria(1000, 20, "drama", 40);
        System.out.println(l3.getCapitulos());
        System.out.println(l3.getFolhas());
        System.out.println(l3.getGenero());
        System.out.println(l3.getValor());
        
        //exe 2.23
        Contador c2 = new Contador(0);
        c2.incrementar(1);
        c2.imprimirValor();
        c2.zerar();
        c2.imprimirValor();
        
        //exe 2.24
        Data d1 = new Data(20,10,2023);
        Data d2 = new Data(04,02,2004);
        
        d1.mostrarData();
        d1.duplicaData(d2);
        d1.mostrarData();
        
        //exe2.25
        PoligonoRegular p2 = new PoligonoRegular(4, 6);
        p2.nomePoligono();
        
       
        
    }
 
}
