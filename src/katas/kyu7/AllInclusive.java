package katas.kyu7;

import java.util.ArrayList;
import java.util.List;

public class AllInclusive {
    public static Boolean containAllRots(String strng, List<String> arr) {
        if (strng.length() == 0) return true;
        List<String> rotations = new ArrayList<>();
        String temp = strng;
        for (int i = 0; i < arr.size() - 1; i++) {
            temp = temp.substring(temp.length() - 1) + temp.substring(0, temp.length() - 1);
            rotations.add(temp);
        }
        return arr.containsAll(rotations);
    }
}
