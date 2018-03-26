package katas.kyu7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FormattingDecimalPlaces1 {
    public static double twoDecimalPlaces(double number) {
        return new BigDecimal(number)
                .setScale(2, RoundingMode.DOWN)
                .doubleValue();
    }
}
