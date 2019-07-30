package katas.kyu6;

public class SingleWordPigLatin {
    public static String translate(String str) {
        str = str.toLowerCase();
        if (str.matches("^[aeiou]+\\p{Alpha}*")) return str + "way";
        if (str.matches("^[^aeiuo\\p{Digit}]+[aeiou]+\\p{Alpha}*$")) {
            while (!str.matches("^[aeiou](?!\\p{Digit})\\p{Alpha}*")) str = str.substring(1) + str.charAt(0);
            return str + "ay";
        }
        if (str.matches("^[^aeiuo\\p{Digit}]+$")) return str + "ay";
        return null;
    }
}
