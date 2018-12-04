package importJAVASE.algorithms_lintcode;

public class Node {
    public int item;
    public Node next;

    Node(int item) {
        this.item = item;
    }

    public void add(int i) {
        Node old = next;
        next = new Node(i);
        next.next = old;
    }
}
