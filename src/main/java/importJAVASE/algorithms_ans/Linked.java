package importJAVASE.algorithms_ans;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by evel on 2017/12/15.
 */
public class Linked<T> {

    private Node<T> first;

    private int count;

    public void add(T item) {
        Node oldFirst = first;
        first = new Node<>();
        first.item = item;
        first.next = oldFirst;
        count++;
    }

    public Node<T> getFirst() {
        return first;
    }

    private static class Node<T> {
        private Node<T> next;
        private T item;

    }

    public void remove(String key) {
        while (first != null && key.equals(first.item)) {
            first = first.next;
        }

        Node<T> current = first;
        Node<T> node;
        while (current != null && current.next != null) {
            node = current.next;
            if (key.equals(node.item)) {
                current.next = node.next;
                count--;
            } else {
                current = node;
            }
        }
    }

    public Integer max() {
        if (!(first.item instanceof Integer)) {
            StdOut.println("类型异常");
            return 0;
        }
        if (first == null) {
            return 0;
        }
        if (first.next == null) {
            return (Integer) first.item;
        }
        Node<Integer> pointer = (Node<Integer>) first;
        Node<Integer> max = (Node<Integer>) first;
        while (pointer != null && pointer.next != null) {
            pointer = pointer.next;
            if (max.item.compareTo(pointer.item) < 0) {
                max = pointer;
            }
        }
        return max.item;

    }

    public static Integer max(Node<Integer> first) {
        if (first == null || first.next == null) {
            return first.item;
        }
        if (first.item.compareTo(first.next.item) > 0) {
            first.next = first.next.next;
            return max(first);
        }

        return max(first.next);
    }

}
