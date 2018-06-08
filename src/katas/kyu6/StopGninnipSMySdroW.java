package katas.kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StopGninnipSMySdroW {
    public String spinWords(String sentence) {
        String[] arr = sentence.split(" ");
        IntStream.range(0, arr.length)
                .filter(i -> arr[i].length() > 4)
                .forEach(i -> arr[i] = new StringBuilder(arr[i]).reverse().toString());
        return Arrays.stream(arr).collect(Collectors.joining(" "));
    }
}
