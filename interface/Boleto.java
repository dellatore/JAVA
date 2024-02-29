
package Atividade13;

public class Boleto implements Pagar {
    
    private String beneficiario;
    private Data vencimento;
    private double valor;
    private double juros; // porcentagem em decimal [0.0, 1.0]

    public Boleto(String beneficiario, int vencimentoDia, int vencimentoMes, int vencimentoAno, double valor, double juros) {
        setBeneficiario(beneficiario);
        
//        setVencimento( new Data(vencimentoDia, vencimentoMes, vencimentoAno) );
        
        vencimento = new Data(vencimentoDia, vencimentoMes, vencimentoAno);
        
        setValor(valor);
        setJuros(juros);
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public Data getVencimento() {
        return vencimento;
    }

    public double getValor() {
        return valor;
    }

    public double getJuros() {
        return juros;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public void setVencimento(Data vencimento) {
        this.vencimento = vencimento;
    }

    public void setValor(double valor) {
        if( valor >= 0 ) {
            this.valor = valor;
        }
    }

    public void setJuros(double juros) {
        if( juros >= 0.0 && juros <= 1.0 ) {
            this.juros = juros;
        }
    }        
    // implemenbtação/realização do método definidino na Interface Pagar
    @Override
    public double getValorAPagar() {
        return getValor();
    }
    
    @Override
    public String getDescricao() {
        return "Boleto (" + beneficiario + ")";
    }
    
}
