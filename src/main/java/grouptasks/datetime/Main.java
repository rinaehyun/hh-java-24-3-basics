package grouptasks.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Main {
    public static void main(String[] args) {

        ZonedDateTime zoned = ZonedDateTime.now();
        Instant instant = Instant.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        // Print current date and time
        System.out.println(zoned);
        System.out.println(instant);
        System.out.println(localDateTime);

        // Print current date and time after 2 weeks
        ZonedDateTime zonedSpc = zoned.plusWeeks(2);
        Instant instantSpc = instant.plus(2, ChronoUnit.DAYS);
        LocalDateTime localDateTimeSpc = localDateTime.plusWeeks(2);

        System.out.println(zonedSpc);
        System.out.println(instantSpc);
        System.out.println(localDateTimeSpc);

        // Compare two date-times
        System.out.println(zoned.isAfter(zonedSpc));
        System.out.println(instant.isAfter(instantSpc));
        System.out.println(localDateTime.isAfter(localDateTimeSpc));

        System.out.println(zoned.isBefore(zonedSpc));
        System.out.println(instant.isBefore(instantSpc));
        System.out.println(localDateTime.isBefore(localDateTimeSpc));

        // Calculate the difference between 2 random date
        ZonedDateTime zonedRd1 = zoned.plusYears(1)
                .minusMonths(3)
                .plusDays(45);

        ZonedDateTime zonedRd2 = zoned.minusYears(1)
                .plusMonths(4)
                .minusDays(75);

        System.out.println("The difference is between " + formatDateTime(zonedRd1) + " and " + formatDateTime(zonedRd2) + " is: "
                + calculateDateTimeDifference(zonedRd1, zonedRd2, ChronoUnit.DAYS) + " days.");

    }

    public static long calculateDateTimeDifference(ZonedDateTime d1, ZonedDateTime d2, ChronoUnit unit) {
            if (d1.isAfter(d2)) {
                return unit.between(d2, d1);
            }
            return unit.between(d2, d1);
    }

    public static String formatDateTime(ZonedDateTime d1) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        return d1.format(formatter);
    }
}
