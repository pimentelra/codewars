package katas.kyu7;

public class FindTheStrayNumber {
    static int stray(int[] numbers) {
        int solution, count = solution = 0;
        for (int number : numbers) {
            solution = number;
            count = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == solution) {
                    count++;
                }
            }
            if (count == 1) return solution;
        }
        return solution;
    }
}
