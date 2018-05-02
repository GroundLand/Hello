package importJAVASE.concurrent;

import edu.princeton.cs.algs4.StdOut;
import importJAVASE.ArrayTest.Test;

/**
 * Created by Administrator on 2017/6/29 0029.
 */
public class Test1 {
    String a = "123";

    public static void main(String[] args){
        Test1 test = new Test1();
        StdOut.println(test.a);
        change(test.a);
        StdOut.println(test.a);
    }

    public static void change(String a){
        a = "abc";
    }

}
