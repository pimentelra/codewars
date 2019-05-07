package katas.kyu6;

import java.util.ArrayList;
import java.util.List;

public class RectangleIntoSquares {
    public static List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth) return null;
        List<Integer> list = new ArrayList<>();
        int[] values = new int[]{Math.min(lng, wdth), Math.max(lng, wdth)};
        while (values[0] != 0) {
            list.add(values[0]);
            values[1] -= values[0];
            values = new int[]{Math.min(values[0], values[1]), Math.max(values[0], values[1])};
        }
        return list;
    }
}
