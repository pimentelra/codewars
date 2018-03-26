package katas.kyu7;

import java.util.stream.IntStream;

public class CWars {
    public static String initials(String name) {
        String[] array = name.split(" ");
        StringBuilder answer = new StringBuilder();
        IntStream.range(0, array.length - 1).forEach(i -> answer.append(array[i].substring(0, 1).toUpperCase()).append("."));
        return answer.append(array[array.length - 1].substring(0, 1).toUpperCase()).append(array[array.length - 1].substring(1).toLowerCase()).toString();
    }
}
