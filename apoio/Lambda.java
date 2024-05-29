package apoio;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;



class Nums implements Predicate {
    private int a;
    private int b;

    public Nums(int a,int b) {
        setA(a);
        setB(b);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double cont(){
        return a / b;
    }

    public static boolean verifica(Nums qualquer){
        if (!(qualquer.getA() != 0)) {
            return true;
        }else {
            return false;
        }
    }


    @Override
    public String toString() {
        String msg = String.valueOf(getA() + getB());
        return msg;
    }

    @Override
    public boolean test(Object o) {
        if (a != 0) {
            return true;
        }else {
            return false;
        }
    }


}


public class Lambda {
    public static void main(String[] args) {

        List<Nums> resultados = new ArrayList<>();
        resultados.add(new Nums(10,5));
        resultados.add(new Nums(20,2));
        System.out.println(resultados);

        resultados.removeIf(n -> n.cont() > 5); //expressao lambda que remove o valor n da lista caso ele seja menor que 5
        resultados.removeIf(Nums::verifica);//expressao lambda que referencia o metodo verificar
        System.out.println(resultados);

    }
}
