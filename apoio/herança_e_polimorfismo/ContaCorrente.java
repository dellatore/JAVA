package apoio.herança_e_polimorfismo;

public class ContaCorrente extends Conta {
    private double saldo = 0;
    public ContaCorrente(String nome, int numero, String agencia) {
        super(nome, numero, agencia);
    }

    // POLIMORFISMO
    @Override
    public double getSaldo() {
        return saldo;
    }


    @Override
    public void rendimento() {
        double rendimento = this.getSaldo() * 0.1;
        this.saldo = rendimento + this.getSaldo();
    }
}
