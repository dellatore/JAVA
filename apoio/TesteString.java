package apoio;

public class TesteString {
    public static void main(String[] args) {
        String a = new String("maiusculo");
        String b = new String("MINUSCULO");
        int x =a.compareTo(b);
        System.out.println(x); //retorna 0 caso sejam iguais
        System.out.println(a.toUpperCase()); //coloca a String toda em MAIUSCULO
        System.out.println(b.toLowerCase()); //coloca a String toda em minusculo
        System.out.println(a.replace("o","a")); //troca as letras 'o' por 'a'
    }
}
