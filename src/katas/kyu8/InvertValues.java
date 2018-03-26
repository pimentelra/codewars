package katas.kyu8;

public class InvertValues {
    public static int[] invert(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] * (-1);
        }
        return newArray;
    }
}
