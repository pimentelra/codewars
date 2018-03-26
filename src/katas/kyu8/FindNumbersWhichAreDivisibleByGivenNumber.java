package katas.kyu8;

import java.util.Arrays;

public class FindNumbersWhichAreDivisibleByGivenNumber {
    public static int[] divisibleBy(int[] numbers, int divider) {
        int solutionIndex = 0;
        int numbersLength = numbers.length;
        int[] solution = new int[0];
        for (int i = 0; i < numbersLength; i++) {
            if (numbers[i] % divider == 0) {
                solution = Arrays.copyOf(solution, solution.length + 1);
                solution[solutionIndex++] = numbers[i];
            }
        }
        return solution;
    }
}
