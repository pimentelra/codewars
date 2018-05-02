package katas.kyu7;

import java.util.stream.IntStream;

public class STRONGNStrongNumberSpecialNumbersSeries2 {
    public static String isStrongNumber(int num) {
        int sum = 0;
        for (int i = num; i > 0; i /= 10) sum += IntStream.rangeClosed(2, i % 10).reduce(1, Math::multiplyExact);
        return sum == num ? "STRONG!!!!" : "Not Strong !!";
    }
}
