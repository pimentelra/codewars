package katas.kyu7;

public class RegexpBasicsIsItASixBitUnsignedNumber {
    public static boolean sixBitNumber(String n) {
        return n.matches("\\b([0-9]|[1-5][0-9]|6[0-3])\\b");
    }
}
