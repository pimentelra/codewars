package katas.kyu7;

import java.util.Arrays;

public class ParallelResistors {
    public static double resistance(double... numbers) {
        return 1 / Arrays.stream(numbers).map(number1 -> 1 / number1).sum();
    }
}
