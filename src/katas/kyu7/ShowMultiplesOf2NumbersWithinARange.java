package katas.kyu7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShowMultiplesOf2NumbersWithinARange {
    public static List<Integer> findMultiples(int s1, int s2, int s3) {
        return IntStream.range(1, s3)
                .filter(i -> i % s1 == 0 && i % s2 == 0)
                .boxed()
                .collect(Collectors.toList());
    }
}
