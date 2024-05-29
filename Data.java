package exercicios;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Data {
    Instant d01 = Instant.now();
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy").withZone(ZoneId.systemDefault());

    public Data(){

    }

    public Instant getD01() {
        return d01;
    }

    public DateTimeFormatter getFmt() {
        return fmt;
    }

    public static void main(String[] args) {
         Data data = new Data();
        System.out.println(data.getFmt().format(data.getD01()));
    }

}
