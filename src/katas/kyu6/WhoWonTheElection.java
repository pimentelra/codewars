package katas.kyu6;

import java.util.List;

public class WhoWonTheElection {
    public static String getWinner(final List<String> listOfBallots) {
        String[] winner = listOfBallots.stream().distinct().filter(v -> listOfBallots.stream().filter(l -> l.equals(v)).count() > listOfBallots.size() / 2).toArray(String[]::new);
        return winner.length == 1 ? winner[0] : null;
    }
}
