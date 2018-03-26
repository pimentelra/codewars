package katas.kyu7;

public class RemoveDuplicates {
    public static int[] unique(int[] integers) {
        return java.util.Arrays.stream(integers).distinct().toArray();
    }
}
