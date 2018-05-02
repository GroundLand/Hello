package importJAVASE;


import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.GregorianCalendar;

/**
 * 测试正则
 */
public class regex {
    public static void main(String[] args) {
        String str = "748.00000";
        GregorianCalendar ca = new GregorianCalendar();
        StdOut.println(findSmallestInt(new int[]{34, -345, -1, 100}));

    }


    public static int findSmallestInt(int[] args) {
        int min=args[0];
        for(int i=1;i<args.length;i++){
            if(args[i-1]>args[i])
                min=args[i];
        }
        return min;
    }


}
