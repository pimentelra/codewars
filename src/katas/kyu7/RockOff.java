package katas.kyu7;

import java.util.Arrays;

public class RockOff {
    public static String solveRockOff(final int[] alice, final int[] bob) {
        int[] c = new int[]{alice[0] - bob[0], alice[1] - bob[1], alice[2] - bob[2]};
        int a = (int) Arrays.stream(c).filter(i -> i > 0).count(), b = (int) Arrays.stream(c).filter(i -> i < 0).count(), r = a - b;
        String ans = "%d, %d: %s made \"%s\" proud!", draw = "%d, %d: that looks like a \"draw\"! Rock on!";
        return r == 0 ? String.format(draw, a, b) : r > 0 ? String.format(ans, a, b, "Alice", "Kurt") : String.format(ans, a, b, "Bob", "Jeff");
    }
}
