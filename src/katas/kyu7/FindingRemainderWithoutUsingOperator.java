package katas.kyu7;

public class FindingRemainderWithoutUsingOperator {
    public static SimpleInteger remainder(SimpleInteger dividend, SimpleInteger divisor) {
        if (divisor.compareTo(new SimpleInteger(0)) == 0) return null;
        while (dividend.subtract(divisor).compareTo(new SimpleInteger(0)) >= 0) {
            dividend = dividend.subtract(divisor);
        }
        return dividend;
    }
}
