package apoio.herança_e_polimorfismo;

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta("gabriel" , 02,"BB");
        ContaPoupança cp = new ContaPoupança("gabriel", 03, "Bradesco", 1000);

        //UPCASTING
        c = cp; //a classe mae recebe a classe filha
        System.out.println(c);

        //DOWNCASTING
        //cp = c; nao compila, pois a clsse mae so pode ser atribuida a suas filhas com casting
        cp = (ContaPoupança) c;
        System.out.println(cp);


    }
}
