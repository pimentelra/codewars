package katas.kyu8;

public class GrasshopperPersonalizedMessage {
    static String greet(String name, String owner) {
        return "Hello " + (name.equals(owner) ? "boss" : "guest");
    }
}
