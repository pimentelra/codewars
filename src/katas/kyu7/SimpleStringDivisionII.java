package katas.kyu7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SimpleStringDivisionII {
    public static int solve(String s, int k) {
        String[] arr = s.split(" ");
        List<Integer> numbers = new ArrayList<>();
        IntStream.range(0, arr.length)
                .forEach(i -> IntStream.range(0, arr.length)
                        .filter(j -> i != j)
                        .mapToObj(j -> Integer.valueOf(arr[i] + arr[j]))
                        .forEach(numbers::add)
                );
        return (int) numbers.stream().filter(i -> i % k == 0).count();
    }
}
