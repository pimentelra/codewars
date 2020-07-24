package katas.kyu7;

public class SimpleStringCharacters {
    public static int[] Solve(String word) {
        return new int[]{
                word.replaceAll("[^\\p{Upper}]", "").length(),
                word.replaceAll("[^\\p{Lower}]", "").length(),
                word.replaceAll("[^\\p{Digit}]", "").length(),
                word.replaceAll("[\\p{Alnum}]", "").length(),
        };
    }
}
