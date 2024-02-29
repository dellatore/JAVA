
package Atividade12;


public class LinguaegmRomana extends LinguagemClassica{
    
    private String falantes3;

    public String getFalantes3() {
        falantes3 = "24.000.000";
        return falantes3;
    }

    public void setFalantes3(String falantes3) {
        this.falantes3 = falantes3;
    }
   
    
    
    @Override
    public void mostrarIdioma(){
        super.mostrarIdioma();
        System.out.println(" do total de falantes" + getFalantes3() + "falam essa lingua");
    }
}
