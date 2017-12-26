package importJAVASE.algorithms_ans.chapter1_4;

import com.google.common.base.Strings;
import edu.princeton.cs.algs4.StdOut;
import importJAVASE.algorithms_ans.Linked;

/**
 * Created by evel on 2017/12/25.
 */
public class LinkedPractice {




    public static void main(String[] args) {
        Linked<Integer> first = new Linked<>();
        first.add(1);
        first.add(2);
        first.add(4);
        first.add(5);
        StdOut.println("max()---最大值为："+first.max());
        Linked.max(first.getFirst());


    }
}
