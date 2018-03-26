package katas.kyu7;

public class LostNumberInNumberSequence {
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        if (arr.length == mixedArr.length || arr.length == 0) return 0;

        for (int i = 0; i < arr.length; i++) {
            if (!arrayContains(mixedArr, arr[i])) return arr[i];
        }
        return 0;
    }

    private static boolean arrayContains(int[] array, int number) {
        boolean answer = false;
        for (int i = 0; i < array.length; i++) if (array[i] == number) answer = true;
        return answer;
    }
}
