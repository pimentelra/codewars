package katas.kyu7;

public class RegexValidatePINCode {
    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }
}
