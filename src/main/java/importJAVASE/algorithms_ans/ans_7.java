package importJAVASE.algorithms_ans;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Administrator on 2017/3/9 0009.
 */
public class ans_7 {
    public static void main(String[] args){
        double t = 9.0;
        while(Math.abs(t-9.0/t)>.001)
            t= (9.0/t+t) /2.0;
        StdOut.printf("%.5f\n",t);

        /*
        * 等差数列
        * */
        int sum = 0;
        for (int i =1; i<1000; i++)
            for (int j=0; j<i; j++)
                sum++;
        StdOut.println(sum);

        StdOut.println("2的十次方：   "+Math.pow(2,9));

        int sum1=0;
        for(int i=1; i<1000; i*=2)
            for(int j=0; j<1000; j++)
                sum1++;
        StdOut.println(sum1);
    }
}
