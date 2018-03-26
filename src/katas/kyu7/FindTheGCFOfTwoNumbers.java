package katas.kyu7;

public class FindTheGCFOfTwoNumbers {
    public static int findGCF(int num1, int num2) {
        if (num1 == 0 || num2 == 0) return num1 + num2;
        return findGCF(num2, num1 % num2);
    }
}
