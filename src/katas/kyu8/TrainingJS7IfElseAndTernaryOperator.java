package katas.kyu8;

public class TrainingJS7IfElseAndTernaryOperator {
    public static int saleHotdogs(final int n) {
        return (n < 10 ? n < 5 ? 100 : 95 : 90) * n;
    }
}
