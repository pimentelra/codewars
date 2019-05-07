package katas.kyu8;

public class InterpretersHQ9 {
    public static String HQ9(char code) {
        switch (code) {
            case 'H':
                return "Hello World!";
            case 'Q':
                return String.valueOf(code);
            case '9':
                StringBuilder answer = new StringBuilder("99 bottles of beer on the wall, 99 bottles of beer.");
                for (int i = 98; i >= 1; i--) {
                    String bottleNum = i > 1 ? " bottles" : " bottle";
                    answer.append("\nTake one down and pass it around, ").append(i).append(bottleNum).append(" of beer on the wall.");
                    answer.append("\n").append(i).append(bottleNum).append(" of beer on the wall, ").append(i).append(bottleNum).append(" of beer.");
                }
                return new StringBuilder().append(answer).append("\nTake one down and pass it around, no more bottles of beer on the wall.")
                        .append("\nNo more bottles of beer on the wall, no more bottles of beer.")
                        .append("\nGo to the store and buy some more, 99 bottles of beer on the wall.").toString();
            default:
                return null;
        }
    }
}
