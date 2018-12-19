package katas.kyu8;

import java.util.Arrays;

public class YouOnlyNeedOneBeginner {
    public static boolean check(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }
}
