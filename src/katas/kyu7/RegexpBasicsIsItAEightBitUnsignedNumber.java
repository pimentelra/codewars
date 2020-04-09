package katas.kyu7;

public class RegexpBasicsIsItAEightBitUnsignedNumber {
    public static boolean eightBitNumber(String n) {
        return n.matches("(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)");
    }
}
