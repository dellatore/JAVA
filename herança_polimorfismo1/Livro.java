
package Atividade4;

public class Livro {
    private int folhas;
    private int capitulos;
    private String genero;

    public Livro(int folhas, int capitulos, String genero) {
        setFolhas(folhas);
        setCapitulos(capitulos);
        setGenero(genero);
    }

    public int getFolhas() {
        return folhas;
    }

    public void setFolhas(int folhas) {
        this.folhas = folhas;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
}
