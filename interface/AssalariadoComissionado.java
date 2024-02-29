
package Atividade13;

public class AssalariadoComissionado extends Comissionado {
    
    private double salario;
    
    public AssalariadoComissionado(String nome, String cpf, double salario, double taxa) {
        super(nome, cpf, taxa);
        setSalario(salario);
    } 
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if( salario > 0 ) {
            this.salario = salario;
        }
    }
    
    @Override
    public double proventosSemanal() {
        return super.proventosSemanal() 
                + ( salario / 4.0 );
    }
    
    @Override
    public String getDescricao() {
        return "Empregado (AssalariadoComissionado)";
    }
    
}


