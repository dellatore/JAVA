
package Atividade4;

public class LivroBiblioteca extends Livro {
    
    String genero;
    
    public LivroBiblioteca(int folhas,int capitulos,String genero){
        super(folhas,capitulos,genero);
        
    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void mostrarGenero(){
        if(this.genero == "terror"){
            System.out.println("genero terror");
        }else if(this.genero == "drama"){
            System.out.println("genero drama");
        }else{
            System.out.println("genero açao");
        }
        
    }
}

