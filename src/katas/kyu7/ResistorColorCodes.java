package katas.kyu7;

import java.util.Arrays;

public class ResistorColorCodes {
    final static private String[] colors = new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gray", "white"};

    public static String decodeResistorColors(String bands) {
        String answer = "";
        String[] input = bands.split(" ");
        double value = Integer.valueOf(new StringBuilder().append(String.valueOf(Arrays.asList(colors).indexOf(input[0]))).append(String.valueOf(Arrays.asList(colors).indexOf(input[1]))).toString()) * Math.pow(10, Arrays.asList(colors).indexOf(input[2]));

        if (value >= 1000) {
            if (value >= 1000000) {
                if ((value / 1000000d) % 1 == 0d) answer += (int) (value / 1000000d);
                else answer += value / 1000000d;
                answer += "M ohms, ";
            } else {
                if ((value / 1000d) % 1 == 0d) answer += (int) (value / 1000d);
                else answer += value / 1000d;
                answer += "k ohms, ";
            }
        } else {
            boolean temp = value % 1 == 0;
            if ((value % 1) == 0d) answer += (int) value;
            else answer += value;
            answer += " ohms, ";
        }

        if (input.length < 4) {
            answer += "20%";
        } else {
            switch (input[3]) {
                case "gold":
                    answer += "5%";
                    break;
                case "silver":
                    answer += "10%";
                    break;
            }
        }
        return answer;
    }
}
