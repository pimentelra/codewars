package katas.kyu7;

import java.util.Comparator;

public class The12DaysOfChristmas {
    public static class HelpSaveChristmas implements Comparator<String> {
        @Override
        public int compare(final String line1, final String line2) {
            return convertToInt(line2) - convertToInt(line1);
        }

        private int convertToInt(String input) {
            if (Character.isDigit(input.charAt(0))) return Integer.parseInt(input.substring(0, 2).trim());
            switch (input.charAt(0)) {
                case 'O':
                    return 13;
                default:
                    return 0;
            }
        }
    }
}
