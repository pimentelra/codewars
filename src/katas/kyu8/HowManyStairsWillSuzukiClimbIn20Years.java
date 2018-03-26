package katas.kyu8;

import java.util.Arrays;

public class HowManyStairsWillSuzukiClimbIn20Years {
    public static long stairsIn20(int[][] stairs) {
        return Arrays.stream(stairs).mapToLong(stair -> Arrays.stream(stair).sum()).sum() * 20;
    }
}
