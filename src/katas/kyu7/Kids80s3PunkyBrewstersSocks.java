package katas.kyu7;

import java.util.stream.IntStream;

public class Kids80s3PunkyBrewstersSocks {
    public static String[] getSocks(String name, String[] socks) {
        if (socks.length < 2) return new String[0];
        String[] answer = new String[2];

        switch (name) {
            case "Punky":
                answer[0] = socks[0];
                for (int i = 1; i < socks.length; i++) {
                    if (!socks[i].equals(answer[0])) {
                        answer[1] = socks[i];
                        break;
                    }
                }
                break;
            default:
                IntStream.range(0, socks.length)
                        .filter(i -> IntStream.range(0, socks.length).anyMatch(j -> i != j && socks[i].equals(socks[j])))
                        .forEach(i -> {
                            answer[0] = socks[i];
                            answer[1] = socks[i];
                        });
                break;
        }
        if (answer[0] == null || answer[1] == null) return new String[0];
        return answer;
    }
}
