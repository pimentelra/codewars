package katas.kyu8;

public class ToSquareRootOrNotToSquareRoot {
    public static int[] squareOrSquareRoot(int[] array) {
        int[] solution = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if ((double) (int) Math.sqrt(array[i]) == Math.sqrt(array[i])) {
                solution[i] = (int) Math.sqrt(array[i]);
            } else {
                solution[i] = array[i] * array[i];
            }
        }
        return solution;
    }
}
