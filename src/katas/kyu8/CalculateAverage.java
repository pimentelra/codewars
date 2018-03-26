package katas.kyu8;

import java.util.Arrays;

public class CalculateAverage {
    public static double find_average(int[] array){
        return Arrays.stream(array).sum() / (double) array.length;
    }
}
