
package Atividade12;


public class TrabalhadorHorista extends Funcionario{
    private double salarioPorHora;
    private int horasTrabalhadas;
    
    public TrabalhadorHorista(String nome, String cargo){
        super(nome,cargo);
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public double calc(){
        double cont;
        cont = getHorasTrabalhadas() * getSalarioPorHora();
        return cont;
    }
    
    @Override
    public String calcularPagamentoSemanal(){
        String info;
        
        info = super.calcularPagamentoSemanal() + "\nR$" + calc();
        
        return info;
    }
    
    
}
