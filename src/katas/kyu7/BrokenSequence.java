package katas.kyu7;

public class BrokenSequence {
    public int findMissingNumber(String sequence) {
        if (sequence.length() == 0) {
            return 0;
        }
        String[] array = sequence.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (!array[i].matches("[0-9]+")) {
                return 1;
            }
            if (Integer.parseInt(array[i]) != (i + 1)) {
                return i + 1;
            }
        }
        return 0;
    }
}
