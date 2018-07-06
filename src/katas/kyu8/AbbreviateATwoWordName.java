package katas.kyu8;

public class AbbreviateATwoWordName {
    public static String abbrevName(String name) {
        return name.replaceAll("\\b(\\p{Alpha})\\p{Alpha}*\\s?\\b", "$1.").replaceAll(".$", "").toUpperCase();
    }
}
