package katas.kyu8;

public class FormattingDecimalPlaces0 {
    public static double TwoDecimalPlaces(double number) {
        return Math.round(number * 100) / 100.;
    }
}
