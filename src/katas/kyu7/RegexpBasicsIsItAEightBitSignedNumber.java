package katas.kyu7;

public class RegexpBasicsIsItAEightBitSignedNumber {
    public static boolean isSignedEightBitNumber(String s) {
        return s.matches("(12[0-7]|1[01][0-9]|[1-9]?[0-9]|-(12[0-8]|1[01][0-9]|[1-9][0-9]|[1-9]))");
    }
}
