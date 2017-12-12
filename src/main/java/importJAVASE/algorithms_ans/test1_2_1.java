package importJAVASE.algorithms_ans;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by Administrator on 2017/3/10 0010.
 */
public class test1_2_1 {
    public static void main(String[] args)
    {
        int T= Integer.parseInt(args[0]);
        Counter c = new Counter("heads");
        Counter c1 = new Counter("details");

        //循环T次
        for (int i=0; i<T; i++)
        {
            //如果随机出现的次数分半
            if (StdRandom.bernoulli(0.5))
                c.increment();
            else
                c1.increment();

        }
        StdOut.println(c);
        StdOut.println(c1);
        int t = c.tally()-c1.tally();
        StdOut.print(Math.abs(t));
    }
}
