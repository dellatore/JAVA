 
package Atividade13;

public class Comissionado extends Empregado {

    private double taxa; // porcentagem no formato decimal [0.0, 1.0]
    private double vendas;
    
    public Comissionado(String nome, String cpf, double taxa) {
        super(nome, cpf);
        setTaxa(taxa);
    } 
    
    public double getTaxa() {
        return taxa;
    }

    public double getVendas() {
        return vendas;
    }

    public void setTaxa(double taxa) {
        if( taxa >= 0.0 && taxa <= 1.0 ) {
            this.taxa = taxa;
        }
    }

    public void setVendas(double vendas) {
        if( vendas > 0.0 ) {
            this.vendas = vendas;
        }
    }    
    
    @Override
    public double proventosSemanal() {
        return vendas * taxa;
    }
    
    @Override
    public String getDescricao() {
        return "Empregado (Comissionado)";
    }
    
}

