package practices;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeInJava {

    public static void main(String[] args) {
        // CONVERSION
        ZoneId zoneId = ZoneId.systemDefault();

        Instant instantNow = Instant.now();
        LocalDateTime localDateTimeNow = LocalDateTime.now();

        LocalDateTime localDateTime=instantNow.atZone(zoneId).toLocalDateTime();
        Instant instant = localDateTimeNow.atZone(zoneId).toInstant();

        System.out.println(localDateTime);
        System.out.println(instant);


        // PARSING & FORMATTING DATES
        String dateString = "08.11.2024";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yyyy");
        LocalDate parsedDate = LocalDate.parse(dateString, formatter);
        System.out.println(parsedDate);


        // CALCULATING TIME DIFFERENCES
        LocalDateTime startTime = LocalDateTime.of(2024,8,11, 15,0);
        LocalDateTime endTime = LocalDateTime.of(2024, 12, 20, 15, 30);
        long daysBetween = ChronoUnit.DAYS.between(startTime, endTime);
        System.out.println(daysBetween);
    }
}
