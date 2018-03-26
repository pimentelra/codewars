package katas.kyu7;

public class EmailAddressObfuscator {
    public static String obfuscate(String email) {
        return email.replaceAll("[@]", " [at] ").replaceAll("[.]", " [dot] ");
    }
}
