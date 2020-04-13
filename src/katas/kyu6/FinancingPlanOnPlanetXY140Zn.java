package katas.kyu6;

import java.math.BigInteger;
import java.util.stream.Stream;

public class FinancingPlanOnPlanetXY140Zn {
    public static BigInteger finance(int n) {
        return Stream.iterate(BigInteger.ZERO, i -> i.add(BigInteger.ONE)).limit(n + 1)
                .reduce(BigInteger.ZERO, (a, b) -> a.add(b.add(BigInteger.valueOf(n))
                        .multiply(b.add(BigInteger.valueOf(n + 1))).divide(BigInteger.TWO)
                        .add(BigInteger.valueOf(-1).multiply(b.multiply(BigInteger.TWO).add(BigInteger.valueOf(-1)).multiply(b)))));
    }
}
