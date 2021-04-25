package katas.kyu7;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.stream.IntStream;

public class ExtendedWeekends {

  public static String[] solve(int a, int b) {
    LocalDate[] dates = IntStream.rangeClosed(a, b)
        .mapToObj(y -> IntStream.of(1, 3, 5, 7, 8, 10, 12).mapToObj(m -> LocalDate.of(y, m, 1))
            .filter(d -> d.getDayOfWeek().equals(DayOfWeek.FRIDAY)))
        .flatMap(c -> c)
        .toArray(LocalDate[]::new);

    return new String[]{
        dates[0].getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase(),
        dates[dates.length - 1].getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase(),
        String.valueOf(dates.length)
    };
  }
}
