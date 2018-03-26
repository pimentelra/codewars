package katas.kyu8;

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        }
        String solution = "";
        switch (p1) {
            case "rock":
                if (p2.equals("paper")) {
                    solution = "Player 2 won!";
                } else {
                    solution = "Player 1 won!";
                }
                break;
            case "paper":
                if (p2.equals("scissors")) {
                    solution = "Player 2 won!";
                } else {
                    solution = "Player 1 won!";
                }
                break;
            case "scissors":
                if (p2.equals("rock")) {
                    solution = "Player 2 won!";
                } else {
                    solution = "Player 1 won!";
                }
                break;
        }
        return solution;
    }
}
