package exercicios;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        int n;
        int[] nums;
        boolean possuiNegativos = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("digite a quantidade de numeros que serão lidos: ");
        n = sc.nextInt();
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            int num;
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            nums[i] = num;
            if (num < 0){possuiNegativos = true;}
        }

        if (possuiNegativos){
            System.out.println("NUMEROS NEGATIVOS: ");
            for(int x : nums){
                if (x < 0) {
                    System.out.println(x);
                }
            }

        }else {
            System.out.println("A sequencia informada nao possui negativos");
        }
    }
}
