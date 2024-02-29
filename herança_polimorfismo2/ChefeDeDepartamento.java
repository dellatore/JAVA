
package Atividade12;


public class ChefeDeDepartamento {
    private String nome;
    private String genero;
    private boolean admissao;
    private String nascimento;
    
    public ChefeDeDepartamento(String nome, String genero, String nascimento){
        setNome(nome);
        setGenero(genero);
        setNascimento(nascimento);
        this.admissao = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean getAdmissao() {
        return admissao;
    }

    private void setAdmissao(boolean admissao) {
        this.admissao = true;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nasimento) {
        this.nascimento = nasimento;
    }
    
    public void demissao(){
        this.admissao = false;
    }
    
    public String getInfo(){
        String info;
        
        info = "nome:" + getNome() + "\n genero:" + getGenero() +
                "\n admissao: " + getAdmissao() + "\n nascimento:" + getNascimento();
        return info;
    }
    
           
}
