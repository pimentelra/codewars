package katas.kyu6;

import java.util.Arrays;

public class FindTheParityOutlier {
    public static int find(int[] integers) {
        return Arrays.stream(integers).filter(i -> Math.abs(i) % 2 == 0).count() == 1 ?
                Arrays.stream(integers).filter(i -> Math.abs(i) % 2 == 0).toArray()[0] : Arrays.stream(integers).filter(i -> Math.abs(i) % 2 == 1).toArray()[0];
    }
}
