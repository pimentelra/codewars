package katas.kyu7;

public class AcronymGenerator {
    public static String createAcronym(String lastName, String firstName) {
        StringBuilder answer = new StringBuilder();
        getInitials(answer, firstName);
        getInitials(answer, lastName);
        return answer.toString();
    }

    private static void getInitials(StringBuilder builder, String s) {
        s = s.replaceAll("-", " ");
        String[] array = s.split(" ");
        for (String name : array) {
            builder.append(name.toLowerCase().equals("von") ? "v" : String.valueOf(name.charAt(0)).toUpperCase());
        }
    }
}
