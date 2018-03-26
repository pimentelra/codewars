package katas.kyu7;

public class CreditCardMask {
    public static String maskify(String str) {
        return (str == null || str.length() <= 4) ? str : String.format("%s%s", str.substring(0, str.length() - 4).replaceAll(".", "#"), str.substring(str.length() - 4));
    }
}
