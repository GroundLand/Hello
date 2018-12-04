package importJAVASE;

/**
 * Created by Administrator on 2017/3/22 0022.
 */
public class unicodeTest {
    public static void main(String[] args) {
        String greeting = "Hello";
        //int n = greeting.codePointAt(0);
        int m = 'H';
        System.out.println(greeting.codePointAt(0));
        System.out.println(greeting.codePointCount(0, greeting.length()));

        int index = greeting.offsetByCodePoints(0, 0);
        int cp = greeting.codePointAt(index);
        System.out.println(cp);

    }
}
