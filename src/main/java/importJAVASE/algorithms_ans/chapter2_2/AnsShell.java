package importJAVASE.algorithms_ans.chapter2_2;

import edu.princeton.cs.algs4.Shell;

import java.util.Arrays;

public class AnsShell {
    private int time=0;

    private Comparable[] a;
    private int N;

    AnsShell(Comparable[] a) {
        this.a = a;
        N=a.length;
    }

    public void sort() {
        int length = a.length;
        int h = 1;
        while (h < length / 3) h = h * 3 + 1;
        while (h >= 1) {
            for (int i = h; i < length; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h)
                    Shell.exch(a, j, j - h);
                show(a);
            }
            h = h / 3;
        }
    }

    private void show(Comparable[] a) {
        System.out.println(Arrays.toString(a));
    }

    // is v < w ?
    private boolean less(Comparable v, Comparable w) {
        time++;
        return v.compareTo(w) < 0;
    }


    public double getCompare(){
        return time/N;
    }

}
