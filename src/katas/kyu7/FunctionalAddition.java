package katas.kyu7;

import java.util.function.IntFunction;

public class FunctionalAddition {
    public static IntFunction<Integer> add(int x) {
        return y -> x + y;
    }
}
