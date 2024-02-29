
package Atividade12;

public class LinguagemClassica{
    
    private String falantes;

    public String getFalantes() {
         this.falantes = "85.000.000";
         return this.falantes;
    }

    public void setFalantes(String falantes) {
        this.falantes = falantes;
    }
    
    
    
    public void mostrarIdioma(){
        System.out.println("o idioma pertence a linguagem classica, cujo total de falantes"
                + " correspondem a " + getFalantes());
    }
    
    
}
