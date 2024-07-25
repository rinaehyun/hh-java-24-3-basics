package grouptasks.datetime.bonus;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static java.time.temporal.TemporalAdjusters.lastDayOfYear;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime zoned = ZonedDateTime.now();
        ZonedDateTime birthDay = zoned.minusYears(32)
                .plusMonths(6)
                .minusDays(3);
        Animal animalA = new Animal(birthDay, "JoJo");
        System.out.println(animalA.getBirthday());

        // Calculate days left for the next birthday with ZonedDateTime
        calculateDaysToNextBDayWithZonedDateTime(zoned, animalA);

        // Calculate days left for the next birthday with toLocalDate()
        calculateDaysToNextBDayWithToLocalDate(zoned, animalA);
    }

    public static void calculateDaysToNextBDayWithZonedDateTime(ZonedDateTime zoned, Animal animal) {
        long diffCurrentAndLastDays = zoned.until(zoned.with(lastDayOfYear()), ChronoUnit.DAYS);
        long diffBirthAndLastDays = animal.getBirthday().until(animal.getBirthday().with(lastDayOfYear()), ChronoUnit.DAYS);
        long diff = diffCurrentAndLastDays - diffBirthAndLastDays;

        if (diffCurrentAndLastDays >= diffBirthAndLastDays) {
            System.out.println("The next birthday is after " + diff + " days.");
        } else {
            System.out.println("The next birthday is after " + (365 + diff) + " days.");
        }
    }


    public static void calculateDaysToNextBDayWithToLocalDate(ZonedDateTime zoned, Animal animal) {
        LocalDate currentDay = zoned.toLocalDate();
        LocalDate birthDayOfA = animal.getBirthday().toLocalDate();

        long diffUntilLastDay = ChronoUnit.DAYS.between(currentDay, currentDay.with(TemporalAdjusters.lastDayOfYear()));
        long diffUntilLastDayFromBDay = ChronoUnit.DAYS.between(birthDayOfA, birthDayOfA.with(TemporalAdjusters.lastDayOfYear()));

        long diff = diffUntilLastDay - diffUntilLastDayFromBDay;

        if (diffUntilLastDay >= diffUntilLastDayFromBDay) {
            System.out.println("The next birthday is after " + diff + " days.");
        } else {
            System.out.println("The next birthday is after " + (365 + diff) + " days.");
        }
    }

}
