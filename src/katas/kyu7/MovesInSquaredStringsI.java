package katas.kyu7;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MovesInSquaredStringsI {
    public static String vertMirror(String strng) {
        String[] array = strng.split("\\n");
        Arrays.setAll(array, i -> new StringBuilder(array[i]).reverse().toString());
        return Arrays.stream(array).collect(Collectors.joining("\n"));
    }

    public static String horMirror(String strng) {
        String[] array = strng.split("\\n");
        for (int i = 0; i < array.length / 2; i++) {
            String temp;
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return Arrays.stream(array).collect(Collectors.joining("\n"));
    }

    public static String oper(Function<String, String> operator, String s) {
        return operator.apply(s);
    }
}
