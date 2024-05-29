package apoio.herança_e_polimorfismo;

public class Gerente extends Funcionario {

    private int numeroDeFuncionarios;

    public Gerente(String nome, int idade, double salario, int numeroDeFuncionarios) {
        super(nome,idade,salario); //chama o construtor da classe mae
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }


}
