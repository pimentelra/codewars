package katas.kyu7;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class AgeInDays {
    public static String ageInDays(int year, int month, int day) {
        return String.format("You are %d days old", DAYS.between(LocalDate.of(year, month, day), LocalDate.now()));
    }
}
