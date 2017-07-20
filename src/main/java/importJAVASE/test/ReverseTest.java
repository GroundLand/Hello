package importJAVASE.test;

/**
 * Created by Administrator on 2017/6/19 0019.
 */
public class ReverseTest {
    public static void  main(String args[]){
        System.out.println(reverse("123"));
    }
    public static String reverse(String originStr) {
        if(originStr == null || originStr.length() <= 1)
            return originStr;
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }
}
