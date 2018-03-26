package katas.kyu7;

public class TenGreenBottles {
    public static String tenGreenBottles(int n) {
        StringBuilder answer = new StringBuilder();
        switch (n) {
            case 10:
                answer.append("Ten green bottles hanging on the wall,\nTen green bottles hanging on the wall,\nAnd if one green bottle should accidentally fall,\nThere'll be nine green bottles hanging on the wall.\n\n");
            case 9:
                answer.append("Nine green bottles hanging on the wall,\nNine green bottles hanging on the wall,\nAnd if one green bottle should accidentally fall,\nThere'll be eight green bottles hanging on the wall.\n\n");
            case 8:
                answer.append("Eight green bottles hanging on the wall,\nEight green bottles hanging on the wall,\nAnd if one green bottle should accidentally fall,\nThere'll be seven green bottles hanging on the wall.\n\n");
            case 7:
                answer.append("Seven green bottles hanging on the wall,\nSeven green bottles hanging on the wall,\nAnd if one green bottle should accidentally fall,\nThere'll be six green bottles hanging on the wall.\n\n");
            case 6:
                answer.append("Six green bottles hanging on the wall,\nSix green bottles hanging on the wall,\nAnd if one green bottle should accidentally fall,\nThere'll be five green bottles hanging on the wall.\n\n");
            case 5:
                answer.append("Five green bottles hanging on the wall,\nFive green bottles hanging on the wall,\nAnd if one green bottle should accidentally fall,\nThere'll be four green bottles hanging on the wall.\n\n");
            case 4:
                answer.append("Four green bottles hanging on the wall,\nFour green bottles hanging on the wall,\nAnd if one green bottle should accidentally fall,\nThere'll be three green bottles hanging on the wall.\n\n");
            case 3:
                answer.append("Three green bottles hanging on the wall,\nThree green bottles hanging on the wall,\nAnd if one green bottle should accidentally fall,\nThere'll be two green bottles hanging on the wall.\n\n");
            case 2:
                answer.append("Two green bottles hanging on the wall,\nTwo green bottles hanging on the wall,\nAnd if one green bottle should accidentally fall,\nThere'll be one green bottle hanging on the wall.\n\n");
            case 1:
                answer.append("One green bottle hanging on the wall,\nOne green bottle hanging on the wall,\nIf that one green bottle should accidentally fall,\nThere'll be no green bottles hanging on the wall.\n");
        }
        return answer.toString();
    }
}
