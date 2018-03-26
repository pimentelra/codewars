package katas.kyu7;

public class AddingValuesOfArraysInAShiftedWay {
    public static int[] addingShifted(int[][] arrayOfArrays, int shift) {
        int[] answer = new int[arrayOfArrays[0].length + (arrayOfArrays.length - 1) * shift];
        for (int i = 0; i < arrayOfArrays.length; i++)
            for (int j = 0; j < arrayOfArrays[i].length; j++) answer[j + (i * shift)] += arrayOfArrays[i][j];
        return answer;
    }
}
