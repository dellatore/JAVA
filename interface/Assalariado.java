
package Atividade13;

    public class Assalariado extends Empregado {
    
    private double salario;
    
    public Assalariado(String nome, String cpf, double salario) {
        super(nome, cpf);
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
        return salario / 4.0;
    }
    
    @Override
    public String getDescricao() {
        return "Empregado (Assalariado)";
    }
    
}


