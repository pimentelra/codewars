package katas.kyu7;

import java.util.Arrays;

public class ArrayElementParity {
    public static int solve(int [] arr){
        return Arrays.stream(arr).distinct().sum();
    }
}
