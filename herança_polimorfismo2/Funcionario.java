
package Atividade12;


public class Funcionario {
    private String nome;
    private String cargo;
    
    public Funcionario(String nome, String cargo){
        setCargo(cargo);
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String calcularPagamentoSemanal(){
        String info;
        
        info = "nome do funcionario:"+ getNome() + 
                "\ncargo:" + getCargo();
        
        return info;
    }
    
}
