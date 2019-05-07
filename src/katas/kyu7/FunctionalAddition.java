package katas.kyu7;

import java.util.function.IntUnaryOperator;

public class FunctionalAddition {
    public static IntUnaryOperator add(int n) {
        return x -> x + n;
    }
}
