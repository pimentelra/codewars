package katas.kyu7;

public class RegexpBasicsIsItAHexadecimalNumber {
    public static boolean isHexNumber(String s) {
        return s.toLowerCase().matches("(?:0x){0,1}(?:[0-9a-f])+");
    }
}
