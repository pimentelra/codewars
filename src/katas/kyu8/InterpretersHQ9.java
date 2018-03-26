package katas.kyu8;

public class InterpretersHQ9 {
    public static String HQ9(char code) {
        switch (code) {
            case 'H':
                return "Hello World!";
            case 'Q':
                return String.valueOf(code);
            case '9':
                String answer = "99 bottles of beer on the wall, 99 bottles of beer.";
                for (int i = 98; i >= 1; i--) {
                    String bottleNum = i > 1 ? " bottles" : " bottle";
                    answer += "\nTake one down and pass it around, " + i + bottleNum + " of beer on the wall.";
                    answer += "\n" + i + bottleNum + " of beer on the wall, " + i + bottleNum + " of beer.";
                }
                return answer + "\nTake one down and pass it around, no more bottles of beer on the wall.";
            default:
                return null;
        }
    }
}
