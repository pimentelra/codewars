package katas.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzCuckooClock {
    public static String fizzBuzzCuckooClock(String time) {
        String answer = "";
        String[] timeArray = time.split(":");
        if (timeArray[1].equals("00")) return cuckoo(Integer.parseInt(timeArray[0]));
        if (timeArray[1].equals("30")) return cuckoo(1);
        if (Integer.parseInt(timeArray[1]) % 3 != 0 && Integer.parseInt(timeArray[1]) % 5 != 0) return "tick";
        if (Integer.parseInt(timeArray[1]) % 3 == 0) answer += "Fizz";
        if (Integer.parseInt(timeArray[1]) % 5 == 0) answer += " Buzz";
        return answer.trim();
    }

    private static String cuckoo(int number) {
        if (number == 0) number = 12;
        if (number > 12) number -= 12;
        return IntStream.range(0, number).mapToObj(i -> " Cuckoo").collect(Collectors.joining()).trim();
    }
}
