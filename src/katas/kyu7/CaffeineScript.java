package katas.kyu7;

public class CaffeineScript {
    public static String caffeineBuzz(int n) {
        StringBuilder answer = new StringBuilder();
        boolean even = n % 2 == 0;
        if (n % 3 == 0 && n % 4 == 0) {
            answer.append("Coffee");
            if (even) answer.append("Script");
            return answer.toString();
        }
        if (n % 3 == 0 && n % 4 != 0) {
            answer.append("Java");
            if (even) answer.append("Script");
            return answer.toString();
        }
        return "mocha_missing!";
    }
}
