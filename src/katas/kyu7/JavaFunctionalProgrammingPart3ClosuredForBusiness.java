package katas.kyu7;

import java.util.function.IntUnaryOperator;

public class JavaFunctionalProgrammingPart3ClosuredForBusiness {
    public static IntUnaryOperator create(int addTo) {
        return i -> i + addTo;
    }
}
