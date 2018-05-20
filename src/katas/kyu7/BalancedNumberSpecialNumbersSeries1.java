package katas.kyu7;

public class BalancedNumberSpecialNumbersSeries1 {
    public static String balancedNum(long number) {
        int len = String.valueOf(number).length();
        long left = number / (int) Math.pow(10, len % 2 == 0 ? len - (len / 2) + 1 : len - (len / 2));
        long right = number % (int) Math.pow(10, len - (len / 2) - 1);
        return (String.valueOf(left).chars().map(digit -> digit % 48).sum() !=
                String.valueOf(right).chars().map(digit -> digit % 48).sum() ? "Not " : "") + "Balanced";
    }
}
