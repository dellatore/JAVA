
package Atividade13;

public abstract class Empregado extends Object implements Pagar {

    private String nome;
    private String cpf;

    public Empregado(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }        
    
    public abstract double proventosSemanal(); // incompleto
        
    @Override
    public boolean equals(Object obj) {
        
        if( obj instanceof Empregado ) {           
            Empregado aux;
            aux = (Empregado) obj;
            
            if( cpf.equals( aux.getCpf() ) ) {
                return true;
            }            
        }        
        return false;
    }
    
    @Override
    public double getValorAPagar() {
        return proventosSemanal();
    }
    
}

