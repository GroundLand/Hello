package importJAVASE.algorithms_ans;

/**
 * Created by evel on 2017/12/15.
 */
public class Linked<T> {


    private static class Node<T>{
        private Node<T> next;
        private T item;
        Node( T element,Node<T> next) {
            this.item = element;
            this.next = next;
        }
    }
}
