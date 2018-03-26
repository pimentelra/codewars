package katas.kyu7;

public class IsValidIdentifier {
    public static boolean isValid(String idn) {
        return idn.matches("^[a-z_$][a-zA-Z0-9_$]*");
    }
}
