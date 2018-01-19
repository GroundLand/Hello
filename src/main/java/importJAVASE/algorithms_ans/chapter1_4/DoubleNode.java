package importJAVASE.algorithms_ans.chapter1_4;

/**
 * Created by evel on 2017/12/26.
 */
public class DoubleNode<T> {
    private static class Node<T> {
        private Node<T> pre;
        private T item;
        private Node<T> next;

        public Node(Node<T> pre,T item,Node<T> next){
            this.pre = pre;
            this.item = item;
            this.next = next;
        }
    }

    private Node<T> head;
    private Node<T> last;
    private int size;


    public void addFirst(T item) {
        Node<T> oldFirst = head;
        Node<T> newNode = new Node<>(null,item,oldFirst);
        head = newNode;
        if (oldFirst == null) {
            last = newNode                      ;
        }else {
            oldFirst.pre=newNode;
        }
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(T item) {
        Node<T> oldLast = last;
        Node<T> newNode = new Node<>(last,item,null);
        last=newNode;
        if (oldLast == null) {
            head = newNode;
        }else {
         last.next = newNode;
        }
        size++;
    }

    public void deHead() {
        if (head == null) throw new NullPointerException();
        head = head.next;
        size--;
    }
}
