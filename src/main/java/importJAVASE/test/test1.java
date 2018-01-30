package importJAVASE.test;

/**
 * Created by Administrator on 2017/6/9 0009.
 */
public class test1 {
    public static void main(String[] args) {

        String str = "a";
        System.out.print(testReturn(str));
    }

    public static int testReturn(String str) {
        switch (str) {
            case "a":
                return 1;
            case "b":
                return 2;
            default:
                return 3;
        }
    }
}
