package apoio.herança_e_polimorfismo;

public class ContaPoupança extends Conta { //herança
    private double saldo;

    public ContaPoupança(String nome, int numero, String agencia, int saldo) {
        super(nome, numero, agencia);
        setSaldo(saldo);
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
    @Override
    public void rendimento() {
        double rendimento = this.getSaldo() * 0.5;
        this.saldo = rendimento + this.getSaldo();
    }
}
