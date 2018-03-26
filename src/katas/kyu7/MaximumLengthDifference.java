package katas.kyu7;

public class MaximumLengthDifference {
    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) return -1;

        int a1Max = a1[0].length();
        for (String anA1 : a1) {
            if (anA1.length() > a1Max)
                a1Max = anA1.length();
        }
        int a1Min = a1[0].length();
        for (String anA1 : a1) {
            if (anA1.length() < a1Min)
                a1Min = anA1.length();
        }
        int a2Max = a2[0].length();
        for (String anA2 : a2) {
            if (anA2.length() > a2Max)
                a2Max = anA2.length();
        }
        int a2Min = a2[0].length();
        for (String anA2 : a2) {
            if (anA2.length() < a2Min)
                a2Min = anA2.length();
        }
        return Math.max(a1Max - a2Min, a2Max - a1Min);
    }
}
