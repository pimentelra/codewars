package katas.kyu7;

public class CompareStringsBySumOfChars {
    public static Boolean compare(String s1, String s2) {
        if (s1 == null || !s1.chars().allMatch(Character::isLetter)) s1 = "";
        if (s2 == null || !s2.chars().allMatch(Character::isLetter)) s2 = "";

        int sum1 = s1.toUpperCase().chars().sum();
        int sum2 = s2.toUpperCase().chars().sum();
        return sum1 == sum2;
    }
}
