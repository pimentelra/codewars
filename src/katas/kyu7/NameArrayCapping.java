package katas.kyu7;

public class NameArrayCapping {
    public static String[] capMe(String[] strings) {
        java.util.stream.IntStream.range(0, strings.length).forEach(i -> strings[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1).toLowerCase());
        return strings;
    }
}
