package katas.kyu7;

public class ConvertTimeToString {
    public static String convertTime(int timeDiff) {
        String answer = "";
        int days = timeDiff / (60 * 60 * 24);
        answer += days + " ";
        int hours = (timeDiff - (days * 60 * 60 * 24)) / (60 * 60);
        answer += hours + " ";
        int minutes = (timeDiff - (days * 60 * 60 * 24) - (hours * 60 * 60)) / 60;
        answer += minutes + " ";
        answer += (timeDiff - (days * 60 * 60 * 24) - (hours * 60 * 60) - (minutes * 60));
        return answer;
    }
}
