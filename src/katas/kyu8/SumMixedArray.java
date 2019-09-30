package katas.kyu8;

import java.util.List;

public class SumMixedArray {
    public int sum(List<?> mixed) {
        return mixed.stream().mapToInt( o -> Integer.valueOf(String.valueOf(o))).sum();
    }
}
