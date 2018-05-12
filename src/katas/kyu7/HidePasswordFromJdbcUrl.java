package katas.kyu7;

public class HidePasswordFromJdbcUrl {
    public static String hidePasswordFromConnection(String urlString) {
        return urlString.replaceAll("(?<=password=[^&]{0,99})[^&]", "*");
    }
}
