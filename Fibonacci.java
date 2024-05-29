package exercicios;

public class Fibonacci {

    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        System.out.println(i + "\n" + j);
        while(i + j <= 100){
            int prox;
            prox = i + j;
            System.out.println(prox);
            i = j;
            j = prox;

        }

    }
}
