package katas.kyu7;

public class InfinitelyNestedRadicalExpressions {
    public static double evaluateFunction(int x) {
        return (1 + Math.sqrt(1 + 4 * (double) x)) / 2.;
    }
}
