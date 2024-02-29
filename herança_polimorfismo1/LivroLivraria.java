
package Atividade4;

public class LivroLivraria extends Livro{
    
    private int valor;
    public LivroLivraria(int folhas,int capitulos,String genero,int valor){
        super(folhas,capitulos,genero);
        setValor(valor);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    
    public void mostraPreco(){
        System.out.println("preço:" + getValor());
    }
    
    
}