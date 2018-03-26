package katas.kyu7;

public class BinaryCalculator {
    public static String calculate(final String n1, final String n2, final String o) {
        return o.equals("add") ? Integer.toBinaryString(Integer.parseInt(n1, 2) + Integer.parseInt(n2, 2)) : o.equals("subtract") ? Integer.toBinaryString(Integer.parseInt(n1, 2) - Integer.parseInt(n2, 2)) : Integer.toBinaryString(Integer.parseInt(n1, 2) * Integer.parseInt(n2, 2));
    }
}
