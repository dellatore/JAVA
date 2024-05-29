package apoio.herança_e_polimorfismo;

public class Conta {
    private String nome;
    private int numero;
    private String agencia;
    private double saldo =0;


    public Conta(String nome){
        setNome(nome);
    }

    public Conta(String nome, int numero){
        this(nome);
        setNumero(numero);
    }

    public Conta(String nome, int numero, String agencia) {
        this(nome,numero);
        setAgencia(agencia);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void sacar(double valor){
        if (valor > getSaldo()) {
            throw new ArithmeticException("o valor de saque excede o valor do saldo");
        } else if (valor < 0) {
            throw new ArithmeticException("valor negativo");
        } else {
            this.saldo -= valor;
            System.out.println("saque realizado com sucesso");
        }
    }

    public void compara(Conta conta){
        if (conta == this) {
            System.out.println("iguais");
        }else{
            System.out.println("diferentes");
        }
    }

    public void rendimento() {
        double rendimento =  getSaldo() * 0.2;
        this.saldo = this.getSaldo() + rendimento;


    }

    public void depositar(double valor){
        if (valor < 0) {
            throw new ArithmeticException("valor negativo invalido");
        }else {
            this.saldo += valor ;
            System.out.println("deposito realizado");
        }
    }

    @Override
    public String toString() {
        String msg;
        msg =  "titular: " + getNome() + "saldo da conta igual: " + getSaldo();
        return msg;
    }
}
