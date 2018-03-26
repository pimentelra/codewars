package katas.kyu7;

public class VowelCount {
    public static int getCount(String str) {
        return (int) str.toLowerCase().chars().mapToObj(i -> (char) i).filter(j -> "aeiou".contains(String.valueOf(j))).count();
    }
}
