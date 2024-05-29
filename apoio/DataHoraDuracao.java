package apoio;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataHoraDuracao {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now(); //retorna a data atual
        LocalDateTime d02 = LocalDateTime.now(); //retorna a data e hora atual

        //FORMATAÇÕES
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formato que o texto deve ser retornado[APENAS DATA]
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); //formato que o texto deve ser retornado[DATA E HORA]
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        //d -> palavra-chave para dia / M-> palavra-chave para mes / y-> palavra-chave para ano
        //HH -> palavra-chave para horas / mm -> palavra-chave para minutos

        LocalDate d04 = LocalDate.parse("2022-07-20"); //passa a data especificado no parametro para o objeto Date

        LocalDate d05 = LocalDate.parse("22/05/2024",fmt1);

        LocalDateTime d06 = LocalDateTime.parse("22/05/2024 23:49", fmt2);

        LocalDate d07 = LocalDate.of(2024,05,23); // cria APENAS data com int inves de String
        LocalDateTime d08 = LocalDateTime.of(2024,05,23,00,06); // cria um objeto passando int como parametro inves de String

        //TRANSFORMANDO OBJETO EM STRING
        //obj.format(DateTimeFormatter) -> atributo que recebe o obj e transforma em String de acordo com o formato passado
        //implementações:
        System.out.println(d08.format(fmt2));
        System.out.println(fmt2.format(d08));
        System.out.println(d08.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm\n")));

        Instant d03 = Instant.now(); //pega a Data e Hora de acordo com o padrao ISO, ou seja, retorna data e hora de Londres

        System.out.println(fmt3.format(d03));
        //cria o formato de impressao -> dd/MM/yyyy HH:mm
        //.withZone(ZoneId.systemDefault()) -> pega o valor de d03(data e hora de Londres) e modifica de acordo com o id do usuario
        //trazendo a data e hora do computador do usuario

        //TRANSFORMANDO GLOBAL EM LOCAL
        LocalDate d09 = LocalDate.ofInstant(d03,ZoneId.systemDefault());
        LocalDateTime d10 = LocalDateTime.ofInstant(d03,ZoneId.systemDefault());
        System.out.println("\n" + d09);
        System.out.println(d10);

        System.out.println("\npegando dados locais:  ");
        System.out.println("hora= " + d02.getHour());
        System.out.println("minuto= " + d02.getMinute());
        System.out.println("ano= " + d02.getYear());
        System.out.println("mes= " + d02.getMonthValue());
        System.out.println("dia = " + d02.getDayOfMonth());

        //CÁLCULOS COM DATA E HORA
        LocalDate atual = LocalDate.ofInstant(d03,ZoneId.systemDefault());
        LocalDate antigaData = atual.minusDays(7); //atrasando a data de acordo com a data atual
        LocalDate proxData = atual.plusDays(7); //avançando a data de acordo com a data atual
        System.out.println("atual: " + atual.format(fmt1));
        System.out.println("antiga data: " + antigaData.format(fmt1));
        System.out.println("proxima data: " + proxData.format(fmt1));

        Instant at = d03.minus(7, ChronoUnit.DAYS);
        Instant antg = d03.plus(7,ChronoUnit.DAYS);
        //System.out.println("antiga Instant: " + fmt2.format(at));
        //System.out.println("proxima Instant: " + fmt2.format(antg));




    }
}
