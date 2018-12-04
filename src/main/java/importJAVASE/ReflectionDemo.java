package importJAVASE;

import java.lang.reflect.Array;

/**
 * Created by Administrator on 2017/3/7 0007.
 */
public class ReflectionDemo {
    public static void main(String[] args) {
        Object array = Array.newInstance(String.class, 10);
        Array.set(array, 0, "Hello");
        Array.set(array, 1, "World");
        System.out.println(Array.get(array, 1));
    }

}
