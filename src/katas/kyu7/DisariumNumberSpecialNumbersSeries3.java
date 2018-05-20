package katas.kyu7;

import java.util.stream.IntStream;

public class DisariumNumberSpecialNumbersSeries3 {
    public static String disariumNumber(int number) {
        String str = number + "";
        int sum = IntStream.range(0, str.length()).map(i -> (int) Math.pow(Integer.parseInt(str.substring(i, i + 1)), i + 1)).sum();
        return number == sum ? "Disarium !!" : "Not !!";
    }
}
