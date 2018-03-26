package katas.kyu7;

import java.util.List;

public class DescribeAList {
    public static String describeList(final List list) {
        if (list == null || list.size() == 0) return "empty";
        return list.size() == 1 ? "singleton" : "longer";
    }
}
