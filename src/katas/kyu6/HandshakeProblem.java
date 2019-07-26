package katas.kyu6;

public class HandshakeProblem {
    public static int GetParticipants(int handshakes) {
        return (int) Math.ceil((1 + Math.sqrt(1 + 8 * handshakes)) / 2);
    }
}
