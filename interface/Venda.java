
package Atividade13;


public abstract class Venda implements Receber {
    private double valor;
    private int quantidade;
    
    public Venda(double valor, int quantidadeDeVendas){
        setValor(valor);
        setQuantidade(quantidadeDeVendas);
       
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor > 0){
            this.valor = valor;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade > 0){
            this.quantidade = quantidade;
        }
    }
    
    
           
    @Override
    public abstract double valorAReceber(); // incompleto
       
    

    
    
}
