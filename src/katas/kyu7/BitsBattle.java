package katas.kyu7;

import java.util.Arrays;

public class BitsBattle {
    static String bitsBattle(int[] numbers) {
        if (numbers == null || numbers.length == 0) return "tie";
        int even = Arrays.stream(numbers).filter(i -> (i & 1) == 0).map(i -> 32 - Integer.numberOfLeadingZeros(i) - Integer.bitCount(i)).sum();
        int odd = Arrays.stream(numbers).filter(i -> (i & 1) == 1).map(Integer::bitCount).sum();

        return even == odd ? "tie" : even > odd ? "evens win" : "odds win";
    }
}
