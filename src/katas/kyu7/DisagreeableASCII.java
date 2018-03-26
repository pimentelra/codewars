package katas.kyu7;

public class DisagreeableASCII {
    public static int getWeight(String name) {
        name = name.replaceAll("[^a-zA-Z]", "");
        int answer = 0;
        for (int i = 0; i < name.length(); i++)
            answer += Character.isUpperCase(name.charAt(i)) ? (int) Character.toLowerCase(name.charAt(i)) : (int) Character.toUpperCase(name.charAt(i));

        return answer;
    }
}
