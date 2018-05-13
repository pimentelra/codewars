package katas.kyu8;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReversedWords {
    public static String reverseWords(String str){
        String[] split = str.split(" ");
        Collections.reverse(Arrays.asList(split));
        return Arrays.stream(split).collect(Collectors.joining(" "));
    }
}
