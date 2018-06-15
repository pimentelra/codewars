package katas.kyu6;

import java.util.stream.IntStream;

public class CircularlySortedArray {
    public boolean isCircleSorted(int[] a) {
        return (int) IntStream.range(0, a.length).filter(x -> a[x] > a[(x + 1) % a.length]).count() <= 1;
    }
}
