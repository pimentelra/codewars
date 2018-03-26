package katas.kyu8;

import java.util.Arrays;

public class GrasshopperArrayMean {
    public static int findAverage(int[] nums) {
        return Arrays.stream(nums).sum() / nums.length;
    }
}
