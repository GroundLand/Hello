package importJAVASE.algorithms_lintcode;

public class Partition {

    //    private static class Node {
    //        private int item;
    //        private Node next;
    //
    //        Node(int item){
    //            this.item = item;
    //        }
    //
    //    }
    //
    //    public static void add(Node node,int i){
    //        Node n = new Node(i);
    //        node.next=n;
    //    }

    Node partition(Node node, int x) {
        Node head = node;
        Node tail = node;

        while (node != null) {
            Node next = node.next;
            if (node.item < x) {
                /* insert node at head */
                node.next = head;
                head = node;
            } else {
                /* insert node at tail */
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;

        //the head has changed, so we need to return it to the user
        return head;
    }

    public static void main(String args[]) {
        Node node = new Node(3);
        node.add(1);
        node.add(4);
        node.add(5);

        Partition partition = new Partition();
        partition.partition(node, 4);
    }

}
