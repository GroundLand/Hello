package singleTest;

/**
 * Created by Administrator on 2017/3/23 0023.
 */
public class test1 {
    public static void main(String [] args){
        Integer a = Integer.valueOf(11);
        Integer b = new Integer(11);
        int c = 11;
        System.out.println(a.getClass());
        System.out.println(a==c);
        System.out.println(b==c);

        String str1 = "aaaa";
        String str2 = "aa";
        String str3 = "aa";
        System.out.println((str2+str3));

    }
}
