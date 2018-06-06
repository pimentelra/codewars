package katas.kyu7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FloatingpointApproximationIII {
    private static final BigDecimal SQRT_DIG = new BigDecimal(150);
    private static final BigDecimal SQRT_PRE = new BigDecimal(10).pow(SQRT_DIG.intValue());

    public static double quadratic(double a, double b, double c) {
        BigDecimal aa = new BigDecimal(a);
        BigDecimal bb = new BigDecimal(b);
        BigDecimal sqrt = sqrt(bb.pow(2).subtract(new BigDecimal(4).multiply(aa).multiply(new BigDecimal(c))));
        BigDecimal a2a = aa.multiply(BigDecimal.valueOf(2));

        double r1 = bb.negate().add(sqrt).divide(a2a, bb.scale()).doubleValue();
        double r2 = bb.negate().subtract(sqrt).divide(a2a, bb.scale()).doubleValue();
        return Math.abs(r1) < Math.abs(r2) ? r1 : r2;
    }

    public static BigDecimal sqrt(BigDecimal c) {
        return sqrt(c, new BigDecimal(1));
    }

    private static BigDecimal sqrt(BigDecimal c, BigDecimal xn) {
        BigDecimal precision = new BigDecimal(1).divide(SQRT_PRE);
        BigDecimal fx = xn.pow(2).add(c.negate());
        BigDecimal fpx = xn.multiply(new BigDecimal(2));
        BigDecimal xn1 = fx.divide(fpx, 2 * SQRT_DIG.intValue(), RoundingMode.HALF_DOWN);
        xn1 = xn.add(xn1.negate());
        BigDecimal currentSquare = xn1.pow(2);
        BigDecimal currentPrecision = currentSquare.subtract(c);
        currentPrecision = currentPrecision.abs();
        if (currentPrecision.compareTo(precision) <= -1) return xn1;
        return sqrt(c, xn1);
    }
}
