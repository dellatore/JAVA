package apoio.herança_e_polimorfismo;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(String nome){
        setNome(nome);
    }

    public Funcionario(String nome, int idade){
        this(nome);
        setIdade(idade);
    }

    public Funcionario(String nome, int idade, double salario){
        this(nome,idade);
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void comparaSalario(Funcionario func){
        if (getSalario() > func.getSalario()) {
            System.out.println(getNome() + " ganha melhor");
        } else if (getSalario() < func.getSalario()) {
            System.out.println(func.getNome() + " ganha melhor");
        }else {
            System.out.println("ambos recebem igual");
        }
    }

    @Override
    public String toString(){
        return "meu nome é " + getNome() + " tenho " + getIdade() + " anos de idade e recebo " + getSalario();
    }
}
