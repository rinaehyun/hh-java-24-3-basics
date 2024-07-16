package tutorials.datetime;

import java.sql.SQLOutput;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {


        // ** Examples with ZonedDateTime ** //
        ZonedDateTime zoned = ZonedDateTime.now();
        ZonedDateTime zoned1 = ZonedDateTime.of(2024, 7, 16, 9, 56, 30, 12312345, ZoneId.systemDefault());

        System.out.println("--- ZonedDateTime ---");
        System.out.println(zoned);
        System.out.println(zoned1);


        // ** Examples with Instant ** //
        Instant instant = Instant.now();
        Instant instant2 = Instant.parse("2024-07-16T08:00:15.674530Z");

        System.out.println("--- Instant ---");
        System.out.println(instant);
        System.out.println(instant2.atZone(ZoneId.systemDefault()));


        // ** Examples with LocalDateTime ** //
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("--- LocalDateTime ---");
        System.out.println(localDateTime);
        System.out.println(LocalDateTime.ofInstant(instant2, ZoneId.systemDefault()));


        System.out.println(instant.plus(5, ChronoUnit.DAYS));
        System.out.println(instant.minus(5, ChronoUnit.DAYS));


        // ** DateTime Format Pattern ** //
        // yyyy-MM-dd-hh:mm:ss
        System.out.println(" -- FORMAT -- ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm:ss");

        LocalDateTime l = LocalDateTime.now();
        System.out.println(l.format(formatter));


        // ** Conversion of Unix Timestamp to DateTime ** //
        int unixInt = 1839497395;
        System.out.println(Instant.ofEpochSecond(unixInt));

    }
}
