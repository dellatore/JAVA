
package Atividade13;

public class VendaAVista extends Venda{
    public VendaAVista(double valor,int quantidade){
        super(valor,quantidade);
    }
    
    @Override  
    public double valorAReceber(){
        double desconto,valor;
        desconto = super.getValor() / 10.0;
        valor =  super.getValor() - desconto;
        valor= valor * getQuantidade();
        return valor;
    }
    
    @Override
    public String descricao(){
        return "quantidade: " + getQuantidade();
    }
}
