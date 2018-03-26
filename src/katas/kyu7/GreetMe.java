package katas.kyu7;

public class GreetMe {
    public static String greet(String name){
        return "Hello " + Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase() + "!";
    }
}
