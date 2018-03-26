package katas.kyu7;

public class Sticks21 {
    public static int makeMove(int sticks) {
        return sticks % 4 == 0 ? 1 : sticks % 4;
    }
}
