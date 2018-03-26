package katas.kyu7;

public class FunWithListsIndexOf {

}

class Solution {
    static int indexOf(Node head, Object value) {
        return auxIndexOf(head, value, 0);
    }

    private static int auxIndexOf(Node node, Object value, int index){
        if(node == null) return -1;
        if(node.data.equals(value)) return index;
        if(node.next == null) return -1;
        return auxIndexOf(node.next, value, ++index);
    }
}