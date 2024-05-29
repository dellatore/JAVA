package apoio;

import java.io.IOException;

public class Excecao {

    public static int exTratada() {
        int a = 10;
        int b = 0;
        //try / catch tratam a ocorrencia de exceções
        try {
             return a = a /b;

        }catch (Exception e){
            System.out.println("lançando exceção tratada");
            System.out.println("tipo do erro :" + e.getMessage());

        }

        return 0;
    }

    public static void exNaoTratada() throws ArithmeticException{
        //lança a exceçao para frente

        int x = 10;
        int y = 0;
        x = x /y;
    }

    public static void lancamentoDeExNaoVerificada(){
        //lança uma exceção nao verificada

        int numerador = 10;
        int divisor = 0;
        if (divisor == 0){
            throw new ArithmeticException("lançando exceçao nao verificada por zero");
        }
    }

    public static void lancandoExVerificada(int n) throws IOException{
        //lança uma exceção verificada


        if (n == 0) {
            throw new IOException("lançando excecao verificada");
        }
    }

    public static void lancandoMinhaExcecao(int n) throws MinhaExcecao {

        if (n == 0) {
            throw new MinhaExcecao("lançando minha excecao");
        }
    }

    public static void main(String[] args) throws IOException,MinhaExcecao {
        //int x = Excecao.exTratada();
        //Excecao.exNaoTratada();
        //Excecao.lancandoExVerificada(0);
        //Excecao.lancamentoDeExNaoVerificada();
        try{
            Excecao.lancandoMinhaExcecao(0);
        }catch (MinhaExcecao e){
            System.out.println(e.getMsgErro());
        }
    }
}
