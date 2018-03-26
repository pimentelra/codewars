package katas.kyu7;

import java.util.stream.IntStream;

public class ZebulansNightmare {
    public static String zebulansNightmare(final String functionName) {
        String[] strings = functionName.replaceAll("_", " ").split(" ");
        if (strings.length > 0) {
            IntStream.range(1, strings.length).forEach(i -> strings[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1));
        }
        return String.join("", strings);
    }
}
