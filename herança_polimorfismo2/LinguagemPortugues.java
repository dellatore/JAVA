
package Atividade12;


public class LinguagemPortugues extends LinguagemNatural{
    
    private String falantes2;

    public String getFalantes2(){
        falantes2 = "260.000.000";
        return falantes2;
    }

    public void setFalantes(String falantes) {
        this.falantes2 = falantes;
    }
    
    
    @Override
    public void mostrarIdioma(){
        super.mostrarIdioma();
        System.out.println(" do total de falantes" + getFalantes2() + "falam portugues");
        
    }
    
    
}
