package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome != null) {
            this.nome = nome;
        }else{
            throw new Exception("valor invalido");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws Exception {
        if (preco > 0) {
            this.preco = preco;
        }else {
            throw new Exception("valor invalido");
        }
    }

    @Override
    public String toString() {
        return "nome :" + this.getNome() + " preco: " + this.getPreco();
    }

    public Produto(double preco, String nome) throws Exception {
        setPreco(preco);
        setNome(nome);
    }


    public static void main(String[] args) throws Exception {
        int n;
        double media = 0;
        ArrayList<Produto> produtos = new ArrayList<>();
        System.out.println("digite a quantidade de produtos a serem registrados: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            sc.nextLine();
            System.out.println("digite o nome:");
            String nome = sc.nextLine();
            System.out.println("digite o valor :");
            double preco = sc.nextDouble();
            produtos.add(new Produto(preco,nome));

        }

        System.out.println(produtos);

        for (int j = 0; j < produtos.size(); j++) {
            media += produtos.get(j).getPreco();
        }
        media = media / produtos.size();
        System.out.printf("media de preços é : %f", media);
    }


}

