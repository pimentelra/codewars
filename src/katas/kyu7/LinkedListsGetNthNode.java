package katas.kyu7;

public class LinkedListsGetNthNode {
}

class Node {
    public int data;
    public Node next = null;

    public static int getNth(Node n, int index) throws IllegalArgumentException {
        if (index < 0) throw new IllegalArgumentException();
        for (int i = 0; i < index; i++) {
            n = n.next;
        }
        return n.data;
    }
}
