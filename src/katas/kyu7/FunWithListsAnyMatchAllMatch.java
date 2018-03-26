package katas.kyu7;

import java.util.function.Predicate;

public class FunWithListsAnyMatchAllMatch {
    static <T> boolean anyMatch(Node<T> head, Predicate<T> p) {
        if(head == null) return false;
        if(p.test(head.data)) return true;
        while (head.next != null) return anyMatch(head.next, p);
        return false;
    }

    static <T> boolean allMatch(Node<T> head, Predicate<T> p) {
        if (head == null) return true;
        if (!p.test(head.data)) return false;
        while (p.test(head.data) && head.next != null) return allMatch(head.next, p);
        return true;
    }
}
