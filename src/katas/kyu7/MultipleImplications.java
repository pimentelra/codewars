package katas.kyu7;

public class MultipleImplications {
    public static Boolean multImplication(boolean[] lst) {
        if (lst.length == 0) return false;
        boolean answer = true;
        for (boolean boo : lst) answer = !answer || boo;
        return answer;
    }
}
