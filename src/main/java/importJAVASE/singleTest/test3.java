package importJAVASE.singleTest;

import java.lang.System;

/**
 * Created by Administrator on 2017/4/5 0005.
 */
public class test3 {
    public static void main(String[] args){
        int[] element = {1,2,3};
        int[] temp = {6,4,5};
         System.arraycopy(element,0,temp,0,2);
         for (int i:temp)
             System.out.print(i);
    }
}
