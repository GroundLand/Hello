package importJAVASE.singleTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/31 0031.
 */
public class test2 {
    public static void main(String[] args){
      int[] a={1,2,3};
      a = (int[])goodCopyOf(a,10);

      String[] str = {"你","是","谁"};
        str = (String[])badCopyOf(str,3);
    }

    public static Object goodCopyOf(Object a,int newlength){
        Class cl = a.getClass();
        if(!cl.isArray()) return  null;
        Class componentType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArrary = Array.newInstance(componentType,newlength);
        System.arraycopy(a,0,newArrary,0,Math.min(length,newlength));
        return  newArrary;
    }

    public static Object[] badCopyOf(Object[] a,int newLength)
    {
        Object[] newArrar = new Object[newLength];
        System.arraycopy(a,0,newArrar,0,newLength);
        return  newArrar;
    }
}
