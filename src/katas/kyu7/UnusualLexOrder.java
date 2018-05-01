package katas.kyu7;

import java.util.Arrays;

public class UnusualLexOrder {
    static String[] unusualLexOrder(String[] words) {
        return  Arrays.stream(words)
                .map(i -> new StringBuilder(i).reverse().toString())
                .sorted()
                .map(i -> new StringBuilder(i).reverse().toString())
                .toArray(String[]::new);
    }
}
