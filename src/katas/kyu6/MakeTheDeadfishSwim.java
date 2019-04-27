package katas.kyu6;

public class MakeTheDeadfishSwim {
    public static int[] parse(String data) {
        String filtered = data.replaceAll("[^idso]", "");
        int len = filtered.length(), value = 0, index = 0;
        int[] answer = new int[len - filtered.replaceAll("o", "").length()];
        for (int i = 0; i < len; i++) {
            switch (filtered.charAt(i)) {
                case 'i': value++; break;
                case 'd': value--; break;
                case 's': value *= value; break;
                default: answer[index++] = value;
            }
        }
        return answer;
    }
}
