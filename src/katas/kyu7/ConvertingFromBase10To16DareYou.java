package katas.kyu7;

public class ConvertingFromBase10To16DareYou {
    public static String convertToHex(int a) {
        StringBuilder answer = new StringBuilder();
        while (a > 0) {
            switch (a % 16) {
                case 10:
                    answer.append("A");
                    break;
                case 11:
                    answer.append("B");
                    break;
                case 12:
                    answer.append("C");
                    break;
                case 13:
                    answer.append("D");
                    break;
                case 14:
                    answer.append("E");
                    break;
                case 15:
                    answer.append("F");
                    break;
                default:
                    answer.append(a % 16);
            }
            a = a / 16;
        }
        answer.append("x0");
        return answer.reverse().toString();
    }
}
