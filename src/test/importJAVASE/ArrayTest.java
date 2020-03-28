package importJAVASE;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author cl
 * function:
 * Created on  2020-03-21 19:34
 */
public class ArrayTest {


    @Test
    public void asList(){
        Integer[] intArr = {1,2,3};
        List list = Arrays.asList(intArr);
        System.out.println(list);

        System.out.println(list.get(1));
    }


    /**
     * 与上面的方法做比较， 原因 Arrays.asList(T ..t) ,对象为obj对象
     */
    @Test
    public void asListPrimary(){
        int[] intArr = {1,2,3};
        List list = Arrays.asList(intArr);
        System.out.println(list.get(0));   // 打印数组地址值
        int[] reArr = (int[]) list.get(0);
        System.out.println(reArr[0]);   // 打印1


    }

    @Test
    public void toArray(){
        String[] strArr = {"2","3","4"};
        List<String> list = Arrays.asList(strArr);
        Collections.reverse(list);
        String[] reArr = list.toArray(new String[list.size()]);

        System.out.println(Arrays.toString(reArr));

    }
}
