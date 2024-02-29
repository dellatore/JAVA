
package Atividade13;

public class Horista extends Empregado {
    
    private double valorHora;
    private double horasTrabalhadas;
    private double horasExtrasTrabalhadas;
    
    public Horista(String nome, String cpf, double valorHora) {
        super(nome, cpf);
        setValorHora(valorHora);
    }    

    public double getValorHora() {
        return valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getHorasExtrasTrabalhadas() {
        return horasExtrasTrabalhadas;
    }

    
    public void setValorHora(double valorHora) {
        if( valorHora > 0 ) {
            this.valorHora = valorHora;
        }
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        if ( horasTrabalhadas >= 0 && horasTrabalhadas <= 40 ) {
            this.horasTrabalhadas = horasTrabalhadas;
        }
    }

    public void setHorasExtrasTrabalhadas(double horasExtrasTrabalhadas) {
        if( horasExtrasTrabalhadas >= 0 && horasExtrasTrabalhadas <= 10.0 ) {
            this.horasExtrasTrabalhadas = horasExtrasTrabalhadas;
        }
    }

    @Override
    public double proventosSemanal() {
        return ( horasTrabalhadas * valorHora ) + ( horasExtrasTrabalhadas * ( valorHora * 1.50 ) );
    }

    @Override
    public String getDescricao() {
        return "Empregado (Horista)";
    }
      
}
