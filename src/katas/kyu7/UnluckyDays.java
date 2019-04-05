package katas.kyu7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.stream.IntStream;

public class UnluckyDays {
    public static int unluckyDays(int year) {
        return (int) IntStream.rangeClosed(1, 12).filter(m -> LocalDate.of(year, m, 13).getDayOfWeek().equals(DayOfWeek.FRIDAY)).count();
    }
}
