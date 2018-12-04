package importJAVASE.algorithms_ans;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Administrator on 2017/3/9 0009.
 *
 */
public class ans_15 {
    public static int[] histogram(int[] a, int M) {
        int[] b = new int[M];
        if (M > a.length)
            StdOut.println("There is something wrong!");
        for (int i = 0; i < M; i++) {

            int count = 0;
            if (a[i] == i)
                count++;
            b[i] = count;

        }
        return b;
    }

    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 1, 3, 3, 3, 3 };
        int[] b = histogram(a, a.length);
        for (int i = 0; i < a.length; i++) {
            StdOut.print(b[i] + ",");
        }
    }
}
