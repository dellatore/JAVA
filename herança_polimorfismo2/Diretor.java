
package Atividade12;

public class Diretor extends ChefeDeDepartamento{
    private int dia;
    private int mes;
    private int ano;
    
    public Diretor(String nome, String genero, String nascimento){
        super(nome,genero,nascimento);
        this.dia = 8;
        this.mes = 11;
        this.ano = 2022;
        
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }


    
    
    
    @Override
    public String getInfo(){
        String info;

        info = super.getInfo() + 
                "\ndata de promocao:" + this.getDia() + "/" + this.getMes() + "/" + this.getAno();
        
        return info;
    }
    
}
