package apoio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesteStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,5,7,8,10);
        Stream<Integer> stream = list.stream().map(n -> n *2);
        System.out.println("stream 1 :" + Arrays.toString(stream.toArray())); //transforma a Stream em String recebendo ela como array
        //map() --> realiza a operação para cada elemento da Stream
        //stream.toArray() --> transforma a Stream em Array

        Stream<String> stream2 = Stream.of("gabriel", "dellatore","ezequiel");
        System.out.println("stream 2 :" + Arrays.toString(stream2.toArray()));
        //Stream.of() --> permite adicionar valores diretamente a Stream

        Stream<Integer> stream3 = Stream.iterate(0,p -> p + 2).limit(10);
        System.out.println("stream 3 :" + Arrays.toString(stream3.toArray()));
        //iterate() --> recebe uma seed[valor de partida] e uma função que monta a Stream
        //limit() --> limita o tamanho da Stream

        Stream<Integer> stream4 = Stream.of(1,2,3,4,5,6,7,8,9,10).filter(x -> x % 2 == 0);
        System.out.println("stream 4 :" + Arrays.toString(stream4.toArray()));
        //filter() --> filtra de acordo com o parametro passado quais valores da Stream retornar

        List<Integer> list2 =  Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> stream5 = list2.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
        System.out.println("stream 5 :" + stream5);
        System.out.println("list2 : " + list2); //Streams nao modificando o valor da lista original
        //collect(Collector.toList()) --> atribui a Stream a uma lista;

        Map<Boolean,List<Integer>> mapa =
                list2.stream()
                        .map(e -> e * 3).
                        collect(Collectors.groupingBy(p -> p % 2 == 0));
        System.out.println("Stream transformada em map : " + mapa);
        //collect(Collectors.groupingBy(Predicado)) -> agrupa em um Map de acordo com a expressao passada como Predicado



    }
}
