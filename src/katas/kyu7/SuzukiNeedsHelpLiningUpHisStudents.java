package katas.kyu7;

import java.util.Arrays;

public class SuzukiNeedsHelpLiningUpHisStudents {
    public static String[] lineupStudents(String students) {
        String[] res = students.split(" ");

        Arrays.sort(res, (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return -1;
            }
            if (s1.length() < s2.length()) {
                return 1;
            }
            return Integer.compare(s2.compareTo(s1), 0);
        });

        return res;
    }
}
