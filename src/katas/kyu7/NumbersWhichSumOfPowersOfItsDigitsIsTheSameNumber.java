package katas.kyu7;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class NumbersWhichSumOfPowersOfItsDigitsIsTheSameNumber {
    public static long[] eqSumPowDig(long hmax, int exp) {
        ArrayList<Long> answer = new ArrayList<>();
        for (int i = 2; i <= hmax; i++) {
            String stringNumber = String.valueOf(i);
            long powerSum = IntStream.range(0, stringNumber.length())
                    .mapToLong(j -> (long) Math.pow(Double.parseDouble(stringNumber.substring(j, j + 1)), exp))
                    .sum();
            if (powerSum == i) answer.add((long) i);
        }
        return answer.stream()
                .mapToLong(aLong -> aLong)
                .toArray();
    }
}
