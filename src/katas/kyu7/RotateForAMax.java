package katas.kyu7;

import java.util.Collections;
import java.util.TreeSet;

public class RotateForAMax {
    public static long maxRot(long n) {
        String string = String.valueOf(n);
        int len = string.length();
        TreeSet<Long> set = new TreeSet<>(Collections.reverseOrder());
        set.add(n);
        for (int i = 0; i < len; i++) {
            string = string.substring(0, i) + string.substring(i + 1, len) + string.substring(i, i + 1);
            set.add(Long.parseLong(string));
        }
        return set.first();
    }
}
