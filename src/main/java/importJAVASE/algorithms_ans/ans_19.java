package importJAVASE.algorithms_ans;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Administrator on 2017/3/10 0010.
 */
public class ans_19 {

    public static int count;
    public static long F(int N){
        count++;
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1)+F(N-2);
    }
    public static void main(String[] args){
        for(int i=0; i<30;i++)
            StdOut.println(i+"    "+F(i));
        StdOut.println(count);
    }
}
