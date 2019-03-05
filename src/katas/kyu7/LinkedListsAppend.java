package katas.kyu7;

public class LinkedListsAppend {
    class Node {

        int data;
        Node next = null;

        Node(final int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node append(Node listA, Node listB) {
            if (listA == null && listB == null) return null;
            if (listA == null) return listB;
            if (listB == null) return listA;
            Node last = listA;
            while (last.next != null) last = last.next;
            last.next = listB;
            return listA;
        }
    }
}
