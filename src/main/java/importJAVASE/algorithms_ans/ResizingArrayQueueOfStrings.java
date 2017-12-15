package importJAVASE.algorithms_ans;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by evel on 2017/12/15.
 */
public class ResizingArrayQueueOfStrings {

    private int size = 0;
    private int capacity;
    private String[] strings;

    public ResizingArrayQueueOfStrings(int capacity) {
        this.capacity = capacity;
        strings=new String[capacity];
    }

    //添加元素
    public void add(String s) {
        if (size<=capacity){
            strings[size++]=s;
        }
        else throw new ArrayIndexOutOfBoundsException();
    }
    public void remove(){
        if (size==0)
           throw new ArrayIndexOutOfBoundsException();
        strings[--size]=null;
    }

    @Override
    public String toString() {
        String toString = "";
        for (String s:strings){
            toString +=s+" ";
        }
        return toString;
    }

    public static void main(String[] args) {
        ResizingArrayQueueOfStrings arrayQueue = new ResizingArrayQueueOfStrings(2);
        arrayQueue.add("1");
        arrayQueue.add("2");
        arrayQueue.remove();
        arrayQueue.remove();
        StdOut.println(arrayQueue);

    }
}
