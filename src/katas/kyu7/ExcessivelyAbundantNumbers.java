package katas.kyu7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExcessivelyAbundantNumbers {
    public static boolean abundantNumber(int num) {
        List<Integer> list = IntStream.range(1, num)
                .filter(i -> num % i == 0)
                .boxed()
                .collect(Collectors.toList());
        return list.stream()
                .mapToInt(Integer::intValue)
                .sum() > num;
    }
}
