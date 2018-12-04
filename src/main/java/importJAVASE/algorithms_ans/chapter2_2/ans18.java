package importJAVASE.algorithms_ans.chapter2_2;

import edu.princeton.cs.algs4.StdOut;

public class ans18 {
    public static void main(String[] args) {
        Comparable[] comparables = { 'E', 'A', 'S', 'Y', 'Q', 'U', 'E', 'S', 'T', 'I', 'O', 'N' };
        //ansShell.sort(comparables);;
        AnsShell ansShell = new AnsShell(getDoubleComarable(0, 100));
        ansShell.sort();
        StdOut.println(ansShell.getCompare());

    }

    private static Comparable[] getDoubleComarable(int i, int n) {
        Comparable[] comparables = new Double[n];
        for (int t = n - 1; t >= 0; t--) {
            comparables[t] = Math.pow(10, t);
        }
        return comparables;
    }
}
