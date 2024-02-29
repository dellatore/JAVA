
package Atividade12;


public class TrabalhadorAssalariado extends Funcionario{
    private double salarioSemanal;
    
    public TrabalhadorAssalariado(String nome, String cargo, double salarioSemanal){
        super(nome,cargo);
        setSalarioSemanal(salarioSemanal);
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }
    
    @Override
    public String calcularPagamentoSemanal(){
        String info;
        
        info = super.calcularPagamentoSemanal() + "\nR$" + getSalarioSemanal();
        
        return info;
    }
}
