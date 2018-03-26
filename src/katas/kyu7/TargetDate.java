package katas.kyu7;

import java.time.LocalDate;

public class TargetDate {
    public static String dateNbDays(double a0, double a, double p) {
        LocalDate first = LocalDate.of(2016, 1, 1);
        long diff = 0;

        while (a0 < a) {
            a0 += a0 * p / 36000d;
            diff++;
        }

        LocalDate last = first.plusDays(diff);
        return last.toString();
    }
}
