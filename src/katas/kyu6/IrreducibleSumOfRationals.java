package katas.kyu6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IrreducibleSumOfRationals {
    public static String sumFracts(int[][] l) {
        if (l.length == 0) return null;
        if (l.length == 1) return Arrays.toString(new int[]{l[0][0] / gcd(l[0][0], l[0][1]), l[0][1] / gcd(l[0][0], l[0][1])});
        int[][] arr = Arrays.stream(l).map(a -> new int[]{a[0] / gcd(a[0], a[1]), a[1] / gcd(a[0], a[1])}).toArray(int[][]::new);

        int[] sol = arr[0];
        IntStream.range(1, arr.length).forEach(i -> {
            sol[0] = sol[0] * arr[i][1] + arr[i][0] * sol[1];
            sol[1] = sol[1] * arr[i][1];
        });

        int[] ans = new int[]{sol[0] / gcd(sol[0], sol[1]), sol[1] / gcd(sol[0], sol[1])};
        return ans[1] == 1 ? "" + ans[0] : Arrays.toString(ans);
    }

    private static int gcd(int a, int b) {
        return a % b == 0 ? b : gcd(b, a % b);
    }
}
