package katas.kyu6;

public class GuessTheNumber {
}

class GuesserSolution extends Guesser {
    public int getNumber() {
        int lower = 1, higher = 1000, current = 500;
        while (true) {
            switch (guess(current)) {
                case "Too high!":
                    higher = current;
                    current -= (current - lower) / 2;
                    break;
                case "Too low!":
                    lower = current;
                    current += (higher - current) / 2;
                    break;
                default:
                    return current;
            }
        }
    }
}
