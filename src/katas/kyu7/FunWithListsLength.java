package katas.kyu7;

public class FunWithListsLength {
    static int length(Node head) {
        int index = 0;
        for(; head != null && head.next != null; head = head.next, index++){if(index == 0) index++;}
        return index;
    }
}
