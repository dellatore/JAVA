
package Atividade13;


public class PrestacaoServico implements Receber{
    private String nomeServicoPrestado;
    private double valorServico;
    
    public PrestacaoServico(String nomeServicoPrestado, double valorServico){
        setNomeServicoPrestado(nomeServicoPrestado);
        setValorServico(valorServico);
    }

    public String getNomeServicoPrestado() {
        return nomeServicoPrestado;
    }

    public void setNomeServicoPrestado(String nomeServicoPrestado) {
        this.nomeServicoPrestado = nomeServicoPrestado;
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }
    
    @Override 
    public double valorAReceber(){
        return getValorServico();
    }
    
    @Override
    public String descricao(){
        return "nome do serviço: " + getNomeServicoPrestado();
    }
}
