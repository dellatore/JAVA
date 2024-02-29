
package Atividade12;


public class LinguagemNatural {
    private double falantes;

    public double getFalantes() {
         this.falantes = 2.000000000;
         return this.falantes;
    }

    public void setFalantes(double falantes) {
        this.falantes = falantes;
    }
    
    
    
    public void mostrarIdioma(){
        System.out.println("o idioma pertence a linguagem natural, cujo total de falantes"
                + " correspondem a cerca de " + getFalantes());
    }
}
