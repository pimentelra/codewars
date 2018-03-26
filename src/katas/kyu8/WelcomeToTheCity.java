package katas.kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WelcomeToTheCity {
    public String sayHello(String[] name, String city, String state) {
        return "Hello, " + Arrays.stream(name).collect(Collectors.joining(" ")) + "! Welcome to " + city + ", " + state + "!";
    }
}
