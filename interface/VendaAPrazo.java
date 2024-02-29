
package Atividade13;


public class VendaAPrazo extends Venda {
    private int parcelas;
    
    public VendaAPrazo(double valor, int quantidade, int parcelas){
        super(valor,quantidade);
        setParcelas(parcelas);
    }

    public int getParcelas() {
        return parcelas;
    }

    private void setParcelas(int parcelas) {
        if(parcelas > 0){
            this.parcelas = parcelas;
        }
    }
    
    @Override  
    public double valorAReceber(){
        double valor;
        valor = super.getValor() / getParcelas();
        valor = valor * getQuantidade();
        return valor;
    }
            
    @Override
    public String descricao(){
        return "quantidade: " + getQuantidade();
    }
    
}
