package importJAVASE.algorithms_ans;

import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/9 0009.
 */
public class ans_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        String s = "";
        for (int n = N; n > 0; n /= 2)
            s = (n % 2) + s;

        StdOut.println(s);
    }
}
