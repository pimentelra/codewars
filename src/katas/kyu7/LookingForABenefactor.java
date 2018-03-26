package katas.kyu7;

import java.util.Arrays;

public class LookingForABenefactor {
    public static long newAvg(double[] arr, double navg) {
        long answer = (long) Math.ceil((navg * (arr.length + 1)) - Arrays.stream(arr).sum());
        if (answer < 0) throw new IllegalArgumentException();
        return answer;
    }
}
