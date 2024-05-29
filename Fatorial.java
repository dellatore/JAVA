package exercicios;

public class Fatorial {
    public static void main(String[] args) {
        int resul = 0;
        int anterior = 1;
        System.out.println("o fatorial de 0 é 1");
        for (int i = 1; i <= 10; i++) {
            resul = anterior * i;
            anterior = resul;
            System.out.printf("o fatorial de %d é %d\n", i,resul);
        }
    }

}
