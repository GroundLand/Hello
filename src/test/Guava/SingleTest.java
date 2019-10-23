package Guava;

import edu.princeton.cs.algs4.StdOut;
import importJAVASE.staticp.AStatic;
import org.junit.Test;

import java.util.GregorianCalendar;

/**
 * Created by evel on 2017/8/18.
 */
public class SingleTest {

    @Test
    public void tt() {
       int i=3,j;
       while (i>0){
           j=3;
           while (j>0){
               if (j<2)break;
               System.out.printf("j+and"+i);
               j--;
           }
           i--;
       }

    }

    @Test
    public void staticTest(){
        System.out.println(Integer.toBinaryString(18));

    }
}
