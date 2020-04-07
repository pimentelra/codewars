package katas.kyu8;

public class SimpleValidationOfAUsernameWithRegex {
    public static boolean validateUsr(String s) {
        return s.matches("[a-z\\d_]{4,16}");
    }
}
