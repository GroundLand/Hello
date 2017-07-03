package test;

/**
 * Created by Administrator on 2017/6/19 0019.
 */
public class test3 {
    public static void main(String[] args)
    {
        String s1 = new StringBuilder("go").append("od").toString();
        System.out.println(s1.intern());

    }
}
