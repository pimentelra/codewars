package katas.kyu7;

public class AutomorphicNumberSpecialNumbersSeries6 {
    public static String autoMorphic(int number) {
        return Math.pow(number, 2) % Math.pow(10, String.valueOf(number).length()) == number ? "Automorphic" : "Not!!";
    }
}
