package katas.kyu6;

public class TheEnigmaMachinePart1ThePlugboard {
}

class Plugboard {
    private String wires;

    public Plugboard(String wires) throws InvalidPlugboardWiresException {
        if (wires.chars().distinct().count() % 2 != 0 || wires.length() > 20) throw new InvalidPlugboardWiresException();
        this.wires = wires;
    }

    public String process(String wire) {
        return !wires.contains(wire) ? wire : String.valueOf(wires.indexOf(wire) % 2 == 0 ? wires.charAt(wires.indexOf(wire) + 1) : wires.charAt(wires.indexOf(wire) - 1));
    }
}
